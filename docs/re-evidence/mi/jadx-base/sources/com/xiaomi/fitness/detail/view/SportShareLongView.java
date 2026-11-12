package com.xiaomi.fitness.detail.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.fde;
import defpackage.o3r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010C\u001a\u00020:¢\u0006\u0004\bD\u0010EJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\bJ\u001b\u0010\u0013\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R*\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0018R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0006R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010@\u001a\u00020:2\u0006\u0010;\u001a\u00020:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "", "initView", "(Landroid/content/Context;)V", "initSharePicListener", "()V", "nestScrollViewScrollTop", "initScrollViewVisible", "Landroid/view/View;", "viewToFadeOut", "fadeOutAnimation", "(Landroid/view/View;)V", "viewToFadeIn", "fadeInAnimation", "setShareContainerGone", "Lkotlin/Function0;", "onKeyBack", "(Lkotlin/jvm/functions/Function0;)V", "", "visible", "setSquareImageIconVisible", "(Z)V", "setShareVideoIconVisible", "setImgShareLongGONE", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "setImageUri", "(Landroid/net/Uri;)V", "Landroid/graphics/Bitmap;", "shareBitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Lcom/xiaomi/fitness/detail/view/SportShareLongView$ShareLongPicListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setShareLongPicListener", "(Lcom/xiaomi/fitness/detail/view/SportShareLongView$ShareLongPicListener;)V", "value", "gpsPathValid", "Z", "getGpsPathValid", "()Z", "setGpsPathValid", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "Lfde;", "_binding", "Lfde;", "shareLongPicListener", "Lcom/xiaomi/fitness/detail/view/SportShareLongView$ShareLongPicListener;", "getMBinding", "()Lfde;", "mBinding", "", "visibility", "getRootViewVisibility", "()I", "setRootViewVisibility", "(I)V", "rootViewVisibility", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ShareLongPicListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportShareLongView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShareLongView.kt\ncom/xiaomi/fitness/detail/view/SportShareLongView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,212:1\n54#2,3:213\n24#2:216\n57#2,6:217\n63#2,2:224\n57#3:223\n*S KotlinDebug\n*F\n+ 1 SportShareLongView.kt\ncom/xiaomi/fitness/detail/view/SportShareLongView\n*L\n176#1:213,3\n176#1:216\n176#1:217,6\n176#1:224,2\n176#1:223\n*E\n"})
public class SportShareLongView extends RelativeLayout {

    @Nullable
    private fde _binding;
    private boolean gpsPathValid;

    @Nullable
    private Context mContext;

    @Nullable
    private ShareLongPicListener shareLongPicListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareLongView$ShareLongPicListener;", "", "shareToWX", "", CommonConstants.KEY_SESSION, "", "saveSharePic", "intentToShareVideo", "intentToShareCard", "sharePicViaMore", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ShareLongPicListener {
        void intentToShareCard();

        void intentToShareVideo();

        void saveSharePic();

        void sharePicViaMore();

        void shareToWX(int session);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareLongView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void fadeInAnimation(final View viewToFadeIn) {
        initScrollViewVisible();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewToFadeIn, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, DisplayUtil.getScreenHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.detail.view.SportShareLongView.fadeInAnimation.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view = viewToFadeIn;
                Intrinsics.checkNotNull(view);
                view.setVisibility(0);
            }
        });
        objectAnimatorOfFloat.start();
    }

    private final void fadeOutAnimation(final View viewToFadeOut) {
        nestScrollViewScrollTop();
        if (getMBinding().U.getVisibility() != 0) {
            getMBinding().U.setVisibility(0);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewToFadeOut, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_Y, 0.0f, DisplayUtil.getScreenHeight());
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.detail.view.SportShareLongView.fadeOutAnimation.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view = viewToFadeOut;
                Intrinsics.checkNotNull(view);
                view.setVisibility(8);
            }
        });
        objectAnimatorOfFloat.start();
    }

    private final fde getMBinding() {
        fde fdeVar = this._binding;
        Intrinsics.checkNotNull(fdeVar);
        return fdeVar;
    }

    private final void initScrollViewVisible() {
        getMBinding().P.post(new Runnable() { // from class: x0o
            @Override // java.lang.Runnable
            public final void run() {
                SportShareLongView.initScrollViewVisible$lambda$9(this.f38553a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initScrollViewVisible$lambda$9(SportShareLongView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getMBinding().P.getHeight() - DisplayUtil.dip2px(25.0f) < DisplayUtil.getScreenHeight()) {
            this$0.getMBinding().U.setVisibility(8);
        }
    }

    private final void initSharePicListener() {
        ViewExtKt.clickWithTrigger$default(getMBinding().L, 0L, new Function1() { // from class: q0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.initSharePicListener$lambda$1(this.f30968a, (RelativeLayout) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().N, 0L, new Function1() { // from class: r0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.initSharePicListener$lambda$2(this.f32059a, (RelativeLayout) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().I, 0L, new Function1() { // from class: s0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.initSharePicListener$lambda$3(this.f33143a, (RelativeLayout) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().O, 0L, new Function1() { // from class: t0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.initSharePicListener$lambda$4(this.f34182a, (RelativeLayout) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().M, 0L, new Function1() { // from class: u0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.initSharePicListener$lambda$5(this.f35261a, (RelativeLayout) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().K, 0L, new Function1() { // from class: v0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.initSharePicListener$lambda$6(this.f36356a, (RelativeLayout) obj);
            }
        }, 1, null);
        getMBinding().P.setOnScrollChangeListener(new NestedScrollView.d() { // from class: w0o
            @Override // androidx.core.widget.NestedScrollView.d
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                SportShareLongView.initSharePicListener$lambda$7(this.f37422a, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSharePicListener$lambda$1(SportShareLongView this$0, RelativeLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareLongPicListener shareLongPicListener = this$0.shareLongPicListener;
        if (shareLongPicListener != null) {
            Intrinsics.checkNotNull(shareLongPicListener);
            shareLongPicListener.intentToShareCard();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSharePicListener$lambda$2(SportShareLongView this$0, RelativeLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareLongPicListener shareLongPicListener = this$0.shareLongPicListener;
        if (shareLongPicListener != null) {
            Intrinsics.checkNotNull(shareLongPicListener);
            shareLongPicListener.intentToShareVideo();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSharePicListener$lambda$3(SportShareLongView this$0, RelativeLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareLongPicListener shareLongPicListener = this$0.shareLongPicListener;
        if (shareLongPicListener != null) {
            Intrinsics.checkNotNull(shareLongPicListener);
            shareLongPicListener.saveSharePic();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSharePicListener$lambda$4(SportShareLongView this$0, RelativeLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareLongPicListener shareLongPicListener = this$0.shareLongPicListener;
        if (shareLongPicListener != null) {
            Intrinsics.checkNotNull(shareLongPicListener);
            shareLongPicListener.shareToWX(o3r.j());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSharePicListener$lambda$5(SportShareLongView this$0, RelativeLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareLongPicListener shareLongPicListener = this$0.shareLongPicListener;
        if (shareLongPicListener != null) {
            Intrinsics.checkNotNull(shareLongPicListener);
            shareLongPicListener.shareToWX(o3r.k());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSharePicListener$lambda$6(SportShareLongView this$0, RelativeLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareLongPicListener shareLongPicListener = this$0.shareLongPicListener;
        if (shareLongPicListener != null) {
            Intrinsics.checkNotNull(shareLongPicListener);
            shareLongPicListener.sharePicViaMore();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSharePicListener$lambda$7(SportShareLongView this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i2 < 20 || this$0.getMBinding().U.getVisibility() != 0) {
            return;
        }
        this$0.getMBinding().U.setVisibility(8);
    }

    private final void initView(Context context) {
        this.mContext = context;
        this._binding = fde.A0(LayoutInflater.from(context), this, true);
        initSharePicListener();
    }

    private final void nestScrollViewScrollTop() {
        getMBinding().P.post(new Runnable() { // from class: y0o
            @Override // java.lang.Runnable
            public final void run() {
                SportShareLongView.nestScrollViewScrollTop$lambda$8(this.f39657a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nestScrollViewScrollTop$lambda$8(SportShareLongView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().P.fling(0);
        this$0.getMBinding().P.fullScroll(33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onKeyBack$lambda$0(Function0 onKeyBack, ImageView it) {
        Intrinsics.checkNotNullParameter(onKeyBack, "$onKeyBack");
        Intrinsics.checkNotNullParameter(it, "it");
        onKeyBack.invoke();
        return Unit.INSTANCE;
    }

    public final boolean getGpsPathValid() {
        return this.gpsPathValid;
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    public final int getRootViewVisibility() {
        return getMBinding().J.getVisibility();
    }

    public final void onKeyBack(@NotNull final Function0<Unit> onKeyBack) {
        Intrinsics.checkNotNullParameter(onKeyBack, "onKeyBack");
        ViewExtKt.clickWithTrigger$default(getMBinding().B, 0L, new Function1() { // from class: z0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareLongView.onKeyBack$lambda$0(onKeyBack, (ImageView) obj);
            }
        }, 1, null);
    }

    public final void setGpsPathValid(boolean z) {
        if (z) {
            getMBinding().N.setVisibility(0);
        } else {
            getMBinding().N.setVisibility(8);
        }
    }

    public final void setImageBitmap(@Nullable Bitmap shareBitmap) {
        ImageView imageView = getMBinding().C;
        Intrinsics.checkNotNull(imageView);
        imageView.setImageBitmap(shareBitmap);
    }

    public final void setImageUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ImageView imgShareLong = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(imgShareLong, "imgShareLong");
        Coil.imageLoader(imgShareLong.getContext()).enqueue(new ImageRequest.Builder(imgShareLong.getContext()).data(uri).target(imgShareLong).build());
    }

    public final void setImgShareLongGONE() {
        if (getMBinding().J.getVisibility() == 0) {
            getMBinding().J.setVisibility(8);
        }
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public final void setRootViewVisibility(int i) {
        if (getMBinding().J.getVisibility() == 0 && i == 8) {
            getMBinding().J.setVisibility(8);
        } else if (i == 0) {
            fadeInAnimation(getMBinding().J);
        }
    }

    public final void setShareContainerGone() {
        getMBinding().Q.setVisibility(8);
    }

    public final void setShareLongPicListener(@Nullable ShareLongPicListener listener) {
        this.shareLongPicListener = listener;
    }

    public final void setShareVideoIconVisible(boolean visible) {
        RelativeLayout rlShareVideo = getMBinding().N;
        Intrinsics.checkNotNullExpressionValue(rlShareVideo, "rlShareVideo");
        ViewExtKt.setVisible(rlShareVideo, visible);
    }

    public final void setSquareImageIconVisible(boolean visible) {
        LinearLayout shareContainer = getMBinding().Q;
        Intrinsics.checkNotNullExpressionValue(shareContainer, "shareContainer");
        ViewExtKt.setVisible(shareContainer, visible);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareLongView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportShareLongView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareLongView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gpsPathValid = true;
        initView(context);
    }
}
