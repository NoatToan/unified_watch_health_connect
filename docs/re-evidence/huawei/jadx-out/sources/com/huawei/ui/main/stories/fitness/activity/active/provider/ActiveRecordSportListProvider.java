package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.writehelper.SportSimplifyItemCallback;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.ui.main.stories.history.adapter.SportHistoryExpandableListAdapter;
import defpackage.fsj;
import defpackage.iov;
import defpackage.ivv;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qre;
import defpackage.tvb;
import defpackage.vqn;
import defpackage.vqu;
import defpackage.vrb;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordSportListProvider extends MinorProvider<fsj> {
    private SportHistoryExpandableListAdapter d;
    private fsj e;
    private SectionBean f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<vqu> f26545b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tvb f26544a = new tvb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f26546c = new d(this);

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "enter loadDefaultData");
        this.f = sectionBean;
        super.loadDefaultData(sectionBean);
        ObserverManagerUtil.d(this.f26546c, "observer_sport_list_data_change");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "enter onDestroy");
        ObserverManagerUtil.a("observer_sport_list_data_change");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, fsj fsjVar) {
        this.e = fsjVar;
        if (this.d == null) {
            SportHistoryExpandableListAdapter sportHistoryExpandableListAdapter = new SportHistoryExpandableListAdapter(BaseApplication.getContext(), null);
            this.d = sportHistoryExpandableListAdapter;
            sportHistoryExpandableListAdapter.b(1);
        }
        this.f26544a.c(12, fsjVar.t(), new SportSimplifyItemCallback() { // from class: tuk
            @Override // com.huawei.ui.main.stories.fitness.activity.active.writehelper.SportSimplifyItemCallback
            public final void onResponse(int i, List list) {
                this.f49681b.d(i, list);
            }
        });
    }

    public /* synthetic */ void d(int i, final List list) {
        HandlerExecutor.b(new Runnable() { // from class: tui
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(list);
            }
        });
    }

    public /* synthetic */ void b(List list) {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "mAllTypeGroupData is clear");
        a(list);
    }

    private ExpandableListView.OnChildClickListener d() {
        return new ExpandableListView.OnChildClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordSportListProvider$$ExternalSyntheticLambda1
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                return this.f26547c.b(expandableListView, view, i, i2, j);
            }
        };
    }

    /* synthetic */ boolean b(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "ChildClickListener position ", Integer.valueOf(i2));
        vrb vrbVarD = this.f26545b.get(i).d(i2);
        long jW = vrbVarD.w();
        long jM = vrbVarD.m();
        ivv.d(BaseApplication.getActivity(), vrbVarD.q(), jW, jM);
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(final Context context, HashMap map, fsj fsjVar) {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "parseParams");
        String dateTime = DateUtils.formatDateTime(BaseApplication.getContext(), fsjVar.t(), 24);
        if (lsl.aa(fsjVar.t())) {
            dateTime = qre.f(R.string.IDS_hwh_home_group_today);
        }
        map.put("BAR_CHART_DATE_TEXT", qre.a(R.string.IDS_active_record_list_history_title, dateTime));
        map.put("REMIND_ADAPTER", this.d);
        map.put("COMMON_CLICK_EVENT", new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordSportListProvider$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActiveRecordSportListProvider.b(context, view);
            }
        });
        map.put("MIDDLE_TIP_TEXT_CLICK_EVENT", d());
    }

    static /* synthetic */ void b(Context context, View view) {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "go to history");
        iov.d(context, new Intent(context, (Class<?>) SportHistoryActivity.class));
    }

    private void a(List<vrb> list) {
        this.f26545b.clear();
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "mAllTypeGroupData is clear");
        if (njy.e(list)) {
            ObserverManagerUtil.e("observer_sport_list_show_tip", true);
            LogUtil.a("SCUI_ActiveRecordSportListProvider", "empty send one");
            c();
            return;
        }
        ObserverManagerUtil.e("observer_sport_list_show_tip", false);
        for (vrb vrbVar : list) {
            if (njy.b(this.f26545b) && this.f26545b.get(0).b() == 3) {
                break;
            }
            if (vrbVar != null && vrbVar.n() == null) {
                vqn vqnVar = new vqn(new HashMap(), 0, lsl.p(vrbVar.w()));
                if (this.f26545b.isEmpty()) {
                    vqu vquVar = new vqu(vqnVar);
                    vquVar.c(vrbVar);
                    vquVar.a(true);
                    this.f26545b.add(vquVar);
                } else {
                    this.f26545b.get(0).c(vrbVar);
                }
                LogUtil.a("SCUI_ActiveRecordSportListProvider", "singleTrackData is ", vrbVar.toString());
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "record data changed");
        SectionBean sectionBean = this.f;
        if (sectionBean != null) {
            sectionBean.c(this.e);
            this.f26544a.c();
        }
    }

    private void c() {
        this.d.b(this.f26545b, 0);
        LogUtil.a("SCUI_ActiveRecordSportListProvider", "mAllTypeGroupData size is ", Integer.valueOf(this.f26545b.size()));
        this.d.notifyDataSetChanged();
        SectionBean sectionBean = this.f;
        if (sectionBean != null) {
            sectionBean.c(this.e);
        }
    }

    public static class d implements Observer {
        private final WeakReference<ActiveRecordSportListProvider> d;

        d(ActiveRecordSportListProvider activeRecordSportListProvider) {
            this.d = new WeakReference<>(activeRecordSportListProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if ("observer_sport_list_data_change".equals(str)) {
                ActiveRecordSportListProvider activeRecordSportListProvider = this.d.get();
                if (activeRecordSportListProvider != null) {
                    activeRecordSportListProvider.e();
                } else {
                    ReleaseLogUtil.e("SCUI_ActiveRecordSportListProvider", "ActiveRecordSportListProvider is null");
                }
            }
        }
    }
}
