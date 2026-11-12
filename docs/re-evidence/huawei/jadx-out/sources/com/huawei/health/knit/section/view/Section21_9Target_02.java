package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.knit.section.adapter.Section21_9Target_02_Adapter_01;
import com.huawei.health.knit.section.adapter.Section21_9Target_02_Adapter_02;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fph;
import defpackage.fpl;
import defpackage.fts;
import defpackage.qqw;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_02 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7671c;
    private HashMap<String, Object> d;
    private Section21_9Target_02_Adapter_02 e;
    private HealthRecycleView g;
    private Section21_9Target_02_Adapter_01 i;
    private HealthSubHeader j;

    public Section21_9Target_02(Context context) {
        this(context, null);
    }

    public Section21_9Target_02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section21_9Target_02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7670b = false;
        this.d = new HashMap<>();
        this.f7671c = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(final Context context) {
        LogUtil.a("Section_Section21_9Target_02", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9target_02_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
        this.f7669a = linearLayout;
        linearLayout.post(new Runnable() { // from class: fuq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(context);
            }
        });
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.j = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(0);
        this.j.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        if (LanguageUtil.bb(BaseApplication.getContext()) || LanguageUtil.bi(BaseApplication.getContext())) {
            this.j.setSubHeaderTitleScaleTextSize(0.75f);
        }
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section21_9target_02_data_recycler_view);
        this.g = healthRecycleView;
        fts.d(context, healthRecycleView, new HealthLinearLayoutManager(context), false, 0);
        this.g.setHasFixedSize(true);
        this.g.setNestedScrollingEnabled(false);
        this.g.b(false);
        this.g.e(false);
        return viewInflate;
    }

    public /* synthetic */ void d(Context context) {
        this.f7669a.setMinimumWidth(qrs.i(context));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Section21_9Target_02", "bindParamsToView");
        this.f7670b = !d(map, this.d);
        this.d.putAll(map);
        if (fts.d(map)) {
            d(map);
        } else {
            c(map);
        }
    }

    private boolean d(HashMap<String, Object> map, HashMap<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals("CLICK_EVENT_LISTENER") && !entry.getKey().equals("BUTTON_CLICK_EVENT") && !entry.getValue().equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private void d(HashMap<String, Object> map) {
        fpl fplVar = new fpl();
        setSubHeader(map);
        if (map.containsKey("CLICK_EVENT_LISTENER") && this.j != null) {
            final Object obj = map.get("CLICK_EVENT_LISTENER");
            if (fts.e(obj)) {
                this.j.setOnClickListener(new View.OnClickListener() { // from class: fup
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((OnClickSectionListener) obj).onClick("MORE_CLICK_EVENT");
                    }
                });
                fplVar.c((OnClickSectionListener) obj);
            }
        }
        if (fts.c(map.get("BACKGROUND_IMAGE"))) {
            fplVar.b((List) map.get("BACKGROUND_IMAGE"));
        }
        if (fts.g(map.get("NAME"))) {
            fplVar.a((List) map.get("NAME"));
        }
        if (fts.g(map.get("DESCRIPTION"))) {
            fplVar.d((List) map.get("DESCRIPTION"));
        }
        if (fts.c(map.get("BUTTON_TEXT"))) {
            fplVar.e((List) map.get("BUTTON_TEXT"));
        }
        fplVar.c(qqw.a((Map) map, "BUTTON_TEXT_COLOR", Integer.class, (List) null));
        if (this.e == null || this.f7670b) {
            Section21_9Target_02_Adapter_02 section21_9Target_02_Adapter_02 = new Section21_9Target_02_Adapter_02(this.f7671c, fplVar);
            this.e = section21_9Target_02_Adapter_02;
            this.g.setAdapter(section21_9Target_02_Adapter_02);
        }
    }

    private void c(HashMap<String, Object> map) {
        HealthSubHeader healthSubHeader;
        fph fphVar = new fph();
        setSubHeader(map);
        if (map.containsKey("CLICK_EVENT_LISTENER") && this.j != null) {
            final Object obj = map.get("CLICK_EVENT_LISTENER");
            if (fts.e(obj) && (healthSubHeader = this.j) != null) {
                healthSubHeader.setOnClickListener(new View.OnClickListener() { // from class: fun
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((OnClickSectionListener) obj).onClick("MORE_CLICK_EVENT");
                    }
                });
                fphVar.b((OnClickSectionListener) obj);
            }
        }
        if (fts.g(map.get("NAME"))) {
            fphVar.b((List<String>) map.get("NAME"));
        }
        if (fts.c(map.get("BACKGROUND_IMAGE"))) {
            fphVar.c((List) map.get("BACKGROUND_IMAGE"));
        }
        if (fts.c(map.get("COMPLETE_SITUATION"))) {
            fphVar.d((List) map.get("COMPLETE_SITUATION"));
        }
        if (fts.g(map.get("TODAY_TASK"))) {
            fphVar.h((List) map.get("TODAY_TASK"));
        }
        if (fts.g(map.get("FINISH_RATE"))) {
            fphVar.a((List) map.get("FINISH_RATE"));
        }
        if (fts.c(map.get("PROGRESS_VALUE"))) {
            fphVar.e((List) map.get("PROGRESS_VALUE"));
        }
        if (fts.c(map.get("BUTTON_TEXT"))) {
            fphVar.g((List) map.get("BUTTON_TEXT"));
        }
        fphVar.j(qqw.a((Map) map, "BUTTON_TEXT_COLOR", Integer.class, (List) null));
        if (this.i == null || this.f7670b) {
            Section21_9Target_02_Adapter_01 section21_9Target_02_Adapter_01 = new Section21_9Target_02_Adapter_01(this.f7671c, fphVar);
            this.i = section21_9Target_02_Adapter_01;
            this.g.setAdapter(section21_9Target_02_Adapter_01);
        }
    }

    private void setSubHeader(HashMap<String, Object> map) {
        if (map.containsKey("TITLE") && this.j != null) {
            Object obj = map.get("TITLE");
            if (fts.j(obj)) {
                this.j.setHeadTitleText((String) obj);
            }
        }
        if (!map.containsKey("SUBTITLE") || this.j == null) {
            return;
        }
        Object obj2 = map.get("SUBTITLE");
        if (fts.j(obj2)) {
            this.j.setMoreTextVisibility(0);
            this.j.setMoreText((String) obj2);
        } else {
            this.j.setMoreTextVisibility(4);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section21_9Target_02";
    }
}
