package com.huami.healthlabel.ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.healthlabel.ui.custom.ExpandHelper;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u000223B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0004J\u001c\u0010\u0013\u001a\u00020\u00042\n\u0010\u0011\u001a\u00020\u0010\"\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000bJ\"\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015J\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\f\b\u0000\u0010\u001a*\u00020\u0007*\u00020\u0019R\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010$\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010.¨\u00064"}, d2 = {"Lcom/huami/healthlabel/ui/custom/ExpandHelper;", "", "", "position", "", "b", "e", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "Landroid/view/View;", "expandView", "", "animate", "f", "c", "resetExpandCache", "", "positions", WorkoutExercises.CLEAN, "addExpandPosition", ViewHierarchyConstants.VIEW_KEY, "", "startAngle", "endAngle", "rotateExpandWidget", "Lcom/huami/healthlabel/ui/custom/ExpandHelper$Expandable;", "VH", "Lcom/huami/healthlabel/ui/custom/ExpandHelper$KeepOneHolder;", "getKeepOneHolder", "a", "Z", "onlyExpandOneView", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "expandList", "", "J", "getAnimalDuration", "()J", "setAnimalDuration", "(J)V", "animalDuration", GoogleApiAvailabilityLight.a, "alphaDuration", LogUtil.I, "openedPosition", "<init>", "()V", "Expandable", "KeepOneHolder", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class ExpandHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean onlyExpandOneView;

    @NotNull
    public static final ExpandHelper INSTANCE = new ExpandHelper();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<String> expandList = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static long animalDuration = 300;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static long alphaDuration = 100;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static int openedPosition = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/healthlabel/ui/custom/ExpandHelper$Expandable;", "", "Landroid/view/View;", "obtainExpandView", "", "isOpen", "", "addAnim", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public interface Expandable {
        void addAnim(boolean isOpen);

        @Nullable
        View obtainExpandView();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000*\f\b\u0000\u0010\u0003*\u00020\u0001*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/healthlabel/ui/custom/ExpandHelper$KeepOneHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/healthlabel/ui/custom/ExpandHelper$Expandable;", "VH", "", "holder", "", "position", "", "bind", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "toggle", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "a", LogUtil.I, "preOpen", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class KeepOneHolder<VH extends RecyclerView.ViewHolder & Expandable> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int preOpen = -1;

        public final void bind(@NotNull VH holder, int position) {
            View viewObtainExpandView = holder.obtainExpandView();
            if (viewObtainExpandView == null) {
                return;
            }
            if (ExpandHelper.expandList.contains(String.valueOf(position))) {
                ExpandHelper.g(ExpandHelper.INSTANCE, holder, viewObtainExpandView, false, 4, null);
            } else {
                ExpandHelper.d(ExpandHelper.INSTANCE, holder, viewObtainExpandView, false, 4, null);
            }
        }

        public final void toggle(@NotNull VH holder) {
            View viewObtainExpandView = holder.obtainExpandView();
            if (viewObtainExpandView == null) {
                return;
            }
            int adapterPosition = holder.getAdapterPosition();
            if (ExpandHelper.expandList.contains(String.valueOf(adapterPosition))) {
                ExpandHelper expandHelper = ExpandHelper.INSTANCE;
                ExpandHelper.openedPosition = -1;
                expandHelper.e(adapterPosition);
                holder.addAnim(true);
                expandHelper.c(holder, viewObtainExpandView, true);
                return;
            }
            this.preOpen = ExpandHelper.openedPosition;
            ExpandHelper expandHelper2 = ExpandHelper.INSTANCE;
            ExpandHelper.openedPosition = adapterPosition;
            expandHelper2.b(adapterPosition);
            holder.addAnim(false);
            expandHelper2.f(holder, viewObtainExpandView, true);
            if (!ExpandHelper.onlyExpandOneView || this.preOpen == adapterPosition) {
                return;
            }
            ViewParent parent = holder.itemView.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) parent).findViewHolderForAdapterPosition(this.preOpen);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                return;
            }
            expandHelper2.c(viewHolderFindViewHolderForAdapterPosition, viewObtainExpandView, true);
            expandHelper2.e(this.preOpen);
        }
    }

    private ExpandHelper() {
    }

    public static /* synthetic */ void addExpandPosition$default(ExpandHelper expandHelper, int[] iArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        expandHelper.addExpandPosition(iArr, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int position) {
        ArrayList<String> arrayList = expandList;
        if (arrayList.contains(String.valueOf(position))) {
            return;
        }
        arrayList.add(String.valueOf(position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(RecyclerView.ViewHolder holder, final View expandView, boolean animate) {
        if (!animate) {
            expandView.setVisibility(8);
            expandView.setAlpha(0.0f);
            return;
        }
        expandView.setVisibility(8);
        Animator animatorChangeItemViewHeightAnimator = ExpandHelperKt.changeItemViewHeightAnimator(holder);
        expandView.setVisibility(0);
        animatorChangeItemViewHeightAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.huami.healthlabel.ui.custom.ExpandHelper$closeHolder$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
                expandView.setVisibility(8);
                expandView.setAlpha(0.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                expandView.setVisibility(8);
                expandView.setAlpha(0.0f);
            }
        });
        animatorChangeItemViewHeightAnimator.start();
    }

    public static /* synthetic */ void d(ExpandHelper expandHelper, RecyclerView.ViewHolder viewHolder, View view, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        expandHelper.c(viewHolder, view, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int position) {
        expandList.remove(String.valueOf(position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(RecyclerView.ViewHolder holder, View expandView, boolean animate) {
        if (!animate) {
            expandView.setVisibility(0);
            expandView.setAlpha(1.0f);
            return;
        }
        expandView.setVisibility(0);
        Animator animatorChangeItemViewHeightAnimator = ExpandHelperKt.changeItemViewHeightAnimator(holder);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(expandView, (Property<View, Float>) View.ALPHA, 1.0f);
        objectAnimatorOfFloat.setDuration(INSTANCE.getAnimalDuration() + alphaDuration);
        objectAnimatorOfFloat.addListener(ExpandHelperKt.viewHolderAnimatorListener(holder));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorChangeItemViewHeightAnimator, objectAnimatorOfFloat);
        animatorSet.start();
    }

    public static /* synthetic */ void g(ExpandHelper expandHelper, RecyclerView.ViewHolder viewHolder, View view, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        expandHelper.f(viewHolder, view, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setRotation(((Float) animatedValue).floatValue());
    }

    public static /* synthetic */ void rotateExpandWidget$default(ExpandHelper expandHelper, View view, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 180.0f;
        }
        expandHelper.rotateExpandWidget(view, f, f2);
    }

    public final void addExpandPosition(@NotNull int[] positions, boolean clean) {
        if (clean) {
            expandList.clear();
        }
        ArrayList<String> arrayList = expandList;
        ArrayList arrayList2 = new ArrayList(positions.length);
        for (int i : positions) {
            arrayList2.add(String.valueOf(i));
        }
        arrayList.addAll(arrayList2);
    }

    public final long getAnimalDuration() {
        return animalDuration;
    }

    @NotNull
    public final <VH extends RecyclerView.ViewHolder & Expandable> KeepOneHolder<VH> getKeepOneHolder() {
        return new KeepOneHolder<>();
    }

    public final void resetExpandCache() {
        expandList.clear();
    }

    public final void rotateExpandWidget(@NotNull final View view, float startAngle, float endAngle) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(startAngle, endAngle);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zw1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandHelper.h(view, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void setAnimalDuration(long j) {
        animalDuration = j;
    }
}
