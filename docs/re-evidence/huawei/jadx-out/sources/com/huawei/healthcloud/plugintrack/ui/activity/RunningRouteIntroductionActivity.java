package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.jxj;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteIntroductionActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f10858b;

    enum NoteIndex {
        TITLE_INDEX_ONE(1),
        TITLE_INDEX_TWO(2),
        TITLE_INDEX_THREE(3),
        TITLE_INDEX_FOUR(4),
        TITLE_INDEX_FIVE(5),
        TITLE_INDEX_SIX(6),
        TITLE_INDEX_SEVEN(7);

        private final int mIndex;

        NoteIndex(int i) {
            this.mIndex = i;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("RunningRouteIntroductionActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.activity_running_route_introduction);
        c();
    }

    private void c() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.running_route_introduction_titlebar);
        this.f10858b = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_lactate_tittlebar_top));
        ((ConstraintLayout) findViewById(R.id.cn_layout)).setVisibility(0);
        qsp.b((TextView) findViewById(R.id.introduction_question_1), getResources().getString(R.string.IDS_running_route_introduction_q1, Integer.valueOf(NoteIndex.TITLE_INDEX_ONE.mIndex)));
        qsp.b((TextView) findViewById(R.id.introduction_q_2), getResources().getString(R.string.IDS_running_route_introduction_q2, Integer.valueOf(NoteIndex.TITLE_INDEX_TWO.mIndex)));
        qsp.b((TextView) findViewById(R.id.introduction_q_3), getResources().getString(R.string.IDS_running_route_introduction_q3, Integer.valueOf(NoteIndex.TITLE_INDEX_THREE.mIndex)));
        qsp.b((TextView) findViewById(R.id.introduction_q_4), getResources().getString(R.string.IDS_running_route_introduction_q4, Integer.valueOf(NoteIndex.TITLE_INDEX_FOUR.mIndex)));
        qsp.b((TextView) findViewById(R.id.introduction_question_2), getResources().getString(R.string.IDS_running_route_about_question_q2, Integer.valueOf(NoteIndex.TITLE_INDEX_FIVE.mIndex)));
        qsp.b((TextView) findViewById(R.id.introduction_question_3), getResources().getString(R.string.IDS_running_route_about_question_q3, Integer.valueOf(NoteIndex.TITLE_INDEX_SIX.mIndex)));
        qsp.b((TextView) findViewById(R.id.introduction_a_1), getResources().getString(R.string.IDS_running_route_introduction_a2, UnitUtil.e(60.0d, 2, 0)));
        qsp.b((TextView) findViewById(R.id.introduction_a_3), getResources().getString(R.string.IDS_running_route_introduction_a3, 10));
        d(findViewById(R.id.introduction_route_small_image), jxj.c("running_route_introduction_route_small"));
        if (!Utils.o()) {
            d(findViewById(R.id.introduction_route_draw_image), jxj.c("running_route_introduction_route_draw"));
        }
        d(findViewById(R.id.introduction_draw_small_image), jxj.c("running_route_introduction_draw_small"));
    }

    private void d(View view, Drawable drawable) {
        if (view == null) {
            return;
        }
        if (drawable == null) {
            view.setVisibility(8);
        } else if (view instanceof ImageView) {
            qsp.a((ImageView) view, drawable);
            view.setVisibility(0);
        } else {
            LogUtil.j("RunningRouteIntroductionActivity", "setIntroductionImage not imageview");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
