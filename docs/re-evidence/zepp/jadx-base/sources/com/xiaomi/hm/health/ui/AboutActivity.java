package com.xiaomi.hm.health.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.bean.NavigateAgreementType;
import com.huami.account.service.EdmService;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.common.SetTestUrlActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.dataprocess.DataProcessor;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.lightappstore.LightAppStore;
import com.xiaomi.hm.health.utils.Utils;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class AboutActivity extends BaseTitleActivity {
    private static final String A = "CN";
    private static final String y = "AboutActivity";
    private static final String z = "VERSION";
    private ListTile x;

    public class a implements View.OnClickListener {
        private final long[] a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ e d;

        public a(final int val$clickCounts, final long val$duration, final e val$continueClickListener) {
            this.b = val$clickCounts;
            this.c = val$duration;
            this.d = val$continueClickListener;
            this.a = new long[val$clickCounts];
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            long[] jArr = this.a;
            System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
            long[] jArr2 = this.a;
            jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
            if (this.a[0] >= SystemClock.uptimeMillis() - this.c) {
                this.d.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Intent intent) {
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        String strV = v();
        if (TextUtils.isEmpty(strV)) {
            return;
        }
        CustomToast.showLong(this, strV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(View view) {
        Utils.getStatisticInfo(this, HMDeviceType.MILI);
        return true;
    }

    private /* synthetic */ boolean E(View view) {
        SetTestUrlActivity.show(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        startActivity(new Intent(this, (Class<?>) UserInfoPrivacyActivity.class));
    }

    private void G() {
        UserLegalInfoManager.showPage(this, NavigateAgreementType.PRIVACY);
    }

    private void H() {
        UserLegalInfoManager.showPage(this, NavigateAgreementType.AGREEMENT);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.MINE_ABOUT_PRIVACY_VIEW_NUM));
    }

    private void I() {
        UserLegalInfoManager.showPage(this, NavigateAgreementType.USER_DATA_RIGHT);
    }

    private void J() {
        u(R.id.about_app_icon, 7, 5000L, new e() { // from class: com.xiaomi.hm.health.ui.b
            @Override // com.xiaomi.hm.health.ui.e
            public final void a() {
                this.a.x();
            }
        });
        u(R.id.icon_layout, 7, 5000L, new e() { // from class: com.xiaomi.hm.health.ui.a
            @Override // com.xiaomi.hm.health.ui.e
            public final void a() {
                this.a.z();
            }
        });
    }

    private void K() {
        if (GlobalConfig.get().isBuildInner()) {
            final Intent intentAddCategory = new Intent("com.xiaomi.hm.health.DEVELOP").addCategory("android.intent.category.DEFAULT");
            if (getPackageManager().resolveActivity(intentAddCategory, 0) == null) {
                return;
            }
            u(R.id.about_app_icon, 5, 3000L, new e() { // from class: com.xiaomi.hm.health.ui.c
                @Override // com.xiaomi.hm.health.ui.e
                public final void a() {
                    this.a.A(intentAddCategory);
                }
            });
        }
    }

    private void L() {
        final EdmService edmService = (EdmService) KoinJavaComponent.get(EdmService.class);
        ListTile listTile = (ListTile) findViewById(R.id.item_edm);
        listTile.setVisibility(edmService.shouldShowEdm(SelectAreaHelper.getAreaBySave()) ? 0 : 8);
        listTile.setChecked(edmService.isEdmChecked());
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                edmService.updateEdmStatus(z2);
            }
        });
    }

    private void M() {
        if (GlobalConfig.get().isBuildInner()) {
            this.x.setOnClickListener(new View.OnClickListener() { // from class: p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.C(view);
                }
            });
        }
    }

    private void N() {
        ((TextView) findViewById(R.id.app_name)).setText(R.string.app_name);
        this.x = (ListTile) findViewById(R.id.app_version);
        M();
        ((ListTile) findViewById(R.id.algo_version)).setTips(DataProcessor.getVersion());
        findViewById(R.id.about_app_icon).setOnLongClickListener(new View.OnLongClickListener() { // from class: r
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.a.D(view);
            }
        });
        K();
        J();
        ((ListTile) findViewById(R.id.user_data_security_and_privacy)).setOnClickListener(new View.OnClickListener() { // from class: q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.F(view);
            }
        });
        L();
    }

    private void u(int resId, int clickCounts, long duration, e continueClickListener) {
        findViewById(resId).setOnClickListener(new a(clickCounts, duration, continueClickListener));
    }

    private String v() {
        if (TextUtils.isEmpty(z)) {
            return "";
        }
        try {
            InputStream inputStreamOpen = getAssets().open(z);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return new String(bArr);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        LightAppStore.INSTANCE.saveDeveloperModeValue(true);
        new AlertDialogFragment.Builder(this).setMessage(R.string.app_developer_mode_open_toast).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        LightAppStore.INSTANCE.saveDeveloperModeValue(true);
        new AlertDialogFragment.Builder(this).setMessage(R.string.app_developer_mode_open_toast).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.title_activity_about));
        N();
        Analytics.recordEvent(new CountEventBuilder("About_ViewNum"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.recordEvent(new CountEventBuilder("About_ViewNum"));
        try {
            this.x.setTips(getPackageManager().getPackageInfo(getPackageName(), 0).versionName.replace("-play", ""));
        } catch (PackageManager.NameNotFoundException e) {
            HMLog.info(y, new Function0() { // from class: t
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return e.toString();
                }
            });
        }
    }
}
