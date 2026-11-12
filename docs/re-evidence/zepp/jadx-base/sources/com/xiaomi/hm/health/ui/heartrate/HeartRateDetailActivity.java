package com.xiaomi.hm.health.ui.heartrate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.timepicker.TimeModel;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseui.widget.SportHeartRateView;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.eventbus.EventDeleteHeartRate;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.heartrate.HeartRateDetailActivity;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class HeartRateDetailActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String A = "HeartRateDetailActivity";
    private static final String B = "EXTRA_HEART_RATE";
    private HRDataManager x;
    private HeartRate y;
    private TextView z;

    private void findViews() {
        this.z = (TextView) findViewById(R.id.hr);
        HeartRate heartRate = this.y;
        if (heartRate == null || heartRate.getDevice_source() == null || this.y.getDevice_source().intValue() != HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
            findViewById(R.id.delete).setOnClickListener(this);
        } else {
            findViewById(R.id.delete).setVisibility(8);
        }
    }

    public static void launch(Context context, HeartRate hr) {
        Intent intent = new Intent(context, (Class<?>) HeartRateDetailActivity.class);
        intent.putExtra(B, hr);
        context.startActivity(intent);
    }

    public static void launchForResult(Fragment context, HeartRate hr, int deleteHrRequestCode) {
        Intent intent = new Intent(context.getContext(), (Class<?>) HeartRateDetailActivity.class);
        intent.putExtra(B, hr);
        context.startActivityForResult(intent, deleteHrRequestCode);
    }

    private void o() {
        this.y.setState(2);
        this.x.s(this.y);
        this.x.deleteFromServer();
        EventBus.getDefault().post(new EventDeleteHeartRate(this.y));
        Analytics.event(this, StatEvent.EventId.CHART_HEARTDELETENUM);
        setResult(-1, new Intent());
        finish();
    }

    private int p() {
        return HMPersonInfo.getInstance().getUserInfo().getAge();
    }

    private void q() {
        WeightFigureView weightFigureView = (WeightFigureView) findViewById(R.id.hr_figure_view);
        if (!s()) {
            weightFigureView.setVisibility(8);
            return;
        }
        weightFigureView.setVisibility(0);
        weightFigureView.setLabelTextSize(12.0f);
        weightFigureView.setScaleTextSize(12.0f);
        weightFigureView.setScaleTextColor(ContextCompat.getColor(this, R.color.black40));
        weightFigureView.setInitValue(this.y.getHr().intValue());
        weightFigureView.requestLayout();
        float fP = 220 - p();
        float[] fArr = {Math.round(0.5f * fP), Math.round(0.6f * fP), Math.round(0.7f * fP), Math.round(0.8f * fP), Math.round(0.9f * fP), fP};
        int[] iArr = {ContextCompat.getColor(this, R.color.hr_tape_warm_up), ContextCompat.getColor(this, R.color.hr_tape_fat_burn), ContextCompat.getColor(this, R.color.hr_tape_lung_strength), ContextCompat.getColor(this, R.color.hr_tape_stamina_strength), ContextCompat.getColor(this, R.color.hr_tape_anaerobic_limit)};
        weightFigureView.setValues(fArr, iArr, getResources().getStringArray(R.array.hr_sport_new), iArr);
        weightFigureView.setListener(new Function1() { // from class: sy3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartRateDetailActivity.t((Float) obj);
            }
        });
    }

    private void r() {
        SportHeartRateView sportHeartRateView = (SportHeartRateView) findViewById(R.id.hr_sport_view);
        if (s()) {
            sportHeartRateView.setVisibility(8);
            return;
        }
        sportHeartRateView.setVisibility(0);
        int iP = 220 - p();
        float f = iP;
        int iRound = Math.round(0.5f * f);
        int iRound2 = Math.round(0.6f * f);
        int iRound3 = Math.round(0.7f * f);
        int iRound4 = Math.round(0.8f * f);
        int iRound5 = Math.round(f * 0.9f);
        String[] stringArray = getResources().getStringArray(R.array.hr_sport_new);
        SportHeartRateView.Builder builder = new SportHeartRateView.Builder(sportHeartRateView);
        builder.scaleTextSize(getResources().getDimension(R.dimen.font_size_v2_f4) / Utils.getDensity(this)).bezierLineColor(ContextCompat.getColor(this, R.color.bezier_line_color)).heartBmp(R.drawable.icon_red_heart).scaleValue(new int[]{iRound, iRound2, iRound3, iRound4, iRound5, iP}).textXScaleColor(ContextCompat.getColor(this, R.color.black_40_percent)).lableTextSize(getResources().getDimension(R.dimen.DetailInfoUnitTextSize) / Utils.getDensity(this)).scaleTextSize(getResources().getDimension(R.dimen.DetailInfoUnitTextSize) / Utils.getDensity(this)).textLableColor(ContextCompat.getColor(this, R.color.black_40_percent)).xScaleLineColor(ContextCompat.getColor(this, R.color.scale_line_color)).areaColor(ContextCompat.getColor(this, R.color.area_color)).build();
        builder.lables(stringArray);
        sportHeartRateView.setBuilder(builder);
        sportHeartRateView.setHeartRateValue(this.y.getHr().intValue());
        if (Utils.isMiMax(this) || Utils.isMiNote(this)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) sportHeartRateView.getLayoutParams();
            layoutParams.topMargin = (int) ViewUtils.dp2px(this, 60.0f);
            sportHeartRateView.setLayoutParams(layoutParams);
        }
    }

    private boolean s() {
        return getResources().getConfiguration().locale.getLanguage().contains("zh");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(Float f) {
        return f.intValue() + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(DialogInterface dialogInterface, int i) {
        o();
    }

    private void w() {
        this.y = (HeartRate) getIntent().getSerializableExtra(B);
        HMLog.d(A, "hr:" + this.y.getHr(), new Object[0]);
    }

    private void x() {
        if (GlobalConfig.get().isBuildMidong()) {
            getTitleTextView().setTextSize(16.0f);
            getTitleTextView().setGravity(17);
            ViewGroup.LayoutParams layoutParams = ((RelativeLayout) getTitleTextView().getParent()).getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            getTitleTextView().setLayoutParams(layoutParams);
        }
        findViews();
        z();
        q();
        r();
    }

    private void y() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.hr_delete_title).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ry3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HeartRateDetailActivity.u(dialogInterface, i);
            }
        }).setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() { // from class: qy3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void z() {
        HeartRate heartRate = this.y;
        this.z.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, heartRate.getHr()));
        setTitleText(getString(R.string.hr_heartrate_format, new Object[]{TimeUtils.formatDateTime_no_y(BraceletApp.getContext(), heartRate.getTime().longValue() * 1000, false)}));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (v.getId() == R.id.delete) {
            y();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate_detail);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_SHARE, ContextCompat.getColor(this, R.color.white), getString(R.string.hr_heartrate), true);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.heart_rate_color333));
        w();
        this.x = HRDataManager.getInstance();
        x();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onShareClicked(View view) {
        ShareHeartRateActivity.launch(this, this.y);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.event(this, StatEvent.EventId.CHART_HEART_DETAIL_NUM);
    }
}
