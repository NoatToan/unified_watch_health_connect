package gs;

import android.content.Context;
import android.view.View;
import androidx.core.view.x0;
import androidx.core.view.z0;
import c22.a1;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.v0;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgs/f;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements com.garmin.android.library.mapsdkadapter.i.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f78605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f78606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GCMMapView f78607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<ps.i> f78608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.library.mapsdkadapter.q> f78609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.library.mapsdkadapter.p> f78610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1<v0> f78611g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.templates.MapTemplateKt$MapTemplate$1$1$1$1$2$1$1$onMapReady$1", f = "MapTemplate.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f78612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i f78613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<v0> f78614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.library.mapsdkadapter.i iVar, p1<v0> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f78613b = iVar;
            this.f78614c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f78613b, this.f78614c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f78612a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f78612a = 1;
                if (m0.b(1000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f78613b.N(new en0.n(this.f78614c, 28));
            return Unit.INSTANCE;
        }
    }

    public f(b0 b0Var, boolean z14, GCMMapView gCMMapView, List<ps.i> list, List<com.garmin.android.library.mapsdkadapter.q> list2, List<com.garmin.android.library.mapsdkadapter.p> list3, p1<v0> p1Var) {
        this.f78605a = b0Var;
        this.f78606b = z14;
        this.f78607c = gCMMapView;
        this.f78608d = list;
        this.f78609e = list2;
        this.f78610f = list3;
        this.f78611g = p1Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        this.f78607c.c();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        ge1.b.T(this.f78605a, null, null, new a(iVar, this.f78611g, null), 3);
        boolean z14 = this.f78606b;
        GCMMapView gCMMapView = this.f78607c;
        if (z14) {
            List<ps.i> list = this.f78608d;
            if (list != null && !list.isEmpty() && gCMMapView.getMapProxy().f144584a.getF50241b()) {
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                for (ps.i iVar2 : list) {
                    arrayList.add(new com.garmin.android.library.mapsdkadapter.s(new com.garmin.android.library.mapsdkadapter.f(iVar2.getLat(), iVar2.getLon(), com.garmin.android.library.mapsdkadapter.i.b.WGS84), iVar2.getWeight()));
                }
                a1 a1Var = a1.f22992a;
                Context context = gCMMapView.getContext();
                context.getClass();
                a1Var.getClass();
                ie2.h.a aVarA = a1.a(context);
                aVarA.b(arrayList);
                gCMMapView.setMapType(4);
                ie2.t tVar = new ie2.t();
                tVar.f93176a = aVarA.a();
                gCMMapView.getMapProxy().F(tVar);
                com.garmin.android.library.mapsdkadapter.i.a.e(gCMMapView.getMapProxy(), false, false, 24);
            }
        } else if (gCMMapView.getMapProxy().f144584a.getF50241b()) {
            gCMMapView.setMapType(1);
            List<com.garmin.android.library.mapsdkadapter.q> list2 = this.f78609e;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    gCMMapView.h((com.garmin.android.library.mapsdkadapter.q) it.next());
                }
            }
            List<com.garmin.android.library.mapsdkadapter.p> list3 = this.f78610f;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    gCMMapView.g((com.garmin.android.library.mapsdkadapter.p) it3.next());
                }
            }
            gCMMapView.i();
        }
        iVar.getUiSettings().setAllGesturesEnabled(false);
        Iterator<View> it4 = new x0(gCMMapView).iterator();
        while (true) {
            z0 z0Var = (z0) it4;
            if (!z0Var.hasNext()) {
                return;
            } else {
                ((View) z0Var.next()).setImportantForAccessibility(4);
            }
        }
    }
}
