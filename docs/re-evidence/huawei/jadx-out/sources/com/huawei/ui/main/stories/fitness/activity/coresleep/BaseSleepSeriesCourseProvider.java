package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.model.SleepSeriesCourseBean;
import defpackage.lsx;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public abstract class BaseSleepSeriesCourseProvider extends BaseKnitDataProvider<List<SleepSeriesCourseTopic>> implements SleepSeriesCourseTopic.RequestListener {
    private static final String PAGE_TYPE = "pageType";
    private static final String TAG = "BaseSleepSeriesCourseProvider";
    private SectionBean mSectionBean;
    private SleepSeriesCourseTopic mSleepSeriesCourseTopic;
    private final List<SleepSeriesCourseTopic> mSleepSeriesCourseTopicList = new ArrayList();
    private String mSubHeaderTitle;

    protected abstract int getPageType();

    protected abstract int getPositionId();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (List<SleepSeriesCourseTopic>) obj);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepSeriesCourseTopic.RequestListener
    public void onRequestDone(SleepSeriesCourseTopic sleepSeriesCourseTopic) {
        SectionBean sectionBean = this.mSectionBean;
        if (sectionBean != null) {
            sectionBean.c(this.mSleepSeriesCourseTopicList);
        }
    }

    public void parseParams(Context context, HashMap<String, Object> map, List<SleepSeriesCourseTopic> list) {
        setData(context, map, list);
    }

    private void getSubHeaderTitle(SectionBean sectionBean) {
        ResourceBriefInfo resourceBriefInfoN;
        ResourceContentBase content;
        JSONObject jSONObject;
        if (sectionBean == null || (resourceBriefInfoN = sectionBean.n()) == null || (content = resourceBriefInfoN.getContent()) == null) {
            return;
        }
        try {
            jSONObject = new JSONObject(content.getContent());
        } catch (JSONException e) {
            LogUtil.e(TAG, "getSubHeaderTitle jsonObject exception, cause ", e.getCause(), ", msg: ", e.getMessage());
            jSONObject = null;
        }
        if (jSONObject == null) {
            LogUtil.e(TAG, "getSubHeaderTitle jsonObject exception, json object is null");
            return;
        }
        String strOptString = jSONObject.optString("theme");
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.e(TAG, "getSubHeaderTitle jsonObject exception, find no theme = ", strOptString);
        } else {
            this.mSubHeaderTitle = strOptString;
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        getSubHeaderTitle(sectionBean);
        this.mSectionBean = sectionBean;
        if (this.mSleepSeriesCourseTopic == null) {
            SleepSeriesCourseTopic sleepSeriesCourseTopic = new SleepSeriesCourseTopic(getPositionId());
            this.mSleepSeriesCourseTopic = sleepSeriesCourseTopic;
            this.mSleepSeriesCourseTopicList.add(sleepSeriesCourseTopic);
        }
        this.mSleepSeriesCourseTopic.b(this);
    }

    private void setData(Context context, HashMap<String, Object> map, List<SleepSeriesCourseTopic> list) {
        if (njy.e(list)) {
            return;
        }
        map.put("PAGE_TYPE", Integer.valueOf(getPageType()));
        map.put("TITLE", !TextUtils.isEmpty(this.mSubHeaderTitle) ? this.mSubHeaderTitle : context.getResources().getString(R.string.series_purchase_button_name));
        int iMin = Math.min(list.size(), 6);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iMin; i++) {
            arrayList.add(Integer.valueOf(R.drawable.ic_popular_courses_background));
        }
        map.put("BACKGROUND", arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList2.add(list.get(i2).e());
        }
        map.put("SERIES_COURSE_TITLE", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < iMin; i3++) {
            arrayList3.add(list.get(i3).b());
        }
        map.put("SERIES_COURSE_SUBTITLE", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < iMin; i4++) {
            addItemToMap(list.get(i4), arrayList4);
        }
        map.put("RECYCLERVIEW", arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < iMin; i5++) {
            arrayList5.add(context.getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_common_ui_xlistview_footer_hint_normal));
        }
        map.put("SHOWMORE", arrayList5);
        setClickListener(context, list, map);
        LogUtil.a(TAG, "viewMap", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoMoreDetail(Context context) {
        Intent intent = new Intent(context, (Class<?>) SleepPopularCoursesActivity.class);
        intent.putExtra("pageType", getPageType());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(TAG, "setClickListener ActivityNotFoundException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoSingleDetail(Context context, SleepSeriesCourseBean sleepSeriesCourseBean) {
        String linkValue = sleepSeriesCourseBean.getLinkValue();
        if (linkValue == null) {
            LogUtil.e(TAG, "url is null");
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(linkValue));
        intent.setPackage(context.getPackageName());
        intent.setFlags(268435456);
        lsx.c(intent, context);
    }

    private void setClickListener(final Context context, final List<SleepSeriesCourseTopic> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.BaseSleepSeriesCourseProvider.5
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("SUBTITILE_CLICK_EVENT".equals(str)) {
                    BaseSleepSeriesCourseProvider.this.gotoMoreDetail(context);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
                if (njy.e(list, i)) {
                    return;
                }
                SleepSeriesCourseTopic sleepSeriesCourseTopic = (SleepSeriesCourseTopic) list.get(i);
                if (njy.e(sleepSeriesCourseTopic.d(), i2)) {
                    return;
                }
                BaseSleepSeriesCourseProvider.this.gotoSingleDetail(context, sleepSeriesCourseTopic.d().get(i2));
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                if (njy.e(list, i)) {
                    return;
                }
                BaseSleepSeriesCourseProvider.this.gotoMoreDetail(context);
            }
        });
    }

    private void addItemToMap(SleepSeriesCourseTopic sleepSeriesCourseTopic, List<Map<String, Object>> list) {
        Map<String, Object> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        for (SleepSeriesCourseBean sleepSeriesCourseBean : sleepSeriesCourseTopic.d()) {
            if (i >= 2) {
                break;
            }
            arrayList.add(sleepSeriesCourseBean.getPictureUrl());
            arrayList2.add(sleepSeriesCourseBean.getTheme());
            arrayList3.add(sleepSeriesCourseBean.getDesc());
            arrayList4.add("");
            i++;
        }
        map.put("IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put("DIFFICULTY", arrayList3);
        map.put("TIME", arrayList4);
        list.add(map);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return TAG;
    }
}
