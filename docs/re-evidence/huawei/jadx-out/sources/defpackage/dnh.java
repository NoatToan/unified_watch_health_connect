package defpackage;

import android.os.Bundle;
import com.careforeyou.library.BIAWorker;
import com.careforeyou.library.bean.WeightEntity;
import com.careforeyou.library.intface.BIACallback;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.BleMeasureController;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dnh extends BleMeasureController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHealthDeviceCallback f32051a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BIAWorker f32053c;
    private HealthDevice e;
    private float f = 173.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32052b = 29;
    private int h = 1;
    private boolean j = false;
    private boolean i = false;
    BIACallback d = new BIACallback() { // from class: dnh.5
        @Override // com.careforeyou.library.intface.BIACallback
        public void onResult(int i, JSONObject jSONObject) {
            ReleaseLogUtil.d("R_PluginDevice_ChipSeaMeasureController", "onResult: ", Integer.valueOf(i));
            if (i != 1 || dnh.this.f32051a == null) {
                return;
            }
            dnh.this.f32051a.onDataChanged(dnh.this.e, dnh.this.c(jSONObject));
            if (dnh.this.f32053c == null || dnh.this.i) {
                return;
            }
            dnh.this.f32053c.a();
            dnh.this.i = true;
        }

        @Override // com.careforeyou.library.intface.BIACallback
        public void onCanSyncUnit() {
            LogUtil.a("PluginDevice_ChipSeaMeasureController", "onCanSyncUnit");
        }

        @Override // com.careforeyou.library.intface.BIACallback
        public void onSyncAllUserInfo() {
            LogUtil.a("PluginDevice_ChipSeaMeasureController", "onSyncAllUserInfo");
            dnh.this.f32053c.a(dnh.this.c());
        }

        @Override // com.careforeyou.library.intface.BIACallback
        public void onState(int i, String str) {
            ReleaseLogUtil.d("R_PluginDevice_ChipSeaMeasureController", "BIAWorker State: ", Integer.valueOf(i), "msg: ", str);
        }

        @Override // com.careforeyou.library.intface.BIACallback
        public void onUserMatchResult(JSONObject jSONObject, List<Integer> list) {
            LogUtil.a("PluginDevice_ChipSeaMeasureController", "onUserMatchResult");
        }
    };

    private int d(int i) {
        return i == 0 ? 0 : 1;
    }

    public dnh() {
        LogUtil.a("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController constructor");
        if (this.f32053c == null) {
            this.f32053c = vg.c(dxw.d());
        }
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController prepare");
        if (!(healthDevice instanceof efx) || iHealthDeviceCallback == null) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        MultiUsersManager.INSTANCE.getCurrentUserForUserInfo(new ResponseCallback() { // from class: dnl
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f32060b.a(countDownLatch, i, (dnj) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController prepare:", e.getMessage());
        }
        this.e = healthDevice;
        this.f32051a = iHealthDeviceCallback;
        this.f = etn.e((int) this.f);
        this.h = etn.a(this.h);
        this.f32052b = etn.d(this.f32052b);
        return true;
    }

    /* synthetic */ void a(CountDownLatch countDownLatch, int i, dnj dnjVar) {
        ReleaseLogUtil.d("PluginDevice_ChipSeaMeasureController", "MultiUsersManager.INSTANCE.getCurrentUser code:", Integer.valueOf(i));
        if (i == 0 && dnjVar != null) {
            this.f = dnjVar.e();
            this.h = dnjVar.d();
            this.f32052b = dnjVar.c();
        }
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        LogUtil.a("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController start");
        if (this.f32053c != null && !this.j && this.e != null) {
            this.f32053c.b(this.e.getAddress(), d(), null, this.d);
            this.j = true;
            enm.b(this.e.getAddress(), 1);
        }
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void ending() {
        LogUtil.a("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController ending");
        BIAWorker bIAWorker = this.f32053c;
        if (bIAWorker != null && !this.i && this.e != null) {
            bIAWorker.a();
            this.i = true;
            enm.b(this.e.getAddress(), 0);
        }
        cleanup();
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        LogUtil.a("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController cleanup");
        this.f32051a = null;
        this.f32053c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(0, d());
            return jSONArray;
        } catch (JSONException e) {
            LogUtil.e("PluginDevice_ChipSeaMeasureController", "getRoleInfos JSONException:", e.getMessage());
            return jSONArray;
        }
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", 1);
            jSONObject.put("height", this.f);
            jSONObject.put("sex", d(this.h));
            jSONObject.put("age", this.f32052b);
            jSONObject.put("weight", 0);
            LogUtil.a("PluginDevice_ChipSeaMeasureController", "ChipSeaMeasureController info:", Boolean.valueOf(this.f > 0.0f), Boolean.valueOf(this.h == 1), Boolean.valueOf(this.f32052b == 29));
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("PluginDevice_ChipSeaMeasureController", "getRoleInfo JSONException:", e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dso c(JSONObject jSONObject) {
        return c((WeightEntity) HiJsonUtil.d(jSONObject.toString(), WeightEntity.class));
    }

    private dso c(WeightEntity weightEntity) {
        long time;
        dso dsoVar = new dso();
        try {
            time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(weightEntity.getWeight_time()).getTime();
        } catch (ParseException unused) {
            LogUtil.e("PluginDevice_ChipSeaMeasureController", "Illegal time format:", weightEntity.getWeight_time());
            time = new Date().getTime();
        }
        dsoVar.setStartTime(time);
        dsoVar.setEndTime(time);
        dsoVar.setWeight(weightEntity.getWeight());
        dsoVar.setBodyFatRat((float) UnitUtil.d(weightEntity.getAxunge(), 1));
        dsoVar.d(weightEntity.getBmi());
        dsoVar.a(weightEntity.getViscera());
        dsoVar.b(weightEntity.getMetabolism());
        dsoVar.i(UnitUtil.d(weightEntity.getWater(), 1));
        dsoVar.c(UnitUtil.d(weightEntity.getBone(), 1));
        dsoVar.f(UnitUtil.d(HiCommonUtil.a(weightEntity.getWeight(), weightEntity.getAxunge(), (weightEntity.getWeight() * weightEntity.getWater()) / 100.0f, weightEntity.getBone()), 1));
        dsoVar.e(weightEntity.getBody_age());
        dsoVar.h(weightEntity.getHeart());
        dsoVar.d(false);
        dsoVar.c(true);
        return dsoVar;
    }
}
