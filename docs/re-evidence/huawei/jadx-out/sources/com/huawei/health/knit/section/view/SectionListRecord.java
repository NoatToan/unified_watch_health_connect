package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.health.common.NoAnimationsLinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionListAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fpz;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionListRecord extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Drawable> f7825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f7826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnClickSectionListener f7827c;
    private List<String> d;
    private List<Integer> e;
    private HealthRecycleView f;
    private List<String> g;
    private View h;
    private Context i;
    private RelativeLayout j;
    private HealthButton k;
    private HealthSubHeader l;
    private List<String> m;
    private SectionListAdapter n;
    private List<Integer> o;

    public SectionListRecord(Context context) {
        super(context);
    }

    public SectionListRecord(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionListRecord(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionListRecord", "onCreateView");
        this.i = context;
        c();
        return this.h;
    }

    private void c() {
        View viewInflate = LayoutInflater.from(this.i).inflate(R.layout.section_list_record_layout, (ViewGroup) this, false);
        this.h = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.section_blood_pressure_rl);
        this.j = relativeLayout;
        relativeLayout.setMinimumWidth(qrs.i(this.i));
        this.l = (HealthSubHeader) this.h.findViewById(R.id.section_blood_pressure_sub_header);
        this.f7825a = (List) this.h.findViewById(R.id.left_image);
        this.f = (HealthRecycleView) this.h.findViewById(R.id.abnormal_blood_pressure_recyclerview);
        this.k = (HealthButton) this.h.findViewById(R.id.show_more_button);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionListRecord";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionListRecord", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.e("SectionListRecord", "no need to bind");
            return;
        }
        qsp.d(this.l, 0, qqw.d((Map) map, "TITLE", ""), 8, 8);
        this.l.setGuideLine();
        this.f7825a = qqw.a((Map) map, "LEFT_IMAGE", Drawable.class, (List) new ArrayList());
        this.d = qqw.a((Map) map, "LEFT_TOP_VALUE", String.class, (List) new ArrayList());
        this.g = qqw.a((Map) map, "LEFT_TOP_VALUE_UNIT", String.class, (List) new ArrayList());
        this.f7826b = qqw.a((Map) map, "LEFT_TOP_STATE", String.class, (List) new ArrayList());
        this.e = qqw.a((Map) map, "LEFT_TOP_STATE_COLOR", Integer.class, (List) new ArrayList());
        this.m = qqw.a((Map) map, "RIGHT_TIME", String.class, (List) new ArrayList());
        this.o = qqw.a((Map) map, "RIGHT_ICON", Integer.class, (List) new ArrayList());
        qsp.b(this.k, qqw.d((Map) map, "SHOWMORE", ""));
        OnClickSectionListener onClickSectionListener = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.f7827c = onClickSectionListener;
        HealthButton healthButton = this.k;
        if (healthButton != null && onClickSectionListener != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionListRecord.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionListRecord.this.f7827c.onClick("SHOWMORE");
                }
            });
        }
        if (this.n == null) {
            this.n = new SectionListAdapter();
            this.f.setLayoutManager(new NoAnimationsLinearLayoutManager(this.i));
            this.f.setNestedScrollingEnabled(false);
            this.f.b(false);
            this.f.e(false);
            this.f.setAdapter(this.n);
        }
        this.n.c(new fpz(this.f7825a, this.d, this.g, this.f7826b, this.e, this.m, this.o, this.f7827c));
    }
}
