package com.xiaomi.fitness.medal.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.medal.utils.SleepInterfereMedalUtils;
import com.xiaomi.fitness.medal.widget.MedalDialog;
import defpackage.iri;
import defpackage.pui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/medal/utils/SleepInterfereMedalUtils;", "", "<init>", "()V", "showSleepInterfereMedal", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "title", "", CardUIInfo.KEY_SUBTITILE, "btnStr", "clickCallback", "Lkotlin/Function0;", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereMedalUtils {

    @NotNull
    public static final SleepInterfereMedalUtils INSTANCE = new SleepInterfereMedalUtils();

    private SleepInterfereMedalUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSleepInterfereMedal$lambda$0(Function0 clickCallback, View view) {
        Intrinsics.checkNotNullParameter(clickCallback, "$clickCallback");
        clickCallback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSleepInterfereMedal$lambda$1(LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "$lottieAnimationView");
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSleepInterfereMedal$lambda$2(MedalDialog medalDialog, View view) {
        Intrinsics.checkNotNullParameter(medalDialog, "$medalDialog");
        medalDialog.dismiss();
    }

    public final void showSleepInterfereMedal(@NotNull FragmentActivity activity, @NotNull String title, @NotNull String subTitle, @NotNull String btnStr, @NotNull final Function0<Unit> clickCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(btnStr, "btnStr");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        View viewInflate = LayoutInflater.from(activity).inflate(pui.t, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup.findViewById(iri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(iri.D);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = viewGroup.findViewById(iri.E);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = viewGroup.findViewById(iri.f);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        ((TextView) viewFindViewById2).setText(title);
        ((TextView) viewFindViewById3).setText(subTitle);
        textView.setText(btnStr);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ynm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereMedalUtils.showSleepInterfereMedal$lambda$0(clickCallback, view);
            }
        });
        lottieAnimationView.postDelayed(new Runnable() { // from class: znm
            @Override // java.lang.Runnable
            public final void run() {
                SleepInterfereMedalUtils.showSleepInterfereMedal$lambda$1(lottieAnimationView);
            }
        }, 200L);
        lottieAnimationView.i(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.medal.utils.SleepInterfereMedalUtils.showSleepInterfereMedal.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                lottieAnimationView.setVisibility(4);
            }
        });
        ImageView imageView = (ImageView) viewGroup.findViewById(iri.m);
        final MedalDialog medalDialogCreate = new MedalDialog.Builder().setView(viewGroup).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaomi.fitness.medal.utils.SleepInterfereMedalUtils$showSleepInterfereMedal$medalDialog$1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialog) {
            }
        }).create();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        medalDialogCreate.show(supportFragmentManager);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: aom
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereMedalUtils.showSleepInterfereMedal$lambda$2(medalDialogCreate, view);
            }
        });
    }
}
