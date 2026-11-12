package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionMyCompetitionAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.bue;
import defpackage.gnf;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMyCompetition extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7852c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f7853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7854b;
    private HealthSubHeader d;
    private SectionMyCompetitionAdapter e;
    private HealthTextView f;
    private HealthRecycleView g;
    private HealthImageView h;
    private b i;
    private View j;
    private OnClickSectionListener n;

    public SectionMyCompetition(Context context) {
        super(context);
    }

    public SectionMyCompetition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionMyCompetition(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(final Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_my_competition_layout, (ViewGroup) this, false);
        this.j = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_my_competition_sub_header);
        this.d = healthSubHeader;
        qsp.d(healthSubHeader, 0, qre.f(R.string.IDS_event_assistant), 0, 0);
        this.d.setSubHeaderBackgroundColor(0);
        this.d.setMoreText(qre.f(R.string.IDS_competition_my));
        this.d.setMoreViewClickListener(new View.OnClickListener() { // from class: fwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.f7854b = (HealthTextView) this.j.findViewById(R.id.section_my_competition_custom);
        this.f = (HealthTextView) this.j.findViewById(R.id.section_my_competition_query);
        this.f7854b.setOnClickListener(new View.OnClickListener() { // from class: fwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34632c.c(context, view);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: fwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(context, view);
            }
        });
        HealthImageView healthImageView = (HealthImageView) this.j.findViewById(R.id.section_my_competition_image);
        this.h = healthImageView;
        healthImageView.setImageResource(LanguageUtil.o(context) ? R.drawable.sug_my_competition : R.drawable.sug_my_competition_en);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: fwb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(context, view);
            }
        });
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.j.findViewById(R.id.section_my_competition_recycler_view);
        this.g = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        HealthRecycleView healthRecycleView2 = this.g;
        SectionMyCompetitionAdapter sectionMyCompetitionAdapter = new SectionMyCompetitionAdapter(context);
        this.e = sectionMyCompetitionAdapter;
        healthRecycleView2.setAdapter(sectionMyCompetitionAdapter);
        this.j.setVisibility(8);
        d();
        return this.j;
    }

    public /* synthetic */ void d(View view) {
        OnClickSectionListener onClickSectionListener = this.n;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("SHOW_MORE_CLICK_EVENT");
        }
    }

    public /* synthetic */ void c(Context context, View view) {
        OnClickSectionListener onClickSectionListener = this.n;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("LEFT_ICON_CLICK_EVENT");
            bue.e(context, 1, "button_click", "custom_events", this.h.getVisibility() == 0 ? "not_enabled_status" : "enabled_status");
        }
    }

    public /* synthetic */ void d(Context context, View view) {
        OnClickSectionListener onClickSectionListener = this.n;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("RIGHT_ICON_CLICK_EVENT");
            bue.e(context, 1, "button_click", "event_search", this.h.getVisibility() == 0 ? "not_enabled_status" : "enabled_status");
        }
    }

    public /* synthetic */ void e(Context context, View view) {
        OnClickSectionListener onClickSectionListener = this.n;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("RIGHT_ICON_CLICK_EVENT");
            bue.e(context, 1, "card_click", "", "not_enabled_status");
        }
    }

    static class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SectionMyCompetition> f7855c;

        public b(SectionMyCompetition sectionMyCompetition) {
            this.f7855c = new WeakReference<>(sectionMyCompetition);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SectionMyCompetition sectionMyCompetition = this.f7855c.get();
            if (sectionMyCompetition != null) {
                if (!SectionMyCompetition.f7852c) {
                    sectionMyCompetition.c();
                    return;
                } else {
                    qsp.b(sectionMyCompetition, this);
                    return;
                }
            }
            LogUtil.j("SectionMyCompetition", "onGlobalLayout sectionMyCompetition is null");
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            SectionMyCompetition sectionMyCompetition = this.f7855c.get();
            if (sectionMyCompetition != null) {
                if (!SectionMyCompetition.f7852c) {
                    sectionMyCompetition.c();
                    return;
                } else {
                    qsp.c(sectionMyCompetition, this);
                    return;
                }
            }
            LogUtil.j("SectionMyCompetition", "onScrollChanged sectionMyCompetition is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        View view = this.j;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int height = this.j.getHeight();
        int width = this.j.getWidth();
        Rect rect = new Rect();
        if (getLocalVisibleRect(rect) && e(rect, height, width) && !f7852c) {
            f7852c = true;
            bue.e(getContext(), 0, "m0", "", this.h.getVisibility() == 0 ? "not_enabled_status" : "enabled_status");
        }
    }

    private boolean e(Rect rect, int i, int i2) {
        return rect != null && rect.left >= 0 && rect.left < i2 && rect.top >= 0 && rect.top < i && rect.bottom >= Math.min(i / 2, 400);
    }

    private void d() {
        if (this.j != null) {
            if (this.f7853a == null) {
                this.f7853a = new b(this);
            }
            if (this.i == null) {
                this.i = new b(this);
            }
            qsp.a(this.j, (ViewTreeObserver.OnGlobalLayoutListener) this.f7853a);
            qsp.a(this.j, (ViewTreeObserver.OnScrollChangedListener) this.i);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionMyCompetition";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        this.j.setVisibility(0);
        Object objB = qqw.b(map, "CLICK_EVENT_LISTENER", null);
        OnClickSectionListener onClickSectionListener = objB instanceof OnClickSectionListener ? (OnClickSectionListener) objB : null;
        this.n = onClickSectionListener;
        this.e.b(onClickSectionListener);
        Object obj = map.get("VISIVILITY_LIST");
        gnf gnfVar = obj instanceof gnf ? (gnf) obj : null;
        LogUtil.a("SectionMyCompetition", "bindParamsToView myCompetitionsBean:", gnfVar);
        if (gnfVar == null || njy.e(gnfVar.c())) {
            this.d.setMoreLayoutVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(0);
            return;
        }
        this.d.setMoreLayoutVisibility(0);
        this.d.setMoreText(qqw.d((Map) map, "SUBTITLE", ""));
        if (njy.e(gnfVar.b())) {
            this.g.setVisibility(8);
            this.h.setVisibility(0);
        } else {
            this.g.setVisibility(0);
            this.h.setVisibility(8);
            this.e.a(gnfVar.b());
        }
    }
}
