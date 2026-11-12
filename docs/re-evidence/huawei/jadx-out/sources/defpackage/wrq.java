package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wrq extends wrc {
    private volatile int h;

    public wrq(Context context, PersonalCenterUiApi personalCenterUiApi) {
        super(context, personalCenterUiApi);
        this.h = 0;
    }

    @Override // defpackage.wrc, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "MyGroupCardData";
    }

    @Override // defpackage.wrc
    protected void a() {
        if (this.f52359a != null) {
            return;
        }
        this.f52359a = new wre();
        this.f52359a.a(5);
        this.f52359a.b(R.mipmap.img_me_teams);
        this.f52359a.d(R.string.IDS_hwh_home_health_group);
        this.f52359a.a(this.f52360b.getString(R.string.IDS_hwh_group_create));
        this.f52359a.c(false);
        this.f52359a.a(qji.b(new View.OnClickListener() { // from class: wrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        }, (BaseActivity) this.f52360b, true, AnalyticsValue.Group_1070010.value()));
    }

    /* synthetic */ void b(View view) {
        if (qrs.e(view)) {
            LogUtil.a("MyGroupCardData", "click too fast");
            return;
        }
        if (CommonUtil.ca()) {
            AppRouter.c("/PluginChat/1.0/GroupStoreDemo/HealthGroupListActivity").b(this.f52360b);
            return;
        }
        f();
        HashMap map = new HashMap(1);
        map.put("click", "1");
        lmf.d().c(this.f52360b, AnalyticsValue.Group_1070010.value(), map, 0);
    }

    private void f() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, "Group_0001");
        ddv.b().loadH5ProApp(this.f52360b, "com.huawei.health.h5.groups", builder);
    }

    @Override // defpackage.wrc
    protected void d() {
        super.d();
        if (this.d) {
            this.f52359a.a(this.f52360b.getString(R.string.IDS_hwh_group_create));
            if (this.j != null) {
                this.j.a(this.f52359a);
                return;
            }
            return;
        }
        lsy.a(new Runnable() { // from class: wrw
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<wrq> f52380a;
        private CountDownLatch e;

        b(wrq wrqVar, CountDownLatch countDownLatch) {
            this.f52380a = new WeakReference<>(wrqVar);
            this.e = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            wrq wrqVar = this.f52380a.get();
            if (i != 0 || wrqVar == null) {
                LogUtil.a("MyGroupCardData", "errorCode is ", Integer.valueOf(i));
                this.e.countDown();
            } else if (!(obj instanceof JSONObject)) {
                LogUtil.a("MyGroupCardData", "UserGrpNotifyList is ", obj);
                this.e.countDown();
            } else {
                LogUtil.a("MyGroupCardData", "notify list is : ", obj.toString());
                wrqVar.b(((wrz) HiJsonUtil.d(((JSONObject) obj).toString(), wrz.class)).c());
                this.e.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        synchronized (this) {
            this.h += i;
        }
    }

    private void j() {
        if (this.h > 0) {
            if (this.f52359a.n()) {
                this.h = 0;
                return;
            }
            HandlerExecutor.b(new Runnable() { // from class: wrs
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
        } else {
            if (!this.f52359a.n()) {
                this.h = 0;
                return;
            }
            HandlerExecutor.b(new Runnable() { // from class: wru
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52384c.e();
                }
            });
        }
        this.h = 0;
    }

    /* synthetic */ void b() {
        if (this.f52359a == null || this.j == null || this.e == null) {
            LogUtil.e("MyGroupCardData", "view holder is null ");
            return;
        }
        this.f52359a.c(true);
        this.j.a(this.f52359a.n());
        this.e.setBottomRedDotVisibility(HealthData.TIMELINE);
    }

    /* synthetic */ void e() {
        if (this.f52359a == null || this.j == null || this.e == null) {
            LogUtil.e("MyGroupCardData", "view holder is null ");
            return;
        }
        this.f52359a.c(false);
        this.j.a(this.f52359a.n());
        this.e.cancelBottomRedDotVisible(HealthData.TIMELINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        FamilyHealthZoneApi familyHealthZoneApi = (FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class);
        if (familyHealthZoneApi == null) {
            LogUtil.j("MyGroupCardData", "healthZoneApi is null");
            return;
        }
        familyHealthZoneApi.getUserGrpList(new IBaseResponseCallback() { // from class: wrr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f52381b.a(i, obj);
            }
        });
        CountDownLatch countDownLatch = new CountDownLatch(2);
        familyHealthZoneApi.getUserGrpNotifyList(new b(this, countDownLatch), 1);
        familyHealthZoneApi.getUserGrpNotifyList(new b(this, countDownLatch), 2);
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            j();
        } catch (InterruptedException unused) {
            LogUtil.e("MyGroupCardData", "InterruptedException");
            this.h = 0;
        }
    }

    /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("MyGroupCardData", "getGroupDatas  success ");
            if (obj instanceof JSONObject) {
                b((wry) HiJsonUtil.d(((JSONObject) obj).toString(), wry.class));
                return;
            }
            return;
        }
        LogUtil.j("MyGroupCardData", "getGroupDatas failed, errorCode:", Integer.valueOf(i));
    }

    private void b(wry wryVar) {
        if (wryVar.getResultCode().intValue() == 0) {
            final int iC = wryVar.c();
            LogUtil.a("MyGroupCardData", "getGroupDatas  count = ", Integer.valueOf(iC));
            HandlerExecutor.b(new Runnable() { // from class: wrt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52383b.e(iC);
                }
            });
        }
    }

    /* synthetic */ void e(int i) {
        if (this.j == null) {
            LogUtil.j("MyGroupCardData", "mViewHolder is null");
            return;
        }
        String string = this.f52360b.getString(R.string.IDS_hwh_group_create);
        if (i > 0) {
            string = qre.e(R.plurals.IDS_me_group_count, i, UnitUtil.e(i, 1, 0));
        }
        if (string.equals(this.f52359a.b())) {
            return;
        }
        this.f52359a.a(string);
        this.j.a(this.f52359a);
    }
}
