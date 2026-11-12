package vs1;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import r53.b2;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvs1/t;", "", "Landroid/content/Context;", "appContext", "Lo53/b0;", "coroutineScope", "Lss1/a;", "trailsRepo", "Lr53/o2;", "Lcom/google/android/gms/maps/model/LatLng;", "userLocationFlow", "Lvs1/h;", "snackbarMessageUseCase", "Lvs1/y;", "trailFiltersUseCase", "Lkotlin/Function0;", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "<init>", "(Landroid/content/Context;Lo53/b0;Lss1/a;Lr53/o2;Lvs1/h;Lvs1/y;Le23/a;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f179892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f179893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ss1.a f179894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o2<LatLng> f179895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f179896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f179897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<com.garmin.android.library.mapsdkadapter.i.d> f179898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f179899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f179900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f179901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f179902k;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Context context, o53.b0 b0Var, ss1.a aVar, o2<LatLng> o2Var, h hVar, y yVar, e23.a<? extends com.garmin.android.library.mapsdkadapter.i.d> aVar2) {
        context.getClass();
        b0Var.getClass();
        aVar.getClass();
        o2Var.getClass();
        hVar.getClass();
        yVar.getClass();
        aVar2.getClass();
        this.f179892a = context;
        this.f179893b = b0Var;
        this.f179894c = aVar;
        this.f179895d = o2Var;
        this.f179896e = hVar;
        this.f179897f = yVar;
        this.f179898g = aVar2;
        this.f179899h = q2.a(j53.l.b());
        p2 p2VarA = q2.a(new pt1.h(false, false, null, null, false, null, 63, null));
        this.f179900i = p2VarA;
        this.f179902k = r53.s.d(p2VarA);
    }

    public static final void a(t tVar, pt1.t tVar2, boolean z14) {
        Object value;
        p2 p2Var = tVar.f179899h;
        ArrayList arrayListD1 = p13.h0.d1((Collection) p2Var.getValue());
        if (z14) {
            arrayListD1.add(pt1.t.a(tVar2, null, true, 516031));
        } else {
            arrayListD1.removeIf(new s52.e(new uo1.a(tVar2, 27), 20));
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, i53.a.e(arrayListD1)));
        tVar.b();
    }

    public final void b() {
        p2 p2Var;
        Object value;
        p2 p2Var2 = this.f179899h;
        List list = (List) p2Var2.getValue();
        b2 b2Var = this.f179897f.f179925d;
        us1.n nVar = (us1.n) b2Var.f150540a.getValue();
        b2 b2Var2 = this.f179902k;
        i53.c cVarE = i53.a.e(lt1.c.a(y.c(list, nVar, ((pt1.h) b2Var2.f150540a.getValue()).f140855f), this.f179895d.getValue(), ((pt1.h) b2Var2.f150540a.getValue()).f140852c));
        do {
            p2Var = this.f179900i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, pt1.h.a((pt1.h) value, false, !p005kotlin.jvm.internal.s.g(b2Var.f150540a.getValue(), new us1.n(null, null, false, null, null, null, null, 127, null)), null, cVarE, !((Collection) p2Var2.getValue()).isEmpty() && cVarE.isEmpty(), null, 37)));
    }
}
