package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¨\u0006\u000f"}, d2 = {"Lx0;", "R", "La1;", "", "toString", "", "hashCode", "", "other", "", "equals", "msg", "code", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Failure<R> extends a1<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String msg;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Failure(@NotNull String msg, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.msg = msg;
        this.code = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Failure)) {
            return false;
        }
        Failure failure = (Failure) other;
        return Intrinsics.areEqual(this.msg, failure.msg) && this.code == failure.code;
    }

    public int hashCode() {
        return (this.msg.hashCode() * 31) + Integer.hashCode(this.code);
    }

    @NotNull
    public String toString() {
        return "Failure(msg='" + this.msg + "', code=" + this.code + ')';
    }
}
