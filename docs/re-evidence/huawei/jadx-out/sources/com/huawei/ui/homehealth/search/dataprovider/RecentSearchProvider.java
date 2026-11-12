package com.huawei.ui.homehealth.search.dataprovider;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.main.R;
import defpackage.gvi;
import defpackage.njy;
import defpackage.tat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
public class RecentSearchProvider extends BaseKnitDataProvider<List<String>> {
    private Set<String> d = new HashSet();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<String> list) {
        c(context, map, list);
    }

    private void c(Context context, HashMap<String, Object> map, List<String> list) {
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_global_search_recent_search));
        if (njy.e(list)) {
            map.put("IS_LOAD_DEFAULT_VIEW", true);
        } else {
            for (String str : list) {
                if (!this.d.contains(str)) {
                    this.d.add(str);
                    gvi.e(context, str);
                }
            }
            map.put("ITEM_TITLE", list);
            map.put("ITEM_RIGHT_BTN", BaseApplication.getContext().getResources().getString(R.string.IDS_album_dialog_clear));
            map.put("IS_LOAD_DEFAULT_VIEW", false);
        }
        b(context, map);
    }

    private void b(final Context context, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.RecentSearchProvider.2
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("RIGHT_TOP_TEXT_CLICK_EVENT".equals(str)) {
                    RecentSearchProvider.this.c();
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                Activity activity = BaseApplication.getActivity();
                gvi.c(context, str);
                if (activity instanceof GlobalSearchActivity) {
                    ((GlobalSearchActivity) activity).b(str);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        List<String> listA = tat.a(BaseApplication.getContext());
        if (njy.e(listA)) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(listA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Activity activity = BaseApplication.getActivity();
        if (!c(activity)) {
            LogUtil.e("RecentSearchProvider", "activity is wrong or destroyed");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(R.string.IDS_clear_recent_search);
        builder.c(R.string.IDS_yes, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.RecentSearchProvider.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("RecentSearchProvider", "clear recent search confirmed");
                tat.e(BaseApplication.getActivity(), new ArrayList());
                Activity activity2 = BaseApplication.getActivity();
                if (RecentSearchProvider.this.c(activity2)) {
                    ((GlobalSearchActivity) activity2).e();
                }
            }
        });
        builder.a(R.string.IDS_no, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.RecentSearchProvider.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("RecentSearchProvider", "clear recent search canceled");
            }
        });
        builder.b(true);
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Activity activity) {
        return (!(activity instanceof GlobalSearchActivity) || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}
