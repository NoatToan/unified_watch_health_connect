package com.huawei.health.knit.section.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.Section21_9Target_03_Adapter_01;
import com.huawei.health.knit.section.adapter.Section21_9Target_03_Adapter_02;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fpn;
import defpackage.fpo;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Target_03ChinaImpl extends Section21_9Target_03Impl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnClickSectionListener f7673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f7674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7675c;
    private Section21_9Target_03_Adapter_02 d;
    private boolean e;
    private HealthRecycleView g;
    private HealthSubHeader h;
    private Section21_9Target_03_Adapter_01 i;

    public Section21_9Target_03ChinaImpl(Context context) {
        super(context);
        this.e = false;
        this.f7674b = new HashMap<>();
    }

    @Override // com.huawei.health.knit.section.view.Section21_9Target_03Impl
    public View onCreateView(final Context context, ViewGroup viewGroup) {
        LogUtil.a("Section_Section21_9Target_03ChinaImpl", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9target_03_layout, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
        this.f7675c = linearLayout;
        linearLayout.post(new Runnable() { // from class: fut
            @Override // java.lang.Runnable
            public final void run() {
                this.f34594a.b(context);
            }
        });
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.h = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.h.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section21_9target_03_data_recycler_view);
        this.g = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        return viewInflate;
    }

    public /* synthetic */ void b(Context context) {
        this.f7675c.setMinimumWidth(qrs.i(context));
    }

    @Override // com.huawei.health.knit.section.view.Section21_9Target_03Impl
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Section21_9Target_03ChinaImpl", "bindParamsToView");
        this.e = !c(map, this.f7674b);
        this.f7674b.putAll(map);
        if (c(map)) {
            e(map);
        } else {
            b(map);
        }
    }

    private boolean c(HashMap<String, Object> map, HashMap<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals("CLICK_EVENT_LISTENER") && !entry.getKey().equals("BUTTON_CLICK_EVENT") && !entry.getValue().equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private boolean c(HashMap<String, Object> map) {
        return map.containsKey("IS_LOAD_DEFAULT_VIEW") && (map.get("IS_LOAD_DEFAULT_VIEW") instanceof Boolean) && ((Boolean) map.get("IS_LOAD_DEFAULT_VIEW")).booleanValue();
    }

    private void e(HashMap<String, Object> map) {
        fpo fpoVar = new fpo();
        fpoVar.e(qqw.a((Map) map, "BACKGROUND_IMAGE", Object.class, (List) null));
        fpoVar.a(qqw.a((Map) map, "NAME", String.class, (List) null));
        fpoVar.c(qqw.a((Map) map, "DESCRIPTION", String.class, (List) null));
        fpoVar.d((List) map.get("CORNER_VIEW"));
        qsp.d(this.h, 0, qqw.d((Map) map, "TITLE", ""), 4, 0);
        this.f7673a = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: fuv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34596a.d(view);
            }
        });
        fpoVar.e(this.f7673a);
        if (this.d == null || this.e) {
            Section21_9Target_03_Adapter_02 section21_9Target_03_Adapter_02 = new Section21_9Target_03_Adapter_02(this.mContext, fpoVar);
            this.d = section21_9Target_03_Adapter_02;
            this.g.setAdapter(section21_9Target_03_Adapter_02);
        }
    }

    public /* synthetic */ void d(View view) {
        OnClickSectionListener onClickSectionListener = this.f7673a;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("MORE_CLICK_EVENT");
        }
    }

    private void b(HashMap<String, Object> map) {
        fpn fpnVar = new fpn();
        fpnVar.c(qqw.a((Map) map, "BACKGROUND_IMAGE", Object.class, (List) null));
        fpnVar.d(qqw.a((Map) map, "NAME", String.class, (List) null));
        fpnVar.b(qqw.a((Map) map, "COMPLETE_SITUATION", String.class, (List) null));
        fpnVar.f(qqw.a((Map) map, "TODAY_TASK", String.class, (List) null));
        fpnVar.e(qqw.a((Map) map, "FINISH_RATE", String.class, (List) null));
        fpnVar.a(qqw.a((Map) map, "PROGRESS_VALUE", Integer.class, (List) null));
        fpnVar.h(qqw.a((Map) map, "BUTTON_TEXT", String.class, (List) null));
        fpnVar.g(qqw.a((Map) map, "BUTTON_TEXT_COLOR", Integer.class, (List) null));
        fpnVar.i(qqw.a((Map) map, "SUMMARY_TEXT", String.class, (List) null));
        fpnVar.j(qqw.a((Map) map, CommonConstant.RETKEY.STATUS, String.class, (List) null));
        qsp.d(this.h, 0, qqw.d((Map) map, "TITLE", ""), 4, 0);
        this.f7673a = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: fum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34587a.b(view);
            }
        });
        fpnVar.d(this.f7673a);
        if (this.i == null || this.e) {
            Section21_9Target_03_Adapter_01 section21_9Target_03_Adapter_01 = new Section21_9Target_03_Adapter_01(this.mContext, fpnVar);
            this.i = section21_9Target_03_Adapter_01;
            this.g.setAdapter(section21_9Target_03_Adapter_01);
        }
    }

    public /* synthetic */ void b(View view) {
        OnClickSectionListener onClickSectionListener = this.f7673a;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("MORE_CLICK_EVENT");
        }
    }

    @Override // com.huawei.health.knit.section.view.Section21_9Target_03Impl
    public String getLogTag() {
        return "Section_Section21_9Target_03ChinaImpl";
    }
}
