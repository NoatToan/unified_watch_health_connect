package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hmu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f36929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f36930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f36931c;
    private HealthTextView d;
    private ImageView e;
    private HealthTextView f;
    private HealthTextView g;
    private ImageView h;
    private View i;
    private ImageView j;
    private HealthProgressBar k;
    private HealthTextView n;
    private LinearLayout o;

    public hmu() {
        b();
    }

    private void b() {
        this.i = LayoutInflater.from(btx.c()).inflate(R.layout.layout_count_timer_black, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.bottomMargin = 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(marginLayoutParams);
        layoutParams.addRule(12);
        layoutParams.alignWithParent = true;
        layoutParams.bottomMargin = 0;
        this.i.setLayoutParams(layoutParams);
        this.o = (LinearLayout) this.i.findViewById(R.id.timer_container);
        this.f36931c = (HealthTextView) this.i.findViewById(R.id.minute_timed_black);
        this.j = (ImageView) this.i.findViewById(R.id.minute_unit_black);
        this.g = (HealthTextView) this.i.findViewById(R.id.second_timed_black);
        this.h = (ImageView) this.i.findViewById(R.id.second_timed_unit_black);
        this.d = (HealthTextView) this.i.findViewById(R.id.goal_time_minute_black);
        this.e = (ImageView) this.i.findViewById(R.id.goal_time_minute_unit_black);
        this.f36929a = (HealthTextView) this.i.findViewById(R.id.goal_second_time_black);
        this.f36930b = (ImageView) this.i.findViewById(R.id.goal_second_time_unit_black);
        this.n = (HealthTextView) this.i.findViewById(R.id.time_split);
        this.f = (HealthTextView) this.i.findViewById(R.id.motion_name_black);
        this.k = (HealthProgressBar) this.i.findViewById(R.id.timer_progressbar);
    }

    public void c(int i, int i2) {
        View view = this.i;
        if (view == null) {
            LogUtil.j("Suggestion_CountTimerViewHolder", "setMarginStart, mRootView is null");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.timer_parent);
        if (!(linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LogUtil.j("Suggestion_CountTimerViewHolder", "setMarginStart, timerParent.getLayoutParams() not LinearLayout.LayoutParams");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMarginStart(i + qrs.d(BaseApplication.getContext(), BaseApplication.getContext().getResources().getDimension(R.dimen.padding_m)));
        layoutParams.bottomMargin = i2;
        linearLayout.setLayoutParams(layoutParams);
    }

    public View a() {
        return this.i;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f.setText(str);
    }

    public void b(float f, float f2) {
        this.k.setVisibility(0);
        ibm.a(this.k, f, f2, 300);
    }

    public void c() {
        this.k.setVisibility(4);
    }

    public void c(int i) {
        this.k.setProgress(i, true);
    }

    public void a(int i) {
        this.k.setMax(i);
    }

    public int d() {
        return this.k.getMax();
    }

    public void c(int i, int i2, boolean z) {
        this.o.setVisibility(0);
        if (i == -1) {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.f36929a.setVisibility(8);
            this.f36930b.setVisibility(8);
            this.n.setVisibility(8);
            i = i2;
            i2 = -1;
        }
        if (z) {
            this.h.setVisibility(0);
            if (i >= 60) {
                this.f36931c.setVisibility(0);
                e(this.f36931c, i / 60);
                this.j.setVisibility(0);
                e(this.g, i % 60);
            } else {
                this.f36931c.setVisibility(8);
                this.j.setVisibility(8);
                e(this.g, i);
            }
            if (i2 == -1) {
                return;
            }
            this.f36930b.setVisibility(0);
            this.f36929a.setVisibility(0);
            this.n.setVisibility(0);
            if (i2 >= 60) {
                this.d.setVisibility(0);
                e(this.d, i2 / 60);
                this.e.setVisibility(0);
                e(this.f36929a, i2 % 60);
                return;
            }
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            e(this.f36929a, i2);
            return;
        }
        d(i, i2);
    }

    private void e(HealthTextView healthTextView, int i) {
        healthTextView.setText(UnitUtil.e(i, 1, 0));
    }

    private void d(int i, int i2) {
        this.f36931c.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f36930b.setVisibility(8);
        e(this.g, i);
        if (i2 != -1) {
            this.n.setVisibility(0);
            this.f36929a.setVisibility(0);
            e(this.f36929a, i2);
        }
    }
}
