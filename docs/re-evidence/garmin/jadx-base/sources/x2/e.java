package x2;

import f4.s;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lx2/e;", "T", "", "", "initialUndoStack", "initialRedoStack", "", "capacity", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f188476d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s<T> f188478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s<T> f188479c;

    static {
        new a(null);
    }

    public e(List<? extends T> list, List<? extends T> list2, int i14) {
        this.f188477a = i14;
        if (!(i14 >= 0)) {
            b2.e.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i14)) {
            b2.e.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        s<T> sVar = new s<>();
        sVar.addAll(list);
        this.f188478b = sVar;
        s<T> sVar2 = new s<>();
        sVar2.addAll(list2);
        this.f188479c = sVar2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx2/e$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public e() {
        this(null, null, 0, 7, null);
    }

    public e(List list, List list2, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? j0.f134944a : list, (i15 & 2) != 0 ? j0.f134944a : list2, (i15 & 4) != 0 ? 100 : i14);
    }
}
