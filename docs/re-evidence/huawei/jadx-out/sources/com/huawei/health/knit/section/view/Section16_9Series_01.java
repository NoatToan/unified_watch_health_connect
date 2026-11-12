package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.health.knit.section.adapter.Section16_9Series_01Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.fow;
import defpackage.fts;
import defpackage.qqw;
import defpackage.qrs;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section16_9Series_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f7637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Section16_9Series_01Adapter f7638c;
    private HealthRecycleView d;
    private LinearLayout e;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public Section16_9Series_01(Context context) {
        this(context, null);
    }

    public Section16_9Series_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section16_9Series_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7636a = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Section16_9Series_01", "bindViewParams");
        HealthSubHeader healthSubHeader = this.f7637b;
        if (healthSubHeader != null) {
            healthSubHeader.setRightArrayVisibility(8);
            this.f7637b.setMoreTextVisibility(4);
        }
        fow fowVar = new fow();
        setSubHeaderText(qqw.b(map, "TITLE", null));
        setSubViewStatus(qqw.b(map, "SUBTITLE", null));
        setRightArrayVisibility(qqw.b(map, "RIGHT_ARRAY", null));
        b(qqw.b(map, "CLICK_EVENT_LISTENER", null), fowVar);
        i(qqw.b(map, "NAME", null), fowVar);
        e(qqw.b(map, "BACKGROUND_IMAGE", null), fowVar);
        g(qqw.b(map, "NEW_IMAGE", null), fowVar);
        a(qqw.b(map, "CORNER_VIEW", null), fowVar);
        c(qqw.b(map, "DIFFICULTY", null), fowVar);
        f(qqw.b(map, PlayInfo.KEY_DURATION, null), fowVar);
        d(qqw.b(map, "CALORIES", null), fowVar);
        h(qqw.b(map, "TRAIN_NUMBER", null), fowVar);
        setAdapterData(fowVar);
    }

    private void b(final Object obj, fow fowVar) {
        if (!fts.e(obj) || this.f7637b == null) {
            return;
        }
        LogUtil.a("Section_Section16_9Series_01", "click event is set");
        this.f7637b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section16_9Series_01.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((OnClickSectionListener) obj).onClick("ALL_CLICK_EVENT");
            }
        });
        fowVar.d((OnClickSectionListener) obj);
    }

    private void i(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "name list is set");
            fowVar.f((List) obj);
        }
    }

    private void e(Object obj, fow fowVar) {
        if (fts.c(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "background image list is set");
            fowVar.e((List) obj);
        }
    }

    private void g(Object obj, fow fowVar) {
        if (fts.c(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "new image list is set");
            fowVar.g((List) obj);
        }
    }

    private void a(Object obj, fow fowVar) {
        if (fts.c(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "corner list is set");
            fowVar.d((List<String>) obj);
        }
    }

    private void setSubHeaderText(Object obj) {
        if (!fts.j(obj) || this.f7637b == null) {
            return;
        }
        LogUtil.a("Section_Section16_9Series_01", "title is set");
        this.f7637b.setHeadTitleText((String) obj);
    }

    private void setRightArrayVisibility(Object obj) {
        HealthSubHeader healthSubHeader;
        if (obj == null || (healthSubHeader = this.f7637b) == null) {
            return;
        }
        healthSubHeader.setRightArrayVisibility(0);
    }

    private void setSubViewStatus(Object obj) {
        HealthSubHeader healthSubHeader;
        if (obj == null || (healthSubHeader = this.f7637b) == null) {
            return;
        }
        dkf.e(obj, healthSubHeader, "Section_Section16_9Series_01", 4, "invisible");
    }

    private void c(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "difficulty list is set");
            fowVar.b((List) obj);
        }
    }

    private void f(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "duration list is set");
            fowVar.a((List) obj);
        }
    }

    private void d(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "calories list is set");
            fowVar.c((List) obj);
        }
    }

    private void h(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section_Section16_9Series_01", "train number list is set");
            fowVar.j((List) obj);
        }
    }

    private void setAdapterData(fow fowVar) {
        Section16_9Series_01Adapter section16_9Series_01Adapter = this.f7638c;
        if (section16_9Series_01Adapter == null) {
            Section16_9Series_01Adapter section16_9Series_01Adapter2 = new Section16_9Series_01Adapter(this.f7636a, fowVar);
            this.f7638c = section16_9Series_01Adapter2;
            this.d.setAdapter(section16_9Series_01Adapter2);
            return;
        }
        section16_9Series_01Adapter.c(fowVar);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_Section16_9Series_01", "loadView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section16_9series_01_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.root_view_layout);
        this.e = linearLayout;
        linearLayout.post(new Runnable() { // from class: com.huawei.health.knit.section.view.Section16_9Series_01.1
            @Override // java.lang.Runnable
            public void run() {
                Section16_9Series_01.this.e.setMinimumWidth(qrs.q());
            }
        });
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.f7637b = healthSubHeader;
        healthSubHeader.setMoreTextColor(context.getResources().getColor(R.color.common_colorAccent));
        this.f7637b.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section16_9series_01_recycler_view);
        this.d = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.section_sub_header) {
            onClick("ALL_CLICK_EVENT");
        } else {
            LogUtil.e("view id is invalid", new Object[0]);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section16_9Series_01";
    }
}
