package yv2;

import androidx.fragment.app.Fragment;
import e23.p;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wu2.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyv2/b;", "Lwu2/i$a;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f199855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yu1.a f199856b = new yu1.a((byte) 0, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f199857c;

    /* JADX WARN: Type inference failed for: r0v0, types: [yv2.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [yv2.a] */
    public b(final f fVar, final Map<String, ? extends Object> map) {
        final int i14 = 0;
        this.f199855a = new p() { // from class: yv2.a
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                Fragment fragment = (Fragment) obj;
                dx2.c cVar = (dx2.c) obj2;
                switch (i14) {
                    case 0:
                        fragment.getClass();
                        cVar.getClass();
                        c.f199858a.getClass();
                        c.a(fragment, cVar, map, fVar);
                        break;
                    default:
                        fragment.getClass();
                        cVar.getClass();
                        c.f199858a.getClass();
                        c.a(fragment, cVar, map, fVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        this.f199857c = new p() { // from class: yv2.a
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                Fragment fragment = (Fragment) obj;
                dx2.c cVar = (dx2.c) obj2;
                switch (i15) {
                    case 0:
                        fragment.getClass();
                        cVar.getClass();
                        c.f199858a.getClass();
                        c.a(fragment, cVar, map, fVar);
                        break;
                    default:
                        fragment.getClass();
                        cVar.getClass();
                        c.f199858a.getClass();
                        c.a(fragment, cVar, map, fVar);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> a() {
        return this.f199855a;
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> b() {
        return this.f199856b;
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> c() {
        return this.f199857c;
    }
}
