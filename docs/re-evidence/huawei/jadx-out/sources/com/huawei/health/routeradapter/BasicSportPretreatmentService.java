package com.huawei.health.routeradapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.AthleticAbilityEmptyActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.RqNoNetworkActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.StateIndexActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.up.model.UserInfomation;
import defpackage.ieg;
import defpackage.iov;
import defpackage.jcg;
import defpackage.jyd;
import defpackage.uwf;
import defpackage.wka;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class BasicSportPretreatmentService implements PretreatmentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8695c;
    private RunningStateIndexData d;
    String e;
    private boolean f;
    private boolean g;
    private uwf h;
    private boolean i;
    private int j;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        byte b2;
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.a("BasicSportPretreatmentService", "uri is null");
            return false;
        }
        String queryParameter = uriO.getQueryParameter("type");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        queryParameter.hashCode();
        switch (queryParameter) {
            case "runningData":
                b2 = 0;
                break;
            case "vo2Max":
                b2 = 1;
                break;
            case "stateIndex":
                b2 = 2;
                break;
            case "scorePrediction":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            e();
        } else if (b2 == 1) {
            b();
        } else if (b2 == 2) {
            c();
        } else if (b2 != 3) {
            LogUtil.a("BasicSportPretreatmentService", "invalid type", queryParameter);
        } else {
            d();
        }
        return false;
    }

    private void d() {
        AppRouter.c("/Main/AchievementPredictionActivity").b(this.f8694b);
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        this.h = uwf.d();
        this.f8694b = context;
    }

    private void e() {
        if (d(this.f8694b.getString(R.string.IDS_data_running_index_title_outside))) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        this.h.c(new IBaseResponseCallback() { // from class: gux
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f36069a.e(countDownLatch, i, obj);
            }
        });
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        new jyd().c(this.f8694b, iB, iB, 0, new IBaseResponseCallback() { // from class: guy
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.a(countDownLatch, i, obj);
            }
        });
        try {
            boolean zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
            Intent intent = new Intent(this.f8694b, (Class<?>) RunningDataActivity.class);
            if (!zAwait) {
                intent.setClass(this.f8694b, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "running_no_record");
            }
            if (this.g) {
                intent.setClass(this.f8694b, RunningDataActivity.class);
                intent.putExtra("running_level_data", this.d);
                intent.putExtra("vo2max_value", this.j);
            } else {
                intent.setClass(this.f8694b, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "running_no_record");
            }
            iov.d(this.f8694b, intent);
        } catch (InterruptedException unused) {
            LogUtil.a("BasicSportPretreatmentService", "startRunningDataActivity InterruptedException");
        }
    }

    public /* synthetic */ void e(CountDownLatch countDownLatch, int i, Object obj) {
        b((Vo2maxDetail) obj);
        countDownLatch.countDown();
    }

    public /* synthetic */ void a(CountDownLatch countDownLatch, int i, Object obj) {
        if (i == 200 && (obj instanceof GetRunLevelRsp)) {
            GetRunLevelRsp getRunLevelRsp = (GetRunLevelRsp) obj;
            d(getRunLevelRsp.getUserRunLevelData());
            e(getRunLevelRsp);
        } else {
            this.g = false;
        }
        this.f8695c = i;
        countDownLatch.countDown();
    }

    private void b(Vo2maxDetail vo2maxDetail) {
        if (vo2maxDetail != null) {
            this.i = true;
            this.j = vo2maxDetail.getVo2maxValue();
            this.f8693a = vo2maxDetail.getTimestamp();
            return;
        }
        this.i = false;
    }

    private void e(GetRunLevelRsp getRunLevelRsp) {
        this.d = wka.c(getRunLevelRsp);
    }

    private void d(UserRunLevelData userRunLevelData) {
        boolean z = false;
        if (userRunLevelData == null) {
            this.g = false;
            return;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        if (userInfo.getGender() == 0) {
            this.e = wka.i(userRunLevelData.getLastCurrentRunLevel());
        } else {
            this.e = wka.b(userRunLevelData.getLastCurrentRunLevel());
        }
        if (!"--".equals(this.e) && userRunLevelData.getLastCurrentRunLevel() != 0.0f) {
            z = true;
        }
        this.g = z;
    }

    private boolean d(String str) {
        if (jcg.c(this.f8694b) && this.f8695c != 2) {
            return false;
        }
        Intent intent = new Intent(this.f8694b, (Class<?>) RqNoNetworkActivity.class);
        intent.putExtra("title_name", str);
        iov.d(this.f8694b, intent);
        return true;
    }

    private void b() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.h.c(new IBaseResponseCallback() { // from class: gva
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.c(countDownLatch, i, obj);
            }
        });
        try {
            boolean zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
            Intent intent = new Intent();
            if (!zAwait) {
                intent.setClass(this.f8694b, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "vo_to_max_no_record");
                iov.d(this.f8694b, intent);
                return;
            }
            if (this.i) {
                intent.setClass(this.f8694b, Vo2maxActivity.class);
                int i = this.j;
                if (i != 0) {
                    intent.putExtra("vo2max_value", i);
                    intent.putExtra("running_level_data", this.d);
                    intent.putExtra("vo2max_time", this.f8693a);
                }
            } else {
                intent.setClass(this.f8694b, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "vo_to_max_no_record");
            }
            iov.d(this.f8694b, intent);
        } catch (InterruptedException unused) {
            LogUtil.a("BasicSportPretreatmentService", "startVo2maxActivity InterruptedException");
        }
    }

    public /* synthetic */ void c(CountDownLatch countDownLatch, int i, Object obj) {
        b((Vo2maxDetail) obj);
        countDownLatch.countDown();
    }

    private void c() {
        if (d(this.f8694b.getString(R.string.IDS_data_state_index_title))) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        new jyd().c(this.f8694b, iB, iB, 0, new IBaseResponseCallback() { // from class: gve
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f36076b.d(countDownLatch, i, obj);
            }
        });
        try {
            boolean zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
            Intent intent = new Intent();
            if (!zAwait) {
                intent.setClass(this.f8694b, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "state_no_record");
            }
            if (this.f) {
                intent.setClass(this.f8694b, StateIndexActivity.class);
                intent.putExtra("state_index_level_data", this.d);
            } else {
                intent.setClass(this.f8694b, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "state_no_record");
            }
            iov.d(this.f8694b, intent);
        } catch (InterruptedException unused) {
            LogUtil.a("BasicSportPretreatmentService", "startRunningDataActivity InterruptedException");
        }
    }

    public /* synthetic */ void d(CountDownLatch countDownLatch, int i, Object obj) {
        boolean z = false;
        if (i == 200 && (obj instanceof GetRunLevelRsp)) {
            GetRunLevelRsp getRunLevelRsp = (GetRunLevelRsp) obj;
            UserRunLevelData userRunLevelData = getRunLevelRsp.getUserRunLevelData();
            e(getRunLevelRsp);
            if (userRunLevelData != null && userRunLevelData.getLastCurrentRunLevel() > 0.0f) {
                z = true;
            }
            this.f = z;
        } else {
            this.f = false;
        }
        this.f8695c = i;
        countDownLatch.countDown();
    }
}
