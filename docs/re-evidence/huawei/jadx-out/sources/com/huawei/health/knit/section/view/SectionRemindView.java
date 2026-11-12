package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.knit.section.adapter.SectionRemindViewAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ftk;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRemindView extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnClickSectionListener f7900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionRemindViewAdapter f7901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7902c;
    private List<ftk> d;
    private boolean e;
    private String f;
    private HealthRecycleView g;
    private String h;
    private HealthTextView i;
    private boolean j;
    private boolean k;
    private LinearLayout l;
    private View m;
    private HealthTextView n;
    private Integer o;
    private String p;
    private List<Object> q;
    private String r;
    private View s;
    private ImageView t;

    public SectionRemindView(Context context) {
        this(context, null);
    }

    public SectionRemindView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionRemindView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.d = new ArrayList();
        this.f7902c = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionRemindView", "onCreateView");
        this.f7902c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_remind_view, (ViewGroup) this, false);
        this.s = viewInflate;
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionRemindView", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionRemindView", "no need to bind");
            return;
        }
        this.r = (String) qqw.a(map, "REMIND_TEXT", (Class<String>) String.class, "");
        this.q = (List) qqw.a(map, "REMIND_IMG_VIEW", (Class<Object>) ArrayList.class, (Object) null);
        this.o = (Integer) qqw.a(map, "REMIND_ARROWS", (Class<Object>) Integer.class, (Object) null);
        this.p = (String) qqw.a(map, "REMIND_HISTORY_TEXT", (Class<String>) String.class, "");
        this.f7900a = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.j = ((Boolean) qqw.a(map, "IS_REMIND_SHOW", (Class<boolean>) Boolean.class, false)).booleanValue();
        this.k = ((Boolean) qqw.a(map, "REMIND_SHOW_MODEL", (Class<boolean>) Boolean.class, false)).booleanValue();
        this.h = (String) qqw.a(map, "LOW_REMIND_TEXT", (Class<String>) String.class, "");
        this.f = (String) qqw.a(map, "HIGH_REMIND_TEXT", (Class<String>) String.class, "");
        this.d = (List) qqw.a(map, "REMIND_DATA", (Class<Object>) ArrayList.class, (Object) null);
        if (!this.e) {
            LogUtil.a("SectionRemindView", "mHasInitDataAndView" + this.e);
            c();
            this.e = true;
        }
        LogUtil.a("SectionRemindView", "showData is " + this.k);
        a();
        a(this.k);
        setRemindVisible(this.j);
    }

    private void c() {
        this.l = (LinearLayout) findViewById(R.id.remind_layout_root);
        this.m = findViewById(R.id.warning_title);
        this.g = (HealthRecycleView) findViewById(R.id.warning_recycle_view);
        this.i = (HealthTextView) findViewById(R.id.warning_history_text);
        this.t = (ImageView) findViewById(R.id.warning_tip_img);
        this.n = (HealthTextView) findViewById(R.id.warning_des);
        e();
        j();
        i();
        b();
        d();
    }

    private void a() {
        this.g.setIsScroll(false);
        this.f7901b = new SectionRemindViewAdapter(this.d, R.layout.section_temperature_warning_home, this.h, this.f);
        this.g.setLayoutManager(new HealthLinearLayoutManager(this.f7902c));
        this.g.setAdapter(this.f7901b);
    }

    private void d() {
        LogUtil.a("SectionRemindView", "begin to setClickEventListener");
        if (this.f7900a instanceof OnClickSectionListener) {
            if (this.t != null) {
                LogUtil.a("SectionRemindView", "mWarningTipImg listener");
                this.t.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionRemindView.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("SectionRemindView", "set warningTipImg onClick");
                        SectionRemindView.this.f7900a.onClick("REMIND_WARNING_TIP_IMG");
                    }
                });
            }
            if (this.m != null) {
                LogUtil.a("SectionRemindView", "mTitle listener");
                this.m.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionRemindView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("SectionRemindView", "set mTitle onClick");
                        SectionRemindView.this.f7900a.onClick("REMIND_TITLE");
                    }
                });
            }
            if (this.i != null) {
                LogUtil.a("SectionRemindView", "mHistoryText listener");
                this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionRemindView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("SectionRemindView", "set mHistoryText onClick");
                        SectionRemindView.this.f7900a.onClick("REMIND_HISTORY_VIEW");
                    }
                });
            }
        }
    }

    private void j() {
        List<Object> list = this.q;
        if (list != null && list.size() == 2 && (this.q.get(0) instanceof Integer)) {
            LogUtil.a("SectionRemindView", "start to set warning tip img");
            StateListDrawable stateListDrawableE = e(((Integer) this.q.get(0)).intValue(), ((Integer) this.q.get(1)).intValue());
            if (stateListDrawableE != null) {
                this.t.setBackground(stateListDrawableE);
            }
        }
    }

    private void i() {
        Drawable drawable;
        if (this.o == null) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.warning_arrow);
        if (LanguageUtil.ba(this.f7902c)) {
            drawable = qqz.e(this.f7902c, this.o.intValue());
        } else {
            drawable = this.f7902c.getResources().getDrawable(this.o.intValue());
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        imageView.setImageDrawable(drawable);
    }

    private void e() {
        qsp.b(this.n, this.r);
    }

    private void b() {
        qsp.b(this.i, this.p);
    }

    private StateListDrawable e(int i, int i2) {
        LogUtil.a("SectionRemindView", "addStateDrawable");
        Resources resources = this.f7902c.getResources();
        if (resources != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = i == -1 ? null : resources.getDrawable(i, null);
            Drawable drawable2 = i2 != -1 ? resources.getDrawable(i2, null) : null;
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, drawable2);
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawable2);
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, drawable);
            stateListDrawable.addState(new int[0], drawable);
            return stateListDrawable;
        }
        LogUtil.a("SectionRemindView", "get StateListDrawable fail");
        return null;
    }

    private void a(boolean z) {
        if (z) {
            this.m.setVisibility(0);
            this.g.setVisibility(0);
            this.i.setVisibility(8);
            return;
        }
        this.m.setVisibility(8);
        this.g.setVisibility(8);
        this.i.setVisibility(0);
        if (this.l.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.topMargin = 50;
            this.l.setLayoutParams(layoutParams);
        }
    }

    private void setRemindVisible(boolean z) {
        if (z) {
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionRemindView";
    }
}
