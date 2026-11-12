package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository;
import health.compact.a.DeviceUtil;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class uxb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vhi f50683b;
    private static final vhc d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile vhm f50684a;

    static {
        vhi vhiVar = new vhi(k.b.m, 36000L, 0);
        f50683b = vhiVar;
        d = new vhc(vhiVar);
    }

    private uxb() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: uwy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50681c.i();
                }
            });
        } else {
            a((vgp) null);
        }
    }

    /* synthetic */ void i() {
        a((vgp) null);
    }

    public static uxb c() {
        return c.f50687c;
    }

    private boolean d(vgp vgpVar) {
        if (vgpVar == null || !vgpVar.c() || vgpVar.d() == null) {
            LogUtil.j("WeightCardDataManager", "FastingLiteAppSetting is not legal");
            return false;
        }
        vhi vhiVarD = vgpVar.d().d();
        if (vhiVarD != null && vhiVarD.b() != 0 && vhiVarD.c() != 0) {
            return true;
        }
        LogUtil.j("WeightCardDataManager", "fastingLiteSetting is not legal");
        return false;
    }

    private void a(vgp vgpVar) {
        if (d(vgpVar)) {
            this.f50684a = new vhm(vgpVar.d());
        }
        if (this.f50684a == null) {
            d();
        }
        l();
    }

    public void g() {
        vhn.c("custom.weight_fasting_lite_current_task");
        vhn.c("custom.weight_fasting_lite_plan_task");
        vhn.c();
        if (this.f50684a != null && this.f50684a.p()) {
            this.f50684a.r();
            if (njy.e(this.f50684a.f())) {
                LogUtil.j("WeightCardDataManager", "fasting phase is empty");
                return;
            } else {
                FastingLiteRepository.saveFastingLiteRecord(new vhj(this.f50684a), new IBaseResponseCallback() { // from class: uwz
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        LogUtil.a("WeightCardDataManager", "save task record ", Integer.valueOf(i), " ", obj);
                    }
                });
                vhn.c(this.f50684a, new IBaseResponseCallback() { // from class: uwx
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        LogUtil.a("WeightCardDataManager", "saveFastingLitePhaseList errorCode= ", Integer.valueOf(i));
                    }
                });
                return;
            }
        }
        LogUtil.j("WeightCardDataManager", "stop task fail , mFastingLiteTask is null or not running");
    }

    public void a(List<vhj> list) {
        if (list == null) {
            LogUtil.j("WeightCardDataManager", "currentTask2Record records is null");
            return;
        }
        List<vhm.e> listF = this.f50684a.f();
        if (this.f50684a == null || !this.f50684a.p() || njy.e(listF)) {
            return;
        }
        vhj vhjVar = new vhj(this.f50684a);
        vhjVar.c(listF);
        vhjVar.e();
        list.add(0, vhjVar);
    }

    public void b(String str) {
        if (this.f50684a == null || !this.f50684a.p()) {
            return;
        }
        this.f50684a.e(str);
        FastingLiteRepository.saveCurrentTask(this.f50684a);
    }

    public boolean j() {
        return b(h());
    }

    public boolean b(uxf uxfVar) {
        CardConstants.CardType cardType;
        if (uxfVar == null) {
            return false;
        }
        if (uxfVar.e() != 0 && uxfVar.e() == uxfVar.a()) {
            LogUtil.j("WeightCardDataManager", "viewBean startTime = endTime");
            return false;
        }
        LogUtil.a("WeightCardDataManager", "refreshFastingLiteTask viewBean = ", uxfVar);
        if (uxfVar.d() == 2) {
            cardType = CardConstants.CardType.INTERMITTENT_PERIOD;
        } else {
            cardType = uxfVar.d() == 0 ? CardConstants.CardType.FASTING_CARD : CardConstants.CardType.DIET_CARD;
        }
        uxe uxeVar = new uxe(cardType, uxfVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("productProtoType", uxeVar);
        EventBus.a(new EventBus.d("weight_message_from_producer", bundle));
        return true;
    }

    public boolean b() {
        return this.f50684a != null && this.f50684a.s();
    }

    public vhm a() {
        return this.f50684a;
    }

    public boolean e() {
        if (this.f50684a == null) {
            return true;
        }
        return this.f50684a.k();
    }

    public void b(FastingLiteCbk<Object> fastingLiteCbk) {
        if (this.f50684a == null || !this.f50684a.p()) {
            LogUtil.j("WeightCardDataManager", "changeWindowWhenClicked task is null or not run", Boolean.valueOf(this.f50684a == null));
            return;
        }
        this.f50684a.t();
        j();
        if (DeviceUtil.b()) {
            vgx.d().b("changeWindow", null);
        }
        FastingLiteRepository.saveCurrentTask(this.f50684a, fastingLiteCbk);
    }

    public void c(long j) {
        if (this.f50684a == null || !this.f50684a.p()) {
            LogUtil.j("WeightCardDataManager", "changeWindowWhenClicked task is null or not run", Boolean.valueOf(this.f50684a == null));
            return;
        }
        this.f50684a.c(j);
        j();
        FastingLiteRepository.saveCurrentTask(this.f50684a);
        if (DeviceUtil.b()) {
            vgx.d().b("fromDialogSetting", null);
        }
    }

    public void e(vgp vgpVar) {
        if (vgpVar == null || this.f50684a == null) {
            return;
        }
        if (vgpVar.c() && !this.f50684a.p()) {
            LogUtil.a("WeightCardDataManager", "setting changed and start task");
            a(vgpVar);
            return;
        }
        if (!vgpVar.c() && this.f50684a.p()) {
            LogUtil.a("WeightCardDataManager", "setting changed and stop task");
            this.f50684a.u();
            g();
            return;
        }
        vhc vhcVarD = vgpVar.d();
        vhc vhcVarJ = this.f50684a.j();
        boolean z = false;
        if (vhcVarD == null || vhcVarJ == null) {
            LogUtil.j("WeightCardDataManager", "fasting lite mode is null ", Boolean.valueOf(vhcVarD == null));
            return;
        }
        if (vhcVarD.a() != vhcVarJ.a()) {
            LogUtil.a("WeightCardDataManager", "changed fasting lite mode ", Integer.valueOf(vhcVarD.a()));
            this.f50684a.u();
            vgp vgpVarB = vhn.b();
            vhm vhmVar = this.f50684a;
            if (vgpVarB != null && vgpVarB.c()) {
                z = true;
            }
            vhmVar.d(z);
            g();
            a(vgpVar);
            return;
        }
        d(vhcVarD.d(), vhcVarJ.d());
    }

    private void d(vhi vhiVar, vhi vhiVar2) {
        if (vhiVar == null || vhiVar2 == null) {
            LogUtil.j("WeightCardDataManager", "fasting lite setting is null ", Boolean.valueOf(vhiVar == null));
            return;
        }
        if (vhiVar.b() != vhiVar2.b() || vhiVar.c() != vhiVar2.c()) {
            this.f50684a.c(vhiVar.b(), vhiVar.c());
        }
        if (vhiVar.a() != vhiVar2.a()) {
            this.f50684a.b(vhiVar.a() * 1000);
        }
        if (vhiVar.g() != vhiVar2.g()) {
            this.f50684a.j().d().e(vhiVar.g());
        }
        if (!vhiVar.f().equals(vhiVar2.f())) {
            this.f50684a.j().d().b(vhiVar.f());
        }
        if (vhiVar.j() != vhiVar2.j()) {
            this.f50684a.j().d().c(vhiVar.j());
        }
        this.f50684a.u();
        if (this.f50684a.l()) {
            g();
        } else {
            this.f50684a.c();
            FastingLiteRepository.saveCurrentTask(this.f50684a);
        }
    }

    public uxf h() {
        if (this.f50684a == null) {
            LogUtil.j("WeightCardDataManager", "makeFastingLiteViewBean mFastingLiteTask = null");
            return null;
        }
        this.f50684a.u();
        if (this.f50684a.l()) {
            g();
            return null;
        }
        if (!this.f50684a.p()) {
            LogUtil.j("WeightCardDataManager", "makeFastingLiteViewBean mFastingLiteTask is not running");
            return null;
        }
        uxf uxfVar = new uxf();
        Resources resources = BaseApplication.getContext().getResources();
        String strC = c(resources, this.f50684a.j().a());
        if (!TextUtils.isEmpty(strC)) {
            uxfVar.a(strC);
        }
        String string = resources.getString(R.string.IDS_wl_food_f_b_interval);
        if (this.f50684a.k()) {
            LogUtil.a("WeightCardDataManager", "makeFastingLiteViewBean is intermittent period time");
            uxfVar.b(2);
            uxfVar.c(string);
            uxfVar.a(this.f50684a.e());
            return uxfVar;
        }
        String string2 = resources.getString(R.string.IDS_wl_food_f_window);
        String string3 = resources.getString(R.string.IDS_wl_food_diet_window);
        boolean zN = this.f50684a.n();
        uxfVar.b(zN ? 1 : 0);
        if (zN) {
            string2 = string3;
        }
        uxfVar.c(string2);
        uxfVar.c(this.f50684a.b());
        uxfVar.a(this.f50684a.e());
        uxfVar.e(this.f50684a.m());
        return uxfVar;
    }

    private String c(Resources resources, int i) {
        if (i == 0) {
            return resources.getString(R.string.IDS_light_fasting_start_mode, 14, 10);
        }
        if (i == 1) {
            return resources.getString(R.string.IDS_light_fasting_advanced_mode, 16, 8);
        }
        if (i == 2) {
            return resources.getString(R.string.IDS_light_fasting_high_mode, 18, 6);
        }
        if (i == 3) {
            return resources.getString(R.string.IDS_light_fasting_challenge_mode, 20, 4);
        }
        if (i == 4) {
            return resources.getString(R.string.IDS_light_fasting_custom_mode, Integer.valueOf(this.f50684a.g()), Integer.valueOf(this.f50684a.d()));
        }
        return "";
    }

    private void l() {
        if (this.f50684a == null) {
            vgp vgpVarB = vhn.b();
            if (d(vgpVarB)) {
                this.f50684a = new vhm(vgpVarB.d());
            }
        }
        if (this.f50684a != null) {
            if (this.f50684a.l()) {
                g();
                return;
            } else {
                FastingLiteRepository.saveCurrentTask(this.f50684a);
                return;
            }
        }
        LogUtil.j("WeightCardDataManager", "init default task , task is not running");
        this.f50684a = new vhm(d);
        this.f50684a.d(false);
    }

    public void d() {
        vhm vhmVar;
        HiUserPreference hiUserPreferenceF = f();
        if (hiUserPreferenceF == null) {
            LogUtil.j("WeightCardDataManager", "initTaskFromSharePreference hiUserPreference is null");
            return;
        }
        try {
            LogUtil.a("WeightCardDataManager", "initTaskFromSharePreference key ", hiUserPreferenceF.getKey(), " ", hiUserPreferenceF.getValue());
            vhmVar = (vhm) new Gson().fromJson(hiUserPreferenceF.getValue(), vhm.class);
        } catch (JsonSyntaxException | NumberFormatException unused) {
            LogUtil.e("WeightCardDataManager", "parse FastingLiteAppSetting from json fail");
            vhmVar = null;
        }
        if (vhmVar == null) {
            LogUtil.j("WeightCardDataManager", "initTaskFromSharePreference parse FastingLiteTask from json fail");
            return;
        }
        this.f50684a = vhmVar;
        k();
        this.f50684a.q();
    }

    private HiUserPreference f() {
        vgp vgpVarD = vhn.d("custom.weight_fasting_lite_setting");
        HiUserPreference userPreference = (vgpVarD == null || !vgpVarD.c()) ? null : HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_fasting_lite_current_task");
        if (userPreference != null && !TextUtils.isEmpty(userPreference.getValue())) {
            return userPreference;
        }
        HiUserPreference userPreference2 = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_fasting_lite_plan_task");
        if (userPreference2 != null && !TextUtils.isEmpty(userPreference2.getValue())) {
            return userPreference2;
        }
        LogUtil.j("WeightCardDataManager", "initTaskFromSharePreference get hiUserPreference is fail");
        return userPreference2;
    }

    private void k() {
        LogUtil.a("WeightCardDataManager", "parse fastingLiteWindows from database");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        vhn.e(this.f50684a, new FastingLiteCbk<List<vhm.e>>() { // from class: uxb.2
            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<vhm.e> list) {
                LogUtil.a("WeightCardDataManager", "readFastingLitePhase result: ", list);
                uxb.this.f50684a.b(list);
                countDownLatch.countDown();
            }

            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            public void onFailure(int i, String str) {
                LogUtil.e("WeightCardDataManager", "readFastingLitePhase onFailure, ", str);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("WeightCardDataManager", "interrupted while waiting for getWeightControlSetting data");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final uxb f50687c = new uxb();
    }
}
