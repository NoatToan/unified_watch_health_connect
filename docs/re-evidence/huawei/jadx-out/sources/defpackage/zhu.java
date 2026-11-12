package defpackage;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "createCopy", "equals", "", "other", "", "fillInStackTrace", WatchFaceConstant.HASHCODE, "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zhu extends CancellationException implements CopyableThrowable<zhu> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Job f54109b;

    public zhu(String str, Throwable th, Job job) {
        super(str);
        this.f54109b = job;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (ASSERTIONS_ENABLED.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zhu createCopy() {
        if (!ASSERTIONS_ENABLED.c()) {
            return null;
        }
        String message = getMessage();
        zcp.e((Object) message);
        return new zhu(message, this, this.f54109b);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f54109b;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof zhu)) {
            return false;
        }
        zhu zhuVar = (zhu) other;
        return zcp.b((Object) zhuVar.getMessage(), (Object) getMessage()) && zcp.b(zhuVar.f54109b, this.f54109b) && zcp.b(zhuVar.getCause(), getCause());
    }

    public int hashCode() {
        String message = getMessage();
        zcp.e((Object) message);
        int iHashCode = message.hashCode();
        int iHashCode2 = this.f54109b.hashCode();
        Throwable cause = getCause();
        return (((iHashCode * 31) + iHashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
