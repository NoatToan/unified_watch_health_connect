package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.ActionSearchProvider;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.lsy;
import defpackage.njy;
import defpackage.tal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ActionSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    public static /* synthetic */ void b(int i, Object obj) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        d(context, map, list);
    }

    private void d(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        map.clear();
        boolean zD = tal.d(this);
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_action_lib));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, a.C);
            map.put("ITEM_LIMIT", 3);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (GlobalSearchContent globalSearchContent : list) {
            if (globalSearchContent != null) {
                LogUtil.a("ActionSearchProvider", "content: ", HiJsonUtil.d(globalSearchContent));
                arrayList.add(globalSearchContent.getId());
                arrayList3.add(globalSearchContent.getPicUrl());
                arrayList2.add(globalSearchContent.getLessonName());
                tal.c(globalSearchContent, (HashSet<String>) hashSet);
            }
        }
        map.put("ITEM_IMAGE", arrayList3);
        map.put("ITEM_TITLE", arrayList2);
        map.put("HIGHLIGHTED_TEXT", tal.a(hashSet));
        b(context, map, list, zD);
    }

    private void b(final Context context, Map<String, Object> map, final List<GlobalSearchContent> list, final boolean z) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActionSearchProvider.4
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
                GlobalSearchContent globalSearchContent;
                if (njy.e(list, i) || (globalSearchContent = (GlobalSearchContent) list.get(i)) == null) {
                    return;
                }
                ActionSearchProvider.this.b(context, globalSearchContent, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, GlobalSearchContent globalSearchContent, boolean z) {
        if (TextUtils.isEmpty(globalSearchContent.getId())) {
            LogUtil.e("ActionSearchProvider", "jumpToActionLibraryDetail course id is null");
            return;
        }
        if (LoginInit.getInstance(context).isBrowseMode()) {
            if (LoginInit.getInstance(context).isBrowseMode()) {
                LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: taa
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        ActionSearchProvider.b(i, obj);
                    }
                }, "");
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("action_id", globalSearchContent.getId());
            bundle.putString("action_version", globalSearchContent.getVersion());
            AppRouter.c("/PluginFitnessAdvice/FitnessActionDetailActivity").d(bundle).b(context);
            LogUtil.a("ActionSearchProvider", "jumpToActionLibraryDetail id: ", globalSearchContent.getId());
            gvi.d(context, GlobalSearchActivity.b(), a.C, globalSearchContent.getId(), globalSearchContent.getLessonName(), z);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void e(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: szz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48849b.e(context, sectionBean);
                }
            });
        } else if (tal.d(this)) {
            tal.e(context, sectionBean, a.C);
        } else {
            fyb.c(GlobalSearchActivity.b(), "actionlibrary", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActionSearchProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("ActionSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, a.C);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    tal.c(list, sectionBean, context, "actionlibrary", a.C);
                }
            });
        }
    }
}
