package com.huami.ai.speech.alexa.notify;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/alexa/notify/AlexaNewBleExceptionNotifyImpl;", "Lcom/huami/ai/notify/EngineExceptionNotify;", "", "errorCommandCode", "", "description", "", "a", "errorCode", "engineException", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaNewBleExceptionNotifyImpl implements EngineExceptionNotify {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send network error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send network disable";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send asr time out";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send tts time out";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send invalid token command";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send unknown error command";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send parse data fail error command";
        }
    }

    public AlexaNewBleExceptionNotifyImpl(@NotNull SpeechDevice speechDevice) {
        this.baseDevice = speechDevice;
    }

    private final void a(int errorCommandCode, String description) {
        if (description == null) {
            description = "";
        }
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new ErrorCommand(errorCommandCode, description), null, 2, null);
    }

    public static /* synthetic */ void b(AlexaNewBleExceptionNotifyImpl alexaNewBleExceptionNotifyImpl, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        alexaNewBleExceptionNotifyImpl.a(i, str);
    }

    @Override // com.huami.ai.notify.EngineExceptionNotify
    public void engineException(int errorCode) {
        if (errorCode == 1 || errorCode == 2) {
            HMLog.error$default("speech", null, null, a.a, 6, null);
            b(this, 3, null, 2, null);
            return;
        }
        if (errorCode == 3) {
            HMLog.error$default("speech", null, null, b.a, 6, null);
            b(this, 2, null, 2, null);
            return;
        }
        if (errorCode != 4) {
            if (errorCode != 5) {
                if (errorCode != 8) {
                    if (errorCode != 9) {
                        switch (errorCode) {
                            case 18:
                                HMLog.info("speech", e.a);
                                a(6, "未授权，或者授权失效！");
                                break;
                            case 19:
                                HMLog.info("speech", f.a);
                                b(this, 1, null, 2, null);
                                break;
                            case 20:
                                HMLog.info("speech", g.a);
                                b(this, 7, null, 2, null);
                                break;
                        }
                        return;
                    }
                }
            }
            HMLog.error$default("speech", null, null, c.a, 6, null);
            b(this, 8, null, 2, null);
            return;
        }
        HMLog.error$default("speech", null, null, d.a, 6, null);
        b(this, 9, null, 2, null);
    }
}
