package f4;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lf4/g;", "", "<init>", "()V", "b", "a", "Lf4/g$a;", "Lf4/g$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf4/g$a;", "Lf4/g;", "Lf4/f;", "snapshot", "<init>", "(Lf4/f;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f68740a;

        public a(f fVar) {
            super(null);
            this.f68740a = fVar;
        }

        @Override // f4.g
        public final void a() throws SnapshotApplyConflictException {
            f fVar = this.f68740a;
            fVar.c();
            throw new SnapshotApplyConflictException(fVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4/g$b;", "Lf4/g;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f68741a = new b();

        private b() {
            super(null);
        }

        @Override // f4.g
        public final void a() {
        }
    }

    public /* synthetic */ g(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract void a();

    private g() {
    }
}
