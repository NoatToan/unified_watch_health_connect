package com.xiaomi.wearable.spp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.spp.SppVersionReader;
import defpackage.izc;
import defpackage.k7o;
import defpackage.m7o;
import defpackage.snr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001\"\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/wearable/spp/SppVersionReader;", "", "Lcom/xiaomi/wearable/spp/b;", "sppPacket", "", "onReceivePacket", "(Lcom/xiaomi/wearable/spp/b;)V", "", "data", "", "getVersion", "([B)I", "", "getVersionName", "([B)Ljava/lang/String;", "", "readVersion", "()Z", "onVersionDataReceive", "([B)V", "Lizc;", "client", "Lizc;", "getClient", "()Lizc;", "Lcom/xiaomi/wearable/spp/SppVersionReader$VersionCallback;", "versionCallback", "Lcom/xiaomi/wearable/spp/SppVersionReader$VersionCallback;", "Landroid/os/Handler;", "mWorkerHandler", "Landroid/os/Handler;", "Lk7o;", "mSppPacketProducer", "Lk7o;", "com/xiaomi/wearable/spp/SppVersionReader$mMainHandler$1", "mMainHandler", "Lcom/xiaomi/wearable/spp/SppVersionReader$mMainHandler$1;", "<init>", "(Lizc;Lcom/xiaomi/wearable/spp/SppVersionReader$VersionCallback;)V", "Companion", "VersionCallback", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class SppVersionReader {
    private static final int MSG_TIMEOUT = 100;

    @NotNull
    private static final String TAG = "SppVersionReader";

    @NotNull
    private final izc client;

    @NotNull
    private final SppVersionReader$mMainHandler$1 mMainHandler;

    @NotNull
    private final k7o mSppPacketProducer;

    @NotNull
    private final Handler mWorkerHandler;

    @NotNull
    private final VersionCallback versionCallback;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/wearable/spp/SppVersionReader$VersionCallback;", "", "onVersion", "", "version", "", CommonConstants.KEY_VERSION_NAME, "", "onVersionTimeout", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface VersionCallback {
        void onVersion(int version, @NotNull String versionName);

        void onVersionTimeout();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.xiaomi.wearable.spp.SppVersionReader$mMainHandler$1] */
    public SppVersionReader(@NotNull izc client, @NotNull VersionCallback versionCallback) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(versionCallback, "versionCallback");
        this.client = client;
        this.versionCallback = versionCallback;
        final Looper mainLooper = Looper.getMainLooper();
        this.mMainHandler = new Handler(mainLooper) { // from class: com.xiaomi.wearable.spp.SppVersionReader$mMainHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.this$0.versionCallback.onVersionTimeout();
            }
        };
        Handler handler = new Handler(snr.a(), new Handler.Callback() { // from class: n7o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return SppVersionReader._init_$lambda$0(this.f27627a, message);
            }
        });
        this.mWorkerHandler = handler;
        this.mSppPacketProducer = new k7o(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SppVersionReader this$0, Message msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.wearable.spp.SppPacket");
            this$0.onReceivePacket((b) obj);
        }
        return true;
    }

    private final int getVersion(byte[] data) {
        byte b2;
        int i = 0;
        int i2 = 0;
        while (i < data.length && i < 3) {
            byte b3 = data[i];
            if (i != 0) {
                b2 = i != 1 ? (byte) 0 : (byte) 8;
            } else {
                b2 = 16;
            }
            i2 += b3 << b2;
            i++;
        }
        return i2;
    }

    private final String getVersionName(byte[] data) {
        StringBuilder sb = new StringBuilder();
        int length = data.length;
        for (int i = 0; i < length; i++) {
            sb.append(Byte.valueOf(data[i]));
            if (i != data.length - 1) {
                sb.append(".");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        CoreExtKt.getLogger().i(TAG, string);
        return string;
    }

    private final void onReceivePacket(b sppPacket) {
        int iE = m7o.e(sppPacket.j());
        sppPacket.k();
        byte[] bArrN = sppPacket.n();
        CoreExtKt.getLogger().d(TAG, "onReceivePacket() called with: sppPacket = " + iE);
        if (iE != 106 || bArrN == null) {
            return;
        }
        this.versionCallback.onVersion(getVersion(bArrN), getVersionName(bArrN));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readVersion$lambda$1(SppVersionReader this$0, b bVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.client.sendData(bVar.x(), null);
    }

    @NotNull
    public final izc getClient() {
        return this.client;
    }

    public final void onVersionDataReceive(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mSppPacketProducer.e(data);
        removeMessages(100);
    }

    public final boolean readVersion() {
        CoreExtKt.getLogger().i(TAG, "start readVersion");
        final b bVarA = new b.a().b(0).e(true).d(1).g(m7o.b()).c((byte) 0).f(0).a();
        this.mWorkerHandler.post(new Runnable() { // from class: o7o
            @Override // java.lang.Runnable
            public final void run() {
                SppVersionReader.readVersion$lambda$1(this.f28827a, bVarA);
            }
        });
        SppVersionReader$mMainHandler$1 sppVersionReader$mMainHandler$1 = this.mMainHandler;
        sppVersionReader$mMainHandler$1.sendMessageDelayed(sppVersionReader$mMainHandler$1.obtainMessage(100), 5000L);
        return true;
    }
}
