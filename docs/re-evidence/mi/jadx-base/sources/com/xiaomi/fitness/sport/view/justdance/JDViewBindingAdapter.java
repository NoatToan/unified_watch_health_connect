package com.xiaomi.fitness.sport.view.justdance;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.sport.view.justdance.JDViewBindingAdapter;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.k47;
import defpackage.zxi;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\tH\u0007J\u001a\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/JDViewBindingAdapter;", "", "<init>", "()V", "setBackgroundColor", "", "view", "Landroid/view/View;", "color", "", "setNoBackgroundColor", "setTextViewColor", "Landroid/widget/TextView;", "setTextPlurals", "text", "", "setSwitchButtonChecked", "Lcom/xiaomi/fitness/widget/button/SwitchButton;", "isChecked", "", "setShortcutDrawable", "Landroid/widget/ImageView;", "res", "setIcon", "url", "createSSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "myTrustManager", "com/xiaomi/fitness/sport/view/justdance/JDViewBindingAdapter$myTrustManager$1", "Lcom/xiaomi/fitness/sport/view/justdance/JDViewBindingAdapter$myTrustManager$1;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JDViewBindingAdapter {

    @NotNull
    public static final JDViewBindingAdapter INSTANCE = new JDViewBindingAdapter();

    @NotNull
    private static final JDViewBindingAdapter$myTrustManager$1 myTrustManager = new X509TrustManager() { // from class: com.xiaomi.fitness.sport.view.justdance.JDViewBindingAdapter$myTrustManager$1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.JDViewBindingAdapter$setIcon$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.JDViewBindingAdapter$setIcon$1", f = "JDViewBindingAdapter.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageLoader $loader;
        final /* synthetic */ ImageRequest $request;
        final /* synthetic */ ImageView $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImageLoader imageLoader, ImageRequest imageRequest, ImageView imageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$loader = imageLoader;
            this.$request = imageRequest;
            this.$view = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$loader, this.$request, this.$view, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImageLoader imageLoader = this.$loader;
                ImageRequest imageRequest = this.$request;
                this.label = 1;
                obj = imageLoader.execute(imageRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SuccessResult successResult = obj instanceof SuccessResult ? (SuccessResult) obj : null;
            Drawable drawable = successResult != null ? successResult.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            this.$view.setImageBitmap(bitmapDrawable != null ? bitmapDrawable.getBitmap() : null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private JDViewBindingAdapter() {
    }

    private final SSLSocketFactory createSSLSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        JDViewBindingAdapter$myTrustManager$1 jDViewBindingAdapter$myTrustManager$1 = myTrustManager;
        sSLContext.init(null, new JDViewBindingAdapter$myTrustManager$1[]{jDViewBindingAdapter$myTrustManager$1}, new SecureRandom());
        SSLContext sSLContext2 = SSLContext.getInstance("SSL");
        sSLContext2.init(null, new JDViewBindingAdapter$myTrustManager$1[]{jDViewBindingAdapter$myTrustManager$1}, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext2.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
        return socketFactory;
    }

    @JvmStatic
    public static final void setBackgroundColor(@NotNull View view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable drawableR = k47.r(view.getBackground());
        Intrinsics.checkNotNullExpressionValue(drawableR, "wrap(...)");
        k47.n(drawableR.mutate(), color);
        view.setBackground(drawableR);
    }

    @JvmStatic
    public static final void setIcon(@NotNull ImageView view, @Nullable String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (url == null) {
            return;
        }
        AnyExtKt.main$default(null, new AnonymousClass1(new ImageLoader.Builder(ApplicationExtKt.getApplication()).okHttpClient(new Function0() { // from class: hpd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JDViewBindingAdapter.setIcon$lambda$1();
            }
        }).build(), new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(url).build(), view, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient setIcon$lambda$1() {
        return new OkHttpClient.Builder().sslSocketFactory(INSTANCE.createSSLSocketFactory(), myTrustManager).hostnameVerifier(new HostnameVerifier() { // from class: ipd
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return JDViewBindingAdapter.setIcon$lambda$1$lambda$0(str, sSLSession);
            }
        }).connectTimeout(10L, TimeUnit.SECONDS).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setIcon$lambda$1$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }

    @JvmStatic
    public static final void setNoBackgroundColor(@NotNull View view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(color);
        view.setBackground(colorDrawable);
    }

    @JvmStatic
    public static final void setShortcutDrawable(@NotNull ImageView view, int res) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImageResource(res);
    }

    @JvmStatic
    public static final void setSwitchButtonChecked(@NotNull SwitchButton view, boolean isChecked) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setChecked(isChecked);
    }

    @JvmStatic
    public static final void setTextPlurals(@NotNull TextView view, @NotNull String text) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(text, "text");
        Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(text);
        float fFloatValue = floatOrNull != null ? floatOrNull.floatValue() : 0.0f;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = (int) fFloatValue;
        view.setText(ResourceExtKt.getQuantityString(context, zxi.common_unit_calorie, i, Integer.valueOf(i)));
    }

    @JvmStatic
    public static final void setTextViewColor(@NotNull TextView view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextColor(color);
    }
}
