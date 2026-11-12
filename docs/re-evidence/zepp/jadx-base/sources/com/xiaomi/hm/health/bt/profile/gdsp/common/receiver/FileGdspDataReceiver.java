package com.xiaomi.hm.health.bt.profile.gdsp.common.receiver;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/FileGdspDataReceiver;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "Ljava/io/File;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "", "receiveHeader", "getDataHeader", "", "data", "receiveData", "getAllData", "getAllByteData", "Ljava/util/Calendar;", "cal", "getDataFooter", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "registerProgress", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "errorCode", "onFinish", "a", "Ljava/io/File;", "file", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "mDataHeader", "c", "Lkotlin/jvm/functions/Function1;", "mProgressCallback", "Ljava/io/BufferedOutputStream;", GoogleApiAvailabilityLight.a, "Ljava/io/BufferedOutputStream;", "mFileOutputStream", "", "e", LogUtil.I, "receivedSize", "<init>", "(Ljava/io/File;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileGdspDataReceiver implements IGdspDataReceiver<File> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final File file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private DataHeader mDataHeader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Progress, Unit> mProgressCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BufferedOutputStream mFileOutputStream;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int receivedSize;

    public FileGdspDataReceiver(@NotNull File file) {
        this.file = file;
        this.mFileOutputStream = new BufferedOutputStream(new FileOutputStream(file));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @NotNull
    public byte[] getAllByteData() {
        try {
            Result.Companion companion = Result.Companion;
            this.mFileOutputStream.flush();
            this.mFileOutputStream.close();
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return c.readBytes(this.file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @Nullable
    public File getDataFooter(@NotNull Calendar cal) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @Nullable
    /* JADX INFO: renamed from: getDataHeader, reason: from getter */
    public DataHeader getMDataHeader() {
        return this.mDataHeader;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void onFinish(@NotNull GDSPErrorCode errorCode) {
        try {
            Result.Companion companion = Result.Companion;
            this.mFileOutputStream.flush();
            this.mFileOutputStream.close();
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveData(@NotNull byte[] data) {
        this.receivedSize += data.length;
        this.mFileOutputStream.write(data);
        Function1<? super Progress, Unit> function1 = this.mProgressCallback;
        if (function1 == null) {
            return;
        }
        DataHeader dataHeader = this.mDataHeader;
        function1.invoke(new Progress(dataHeader == null ? 100 : dataHeader.size, this.receivedSize));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveHeader(@Nullable DataHeader header) {
        this.mDataHeader = header;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void registerProgress(@NotNull Function1<? super Progress, Unit> onProgress) {
        this.mProgressCallback = onProgress;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @NotNull
    public File getAllData() {
        try {
            Result.Companion companion = Result.Companion;
            this.mFileOutputStream.flush();
            this.mFileOutputStream.close();
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return this.file;
    }
}
