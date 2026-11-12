package defpackage;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.data.ISender;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class f6o implements ISender {
    public static final int c = (int) TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EcoDeviceModel f17464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17465b;

    public class a implements OnEcoSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cza f17466a;

        public a(cza czaVar) {
            this.f17466a = czaVar;
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearSender", "getWearSportStatus fail resultCode = " + i2);
            this.f17466a.a(new a8r());
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String str, int i, EcoSyncResult ecoSyncResult) {
            this.f17466a.a(f6o.this.f(ecoSyncResult != null ? ecoSyncResult.getPacket() : null));
        }
    }

    public class b implements OnEcoSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SportRequestCallback f17468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SportRequestData f17469b;

        public b(SportRequestCallback sportRequestCallback, SportRequestData sportRequestData) {
            this.f17468a = sportRequestCallback;
            this.f17469b = sportRequestData;
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearSender", "sendPhoneSportRequest error , code : " + i2);
            SportResponseData sportResponseData = new SportResponseData(1, null, null);
            sportResponseData.setSentCode(i2);
            SportRequestCallback sportRequestCallback = this.f17468a;
            if (sportRequestCallback != null) {
                sportRequestCallback.call(this.f17469b.sportState, sportResponseData);
            }
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onSuccess(String str, int i, EcoSyncResult ecoSyncResult) {
            FitnessLogUtils.i("SportWearSender", "sendPhoneSportRequest success");
            SportResponseData sportResponseDataE = f6o.this.e(ecoSyncResult != null ? ecoSyncResult.getPacket() : null);
            if (sportResponseDataE == null) {
                sportResponseDataE = new SportResponseData(1, null, null);
            }
            sportResponseDataE.setSentCode(ecoSyncResult != null ? ecoSyncResult.getCode() : 0);
            SportRequestCallback sportRequestCallback = this.f17468a;
            if (sportRequestCallback != null) {
                sportRequestCallback.call(this.f17469b.sportState, sportResponseDataE);
            }
        }
    }

    public f6o(EcoDeviceModel ecoDeviceModel) {
        this.f17464a = ecoDeviceModel;
    }

    private void c(u7r u7rVar, boolean z, OnEcoSyncCallback onEcoSyncCallback) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        if (sportDeviceModel.getDeviceSyncManager() != null) {
            sportDeviceModel.getDeviceSyncManager().call(this.f17464a.getDid(), u7rVar, z, onEcoSyncCallback, c);
        }
    }

    public void d(cza czaVar) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 29;
        u7rVar.B(new vr9());
        c(u7rVar, true, new a(czaVar));
    }

    public final SportResponseData e(u7r u7rVar) {
        if (u7rVar == null) {
            FitnessLogUtils.w("SportWearSender", "handleSportRequestResponse -- wearPacket is null");
            return null;
        }
        if (u7rVar.e != 8) {
            FitnessLogUtils.w("SportWearSender", "handleSportRequestResponse -- not fitness response type");
            return null;
        }
        vr9 vr9VarR = u7rVar.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("SportWearSender", "handleSportRequestResponse -- no fitness proto");
            return null;
        }
        iu9 iu9VarD = vr9VarR.D();
        if (iu9VarD == null) {
            FitnessLogUtils.w("SportWearSender", "no fitness sport response proto");
            return null;
        }
        SportResponseData sportResponseDataH = uv9.h(iu9VarD);
        FitnessLogUtils.i("SportWearSender", "response data: " + sportResponseDataH);
        return sportResponseDataH;
    }

    public final a8r f(u7r u7rVar) {
        if (u7rVar == null) {
            FitnessLogUtils.w("SportWearSender", "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (u7rVar.e != 8) {
            FitnessLogUtils.w("SportWearSender", "handleWearSportStatus -- not fitness response type");
            return null;
        }
        vr9 vr9VarR = u7rVar.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("SportWearSender", "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ku9 ku9VarE = vr9VarR.E();
        if (ku9VarE == null) {
            FitnessLogUtils.w("SportWearSender", "no fitness sportStatus proto");
            return null;
        }
        a8r a8rVarJ = uv9.j(ku9VarE);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportWearSender", "WearSportStatus: " + a8rVarJ);
        return a8rVarJ;
    }

    public final boolean g(PhoneSportData phoneSportData) {
        Location location = phoneSportData.location;
        if (location == null) {
            return false;
        }
        long j = this.f17465b;
        long j2 = location.timeStamp;
        if (j == j2) {
            return false;
        }
        this.f17465b = j2;
        return true;
    }

    public void h(PhoneSportData phoneSportData, OnEcoSyncCallback onEcoSyncCallback, int i) {
        if (i == 1) {
            if (g(phoneSportData)) {
                k(phoneSportData, onEcoSyncCallback);
            }
        } else if (i == 0) {
            j(phoneSportData, onEcoSyncCallback);
        }
    }

    public final void i(PhoneSportData phoneSportData, OnEcoSyncCallback onEcoSyncCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 27;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportWearSender", "sendPhoneSportDataV1 : " + phoneSportData.toString());
        ss9 ss9VarP = uv9.p(phoneSportData);
        vr9 vr9Var = new vr9();
        vr9Var.Q(ss9VarP);
        u7rVar.B(vr9Var);
        c(u7rVar, false, onEcoSyncCallback);
    }

    public final void j(PhoneSportData phoneSportData, OnEcoSyncCallback onEcoSyncCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 49;
        us9 us9VarR = uv9.r(phoneSportData);
        vr9 vr9Var = new vr9();
        vr9Var.R(us9VarR);
        u7rVar.B(vr9Var);
        c(u7rVar, false, onEcoSyncCallback);
    }

    public final void k(PhoneSportData phoneSportData, OnEcoSyncCallback onEcoSyncCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 48;
        if (phoneSportData.location == null) {
            return;
        }
        ws9 ws9VarQ = uv9.q(phoneSportData);
        vr9 vr9Var = new vr9();
        vr9Var.S(ws9VarQ);
        FitnessLogUtils.d("SportWearSender", "timestamp:" + vr9Var.z().d + ",longitude :" + vr9Var.z().e + ",latitude:" + vr9Var.z().f + ",altitude:" + vr9Var.z().g + ",speed:" + vr9Var.z().h + ",bearing:" + vr9Var.z().i + ",horizontal_accuracy:" + vr9Var.z().j + ",vertical_accuracuy:" + vr9Var.z().f38307k);
        u7rVar.B(vr9Var);
        c(u7rVar, false, onEcoSyncCallback);
    }

    public final void l(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 26;
        gu9 gu9VarS = uv9.s(sportRequestData);
        vr9 vr9Var = new vr9();
        vr9Var.V(gu9VarS);
        u7rVar.B(vr9Var);
        FitnessLogUtils.i("SportWearSender", "sendPhoneSportRequest");
        c(u7rVar, true, new b(sportRequestCallback, sportRequestData));
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.data.ISender
    public void sendPhoneSportDataToWear(PhoneSportData phoneSportData, OnEcoSyncCallback onEcoSyncCallback) {
        i(phoneSportData, onEcoSyncCallback);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.data.ISender
    public void sendSportRequestToWear(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback) {
        l(sportRequestData, sportRequestCallback);
    }
}
