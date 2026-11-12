package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodPressureActivity;
import com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureButtonProvider;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.dfi;
import defpackage.dfr;
import defpackage.iov;
import defpackage.vbw;
import defpackage.vcb;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureButtonProvider extends BaseKnitDataProvider {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return false;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        LogUtil.a("BloodPressureButtonProvider", "loadData");
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("BloodPressureButtonProvider", "loadDefaultData");
        super.loadDefaultData(sectionBean);
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        map.put("LEFT_BUTTON_TEXT", context.getString(R.string.IDS_blood_pressure_manual_input));
        map.put("RIGHT_BUTTON_TEXT", context.getString(R.string.IDS_blood_pressure_measure));
        map.put("LEFT_BUTTON_IMAGE", Integer.valueOf(R.drawable.manual_input));
        map.put("RIGHT_BUTTON_IMAGE", Integer.valueOf(R.drawable.blood_pressure_measure));
        if (BloodPressureUtil.c()) {
            map.put("RIGHT_BUTTON_VISIBILITY", 8);
        }
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureButtonProvider.1
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (i == 1) {
                    BloodPressureButtonProvider.c(i);
                    vbw.a(1);
                } else if (i == 2) {
                    BloodPressureButtonProvider.c(i);
                    vbw.a(2);
                } else {
                    LogUtil.a("BloodPressureButtonProvider", "onClick, position is: " + i);
                }
            }
        });
    }

    public static void c(final int i) {
        LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: utn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                BloodPressureButtonProvider.e(i, i2, obj);
            }
        }, "");
    }

    public static /* synthetic */ void e(int i, int i2, Object obj) {
        if (i2 != 0) {
            LogUtil.a("BloodPressureButtonProvider", "browsingToLogin errorCode is not success", Integer.valueOf(i2));
        } else if (i == 1) {
            d();
        } else {
            vcb.b();
        }
    }

    private static void d() {
        LogUtil.a("BloodPressureButtonProvider", "onClick, startInput");
        if (dfr.b()) {
            dfi dfiVar = new dfi();
            dfiVar.a(true);
            dfr.c(BaseApplication.b(), dfiVar);
        } else {
            Intent intent = new Intent(BaseApplication.b(), (Class<?>) InputBloodPressureActivity.class);
            intent.putExtra("isShowInput", true);
            iov.d(BaseApplication.b(), intent);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "BloodPressureButtonProvider";
    }
}
