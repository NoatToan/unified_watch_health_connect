package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.pah;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000b\u001a\u00020\n*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\b\u001a<\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a<\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\b¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010&\u001a\u00020%*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'\u001a-\u0010+\u001a\u00020\u0005*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0086\b¢\u0006\u0004\b+\u0010\b\u001a9\u0010+\u001a\u00020\u0005\"\n\b\u0000\u0010,\u0018\u0001*\u00020(*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0087\b¢\u0006\u0004\b-\u0010\b\"*\u00100\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103\"*\u00104\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00101\"\u0004\b5\u00103\"*\u00106\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00101\"\u0004\b7\u00103\"\u0016\u0010:\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0016\u0010<\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00109\"\u0016\u0010>\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00109\"\u0016\u0010@\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00109\"\u0016\u0010B\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00109\"\u0016\u0010D\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bC\u00109\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u001b\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bJ\u0010H¨\u0006L"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "", "action", "doOnNextLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "doOnLayout", "Lpah;", "doOnPreDraw", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lpah;", "doOnAttach", "doOnDetach", "", StatConstants.PARAM_START, "top", StatConstants.PARAM_END, "bottom", "updatePaddingRelative", "(Landroid/view/View;IIII)V", "left", TSMAuthContants.PARAM_KEY_RIGHT, "updatePadding", MediaStoreUtil.MediaInfo.SIZE, "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", q.f13857a, "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/ExtensionFunctionType;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "", "value", "isVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "getMarginLeft", "(Landroid/view/View;)I", "marginLeft", "getMarginTop", "marginTop", "getMarginRight", "marginRight", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "getAllViews", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
public final class ViewKt {
    public static final void doOnAttach(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            function1.invoke2(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnAttach.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke2(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                }
            });
        }
    }

    public static final void doOnDetach(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnDetach.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke2(view2);
                }
            });
        } else {
            function1.invoke2(view);
        }
    }

    public static final void doOnLayout(@NotNull View view, @NotNull final Function1<? super View, Unit> function1) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    function1.invoke2(view2);
                }
            });
        } else {
            function1.invoke2(view);
        }
    }

    public static final void doOnNextLayout(@NotNull View view, @NotNull final Function1<? super View, Unit> function1) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt.doOnNextLayout.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view2.removeOnLayoutChangeListener(this);
                function1.invoke2(view2);
            }
        });
    }

    @NotNull
    public static final pah doOnPreDraw(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        return pah.a(view, new Runnable() { // from class: androidx.core.view.ViewKt.doOnPreDraw.1
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke2(view);
            }
        });
    }

    @NotNull
    public static final Bitmap drawToBitmap(@NotNull View view, @NotNull Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    @NotNull
    public static final Sequence<View> getAllViews(@NotNull View view) {
        return SequencesKt__SequenceBuilderKt.sequence(new ViewKt$allViews$1(view, null));
    }

    @NotNull
    public static final Sequence<ViewParent> getAncestors(@NotNull View view) {
        return SequencesKt__SequencesKt.generateSequence(view.getParent(), (Function1<? super ViewParent, ? extends ViewParent>) ((Function1<? super Object, ? extends Object>) ViewKt$ancestors$1.INSTANCE));
    }

    public static final int getMarginBottom(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(@NotNull View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@NotNull View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    @NotNull
    public static final Runnable postDelayed(@NotNull View view, long j, @NotNull final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postDelayed(runnable, j);
        return runnable;
    }

    @NotNull
    public static final Runnable postOnAnimationDelayed(@NotNull View view, long j, @NotNull final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: muq
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j);
        return runnable;
    }

    public static final void setGone(@NotNull View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(@NotNull View view, int i) {
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(@NotNull View view, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function1.invoke2(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @JvmName(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, Function1<? super T, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, "T");
        function1.invoke2(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(@NotNull View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(@NotNull View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
