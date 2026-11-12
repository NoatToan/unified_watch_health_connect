package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import defpackage.idy;
import defpackage.iov;
import defpackage.qji;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SmartWearablePressureProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28036a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionBean f28037c;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        this.f28037c = sectionBean;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        LogUtil.a("SmartWearablePressureProvider", "SharedPreference");
        this.f28036a = context;
        return !"true".equals(SharedPreferenceManager.e(context, String.valueOf(PrebakedEffectId.RT_COIN_DROP), "IS_CLOSED_SP_KEY"));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("SmartWearablePressureProvider", "parseParams");
        if (map == null || context == null) {
            return;
        }
        this.f28036a = context;
        if (!Utils.o()) {
            map.put("ICON_CANCEL", ContextCompat.getDrawable(context, R.drawable.ic_public_cancel_3));
        }
        map.put("CARD_TITLE", context.getResources().getString(R.string.IDS_pressure_device_card_title));
        map.put("CARD_DESCRIPTION", context.getResources().getString(R.string.IDS_health_no_data_pressure));
        map.put("CLOSE_BUTTON_SP_KEY", "IS_CLOSED_SP_KEY");
        if (Utils.o()) {
            return;
        }
        map.put("CARD_LEARN_MORE", context.getResources().getString(R.string.IDS_hw_pressure_learn_more));
        map.put("LEARN_MORE_COLOR", Integer.valueOf(R.color.pressure_subtab_item_text));
        OnClickSectionListener onClickSectionListener = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.pressure.provider.SmartWearablePressureProvider.2
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
                LogUtil.a("SmartWearablePressureProvider", "click");
                if (view.getId() == R.id.sleep_device_card_learn_more) {
                    LogUtil.a("SmartWearablePressureProvider", "sleep no data device card is clicked!");
                    SmartWearablePressureProvider.this.e(GRSManager.c(SmartWearablePressureProvider.this.f28036a).getUrl("messageCenterUrl") + "/messageH5/sleephtml/salesPromotion.html");
                }
            }
        };
        Context context2 = this.f28036a;
        if (context2 instanceof BaseActivity) {
            map.put("CLICK_EVENT_LISTENER", qji.b(onClickSectionListener, (BaseActivity) context2, true, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        HashMap map = new HashMap(1);
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_PRESSURE_DATA_ANALYSE_CLICK_2160016.value(), map);
        Intent intent = new Intent(this.f28036a, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        iov.d(this.f28036a, intent);
    }
}
