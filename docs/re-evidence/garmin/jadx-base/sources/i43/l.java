package i43;

import java.util.Collection;
import java.util.Set;
import p13.l0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public interface l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91058a = a.f91059a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f91059a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f91060b = k.f91057a;

        private a() {
        }
    }

    public static final class b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f91061b = new b();

        private b() {
        }

        @Override // i43.m, i43.l
        public final Set<x33.f> b() {
            return l0.f134950a;
        }

        @Override // i43.m, i43.l
        public final Set<x33.f> d() {
            return l0.f134950a;
        }

        @Override // i43.m, i43.l
        public final Set<x33.f> e() {
            return l0.f134950a;
        }
    }

    Collection<? extends r0> a(x33.f fVar, b33.b bVar);

    Set<x33.f> b();

    Collection<? extends x0> c(x33.f fVar, b33.b bVar);

    Set<x33.f> d();

    Set<x33.f> e();
}
