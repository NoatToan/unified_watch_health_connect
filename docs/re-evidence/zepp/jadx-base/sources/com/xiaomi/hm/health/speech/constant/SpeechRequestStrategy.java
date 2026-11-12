package com.xiaomi.hm.health.speech.constant;

/* JADX INFO: loaded from: classes21.dex */
public enum SpeechRequestStrategy {
    SINGLE_ASR("single_asr"),
    SINGLE_NLP("single_nlp"),
    SINGLE_TTS("single_tts"),
    COMBINE_ASR_NLP("combine_asr_nlp"),
    COMBINE_NLP_TTS("combine_nlp_tts"),
    COMBINE_ASR_NLP_TTS("combine_asr_nlp_tts");

    private String speechRequestStrategy;

    SpeechRequestStrategy(String requestStrategyDesc) {
        this.speechRequestStrategy = requestStrategyDesc;
    }
}
