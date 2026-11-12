package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionListRecordAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fqa;
import defpackage.fsp;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRecordCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnClickSectionListener f7898c;
    private String d;
    private Integer e;
    private fqa f;
    private View g;
    private String h;
    private List<fsp> i;
    private Context j;
    private String k;
    private RelativeLayout l;
    private String m;
    private String n;
    private HealthRecycleView o;
    private SectionListRecordAdapter p;
    private HealthButton q;
    private HealthSubHeader r;
    private Integer s;
    private String t;
    private String u;

    public SectionRecordCard(Context context) {
        super(context);
    }

    public SectionRecordCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionRecordCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionRecordCard", "onCreateView");
        this.j = context;
        e();
        return this.g;
    }

    private void e() {
        View viewInflate = LayoutInflater.from(this.j).inflate(R.layout.section_record_card_layout, (ViewGroup) this, false);
        this.g = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.section_layout_root);
        this.l = relativeLayout;
        relativeLayout.setMinimumWidth(qrs.i(this.j));
        this.r = (HealthSubHeader) this.g.findViewById(R.id.section_sub_header);
        this.o = (HealthRecycleView) this.g.findViewById(R.id.abnormal_section_recyclerview);
        this.q = (HealthButton) this.g.findViewById(R.id.show_more_button);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionRecordCard", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.e("SectionRecordCard", "no need to bind");
            return;
        }
        qsp.d(this.r, 0, qqw.d((Map) map, "TITLE", ""), 8, 8);
        qsp.b(this.q, qqw.d((Map) map, "SHOWMORE", ""));
        this.i = qqw.a((Map) map, "VIEW_LIST", fsp.class, (List) new ArrayList());
        OnClickSectionListener onClickSectionListener = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.f7898c = onClickSectionListener;
        HealthButton healthButton = this.q;
        if (healthButton != null && onClickSectionListener != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionRecordCard.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionRecordCard.this.f7898c.onClick("SHOWMORE");
                }
            });
        }
        b(map);
        c(map);
        a();
        LogUtil.a("SectionRecordCard", "setDefaultViewData");
        if (this.p == null) {
            this.p = new SectionListRecordAdapter(this.f);
            this.o.setLayoutManager(new LinearLayoutManager(this.j));
            this.o.setNestedScrollingEnabled(false);
            this.o.b(false);
            this.o.e(false);
            this.o.setAdapter(this.p);
            LogUtil.a("SectionRecordCard", "recyclerView.setAdapter");
        }
        this.p.d(this.i);
    }

    private void b(HashMap<String, Object> map) {
        this.u = (String) qqw.a(map, "TITLE_TEXT", (Class<String>) String.class, "");
        this.s = (Integer) qqw.a(map, "RIGHT_ICON", (Class<Object>) Integer.class, (Object) null);
        this.h = (String) qqw.a(map, "LEFT_TEXT", (Class<String>) String.class, "");
        this.n = (String) qqw.a(map, "MIDDLE_UNIT", (Class<String>) String.class, "");
        this.k = (String) qqw.a(map, "MIDDLE_TEXT", (Class<String>) String.class, "");
        this.t = (String) qqw.a(map, "RIGHT_UNIT", (Class<String>) String.class, "");
        this.m = (String) qqw.a(map, "RIGHT_TEXT", (Class<String>) String.class, "");
    }

    private void a() {
        this.f = new fqa(this.u, this.s, this.h, this.k, this.m, this.d, this.n, this.e, this.f7897b, this.t, this.f7896a, this.f7898c);
    }

    private void c(HashMap<String, Object> map) {
        this.d = (String) qqw.a(map, "EXTRA_LEFT_TEXT", (Class<String>) String.class, "");
        this.e = (Integer) qqw.a(map, "EXTRA_RIGHT_ICON", (Class<Object>) Integer.class, (Object) null);
        this.f7897b = (String) qqw.a(map, "EXTRA_BOTTOM_TEXT", (Class<String>) String.class, "");
        this.f7896a = (String) qqw.a(map, "EXTRA_BOTTOM_UNIT", (Class<String>) String.class, "");
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionRecordCard";
    }
}
