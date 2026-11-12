package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionActiveTrendListAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.dkf;
import defpackage.fsw;
import defpackage.qqw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveRecordTrendList extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<fsw> f7732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f7733c;
    private SectionActiveTrendListAdapter d;
    private View e;

    public SectionActiveRecordTrendList(Context context) {
        super(context);
        this.f7732b = new ArrayList(10);
    }

    public SectionActiveRecordTrendList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7732b = new ArrayList(10);
    }

    public SectionActiveRecordTrendList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7732b = new ArrayList(10);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.e == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_record_trend_list, (ViewGroup) this, false);
            this.e = viewInflate;
            HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.recycler_view_trend_list);
            this.f7733c = healthRecycleView;
            dkf.d(healthRecycleView);
            this.f7733c.setLayoutManager(new LinearLayoutManager(context, 1, false));
            SectionActiveTrendListAdapter sectionActiveTrendListAdapter = new SectionActiveTrendListAdapter(context, this.f7732b);
            this.d = sectionActiveTrendListAdapter;
            this.f7733c.setAdapter(sectionActiveTrendListAdapter);
        }
        return this.e;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionActiveRecordTrendList";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.j("SectionActiveRecordTrendList", "no need to bind");
            return;
        }
        OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        if (onClickSectionListenerC != null) {
            this.d.b(onClickSectionListenerC);
        }
        Object obj = map.get("VIEW_LIST");
        if (obj instanceof List) {
            if (!this.f7732b.isEmpty()) {
                this.f7732b.clear();
            }
            this.f7732b.addAll((List) obj);
            this.d.notifyDataSetChanged();
        }
    }
}
