package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.ReliefMusicSearchProvider;
import defpackage.btx;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.gzx;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.tal;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ReliefMusicSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    public static /* synthetic */ void d(int i, Object obj) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        d(context, map, list);
    }

    private void d(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        map.clear();
        boolean zD = tal.d(this);
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_decompression));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, a.z);
            map.put("ITEM_LIMIT", 3);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<GlobalSearchContent> it = list.iterator();
        while (it.hasNext()) {
            GlobalSearchContent next = it.next();
            if (next != null) {
                Iterator<GlobalSearchContent> it2 = it;
                LogUtil.b("ReliefMusicSearchProvider", "content: ", HiJsonUtil.d(next));
                arrayList4.add(b(next));
                arrayList.add(next.getId());
                arrayList7.add(next.getPicUrl());
                arrayList8.add(qqf.a(qre.c(R.drawable.ic_device_earphone)));
                arrayList2.add(next.getLessonName());
                arrayList3.add(next.getCommodityFlag() == 2 ? context.getString(R.string.IDS_vip) : "");
                tal.c(next, (HashSet<String>) hashSet);
                tal.b(next, arrayList6, arrayList5, hashSet);
                it = it2;
            }
        }
        map.put("ITEM_IMAGE", arrayList7);
        map.put("ITEM_TITLE", arrayList2);
        map.put("ITEM_SUBTITLE", arrayList4);
        map.put("ITEM_TAG", arrayList3);
        map.put("HIGHLIGHTED_TEXT", tal.a(hashSet));
        map.put("ITEM_DESCRIPTION", arrayList5);
        map.put("ITEM_PAGE_ATTRIBUTE", arrayList6);
        map.put("RIGHT_ICON_IMAGE", arrayList8);
        c(context, map, list, zD);
    }

    private String b(GlobalSearchContent globalSearchContent) {
        String str;
        LogUtil.b("ReliefMusicSearchProvider", "getReliefMusicSubTitle join：", Long.valueOf(globalSearchContent.getHeatCount()), " duration: ", Integer.valueOf(globalSearchContent.getDuration()));
        StringBuilder sb = new StringBuilder();
        sb.append(tal.b(globalSearchContent, false));
        if (globalSearchContent.getAudioType() == 1) {
            str = HealthZonePushReceiver.SLEEP_SCORE_NOTIFY;
        } else if (globalSearchContent.getDuration() / 60 > 0) {
            str = (globalSearchContent.getDuration() / 60) + "";
        } else {
            return sb.toString();
        }
        sb.append(gzx.c(btx.c(), R.string.sug_fitness_min, str));
        return sb.toString();
    }

    private void c(final Context context, Map<String, Object> map, final List<GlobalSearchContent> list, final boolean z) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.ReliefMusicSearchProvider.2
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
                if (njy.e(list, i)) {
                    return;
                }
                GlobalSearchContent globalSearchContent = (GlobalSearchContent) list.get(i);
                if (globalSearchContent == null || TextUtils.isEmpty(globalSearchContent.getId())) {
                    LogUtil.d("ReliefMusicSearchProvider", "jumpToReliefMusicDetail course id is null");
                    return;
                }
                ReliefMusicSearchProvider.this.d(context, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&type=sleepAudio&statusBarTextBlack&isImmerse&pullfrom=globalsearch&id=" + globalSearchContent.getId());
                gvi.d(context, GlobalSearchActivity.b(), a.z, globalSearchContent.getId(), globalSearchContent.getLessonName(), z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, String str) {
        if (LoginInit.getInstance(context).isBrowseMode()) {
            LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: tao
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ReliefMusicSearchProvider.d(i, obj);
                }
            }, "");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.d("ReliefMusicSearchProvider", "jumpToH5Detail marketRouterApi == null");
        } else {
            marketRouterApi.router(str);
            LogUtil.b("ReliefMusicSearchProvider", "jumpToH5Detail url: ", str);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void b(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: tag
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48859c.b(context, sectionBean);
                }
            });
        } else if (tal.d(this)) {
            tal.e(context, sectionBean, a.z);
        } else {
            fyb.c(GlobalSearchActivity.b(), "stressreliefmusic", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.ReliefMusicSearchProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.b("ReliefMusicSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, a.z);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    tal.c(list, sectionBean, context, "stressreliefmusic", a.z);
                }
            });
        }
    }
}
