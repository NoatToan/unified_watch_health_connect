package com.xiaomi.hm.health.apprate;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.apprate.AppRateDialog;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/apprate/AppRateDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/app/Dialog;", "", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onActivityCreated", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "close", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "encourage", "c", "shits", "", GoogleApiAvailabilityLight.a, "()Ljava/lang/String;", "pageName", "<init>", "()V", "Companion", "apprate_release"}, k = 1, mv = {1, 5, 1})
public final class AppRateDialog extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "AppRateDialog";
    private static final float d = 0.9f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ImageView close;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextView encourage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView shits;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/apprate/AppRateDialog$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "show", "", "TAG", "Ljava/lang/String;", "", "WIDTH_PERCENT", "F", "<init>", "()V", "apprate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ IllegalStateException a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IllegalStateException illegalStateException) {
                super(0);
                this.a = illegalStateException;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("AppRateDialog show error: ", this.a.getStackTrace());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void show(@NotNull FragmentActivity activity) {
            if (AppRateManager.INSTANCE.canShowRateDialog(activity)) {
                try {
                    new AppRateDialog().show(activity.getSupportFragmentManager(), AppRateDialog.TAG);
                } catch (IllegalStateException e) {
                    HMLog.info$default(null, new a(e), 1, null);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "想打开小米运动在应用市场的详情页，但找不到应用市场，尝试用https地址让系统处理";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "想打开小米运动在应用市场的详情页（https地址），但找不到浏览器";
        }
    }

    private final String d() {
        FragmentActivity activity = getActivity();
        return activity == null ? "" : activity.getClass().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(AppRateDialog appRateDialog, Dialog dialog, View view) {
        Analytics.recordEvent(new CountEventBuilder("SCOREPOP_SCORE_C").addExtra("source", appRateDialog.d()));
        try {
            appRateDialog.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(Intrinsics.stringPlus("market://details?id=", dialog.getContext().getPackageName()))).addFlags(268435456));
        } catch (Exception e) {
            HMLog.warn(TAG, e, a.a);
            try {
                appRateDialog.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(Intrinsics.stringPlus("https://play.google.com/store/apps/details?id=", dialog.getContext().getPackageName()))).addFlags(268435456));
            } catch (Exception e2) {
                HMLog.warn(TAG, e2, b.a);
            }
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AppRateDialog appRateDialog, Dialog dialog, View view) {
        Analytics.recordEvent(new CountEventBuilder("SCOREPOP_FEEDBACK_C").addExtra("source", appRateDialog.d()));
        AppRateButtonListener buttonListener = AppRateManager.INSTANCE.getButtonListener();
        if (buttonListener != null) {
            buttonListener.onGiveShitButtonClicked();
        }
        dialog.dismiss();
    }

    private final void h(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (window.getContext().getResources().getDisplayMetrics().widthPixels * 0.9f);
        attributes.height = -2;
        attributes.gravity = 17;
        Unit unit = Unit.INSTANCE;
        window.setAttributes(attributes);
    }

    @JvmStatic
    public static final void show(@NotNull FragmentActivity fragmentActivity) {
        INSTANCE.show(fragmentActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Analytics.recordEvent(new CountEventBuilder("SCOREPOP_V").addExtra("source", d()));
        Context context = getContext();
        if (context != null) {
            AppRateManager.INSTANCE.setLastShowTime(context, System.currentTimeMillis());
        }
        final Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        ImageView imageView = this.close;
        Objects.requireNonNull(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: rh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppRateDialog.e(dialog, view);
            }
        });
        TextView textView = this.encourage;
        Objects.requireNonNull(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: sh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppRateDialog.f(this.a, dialog, view);
            }
        });
        TextView textView2 = this.shits;
        Objects.requireNonNull(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: th
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppRateDialog.g(this.a, dialog, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        h(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = new Dialog(requireContext(), R.style.AppRateDialogStyle);
        dialog.setContentView(R.layout.dialog_app_rate);
        ((ImageView) dialog.findViewById(R.id.header)).setImageResource(RainbowUtils.isDarkMode(getContext()) ? R.drawable.app_rate_header_dark : R.drawable.app_rate_header);
        dialog.setCanceledOnTouchOutside(true);
        this.close = (ImageView) dialog.findViewById(R.id.close_button);
        this.encourage = (TextView) dialog.findViewById(R.id.encourage);
        this.shits = (TextView) dialog.findViewById(R.id.give_shits);
        h(dialog);
        return dialog;
    }
}
