package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.Section16_9Series_02Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fow;
import defpackage.fts;
import defpackage.qqw;
import defpackage.qrs;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section16_9Series_02 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Section16_9Series_02Adapter f7642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubHeader f7643c;
    private HealthRecycleView d;
    private LinearLayout e;

    public Section16_9Series_02(Context context) {
        super(context);
    }

    public Section16_9Series_02(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Section16_9Series_02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section16_9Card_02", "loadView");
        this.f7641a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section16_9series_01_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.root_view_layout);
        this.e = linearLayout;
        linearLayout.post(new Runnable() { // from class: com.huawei.health.knit.section.view.Section16_9Series_02.2
            @Override // java.lang.Runnable
            public void run() {
                Section16_9Series_02.this.e.setMinimumWidth(qrs.q());
            }
        });
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.f7643c = healthSubHeader;
        setHeaderLayoutParam(healthSubHeader);
        this.f7643c.setHeadTitleText(this.f7641a.getResources().getString(R.string.IDS_yoga_breath));
        this.f7643c.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section16_9series_01_recycler_view);
        this.d = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        return viewInflate;
    }

    private void setHeaderLayoutParam(HealthSubHeader healthSubHeader) {
        ViewGroup.LayoutParams layoutParams = healthSubHeader.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
            healthSubHeader.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section16_9Card_02";
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
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.a("Section16_9Card_02", "currentParams is null or empty");
            return;
        }
        LogUtil.a("Section16_9Card_02", "bindViewParams");
        HealthSubHeader healthSubHeader = this.f7643c;
        if (healthSubHeader != null) {
            healthSubHeader.setRightArrayVisibility(0);
            this.f7643c.setMoreTextVisibility(4);
        }
        fow fowVar = new fow();
        e(qqw.b(map, "CLICK_EVENT_LISTENER", null), fowVar);
        c(qqw.b(map, "NAME", null), fowVar);
        b(qqw.b(map, "BACKGROUND_IMAGE", null), fowVar);
        d(qqw.b(map, "CORNER_VIEW", null), fowVar);
        a(qqw.b(map, "TRAIN_NUMBER", null), fowVar);
        setAdapterData(fowVar);
    }

    private void setAdapterData(fow fowVar) {
        Section16_9Series_02Adapter section16_9Series_02Adapter = this.f7642b;
        if (section16_9Series_02Adapter == null) {
            Section16_9Series_02Adapter section16_9Series_02Adapter2 = new Section16_9Series_02Adapter(this.f7641a, fowVar);
            this.f7642b = section16_9Series_02Adapter2;
            this.d.setAdapter(section16_9Series_02Adapter2);
            return;
        }
        section16_9Series_02Adapter.c(fowVar);
    }

    private void a(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section16_9Card_02", "train number list is set");
            fowVar.j((List) obj);
        }
    }

    private void d(Object obj, fow fowVar) {
        if (fts.c(obj)) {
            LogUtil.a("Section16_9Card_02", "corner list is set");
            fowVar.d((List<String>) obj);
        }
    }

    private void c(Object obj, fow fowVar) {
        if (fts.g(obj)) {
            LogUtil.a("Section16_9Card_02", "name list is set");
            fowVar.f((List) obj);
        }
    }

    private void b(Object obj, fow fowVar) {
        if (fts.c(obj)) {
            LogUtil.a("Section16_9Card_02", "background image list is set");
            fowVar.e((List) obj);
        }
    }

    private void e(final Object obj, fow fowVar) {
        if (!fts.e(obj) || this.f7643c == null) {
            return;
        }
        LogUtil.a("Section16_9Card_02", "click event is set");
        this.f7643c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section16_9Series_02.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((OnClickSectionListener) obj).onClick("ALL_CLICK_EVENT");
            }
        });
        fowVar.d((OnClickSectionListener) obj);
    }
}
