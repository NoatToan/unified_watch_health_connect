package ib0;

import android.content.Intent;
import android.net.Uri;
import p005kotlin.Unit;
import ta0.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f92501b;

    public /* synthetic */ n(c.q qVar, int i14) {
        this.f92500a = i14;
        this.f92501b = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f92500a;
        c.q qVar = this.f92501b;
        switch (i14) {
            case 0:
                qVar.a("image/*", null);
                break;
            case 1:
                qVar.a(f.k.a(g.e.d.f74074a, 0, 14), null);
                break;
            case 2:
                ot1.u uVar = ot1.u.f133824a;
                qVar.a(Uri.parse("https://support.garmin.com/en-US/?faq=fdNpMJupH10OXQsWAyeIuA&productID=125677&tab=topics"), null);
                break;
            case 3:
                qVar.a(Uri.parse("https://www.garmin.com/en-US/c/outdoor-recreation/satellite-communicators/"), null);
                break;
            case 4:
                j22.b bVar = j22.b.f96736a;
                j22.g gVar = j22.g.f96759d;
                bVar.getClass();
                j22.b.v(qVar, gVar);
                break;
            case 5:
                qVar.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
                break;
            case 6:
                p0.d(qVar);
                break;
            case 7:
                qVar.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
                break;
            case 8:
                j22.b bVar2 = j22.b.f96736a;
                j22.g gVar2 = j22.g.f96761f;
                bVar2.getClass();
                j22.b.v(qVar, gVar2);
                break;
            case 9:
                j22.b bVar3 = j22.b.f96736a;
                j22.g gVar3 = j22.g.f96762g;
                bVar3.getClass();
                j22.b.v(qVar, gVar3);
                break;
            case 10:
                j22.b bVar4 = j22.b.f96736a;
                j22.g gVar4 = j22.g.f96765j;
                bVar4.getClass();
                j22.b.v(qVar, gVar4);
                break;
            case 11:
                j22.b bVar5 = j22.b.f96736a;
                j22.g gVar5 = j22.g.f96766k;
                bVar5.getClass();
                j22.b.v(qVar, gVar5);
                break;
            default:
                j22.b bVar6 = j22.b.f96736a;
                j22.g gVar6 = j22.g.f96768m;
                bVar6.getClass();
                j22.b.v(qVar, gVar6);
                break;
        }
        return Unit.INSTANCE;
    }
}
