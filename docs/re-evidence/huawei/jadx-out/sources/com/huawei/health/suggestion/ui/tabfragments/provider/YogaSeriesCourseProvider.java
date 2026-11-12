package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseDetailsActivity;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessSeriesCourseProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.btx;
import defpackage.fua;
import defpackage.gzx;
import defpackage.idy;
import defpackage.iec;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pda;
import defpackage.pea;
import defpackage.ped;
import defpackage.qrk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class YogaSeriesCourseProvider extends FitnessSeriesCourseProvider<List<Topic>> {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 23;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessSeriesCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        d(context, (HashMap<String, Object>) map, (List<Topic>) obj);
    }

    public void d(Context context, HashMap<String, Object> map, List<Topic> list) {
        b(context, map, list);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessSeriesCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        if (!fua.i()) {
            super.loadData(context, sectionBean);
            return;
        }
        LogUtil.a(getLogTag(), "loadData SeriesCourse");
        if (!super.isNeedUpdate()) {
            LogUtil.a(getLogTag(), "loadData no need update.");
            return;
        }
        JSONObject jSONObjectJ = sectionBean.j();
        if (jSONObjectJ == null) {
            LogUtil.a(getLogTag(), "data is null");
            super.loadData(context, sectionBean);
            return;
        }
        LogUtil.a(getLogTag(), jSONObjectJ.toString());
        List<Topic> listC = pda.c(jSONObjectJ);
        if (njy.e(listC)) {
            LogUtil.a(getLogTag(), "topicList is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Topic topic : listC) {
            if (topic != null && topic.getCourseCategory() == getCourseCategory()) {
                arrayList.add(topic);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.a(getLogTag(), "targetList is null");
            return;
        }
        LogUtil.a(getLogTag(), "getCourseTopicList List<Topic>", Integer.valueOf(arrayList.size()));
        sectionBean.c(arrayList);
        this.mIsLoad = true;
    }

    private void b(Context context, HashMap<String, Object> map, List<Topic> list) {
        if (njy.e(list)) {
            return;
        }
        map.put("PAGE_TYPE", Integer.valueOf(getPageType()));
        map.put("TITLE", context.getResources().getString(R.string.sug_series_courses));
        int iMin = Math.min(list.size(), 6);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iMin; i++) {
            arrayList.add(list.get(i).getTopicBackImgUrl());
        }
        map.put("BACKGROUND", arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList2.add(list.get(i2).acquireName());
        }
        map.put("SERIES_COURSE_TITLE", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < iMin; i3++) {
            arrayList3.add(list.get(i3).getSubtitle());
        }
        map.put("SERIES_COURSE_SUBTITLE", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < iMin; i4++) {
            e(list.get(i4), arrayList4);
        }
        map.put("RECYCLERVIEW", arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < iMin; i5++) {
            arrayList5.add(context.getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_common_ui_xlistview_footer_hint_normal));
        }
        map.put("SHOWMORE", arrayList5);
        c(context, list, map);
        LogUtil.a("Fitness_YogaSeriesCourseProvider", "viewMap", map);
    }

    private void c(final Context context, final List<Topic> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.YogaSeriesCourseProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("SUBTITILE_CLICK_EVENT".equals(str)) {
                    MarketingBiUtils.c(YogaSeriesCourseProvider.this.getPageType(), YogaSeriesCourseProvider.this.getSubViewTitle(), 7);
                    try {
                        context.startActivity(new Intent(context, (Class<?>) FitnessSeriesCourseActivity.class));
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("Fitness_YogaSeriesCourseProvider", "setClickListener ActivityNotFoundException.");
                    }
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
                if (njy.e(list, i)) {
                    return;
                }
                Topic topic = (Topic) list.get(i);
                if (njy.e(topic.acquireWorkoutList(), i2)) {
                    return;
                }
                YogaSeriesCourseProvider.this.d(topic.acquireWorkoutList().get(i2), context, topic.acquireName());
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                if (njy.e(list, i)) {
                    return;
                }
                Topic topic = (Topic) list.get(i);
                if ("SHOW_MORE_CLICK_EVENT".equals(str)) {
                    YogaSeriesCourseProvider.this.e(topic, context);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Topic topic, Context context) {
        if (topic == null) {
            LogUtil.j("Fitness_YogaSeriesCourseProvider", "jumpFitnessSerieseView: topic is null");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("date", qrk.b());
        map.put("topicId", Integer.valueOf(topic.acquireId()));
        idy.b("1130032", map);
        Intent intent = new Intent(context, (Class<?>) FitnessSeriesCourseDetailsActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("intent_key_topicid", topic.acquireId());
        intent.putExtra("intent_key_topicname", topic.acquireName());
        intent.putExtra("intent_key_description", topic.getDescription());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Fitness_YogaSeriesCourseProvider", "jumpFitnessSerieseView ActivityNotFoundException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitWorkout fitWorkout, Context context, String str) {
        if (fitWorkout == null) {
            return;
        }
        MarketingBiUtils.c(getPageType(), getSubViewTitle(), 8);
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a("8");
        pcdVar.f(str);
        pea.a(context, fitWorkout, pcdVar);
    }

    private void e(Topic topic, List<Map<String, Object>> list) {
        Map<String, Object> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        for (FitWorkout fitWorkout : topic.acquireWorkoutList()) {
            if (i >= 2) {
                break;
            }
            arrayList.add(fitWorkout.getTopicPreviewPicUrl());
            arrayList2.add(fitWorkout.acquireName());
            arrayList3.add(iec.c(fitWorkout.acquireDifficulty()));
            arrayList4.add(gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.m(fitWorkout.acquireDuration())));
            i++;
        }
        map.put("IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put("DIFFICULTY", arrayList3);
        map.put("TIME", arrayList4);
        list.add(map);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Fitness_YogaSeriesCourseProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getString(R.string.sug_series_courses);
    }
}
