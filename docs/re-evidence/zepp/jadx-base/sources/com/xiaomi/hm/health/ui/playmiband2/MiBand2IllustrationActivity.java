package com.xiaomi.hm.health.ui.playmiband2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes22.dex */
public class MiBand2IllustrationActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String J = "MiBand2IllustrationActivity";
    private ScrollView x = null;
    private ViewStub y = null;
    private View z = null;
    private TextView A = null;
    private ViewStub B = null;
    private View C = null;
    private TextView D = null;
    private ViewStub E = null;
    private View F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MiBand2IllustrationActivity.this.x.smoothScrollBy(0, (int) (MiBand2IllustrationActivity.this.A.getY() - MiBand2IllustrationActivity.this.x.getScrollY()));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMLog.i(MiBand2IllustrationActivity.J, "scrollBy: " + (MiBand2IllustrationActivity.this.D.getY() - MiBand2IllustrationActivity.this.x.getScrollY()), new Object[0]);
            MiBand2IllustrationActivity.this.x.smoothScrollBy(0, (int) (MiBand2IllustrationActivity.this.D.getY() - ((float) MiBand2IllustrationActivity.this.x.getScrollY())));
        }
    }

    private void initViews() {
        this.x = (ScrollView) findViewById(R.id.illustration_container);
        TextView textView = (TextView) findViewById(R.id.click_to_see_text);
        this.y = (ViewStub) findViewById(R.id.click_to_see_detail);
        textView.setOnClickListener(this);
        this.A = (TextView) findViewById(R.id.step_reach_goal_alert);
        this.B = (ViewStub) findViewById(R.id.step_reach_goal_alert_detail);
        this.A.setOnClickListener(this);
        this.D = (TextView) findViewById(R.id.band_alert_text);
        this.E = (ViewStub) findViewById(R.id.band_alert_detail);
        this.D.setOnClickListener(this);
    }

    public static void launch(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MiBand2IllustrationActivity.class));
    }

    private void o(int marginTop, TextView textView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.topMargin = marginTop;
        textView.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.click_to_see_text) {
            if (this.G) {
                o((int) ViewUtils.dp2px(this, 16.7f), this.A);
                this.z.setVisibility(8);
                this.G = false;
                return;
            } else {
                o(0, this.A);
                View view = this.z;
                if (view == null) {
                    this.z = this.y.inflate();
                } else {
                    view.setVisibility(0);
                }
                this.G = true;
                return;
            }
        }
        if (id == R.id.step_reach_goal_alert) {
            if (this.H) {
                o((int) ViewUtils.dp2px(this, 16.7f), this.D);
                this.C.setVisibility(8);
                this.H = false;
                return;
            }
            o(0, this.D);
            View view2 = this.C;
            if (view2 == null) {
                this.C = this.B.inflate();
            } else {
                view2.setVisibility(0);
            }
            this.H = true;
            this.x.post(new a());
            return;
        }
        if (id == R.id.band_alert_text) {
            if (this.I) {
                this.F.setVisibility(8);
                this.I = false;
                return;
            }
            View view3 = this.F;
            if (view3 == null) {
                this.F = this.E.inflate();
            } else {
                view3.setVisibility(0);
            }
            this.I = true;
            this.x.post(new b());
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.common_light_color));
        setTitleText(getString(R.string.mili_pro_illustration_title, new Object[]{getString(R.string.mili_settting_mili_pro)}));
        setContentView(R.layout.activity_milipro_illustration);
        initViews();
    }
}
