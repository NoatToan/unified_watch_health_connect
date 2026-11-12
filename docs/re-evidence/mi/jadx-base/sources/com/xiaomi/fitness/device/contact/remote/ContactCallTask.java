package com.xiaomi.fitness.device.contact.remote;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 42\u00020\u0001:\u00014BA\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001cR\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010/R\u0016\u00100\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\"R\u0016\u00101\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\"¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/device/contact/remote/ContactCallTask;", "", "", "code", "Ls7r;", "packet", "", "data", "", "onResult", "(ILs7r;[B)V", BroadcastsKt.SILENT_PUSHING_CANCEL, "()V", "onResponseTimeout", "onReceiveResponse", "(ILs7r;)V", "([B)V", "Lcom/xiaomi/fitness/device/contact/remote/ContactTaskQueue;", "mQueue", "Lcom/xiaomi/fitness/device/contact/remote/ContactTaskQueue;", "", "did", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "type", "I", "getType", "()I", "[B", "getData", "()[B", "", "needResponse", "Z", "getNeedResponse", "()Z", "Lcom/xiaomi/fitness/device/contact/export/a;", "callback", "Lcom/xiaomi/fitness/device/contact/export/a;", "getCallback", "()Lcom/xiaomi/fitness/device/contact/export/a;", "timeout", "getTimeout", "id", "getId", "setId", "(I)V", "mResulted", "mCanceled", "<init>", "(Lcom/xiaomi/fitness/device/contact/remote/ContactTaskQueue;Ljava/lang/String;I[BZLcom/xiaomi/fitness/device/contact/export/a;I)V", "Companion", "device-contact_release"}, k = 1, mv = {2, 0, 0})
public final class ContactCallTask {
    public static final int RESULT_FAILED = -2;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_TIMEOUT = -1;

    @NotNull
    private static final String TAG = "ContactCallTask";

    @Nullable
    private final com.xiaomi.fitness.device.contact.export.a callback;

    @NotNull
    private final byte[] data;

    @NotNull
    private final String did;
    private int id;
    private volatile boolean mCanceled;

    @NotNull
    private final ContactTaskQueue mQueue;
    private volatile boolean mResulted;
    private final boolean needResponse;
    private final int timeout;
    private final int type;

    public ContactCallTask(@NotNull ContactTaskQueue mQueue, @NotNull String did, int i, @NotNull byte[] data, boolean z, @Nullable com.xiaomi.fitness.device.contact.export.a aVar, int i2) {
        Intrinsics.checkNotNullParameter(mQueue, "mQueue");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        this.mQueue = mQueue;
        this.did = did;
        this.type = i;
        this.data = data;
        this.needResponse = z;
        this.callback = aVar;
        this.timeout = i2;
    }

    private final void onResult(int code, s7r packet, byte[] data) {
        if (this.mResulted) {
            Logger.i(TAG, "onResult  code=" + code + "   has resulted " + this);
            return;
        }
        this.mResulted = true;
        com.xiaomi.fitness.device.contact.export.a aVar = this.callback;
        if (aVar == null || !aVar.asBinder().isBinderAlive()) {
            Logger.e(TAG, "onResult  no callback  " + this);
            return;
        }
        Logger.i(TAG, "onResult  has packet=" + (packet != null) + ", has data=" + (data != null) + "  " + this);
        try {
            if (code == 0) {
                this.callback.onSyncSuccess(this.did, this.type, new SyncResult(code, packet));
            } else {
                this.callback.onSyncError(this.did, this.type, code);
            }
        } catch (Exception e) {
            Logger.e(TAG, "onResult exception : " + e);
        }
    }

    public final synchronized void cancel() {
        if (!this.mResulted && !this.mCanceled) {
            this.mCanceled = true;
            this.mQueue.cancel(this);
        }
    }

    @Nullable
    public final com.xiaomi.fitness.device.contact.export.a getCallback() {
        return this.callback;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getNeedResponse() {
        return this.needResponse;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    public final int getType() {
        return this.type;
    }

    public final void onReceiveResponse(int code, @Nullable s7r packet) {
        this.mQueue.onReceiveResponse$device_contact_release(this);
        onResult(code, packet, null);
    }

    public final void onResponseTimeout() {
        this.mQueue.onResponseTimeout$device_contact_release(this);
        onResult(-6, null, null);
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void onReceiveResponse(@Nullable byte[] data) {
        this.mQueue.onReceiveResponse$device_contact_release(this);
        onResult(0, null, data);
    }
}
