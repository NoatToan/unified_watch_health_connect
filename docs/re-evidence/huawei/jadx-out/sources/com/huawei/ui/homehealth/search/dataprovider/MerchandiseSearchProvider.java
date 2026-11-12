package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import defpackage.fyb;
import defpackage.lsy;
import defpackage.njy;
import defpackage.tal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class MerchandiseSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        b(context, (HashMap<String, Object>) map, (List<GlobalSearchContent>) obj);
    }

    public void b(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        e(context, map, list);
    }

    private void e(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        if (njy.e(list)) {
            return;
        }
        if (tal.d(this)) {
            map.put("SHOWMORE", context.getString(R.string.IDS_user_profile_more));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, 205);
            map.put("ITEM_LIMIT", 3);
        }
        map.put("TITLE", context.getResources().getString(R.string.IDS_attribute_merchandise));
        map.put("SEARCH_CONTENT", list);
        b(context, (Map<String, Object>) map, list);
    }

    private void b(final Context context, Map<String, Object> map, final List<GlobalSearchContent> list) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.MerchandiseSearchProvider.1
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
                tal.e(list, i, true, context, true);
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.search.dataprovider.MerchandiseSearchProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    MerchandiseSearchProvider.this.loadData(context, sectionBean);
                }
            });
            return;
        }
        if (!VersionControlUtil.isSupportOperationAccount()) {
            sectionBean.c((Object) null);
        }
        if (tal.d(this)) {
            tal.e(context, sectionBean, 205);
        } else {
            fyb.c(GlobalSearchActivity.b(), "vmall", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.MerchandiseSearchProvider.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("MerchandiseSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, 205);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    tal.c(list, sectionBean, context, "vmall", 205);
                }
            });
        }
    }
}
