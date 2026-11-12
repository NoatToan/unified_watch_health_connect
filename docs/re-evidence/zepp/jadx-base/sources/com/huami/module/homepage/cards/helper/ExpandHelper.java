package com.huami.module.homepage.cards.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.module.homepage.cards.helper.ExpandHelper;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002()B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0004J\u001e\u0010\u0013\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016J\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00020\u0007*\u00020\u001aR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006*"}, d2 = {"Lcom/huami/module/homepage/cards/helper/ExpandHelper;", "", "", "type", "", "b", "e", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "Landroid/view/View;", "expandView", "", "animate", "f", "c", "resetExpandCache", "", "types", WorkoutExercises.CLEAN, "addExpandType", "isExpand", ViewHierarchyConstants.VIEW_KEY, "", "startAngle", "endAngle", "rotateExpandWidget", "Lcom/huami/module/homepage/cards/helper/ExpandHelper$Expandable;", "VH", "Lcom/huami/module/homepage/cards/helper/ExpandHelper$KeepOneHolder;", "getKeepOneHolder", "", "a", "Ljava/util/Set;", "expandList", "", "ANIMAL_DURATION", "J", "ALPHA_DURATION", "<init>", "()V", "Expandable", "KeepOneHolder", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ExpandHelper {
    public static final long ANIMAL_DURATION = 300;

    @NotNull
    public static final ExpandHelper INSTANCE = new ExpandHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Set<String> expandList = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long ALPHA_DURATION = 100;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/module/homepage/cards/helper/ExpandHelper$Expandable;", "", "Landroid/view/View;", "obtainExpandView", "", "isOpen", "", "type", "", "addAnim", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public interface Expandable {
        void addAnim(boolean isOpen, @NotNull String type);

        @Nullable
        View obtainExpandView();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0003*\u00020\u0001*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/cards/helper/ExpandHelper$KeepOneHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/module/homepage/cards/helper/ExpandHelper$Expandable;", "VH", "", "holder", "", "type", "", "bind", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/String;)V", "toggle", "", "a", LogUtil.I, "preOpen", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class KeepOneHolder<VH extends RecyclerView.ViewHolder & Expandable> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int preOpen = -1;

        public final void bind(@NotNull VH holder, @NotNull String type) {
            VH vh = holder;
            View viewObtainExpandView = vh.obtainExpandView();
            if (viewObtainExpandView == null) {
                return;
            }
            if (!ExpandHelper.expandList.contains(type)) {
                ExpandHelper.d(ExpandHelper.INSTANCE, holder, viewObtainExpandView, false, 4, null);
            } else {
                vh.addAnim(true, type);
                ExpandHelper.g(ExpandHelper.INSTANCE, holder, viewObtainExpandView, false, 4, null);
            }
        }

        public final void toggle(@NotNull VH holder, @NotNull String type) {
            VH vh = holder;
            View viewObtainExpandView = vh.obtainExpandView();
            if (viewObtainExpandView == null) {
                return;
            }
            if (ExpandHelper.expandList.contains(type)) {
                ExpandHelper expandHelper = ExpandHelper.INSTANCE;
                expandHelper.e(type);
                vh.addAnim(false, type);
                expandHelper.c(holder, viewObtainExpandView, true);
                return;
            }
            ExpandHelper expandHelper2 = ExpandHelper.INSTANCE;
            expandHelper2.b(type);
            vh.addAnim(true, type);
            expandHelper2.f(holder, viewObtainExpandView, true);
        }
    }

    private ExpandHelper() {
    }

    public static /* synthetic */ void addExpandType$default(ExpandHelper expandHelper, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        expandHelper.addExpandType(list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String type) {
        Set<String> set = expandList;
        if (set.contains(type)) {
            return;
        }
        set.add(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(RecyclerView.ViewHolder holder, final View expandView, boolean animate) {
        if (!animate) {
            expandView.setVisibility(8);
            expandView.setAlpha(0.0f);
            return;
        }
        Animator animatorChangeItemViewHeightAnimator = ExpandHelperKt.changeItemViewHeightAnimator(holder);
        if (animatorChangeItemViewHeightAnimator == null) {
            return;
        }
        expandView.setVisibility(8);
        expandView.setVisibility(0);
        animatorChangeItemViewHeightAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.huami.module.homepage.cards.helper.ExpandHelper$closeHolder$1
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
    public final void e(String type) {
        expandList.remove(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(RecyclerView.ViewHolder holder, View expandView, boolean animate) {
        if (!animate) {
            expandView.setVisibility(0);
            expandView.setAlpha(1.0f);
            return;
        }
        Animator animatorChangeItemViewHeightAnimator = ExpandHelperKt.changeItemViewHeightAnimator(holder);
        if (animatorChangeItemViewHeightAnimator == null) {
            return;
        }
        expandView.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(expandView, (Property<View, Float>) View.ALPHA, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
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

    public final void addExpandType(@NotNull List<String> types, boolean clean) {
        if (clean) {
            expandList.clear();
        }
        expandList.addAll(types);
    }

    @NotNull
    public final <VH extends RecyclerView.ViewHolder & Expandable> KeepOneHolder<VH> getKeepOneHolder() {
        return new KeepOneHolder<>();
    }

    public final boolean isExpand(@NotNull String type) {
        return expandList.contains(type);
    }

    public final void resetExpandCache() {
        expandList.clear();
    }

    public final void rotateExpandWidget(@NotNull final View view, float startAngle, float endAngle) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(startAngle, endAngle);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ax1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandHelper.h(view, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }
}
