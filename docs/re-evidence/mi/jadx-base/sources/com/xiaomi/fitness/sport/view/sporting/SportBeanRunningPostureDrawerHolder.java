package com.xiaomi.fitness.sport.view.sporting;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.c1j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/sporting/SportBeanRunningPostureDrawerHolder;", "", "bottomSheet", "Landroidx/core/widget/NestedScrollView;", "scrollTriggerTextView", "Landroid/widget/TextView;", "arrowUpIv", "Landroid/widget/ImageView;", "arrowDownIv", "viewOutSportData", "Landroid/view/View;", "context", "Landroid/content/Context;", "hasMap", "", "<init>", "(Landroidx/core/widget/NestedScrollView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/view/View;Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "initDrawerHolder", "", "showRunningPosture", "showOrHideViewOutSportDataView", "slideOffset", "", "switchSlideTrigger", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportBeanRunningPostureDrawerHolder {

    @NotNull
    public static final String TAG = "SportBeanRunningPostureDrawerHolder";

    @Nullable
    private final ImageView arrowDownIv;

    @Nullable
    private final ImageView arrowUpIv;

    @Nullable
    private final NestedScrollView bottomSheet;

    @NotNull
    private final Context context;
    private final boolean hasMap;

    @Nullable
    private final TextView scrollTriggerTextView;

    @Nullable
    private final View viewOutSportData;

    public SportBeanRunningPostureDrawerHolder(@Nullable NestedScrollView nestedScrollView, @Nullable TextView textView, @Nullable ImageView imageView, @Nullable ImageView imageView2, @Nullable View view, @NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.bottomSheet = nestedScrollView;
        this.scrollTriggerTextView = textView;
        this.arrowUpIv = imageView;
        this.arrowDownIv = imageView2;
        this.viewOutSportData = view;
        this.context = context;
        this.hasMap = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOrHideViewOutSportDataView(float slideOffset) {
        boolean z = ((double) slideOffset) > 0.8d;
        View view = this.viewOutSportData;
        if (view != null) {
            ViewExtKt.setVisible(view, !z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchSlideTrigger(float slideOffset) {
        int i;
        boolean z = ((double) slideOffset) < 0.6d;
        if (z) {
            i = c1j.u4;
        } else {
            i = this.hasMap ? c1j.t4 : c1j.s4;
        }
        TextView textView = this.scrollTriggerTextView;
        if (textView != null) {
            textView.setText(i);
        }
        ImageView imageView = this.arrowUpIv;
        if (imageView != null) {
            ViewExtKt.setVisible(imageView, z);
        }
        ImageView imageView2 = this.arrowDownIv;
        if (imageView2 != null) {
            ViewExtKt.setVisible(imageView2, !z);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void initDrawerHolder() {
        NestedScrollView nestedScrollView = this.bottomSheet;
        if (nestedScrollView == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(nestedScrollView);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
        bottomSheetBehaviorB.Z(true);
        bottomSheetBehaviorB.T(1.0E-5f);
        bottomSheetBehaviorB.setHideable(false);
        bottomSheetBehaviorB.s(new BottomSheetBehavior.f() { // from class: com.xiaomi.fitness.sport.view.sporting.SportBeanRunningPostureDrawerHolder.initDrawerHolder.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                Logger.d(SportBeanRunningPostureDrawerHolder.TAG, "onSlide slideOffset=" + slideOffset);
                SportBeanRunningPostureDrawerHolder.this.showOrHideViewOutSportDataView(slideOffset);
                SportBeanRunningPostureDrawerHolder.this.switchSlideTrigger(slideOffset);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }
        });
    }

    public final void showRunningPosture(boolean showRunningPosture) {
        View view;
        NestedScrollView nestedScrollView = this.bottomSheet;
        if (nestedScrollView != null) {
            ViewExtKt.setVisible(nestedScrollView, showRunningPosture);
        }
        if (showRunningPosture || (view = this.viewOutSportData) == null) {
            return;
        }
        ViewExtKt.visible(view);
    }

    public /* synthetic */ SportBeanRunningPostureDrawerHolder(NestedScrollView nestedScrollView, TextView textView, ImageView imageView, ImageView imageView2, View view, Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nestedScrollView, textView, imageView, imageView2, view, context, (i & 64) != 0 ? true : z);
    }
}
