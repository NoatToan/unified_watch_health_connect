package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.knit.section.adapter.Section21_9Target_01_Adapter_01;
import com.huawei.health.knit.section.adapter.Section21_9Target_01_Adapter_02;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fpe;
import defpackage.fpg;
import defpackage.fts;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Section21_9Target_01_Adapter_02 f7666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Object> f7668c;
    private boolean d;
    private LinearLayout e;
    private HealthRecycleView f;
    private HealthSubHeader h;
    private Section21_9Target_01_Adapter_01 i;

    public Section21_9Target_01(Context context) {
        this(context, null);
    }

    public Section21_9Target_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section21_9Target_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.f7668c = new HashMap<>();
        this.f7667b = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(final Context context) {
        LogUtil.a("Section_Section21_9Target_01", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9target_01_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
        this.e = linearLayout;
        linearLayout.post(new Runnable() { // from class: fuo
            @Override // java.lang.Runnable
            public final void run() {
                this.f34589a.d(context);
            }
        });
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.h = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.h.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section21_9target_01_data_recycler_view);
        this.f = healthRecycleView;
        fts.d(context, healthRecycleView, new HealthLinearLayoutManager(context), false, 0);
        this.f.setHasFixedSize(true);
        this.f.setNestedScrollingEnabled(false);
        this.f.b(false);
        this.f.e(false);
        return viewInflate;
    }

    public /* synthetic */ void d(Context context) {
        this.e.setMinimumWidth(qrs.i(context));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Section21_9Target_01", "bindParamsToView");
        this.d = !b(map, this.f7668c);
        this.f7668c.putAll(map);
        map.entrySet();
        if (fts.d(map)) {
            e(map);
        } else {
            d(map);
        }
    }

    private boolean b(HashMap<String, Object> map, HashMap<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals("CLICK_EVENT_LISTENER") && !entry.getKey().equals("BUTTON_CLICK_EVENT") && !entry.getValue().equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private void e(HashMap<String, Object> map) {
        HealthSubHeader healthSubHeader;
        fpe fpeVar = new fpe();
        qsp.e(this.h, qqw.d((Map) map, "TITLE", ""));
        setSubTittle(qqw.d((Map) map, "SUBTITLE", ""));
        final Object objB = qqw.b(map, "CLICK_EVENT_LISTENER", null);
        if (fts.e(objB) && (healthSubHeader = this.h) != null) {
            healthSubHeader.setOnClickListener(new View.OnClickListener() { // from class: fui
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((OnClickSectionListener) objB).onClick("MORE_CLICK_EVENT");
                }
            });
            fpeVar.d((OnClickSectionListener) objB);
        }
        b(map, fpeVar);
        if (this.f7666a == null || this.d) {
            Section21_9Target_01_Adapter_02 section21_9Target_01_Adapter_02 = new Section21_9Target_01_Adapter_02(this.f7667b, fpeVar);
            this.f7666a = section21_9Target_01_Adapter_02;
            this.f.setAdapter(section21_9Target_01_Adapter_02);
        }
    }

    private void b(HashMap<String, Object> map, fpe fpeVar) {
        Object objB = qqw.b(map, "BACKGROUND_IMAGE", null);
        if (fts.c(objB)) {
            fpeVar.d((List<Object>) objB);
        }
        CharSequence charSequenceD = qqw.d((Map) map, "NAME", (String) null);
        if (fts.g(charSequenceD)) {
            fpeVar.a((List) charSequenceD);
        }
        CharSequence charSequenceD2 = qqw.d((Map) map, "DESCRIPTION", (String) null);
        if (fts.g(charSequenceD2)) {
            fpeVar.c((List) charSequenceD2);
        }
    }

    private void setSubTittle(String str) {
        if (this.h != null) {
            if (TextUtils.isEmpty(str)) {
                this.h.setMoreTextVisibility(4);
            } else {
                this.h.setMoreTextVisibility(0);
                this.h.setMoreText(str);
            }
        }
    }

    private void d(HashMap<String, Object> map) {
        fpg fpgVar = new fpg();
        HealthSubHeader healthSubHeader = this.h;
        if (healthSubHeader != null) {
            healthSubHeader.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        }
        String strD = qqw.d((Map) map, "SUBTITLE", "");
        if (this.h != null) {
            if (fts.j(strD)) {
                this.h.setMoreTextVisibility(0);
                this.h.setMoreText(strD);
            } else {
                this.h.setMoreTextVisibility(8);
            }
        }
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: fuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onClickSectionListenerC.onClick("MORE_CLICK_EVENT");
            }
        });
        fpgVar.e(onClickSectionListenerC);
        fpgVar.e(qqw.a((Map) map, "NAME", String.class, (List) new ArrayList()));
        fpgVar.c(qqw.a((Map) map, "BACKGROUND_IMAGE", Integer.class, (List) new ArrayList()));
        fpgVar.d(qqw.a((Map) map, "COMPLETE_SITUATION", String.class, (List) new ArrayList()));
        fpgVar.h(qqw.a((Map) map, "TODAY_TASK", String.class, (List) new ArrayList()));
        fpgVar.a(qqw.a((Map) map, "FINISH_RATE", String.class, (List) new ArrayList()));
        fpgVar.b(qqw.a((Map) map, "PROGRESS_VALUE", Integer.class, (List) new ArrayList()));
        fpgVar.f(qqw.a((Map) map, "BUTTON_TEXT", String.class, (List) new ArrayList()));
        if (this.i == null || this.d) {
            Section21_9Target_01_Adapter_01 section21_9Target_01_Adapter_01 = new Section21_9Target_01_Adapter_01(this.f7667b, fpgVar);
            this.i = section21_9Target_01_Adapter_01;
            this.f.setAdapter(section21_9Target_01_Adapter_01);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section21_9Target_01";
    }
}
