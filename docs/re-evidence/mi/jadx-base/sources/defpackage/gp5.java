package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class gp5 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static class a<T> implements tpo<cp5<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f19204a;

        public a(Throwable th) {
            this.f19204a = th;
        }

        @Override // defpackage.tpo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cp5<T> get() {
            return gp5.b(this.f19204a);
        }
    }

    public static <T> tpo<cp5<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> cp5<T> b(Throwable th) {
        pcm pcmVarR = pcm.r();
        pcmVarR.k(th);
        return pcmVarR;
    }
}
