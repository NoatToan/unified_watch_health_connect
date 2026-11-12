package com.xiaomi.fitness.sport_eco.utils;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ,\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/TransitionUtil;", "", "<init>", "()V", "gotoPage", "", "context", "Landroid/content/Context;", "targetClazz", "Ljava/lang/Class;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "isParcelable", "", "activityOptions", "Landroid/app/ActivityOptions;", "gotoActivityResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransitionUtil {

    @NotNull
    public static final TransitionUtil INSTANCE = new TransitionUtil();

    private TransitionUtil() {
    }

    public static /* synthetic */ void gotoPage$default(TransitionUtil transitionUtil, Context context, Class cls, Bundle bundle, boolean z, ActivityOptions activityOptions, int i, Object obj) {
        if ((i & 16) != 0) {
            activityOptions = null;
        }
        transitionUtil.gotoPage(context, cls, bundle, z, activityOptions);
    }

    public final void gotoActivityResult(@NotNull Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, int requestCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().h((Activity) context, fragmentParamsB, requestCode);
    }

    public final void gotoPage(@NotNull Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, boolean isParcelable, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().g(context, fragmentParamsB, isParcelable, activityOptions);
    }
}
