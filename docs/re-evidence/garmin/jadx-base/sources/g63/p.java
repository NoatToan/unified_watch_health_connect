package g63;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Objects;
import me2.z;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76151a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f76154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f76155e;

    public /* synthetic */ p(com.garmin.android.library.mapsdkadapter.e eVar, int i14, int i15, me2.l lVar) {
        this.f76154d = eVar;
        this.f76152b = i14;
        this.f76153c = i15;
        this.f76155e = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f76151a;
        Object obj = this.f76155e;
        int i15 = this.f76153c;
        int i16 = this.f76152b;
        Object obj2 = this.f76154d;
        switch (i14) {
            case 0:
                return "Expected " + ((q) obj2).f76156a + " but got " + ((CharSequence) obj).subSequence(i16, i15 + i16 + 1).toString();
            default:
                com.garmin.android.library.mapsdkadapter.e eVar = (com.garmin.android.library.mapsdkadapter.e) obj2;
                me2.l lVar = (me2.l) obj;
                int i17 = me2.l.Z;
                Objects.toString(eVar);
                boolean z14 = lVar.P;
                eVar.getClass();
                LatLngBounds latLngBoundsH = z14 ? z.h(eVar) : new LatLngBounds(eVar.f50273a.f50283a, eVar.f50274b.f50283a);
                if (i16 == -1) {
                    i16 = lVar.X;
                }
                CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsH, i16);
                cameraUpdateNewLatLngBounds.getClass();
                lVar.b0(cameraUpdateNewLatLngBounds, i15);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(q qVar, CharSequence charSequence, int i14, int i15) {
        this.f76154d = qVar;
        this.f76155e = charSequence;
        this.f76152b = i14;
        this.f76153c = i15;
    }
}
