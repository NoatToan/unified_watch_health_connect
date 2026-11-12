package com.xiaomi.hm.health.ui.heartrate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.timepicker.TimeModel;
import com.huami.lib.ShareType;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.v2.RequestMultiplePermissionCallback;
import com.huami.lib.v2.SharePermissionManager;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.ui.heartrate.ShareHeartRateActivity;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class ShareHeartRateActivity extends BaseFragmentActivity implements PreShareListener {
    private static final String l = "EXTRA_HEART_RATE";
    private TextView a;
    private TextView b;
    private HeartRate c;
    private View d;
    private ImageView e;
    private TextView f;
    private SharePermissionManager g;
    private SharePanel h;
    private View i;
    private View j;
    private View k;

    public class a extends RequestMultiplePermissionCallback {
        public a() {
        }

        @Override // com.huami.lib.v2.RequestMultiplePermissionCallback
        public void onPermissionGranted(@NonNull List<String> permissions) {
            ShareHeartRateActivity.this.q();
        }
    }

    private void g(HeartRate heartRate) {
        if (heartRate != null) {
            this.a.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, heartRate.getHr()));
            this.b.setText(TimeUtils.formatDateTime_no_y(BraceletApp.getContext(), heartRate.getTime().longValue() * 1000, false));
        }
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        this.f.setText(userInfo.getNickname());
        AvatarManager.updateAvatarUI(this, this.e, userInfo.getAvatarPath(), userInfo.getAvatar(), userInfo.getNickname());
    }

    private ShareContent h() {
        final ShareContent shareContent = new ShareContent();
        shareContent.content = "";
        shareContent.title = getString(R.string.app_name);
        shareContent.topic = getString(R.string.share_topic);
        shareContent.bitmapUrl = Utils.captureViewShare(this.i, this);
        HMLog.debug(SportAnalytics.Params.VALUE_SHARE, new Function0() { // from class: os6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ShareHeartRateActivity.k(shareContent);
            }
        });
        return shareContent;
    }

    private void i() {
        this.j.setVisibility(0);
        this.k.setVisibility(8);
    }

    private void j() {
        if (findViewById(R.id.share_pane_container) == null) {
            return;
        }
        this.i = findViewById(R.id.content_layout);
        this.j = findViewById(R.id.share_logo);
        this.k = findViewById(R.id.share_pane_container);
        this.h = new SharePanel();
        Bundle bundle = new Bundle();
        if (RainbowUtils.isDarkMode(this)) {
            bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.s38));
        } else {
            bundle.putInt(SharePanel.ARG_BG_COLOR, ContextCompat.getColor(this, R.color.s4));
        }
        bundle.putBoolean("share_type", true);
        this.h.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.share_pane_container, this.h);
        this.h.setShareListener(this);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(ShareContent shareContent) {
        return "bitmapUrl = " + shareContent.bitmapUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.j.setVisibility(0);
        this.k.setVisibility(8);
        this.d.setVisibility(8);
        this.h.onSharePrepared(h());
        this.k.setVisibility(0);
        this.d.setVisibility(0);
        this.j.setVisibility(4);
    }

    public static void launch(Context context, HeartRate hr) {
        Intent intent = new Intent(context, (Class<?>) ShareHeartRateActivity.class);
        intent.putExtra(l, hr);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        finish();
    }

    private void n() {
        this.c = (HeartRate) getIntent().getSerializableExtra(l);
    }

    private void o(@ColorRes int background) {
        this.i.setBackgroundColor(ContextCompat.getColor(this, background));
    }

    private void p() {
        this.a = (TextView) findViewById(R.id.value);
        this.b = (TextView) findViewById(R.id.date);
        this.d = findViewById(R.id.back_button);
        this.e = (ImageView) findViewById(R.id.user_avatar);
        this.f = (TextView) findViewById(R.id.user_nickname);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: ms6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.title_bar);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.topMargin = ViewUtils.getStatusBarHeight(this);
        frameLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.j.setVisibility(8);
        this.k.setVisibility(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_heart_rate);
        StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
        n();
        p();
        j();
        if (RainbowUtils.isDarkMode(this)) {
            findViewById(R.id.share_bar_bg).setVisibility(8);
            o(R.color.s10);
        } else {
            findViewById(R.id.share_bar_bg).setVisibility(0);
            o(R.color.s38);
        }
        SharePermissionManager.requestSharePermission(this, ShareType.HEART_RATE, new a());
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(int shareType) {
        runOnUiThread(new Runnable() { // from class: ns6
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SHARE_HEART_VIEW_NUM));
        if (SharePermissionManager.hasSharePermission(this)) {
            q();
        } else {
            i();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        g(this.c);
    }
}
