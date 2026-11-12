package com.xiaomi.hm.health.manager.nightmode;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Route;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.module.darkmode.AppNightModeHelper;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.ActivityNightSettingModeBinding;
import com.xiaomi.hm.health.manager.nightmode.NightModeSettingActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Route({"setting/NightModeSettingActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/manager/nightmode/NightModeSettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initView", "t", DTransferConstants.SEARCH_KEY, "", "nightMode", "", GoogleApiAvailabilityLight.b, "mode", SOAP.XMLNS, "Landroid/app/Activity;", "activity", b.r, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/databinding/ActivityNightSettingModeBinding;", "a", "Lcom/xiaomi/hm/health/databinding/ActivityNightSettingModeBinding;", "binding", "b", LogUtil.I, "lastMode", "c", "selectMode", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NightModeSettingActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivityNightSettingModeBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int lastMode = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int selectMode = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(NightModeSettingActivity nightModeSettingActivity, View view) {
        nightModeSettingActivity.selectMode = -1;
        nightModeSettingActivity.t();
    }

    private final void initView() {
        ActivityNightSettingModeBinding activityNightSettingModeBinding = this.binding;
        Objects.requireNonNull(activityNightSettingModeBinding);
        activityNightSettingModeBinding.modeSettingSystem.setTrailing((Drawable) null);
        activityNightSettingModeBinding.modeSettingNight.setTrailing((Drawable) null);
        activityNightSettingModeBinding.modeSettingNormal.setTrailing((Drawable) null);
        int nightMode = AppNightModeHelper.getNightMode();
        this.selectMode = nightMode;
        this.lastMode = nightMode;
        t();
        activityNightSettingModeBinding.modeSettingSystem.setOnClickListener(new View.OnClickListener() { // from class: if5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSettingActivity.i(this.a, view);
            }
        });
        activityNightSettingModeBinding.modeSettingNormal.setOnClickListener(new View.OnClickListener() { // from class: hf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSettingActivity.j(this.a, view);
            }
        });
        activityNightSettingModeBinding.modeSettingNight.setOnClickListener(new View.OnClickListener() { // from class: gf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSettingActivity.k(this.a, view);
            }
        });
        activityNightSettingModeBinding.modeSettingTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: jf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NightModeSettingActivity.l(this.a, view);
            }
        });
        activityNightSettingModeBinding.modeSettingTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: kf5
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                NightModeSettingActivity.m(this.a, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(NightModeSettingActivity nightModeSettingActivity, View view) {
        nightModeSettingActivity.selectMode = 1;
        nightModeSettingActivity.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(NightModeSettingActivity nightModeSettingActivity, View view) {
        nightModeSettingActivity.selectMode = 2;
        nightModeSettingActivity.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(NightModeSettingActivity nightModeSettingActivity, View view) {
        nightModeSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(NightModeSettingActivity nightModeSettingActivity, View view, int i) {
        if (nightModeSettingActivity.lastMode == nightModeSettingActivity.selectMode) {
            nightModeSettingActivity.finish();
        } else {
            nightModeSettingActivity.q();
        }
    }

    @ColorInt
    private final int n(boolean nightMode) {
        if (nightMode) {
            return ContextCompat.getColor(this, R.color.p3);
        }
        return 0;
    }

    public static /* synthetic */ int o(NightModeSettingActivity nightModeSettingActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return nightModeSettingActivity.n(z);
    }

    private final void p(Activity activity) {
        Router.build("launch/StartUpActivity").addFlags(268468224).go(activity);
    }

    private final void q() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.app_night_mode_message).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ff5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NightModeSettingActivity.r(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(NightModeSettingActivity nightModeSettingActivity, DialogInterface dialogInterface, int i) {
        nightModeSettingActivity.s(nightModeSettingActivity.selectMode);
    }

    private final void s(int mode) {
        AppNightModeHelper.setNightMode(mode);
        p(this);
    }

    private final void t() {
        ActivityNightSettingModeBinding activityNightSettingModeBinding = this.binding;
        Objects.requireNonNull(activityNightSettingModeBinding);
        activityNightSettingModeBinding.modeSettingSystem.setLeadingTint(n(this.selectMode == -1));
        activityNightSettingModeBinding.modeSettingNight.setLeadingTint(n(this.selectMode == 2));
        activityNightSettingModeBinding.modeSettingNormal.setLeadingTint(n(this.selectMode == 1));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        ActivityNightSettingModeBinding activityNightSettingModeBindingInflate = ActivityNightSettingModeBinding.inflate(getLayoutInflater());
        this.binding = activityNightSettingModeBindingInflate;
        Objects.requireNonNull(activityNightSettingModeBindingInflate);
        setContentView(activityNightSettingModeBindingInflate.getRoot());
        initView();
    }
}
