package com.xiaomi.wearable.yrn.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.Size;
import coil.size.Sizes;
import coil.target.Target;
import coil.transform.RoundedCornersTransformation;
import com.facebook.react.bridge.ReadableMap;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.yrn.components.YRNComponentsUtils;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ6\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0003\u0010\u0017\u001a\u00020\u00052\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00130\u0019JB\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\b\b\u0003\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001d\u0012\u0004\u0012\u00020\u00130\u0019R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/yrn/components/YRNComponentsUtils;", "", "<init>", "()V", "safeParseColor", "", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "defaultColor", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "safeParseText", "Lcom/xiaomi/wearable/yrn/components/TextProps;", "safeParseMargin", "Lcom/xiaomi/wearable/yrn/components/MarginProps;", "safeParsePadding", "Lcom/xiaomi/wearable/yrn/components/PaddingProps;", "getImageDrawable", "", "context", "Landroid/content/Context;", "url", "placeholder", "callback", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "getImageDrawables", "urls", "", "cacheDrawables", "", "getCacheDrawables", "()Ljava/util/Map;", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNComponentsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNComponentsUtils.kt\ncom/xiaomi/wearable/yrn/components/YRNComponentsUtils\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n470#2:127\n470#2:128\n1863#3,2:129\n*S KotlinDebug\n*F\n+ 1 YRNComponentsUtils.kt\ncom/xiaomi/wearable/yrn/components/YRNComponentsUtils\n*L\n26#1:127\n29#1:128\n114#1:129,2\n*E\n"})
public final class YRNComponentsUtils {

    @NotNull
    public static final YRNComponentsUtils INSTANCE = new YRNComponentsUtils();

    @NotNull
    private static final Map<String, Drawable> cacheDrawables = new LinkedHashMap();

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.YRNComponentsUtils$getImageDrawable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.YRNComponentsUtils$getImageDrawable$1", f = "YRNComponentsUtils.kt", i = {0, 0}, l = {95}, m = "invokeSuspend", n = {"imageLoader", "requestBuilder"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nYRNComponentsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNComponentsUtils.kt\ncom/xiaomi/wearable/yrn/components/YRNComponentsUtils$getImageDrawable$1\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,126:1\n28#2:127\n*S KotlinDebug\n*F\n+ 1 YRNComponentsUtils.kt\ncom/xiaomi/wearable/yrn/components/YRNComponentsUtils$getImageDrawable$1\n*L\n96#1:127\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Drawable, Unit> $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $placeholder;
        final /* synthetic */ String $url;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, String str, int i, Function1<? super Drawable, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$url = str;
            this.$placeholder = i;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$url, this.$placeholder, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ImageLoader imageLoaderBuild;
            ImageRequest.Builder builderTarget;
            BitmapDrawable bitmapDrawable;
            ImageRequest.Builder builder;
            Context context;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                imageLoaderBuild = new ImageLoader.Builder(this.$context).build();
                ImageRequest.Builder builderTransformations = new ImageRequest.Builder(this.$context).data(this.$url).size(150, 150).transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Boxing.boxInt(30))));
                final Function1<Drawable, Unit> function1 = this.$callback;
                builderTarget = builderTransformations.target(new Target() { // from class: com.xiaomi.wearable.yrn.components.YRNComponentsUtils$getImageDrawable$1$requestBuilder$1
                    @Override // coil.target.Target
                    public void onError(Drawable error) {
                        function1.invoke2(error);
                    }

                    @Override // coil.target.Target
                    public void onStart(Drawable drawable) {
                        Target.DefaultImpls.onStart(this, drawable);
                    }

                    @Override // coil.target.Target
                    public void onSuccess(Drawable result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        function1.invoke2(result);
                    }
                });
                int i2 = this.$placeholder;
                if (i2 != 0) {
                    Drawable drawableE = ni4.e(this.$context, i2);
                    bitmapDrawable = null;
                    Bitmap bitmap$default = drawableE != null ? DrawableKt.toBitmap$default(drawableE, 150, 150, null, 4, null) : null;
                    if (bitmap$default != null) {
                        Context context2 = this.$context;
                        RoundedCornersTransformation roundedCornersTransformation = new RoundedCornersTransformation(ExtUtilsKt.getDp(Boxing.boxInt(30)));
                        Size Size = Sizes.Size(150, 150);
                        this.L$0 = imageLoaderBuild;
                        this.L$1 = builderTarget;
                        this.L$2 = context2;
                        this.label = 1;
                        Object objTransform = roundedCornersTransformation.transform(bitmap$default, Size, this);
                        if (objTransform == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        builder = builderTarget;
                        obj = objTransform;
                        context = context2;
                    }
                    builderTarget.error(bitmapDrawable);
                }
                imageLoaderBuild.enqueue(builderTarget.build());
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$2;
            builder = (ImageRequest.Builder) this.L$1;
            imageLoaderBuild = (ImageLoader) this.L$0;
            ResultKt.throwOnFailure(obj);
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = new BitmapDrawable(resources, (Bitmap) obj);
            builderTarget = builder;
            builderTarget.error(bitmapDrawable);
            imageLoaderBuild.enqueue(builderTarget.build());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private YRNComponentsUtils() {
    }

    public static /* synthetic */ void getImageDrawable$default(YRNComponentsUtils yRNComponentsUtils, Context context, String str, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        yRNComponentsUtils.getImageDrawable(context, str, i, function1);
    }

    public static /* synthetic */ void getImageDrawables$default(YRNComponentsUtils yRNComponentsUtils, Context context, List list, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        yRNComponentsUtils.getImageDrawables(context, list, i, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getImageDrawables$lambda$1$lambda$0(List result, AtomicInteger pendingCount, Function1 callback, Drawable drawable) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(pendingCount, "$pendingCount");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        result.add(drawable);
        if (pendingCount.decrementAndGet() == 0) {
            callback.invoke2(result);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Integer safeParseColor$default(YRNComponentsUtils yRNComponentsUtils, ReadableMap readableMap, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return yRNComponentsUtils.safeParseColor(readableMap, str, str2);
    }

    public static /* synthetic */ MarginProps safeParseMargin$default(YRNComponentsUtils yRNComponentsUtils, ReadableMap readableMap, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "margin";
        }
        return yRNComponentsUtils.safeParseMargin(readableMap, str);
    }

    public static /* synthetic */ PaddingProps safeParsePadding$default(YRNComponentsUtils yRNComponentsUtils, ReadableMap readableMap, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "padding";
        }
        return yRNComponentsUtils.safeParsePadding(readableMap, str);
    }

    @NotNull
    public final Map<String, Drawable> getCacheDrawables() {
        return cacheDrawables;
    }

    public final void getImageDrawable(@NotNull Context context, @NotNull String url, int placeholder, @NotNull Function1<? super Drawable, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, Drawable> map = cacheDrawables;
        if (map.get(url) != null) {
            callback.invoke2(map.get(url));
        } else {
            AnyExtKt.io$default(null, new AnonymousClass1(context, url, placeholder, callback, null), 1, null);
        }
    }

    public final void getImageDrawables(@NotNull Context context, @NotNull List<String> urls, int placeholder, @NotNull final Function1<? super List<? extends Drawable>, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final AtomicInteger atomicInteger = new AtomicInteger(urls.size());
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = urls.iterator();
        while (it.hasNext()) {
            INSTANCE.getImageDrawable(context, (String) it.next(), placeholder, new Function1() { // from class: hwr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return YRNComponentsUtils.getImageDrawables$lambda$1$lambda$0(arrayList, atomicInteger, callback, (Drawable) obj);
                }
            });
        }
    }

    @Nullable
    public final Integer safeParseColor(@NotNull ReadableMap readableMap, @NotNull String key, @Nullable String defaultColor) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(key, "key");
        if (readableMap.hasKey(key)) {
            defaultColor = readableMap.getString(key);
        } else if (defaultColor == null) {
            return null;
        }
        if (defaultColor == null || defaultColor.length() == 0) {
            return Integer.valueOf(Color.parseColor("#FFFFFF"));
        }
        try {
            return Integer.valueOf(Color.parseColor(defaultColor));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final MarginProps safeParseMargin(@NotNull ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(key, "key");
        ReadableMap readableMapSafeGetMap = YRNComponentsExtKt.safeGetMap(readableMap, key);
        if (readableMapSafeGetMap == null) {
            return null;
        }
        return new MarginProps(YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, "top", 0), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, "bottom", 0), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, "left", 0), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, TSMAuthContants.PARAM_KEY_RIGHT, 0));
    }

    @Nullable
    public final PaddingProps safeParsePadding(@NotNull ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(key, "key");
        ReadableMap readableMapSafeGetMap = YRNComponentsExtKt.safeGetMap(readableMap, key);
        if (readableMapSafeGetMap == null) {
            return null;
        }
        return new PaddingProps(YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, "top", 0), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, "bottom", 0), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, "left", 0), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, TSMAuthContants.PARAM_KEY_RIGHT, 0));
    }

    @Nullable
    public final TextProps safeParseText(@NotNull ReadableMap readableMap, @NotNull String key) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(key, "key");
        ReadableMap readableMapSafeGetMap = YRNComponentsExtKt.safeGetMap(readableMap, key);
        if (readableMapSafeGetMap == null) {
            return null;
        }
        return new TextProps(YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap, MediaStoreUtil.MediaInfo.SIZE, 12), safeParseColor(readableMap, "color", "#000000"), safeParseMargin$default(this, readableMapSafeGetMap, null, 2, null), safeParsePadding$default(this, readableMapSafeGetMap, null, 2, null));
    }
}
