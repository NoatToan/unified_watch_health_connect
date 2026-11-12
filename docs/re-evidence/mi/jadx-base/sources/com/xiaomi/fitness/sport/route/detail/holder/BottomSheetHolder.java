package com.xiaomi.fitness.sport.route.detail.holder;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.aki;
import defpackage.eoi;
import defpackage.rli;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/holder/BottomSheetHolder;", "", "bottomSheet", "Lcom/google/android/material/appbar/AppBarLayout;", "bottomSheetPanel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "noDataTv", "Landroidx/appcompat/widget/AppCompatTextView;", "dragHandle", "Landroid/widget/RelativeLayout;", "startRunningTab", "context", "Landroid/content/Context;", "<init>", "(Lcom/google/android/material/appbar/AppBarLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "initBottomSheet", "", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetHolder {

    @NotNull
    public static final String TAG = "BottomSheetHolder";

    @Nullable
    private final AppBarLayout bottomSheet;

    @NotNull
    private final ConstraintLayout bottomSheetPanel;

    @NotNull
    private final Context context;

    @NotNull
    private final RelativeLayout dragHandle;

    @NotNull
    private final AppCompatTextView noDataTv;

    @NotNull
    private final RelativeLayout startRunningTab;

    public BottomSheetHolder(@Nullable AppBarLayout appBarLayout, @NotNull ConstraintLayout bottomSheetPanel, @NotNull AppCompatTextView noDataTv, @NotNull RelativeLayout dragHandle, @NotNull RelativeLayout startRunningTab, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(bottomSheetPanel, "bottomSheetPanel");
        Intrinsics.checkNotNullParameter(noDataTv, "noDataTv");
        Intrinsics.checkNotNullParameter(dragHandle, "dragHandle");
        Intrinsics.checkNotNullParameter(startRunningTab, "startRunningTab");
        Intrinsics.checkNotNullParameter(context, "context");
        this.bottomSheet = appBarLayout;
        this.bottomSheetPanel = bottomSheetPanel;
        this.noDataTv = noDataTv;
        this.dragHandle = dragHandle;
        this.startRunningTab = startRunningTab;
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void initBottomSheet() {
        AppBarLayout appBarLayout = this.bottomSheet;
        if (appBarLayout == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(appBarLayout);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
        bottomSheetBehaviorB.Z(true);
        bottomSheetBehaviorB.T(1.0E-5f);
        bottomSheetBehaviorB.setHideable(false);
        ConstraintLayout constraintLayout = this.bottomSheetPanel;
        UIUtils uIUtils = UIUtils.INSTANCE;
        constraintLayout.setMinHeight(uIUtils.getScreenHeight(this.context));
        this.bottomSheetPanel.setMaxHeight(uIUtils.getScreenHeight(this.context));
        bottomSheetBehaviorB.s(new BottomSheetBehavior.f() { // from class: com.xiaomi.fitness.sport.route.detail.holder.BottomSheetHolder.initBottomSheet.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                Logger.d(BottomSheetHolder.TAG, "onSlide slideOffset=" + slideOffset);
                double d = (double) slideOffset;
                ViewExtKt.setVisible(BottomSheetHolder.this.startRunningTab, d < 0.3d);
                float dp = ExtUtilsKt.getDp(60) * slideOffset;
                int dimensionPixelSize = BottomSheetHolder.this.getContext().getResources().getDimensionPixelSize(rli.f32681b);
                BottomSheetHolder.this.bottomSheetPanel.setPadding(dimensionPixelSize, (int) dp, dimensionPixelSize, 0);
                int i = d <= 0.9d ? eoi.m0 : aki.h;
                ViewExtKt.setVisible(BottomSheetHolder.this.dragHandle, d <= 0.99d);
                float f = 1 - slideOffset;
                BottomSheetHolder.this.dragHandle.setPadding(0, (int) (ExtUtilsKt.getDp(20) * f), 0, (int) (ExtUtilsKt.getDp(8) * f));
                BottomSheetHolder.this.bottomSheetPanel.setBackgroundResource(i);
                if (ExtUtilsKt.isVisible(BottomSheetHolder.this.noDataTv)) {
                    BottomSheetHolder.this.noDataTv.setPadding(0, (int) ((slideOffset * ExtUtilsKt.getDp(150)) + ExtUtilsKt.getDp(40)), 0, 0);
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }
        });
    }
}
