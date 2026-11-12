package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aa4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aa4 f818b = new aa4(new a(), false);
    public static final aa4 c = new aa4(new b(), false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f819a;

    public static class a implements c {
        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(fa4 fa4Var) {
            fa4Var.a(noo.b());
            fa4Var.onCompleted();
        }
    }

    public static class b implements c {
        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(fa4 fa4Var) {
            fa4Var.a(noo.b());
        }
    }

    public interface c extends tc0<fa4> {
    }

    public interface d extends zta<fa4, fa4> {
    }

    public aa4(c cVar, boolean z) {
        this.f819a = z ? p5l.d(cVar) : cVar;
    }
}
