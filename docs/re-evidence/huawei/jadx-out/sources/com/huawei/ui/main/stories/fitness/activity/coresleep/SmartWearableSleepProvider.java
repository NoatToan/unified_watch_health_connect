package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import defpackage.idy;
import defpackage.pjo;
import defpackage.qji;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SmartWearableSleepProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26867b;
    private SectionBean d;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.d = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        LogUtil.a("SmartWearableSleepProvider", "SharedPreference");
        if (Utils.o()) {
            LogUtil.a("SmartWearableSleepProvider", "isOversea");
            return false;
        }
        this.f26867b = context;
        return !"true".equals(SharedPreferenceManager.e(context, String.valueOf(PrebakedEffectId.RT_COIN_DROP), "IS_FIRST_ENTRY_SLEEP"));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("SmartWearableSleepProvider", "parseParams");
        if (map == null || context == null) {
            return;
        }
        this.f26867b = context;
        map.put("ICON_CANCEL", ContextCompat.getDrawable(context, R.drawable.ic_public_cancel_3));
        map.put("CARD_TITLE", context.getResources().getString(R.string.IDS_sleep_device_card_title));
        map.put("CARD_DESCRIPTION", context.getResources().getString(R.string.IDS_sleep_device_card_description));
        map.put("CARD_LEARN_MORE", context.getResources().getString(R.string.IDS_hw_pressure_learn_more));
        map.put("LEARN_MORE_COLOR", Integer.valueOf(R.color.sleep_subtab_item_text));
        map.put("CLOSE_BUTTON_SP_KEY", "IS_FIRST_ENTRY_SLEEP");
        map.put("LEARN_MORE_VISIBLE", 8);
        OnClickSectionListener onClickSectionListener = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SmartWearableSleepProvider.5
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

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SmartWearableSleepProvider", "click");
                HashMap map2 = new HashMap(16);
                map2.put("click", "1");
                map2.put("hasdate", "true");
                idy.b(AnalyticsValue.MANUALLY_MONITOR_SLEEP_21300044.value(), map2);
                if (view.getId() == R.id.section_root_view) {
                    pjo.b().c(SmartWearableSleepProvider.this.f26867b, "0");
                }
                if (view.getId() == R.id.sleep_device_card_learn_more) {
                    LogUtil.a("SmartWearableSleepProvider", "sleep no data device card is clicked!");
                    String url = GRSManager.c(SmartWearableSleepProvider.this.f26867b).getUrl("messageCenterUrl");
                    if (TextUtils.isEmpty(url)) {
                        LogUtil.j("SmartWearableSleepProvider", "onClick messageCenter is empty");
                        url = "https:/";
                    }
                    String str = url + "/messageH5/sleephtml/sleepDateGuide.html";
                    if (CommonUtil.cl()) {
                        str = url + "/recommendH5/sleephtml/sleepDateGuide.html";
                    }
                    SmartWearableSleepProvider.this.a(str);
                }
            }
        };
        Context context2 = this.f26867b;
        if (context2 instanceof BaseActivity) {
            map.put("CLICK_EVENT_LISTENER", qji.b(onClickSectionListener, (BaseActivity) context2, true, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Intent intent = new Intent(this.f26867b, (Class<?>) WebViewActivity.class);
        intent.putExtra("EXTRA_BI_SOURCE", "SLEEPDETAIL");
        intent.putExtra("EXTRA_BI_NAME", "sleep_service");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        intent.putExtra("url", str);
        intent.putExtra(Constants.IS_GUIDE, true);
        intent.setFlags(268435456);
        try {
            this.f26867b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SmartWearableSleepProvider", "ActivityNotFound" + e.getMessage());
        }
    }
}
