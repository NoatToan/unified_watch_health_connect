package defpackage;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.data.ISender;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class e6o implements ISender {
    public static final int c = (int) TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WearableDeviceModel f16322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16323b;

    public class a implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bza f16324a;

        public a(bza bzaVar) {
            this.f16324a = bzaVar;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearSender", "getWearSportStatus fail resultCode = " + i2);
            this.f16324a.a(new z7r());
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            this.f16324a.a(e6o.this.f(syncResult != null ? syncResult.getPacket() : null));
        }
    }

    public class b implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SportRequestCallback f16326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SportRequestData f16327b;

        public b(SportRequestCallback sportRequestCallback, SportRequestData sportRequestData) {
            this.f16326a = sportRequestCallback;
            this.f16327b = sportRequestData;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearSender", "sendPhoneSportRequest error , code : " + i2 + ",did:" + str);
            SportResponseData sportResponseData = new SportResponseData(1, null, null);
            sportResponseData.setSentCode(i2);
            SportRequestCallback sportRequestCallback = this.f16326a;
            if (sportRequestCallback != null) {
                sportRequestCallback.call(this.f16327b.sportState, sportResponseData);
            }
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            FitnessLogUtils.i("SportWearSender", "sendPhoneSportRequest success , did :" + str);
            SportResponseData sportResponseDataE = e6o.this.e(syncResult != null ? syncResult.getPacket() : null);
            if (sportResponseDataE == null) {
                sportResponseDataE = new SportResponseData(1, null, null);
            }
            sportResponseDataE.setSentCode(syncResult != null ? syncResult.getCode() : 0);
            SportRequestCallback sportRequestCallback = this.f16326a;
            if (sportRequestCallback != null) {
                sportRequestCallback.call(this.f16327b.sportState, sportResponseDataE);
            }
        }
    }

    public class c implements OnSyncCallback {
        public c() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearSender", "onError , shake , did:" + str + ",code:" + i2 + ",type:" + i);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            FitnessLogUtils.i("SportWearSender", "onSuccess , shake , did:" + str + ",type:" + i);
        }
    }

    public e6o(WearableDeviceModel wearableDeviceModel) {
        this.f16322a = wearableDeviceModel;
    }

    private void c(s7r s7rVar, boolean z, OnSyncCallback onSyncCallback) {
        SportDeviceModel.INSTANCE.getDeviceSyncManager().call(this.f16322a.getDid(), s7rVar, z, onSyncCallback, c);
    }

    public void d(bza bzaVar) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 29;
        s7rVar.S(new ur9());
        c(s7rVar, true, new a(bzaVar));
    }

    public final SportResponseData e(s7r s7rVar) {
        if (s7rVar == null) {
            FitnessLogUtils.w("SportWearSender", "handleSportRequestResponse -- wearPacket is null");
            return null;
        }
        if (s7rVar.e != 8) {
            FitnessLogUtils.w("SportWearSender", "handleSportRequestResponse -- not fitness response type");
            return null;
        }
        ur9 ur9VarU = s7rVar.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("SportWearSender", "handleSportRequestResponse -- no fitness proto");
            return null;
        }
        hu9 hu9VarU = ur9VarU.U();
        if (hu9VarU == null) {
            FitnessLogUtils.w("SportWearSender", "no fitness sport response proto");
            return null;
        }
        SportResponseData sportResponseDataI = tv9.i(hu9VarU);
        FitnessLogUtils.i("SportWearSender", "response data: " + sportResponseDataI);
        return sportResponseDataI;
    }

    public final z7r f(s7r s7rVar) {
        if (s7rVar == null) {
            FitnessLogUtils.w("SportWearSender", "handleWearSportStatus -- wearPacket is null");
            return null;
        }
        if (s7rVar.e != 8) {
            FitnessLogUtils.w("SportWearSender", "handleWearSportStatus -- not fitness response type");
            return null;
        }
        ur9 ur9VarU = s7rVar.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("SportWearSender", "handleWearSportStatus -- no fitness proto");
            return null;
        }
        ju9 ju9VarV = ur9VarU.V();
        if (ju9VarV == null) {
            FitnessLogUtils.w("SportWearSender", "no fitness sportStatus proto");
            return null;
        }
        z7r z7rVarK = tv9.k(ju9VarV);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportWearSender", "WearSportStatus: " + z7rVarK);
        return z7rVarK;
    }

    public final boolean g(PhoneSportData phoneSportData) {
        Location location = phoneSportData.location;
        if (location == null) {
            return false;
        }
        long j = this.f16323b;
        long j2 = location.timeStamp;
        if (j == j2) {
            return false;
        }
        this.f16323b = j2;
        return true;
    }

    public void h(PhoneSportData phoneSportData, OnSyncCallback onSyncCallback, int i) {
        if (i == 1) {
            if (g(phoneSportData)) {
                k(phoneSportData, onSyncCallback);
            }
        } else if (i == 0) {
            j(phoneSportData, onSyncCallback);
        }
    }

    public final void i(PhoneSportData phoneSportData, OnSyncCallback onSyncCallback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 27;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportWearSender", "sendPhoneSportDataV1 : " + phoneSportData.toString());
        rs9 rs9VarR = tv9.r(phoneSportData);
        ur9 ur9Var = new ur9();
        ur9Var.w0(rs9VarR);
        s7rVar.S(ur9Var);
        c(s7rVar, false, onSyncCallback);
    }

    public final void j(PhoneSportData phoneSportData, OnSyncCallback onSyncCallback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 49;
        ts9 ts9VarT = tv9.t(phoneSportData);
        ur9 ur9Var = new ur9();
        ur9Var.x0(ts9VarT);
        s7rVar.S(ur9Var);
        c(s7rVar, false, onSyncCallback);
    }

    public final void k(PhoneSportData phoneSportData, OnSyncCallback onSyncCallback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 48;
        if (phoneSportData.location == null) {
            return;
        }
        vs9 vs9VarS = tv9.s(phoneSportData);
        ur9 ur9Var = new ur9();
        ur9Var.y0(vs9VarS);
        FitnessLogUtils.d("SportWearSender", "timestamp:" + ur9Var.H().d + ",longitude :" + ur9Var.H().e + ",latitude:" + ur9Var.H().f + ",altitude:" + ur9Var.H().g + ",speed:" + ur9Var.H().h + ",bearing:" + ur9Var.H().i + ",horizontal_accuracy:" + ur9Var.H().j + ",vertical_accuracuy:" + ur9Var.H().f37182k);
        s7rVar.S(ur9Var);
        c(s7rVar, false, onSyncCallback);
    }

    public final void l(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 26;
        fu9 fu9VarV = tv9.v(sportRequestData);
        ur9 ur9Var = new ur9();
        ur9Var.N0(fu9VarV);
        s7rVar.S(ur9Var);
        FitnessLogUtils.i("SportWearSender", "sportType:" + fu9VarV.e + ",wearMode:" + fu9VarV.l + ",sprotState:" + fu9VarV.g);
        c(s7rVar, true, new b(sportRequestCallback, sportRequestData));
    }

    public void m(int i) {
        FitnessLogUtils.i("SportWearSender", "shake , vibrateLevel:" + i);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 56;
        ur9 ur9Var = new ur9();
        os9 os9Var = new os9();
        os9Var.c = i;
        ur9Var.s0(os9Var);
        s7rVar.S(ur9Var);
        c(s7rVar, false, new c());
    }

    @Override // com.xiaomi.fitness.sport_manager.data.ISender
    public void sendPhoneSportDataToWear(PhoneSportData phoneSportData, OnSyncCallback onSyncCallback) {
        i(phoneSportData, onSyncCallback);
    }

    @Override // com.xiaomi.fitness.sport_manager.data.ISender
    public void sendSportRequestToWear(SportRequestData sportRequestData, SportRequestCallback sportRequestCallback) {
        l(sportRequestData, sportRequestCallback);
    }
}
