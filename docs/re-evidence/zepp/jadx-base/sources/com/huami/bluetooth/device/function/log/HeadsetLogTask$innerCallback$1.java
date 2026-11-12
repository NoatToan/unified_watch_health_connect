package com.huami.bluetooth.device.function.log;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"com/huami/bluetooth/device/function/log/HeadsetLogTask$innerCallback$1", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Ljava/io/File;", "", "onStart", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "data", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "onStop", "", "a", "Z", "getHalfCompleted", "()Z", "setHalfCompleted", "(Z)V", "halfCompleted", "", "b", LogUtil.I, "getSyncDeviceLogCount", "()I", "setSyncDeviceLogCount", "(I)V", "syncDeviceLogCount", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeadsetLogTask$innerCallback$1 implements IHMDataCallback<File> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean halfCompleted;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int syncDeviceLogCount;
    public final /* synthetic */ HeadsetLogTask c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HeadsetLogTask a;
        public final /* synthetic */ Progress b;
        public final /* synthetic */ HeadsetLogTask$innerCallback$1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HeadsetLogTask headsetLogTask, Progress progress, HeadsetLogTask$innerCallback$1 headsetLogTask$innerCallback$1) {
            super(0);
            this.a = headsetLogTask;
            this.b = progress;
            this.c = headsetLogTask$innerCallback$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            int i = this.a.isNeedDualDeviceLog ? 200 : 100;
            if (!this.a.isNeedDualDeviceLog) {
                IHMDataCallback iHMDataCallback = this.a.callback;
                Objects.requireNonNull(iHMDataCallback);
                iHMDataCallback.onProgress(this.b);
            } else if (this.a.isNeedDualDeviceLog && !this.c.getHalfCompleted()) {
                IHMDataCallback iHMDataCallback2 = this.a.callback;
                Objects.requireNonNull(iHMDataCallback2);
                iHMDataCallback2.onProgress(new Progress(i, this.b.getPercent()));
            } else if (this.a.isNeedDualDeviceLog && this.c.getHalfCompleted()) {
                IHMDataCallback iHMDataCallback3 = this.a.callback;
                Objects.requireNonNull(iHMDataCallback3);
                iHMDataCallback3.onProgress(new Progress(i, this.b.getPercent() + 100));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HeadsetLogTask b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeadsetLogTask headsetLogTask) {
            super(0);
            this.b = headsetLogTask;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (HeadsetLogTask$innerCallback$1.this.getSyncDeviceLogCount() == 0) {
                Debug.fi("HeadsetLogTask", "onStart");
                IHMDataCallback iHMDataCallback = this.b.callback;
                Objects.requireNonNull(iHMDataCallback);
                iHMDataCallback.onStart();
            } else if (HeadsetLogTask$innerCallback$1.this.getSyncDeviceLogCount() == 1) {
                Debug.fi("HeadsetLogTask", "onStart next half device log");
            }
            HeadsetLogTask$innerCallback$1 headsetLogTask$innerCallback$1 = HeadsetLogTask$innerCallback$1.this;
            headsetLogTask$innerCallback$1.setSyncDeviceLogCount(headsetLogTask$innerCallback$1.getSyncDeviceLogCount() + 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HeadsetLogTask a;
        public final /* synthetic */ File b;
        public final /* synthetic */ HMDeviceError c;
        public final /* synthetic */ HeadsetLogTask$innerCallback$1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HeadsetLogTask headsetLogTask, File file, HMDeviceError hMDeviceError, HeadsetLogTask$innerCallback$1 headsetLogTask$innerCallback$1) {
            super(0);
            this.a = headsetLogTask;
            this.b = file;
            this.c = hMDeviceError;
            this.d = headsetLogTask$innerCallback$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a.forceStop.get()) {
                Debug.fi("HeadsetLogTask", "forceStop");
                IHMDataCallback iHMDataCallback = this.a.callback;
                Objects.requireNonNull(iHMDataCallback);
                iHMDataCallback.onStop(this.b, this.c);
                this.d.setHalfCompleted(false);
                this.d.setSyncDeviceLogCount(0);
                this.a.j();
                return;
            }
            if (!this.d.getHalfCompleted()) {
                HMDeviceError hMDeviceError = this.c;
                if (hMDeviceError != null && hMDeviceError.isErrorNone()) {
                    this.d.setHalfCompleted(true);
                }
            }
            if (this.a.isNeedDualDeviceLog) {
                HMDeviceError hMDeviceError2 = this.c;
                if (!(hMDeviceError2 != null && hMDeviceError2.isErrorNone()) || (this.d.getHalfCompleted() && this.d.getSyncDeviceLogCount() == 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("syncDeviceLogCount");
                    sb.append(this.d.getSyncDeviceLogCount());
                    sb.append("，error:");
                    HMDeviceError hMDeviceError3 = this.c;
                    sb.append(hMDeviceError3 != null ? Integer.valueOf(hMDeviceError3.getError()) : null);
                    sb.append(";isDual complete:");
                    HMDeviceError hMDeviceError4 = this.c;
                    sb.append(hMDeviceError4 != null && hMDeviceError4.isErrorNone() ? "success" : "failed");
                    Debug.fi("HeadsetLogTask", sb.toString());
                    IHMDataCallback iHMDataCallback2 = this.a.callback;
                    Objects.requireNonNull(iHMDataCallback2);
                    iHMDataCallback2.onStop(this.b, this.c);
                    this.d.setHalfCompleted(false);
                    this.d.setSyncDeviceLogCount(0);
                    this.a.j();
                    return;
                }
            }
            if (this.a.isNeedDualDeviceLog && this.d.getHalfCompleted() && this.d.getSyncDeviceLogCount() == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("syncDeviceLogCount");
                sb2.append(this.d.getSyncDeviceLogCount());
                sb2.append(",error:");
                HMDeviceError hMDeviceError5 = this.c;
                sb2.append(hMDeviceError5 != null ? Integer.valueOf(hMDeviceError5.getError()) : null);
                sb2.append(";isDual half complete,");
                Debug.fi("HeadsetLogTask", sb2.toString());
                this.a.f(this.b, this.c);
                return;
            }
            if (this.a.isNeedDualDeviceLog) {
                return;
            }
            HMDeviceError hMDeviceError6 = this.c;
            Debug.fi("HeadsetLogTask", Intrinsics.stringPlus("Single-ear log synchronization,error:", hMDeviceError6 != null ? Integer.valueOf(hMDeviceError6.getError()) : null));
            IHMDataCallback iHMDataCallback3 = this.a.callback;
            Objects.requireNonNull(iHMDataCallback3);
            iHMDataCallback3.onStop(this.b, this.c);
            this.d.setHalfCompleted(false);
            this.d.setSyncDeviceLogCount(0);
            this.a.j();
        }
    }

    public HeadsetLogTask$innerCallback$1(HeadsetLogTask headsetLogTask) {
        this.c = headsetLogTask;
    }

    public final boolean getHalfCompleted() {
        return this.halfCompleted;
    }

    public final int getSyncDeviceLogCount() {
        return this.syncDeviceLogCount;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
    public void onProgress(@Nullable Progress progress) {
        if (progress == null) {
            return;
        }
        HeadsetLogTask headsetLogTask = this.c;
        headsetLogTask.c(new a(headsetLogTask, progress, this));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
    public void onStart() {
        HeadsetLogTask headsetLogTask = this.c;
        headsetLogTask.c(new b(headsetLogTask));
    }

    public final void setHalfCompleted(boolean z) {
        this.halfCompleted = z;
    }

    public final void setSyncDeviceLogCount(int i) {
        this.syncDeviceLogCount = i;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
    public void onStop(@Nullable File data, @Nullable HMDeviceError error) {
        HeadsetLogTask headsetLogTask = this.c;
        headsetLogTask.c(new c(headsetLogTask, data, error, this));
    }
}
