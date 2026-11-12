package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f36935a;
    private int aa = 10001;
    private LinearLayout ac;
    private HealthTextView ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f36936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimationDrawable f36937c;
    private LinearLayout d;
    private HealthProgressBar e;
    private LinearLayout f;
    private HealthTextView g;
    private HeartRateConfigHelper h;
    private boolean i;
    private d j;
    private ImageView k;
    private int l;
    private ImageView m;
    private HealthTextView n;
    private ImageView o;
    private ImageView p;
    private int q;
    private ImageView r;
    private ImageView s;
    private LinearLayout t;
    private View u;
    private HealthTextView v;
    private RelativeLayout w;
    private HealthTextView x;
    private LinearLayout y;

    static class d extends BaseHandler<hmx> {
        d(Looper looper, hmx hmxVar) {
            super(looper, hmxVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(hmx hmxVar, Message message) {
            LogUtil.a("Suggestion_CalorieHeartViewHolder", "handleMessage msg.what = ", Integer.valueOf(message.what));
            if (message.what == 10001) {
                hmxVar.g();
                hmxVar.i();
            }
        }
    }

    public hmx() {
        d();
    }

    private void d() {
        View viewInflate = LayoutInflater.from(btx.c()).inflate(R.layout.layout_heartrate_and_calories, (ViewGroup) null);
        this.u = viewInflate;
        this.f = (LinearLayout) viewInflate.findViewById(R.id.ll_calorie_heart_container);
        this.t = (LinearLayout) this.u.findViewById(R.id.rate_container);
        this.d = (LinearLayout) this.u.findViewById(R.id.ll_calorie_container);
        this.y = (LinearLayout) this.u.findViewById(R.id.ll_rope_skipnum_container);
        this.ac = (LinearLayout) this.u.findViewById(R.id.ll_rope_speed_container);
        this.g = (HealthTextView) this.u.findViewById(R.id.heart_rate);
        HealthTextView healthTextView = (HealthTextView) this.u.findViewById(R.id.calorie);
        this.f36936b = healthTextView;
        healthTextView.setText(UnitUtil.e(0.0d, 1, 0));
        this.n = (HealthTextView) this.u.findViewById(R.id.heart_rate_stage);
        this.v = (HealthTextView) this.u.findViewById(R.id.rope_skipnum);
        this.x = (HealthTextView) this.u.findViewById(R.id.rope_speed);
        HealthTextView healthTextView2 = (HealthTextView) this.u.findViewById(R.id.rope_skipnum_uint);
        this.ad = healthTextView2;
        healthTextView2.setText(btx.c().getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, "").trim());
        this.o = (ImageView) this.u.findViewById(R.id.mark);
        this.k = (ImageView) this.u.findViewById(R.id.point1);
        this.m = (ImageView) this.u.findViewById(R.id.point2);
        this.p = (ImageView) this.u.findViewById(R.id.point3);
        this.r = (ImageView) this.u.findViewById(R.id.point4);
        this.s = (ImageView) this.u.findViewById(R.id.point5);
        this.w = (RelativeLayout) this.u.findViewById(R.id.rl_corser);
        this.e = (HealthProgressBar) this.u.findViewById(R.id.calorie_progressbar);
        this.f36935a = (ImageView) this.u.findViewById(R.id.fitness_fire);
        this.q = qrs.d(BaseApplication.getContext(), 96.0f);
        this.j = new d(Looper.getMainLooper(), this);
    }

    public void b(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        layoutParams.addRule(21);
        layoutParams.addRule(15);
        layoutParams.setMarginEnd(i + qrs.d(BaseApplication.getContext(), BaseApplication.getContext().getResources().getDimension(R.dimen.defaultPaddingEnd)));
        this.u.setLayoutParams(layoutParams);
    }

    public void b() {
        if (!this.i) {
            this.f36935a.setImageResource(R.drawable.fitness_equip_calorie_fire_start);
            if (this.f36935a.getDrawable() instanceof AnimationDrawable) {
                this.f36937c = (AnimationDrawable) this.f36935a.getDrawable();
            }
        }
        AnimationDrawable animationDrawable = this.f36937c;
        if (animationDrawable == null) {
            LogUtil.j("Suggestion_CalorieHeartViewHolder", "startCalorieFiresAnim mCalorieFireAnim == null");
            return;
        }
        if (animationDrawable.isRunning()) {
            LogUtil.j("Suggestion_CalorieHeartViewHolder", "startCalorieFiresAnim mCalorieFireAnim isRunning");
            return;
        }
        this.f36937c.start();
        this.j.sendEmptyMessageDelayed(10001, this.f36937c.getNumberOfFrames() * this.f36937c.getDuration(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f36937c.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f36935a.setImageResource(R.drawable.fitness_equip_calorie_fire_loop);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.f36935a.setScaleX(-1.0f);
        }
        if (this.f36935a.getDrawable() instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.f36935a.getDrawable();
            this.f36937c = animationDrawable;
            animationDrawable.setOneShot(false);
            this.f36937c.start();
        }
    }

    private void f(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.e.getMax() == 0) {
            LogUtil.e("Suggestion_CalorieHeartViewHolder", "mCalorieProgressBar.getMax() == 0");
        } else {
            layoutParams.setMarginStart((int) ((i / (this.e.getMax() * 1.0f)) * this.q));
            this.f36935a.setLayoutParams(layoutParams);
        }
    }

    public View a() {
        return this.u;
    }

    public void c(float f, float f2) {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        ibm.a(this.d, f, f2, 300);
    }

    public void c() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public void g(int i) {
        if (i != this.l) {
            this.e.setProgress(i, true);
            h(i);
            f(i);
        }
        this.l = i;
    }

    private void h(int i) {
        if (i / (this.e.getMax() * 1.0f) > 0.15f) {
            b();
            this.i = true;
        }
    }

    public void c(int i) {
        this.e.setMax(i);
    }

    public void e(double d2) {
        this.f36936b.setText(UnitUtil.e(d2, 1, 0));
    }

    public void e(int i) {
        this.aa = i;
    }

    public void i(final int i) {
        if (i > 0 && i < 220) {
            j(0);
            if (this.t.getVisibility() != 0) {
                this.t.setVisibility(0);
            }
            if (this.w.getVisibility() != 0) {
                this.w.setVisibility(0);
            }
            if (this.n.getVisibility() != 0) {
                this.n.setVisibility(0);
            }
            HeartRateConfigHelper heartRateConfigHelper = this.h;
            if (heartRateConfigHelper == null) {
                this.h = new HeartRateConfigHelper(this.aa, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: hmw
                    @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
                    public final void onInitComplete() {
                        this.f36934b.a(i);
                    }
                });
            } else {
                this.n.setText(heartRateConfigHelper.e(i));
                o(this.h.c(i));
            }
            this.g.setText(UnitUtil.e(i, 1, 0));
            return;
        }
        this.g.setText(R.string.sug_string_default);
        this.n.setText("");
        e();
    }

    /* synthetic */ void a(final int i) {
        this.n.post(new Runnable() { // from class: hmv
            @Override // java.lang.Runnable
            public final void run() {
                this.f36933c.d(i);
            }
        });
    }

    /* synthetic */ void d(int i) {
        this.n.setText(this.h.e(i));
        o(this.h.c(i));
    }

    public void b(int i, int i2) {
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        if (this.ac.getVisibility() != 0) {
            this.ac.setVisibility(0);
        }
        this.v.setText(UnitUtil.e(i, 1, 0));
        this.x.setText(UnitUtil.e(i2, 1, 0));
    }

    private void e() {
        this.k.setVisibility(4);
        this.m.setVisibility(4);
        this.p.setVisibility(4);
        this.r.setVisibility(4);
        this.s.setVisibility(4);
        this.o.setImageResource(R.drawable.fitness_equipment_mark_0);
    }

    private void o(int i) {
        e();
        if (i == 0) {
            this.o.setImageResource(R.drawable.fitness_equipment_mark_1);
            this.k.setVisibility(0);
            return;
        }
        if (i == 1) {
            this.o.setImageResource(R.drawable.fitness_equipment_mark_2);
            this.m.setVisibility(0);
            return;
        }
        if (i == 2) {
            this.o.setImageResource(R.drawable.fitness_equipment_mark_3);
            this.p.setVisibility(0);
        } else if (i == 3) {
            this.o.setImageResource(R.drawable.fitness_equipment_mark_4);
            this.r.setVisibility(0);
        } else if (i == 4) {
            this.o.setImageResource(R.drawable.fitness_equipment_mark_5);
            this.s.setVisibility(0);
        } else {
            LogUtil.e("Suggestion_CalorieHeartViewHolder", "setCorserIndex unknow index");
        }
    }

    public void j(int i) {
        this.f.setVisibility(i);
    }
}
