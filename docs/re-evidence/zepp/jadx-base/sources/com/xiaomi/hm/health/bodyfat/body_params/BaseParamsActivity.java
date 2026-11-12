package com.xiaomi.hm.health.bodyfat.body_params;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.weightfigure.WeightFigureView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamsColorUtils;
import com.xiaomi.hm.health.databases.model.UserInfos;

/* JADX INFO: loaded from: classes19.dex */
public class BaseParamsActivity extends BaseTitleActivity {
    private static final String y = "Params-BaseParamsActivity";
    public String bodyParamsStr;
    public TextView hasFigureTv;
    public int height;
    public Context mContext;
    public WeightFigureView mFigureView;
    public TextView mLevelTv;
    public TextView mUnitTv;
    public UserInfos mUserInfo;
    public TextView mValueTv;
    public TextView noFigureTv;
    public View splitView;
    public long uid;
    public RelativeLayout upView;
    public int weightAge;
    private int x;

    private void initView() {
        this.mValueTv = (TextView) findViewById(R.id.value_tv);
        this.mLevelTv = (TextView) findViewById(R.id.level_tv);
        this.mUnitTv = (TextView) findViewById(R.id.unit_tv);
        this.hasFigureTv = (TextView) findViewById(R.id.has_figureview_tv);
        this.noFigureTv = (TextView) findViewById(R.id.no_figureview_tv);
        this.splitView = findViewById(R.id.split_view);
        WeightFigureView weightFigureView = (WeightFigureView) findViewById(R.id.figure_view);
        this.mFigureView = weightFigureView;
        weightFigureView.setType(1);
        this.mFigureView.setThumbDarkStyle(this);
        this.upView = (RelativeLayout) findViewById(R.id.up_layout);
        ((RelativeLayout) findViewById(R.id.base_layout)).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: wq
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.n();
            }
        });
    }

    private void m() {
        this.mContext = getApplicationContext();
        if (getIntent() != null) {
            this.uid = getIntent().getLongExtra("UID", Long.parseLong(BFCallback.getHMPersonInfo().getUserid()));
            this.mUserInfo = UserInfoManager.getManager().getInfo(this.uid);
            HMLog.d(y, "mUserInfo is " + HMWeightUtils.parserUserInfos(this.mUserInfo), new Object[0]);
            this.bodyParamsStr = getIntent().getStringExtra("body_params");
            this.height = getIntent().getIntExtra("height", -1);
            this.weightAge = getIntent().getIntExtra("weight_age", -1);
            HMLog.d(y, "str = " + this.bodyParamsStr, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int i = getResources().getDisplayMetrics().heightPixels;
        int height = defaultDisplay.getHeight();
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.y;
        } catch (Exception unused) {
        }
        if (this.x != height) {
            HMLog.d(y, "send EventScreenChange mLastShownHeight=" + this.x + ",shownHeight=" + height + ",rowHeight=" + i, new Object[0]);
            p(i - height);
            this.x = height;
        }
    }

    private void o() {
        this.mValueTv.setText(R.string.empty_value);
        this.mValueTv.setTextColor(ContextCompat.getColor(this.mContext, R.color.s3));
        this.mLevelTv.setVisibility(4);
        this.hasFigureTv.setVisibility(8);
        this.noFigureTv.setVisibility(0);
        this.mFigureView.setVisibility(8);
        this.splitView.setVisibility(8);
    }

    private void p(int i) {
        HMLog.d(y, "barHeight = " + i, new Object[0]);
        this.upView.setLayoutParams(new RelativeLayout.LayoutParams(-1, BFCallback.getAppUtils().getRealHeight(this, 316.0f) - i));
    }

    public boolean judgeShowParamsValue() {
        String string = getTitleTextView().getText().toString();
        int i = this.weightAge;
        if (i < 6 || i > 99) {
            o();
            if (this.weightAge < 6) {
                this.noFigureTv.setText(getResources().getQuantityString(R.plurals.no_body_params_for_age_min, 6, 6, string));
            } else {
                this.noFigureTv.setText(getResources().getQuantityString(R.plurals.no_body_params_for_age_max, 99, 99, string));
            }
            return false;
        }
        int i2 = this.height;
        if (i2 < 90 || i2 > 220) {
            o();
            if (this.height < 90) {
                this.noFigureTv.setText(getString(R.string.no_body_params_for_height_min, new Object[]{90, string}));
            } else {
                this.noFigureTv.setText(getString(R.string.no_body_params_for_height_max, new Object[]{220, string}));
            }
            return false;
        }
        if ("--".equals(this.bodyParamsStr)) {
            o();
            this.noFigureTv.setText(getString(R.string.no_body_params_for_no_measure, new Object[]{string}));
            return false;
        }
        this.mValueTv.setText(this.bodyParamsStr);
        this.mValueTv.setTextColor(ContextCompat.getColor(this.mContext, R.color.s5));
        this.mLevelTv.setVisibility(0);
        this.hasFigureTv.setVisibility(0);
        this.noFigureTv.setVisibility(8);
        this.mFigureView.setVisibility(0);
        this.splitView.setVisibility(0);
        return true;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_params);
        Context applicationContext = getApplicationContext();
        this.mContext = applicationContext;
        BFTitleStyleKt.setTitleStyle(this, null, null, BaseTitleActivity.STYLE.SINGLE_TITLE, ContextCompat.getColor(applicationContext, R.color.body_params_title_bg), !RainbowUtils.isDarkMode(this));
        m();
        initView();
    }

    public void updateStatusBarAndUpView(int i) {
        setStyle(BaseTitleActivity.STYLE.SINGLE_BACK, ParamsColorUtils.blendColor(ContextCompat.getColor(this.mContext, i), ContextCompat.getColor(this.mContext, R.color.s1)));
        this.upView.setBackgroundColor(ContextCompat.getColor(this.mContext, i));
    }

    public void updateViewColorNoValues() {
        setStyle(BaseTitleActivity.STYLE.SINGLE_BACK, ContextCompat.getColor(this.mContext, R.color.body_params_title_bg));
        this.upView.setBackgroundColor(ContextCompat.getColor(this.mContext, R.color.body_params_no_values_bg));
    }
}
