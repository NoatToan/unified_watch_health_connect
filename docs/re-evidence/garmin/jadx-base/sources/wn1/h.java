package wn1;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.smartscale.model.WeightScaleUserInfoDTO;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f186233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb0.b f186235c = new wb0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f186236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f186237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f186238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f186239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f186240h;

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            b bVar;
            i2.d("WeightScaleUserInfoDtoAssembler", "retrieveUserInfo_onComplete: status=" + cVar);
            h hVar = h.this;
            hVar.f186236d.remove(Long.valueOf(j8));
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS || (bVar = hVar.f186237e) == null) {
                return;
            }
            bVar.c3(cVar.name());
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            i2.d("WeightScaleUserInfoDtoAssembler", "retrieveUserInfo_onResults: data=" + obj);
            h hVar = h.this;
            ArrayList arrayList = hVar.f186236d;
            long j14 = hVar.f186233a;
            arrayList.remove(Long.valueOf(j8));
            if (obj != null) {
                WeightScaleUserInfoDTO weightScaleUserInfoDTO = (WeightScaleUserInfoDTO) obj;
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                lVarA.B0(Long.toString(weightScaleUserInfoDTO.f44407a));
                if (j14 != -1) {
                    k0 k0Var = (k0) KoinJavaComponent.get(k0.class);
                    k0Var.d(j14, weightScaleUserInfoDTO.f44409c);
                    Boolean bool = weightScaleUserInfoDTO.f44414h;
                    if (bool != null) {
                        k0Var.c(j14, bool.booleanValue());
                    }
                }
                WeightScaleUserInfoDTO.b bVar = weightScaleUserInfoDTO.f44410d;
                lVarA.R(bVar == null ? null : bVar.name());
                Double d14 = weightScaleUserInfoDTO.f44412f;
                if (d14 != null) {
                    lVarA.K1(d14.doubleValue() * 0.001d);
                }
                Double d15 = weightScaleUserInfoDTO.f44411e;
                if (d15 != null) {
                    lVarA.U2(d15.floatValue());
                }
                lVarA.B1(weightScaleUserInfoDTO.C());
                Integer num = weightScaleUserInfoDTO.f44415i;
                if (num != null && num.intValue() != -1) {
                    lVarA.X(num.intValue());
                }
                hVar.f186235c.f183868a = weightScaleUserInfoDTO.f44409c;
                i2.d("WeightScaleUserInfoDtoAssembler", "retrieveUserInfo_onResults: result=" + weightScaleUserInfoDTO);
            }
            i2.d("WeightScaleUserInfoDtoAssembler", "retrieveAllRegisteredShortNames");
            hVar.f186239g = new i(hVar);
            i0 i0VarM = i0.M();
            i iVar = hVar.f186239g;
            i0VarM.getClass();
            hVar.f186236d.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.b(j14, i0VarM), iVar)));
        }
    }

    public interface b {
        void O4(String str);

        void c3(String str);

        void l0();

        void x5();

        void z1();
    }

    public h(long j8, String str, b bVar) {
        this.f186233a = -1L;
        ArrayList arrayList = new ArrayList();
        this.f186236d = arrayList;
        this.f186233a = j8;
        this.f186234b = str;
        this.f186237e = bVar;
        arrayList.clear();
    }

    public final void a() {
        ArrayList<Long> arrayList = this.f186236d;
        if (arrayList.size() > 0) {
            i2.d("WeightScaleUserInfoDtoAssembler", "cancelRequests: pendingBizRequests=" + arrayList);
            for (Long l14 : arrayList) {
                long jLongValue = l14.longValue();
                i0.M().getClass();
                com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
                if (cVar.f50124a.get(l14) != null) {
                    cVar.a(jLongValue);
                }
            }
            arrayList.clear();
        }
    }

    public final WeightScaleUserInfoDTO b() {
        WeightScaleUserInfoDTO weightScaleUserInfoDTO = new WeightScaleUserInfoDTO();
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        if (((f12.b) KoinJavaComponent.get(f12.b.class)).getUserProfilePk() != -1) {
            weightScaleUserInfoDTO.f44407a = ((f12.b) KoinJavaComponent.get(f12.b.class)).getUserProfilePk();
        }
        long j8 = this.f186233a;
        if (j8 != -1) {
            weightScaleUserInfoDTO.f44408b = j8;
            k0 k0Var = (k0) KoinJavaComponent.get(k0.class);
            String strB = k0Var.b(j8);
            if (!TextUtils.isEmpty(strB)) {
                weightScaleUserInfoDTO.I(strB);
            }
            weightScaleUserInfoDTO.f44414h = Boolean.valueOf(k0Var.a(j8));
        }
        String strW = lVarA.w();
        if (!TextUtils.isEmpty(strW)) {
            weightScaleUserInfoDTO.f44410d = WeightScaleUserInfoDTO.b.valueOf(strW);
        }
        double dV3 = lVarA.v3();
        if (dV3 != 0.0d) {
            weightScaleUserInfoDTO.M(Double.valueOf(dV3 * 1000.0d));
        }
        float fT = lVarA.t();
        if (fT != -1.0f) {
            weightScaleUserInfoDTO.H(Double.valueOf(fT));
        }
        LocalDate localDateL1 = lVarA.l1();
        if (localDateL1 != null) {
            weightScaleUserInfoDTO.G(WeightScaleUserInfoDTO.f44406k.print(localDateL1));
        }
        int iE2 = lVarA.e2();
        if (iE2 != -1) {
            weightScaleUserInfoDTO.F(Integer.valueOf(iE2));
        }
        System.out.println("---- printing out user info : " + weightScaleUserInfoDTO);
        return weightScaleUserInfoDTO;
    }

    public final void c() {
        i2.d("WeightScaleUserInfoDtoAssembler", "retrieveUserInfo");
        this.f186238f = new a();
        i0 i0VarM = i0.M();
        a aVar = this.f186238f;
        i0VarM.getClass();
        this.f186236d.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.d(this.f186233a, i0VarM), aVar)));
    }

    public final void d() {
        WeightScaleUserInfoDTO weightScaleUserInfoDTOB = b();
        i2.d("WeightScaleUserInfoDtoAssembler", "storeUserInfo");
        this.f186240h = new j(this);
        i0 i0VarM = i0.M();
        j jVar = this.f186240h;
        i0VarM.getClass();
        this.f186236d.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new yn1.f(this.f186233a, weightScaleUserInfoDTOB, i0VarM), jVar)));
    }
}
