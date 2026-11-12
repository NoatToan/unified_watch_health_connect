package f4;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lf4/i0;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "()V", "", TtmlNode.ATTR_ID, "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f68749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f68750b;

    public i0() {
        this(l.i().getF68737b());
    }

    public abstract void a(i0 i0Var);

    public abstract i0 b();

    public i0 c(long j8) {
        i0 i0VarB = b();
        i0VarB.f68749a = j8;
        return i0VarB;
    }

    public i0(long j8) {
        this.f68749a = j8;
    }

    @o13.e
    public i0(int i14) {
        this(i14);
    }
}
