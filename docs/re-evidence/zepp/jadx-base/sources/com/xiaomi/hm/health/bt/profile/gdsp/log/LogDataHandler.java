package com.xiaomi.hm.health.bt.profile.gdsp.log;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPDataHandler;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/log/LogDataHandler;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPDataHandler;", "", "onReady", "", "total", "currentSize", "onProgress", "", "errorCode", "onSubmit", "Ljava/io/File;", "a", "Ljava/io/File;", "file", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "getCallback", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "callback", "<init>", "(Ljava/io/File;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LogDataHandler implements GDSPDataHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IHMDataCallback<File> callback;

    public LogDataHandler(@NotNull File file, @NotNull IHMDataCallback<File> iHMDataCallback) {
        this.file = file;
        this.callback = iHMDataCallback;
    }

    @NotNull
    public final IHMDataCallback<File> getCallback() {
        return this.callback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPDataHandler
    @NotNull
    public Calendar onData(@NotNull byte[] bArr) {
        return GDSPDataHandler.DefaultImpls.onData(this, bArr);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPDataHandler
    public void onProgress(long total, long currentSize) {
        this.callback.onProgress(new Progress((int) total, (int) currentSize));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPDataHandler
    public void onReady() {
        this.callback.onStart();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPDataHandler
    public int onSubmit(int errorCode) {
        this.callback.onStop(this.file, new HMDeviceError(errorCode));
        return errorCode;
    }
}
