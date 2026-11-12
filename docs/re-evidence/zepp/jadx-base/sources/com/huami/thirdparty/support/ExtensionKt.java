package com.huami.thirdparty.support;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003\u001a\u0012\u0010\r\u001a\u00020\u0005*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b\u001a(\u0010\u0013\u001a\u00020\u0012*\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0017\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015\u001a\n\u0010\u001a\u001a\u00020\u0010*\u00020\u0014\u001a\n\u0010\u001b\u001a\u00020\u0010*\u00020\u0014\u001a\n\u0010\u001c\u001a\u00020\u0010*\u00020\u0014\u001a\n\u0010\u001d\u001a\u00020\u0010*\u00020\u0014\u001a\n\u0010\u001e\u001a\u00020\u0010*\u00020\u0014¨\u0006\u001f"}, d2 = {"Landroid/view/View;", "", "color", "", "radius", "", "backgroundRadius", "Landroid/content/Context;", Constant.PAI_KEY_DAILY_PAI, "dp2Px", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "support", "titleColor", "titleSize", "", b.k0, "Landroid/widget/TextView;", "centerTitle", "Landroidx/fragment/app/FragmentActivity;", "", "packageName", "openApp", DbUtils.Const.Table.CONTEXT, "isAppExists", "openGoogleFit", "openStravaApp", "openReliveApp", "openRunKeeperApp", "openTrainingPeaksApp", "support_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "用户没有安装：" + this.a;
        }
    }

    public static final void backgroundRadius(@NotNull View view, int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        ViewCompat.setBackground(view, gradientDrawable);
    }

    public static /* synthetic */ void backgroundRadius$default(View view, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        backgroundRadius(view, i, f);
    }

    @NotNull
    public static final TextView centerTitle(@NotNull Toolbar toolbar, int i, float f, boolean z) {
        TextView textView = new TextView(toolbar.getContext());
        textView.setTextColor(i);
        textView.setText(toolbar.getTitle());
        textView.setTextSize(f);
        textView.getPaint().setFakeBoldText(z);
        textView.setGravity(17);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        toolbar.addView(textView);
        toolbar.setTitle("");
        return textView;
    }

    public static /* synthetic */ TextView centerTitle$default(Toolbar toolbar, int i, float f, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -16777216;
        }
        if ((i2 & 2) != 0) {
            f = 16.0f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return centerTitle(toolbar, i, f, z);
    }

    public static final float dp2Px(@NotNull Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static final boolean isAppExists(@NotNull Context context, @NotNull String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final boolean openApp(@NotNull FragmentActivity fragmentActivity, @NotNull String str) {
        if (!isAppExists(fragmentActivity, str)) {
            HMLog.info("support", new a(str));
            return false;
        }
        Intent launchIntentForPackage = fragmentActivity.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        fragmentActivity.startActivity(launchIntentForPackage);
        return true;
    }

    public static final boolean openGoogleFit(@NotNull FragmentActivity fragmentActivity) {
        return openApp(fragmentActivity, "com.google.android.apps.fitness");
    }

    public static final boolean openReliveApp(@NotNull FragmentActivity fragmentActivity) {
        return openApp(fragmentActivity, "cc.relive.reliveapp");
    }

    public static final boolean openRunKeeperApp(@NotNull FragmentActivity fragmentActivity) {
        return openApp(fragmentActivity, "com.fitnesskeeper.runkeeper.pro");
    }

    public static final boolean openStravaApp(@NotNull FragmentActivity fragmentActivity) {
        return openApp(fragmentActivity, "com.strava");
    }

    public static final boolean openTrainingPeaksApp(@NotNull FragmentActivity fragmentActivity) {
        return openApp(fragmentActivity, "com.peaksware.trainingpeaks");
    }

    public static final void support(@NotNull Toolbar toolbar, @NotNull AppCompatActivity appCompatActivity) {
        appCompatActivity.setSupportActionBar(toolbar);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
        if (supportActionBar2 == null) {
            return;
        }
        supportActionBar2.setDisplayShowHomeEnabled(true);
    }
}
