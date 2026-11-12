package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.R;
import defpackage.gxq;
import defpackage.qqs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SleepTabSwitchProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26860a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26861c;
    private boolean d = false;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepTabSwitchProvider", "parseParams");
        if (gxqVar == null) {
            return;
        }
        d(context, map, gxqVar);
    }

    private void d(Context context, HashMap<String, Object> map, gxq gxqVar) {
        boolean zBooleanValue = (gxqVar.m().containsKey("OPEN_STATUS") && (gxqVar.m().get("OPEN_STATUS") instanceof Boolean)) ? ((Boolean) gxqVar.m().get("OPEN_STATUS")).booleanValue() : false;
        LogUtil.a("SleepTabSwitchProvider", "getTimePeriodType: ", gxqVar.d());
        map.put("LEFT_ICON_TEXT", context.getString(R.string.IDS_sleep_analysis_suggestions));
        map.put("RIGHT_ICON_TEXT", context.getString(R.string.IDS_clear_sleep_music_data_cache_new));
        map.put("ITEM_TAG", zBooleanValue ? ContextCompat.getDrawable(BaseApplication.b(), R.drawable.ic_vip_logo_color) : null);
        map.put("ITEM_RIGHT_BTN", Integer.valueOf(e(zBooleanValue, gxqVar)));
        map.put("RIGHT_ICON_IMAGE", e(zBooleanValue));
        map.put("ITEM_STATUS_BACKGROUND", c(zBooleanValue));
        this.d = zBooleanValue;
    }

    private List<Integer> e(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(Integer.valueOf(R.drawable.sleep_music_icon_gif));
            arrayList.add(Integer.valueOf(R.drawable.sleep_music_icon_white));
            return arrayList;
        }
        arrayList.add(Integer.valueOf(R.drawable.sleep_music_icon_gif));
        arrayList.add(Integer.valueOf(qqs.e(BaseApplication.b()) ? R.drawable.sleep_music_icon_white : R.drawable.sleep_music_icon));
        return arrayList;
    }

    private List<Integer> c(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(Integer.valueOf(R.color.sleep_with_sleep_manager_on_tab_background_color));
            arrayList.add(Integer.valueOf(R.color.color_ffffffff));
            return arrayList;
        }
        arrayList.add(Integer.valueOf(R.color.sleep_tab_background_color));
        arrayList.add(Integer.valueOf(R.color.sleep_tab_title_selected_color));
        return arrayList;
    }

    private int e(boolean z, gxq gxqVar) {
        if (!this.f26860a) {
            this.f26860a = true;
            if (gxqVar != null && gxqVar.f() != 0) {
                this.f26861c = gxqVar.f();
            }
            return d(z, gxqVar);
        }
        return c(z, gxqVar);
    }

    private int d(boolean z, gxq gxqVar) {
        LogUtil.a("SleepTabSwitchProvider", "hasData: ", gxqVar == null ? Constants.NULL : Boolean.valueOf(gxqVar.r()), ", currentOpenState: ", Boolean.valueOf(z));
        return 1;
    }

    private int c(boolean z, gxq gxqVar) {
        boolean z2 = this.d;
        boolean z3 = z2 != z;
        LogUtil.a("SleepTabSwitchProvider", "mLastIsOpenSleepManagement: ", Boolean.valueOf(z2), ", currentOpenState: ", Boolean.valueOf(z), ", hasData: ", gxqVar == null ? Constants.NULL : Boolean.valueOf(gxqVar.r()));
        if (z3) {
            return a(z, gxqVar);
        }
        return b(z, gxqVar);
    }

    private int a(boolean z, gxq gxqVar) {
        boolean z2 = gxqVar != null && gxqVar.r();
        LogUtil.a("SleepTabSwitchProvider", "currentOpenState: ", Boolean.valueOf(z), ", hasData: ", Boolean.valueOf(z2));
        return (z || z2) ? 1 : 2;
    }

    private int b(boolean z, gxq gxqVar) {
        if (gxqVar == null || gxqVar.f() == 0) {
            LogUtil.a("SleepTabSwitchProvider", "sleepData is null");
            return 3;
        }
        if (gxqVar.f() == this.f26861c) {
            LogUtil.a("SleepTabSwitchProvider", "same day");
            return 3;
        }
        this.f26861c = gxqVar.f();
        return a(z, gxqVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        this.f26860a = false;
    }
}
