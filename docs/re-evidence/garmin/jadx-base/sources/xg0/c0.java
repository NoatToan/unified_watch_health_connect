package xg0;

import am.x0;
import am.z0;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxg0/c0;", "", "Landroid/view/View;", "itemView", "Lxg0/n;", "mediaEventListener", "Lwg0/a;", "activityFeed", "", "isMapLiteMode", "Lrs/c;", "Lwg0/d;", "mapDataConfig", "Lrs/d;", "legendConfig", "newsFeedMapOverlay", "<init>", "(Landroid/view/View;Lxg0/n;Lwg0/a;ZLrs/c;Lrs/d;Lwg0/d;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f190733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg0.a f190734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg0.d f190735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qw0.s f190736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rs.h f190737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rs.j f190738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f190739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f190740h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.p<com.garmin.android.library.mapsdkadapter.i.d, Integer, Unit> {
        public a(Object obj) {
            super(2, obj, n.class, "onDisplayMapUnavailableMessage", "onDisplayMapUnavailableMessage(Lcom/garmin/android/library/mapsdkadapter/IMap$MapProvider;I)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(com.garmin.android.library.mapsdkadapter.i.d dVar, Integer num) {
            com.garmin.android.library.mapsdkadapter.i.d dVar2 = dVar;
            int iIntValue = num.intValue();
            dVar2.getClass();
            ((n) this.receiver).S2(dVar2, iIntValue);
            return Unit.INSTANCE;
        }
    }

    public c0(View view2, n nVar, wg0.a aVar, boolean z14, rs.c<wg0.d> cVar, rs.d<wg0.d> dVar, wg0.d dVar2) {
        x0 x0Var;
        x0 x0Var2;
        view2.getClass();
        nVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f190733a = nVar;
        this.f190734b = aVar;
        this.f190735c = dVar2;
        String str = null;
        this.f190736d = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);
        rs.h hVar = new rs.h(view2, new a(nVar), z14, a());
        this.f190737e = hVar;
        View viewFindViewById = view2.findViewById(R.id.weather_widget);
        viewFindViewById.getClass();
        this.f190738f = new rs.j(viewFindViewById);
        this.f190739g = view2.findViewById(R.id.activity_processing_alert);
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.map_legend_container);
        rs.f fVar = viewGroup != null ? new rs.f(viewGroup) : null;
        if (dVar2 != null && (x0Var2 = dVar2.f185078a) != null) {
            str = x0Var2.f4358a;
        }
        this.f190740h = new h0(hVar, fVar, cVar, dVar, str, false, 32, null);
        GCMMapView gCMMapView = hVar.f154318b;
        int childCount = gCMMapView.getChildCount();
        boolean z15 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            gCMMapView.getChildAt(i14).setImportantForAccessibility(4);
        }
        if (a() != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
            final int i15 = 0;
            gCMMapView.getMapProxy().O(new com.mapbox.maps.m(new e23.a(this) { // from class: xg0.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0 f190720b;

                {
                    this.f190720b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            c0 c0Var = this.f190720b;
                            c0Var.f190733a.o4(c0Var.f190734b, null);
                            return Unit.INSTANCE;
                        case 1:
                            c0 c0Var2 = this.f190720b;
                            c0Var2.f190733a.o4(c0Var2.f190734b, null);
                            return Boolean.TRUE;
                        default:
                            c0 c0Var3 = this.f190720b;
                            c0Var3.f190733a.o4(c0Var3.f190734b, null);
                            return Boolean.TRUE;
                    }
                }
            }, 2));
            final int i16 = 1;
            gCMMapView.getMapProxy().B(new com.mapbox.maps.m(new e23.a(this) { // from class: xg0.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0 f190720b;

                {
                    this.f190720b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            c0 c0Var = this.f190720b;
                            c0Var.f190733a.o4(c0Var.f190734b, null);
                            return Unit.INSTANCE;
                        case 1:
                            c0 c0Var2 = this.f190720b;
                            c0Var2.f190733a.o4(c0Var2.f190734b, null);
                            return Boolean.TRUE;
                        default:
                            c0 c0Var3 = this.f190720b;
                            c0Var3.f190733a.o4(c0Var3.f190734b, null);
                            return Boolean.TRUE;
                    }
                }
            }, 4));
            final int i17 = 2;
            gCMMapView.getMapProxy().K(new com.mapbox.maps.m(new e23.a(this) { // from class: xg0.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0 f190720b;

                {
                    this.f190720b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            c0 c0Var = this.f190720b;
                            c0Var.f190733a.o4(c0Var.f190734b, null);
                            return Unit.INSTANCE;
                        case 1:
                            c0 c0Var2 = this.f190720b;
                            c0Var2.f190733a.o4(c0Var2.f190734b, null);
                            return Boolean.TRUE;
                        default:
                            c0 c0Var3 = this.f190720b;
                            c0Var3.f190733a.o4(c0Var3.f190734b, null);
                            return Boolean.TRUE;
                    }
                }
            }, 3));
            return;
        }
        wg0.d dVar3 = this.f190735c;
        if (dVar3 != null && (x0Var = dVar3.f185078a) != null) {
            String str2 = x0Var.f4358a;
            if (z0.A(str2) ? false : this.f190736d.B(str2)) {
                z15 = true;
            }
        }
        gCMMapView.getMapProxy().A(new r22.a(new c.e(z15, hVar, z14, this), 10));
    }

    public final com.garmin.android.library.mapsdkadapter.i.d a() {
        x0 x0Var;
        String str;
        wg0.d dVar = this.f190735c;
        if (dVar == null || (x0Var = dVar.f185078a) == null || (str = x0Var.f4358a) == null) {
            return null;
        }
        com.garmin.android.library.mapsdkadapter.i.d dVarE = this.f190736d.E(str);
        return (dVarE != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX || dVar.f185086i == null) ? dVarE : com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
    }
}
