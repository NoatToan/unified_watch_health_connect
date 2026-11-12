package com.xiaomi.fitness.devicesettings.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableKt;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007J.\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J8\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil;", "", "<init>", "()V", "lazyHeader", "Lcoil/request/ImageRequest$Builder;", "header", "", "", "loadBitmapWidthCookie", "", "view", "Landroid/widget/ImageView;", "url", "cookie", "context", "Landroid/content/Context;", "callback", "Lcom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil$Callback;", "Callback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoadUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoadUtil.kt\ncom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,74:1\n1863#2,2:75\n54#3,3:77\n24#3:80\n59#3,6:81\n*S KotlinDebug\n*F\n+ 1 ImageLoadUtil.kt\ncom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil\n*L\n19#1:75,2\n34#1:77,3\n34#1:80\n34#1:81,6\n*E\n"})
public final class ImageLoadUtil {

    @NotNull
    public static final ImageLoadUtil INSTANCE = new ImageLoadUtil();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil$Callback;", "", "onReady", "", TSMAuthContants.PARAM_RESOURCE, "Landroid/graphics/Bitmap;", "onFailure", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Callback {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onFailure(@NotNull Callback callback, @Nullable Drawable drawable) {
            }
        }

        void onFailure(@Nullable Drawable errorDrawable);

        void onReady(@NotNull Bitmap resource);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil$loadBitmapWidthCookie$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil$loadBitmapWidthCookie$2", f = "ImageLoadUtil.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nImageLoadUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoadUtil.kt\ncom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil$loadBitmapWidthCookie$2\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,74:1\n489#2,11:75\n24#3:86\n*S KotlinDebug\n*F\n+ 1 ImageLoadUtil.kt\ncom/xiaomi/fitness/devicesettings/utils/ImageLoadUtil$loadBitmapWidthCookie$2\n*L\n53#1:75,11\n62#1:86\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ Map<String, String> $cookie;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, Map<String, String> map, Callback callback, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$url = str;
            this.$cookie = map;
            this.$callback = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$url, this.$cookie, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImageRequest.Builder builderLazyHeader = ImageLoadUtil.INSTANCE.lazyHeader(new ImageRequest.Builder(this.$context).data(this.$url), this.$cookie);
                builderLazyHeader.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil$loadBitmapWidthCookie$2$invokeSuspend$lambda$2$$inlined$listener$default$1
                    @Override // coil.request.ImageRequest.Listener
                    public void onCancel(@NotNull ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                        Logger.e(WidgetGroupEditFragment.sTAG, result.getThrowable());
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onStart(@NotNull ImageRequest request) {
                    }

                    @Override // coil.request.ImageRequest.Listener
                    public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                        Logger.d(WidgetGroupEditFragment.sTAG, "loadBitmapWidthCookie onSuccess");
                    }
                });
                ImageRequest imageRequestBuild = builderLazyHeader.build();
                ImageLoader imageLoader = Coil.imageLoader(this.$context);
                this.label = 1;
                obj = imageLoader.execute(imageRequestBuild, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Drawable drawable = ((ImageResult) obj).getDrawable();
            if (drawable != null) {
                Callback callback = this.$callback;
                Logger.d(WidgetGroupEditFragment.sTAG, "loadBitmapWidthCookie onSuccess2");
                callback.onReady(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null));
            } else {
                this.$callback.onFailure(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private ImageLoadUtil() {
    }

    @JvmStatic
    public static final void loadBitmapWidthCookie(@Nullable ImageView view, @NotNull String url, @NotNull Map<String, String> cookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        if (TextUtils.isEmpty(url) || view == null) {
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(url).target(view);
        INSTANCE.lazyHeader(builderTarget, cookie);
        imageLoader.enqueue(builderTarget.build());
    }

    @NotNull
    public final ImageRequest.Builder lazyHeader(@NotNull ImageRequest.Builder builder, @NotNull Map<String, String> header) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        Iterator<T> it = header.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builder.addHeader(NetConstants.COOKIE, "auth_key=rwelJuWBFJxmbMKD");
        return builder;
    }

    @JvmStatic
    public static final void loadBitmapWidthCookie(@Nullable Context context, @Nullable String url, @NotNull Map<String, String> cookie, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (context == null || TextUtils.isEmpty(url)) {
            return;
        }
        ScopeExtKt.scopeNet$default(null, new AnonymousClass2(context, url, cookie, callback, null), 1, null);
    }
}
