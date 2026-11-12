package com.xiaomi.fitness.baseui.common;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a(\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t\u001a(\u0010\r\u001a\u00020\u0001*\u00020\u000e2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t\u001a0\u0010\u000f\u001a\u00020\u0001*\u00020\u000e2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0010\u001a\u00020\u0011\u001a&\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a(\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011\u001a>\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002\u001a \u0010\u001a\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a(\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u0011\u001a(\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t\u001a0\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t\u001a(\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t\u001a0\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t¨\u0006\u001e"}, d2 = {"gotoPage", "", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "targetClazz", "Ljava/lang/Class;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "gotoPageResizeMode", "isResizeMode", "", "isParcelable", "activityOptions", "Landroid/app/ActivityOptions;", "gotoFragmentPage", "Landroidx/fragment/app/FragmentActivity;", "gotoFragmentPageForResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "gotoPageForResult", "goActivity", "_this", "Landroid/content/Context;", "_class", "Landroid/app/Activity;", "isContextInvalid", "context", "gotoPageFinish", "flags", "gotoPageByReplace", "canBack", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BaseFragmentExKt {
    public static final void goActivity(@NotNull BaseFragment baseFragment, @NotNull Context _this, @Nullable Class<? extends Activity> cls, @Nullable Bundle bundle, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(_this, "_this");
        if (isContextInvalid(_this)) {
            return;
        }
        Intent intent = new Intent();
        Intrinsics.checkNotNull(cls);
        intent.setClass(_this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (activityOptions == null) {
            _this.startActivity(intent);
        } else {
            _this.startActivity(intent, activityOptions.toBundle());
        }
    }

    public static /* synthetic */ void goActivity$default(BaseFragment baseFragment, Context context, Class cls, Bundle bundle, ActivityOptions activityOptions, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            activityOptions = null;
        }
        goActivity(baseFragment, context, cls, bundle, activityOptions);
    }

    public static final void gotoFragmentPage(@NotNull FragmentActivity fragmentActivity, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(fragmentActivity, fragmentParamsB, z);
    }

    public static final void gotoFragmentPageForResult(@NotNull FragmentActivity fragmentActivity, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().i(fragmentActivity, fragmentParamsB, i, z);
    }

    public static final void gotoPage(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        gotoPage(baseFragment, targetClazz, bundle, true);
    }

    public static final void gotoPageByReplace(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentActivity activity = baseFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.common.CommonBaseActivity");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        ((CommonBaseActivity) activity).rePlaceFragment(fragmentParamsB);
    }

    public static final void gotoPageFinish(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        gotoPageFinish(baseFragment, targetClazz, bundle, true);
    }

    public static final void gotoPageForResult(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        gotoPageForResult(baseFragment, targetClazz, (Bundle) null, i);
    }

    public static final void gotoPageResizeMode(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).f(z).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(baseFragment.getActivity(), fragmentParamsB, true);
    }

    private static final boolean isContextInvalid(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    public static final void gotoPage(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().g(baseFragment.getActivity(), fragmentParamsB, z, activityOptions);
    }

    public static final void gotoPageFinish(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        gotoPageFinish(baseFragment, targetClazz, bundle, i, true);
    }

    public static final void gotoPageForResult(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, boolean z, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).f(z).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().h(baseFragment.getActivity(), fragmentParamsB, i);
    }

    public static final void gotoPageFinish(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(baseFragment.getActivity(), fragmentParamsB, z);
        FragmentActivity activity = baseFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void gotoPage(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().f(baseFragment.getActivity(), fragmentParamsB, z);
    }

    public static final void gotoPageByReplace(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentActivity activity = baseFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.common.CommonBaseActivity");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(z2).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        ((CommonBaseActivity) activity).rePlaceFragment(fragmentParamsB);
    }

    public static final void gotoPageForResult(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().h(baseFragment.getActivity(), fragmentParamsB, i);
    }

    public static final void gotoPageFinish(@NotNull BaseFragment baseFragment, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, int i, boolean z) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().d(baseFragment.getActivity(), i, fragmentParamsB, z);
        FragmentActivity activity = baseFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
