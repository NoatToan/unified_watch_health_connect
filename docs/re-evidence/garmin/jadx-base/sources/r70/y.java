package r70;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;
import r53.k2;
import r53.u1;
import r70.z.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f151115b;

    public /* synthetic */ y(z zVar, int i14) {
        this.f151114a = i14;
        this.f151115b = zVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f151114a) {
            case 0:
                z zVar = this.f151115b;
                return r53.s.K(new u1(zVar.f151129m, zVar.f151128l, zVar.new f(null)), v1.a(zVar), k2.a.a(k2.f150703a, 3), g3.a.c(g3.f35298f));
            default:
                z zVar2 = this.f151115b;
                zVar2.y4(false);
                ge1.b.T(v1.a(zVar2), null, null, new a0(zVar2, null), 3);
                return Unit.INSTANCE;
        }
    }
}
