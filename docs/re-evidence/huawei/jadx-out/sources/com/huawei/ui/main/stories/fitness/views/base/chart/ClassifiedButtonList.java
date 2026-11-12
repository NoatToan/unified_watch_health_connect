package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.ui.commonui.subtab.HealthSubTabListener;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.xfz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ClassifiedButtonList extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f27124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnSwitchClassifies f27125c;
    private HealthSubTabWidget d;
    private List<xfz> e;
    private List<ClassifiedViewList.ClassifiedView> h;

    public interface OnSwitchClassifies {
        void onSwitchClassifies(ClassifiedViewList.ClassifiedView classifiedView);
    }

    public ClassifiedButtonList(Context context) {
        super(context);
        this.e = new ArrayList(4);
        this.f27123a = false;
    }

    public ClassifiedButtonList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList(4);
        this.f27123a = false;
        b(attributeSet);
    }

    public ClassifiedButtonList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ArrayList(4);
        this.f27123a = false;
        b(attributeSet);
    }

    public void d(int i) {
        if (this.d != null) {
            removeAllViews();
        }
        HealthSubTabWidget healthSubTabWidget = (HealthSubTabWidget) LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false);
        this.d = healthSubTabWidget;
        addView(healthSubTabWidget);
        this.f27124b = new e();
        int i2 = 0;
        while (i2 < 4) {
            xfz xfzVar = new xfz(this.d, " ");
            this.e.add(xfzVar);
            this.d.b(xfzVar, i2 == 0);
            xfzVar.c(this.f27124b);
            i2++;
        }
        this.f27124b.c();
    }

    private void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ClassifiedButtonList);
        this.f27123a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ClassifiedButtonList_deferSubTabWidgetInflating, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f27123a) {
            return;
        }
        d(R.layout.knit_sub_tab_widget_default);
    }

    public boolean c() {
        return this.f27123a;
    }

    public void setDeferSubTabWidgetInflating(boolean z) {
        this.f27123a = z;
    }

    public void b(int i) {
        if (this.f27125c == null || !njy.c(this.h, i)) {
            return;
        }
        this.f27125c.onSwitchClassifies(this.h.get(i));
    }

    public void b(List<ClassifiedViewList.ClassifiedView> list, OnSwitchClassifies onSwitchClassifies) {
        if (list.size() != this.d.getSubTabCount()) {
            return;
        }
        this.h = list;
        this.f27125c = onSwitchClassifies;
        this.d.h();
        int i = 0;
        while (i < list.size()) {
            xfz xfzVar = new xfz(this.d, list.get(i).getClassStr());
            this.d.b(xfzVar, i == 0);
            xfzVar.c(this.f27124b);
            i++;
        }
    }

    public void a(int i) {
        this.d.setSubTabSelected(i);
        this.d.setSubTabScrollingOffsets(i, 0.0f);
    }

    public class e implements HealthSubTabListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f27126c = false;

        @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
        public void onSubTabReselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        }

        @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
        public void onSubTabUnselected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
        }

        public e() {
        }

        public void c() {
            this.f27126c = true;
        }

        @Override // com.huawei.ui.commonui.subtab.HealthSubTabListener, com.huawei.uikit.hwsubtab.widget.HwSubTabListener
        public void onSubTabSelected(xfz xfzVar, FragmentTransaction fragmentTransaction) {
            if (this.f27126c) {
                ClassifiedButtonList.this.d(xfzVar);
            }
        }
    }

    protected void d(xfz xfzVar) {
        List<ClassifiedViewList.ClassifiedView> list;
        for (int i = 0; i < this.d.getSubTabCount(); i++) {
            xfz xfzVarA = this.d.a(i);
            if (xfzVarA != null && xfzVarA.equals(xfzVar) && (list = this.h) != null) {
                this.f27125c.onSwitchClassifies(list.get(i));
                return;
            }
        }
    }
}
