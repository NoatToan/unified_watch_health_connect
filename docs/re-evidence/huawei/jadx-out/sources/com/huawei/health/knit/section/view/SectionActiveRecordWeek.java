package com.huawei.health.knit.section.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionActiveRecordWeekAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.dkf;
import defpackage.fsy;
import defpackage.njy;
import defpackage.qqw;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveRecordWeek extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f7734a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionActiveRecordWeekAdapter f7735c;
    private final List<fsy> d;

    public SectionActiveRecordWeek(Context context) {
        super(context);
        this.d = new ArrayList();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.f7734a == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_record_week, (ViewGroup) this, false);
            this.f7734a = viewInflate;
            HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section_active_record_week_recycler_view);
            dkf.d(healthRecycleView);
            healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            SectionActiveRecordWeekAdapter sectionActiveRecordWeekAdapter = new SectionActiveRecordWeekAdapter();
            this.f7735c = sectionActiveRecordWeekAdapter;
            sectionActiveRecordWeekAdapter.b(this.d);
            healthRecycleView.setAdapter(this.f7735c);
        }
        return this.f7734a;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "R_SectionActiveRecordWeek";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null) {
            ReleaseLogUtil.d("R_SectionActiveRecordWeek", "bindParamsToView currentParams is null");
            return;
        }
        Object obj = map.get("VIEW_LIST");
        if (njy.b(obj, fsy.class)) {
            this.d.clear();
            this.d.addAll((List) obj);
        }
        SectionActiveRecordWeekAdapter sectionActiveRecordWeekAdapter = this.f7735c;
        if (sectionActiveRecordWeekAdapter != null) {
            sectionActiveRecordWeekAdapter.b(this.d);
            this.f7735c.b(qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null));
        }
    }
}
