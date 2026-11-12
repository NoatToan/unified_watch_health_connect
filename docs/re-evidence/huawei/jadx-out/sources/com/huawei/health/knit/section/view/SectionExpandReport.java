package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.adapter.SectionExpandReportAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.fsn;
import defpackage.fso;
import defpackage.fsr;
import defpackage.fss;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionExpandReport extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SectionExpandReportAdapter f7790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fss f7792c;
    private WeakReference<Context> d;
    private Context e;
    private HealthDivider f;
    private HealthTextView g;
    private Observer h;
    private boolean i;
    private HealthRecycleView j;
    private int k;
    private HealthRecycleView l;
    private SectionExpandReportAdapter m;
    private HealthTextView n;
    private HealthDivider o;
    private View q;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isShareNeedRelayout() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(fsn fsnVar, String str) {
        if (!(fsnVar instanceof fsr)) {
            ReleaseLogUtil.e("R_Sleep_SectionExpandReport", "expandReportBaseBean is not ExpandReportDetailBean");
            return false;
        }
        return str.equals(((fsr) fsnVar).e());
    }

    public SectionExpandReport(Context context) {
        this(context, null);
    }

    public SectionExpandReport(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionExpandReport(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7791b = false;
        this.i = false;
        this.h = new Observer() { // from class: com.huawei.health.knit.section.view.SectionExpandReport.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, final Object... objArr) {
                LogUtil.a("SectionExpandReport", "add wake up feeling");
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                LogUtil.a("SectionExpandReport", "start to runOnUiThread");
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionExpandReport.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a("SectionExpandReport", "attach wake up feeling view");
                        Context context2 = (Context) SectionExpandReport.this.d.get();
                        if (context2 != null && SectionExpandReport.this.f7792c != null && SectionExpandReport.this.f7792c.j() != null) {
                            for (fsn fsnVar : SectionExpandReport.this.f7792c.a()) {
                                if (fsnVar instanceof fso) {
                                    fso fsoVar = (fso) fsnVar;
                                    if (fsoVar.a().equals(context2.getString(R.string.IDS_wakeup_feel_title))) {
                                        Object[] objArr2 = objArr;
                                        if (objArr2.length == 1) {
                                            Object obj = objArr2[0];
                                            if (obj instanceof Integer) {
                                                fsoVar.e(SectionExpandReport.d(((Integer) obj).intValue()));
                                            }
                                        }
                                    }
                                }
                                if (objArr.length == 2 && SectionExpandReport.this.c(fsnVar, (String) objArr[1])) {
                                    fsr fsrVar = (fsr) fsnVar;
                                    fsrVar.a((SpannableString) objArr[0]);
                                    fsrVar.e(true);
                                }
                            }
                            LogUtil.a("SectionExpandReport", "bean is ", SectionExpandReport.this.f7792c);
                            if (SectionExpandReport.this.m != null) {
                                SectionExpandReport.this.m.notifyDataSetChanged();
                            }
                            if (SectionExpandReport.this.f7790a != null) {
                                SectionExpandReport.this.f7790a.notifyDataSetChanged();
                                return;
                            }
                            return;
                        }
                        LogUtil.a("SectionExpandReport", "no expandReportBean");
                    }
                });
            }
        };
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.e = context;
        this.d = new WeakReference<>(this.e);
        this.k = 2;
        c();
        return this.q;
    }

    private void c() {
        if (this.q != null) {
            LogUtil.j("SectionExpandReport", "initView mainView is not null");
            return;
        }
        LogUtil.j("SectionExpandReport", "initView mainView is null, start to inflate");
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.section_expand_report, (ViewGroup) this, false);
        this.q = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.top_advice);
        this.o = (HealthDivider) this.q.findViewById(R.id.top_advice_divider);
        this.f = (HealthDivider) this.q.findViewById(R.id.item_divider);
        this.l = (HealthRecycleView) this.q.findViewById(R.id.expand_report_recyclerview_topN);
        this.j = (HealthRecycleView) this.q.findViewById(R.id.expand_report_recyclerview);
        this.g = (HealthTextView) this.q.findViewById(R.id.sleep_data_day_count);
        setRecyclerView(this.l);
        setRecyclerView(this.j);
        LogUtil.a("SectionExpandReport", "registerObserver");
        ObserverManagerUtil.d(this.h, ObserveLabels.REFRESH_REPORT_BEAN);
    }

    private void setRecyclerView(HealthRecycleView healthRecycleView) {
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(int i) {
        LogUtil.a("SectionExpandReport", "getWakeUpFeeling, feeling index: " + i);
        if (i == 1) {
            return BaseApplication.b().getString(R.string.IDS_wakeup_feel_energized);
        }
        if (i == 2) {
            return BaseApplication.b().getString(R.string.IDS_wakeup_feel_sleepy);
        }
        if (i == 3) {
            return BaseApplication.b().getString(R.string.IDS_wakeup_feel_drowsy);
        }
        return "";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionExpandReport";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionExpandReport", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionExpandReport", "no need to bind");
            return;
        }
        this.f7792c = (fss) qqw.a(map, "EXPAND_LIST_BEAN", (Class<Object>) fss.class, (Object) null);
        String strD = qqw.d((Map) map, "REPORT_TEXT", "");
        boolean zA = qqw.a(map, "IS_WEEK_MONTH_TAB", false);
        this.i = zA;
        if (zA) {
            this.g.setText(strD);
            qsp.c((View) this.g, 0);
        }
        fss fssVar = this.f7792c;
        if (fssVar != null) {
            if (!TextUtils.isEmpty(fssVar.b())) {
                qsp.c((View) this.n, 0);
                qsp.b(this.n, this.f7792c.b());
                qsp.c((View) this.o, 0);
            } else {
                qsp.c((View) this.n, 8);
                qsp.c((View) this.o, 8);
            }
            b();
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public List<Bitmap> getShareBitmap() {
        ArrayList arrayList = new ArrayList();
        SectionExpandReportAdapter sectionExpandReportAdapter = this.m;
        if (sectionExpandReportAdapter != null || this.f7790a != null) {
            arrayList.addAll(a(sectionExpandReportAdapter, this.f7790a));
            return arrayList;
        }
        return super.getShareBitmap();
    }

    private List<Bitmap> a(SectionExpandReportAdapter... sectionExpandReportAdapterArr) {
        boolean z = this.f7791b;
        setTopItemVisibility(0);
        for (SectionExpandReportAdapter sectionExpandReportAdapter : sectionExpandReportAdapterArr) {
            if (sectionExpandReportAdapter != null) {
                sectionExpandReportAdapter.d(8);
            }
        }
        List<Bitmap> shareBitmap = super.getShareBitmap();
        for (SectionExpandReportAdapter sectionExpandReportAdapter2 : sectionExpandReportAdapterArr) {
            if (sectionExpandReportAdapter2 != null) {
                sectionExpandReportAdapter2.d(0);
            }
        }
        setTopItemVisibility(z ? 0 : 8);
        return shareBitmap;
    }

    public void setTopItemVisibility(int i) {
        this.f7791b = i == 0;
        if (this.j != null && this.f != null && this.l != null) {
            LogUtil.a("SectionExpandReport", "more analysis");
            qsp.c((View) this.l, 0);
            SectionExpandReportAdapter sectionExpandReportAdapter = this.f7790a;
            if (sectionExpandReportAdapter == null || sectionExpandReportAdapter.getItemCount() == 0) {
                qsp.c((View) this.f, 8);
                qsp.c((View) this.j, 8);
            } else {
                qsp.c((View) this.f, i);
                qsp.c((View) this.j, i);
            }
            if (this.i) {
                qsp.c((View) this.g, i);
            }
        }
        SectionExpandReportAdapter sectionExpandReportAdapter2 = this.m;
        if (sectionExpandReportAdapter2 == null || sectionExpandReportAdapter2.getItemCount() == 0) {
            qsp.c((View) this.l, 8);
            qsp.c((View) this.f, 8);
        }
    }

    public String getEfficientDesc() {
        if (this.f7792c == null) {
            return "";
        }
        Context contextB = BaseApplication.b();
        for (fsr fsrVar : this.f7792c.i()) {
            if (fsrVar.e().contains(contextB.getString(R.string.IDS_manual_sleep_daily_sleep_efficiency)) || fsrVar.e().contains(contextB.getString(R.string.IDS_manual_sleep_sleep_efficiency))) {
                return fsrVar.e();
            }
        }
        return "";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        LogUtil.a("SectionExpandReport", CervicalMucusRecord.Appearance.CLEAR);
        super.clear();
        ObserverManagerUtil.a(this.h, ObserveLabels.REFRESH_REPORT_BEAN);
    }

    private void b() {
        this.f7790a = new SectionExpandReportAdapter(this.e, this.f7792c, this.k, false);
        if (VersionControlUtil.isSupportSleepManagement()) {
            SectionExpandReportAdapter sectionExpandReportAdapter = new SectionExpandReportAdapter(this.e, this.f7792c, this.k, true);
            this.m = sectionExpandReportAdapter;
            e(sectionExpandReportAdapter, this.l);
            qsp.c((View) this.f, 0);
        }
        e(this.f7790a, this.j);
        LogUtil.a("SectionExpandReport", "bind finish");
    }

    private void e(SectionExpandReportAdapter sectionExpandReportAdapter, HealthRecycleView healthRecycleView) {
        if (healthRecycleView != null) {
            healthRecycleView.setVisibility(0);
            healthRecycleView.setAdapter(sectionExpandReportAdapter);
        }
    }
}
