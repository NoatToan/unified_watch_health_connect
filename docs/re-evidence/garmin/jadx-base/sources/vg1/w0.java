package vg1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.SimpleSetupProtoManager;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDISimpleSetup;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvg1/w0;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/SimpleSetupProtoManager$OnFeatureListListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 implements SimpleSetupProtoManager.OnFeatureListListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f178202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<g3<qv.a>> f178203b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.common.TransferActivityProfilesViewModel$checkForActivityProfilesToTransfer$featureListRequestListener$1$onFeatureListResponseReceived$1", f = "TransferActivityProfilesViewModel.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f178205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f178206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.y0<g3<qv.a>> f178207d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0 y0Var, List<Integer> list, androidx.lifecycle.y0<g3<qv.a>> y0Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f178205b = y0Var;
            this.f178206c = list;
            this.f178207d = y0Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f178205b, this.f178206c, this.f178207d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178204a;
            if (i14 == 0) {
                o13.r.b(obj);
                pc0.a aVar2 = this.f178205b.f178242a;
                this.f178204a = 1;
                aVar2.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new pc0.d(aVar2, this.f178206c, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            androidx.lifecycle.y0<g3<qv.a>> y0Var = this.f178207d;
            if (z14) {
                T t7 = ((v2.b) v2Var).f47386a;
                List<qv.c> listF = ((qv.a) t7).f();
                if (listF != null) {
                    for (qv.c cVar : listF) {
                        hv.h.f85764f.getClass();
                        hv.h hVarA = hv.h.a.a();
                        bm2.c cVarB = hVarA != null ? hVarA.b(cVar.getDeviceTypeKey()) : null;
                        if (cVarB != null) {
                            cVar.j(cVarB.getF143516f());
                            cVar.i(cVarB.f18909g);
                        }
                    }
                }
                u62.z.h(g3.f35298f, t7, y0Var);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                y0Var.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
            }
            return Unit.INSTANCE;
        }
    }

    public w0(y0 y0Var, androidx.lifecycle.y0<g3<qv.a>> y0Var2) {
        this.f178202a = y0Var;
        this.f178203b = y0Var2;
    }

    @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.SimpleSetupProtoManager.OnFeatureListListener
    public final void onFeatureListResponseFailed() {
        this.f178203b.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
    }

    @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.SimpleSetupProtoManager.OnFeatureListListener
    public final void onFeatureListResponseReceived(List<GDISimpleSetup.Feature> list) {
        Object next;
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((GDISimpleSetup.Feature) next).getFeatureType() != GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION);
        GDISimpleSetup.Feature feature = (GDISimpleSetup.Feature) next;
        if (feature != null) {
            List<Integer> compatibilityIdList = feature.getCompatibilityIdList();
            y0 y0Var = this.f178202a;
            w9.a aVarA = v1.a(y0Var);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new a(y0Var, compatibilityIdList, this.f178203b, null), 2);
        }
    }
}
