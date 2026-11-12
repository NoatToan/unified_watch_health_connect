package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.request.ActivityIdInfo;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketing.request.RespActivityList;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.SearchResultFragment;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import defpackage.dlp;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.tal;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class ActivitySearchProvider extends BaseKnitDataProvider<List<SingleGridContent>> {
    private boolean d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26017c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, dlp> f26016b = new HashMap();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        b(context, (HashMap<String, Object>) map, (List<SingleGridContent>) obj);
    }

    public void b(Context context, HashMap<String, Object> map, List<SingleGridContent> list) {
        c(context, map, list);
    }

    private void c(Context context, HashMap<String, Object> map, List<SingleGridContent> list) {
        this.d = tal.d(this);
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_take_part_in_activities));
        if (this.d) {
            map.put("SHOWMORE", context.getString(com.huawei.ui.homehealth.R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, 204);
            map.put("ITEM_LIMIT", 3);
        }
        e(context, map, list);
        map.put("HIGHLIGHTED_TEXT", GlobalSearchActivity.b());
        d(context, map, list);
    }

    private void e(Context context, HashMap<String, Object> map, List<SingleGridContent> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null) {
                arrayList.add(1008);
                arrayList2.add(singleGridContent.getItemId());
                arrayList3.add(singleGridContent.getTheme());
                e(singleGridContent, arrayList4);
                arrayList7.add(singleGridContent.getPicture());
                b(singleGridContent, arrayList5, arrayList8);
                b(singleGridContent, arrayList6);
                a(singleGridContent, arrayList9);
            }
        }
        map.put("ITEM_VIEW_TYPE", arrayList);
        map.put("ITEM_BI_EVENT_MAP", tal.b(204, this.d ? 200 : 204, GlobalSearchActivity.b(), arrayList2, arrayList3));
        map.put("BI_OBSERVER_LABEL", gvi.b(this.d ? 200 : 204));
        map.put("ITEM_TITLE", arrayList3);
        map.put("ITEM_DESCRIPTION", arrayList4);
        map.put("ITEM_STATUS", arrayList5);
        map.put("ITEM_JOIN_NUMBER", arrayList6);
        map.put("ITEM_IMAGE", arrayList7);
        map.put("ITEM_STATUS_BACKGROUND", arrayList8);
        map.put("ITEM_PAGE_ATTRIBUTE", arrayList9);
    }

    private void e(SingleGridContent singleGridContent, List<String> list) {
        if (TextUtils.isEmpty(singleGridContent.getBeginDate()) || TextUtils.isEmpty(singleGridContent.getEndDate())) {
            list.add("");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Date date = simpleDateFormat.parse(singleGridContent.getBeginDate());
            Date date2 = simpleDateFormat.parse(singleGridContent.getEndDate());
            list.add(DateUtils.formatDateTime(BaseApplication.getContext(), date.getTime(), 24) + " - " + DateUtils.formatDateTime(BaseApplication.getContext(), date2.getTime(), 24));
        } catch (ParseException unused) {
            list.add("");
        }
    }

    private void b(SingleGridContent singleGridContent, List<String> list, List<Drawable> list2) {
        String string;
        Drawable drawable;
        OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            LogUtil.j("ActivitySearchProvider", "operationInteractorsApi = null");
            return;
        }
        Context context = BaseApplication.getContext();
        LogUtil.a("ActivitySearchProvider", "setItemActivityStatus currentTime:", this.f26017c, "--", singleGridContent.getBeginDate(), "--", singleGridContent.getEndDate(), "--", singleGridContent.getTheme(), "--id:", singleGridContent.getDynamicDataId());
        int activityStatus = operationInteractorsApi.getActivityStatus(this.f26017c, singleGridContent.getBeginDate(), singleGridContent.getEndDate());
        if (activityStatus == -1) {
            string = context.getResources().getString(R.string.IDS_activity_social_is_over);
            drawable = context.getResources().getDrawable(com.huawei.ui.homehealth.R.drawable.marketing_activity_status_gray);
        } else if (activityStatus == 0) {
            string = context.getResources().getString(R.string.IDS_activity_social_coming_soon);
            drawable = context.getResources().getDrawable(com.huawei.ui.homehealth.R.drawable.activity_search_status_bg);
        } else if (activityStatus == 1) {
            string = context.getResources().getString(R.string.IDS_hwh_home_group_underway);
            drawable = context.getResources().getDrawable(com.huawei.ui.homehealth.R.drawable.activity_search_status_bg);
        } else {
            string = "";
            drawable = null;
        }
        list.add(string);
        list2.add(drawable);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0064  */
    private void b(SingleGridContent singleGridContent, List<String> list) {
        String string;
        if (TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.ACTIVITY_TYPE) || TextUtils.equals(singleGridContent.getItemCategory(), SingleDailyMomentContent.ACTIVITY_TYPE)) {
            LogUtil.a("ActivitySearchProvider", "numOfPeople:", singleGridContent.getNumberOfPeople() + "--", singleGridContent.getTheme());
            int numberOfPeople = singleGridContent.getNumberOfPeople();
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId()) && numberOfPeople >= 0) {
                string = BaseApplication.getContext().getResources().getString(R.string.IDS_activity_social_people_attended, UnitUtil.e(numberOfPeople, 1, 0));
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        list.add(string);
    }

    private void a(SingleGridContent singleGridContent, List<String> list) {
        list.add(BaseApplication.getContext().getResources().getString(R.string.IDS_main_home_bottom_text_activity));
    }

    private void d(final Context context, Map<String, Object> map, final List<SingleGridContent> list) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.3
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
                SingleGridContent singleGridContent;
                if (qrs.r()) {
                    LogUtil.j("ActivitySearchProvider", "click too fast");
                    return;
                }
                if (njy.e(list, i) || (singleGridContent = (SingleGridContent) list.get(i)) == null) {
                    return;
                }
                String linkValue = singleGridContent.getLinkValue();
                if (TextUtils.isEmpty(linkValue)) {
                    ActivitySearchProvider.this.a(context, singleGridContent, true);
                    return;
                }
                LogUtil.a("ActivitySearchProvider", "activity deepLink: ", linkValue);
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi != null) {
                    gvi.d(context, GlobalSearchActivity.b(), 204, singleGridContent.getItemId(), singleGridContent.getTheme(), ActivitySearchProvider.this.d);
                    marketRouterApi.router(tal.e(linkValue));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final SingleGridContent singleGridContent, boolean z) {
        String itemId = singleGridContent.getItemId();
        String theme = singleGridContent.getTheme();
        if (z && this.f26016b.isEmpty()) {
            b(new UiCallback<Map<String, dlp>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("ActivitySearchProvider", "getActivities failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    qpx.e(BaseApplication.getContext(), com.huawei.ui.homehealth.R.string.IDS_hwh_edit_share_error);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<String, dlp> map) {
                    if (map != null) {
                        ActivitySearchProvider.this.f26016b = map;
                        ActivitySearchProvider.this.a(context, singleGridContent, false);
                    } else {
                        onFailure(1, "result data is null");
                    }
                }
            });
        } else {
            b(context, itemId, theme);
        }
    }

    private void b(final UiCallback<Map<String, dlp>> uiCallback) {
        if (uiCallback == null) {
            return;
        }
        final HashMap map = new HashMap();
        final OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
        if (operationInteractorsApi == null) {
            uiCallback.onFailure(1, "operationInteractorsApi is null");
        } else {
            operationInteractorsApi.getOperationList(BaseApplication.getContext(), -1, null, new HttpResCallback() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.5
                @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                public void onFinished(int i, String str) {
                    if (i != 200) {
                        uiCallback.onFailure(1, "response status code is not ok");
                        return;
                    }
                    try {
                        JSONArray jSONArray = new JSONObject(str).getJSONArray("activities");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            dlp dlpVarExpoundOperationActivity = operationInteractorsApi.expoundOperationActivity(jSONArray.getJSONObject(i2));
                            if (dlpVarExpoundOperationActivity != null) {
                                map.put(dlpVarExpoundOperationActivity.d(), dlpVarExpoundOperationActivity);
                            }
                        }
                        uiCallback.onSuccess(map);
                    } catch (JSONException unused) {
                        uiCallback.onFailure(1, "json data error");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.2
                @Override // java.lang.Runnable
                public void run() {
                    ActivitySearchProvider.this.b(context, sectionBean);
                }
            });
            return;
        }
        if (!VersionControlUtil.isSupportOperationAccount()) {
            sectionBean.c((Object) null);
            return;
        }
        if (this.f26016b.isEmpty()) {
            b(new UiCallback<Map<String, dlp>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("ActivitySearchProvider", "getActivities failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<String, dlp> map) {
                    if (map != null) {
                        ActivitySearchProvider.this.f26016b = map;
                    } else {
                        onFailure(1, "result data is null");
                    }
                }
            });
        }
        if (tal.d(this)) {
            a(sectionBean);
        } else {
            fyb.c(GlobalSearchActivity.b(), "activity", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.7
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("ActivitySearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    ActivitySearchProvider.this.a(sectionBean);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    for (GlobalSearchResult globalSearchResult : list) {
                        if (globalSearchResult != null && "activity".equals(globalSearchResult.getCategoryId()) && !njy.e(globalSearchResult.getContent())) {
                            List listE = ActivitySearchProvider.this.e(globalSearchResult.getContent());
                            if (!njy.e(listE)) {
                                sectionBean.c(listE);
                                return;
                            }
                        }
                    }
                    LogUtil.a("ActivitySearchProvider", "no activity found, show activities in the overall result");
                    ActivitySearchProvider.this.a(sectionBean);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SectionBean sectionBean) {
        LogUtil.a("ActivitySearchProvider", "loadActivityOverallData");
        SearchResultFragment searchResultFragmentE = SearchResultFragment.e();
        if (searchResultFragmentE == null) {
            sectionBean.c((Object) null);
            return;
        }
        List<GlobalSearchContent> listE = searchResultFragmentE.e(204);
        if (njy.e(listE)) {
            sectionBean.c((Object) null);
            return;
        }
        List<SingleGridContent> listE2 = e(listE);
        if (njy.e(listE2)) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(listE2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SingleGridContent> e(List<GlobalSearchContent> list) {
        int activityStatus;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (GlobalSearchContent globalSearchContent : list) {
            if (globalSearchContent != null && !TextUtils.isEmpty(globalSearchContent.getId())) {
                arrayList2.add(globalSearchContent.getId());
                map.put(globalSearchContent.getId(), globalSearchContent);
            }
        }
        RespActivityList respActivityListE = fyb.e(arrayList2);
        if (respActivityListE != null) {
            String currentTime = respActivityListE.getCurrentTime();
            List<ActivityIdInfo> pageActivityList = respActivityListE.getPageActivityList();
            if (TextUtils.isEmpty(currentTime) || njy.e(pageActivityList)) {
                LogUtil.a("ActivitySearchProvider", "current time or activity id info list is empty");
                return arrayList;
            }
            this.f26017c = currentTime;
            OperationInteractorsApi operationInteractorsApi = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
            if (operationInteractorsApi == null) {
                LogUtil.j("ActivitySearchProvider", "operationInteractorsApi = null");
                return arrayList;
            }
            HashMap map2 = new HashMap();
            ArrayList<ActivityIdInfo> arrayList3 = new ArrayList();
            for (ActivityIdInfo activityIdInfo : pageActivityList) {
                if (activityIdInfo != null && !TextUtils.isEmpty(activityIdInfo.getActivityId()) && (activityStatus = operationInteractorsApi.getActivityStatus(currentTime, activityIdInfo.getBeginDate(), activityIdInfo.getEndDate())) != -1) {
                    arrayList3.add(activityIdInfo);
                    map2.put(activityIdInfo.getActivityId(), Integer.valueOf(activityStatus));
                }
            }
            for (ActivityIdInfo activityIdInfo2 : arrayList3) {
                GlobalSearchContent globalSearchContent2 = (GlobalSearchContent) map.get(activityIdInfo2.getActivityId());
                if (globalSearchContent2 != null) {
                    arrayList.add(b(activityIdInfo2, globalSearchContent2));
                }
            }
        }
        return arrayList;
    }

    private void b(final Context context, final String str, final String str2) {
        GRSManager.c(context).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.homehealth.search.dataprovider.ActivitySearchProvider.9
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str3) {
                dlp dlpVar = (dlp) ActivitySearchProvider.this.f26016b.get(str);
                ActivityHtmlPathApi activityHtmlPathApi = (ActivityHtmlPathApi) Services.d("PluginOperation", ActivityHtmlPathApi.class);
                if (((OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class)) == null || activityHtmlPathApi == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder(str3);
                sb.append(activityHtmlPathApi.getActivityHtmlPath());
                sb.append("activityShare");
                if (dlpVar != null && dlpVar.q() == 5) {
                    sb.append("New");
                }
                sb.append(".html?activityId=");
                sb.append(str);
                String string = sb.toString();
                LogUtil.a("ActivitySearchProvider", "activityUrl: ", string);
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi != null) {
                    gvi.d(context, GlobalSearchActivity.b(), 204, str, str2, ActivitySearchProvider.this.d);
                    marketRouterApi.router(tal.e(string));
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("ActivitySearchProvider", "GRSManager onCallBackFail ACTIVITY_KEY resultCode = " + i);
            }
        });
    }

    private SingleGridContent b(ActivityIdInfo activityIdInfo, GlobalSearchContent globalSearchContent) {
        SingleGridContent singleGridContentBuild = new SingleGridContent.Builder().setTheme(globalSearchContent.getActivityName()).setThemeVisibility(true).setDescription(globalSearchContent.getDescription()).setDescriptionVisibility(true).setItemId(globalSearchContent.getId()).setDynamicDataId(globalSearchContent.getId()).setPicture(globalSearchContent.getPicUrl()).setLinkValue(globalSearchContent.getDeepLink()).setItemCategory(SingleDailyMomentContent.ACTIVITY_TYPE).build();
        singleGridContentBuild.setBeginDate(activityIdInfo.getBeginDate());
        singleGridContentBuild.setEndDate(activityIdInfo.getEndDate());
        singleGridContentBuild.setNumberOfPeople(activityIdInfo.getNumberOfPeople());
        return singleGridContentBuild;
    }
}
