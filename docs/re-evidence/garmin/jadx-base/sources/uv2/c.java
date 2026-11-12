package uv2;

import androidx.fragment.app.Fragment;
import cx2.h;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wu2.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luv2/c;", "Lwu2/i$a;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f172966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj1.a f172967b = new uj1.a(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f172968c;

    /* JADX WARN: Type inference failed for: r0v0, types: [uv2.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [uv2.b] */
    public c(final a aVar, final int i14, final int i15) {
        final int i16 = 0;
        this.f172966a = new p() { // from class: uv2.b
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i17 = i16;
                int i18 = i15;
                int i19 = i14;
                a aVar2 = aVar;
                Fragment fragment = (Fragment) obj;
                dx2.c cVar = (dx2.c) obj2;
                switch (i17) {
                    case 0:
                        fragment.getClass();
                        cVar.getClass();
                        h hVar = a.f172960c;
                        aVar2.getClass();
                        a.d(fragment, cVar, i19, i18);
                        break;
                    default:
                        fragment.getClass();
                        cVar.getClass();
                        h hVar2 = a.f172960c;
                        aVar2.getClass();
                        a.d(fragment, cVar, i19, i18);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i17 = 1;
        this.f172968c = new p() { // from class: uv2.b
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i18 = i17;
                int i19 = i15;
                int i110 = i14;
                a aVar2 = aVar;
                Fragment fragment = (Fragment) obj;
                dx2.c cVar = (dx2.c) obj2;
                switch (i18) {
                    case 0:
                        fragment.getClass();
                        cVar.getClass();
                        h hVar = a.f172960c;
                        aVar2.getClass();
                        a.d(fragment, cVar, i110, i19);
                        break;
                    default:
                        fragment.getClass();
                        cVar.getClass();
                        h hVar2 = a.f172960c;
                        aVar2.getClass();
                        a.d(fragment, cVar, i110, i19);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> a() {
        return this.f172966a;
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> b() {
        return this.f172967b;
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> c() {
        return this.f172968c;
    }
}
