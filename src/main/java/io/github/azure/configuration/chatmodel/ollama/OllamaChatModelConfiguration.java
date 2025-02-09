package io.github.azure.configuration.chatmodel.ollama;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class OllamaChatModelConfiguration {

    @Profile({"local"})
    @Bean
    ChatLanguageModel deepseekChatLanguageModel() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434/")
                .modelName("deepseek-r1:14b")
                .logRequests(true)
                .logResponses(true)
                .build();
    }
}
