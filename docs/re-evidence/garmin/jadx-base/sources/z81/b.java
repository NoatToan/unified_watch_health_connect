package z81;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideGenesisActivity;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import e2.f0;
import e23.l;
import gs1.v;
import i3.pc;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import okhttp3.Response;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p5.k0;
import q03.r;
import u62.z;
import zb0.c1;
import zd0.i0;
import zd2.e;
import zd2.h;
import zn2.f1;
import zn2.u0;
import zo.t;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203092a;

    public /* synthetic */ b(int i14) {
        this.f203092a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        boolean z14 = false;
        switch (this.f203092a) {
            case 0:
                ud.a aVar = (ud.a) obj;
                com.garmin.android.apps.connectmobile.persistence.a.b bVar = com.garmin.android.apps.connectmobile.persistence.a.f40315c;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("DELETE FROM activity_types");
                try {
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 1:
                z91.a aVar2 = z91.a.f203130a;
                ((oi0.b) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                oi0.b bVar2 = (oi0.b) obj;
                int i14 = c1.f203441z;
                bVar2.getClass();
                bVar2.m();
                return Unit.INSTANCE;
            case 3:
                oi0.b bVar3 = (oi0.b) obj;
                int i15 = c1.f203441z;
                bVar3.getClass();
                bVar3.Z();
                return Unit.INSTANCE;
            case 4:
                ((i0) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((i0) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((i0) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ud.a aVar3 = (ud.a) obj;
                zd2.c.b bVar4 = zd2.c.f204229c;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("DELETE FROM livetrack_publishers");
                try {
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 8:
                ud.a aVar4 = (ud.a) obj;
                e.b bVar5 = e.f204232d;
                aVar4.getClass();
                ud.c cVarM2 = aVar4.M0("DELETE FROM general_settings");
                try {
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            case 9:
                ud.a aVar5 = (ud.a) obj;
                h.c cVar = h.f204240e;
                aVar5.getClass();
                ud.c cVarM3 = aVar5.M0("DELETE FROM session_info");
                try {
                    cVarM3.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM3.close();
                }
            case 10:
                v.a aVar6 = (v.a) obj;
                int i16 = zh0.c.f204780l;
                aVar6.getClass();
                if (!(aVar6 instanceof v.a.f) && !(aVar6 instanceof v.a.b)) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 11:
                return Boolean.valueOf(((Float) obj).floatValue() > 0.0f);
            case 12:
                return Boolean.valueOf(((Float) obj).floatValue() > 0.0f);
            case 13:
                ((Float) obj).getClass();
                return Boolean.TRUE;
            case 14:
                a0 a0Var = (a0) obj;
                u0 u0Var = u0.f205864a;
                a0Var.getClass();
                return r.f(a0Var);
            case 15:
                a0 a0Var2 = (a0) obj;
                u0 u0Var2 = u0.f205864a;
                a0Var2.getClass();
                u0.f205864a.getClass();
                Logger loggerI = u0.i();
                Response response = a0Var2.f25745a;
                loggerI.debug("retrieveDevicesForFPUser: server response " + response.code());
                if (response.code() != 200) {
                    return r.f(j0.f134944a);
                }
                Collection collection = (Collection) a0Var2.f25746b;
                return r.f(collection != null ? h0.b1(collection) : null);
            case 16:
                a0 a0Var3 = (a0) obj;
                u0 u0Var3 = u0.f205864a;
                a0Var3.getClass();
                Response response2 = a0Var3.f25745a;
                if (response2.code() != 200) {
                    if (response2.code() == 204) {
                        u0Var3.getClass();
                        u0.i().debug("getFitPayUser: No device with FP user");
                        return r.f(new sn2.a.c());
                    }
                    if (response2.code() == 409) {
                        u0Var3.getClass();
                        u0.i().error("getFitPayUser: More than one FP user detected. Current user status unknown until one is selected");
                        return r.f(new sn2.a.b());
                    }
                    u0Var3.getClass();
                    u0.i().error("getFitPayUser: error while fetching the user code: " + response2.code());
                    return r.f(new sn2.a.d("error while fetching fp user"));
                }
                u0Var3.getClass();
                z.i("getFitPayUser: user is available ", response2.code(), u0.i());
                sn2.b bVar6 = (sn2.b) a0Var3.f25746b;
                if (bVar6 == null) {
                    return r.f(new sn2.a.d("received null FitPayAccount data for 200"));
                }
                String accessToken = bVar6.getAccessToken();
                if (accessToken != null && accessToken.length() != 0) {
                    f1 f1Var = f1.f205508a;
                    jo2.c.a aVar7 = new jo2.c.a();
                    Long accessTokenExpirationTSMillis = bVar6.getAccessTokenExpirationTSMillis();
                    long jLongValue = accessTokenExpirationTSMillis != null ? accessTokenExpirationTSMillis.longValue() : -1L;
                    aVar7.f99834b = jLongValue;
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(13, (int) jLongValue);
                    aVar7.f99835c = calendar.getTime();
                    Long accessTokenExpirationTSMillis2 = bVar6.getAccessTokenExpirationTSMillis();
                    aVar7.f99835c = accessTokenExpirationTSMillis2 != null ? new Date(accessTokenExpirationTSMillis2.longValue()) : null;
                    aVar7.a(bVar6.getAccessToken());
                    jo2.c cVar2 = new jo2.c(aVar7.f99833a, aVar7.f99834b, aVar7.f99835c, aVar7.f99836d, bVar6.getExternalAccountId());
                    f1Var.getClass();
                    f1.f205509b = cVar2;
                }
                return r.f(new sn2.a.C3030a(bVar6, null, 2, null));
            case 17:
                a0 a0Var4 = (a0) obj;
                u0 u0Var4 = u0.f205864a;
                a0Var4.getClass();
                return r.f(a0Var4);
            case 18:
                a0 a0Var5 = (a0) obj;
                Logger logger = f1.f205511d;
                a0Var5.getClass();
                Response response3 = a0Var5.f25745a;
                if (response3.code() != 201) {
                    logger.error("requestFitPatApiECCKeyPair: error while creating ECC key pair");
                    return r.d(new NewFitPayException("error while creating ECC key pair", zn2.z.UNABLE_TO_LOAD_ENCRYPTION_KEY, null, 4, null));
                }
                z.i("requestFitPatApiECCKeyPair: ECC key pair successfully created code: ", response3.code(), logger);
                jo2.a aVar8 = (jo2.a) a0Var5.f25746b;
                if (aVar8 != null) {
                    LinkedHashMap linkedHashMap = f1.f205510c;
                    jo2.b bVar7 = jo2.b.KEY_API;
                    jo2.a aVar9 = (jo2.a) linkedHashMap.get(Integer.valueOf(bVar7.f99826a));
                    aVar8.f99821h = aVar9 != null ? aVar9.f99821h : null;
                }
                return r.f(aVar8);
            case 19:
                oi0.b bVar8 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d.a aVar10 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d.f29333t;
                bVar8.getClass();
                bVar8.o();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                bVar9.M();
                return Unit.INSTANCE;
            case 21:
                oi0.b bVar10 = (oi0.b) obj;
                bVar10.getClass();
                bVar10.M();
                return Unit.INSTANCE;
            case 22:
                oi0.b bVar11 = (oi0.b) obj;
                i.a aVar11 = i.f29362q;
                bVar11.getClass();
                bVar11.o();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar12 = (oi0.b) obj;
                t.a aVar12 = t.f206072l;
                bVar12.getClass();
                bVar12.o();
                return Unit.INSTANCE;
            case 24:
                GroupRideGenesisActivity.a aVar13 = GroupRideGenesisActivity.f44734a;
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                f0 f0Var = (f0) obj;
                GroupRideGenesisActivity.a aVar14 = GroupRideGenesisActivity.f44734a;
                f0Var.getClass();
                zo1.d.f206251a.getClass();
                f0.b(f0Var, null, zo1.d.f206252b, 3);
                f0.b(f0Var, null, zo1.d.f206253c, 3);
                return Unit.INSTANCE;
            case 26:
                ((pc) obj).getClass();
                return Boolean.TRUE;
            case 27:
                pt1.t tVar = (pt1.t) obj;
                tVar.getClass();
                return Long.valueOf(tVar.f140967a);
            case 28:
                pt1.t tVar2 = (pt1.t) obj;
                tVar2.getClass();
                return Long.valueOf(tVar2.f140967a);
            default:
                jx.c cVar3 = (jx.c) obj;
                int i17 = zw.c.f207199b;
                cVar3.getClass();
                return cVar3.f101392a;
        }
    }
}
