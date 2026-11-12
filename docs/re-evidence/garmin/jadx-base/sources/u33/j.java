package u33;

import java.util.List;
import p13.j0;
import s33.x;
import s33.y;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f168343b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f168344c = new j(j0.f134944a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x> f168345a;

    private j(List<x> list) {
        this.f168345a = list;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(y yVar) {
            yVar.getClass();
            if (yVar.f157026b.size() == 0) {
                return j.f168344c;
            }
            List<x> list = yVar.f157026b;
            list.getClass();
            return new j(list, null);
        }

        private a() {
        }
    }

    public /* synthetic */ j(List list, p005kotlin.jvm.internal.j jVar) {
        this(list);
    }
}
