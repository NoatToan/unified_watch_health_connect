package com.garmin.android.gfdi.framework.compat;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.gfdi.ResponseStatusException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import ea2.b;
import java.io.IOException;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.e1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.l0;
import rs2.c;
import rs2.h;
import rs2.v;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u001bR\u001c\u0010\u0004\u001a\n %*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/garmin/android/gfdi/framework/compat/GenericSendMessageManager;", "Lrs2/h;", "Lea2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "name", "", "payload", "", "send", "(ILjava/lang/String;[B)V", "Lrs2/c;", "deviceInfo", "Lrs2/v;", "messenger", TtmlNode.START, "(Lrs2/c;Lrs2/v;)V", "connectionId", "close", "(Ljava/lang/String;)V", "messageId", "sendTimeout", "(I)V", "Lja2/b;", "defMsg", "sendFitDefinitionMessage", "(Lja2/b;)V", "Lja2/a;", "dataMsg", "sendFitDataMessage", "(Lja2/a;)V", "requestMessage", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "Lrs2/v;", "Lrs2/c;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "getConfiguration", "()Ljava/util/Set;", "configuration", "Companion", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GenericSendMessageManager implements h, b {
    private static final int REQUEST_MESSAGE_ID = 5001;
    private static final int REQUEST_TIMEOUT_MESSAGE_ID = 5021;
    private final Context context;
    private c deviceInfo;
    private Logger logger;
    private v messenger;

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.compat.GenericSendMessageManager$send$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
    @e(c = "com.garmin.android.gfdi.framework.compat.GenericSendMessageManager$send$1", f = "GenericSendMessageManager.kt", l = {67}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ byte[] $payload;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i14, byte[] bArr, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$type = i14;
            this.$payload = bArr;
            this.$name = str;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return GenericSendMessageManager.this.new AnonymousClass1(this.$type, this.$payload, this.$name, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    v vVar = GenericSendMessageManager.this.messenger;
                    if (vVar == null) {
                        s.m("messenger");
                        throw null;
                    }
                    int i15 = this.$type;
                    byte[] bArr = this.$payload;
                    this.label = 1;
                    if (vVar.b(i15, bArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (ResponseStatusException e4) {
                Logger logger = GenericSendMessageManager.this.logger;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.warn("Failed to send " + this.$name + " message", (Throwable) e4);
            } catch (IOException e14) {
                Logger logger2 = GenericSendMessageManager.this.logger;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.warn("Failed to send " + this.$name + " message", (Throwable) e14);
            }
            return Unit.INSTANCE;
        }
    }

    public GenericSendMessageManager(Context context) {
        context.getClass();
        this.context = context.getApplicationContext();
    }

    private final void send(int type, String name, byte[] payload) {
        ge1.b.T(e1.f129333a, null, null, new AnonymousClass1(type, payload, name, null), 3);
    }

    @Override // rs2.h
    public void close(String connectionId) {
        connectionId.getClass();
    }

    @Override // rs2.h
    public Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // ea2.b
    public void requestMessage(int messageId) {
        send(5001, "Request", new byte[]{(byte) (messageId & 255), (byte) ((messageId >> 8) & 255)});
    }

    public void sendFitDataMessage(ja2.a dataMsg) {
        dataMsg.getClass();
        byte[] byteArray = dataMsg.f98074a.toByteArray();
        byteArray.getClass();
        send(5012, "FIT Data", byteArray);
    }

    public void sendFitDefinitionMessage(ja2.b defMsg) {
        defMsg.getClass();
        byte[] byteArray = defMsg.f98075a.toByteArray();
        byteArray.getClass();
        send(5011, "FIT Definition", byteArray);
    }

    public void sendTimeout(int messageId) {
        send(REQUEST_TIMEOUT_MESSAGE_ID, "Timeout", new byte[]{(byte) (messageId & 255), (byte) ((messageId >> 8) & 255)});
    }

    @Override // rs2.h
    public void start(c deviceInfo, v messenger) {
        deviceInfo.getClass();
        messenger.getClass();
        this.messenger = messenger;
        this.deviceInfo = deviceInfo;
        Logger logger = LoggerFactory.getLogger(oa2.d.b("GDI#", "FITHandlerCompat", deviceInfo.getF92741e(), deviceInfo.getF92746j(), this));
        logger.getClass();
        this.logger = logger;
    }
}
