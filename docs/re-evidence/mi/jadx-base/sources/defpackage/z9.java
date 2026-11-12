package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b\u0006\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0006\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lz9;", "Lbi;", "Ljava/io/File;", "Lf4s;", "header", "", PluginDeviceInfo.FMODEL, "(Lf4s;)V", PluginDeviceInfo.FICONON, "()Lf4s;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FICONOFF, "()Ljava/io/File;", "()[B", "Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, PluginDeviceInfo.FDESC, "(Ljava/util/Calendar;)Ljava/io/File;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "(Lkotlin/jvm/functions/Function1;)V", "Lmb;", "errorCode", "(Lmb;)V", "file", "<init>", "(Ljava/io/File;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class z9 implements bi<File> {

    @NotNull
    public final File t;

    @Nullable
    public f4s u;

    @Nullable
    public Function1<? super Progress, Unit> v;

    @NotNull
    public final BufferedOutputStream w;
    public int x;

    public z9(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.t = file;
        this.w = new BufferedOutputStream(new FileOutputStream(file));
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public File a(@NotNull Calendar cal) {
        Intrinsics.checkNotNullParameter(cal, "cal");
        return null;
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public f4s getU() {
        return this.u;
    }

    @Override // defpackage.bi
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public File b() {
        try {
            Result.Companion companion = Result.Companion;
            this.w.flush();
            this.w.close();
            Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        return this.t;
    }

    @Override // defpackage.bi
    public void a(@Nullable f4s header) {
        this.u = header;
    }

    @Override // defpackage.bi
    @Nullable
    public Object a(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) throws IOException {
        this.x += bArr.length;
        this.w.write(bArr);
        Function1<? super Progress, Unit> function1 = this.v;
        if (function1 != null) {
            f4s f4sVar = this.u;
            function1.invoke2(new Progress(f4sVar != null ? f4sVar.f17407b : 100, this.x));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.bi
    @NotNull
    public byte[] a() {
        try {
            Result.Companion companion = Result.Companion;
            this.w.flush();
            this.w.close();
            Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        return FilesKt__FileReadWriteKt.readBytes(this.t);
    }

    @Override // defpackage.bi
    public void a(@NotNull Function1<? super Progress, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.v = onProgress;
    }

    @Override // defpackage.bi
    public void a(@NotNull mb errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        try {
            Result.Companion companion = Result.Companion;
            this.w.flush();
            this.w.close();
            Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m886constructorimpl(ResultKt.createFailure(th));
        }
    }
}
