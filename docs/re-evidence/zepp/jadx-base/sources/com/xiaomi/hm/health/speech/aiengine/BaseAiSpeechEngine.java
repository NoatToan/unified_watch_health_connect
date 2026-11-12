package com.xiaomi.hm.health.speech.aiengine;

import com.xiaomi.hm.health.speech.constant.AiEngineAuthType;
import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;
import com.xiaomi.hm.health.speech.constant.SpeechRequestStrategy;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseAiSpeechEngine {
    public abstract void addBuffer(byte[] bytes, int offset, int length);

    public abstract void combineRequest(SpeechRequestStrategy speechRequestStrategy);

    public abstract BaseAiSpeechEngine createAiSpeechEngine(AiEnginePlatform enginePlatform, AiEngineAuthType aiEngineAuthType, String... authParams);

    public abstract void end();

    public abstract void initEngine();

    public abstract void interrupt();

    public abstract void openVadMode(boolean open);

    public abstract void release();

    public abstract void start(boolean isManual);

    public abstract boolean updateAuthEngine(AiEnginePlatform aiEnginePlatform, AiEngineAuthType aiEngineAuthType, String... authParams);

    public abstract void updateThirdToken(String... thirdTokenParams);
}
