package com.huami.moving.ui.offcut;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.R;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.ui.SettingActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public class RunningHelpActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final int START_FROM_DEFAULT = -1;
    public static final int START_FROM_RUNNING_DETAIL = 0;
    public static final int START_FROM_RUNNING_SETTING = 1;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private TextView G;
    private ViewStub H;
    private View I;
    private ViewStub J;
    private View K;
    private ViewStub L;
    private View M;
    private ViewStub N;
    private View O;
    private ViewStub P;
    private View Q;
    private ViewStub R;
    private View S;
    private ViewStub T;
    private View U;
    private ViewStub V;
    private View W;
    private String r0;
    private String s0;
    private String t0;
    private String u0;
    private String v0;
    private int w0;
    private ScrollView y;
    private TextView z;
    private final RunningHelpActivity x = this;
    private boolean X = false;
    private boolean Y = false;
    private boolean Z = false;
    private boolean m0 = false;
    private boolean n0 = false;
    private boolean o0 = false;
    private boolean p0 = false;
    private boolean q0 = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.z.getLocationOnScreen(iArr);
            RunningHelpActivity.this.w0 = iArr[1];
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.A.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.B.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.C.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.D.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.E.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.F.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            RunningHelpActivity.this.G.getLocationOnScreen(iArr);
            RunningHelpActivity.this.y.smoothScrollBy(0, iArr[1] - RunningHelpActivity.this.w0);
        }
    }

    private void initView() {
        this.y = (ScrollView) findViewById(R.id.helpContainer);
        TextView textView = (TextView) findViewById(R.id.paceTitle);
        this.z = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.heartRateTitle);
        this.A = textView2;
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(R.id.strideFreqTitle);
        this.B = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.forefeetTitle);
        this.C = textView4;
        textView4.setOnClickListener(this);
        TextView textView5 = (TextView) findViewById(R.id.strideTitle);
        this.D = textView5;
        textView5.setOnClickListener(this);
        TextView textView6 = (TextView) findViewById(R.id.upHillTitle);
        this.E = textView6;
        textView6.setOnClickListener(this);
        TextView textView7 = (TextView) findViewById(R.id.touchDownTitle);
        this.F = textView7;
        textView7.setOnClickListener(this);
        TextView textView8 = (TextView) findViewById(R.id.flightRatioTitle);
        this.G = textView8;
        textView8.setOnClickListener(this);
        this.H = (ViewStub) findViewById(R.id.paceDetail);
        this.J = (ViewStub) findViewById(R.id.heartRateDetail);
        this.L = (ViewStub) findViewById(R.id.strideFreqDetail);
        this.N = (ViewStub) findViewById(R.id.forefeetDetail);
        this.P = (ViewStub) findViewById(R.id.strideDetail);
        this.T = (ViewStub) findViewById(R.id.touchDownDetail);
        this.V = (ViewStub) findViewById(R.id.flightRatioDetail);
        this.R = (ViewStub) findViewById(R.id.upHillDetail);
        this.y.post(new a());
    }

    private void w() {
    }

    private void x() {
        TextView textView = (TextView) this.K.findViewById(R.id.relax);
        TextView textView2 = (TextView) this.K.findViewById(R.id.fatBurning);
        TextView textView3 = (TextView) this.K.findViewById(R.id.heartLungStrengthen);
        TextView textView4 = (TextView) this.K.findViewById(R.id.staminaStrengthen);
        TextView textView5 = (TextView) this.K.findViewById(R.id.anaerobicLimit);
        textView.setText(this.r0);
        textView2.setText(this.s0);
        textView3.setText(this.t0);
        textView4.setText(this.u0);
        textView5.setText(this.v0);
        ((TextView) this.K.findViewById(R.id.running_help_heart_rate_display_prompt)).setText(getString(R.string.running_help_heart_rate_display_prompt, new Object[]{getString(R.string.web_title_mili_pro), getString(R.string.device_mili_1s)}));
    }

    private void y() {
        int age = 220 - RunnerData.getRunner().getAge();
        double d2 = age;
        int iIntValue = new BigDecimal(0.5d * d2).setScale(0, 4).intValue();
        int iIntValue2 = new BigDecimal(0.6d * d2).setScale(0, 4).intValue();
        int iIntValue3 = new BigDecimal(0.7d * d2).setScale(0, 4).intValue();
        int iIntValue4 = new BigDecimal(0.8d * d2).setScale(0, 4).intValue();
        int iIntValue5 = new BigDecimal(d2 * 0.9d).setScale(0, 4).intValue();
        this.r0 = iIntValue + Constants.ACCEPT_TIME_SEPARATOR_SERVER + iIntValue2;
        this.s0 = (iIntValue2 + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + iIntValue3;
        this.t0 = (iIntValue3 + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + iIntValue4;
        this.u0 = (iIntValue4 + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + iIntValue5;
        this.v0 = (iIntValue5 + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + age;
    }

    private void z() {
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(SettingActivity.START_FROM, -1);
        if (intExtra != 0) {
            if (intExtra != 1) {
                return;
            }
            this.K = this.J.inflate();
            x();
            this.Y = true;
            w();
            return;
        }
        this.I = this.H.inflate();
        this.X = true;
        boolean booleanExtra = intent.getBooleanExtra("SHOW_FOREFEET_ITEM", false);
        boolean booleanExtra2 = intent.getBooleanExtra("SHOW_MIJIA_SHOE", false);
        if (booleanExtra) {
            this.C.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
        } else if (booleanExtra2) {
            this.C.setVisibility(0);
            this.F.setVisibility(0);
            this.G.setVisibility(0);
        } else {
            this.C.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.paceTitle) {
            if (this.X) {
                this.I.setVisibility(8);
                this.X = false;
                return;
            }
            Analytics.event(this.x, SportAnalytics.EVENT_RUNNING_HELP_CLICK_TIPS_ITEM, "Pace");
            View view2 = this.I;
            if (view2 == null) {
                this.I = this.H.inflate();
            } else {
                view2.setVisibility(0);
            }
            this.X = true;
            return;
        }
        if (id == R.id.heartRateTitle) {
            if (this.Y) {
                this.K.setVisibility(8);
                this.Y = false;
                return;
            }
            Analytics.event(this.x, SportAnalytics.EVENT_RUNNING_HELP_CLICK_TIPS_ITEM, "HR");
            View view3 = this.K;
            if (view3 == null) {
                this.K = this.J.inflate();
            } else {
                view3.setVisibility(0);
            }
            x();
            this.Y = true;
            this.y.post(new b());
            return;
        }
        if (id == R.id.strideFreqTitle) {
            if (this.Z) {
                this.M.setVisibility(8);
                this.Z = false;
                return;
            }
            Analytics.event(this.x, SportAnalytics.EVENT_RUNNING_HELP_CLICK_TIPS_ITEM, "StrideRate");
            View view4 = this.M;
            if (view4 == null) {
                this.M = this.L.inflate();
            } else {
                view4.setVisibility(0);
            }
            this.Z = true;
            this.y.post(new c());
            return;
        }
        if (id == R.id.forefeetTitle) {
            if (this.m0) {
                this.O.setVisibility(8);
                this.m0 = false;
                return;
            }
            Analytics.event(this.x, SportAnalytics.EVENT_RUNNING_HELP_CLICK_TIPS_ITEM, "Forefoot");
            View view5 = this.O;
            if (view5 == null) {
                this.O = this.N.inflate();
            } else {
                view5.setVisibility(0);
            }
            this.m0 = true;
            this.y.post(new d());
            return;
        }
        if (id == R.id.strideTitle) {
            if (this.n0) {
                this.Q.setVisibility(8);
                this.n0 = false;
                return;
            }
            Analytics.event(this.x, SportAnalytics.EVENT_RUNNING_HELP_CLICK_TIPS_ITEM, "Stride");
            View view6 = this.Q;
            if (view6 == null) {
                this.Q = this.P.inflate();
            } else {
                view6.setVisibility(0);
            }
            this.n0 = true;
            this.y.post(new e());
            return;
        }
        if (id == R.id.upHillTitle) {
            if (this.q0) {
                this.S.setVisibility(8);
                this.q0 = false;
                return;
            }
            Analytics.event(this.x, SportAnalytics.EVENT_RUNNING_HELP_CLICK_TIPS_ITEM, "Uphill");
            View view7 = this.S;
            if (view7 == null) {
                this.S = this.R.inflate();
            } else {
                view7.setVisibility(0);
            }
            this.q0 = true;
            this.y.post(new f());
            return;
        }
        if (id == R.id.touchDownTitle) {
            if (this.o0) {
                this.U.setVisibility(8);
                this.o0 = false;
                return;
            }
            View view8 = this.U;
            if (view8 == null) {
                this.U = this.T.inflate();
            } else {
                view8.setVisibility(0);
            }
            this.o0 = true;
            this.y.post(new g());
            return;
        }
        if (id == R.id.flightRatioTitle) {
            if (this.p0) {
                this.W.setVisibility(8);
                this.p0 = false;
                return;
            }
            View view9 = this.W;
            if (view9 == null) {
                this.W = this.V.inflate();
            } else {
                view9.setVisibility(0);
            }
            this.p0 = true;
            this.y.post(new h());
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_running_help);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.running_title_bar_text_color));
        getTitleTextView().setTextSize(0, getResources().getDimension(R.dimen.running_title_bar_text_size));
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.running_primary_color), getString(R.string.running_help));
        Analytics.event(SportAnalytics.EVENT_RUNNING_HELP_TIPS_VIEW_NUM);
        initView();
        y();
        z();
    }
}
