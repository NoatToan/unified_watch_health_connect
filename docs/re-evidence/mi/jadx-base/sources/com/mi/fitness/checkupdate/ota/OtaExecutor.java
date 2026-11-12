package com.mi.fitness.checkupdate.ota;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.qch;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "", "", StatConstants.PARAM_START, "()V", BroadcastsKt.SILENT_PUSHING_STOP, "reset", "Ljava/io/File;", "mFile", "Ljava/io/File;", "getMFile", "()Ljava/io/File;", "Lqch;", "mOtaListener", "Lqch;", "getMOtaListener", "()Lqch;", "<init>", "(Ljava/io/File;Lqch;)V", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class OtaExecutor {

    @NotNull
    private final File mFile;

    @NotNull
    private final qch mOtaListener;

    public OtaExecutor(@NotNull File mFile, @NotNull qch mOtaListener) {
        Intrinsics.checkNotNullParameter(mFile, "mFile");
        Intrinsics.checkNotNullParameter(mOtaListener, "mOtaListener");
        this.mFile = mFile;
        this.mOtaListener = mOtaListener;
    }

    @NotNull
    public final File getMFile() {
        return this.mFile;
    }

    @NotNull
    public final qch getMOtaListener() {
        return this.mOtaListener;
    }

    public abstract void reset();

    public abstract void start();

    public abstract void stop();
}
