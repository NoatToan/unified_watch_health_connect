package com.xiaomi.hm.health.speech.aiengine;

import android.content.Context;
import com.hm.opuslib.OpusTool;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.speech.constant.AiEngineAuthType;
import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;
import com.xiaomi.hm.health.speech.constant.SpeechRequestStrategy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class EngineProcessor {
    private static final String e = "XmAIHandlerf";
    private static final String f = "time-tag";
    private BaseAiSpeechEngine a;
    private Context b;
    private final OpusTool c = new OpusTool();
    private Object d = new Object();

    public EngineProcessor(Context context) {
        HMLog.d("XmAIHandlerf", "EngineProcessor init", new Object[0]);
        this.b = context;
        a();
    }

    private void a() {
        Context context = this.b;
        AiEnginePlatform aiEnginePlatform = AiEnginePlatform.XIAOMI;
        BaseAiSpeechEngine baseAiSpeechEngineCreateAiSpeechEngine = AiSpeechEngineFactory.createAiSpeechEngine(context, aiEnginePlatform);
        this.a = baseAiSpeechEngineCreateAiSpeechEngine;
        baseAiSpeechEngineCreateAiSpeechEngine.createAiSpeechEngine(aiEnginePlatform, AiEngineAuthType.XIAOMI_AUTH_DEVICE_OAUTH, new String[0]);
    }

    private void b(short[] buffer, int length) {
        for (int i = 0; i < length; i++) {
            int i2 = buffer[i] * 1;
            if (i2 > 32767) {
                i2 = 32767;
            } else if (i2 < -32767) {
                i2 = -32767;
            }
            buffer[i] = (short) i2;
        }
    }

    private static byte[] c(short[] src, int len) {
        byte[] bArr = new byte[len << 1];
        for (int i = 0; i < len; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) src[i];
            bArr[i2 + 1] = (byte) (src[i] >> 8);
        }
        return bArr;
    }

    public void addBuffer(byte[] buffer, FileOutputStream vadAudioOutputStream) {
        HMLog.d("XmAIHandlerf", "addBuffer opus len:" + buffer.length, new Object[0]);
        short[] sArr = new short[1024];
        int iDecodeBytes = this.c.decodeBytes(buffer, sArr);
        b(sArr, iDecodeBytes);
        byte[] bArrC = c(sArr, iDecodeBytes);
        HMLog.d("XmAIHandlerf", "addBuffer pcm 16k len:" + bArrC.length, new Object[0]);
        try {
            vadAudioOutputStream.write(bArrC);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.a.addBuffer(bArrC, 0, bArrC.length);
    }

    public void deinitOpus() {
        this.c.deinit();
    }

    public void initOpus() {
        HMLog.i("XmAIHandlerf", "init:" + this.c.init(), new Object[0]);
    }

    public void initSpeechEngineWithVadMode() {
        this.a.initEngine();
        this.a.combineRequest(SpeechRequestStrategy.COMBINE_ASR_NLP);
        this.a.openVadMode(true);
        this.a.start(false);
    }

    public void interruptSpeechEngineRequest() {
        this.a.interrupt();
    }

    public void releaseSpeechEngineResource() {
        this.a.release();
    }

    public void updateSpeechEngineAuthorize(String... authParams) {
        this.a.updateAuthEngine(AiEnginePlatform.XIAOMI, AiEngineAuthType.XIAOMI_AUTH_DEVICE_OAUTH, authParams);
    }

    public void updateSpeechEngineThirdToken(String... tokenParams) {
        this.a.updateThirdToken(tokenParams);
    }

    public void userManuallyStartSpeechRequest(String filePath) throws Throwable {
        this.a.initEngine();
        this.a.combineRequest(SpeechRequestStrategy.COMBINE_ASR_NLP);
        this.a.openVadMode(false);
        this.a.start(true);
        String str = filePath + ".wav";
        FileInputStream fileInputStream = null;
        this.c.decode(filePath, str, null);
        File file = new File(str);
        try {
            if (!file.exists()) {
                HMLog.d("XmAIHandlerf", "wav File decode error", new Object[0]);
                return;
            }
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = fileInputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                this.a.addBuffer(bArr, 0, i);
                            }
                        }
                        fileInputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        HMLog.d("XmAIHandlerf", "e : " + e.getMessage(), new Object[0]);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        this.a.end();
                        HMLog.d(f, "====request xiaomi ai server ====", new Object[0]);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        this.a.end();
        HMLog.d(f, "====request xiaomi ai server ====", new Object[0]);
    }
}
