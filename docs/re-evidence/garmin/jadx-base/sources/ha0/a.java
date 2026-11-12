package ha0;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import dg.p;
import f12.l;
import hf.s;
import hf.t;
import hk1.a0;
import ho.q;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import m63.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.h0;
import p3.p0;
import u53.o;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82620a;

    public /* synthetic */ a(int i14) {
        this.f82620a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = 0;
        switch (this.f82620a) {
            case 0:
                c cVar = c.f82622a;
                return Unit.INSTANCE;
            case 1:
                c cVar2 = c.f82622a;
                return Unit.INSTANCE;
            case 2:
                x53.c cVar3 = s0.f129406a;
                return o.f168762a.H();
            case 3:
                return (mf.a) mf.e.f118289a.getValue();
            case 4:
                p.f59494a.getClass();
                List listN0 = h0.N0((List) p.f59495b.getValue(), new s());
                ArrayList arrayList = new ArrayList();
                int size = listN0.size();
                while (i14 < size) {
                    dg.f fVar = (dg.f) listN0.get(i14);
                    fVar.getClass();
                    sf.i.a aVarA = fVar.a();
                    k23.d dVarType = fVar.type();
                    o13.p pVar = dVarType == null ? null : new o13.p(aVarA, dVarType);
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                    i14++;
                }
                return arrayList;
            case 5:
                p.f59494a.getClass();
                List listN1 = h0.N0((List) p.f59496c.getValue(), new t());
                ArrayList arrayList2 = new ArrayList();
                int size2 = listN1.size();
                while (i14 < size2) {
                    arrayList2.add(((dg.c) listN1.get(i14)).a());
                    i14++;
                }
                return arrayList2;
            case 6:
                hf2.a.C1650a c1650a = hf2.a.f83640a;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("CampaignImageUtil");
            case 7:
                hi0.d.Companion bVar = hi0.d.INSTANCE;
                return hi0.d.c.INSTANCE.serializer();
            case 8:
                hi0.d.Companion bVar2 = hi0.d.INSTANCE;
                return hi0.d.c.INSTANCE.serializer();
            case 9:
                hi0.d.c[] cVarArrValues = hi0.d.c.values();
                cVarArrValues.getClass();
                return new b0("com.garmin.android.apps.connectmobile.follow.model.FollowRequestErrorDTO.ErrorType", cVarArrValues);
            case 10:
                a0.Companion companion = a0.INSTANCE;
                return new u02.b();
            case 11:
                a0.Companion companion2 = a0.INSTANCE;
                return new u02.b();
            case 12:
                a0.Companion companion3 = a0.INSTANCE;
                return new u02.b();
            case 13:
                a0.Companion companion4 = a0.INSTANCE;
                return new u02.b();
            case 14:
                hk2.b.a aVar = hk2.b.f84221i;
                return Long.valueOf(System.currentTimeMillis());
            case 15:
                hl.a.Companion companion5 = hl.a.INSTANCE;
                return new i63.g("com.garmin.android.apps.connectmobile.accessrole.ScreenAccessRole", p005kotlin.jvm.internal.s0.f105811a.b(hl.a.class), new k23.d[0], new i63.c[0], new Annotation[0]);
            case 16:
                q qVar = q.f84665a;
                return Unit.INSTANCE;
            case 17:
                q qVar2 = q.f84665a;
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                int i16 = HeartRateReportsActivity.f36641d;
                return new yb0.b(new do0.a());
            case 21:
                return p0.n(Boolean.FALSE);
            case 22:
                int i17 = hp.c.f84895j;
                return Boolean.valueOf(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y());
            case 23:
                ht.h.f85473a.getClass();
                return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c() ? GCMSettingManager.k().f77335a : zi2.a.valueOf("PROD");
            case 24:
                ht.h.f85473a.getClass();
                GarminConnectMobileApp.f28685g.getClass();
                return Boolean.valueOf(!GarminConnectMobileApp.a.b().f28689a);
            case 25:
                return p0.n(Boolean.FALSE);
            case 26:
                return p0.n("");
            case 27:
                return p0.n(Boolean.FALSE);
            case 28:
                return p0.n(Boolean.FALSE);
            default:
                return p0.n(Boolean.FALSE);
        }
    }
}
