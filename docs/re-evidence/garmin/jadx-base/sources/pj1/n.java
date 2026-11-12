package pj1;

import android.location.Location;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import i3.e5;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesLocationViewModel$getReverseGeocodeLocation$1", f = "SafetyFeaturesLocationViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 191}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vo0.e f137951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f137954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Location f137955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f137956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, Location location, boolean z14, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f137954d = mVar;
        this.f137955e = location;
        this.f137956f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f137954d, this.f137955e, this.f137956f, dVar);
        nVar.f137953c = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        if (r0 == r10) goto L32;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01c6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vo0.e eVar;
        Object objA;
        Object next;
        vo0.e eVar2;
        Object objJ;
        Object next2;
        Object next3;
        tj1.l lVar;
        o53.b0 b0Var = (o53.b0) this.f137953c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137952b;
        boolean z14 = this.f137956f;
        Location location = this.f137955e;
        m mVar = this.f137954d;
        if (i14 == 0) {
            o13.r.b(obj);
            uo0.b bVar = mVar.f137943a;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Set setB = a1.b(z14 ? uo0.g.HOUSE_NUMBER : uo0.g.CITY);
            String lowerCase = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).b().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String strV = d53.u.v(lowerCase, "_", "-", false);
            this.f137953c = b0Var;
            this.f137952b = 1;
            eVar = null;
            objA = bVar.a(latitude, longitude, setB, null, strV, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = obj;
            eVar = null;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vo0.e eVar3 = this.f137951a;
            o13.r.b(obj);
            eVar = null;
            eVar2 = eVar3;
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.SAFETY_FEATURES;
            T t7 = ((v2.b) v2Var).f47386a;
            String strF = e5.f(t7, "[getReverseGeocodeLocation] GC API reverse geocode retrieval success; location = ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SafetyFeaturesLocationViewModel", strF);
            Iterable iterable = (Iterable) t7;
            Iterator it = iterable.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = eVar;
                    break;
                }
                next2 = it.next();
                lVar = (tj1.l) next2;
                if (lVar.getAdminType() == tj1.b.State) {
                    break;
                }
            } while (lVar.getAdminType() != tj1.b.Province);
            tj1.l lVar2 = (tj1.l) next2;
            String name = lVar2 != null ? lVar2.getName() : eVar;
            Iterator it3 = iterable.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = eVar;
                    break;
                }
                next3 = it3.next();
            } while (((tj1.l) next3).getAdminType() != tj1.b.City);
            tj1.l lVar3 = (tj1.l) next3;
            vo0.e eVar4 = new vo0.e(null, null, null, null, new vo0.a(null, null, null, null, name, null, null, lVar3 != null ? lVar3.getName() : eVar, null, null, null, null, 3951, null), null, null, null, 239, null);
            if (m.x4(mVar, eVar4, z14)) {
                eVar2 = eVar4;
            }
        } else {
            a2 a2Var2 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SafetyFeaturesLocationViewModel", "[getReverseGeocodeLocation] GC API reverse geocode retrieval error");
        }
        if (eVar2 != null) {
            i2.f36769a.getClass();
            i2.a.b(a2.SAFETY_FEATURES, "SafetyFeaturesLocationViewModel", "[getReverseGeocodeLocation] reverse geocode retrieval success; location = " + eVar2);
            y0<g3<vo0.e>> y0Var = mVar.f137945c;
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(eVar2));
        } else {
            a2 a2Var3 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "SafetyFeaturesLocationViewModel", "[getReverseGeocodeLocation] reverse geocode retrieval error");
            mVar.f137945c.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) objA;
        if (v2Var2 instanceof v2.b) {
            a2 a2Var4 = a2.SAFETY_FEATURES;
            T t14 = ((v2.b) v2Var2).f47386a;
            String strF2 = e5.f(t14, "[getReverseGeocodeLocation] Here API reverse geocode retrieval success; location = ");
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "SafetyFeaturesLocationViewModel", strF2);
            Iterator<T> it4 = ((vo0.f) t14).b().iterator();
            do {
                if (!it4.hasNext()) {
                    next = eVar;
                    break;
                }
                next = it4.next();
            } while (!m.x4(mVar, (vo0.e) next, z14));
            eVar2 = (vo0.e) next;
        } else {
            a2 a2Var5 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "SafetyFeaturesLocationViewModel", "[getReverseGeocodeLocation] Here API reverse geocode retrieval error");
            eVar2 = eVar;
        }
        if (eVar2 == null) {
            a2 a2Var6 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "SafetyFeaturesLocationViewModel", "[geoReverseGeocodeLocation] could not get reverse location from Here API, trying GC API");
            tj1.n nVar = mVar.f137947e;
            double latitude2 = location.getLatitude();
            double longitude2 = location.getLongitude();
            this.f137953c = b0Var;
            this.f137951a = eVar2;
            this.f137952b = 2;
            nVar.getClass();
            objJ = f0.J(nVar, new tj1.p(nVar, latitude2, longitude2, null), this);
        }
        if (eVar2 != null) {
            i2.f36769a.getClass();
            i2.a.b(a2.SAFETY_FEATURES, "SafetyFeaturesLocationViewModel", "[getReverseGeocodeLocation] reverse geocode retrieval success; location = " + eVar2);
            y0<g3<vo0.e>> y0Var2 = mVar.f137945c;
            g3.f35298f.getClass();
            y0Var2.j(g3.a.d(eVar2));
        } else {
            a2 a2Var7 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var7, "SafetyFeaturesLocationViewModel", "[getReverseGeocodeLocation] reverse geocode retrieval error");
            mVar.f137945c.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
