package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import defpackage.gki;
import defpackage.gsi;
import defpackage.mvi;
import defpackage.n1j;
import defpackage.x44;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class DataTitleBarView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f11595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f11596b;
    public TextView c;
    public ImageView d;
    public ImageView e;
    public StatusTableLayout f;
    public StatusTextView g;
    public StatusTextView h;
    public StatusTextView i;
    public StatusTextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f11597k;
    public ExpandLinearLayout l;
    public boolean m;
    public g n;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DataTitleBarView.this.n != null) {
                DataTitleBarView.this.n.onShowCalendar();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DataTitleBarView.this.n != null) {
                DataTitleBarView.this.n.c();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DataTitleBarView dataTitleBarView = DataTitleBarView.this;
            if (dataTitleBarView.g.f11629a == 1 || dataTitleBarView.n == null) {
                return;
            }
            DataTitleBarView.this.n.d();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DataTitleBarView.b(DataTitleBarView.this);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DataTitleBarView dataTitleBarView = DataTitleBarView.this;
            dataTitleBarView.m = !dataTitleBarView.m;
            dataTitleBarView.l.m();
        }
    }

    public interface f {
    }

    public interface g {
        void c();

        void d();

        void onShowCalendar();
    }

    public DataTitleBarView(Context context) {
        this(context, null);
    }

    public static /* bridge */ /* synthetic */ f b(DataTitleBarView dataTitleBarView) {
        dataTitleBarView.getClass();
        return null;
    }

    private void setCurrentDisable(boolean z) {
        this.g.setSelectType(z ? 1 : 0);
    }

    public void d(LocalDate localDate, int i) {
        if (i == 0) {
            e(localDate, false);
        } else if (i == 1) {
            g(TimeDateUtil.getWeekMonday(localDate), false);
        } else {
            f(localDate, false);
        }
    }

    public final void e(LocalDate localDate, boolean z) {
        setDesc(TimeDateUtil.getDateYYYYMMddLocalFormat(localDate));
        if (z) {
            setCurrentDisable(TimeDateUtil.isSameLocalDate(localDate, LocalDate.now()));
        } else {
            setCurrentDisable(false);
        }
    }

    public final void f(LocalDate localDate, boolean z) {
        setDesc(TimeDateUtil.getDateYYYYMMLocalFormat(localDate));
        if (z) {
            setCurrentDisable(TimeDateUtil.isSameMonth(localDate, LocalDate.now()));
        } else {
            setCurrentDisable(false);
        }
    }

    public final void g(LocalDate localDate, boolean z) {
        setDesc(TimeDateUtil.getDateRangeFormat(localDate, localDate.plusDays(6)));
        if (z) {
            setCurrentDisable(TimeDateUtil.isSameWeekWithToday(localDate));
        } else {
            setCurrentDisable(false);
        }
    }

    public void h() {
        int iA = x44.a(gki.p);
        this.h.setSelectColor(iA);
        this.i.setSelectColor(iA);
        this.j.setSelectColor(iA);
    }

    public final void i() {
        new a();
        this.f11595a.setContentDescription(this.f11597k.getResources().getString(n1j.f27441b));
        this.f11595a.setOnClickListener(new b());
        this.g.setOnClickListener(new c());
        d dVar = new d();
        ViewUtil.setTouchDelegate(this.d, 50);
        this.d.setOnClickListener(dVar);
        e eVar = new e();
        this.e.setContentDescription(this.f11597k.getResources().getString(n1j.D));
        ViewUtil.setTouchDelegate(this.e, 50);
        this.e.setOnClickListener(eVar);
    }

    public void j() {
        this.c.setCompoundDrawables(null, null, null, null);
    }

    public void k(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
        this.l.h(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f11595a = (ImageView) findViewById(gsi.g);
        this.f11596b = (TextView) findViewById(gsi.p0);
        this.c = (TextView) findViewById(gsi.o0);
        this.f = (StatusTableLayout) findViewById(gsi.a0);
        this.d = (ImageView) findViewById(gsi.i);
        this.e = (ImageView) findViewById(gsi.h);
        this.l = (ExpandLinearLayout) findViewById(gsi.q);
        this.g = (StatusTextView) findViewById(gsi.j);
        this.h = (StatusTextView) findViewById(gsi.n);
        this.i = (StatusTextView) findViewById(gsi.o);
        this.j = (StatusTextView) findViewById(gsi.f19299k);
        this.l.h(true);
        this.l.setAnimationDuration(200L);
        this.l.setDefViewHeight(DisplayUtil.dip2px(40.0f));
    }

    public void setDesc(String str) {
        this.c.setText(str);
    }

    public void setOnTitleBarClickListener(g gVar) {
        this.n = gVar;
        i();
    }

    public void setTitle(String str) {
        this.f11596b.setText(str);
    }

    public DataTitleBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f11597k = context;
    }

    public void setTitle(SpannableStringBuilder spannableStringBuilder) {
        this.f11596b.setText(spannableStringBuilder.toString().trim());
    }

    public DataTitleBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = false;
        this.f11597k = context;
        LayoutInflater.from(context).inflate(mvi.m, this);
    }
}
