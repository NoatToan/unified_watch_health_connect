package bw2;

import android.view.View;
import androidx.fragment.app.Fragment;
import e23.p;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbw2/c;", "Lwu2/i$a;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements wu2.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.e f21583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f21585c;

    /* JADX WARN: Type inference failed for: r1v0, types: [bw2.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bw2.b] */
    public c(final i iVar, Fragment fragment, final dx2.c cVar, final Map<String, ? extends Object> map, final View view2) {
        this.f21583a = new a3.e(fragment, iVar, cVar, map);
        final int i14 = 0;
        this.f21584b = new p() { // from class: bw2.b
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                Fragment fragment2 = (Fragment) obj;
                dx2.c cVar2 = (dx2.c) obj2;
                switch (i14) {
                    case 0:
                        fragment2.getClass();
                        cVar2.getClass();
                        d.a(iVar, view2, cVar, map);
                        break;
                    default:
                        fragment2.getClass();
                        cVar2.getClass();
                        d.a(iVar, view2, cVar, map);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        this.f21585c = new p() { // from class: bw2.b
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                Fragment fragment2 = (Fragment) obj;
                dx2.c cVar2 = (dx2.c) obj2;
                switch (i15) {
                    case 0:
                        fragment2.getClass();
                        cVar2.getClass();
                        d.a(iVar, view2, cVar, map);
                        break;
                    default:
                        fragment2.getClass();
                        cVar2.getClass();
                        d.a(iVar, view2, cVar, map);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> a() {
        return this.f21583a;
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> b() {
        return this.f21584b;
    }

    @Override // wu2.i.a
    public final p<Fragment, dx2.c, Unit> c() {
        return this.f21585c;
    }
}
