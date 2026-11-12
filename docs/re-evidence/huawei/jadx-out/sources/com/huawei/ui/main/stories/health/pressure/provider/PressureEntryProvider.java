package com.huawei.ui.main.stories.health.pressure.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressure.activity.PressureMeasureActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.ftc;
import defpackage.idy;
import defpackage.mgg;
import defpackage.qji;
import defpackage.une;
import defpackage.unf;
import defpackage.vdo;
import health.compact.a.EnvironmentInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class PressureEntryProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SectionBean f28009a;
    private List<ftc> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f28010c = new AnonymousClass2();

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.pressure.provider.PressureEntryProvider$2, reason: invalid class name */
    public class AnonymousClass2 implements OnClickSectionListener {
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R.id.section_button_view1) {
                PressureEntryProvider.this.e();
                return;
            }
            final Activity activityJ = BaseApplication.j();
            if (view.getId() != R.id.section_button_view2 || activityJ == null) {
                return;
            }
            PressureEntryProvider.c(activityJ, new IBaseResponseCallback() { // from class: uyp
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.a(activityJ, i, obj);
                }
            }, null);
        }

        public /* synthetic */ void a(Activity activity, int i, Object obj) {
            PressureEntryProvider.this.e(1, AnalyticsValue.HEALTH_PRESSUER_ADJUST_CLICK_2160005);
            Intent intent = new Intent(activity, (Class<?>) PressureCalibrateActivity.class);
            intent.putExtra("pressure_is_have_datas", true);
            activity.startActivity(intent);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.f28009a = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return !EnvironmentInfo.m();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("SleepRecordEntryProvider", "parseParams");
        if (map == null || context == null) {
            return;
        }
        Activity activityB = vdo.b(context);
        if (!(activityB instanceof KnitPressureActivity)) {
            LogUtil.a("SleepRecordEntryProvider", "activity is null");
            return;
        }
        this.e.clear();
        View.OnClickListener onClickListenerB = qji.b(this.f28010c, (KnitPressureActivity) activityB, true, "");
        this.e.add(new ftc.b().b(R.drawable.section_entry_card_background).e(R.drawable.pressure_test).c(R.string.IDS_hw_pressure_measuremeant).c(onClickListenerB).b());
        this.e.add(new ftc.b().b(R.drawable.section_entry_card_background).e(R.drawable.anxiety_test).c(R.string.IDS_hw_pressure_adjust).c(onClickListenerB).b());
        map.put("SECTION_ENTRY_BUTTON_BEAN_LIST", this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("SleepRecordEntryProvider", "jumpToPressureMeasurement");
        e(b(), AnalyticsValue.HEALTH_PRESSUER_MEASUREMENT_CLICK_2160009);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("SleepRecordEntryProvider", "jumpToPressureMeasurement activity is null");
        } else {
            une.b(activityJ, new IBaseResponseCallback() { // from class: uyl
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.a(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void a(final int i, Object obj) {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.pressure.provider.PressureEntryProvider.5
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 == 0) {
                    PressureEntryProvider.this.c();
                } else if (i2 == 100001) {
                    PressureEntryProvider.this.a();
                } else {
                    LogUtil.a("SleepRecordEntryProvider", "errorCode = ", Integer.valueOf(i2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, AnalyticsValue analyticsValue) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("havedevice", Integer.valueOf(i));
        idy.b(analyticsValue.value(), map);
    }

    public static void c(Context context, IBaseResponseCallback iBaseResponseCallback, ServiceApiCallback<String> serviceApiCallback) {
        LogUtil.a("SleepRecordEntryProvider", "jumpToPressureAdjust");
        unf unfVar = new unf(context, true);
        if (unfVar.c()) {
            unfVar.e();
            return;
        }
        if (unfVar.b()) {
            LogUtil.d("SleepRecordEntryProvider", "isHaveWifiDevice() = ", Boolean.valueOf(unfVar.b()));
            unfVar.d();
        } else {
            une.c(context, iBaseResponseCallback);
            if (serviceApiCallback != null) {
                serviceApiCallback.onSuccess("success");
            }
        }
    }

    private int b() {
        DeviceInfo deviceInfoC = mgg.c("SleepRecordEntryProvider");
        return (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("SleepRecordEntryProvider", "jumpToPressureCalibrate activity is null");
        } else {
            une.a(activityJ, new IBaseResponseCallback() { // from class: uyk
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f50741c.e(activityJ, i, obj);
                }
            });
        }
    }

    public /* synthetic */ void e(Activity activity, int i, Object obj) {
        if (i != 0) {
            return;
        }
        LogUtil.a("SleepRecordEntryProvider", "user click adjust button");
        e(1, AnalyticsValue.HEALTH_PRESSUER_ADJUST_CLICK_2160005);
        Intent intent = new Intent(activity, (Class<?>) PressureCalibrateActivity.class);
        intent.putExtra("pressure_is_have_datas", true);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("SleepRecordEntryProvider", "jumpToPressureMeasure activity is null");
            return;
        }
        Intent intent = new Intent(activityJ, (Class<?>) PressureMeasureActivity.class);
        intent.putExtra("pressure_is_have_datas", true);
        activityJ.startActivity(intent);
    }
}
