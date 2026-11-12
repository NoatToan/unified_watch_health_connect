package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.sentry.SentryOptions;
import io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u000e\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000eH\u0001\u001a\u001a\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, d2 = {"totalPaddingTopSafe", "", "Landroid/widget/TextView;", "getTotalPaddingTopSafe", "(Landroid/widget/TextView;)I", "getVisibleRects", "", "Landroid/graphics/Rect;", "Lio/sentry/android/replay/util/TextLayout;", "globalRect", "paddingLeft", "paddingTop", "isMaskable", "", "Landroid/graphics/drawable/Drawable;", "isVisibleToUser", "Lkotlin/Pair;", "Landroid/view/View;", "toOpaque", "traverse", "", "parentNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "options", "Lio/sentry/SentryOptions;", "sentry-android-replay_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewsKt {
    public static final int getTotalPaddingTopSafe(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    @NotNull
    public static final List<Rect> getVisibleRects(@Nullable TextLayout textLayout, @NotNull Rect globalRect, int i, int i2) {
        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
        if (textLayout == null) {
            return CollectionsKt__CollectionsJVMKt.listOf(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int lineCount = textLayout.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int primaryHorizontal = (int) textLayout.getPrimaryHorizontal(i3, textLayout.getLineStart(i3));
            int ellipsisCount = textLayout.getEllipsisCount(i3);
            int lineVisibleEnd = textLayout.getLineVisibleEnd(i3);
            int primaryHorizontal2 = (int) textLayout.getPrimaryHorizontal(i3, (lineVisibleEnd - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
            if (primaryHorizontal2 == 0 && lineVisibleEnd > 0) {
                primaryHorizontal2 = ((int) textLayout.getPrimaryHorizontal(i3, lineVisibleEnd - 1)) + 1;
            }
            int lineTop = textLayout.getLineTop(i3);
            int lineBottom = textLayout.getLineBottom(i3);
            Rect rect = new Rect();
            int i4 = globalRect.left + i + primaryHorizontal;
            rect.left = i4;
            rect.right = i4 + (primaryHorizontal2 - primaryHorizontal);
            int i5 = globalRect.top + i2 + lineTop;
            rect.top = i5;
            rect.bottom = i5 + (lineBottom - lineTop);
            arrayList.add(rect);
        }
        return arrayList;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @TargetApi(21)
    public static final boolean isMaskable(@Nullable Drawable drawable) {
        if ((drawable instanceof InsetDrawable) || (drawable instanceof ColorDrawable) || (drawable instanceof VectorDrawable) || (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    @NotNull
    public static final Pair<Boolean, Rect> isVisibleToUser(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (parent instanceof View) {
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    return TuplesKt.to(Boolean.FALSE, null);
                }
                parent = view2.getParent();
            }
            Rect rect = new Rect();
            return TuplesKt.to(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
        }
        return TuplesKt.to(Boolean.FALSE, null);
    }

    public static final int toOpaque(int i) {
        return i | (-16777216);
    }

    public static final void traverse(@NotNull View view, @NotNull ViewHierarchyNode parentNode, @NotNull SentryOptions options) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        if ((view instanceof ViewGroup) && !ComposeViewHierarchyNode.INSTANCE.fromView(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    ViewHierarchyNode viewHierarchyNodeFromView = ViewHierarchyNode.INSTANCE.fromView(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(viewHierarchyNodeFromView);
                    traverse(childAt, viewHierarchyNodeFromView, options);
                }
            }
            parentNode.setChildren(arrayList);
        }
    }
}
