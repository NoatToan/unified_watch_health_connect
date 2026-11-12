package com.huami.watchfacesstore.ext;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.math.c;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a&\u0010\u000e\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u001a&\u0010\u000f\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u001a\u0012\u0010\u0010\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\u0011\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\u0015\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013\u001a&\u0010\u0016\u001a\u00020\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u001a\u0012\u0010\u0010\u001a\u00020\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\u0011\u001a\u00020\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\n\u0010\u0017\u001a\u00020\u0005*\u00020\b\u001a\n\u0010\u0018\u001a\u00020\u0005*\u00020\b\u001a\n\u0010\u001a\u001a\u00020\u0005*\u00020\u0019\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0019\u001a\n\u0010\u001c\u001a\u00020\u0005*\u00020\u0019\u001a%\u0010\u001f\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\n2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010#\u001a\u00020\u0005*\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\f\u001a%\u0010%\u001a\u00020\u0005*\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u0004\u0018\u00010'*\u00020\fH\u0086@ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a\u001e\u0010*\u001a\u00020\u0005*\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001d\u001a\u00020\n\u001a \u0010-\u001a\u00020\u0005*\u00020!2\b\b\u0001\u0010$\u001a\u00020\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u001a\n\u0010/\u001a\u00020\n*\u00020.\u001aL\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:\"\n\b\u0000\u00101\u0018\u0001*\u0002002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u0002042\u0016\b\n\u00109\u001a\u0010\u0012\u0004\u0012\u000207\u0018\u000106j\u0004\u0018\u0001`8H\u0080\bø\u0001\u0000\u001a<\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0>\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=*\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010>\"\u0017\u0010D\u001a\u00020\n*\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0017\u0010F\u001a\u00020\n*\u00020\n8F@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010C\"\u0017\u0010D\u001a\u00020G*\u00020G8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010H\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "func", "", Constant.PARAM_IN_TRANSACTION, "Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/Fragment;", "fragment", "", "frameId", "", "tag", "addFragmentByTag", "replaceFragment", "showFragment", "hideFragment", "Landroid/app/Activity;", "", "delayMillis", "finishDelay", "addFragment", "hideSelf", "showSelf", "Landroid/view/View;", "visible", "invisible", "gone", "radius", "solid", "setShape", "(Landroid/view/View;ILjava/lang/Integer;)V", "Landroid/widget/ImageView;", "url", "loadUrl", "color", "loadUrlAndHintColor", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/graphics/Bitmap;", "toBitmap", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithRadius", "Landroid/graphics/drawable/Drawable;", "drawable", "setTintColor", "Landroid/content/Context;", "getStatusBarHeight", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/LazyThreadSafetyMode;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "inject", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Landroidx/lifecycle/LiveData;", "b", "Lkotlin/Pair;", "combineLatest", "getDp", "(I)I", com.xiaomi.hm.health.Constant.PAI_KEY_DAILY_PAI, "getSp", "sp", "", "(F)F", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.watchfacesstore.ext.ExtensionsKt$inject$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Qualifier a;
        public final /* synthetic */ Function0<ParametersHolder> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.a = qualifier;
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            Koin koin = GlobalContext.INSTANCE.get();
            Qualifier qualifier = this.a;
            Function0<ParametersHolder> function0 = this.b;
            Scope rootScope = koin.getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ext.ExtensionsKt$toBitmap$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ext.ExtensionsKt$toBitmap$2", f = "Extensions.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.c;
                this.a = str;
                this.b = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                Glide.with(KoinExtKt.getAppContext()).asBitmap().load(str).into(new SimpleTarget<Bitmap>() { // from class: com.huami.watchfacesstore.ext.ExtensionsKt$toBitmap$2$1$1
                    @Override // com.bumptech.glide.request.target.Target
                    public /* bridge */ /* synthetic */ void onResourceReady(Object obj2, Transition transition) {
                        onResourceReady((Bitmap) obj2, (Transition<? super Bitmap>) transition);
                    }

                    public void onResourceReady(@NotNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        Continuation<Bitmap> continuation = safeContinuation;
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m3845constructorimpl(resource));
                    }
                });
                obj = safeContinuation.getOrThrow();
                if (obj == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final void addFragment(@NotNull Fragment fragment, @NotNull Fragment fragment2, int i, @Nullable String str) {
        fragment.getChildFragmentManager().beginTransaction().add(i, fragment2, str).commit();
    }

    public static /* synthetic */ void addFragment$default(Fragment fragment, Fragment fragment2, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        addFragment(fragment, fragment2, i, str);
    }

    public static final void addFragmentByTag(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment fragment, int i, @Nullable String str) {
        fragmentActivity.getSupportFragmentManager().beginTransaction().add(i, fragment, str).commit();
    }

    public static /* synthetic */ void addFragmentByTag$default(FragmentActivity fragmentActivity, Fragment fragment, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        addFragmentByTag(fragmentActivity, fragment, i, str);
    }

    @NotNull
    public static final <A, B> LiveData<Pair<A, B>> combineLatest(@NotNull LiveData<A> liveData, @NotNull LiveData<B> liveData2) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: ux1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ExtensionsKt.d(mediatorLiveData, objectRef, objectRef2, obj);
            }
        });
        mediatorLiveData.addSource(liveData2, new Observer() { // from class: tx1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ExtensionsKt.e(mediatorLiveData, objectRef2, objectRef, obj);
            }
        });
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Object obj) {
        if (obj == 0 && mediatorLiveData.getValue() != 0) {
            mediatorLiveData.setValue(null);
        }
        objectRef.element = obj;
        if (obj == 0 || objectRef2.element == 0) {
            return;
        }
        mediatorLiveData.setValue(TuplesKt.to(obj, objectRef2.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Object obj) {
        if (obj == 0 && mediatorLiveData.getValue() != 0) {
            mediatorLiveData.setValue(null);
        }
        objectRef.element = obj;
        T t = objectRef2.element;
        if (t == 0 || obj == 0) {
            return;
        }
        mediatorLiveData.setValue(TuplesKt.to(t, objectRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Activity activity) {
        activity.finish();
    }

    public static final void finishDelay(@NotNull final Activity activity, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: vx1
            @Override // java.lang.Runnable
            public final void run() {
                ExtensionsKt.f(activity);
            }
        }, j);
    }

    public static final int getDp(int i) {
        return c.roundToInt(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
    }

    public static final int getSp(int i) {
        return c.roundToInt(TypedValue.applyDimension(2, i, Resources.getSystem().getDisplayMetrics()));
    }

    public static final int getStatusBarHeight(@NotNull Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelOffset = identifier > 0 ? context.getResources().getDimensionPixelOffset(identifier) : 0;
        if (dimensionPixelOffset <= 0) {
            return 25;
        }
        return dimensionPixelOffset;
    }

    public static final void gone(@NotNull View view) {
        view.setVisibility(8);
    }

    public static final void hideFragment(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment fragment) {
        fragmentActivity.getSupportFragmentManager().beginTransaction().hide(fragment).commit();
    }

    public static final void hideSelf(@NotNull Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment == null) {
            return;
        }
        hideFragment(parentFragment, fragment);
    }

    public static final void inTransaction(@NotNull FragmentManager fragmentManager, @NotNull Function1<? super FragmentTransaction, ? extends FragmentTransaction> function1) {
        function1.invoke(fragmentManager.beginTransaction()).commit();
    }

    public static final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends ParametersHolder> function0) {
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(qualifier, function0));
    }

    public static /* synthetic */ Lazy inject$default(Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(qualifier, function0));
    }

    public static final void invisible(@NotNull View view) {
        view.setVisibility(4);
    }

    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str) {
        if (str == null) {
            return;
        }
        try {
            HMImageLoader.with(imageView).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).load(str).into(imageView);
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
    }

    public static final void loadUrlAndHintColor(@NotNull final ImageView imageView, @Nullable String str, @Nullable final Integer num) {
        if (str == null) {
            return;
        }
        try {
            HMImageLoader.with(imageView).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).load(str).asDrawable().into(new HMLoadTarget<Drawable>() { // from class: com.huami.watchfacesstore.ext.ExtensionsKt$loadUrlAndHintColor$1$1$1
                @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
                public void onLoadFinish(@Nullable Drawable resource) {
                    imageView.setImageDrawable(resource);
                    Integer num2 = num;
                    if (num2 == null) {
                        return;
                    }
                    ExtensionsKt.setTintColor(imageView, num2.intValue(), resource);
                }
            });
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
    }

    public static final void loadWithRadius(@NotNull ImageView imageView, @Nullable String str, int i) {
        if (i == 0) {
            loadUrl(imageView, str);
            return;
        }
        if (str == null) {
            return;
        }
        if (!m.startsWith$default(str, "http", false, 2, null) && !m.startsWith$default(str, "https", false, 2, null)) {
            try {
                HMImageLoader.with(imageView).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).load(str).transform(new GlideRoundTransform(i)).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.NONE).crossFade().into(imageView);
                return;
            } catch (Exception e) {
                HMLog.e(ImageLoadExtentionsKt.TAG, e);
                return;
            }
        }
        try {
            DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(imageView);
            DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy = DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL;
            configBuilderWith.diskCacheStrategy(diskCacheStrategy).load(str).transform(new GlideRoundTransform(i)).diskCacheStrategy(diskCacheStrategy).crossFade().into(imageView);
        } catch (Exception e2) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e2);
        }
    }

    public static /* synthetic */ void loadWithRadius$default(ImageView imageView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        loadWithRadius(imageView, str, i);
    }

    public static final void replaceFragment(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment fragment, int i, @Nullable String str) {
        fragmentActivity.getSupportFragmentManager().beginTransaction().replace(i, fragment, str).commit();
    }

    public static /* synthetic */ void replaceFragment$default(FragmentActivity fragmentActivity, Fragment fragment, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        replaceFragment(fragmentActivity, fragment, i, str);
    }

    public static final void setShape(@NotNull View view, int i, @ColorRes @Nullable Integer num) {
        if (view.getBackground() == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(i);
            if (num != null) {
                gradientDrawable.setColor(ContextCompat.getColor(view.getContext(), num.intValue()));
            }
            Unit unit = Unit.INSTANCE;
            view.setBackground(gradientDrawable);
            return;
        }
        Drawable background = view.getBackground();
        Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable2 = (GradientDrawable) background;
        gradientDrawable2.setCornerRadius(i);
        if (num != null) {
            gradientDrawable2.setColor(ContextCompat.getColor(view.getContext(), num.intValue()));
        }
        Unit unit2 = Unit.INSTANCE;
        view.setBackground(gradientDrawable2);
    }

    public static /* synthetic */ void setShape$default(View view, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        setShape(view, i, num);
    }

    public static final void setTintColor(@NotNull ImageView imageView, @ColorInt int i, @Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawableWrap);
    }

    public static /* synthetic */ void setTintColor$default(ImageView imageView, int i, Drawable drawable, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            drawable = imageView.getDrawable();
        }
        setTintColor(imageView, i, drawable);
    }

    public static final void showFragment(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment fragment) {
        fragmentActivity.getSupportFragmentManager().beginTransaction().show(fragment).commit();
    }

    public static final void showSelf(@NotNull Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment == null) {
            return;
        }
        showFragment(parentFragment, fragment);
    }

    @Nullable
    public static final Object toBitmap(@NotNull String str, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(str, null), continuation);
    }

    public static final void visible(@NotNull View view) {
        view.setVisibility(0);
    }

    public static final float getDp(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final void hideFragment(@NotNull Fragment fragment, @NotNull Fragment fragment2) {
        fragment.getChildFragmentManager().beginTransaction().hide(fragment2).commit();
    }

    public static final void showFragment(@NotNull Fragment fragment, @NotNull Fragment fragment2) {
        fragment.getChildFragmentManager().beginTransaction().show(fragment2).commit();
    }
}
