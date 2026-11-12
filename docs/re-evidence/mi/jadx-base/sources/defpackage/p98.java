package defpackage;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class p98 {

    public static class a implements ipf<c93> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u2d f30145a;

        public a(u2d u2dVar) {
            this.f30145a = u2dVar;
        }

        @Override // defpackage.ipf
        public void b() {
            this.f30145a.f();
        }

        @Override // defpackage.ipf
        public void c() {
            this.f30145a.g();
        }

        @Override // defpackage.ipf
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(c93 c93Var) {
            this.f30145a.h(c93Var);
        }
    }

    public static ecd<c93, PooledByteBuffer> a(yl4<c93, PooledByteBuffer> yl4Var, u2d u2dVar) {
        u2dVar.d(yl4Var);
        return new ecd<>(yl4Var, new a(u2dVar));
    }
}
