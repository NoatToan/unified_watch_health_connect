package com.huami.third.alexa;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.identity.auth.alexa.AlexaAuthKtxKt;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.identity.auth.alexa.AuthError;
import com.huami.identity.auth.alexa.AuthStatus;
import com.huami.identity.auth.alexa.AuthSuccess;
import com.huami.third.alexa.AmazonBindActivity;
import com.huami.thirdparty.support.ExtensionKt;
import com.huami.thirdparty.support.statusbar.StatusBarHelper;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0002MNB\u0007¢\u0006\u0004\bK\u0010LJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0003J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0005H\u0014J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0016R\u001d\u0010+\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00105\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u00107R\u0016\u0010:\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u00107R\u0016\u0010<\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010.R\u0016\u0010?\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u0016\u0010A\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010I¨\u0006O"}, d2 = {"Lcom/huami/third/alexa/AmazonBindActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "o", DTransferConstants.SEARCH_KEY, SOAP.XMLNS, "", "str", "spanStr", "r", "h", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "unbindAuthor", "showLoadingDialog", "f", "token", "l", "", "errorCode", hl.k, "u", GoogleApiAvailabilityLight.b, "m", "", "isShow", com.google.android.exoplayer2.text.ttml.b.r, "onCreate", "outState", "onSaveInstanceState", "onResume", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Lcom/huami/identity/auth/alexa/AuthApi;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/identity/auth/alexa/AuthApi;", "authApi", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "desTx", "c", "desTx1", GoogleApiAvailabilityLight.a, "desTx2", "e", "login", "Landroid/graphics/Typeface;", "Landroid/graphics/Typeface;", "mAmazonRgFace", "mAmazonLtFace", "mAmazonMdFace", "i", "mTvLearnMore", z.j, "Landroid/view/View;", "mLine", "selectLanguage", "selectBtn", "Ljava/lang/String;", "alexaProductID", "deviceID", "Lkotlin/Lazy;", "Lcom/huami/third/alexa/AlexaLanguageHelper;", "alexaLanguageHelper", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "CustomTypefaceSpan", "alexa-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AmazonBindActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String INTENT_DID_KEY = "device_id";

    @NotNull
    private static final String q = "com.amazon.dee.app";

    @NotNull
    private static final String r = "speech";

    @NotNull
    private static final String s = "alexa_product_id";
    private static final int t = -2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy authApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextView desTx;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextView desTx1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TextView desTx2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView login;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Typeface mAmazonRgFace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Typeface mAmazonLtFace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Typeface mAmazonMdFace;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private TextView mTvLearnMore;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private View mLine;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View selectLanguage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private TextView selectBtn;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String alexaProductID;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String deviceID;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy<AlexaLanguageHelper> alexaLanguageHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/huami/third/alexa/AmazonBindActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "productId", "deviceID", "Landroid/content/Intent;", "getIntent", "AMAZON_PACKAGE_NAME", "Ljava/lang/String;", "INTENT_DID_KEY", "INTENT_PID_KEY", "", "LOGIN_FAILED_ERROR_PRODUCT_ID", LogUtil.I, "TAG", "<init>", "()V", "alexa-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getIntent(@Nullable Context context, @Nullable String productId, @Nullable String deviceID) {
            Intent intent = new Intent(context, (Class<?>) AmazonBindActivity.class);
            intent.putExtra(AmazonBindActivity.s, productId);
            intent.putExtra("device_id", deviceID);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/third/alexa/AmazonBindActivity$CustomTypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Paint;", "paint", "", "a", "Landroid/text/TextPaint;", "drawState", "updateDrawState", "updateMeasureState", "Landroid/graphics/Typeface;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Lcom/huami/third/alexa/AmazonBindActivity;Landroid/graphics/Typeface;)V", "alexa-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class CustomTypefaceSpan extends MetricAffectingSpan {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final Typeface typeface;

        public CustomTypefaceSpan(Typeface typeface) {
            this.typeface = typeface;
        }

        private final void a(Paint paint) {
            Typeface typeface = paint.getTypeface();
            int style = (typeface == null ? 0 : typeface.getStyle()) & (~this.typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(this.typeface);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint drawState) {
            a(drawState);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NotNull TextPaint paint) {
            a(paint);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$onLoginFailed$1", f = "AmazonBindActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.huami.third.alexa.AmazonBindActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0613a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0613a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Alexa登录失败,错误码：" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info("speech", new C0613a(this.c));
            AmazonBindActivity.this.f();
            if (AmazonBindActivity.this.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                AmazonBindActivity.this.u(this.c);
            }
            AuthCallback authCallback = AlexaHolder.INSTANCE.getAuthCallback();
            if (authCallback != null) {
                authCallback.onLoginFailed(AmazonBindActivity.this);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$onLoginSuccess$1", f = "AmazonBindActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onLoginSuccess";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info("speech", a.a);
            AmazonBindActivity.this.q();
            AuthCallback authCallback = AlexaHolder.INSTANCE.getAuthCallback();
            if (authCallback != null) {
                authCallback.onLoginSuccess(AmazonBindActivity.this, this.c);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$onLogoutFailed$1", f = "AmazonBindActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onLogoutFailed";
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info("speech", a.a);
            AmazonBindActivity.this.f();
            AuthCallback authCallback = AlexaHolder.INSTANCE.getAuthCallback();
            if (authCallback != null) {
                authCallback.onLogoutFailed(AmazonBindActivity.this);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$onLogoutSuccess$1", f = "AmazonBindActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onLogoutSuccess";
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info("speech", a.a);
            AmazonBindActivity.this.q();
            AuthCallback authCallback = AlexaHolder.INSTANCE.getAuthCallback();
            if (authCallback != null) {
                authCallback.onLogoutSuccess(AmazonBindActivity.this);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onResume,refresh view";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Alexa授权页面调用了onSaveInstanceState";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String str = AmazonBindActivity.this.alexaProductID;
            Objects.requireNonNull(str);
            String str2 = AmazonBindActivity.this.deviceID;
            Objects.requireNonNull(str2);
            return "获取的Alexa授权参数：（alexaProductID：" + str + ",deviceID:" + str2 + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$refreshAlexaLanguageView$1", f = "AmazonBindActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "是否支持显示多语言选择：" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(AmazonBindActivity amazonBindActivity, String str) {
            View view = amazonBindActivity.selectLanguage;
            Objects.requireNonNull(view);
            view.setVisibility(0);
            TextView textView = amazonBindActivity.selectBtn;
            Objects.requireNonNull(textView);
            textView.setText(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AmazonBindActivity amazonBindActivity) {
            View view = amazonBindActivity.selectLanguage;
            Objects.requireNonNull(view);
            view.setVisibility(8);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean showSelectLanguage = ((AlexaLanguageHelper) AmazonBindActivity.this.alexaLanguageHelper.getValue()).getShowSelectLanguage();
            HMLog.info("speech", new a(showSelectLanguage));
            if (this.c && showSelectLanguage) {
                final String strCurrentAlexaLanguage = ((AlexaLanguageHelper) AmazonBindActivity.this.alexaLanguageHelper.getValue()).currentAlexaLanguage();
                final AmazonBindActivity amazonBindActivity = AmazonBindActivity.this;
                amazonBindActivity.runOnUiThread(new Runnable() { // from class: com.huami.third.alexa.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AmazonBindActivity.h.c(amazonBindActivity, strCurrentAlexaLanguage);
                    }
                });
            } else {
                final AmazonBindActivity amazonBindActivity2 = AmazonBindActivity.this;
                amazonBindActivity2.runOnUiThread(new Runnable() { // from class: com.huami.third.alexa.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AmazonBindActivity.h.e(amazonBindActivity2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$refreshView$1", f = "AmazonBindActivity.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Alexa是否授权：" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$refreshView$1$isAlexaLogin$1", f = "AmazonBindActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ AmazonBindActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AmazonBindActivity amazonBindActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = amazonBindActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b.g().isLogin());
            }
        }

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                b bVar = new b(AmazonBindActivity.this, null);
                this.a = 1;
                obj = BuildersKt.withContext(io2, bVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            HMLog.info("speech", new a(zBooleanValue));
            AmazonBindActivity.this.f();
            if (zBooleanValue) {
                TextView textView = AmazonBindActivity.this.desTx;
                Objects.requireNonNull(textView);
                textView.setText(R.string.third_party_amazon_account_login_des);
                TextView textView2 = AmazonBindActivity.this.desTx1;
                Objects.requireNonNull(textView2);
                textView2.setVisibility(0);
                TextView textView3 = AmazonBindActivity.this.desTx2;
                Objects.requireNonNull(textView3);
                textView3.setVisibility(0);
                TextView textView4 = AmazonBindActivity.this.login;
                Objects.requireNonNull(textView4);
                textView4.setText(R.string.third_party_amazon_account_logout);
                TextView textView5 = AmazonBindActivity.this.mTvLearnMore;
                Objects.requireNonNull(textView5);
                textView5.setVisibility(0);
                View view = AmazonBindActivity.this.mLine;
                Objects.requireNonNull(view);
                view.setVisibility(0);
                AmazonBindActivity.this.s();
                AmazonBindActivity.this.p(true);
            } else {
                TextView textView6 = AmazonBindActivity.this.desTx;
                Objects.requireNonNull(textView6);
                textView6.setText(R.string.third_party_amazon_account_logout_des);
                TextView textView7 = AmazonBindActivity.this.login;
                Objects.requireNonNull(textView7);
                textView7.setText(R.string.third_party_amazon_account_login);
                TextView textView8 = AmazonBindActivity.this.desTx1;
                Objects.requireNonNull(textView8);
                textView8.setVisibility(8);
                TextView textView9 = AmazonBindActivity.this.desTx2;
                Objects.requireNonNull(textView9);
                textView9.setVisibility(8);
                TextView textView10 = AmazonBindActivity.this.mTvLearnMore;
                Objects.requireNonNull(textView10);
                textView10.setVisibility(8);
                View view2 = AmazonBindActivity.this.mLine;
                Objects.requireNonNull(view2);
                view2.setVisibility(8);
                AmazonBindActivity.this.p(false);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.alexa.AmazonBindActivity$unbindAuthor$1", f = "AmazonBindActivity.kt", i = {}, l = {303, 313}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "因某种原因导致的alexa product id为空";
            }
        }

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AmazonBindActivity.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:18:0x0049  */
        /* JADX WARN: Code duplicated, block: B:31:0x009a  */
        /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AuthStatus authStatus;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (AmazonBindActivity.this.g().isLogin()) {
                    AuthApi authApiG = AmazonBindActivity.this.g();
                    this.a = 1;
                    obj = authApiG.signOut(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((AuthStatus) obj) instanceof AuthSuccess) {
                        AmazonBindActivity.this.n();
                    } else {
                        AmazonBindActivity.this.m();
                    }
                } else {
                    String str = AmazonBindActivity.this.alexaProductID;
                    Objects.requireNonNull(str);
                    if (str.length() == 0) {
                        HMLog.warn$default("speech", null, a.a, 2, null);
                        AmazonBindActivity.this.k(-2);
                        return Unit.INSTANCE;
                    }
                    AuthApi authApiG2 = AmazonBindActivity.this.g();
                    String str2 = AmazonBindActivity.this.deviceID;
                    Objects.requireNonNull(str2);
                    String str3 = AmazonBindActivity.this.alexaProductID;
                    Objects.requireNonNull(str3);
                    this.a = 2;
                    obj = AlexaAuthKtxKt.signIn(authApiG2, str2, str3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authStatus = (AuthStatus) obj;
                    if (authStatus instanceof AuthSuccess) {
                        AmazonBindActivity.this.l(((AuthSuccess) authStatus).getToken().getAccessToken());
                    } else if (authStatus instanceof AuthError) {
                        AmazonBindActivity.this.k(((AuthError) authStatus).getCode());
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                if (((AuthStatus) obj) instanceof AuthSuccess) {
                    AmazonBindActivity.this.n();
                } else {
                    AmazonBindActivity.this.m();
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                authStatus = (AuthStatus) obj;
                if (authStatus instanceof AuthSuccess) {
                    AmazonBindActivity.this.l(((AuthSuccess) authStatus).getToken().getAccessToken());
                } else if (authStatus instanceof AuthError) {
                    AmazonBindActivity.this.k(((AuthError) authStatus).getCode());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AmazonBindActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.authApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AuthApi>() { // from class: com.huami.third.alexa.AmazonBindActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.identity.auth.alexa.AuthApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AuthApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AuthApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.alexaLanguageHelper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AlexaLanguageHelper>() { // from class: com.huami.third.alexa.AmazonBindActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.third.alexa.AlexaLanguageHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AlexaLanguageHelper getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AlexaLanguageHelper.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.loadingDialog;
        boolean z = false;
        if (loadingDialog2 != null && loadingDialog2.isShowing()) {
            z = true;
        }
        if (!z || (loadingDialog = this.loadingDialog) == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthApi g() {
        return (AuthApi) this.authApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        PackageInfo packageInfo;
        try {
            packageInfo = getPackageManager().getPackageInfo(q, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.amazon.dee.app"));
                startActivity(intent);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://alexa.amazon.com"));
                startActivity(intent2);
                return;
            }
        }
        Intent intent3 = new Intent("android.intent.action.MAIN", (Uri) null);
        intent3.addCategory("android.intent.category.LAUNCHER");
        intent3.setPackage(packageInfo.packageName);
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent3, 0);
        ResolveInfo next = listQueryIntentActivities.iterator().hasNext() ? listQueryIntentActivities.iterator().next() : null;
        if (next != null) {
            ActivityInfo activityInfo = next.activityInfo;
            String str = activityInfo.packageName;
            String str2 = activityInfo.name;
            Intent intent4 = new Intent("android.intent.action.MAIN");
            intent4.addCategory("android.intent.category.LAUNCHER");
            intent4.setComponent(new ComponentName(str, str2));
            startActivity(intent4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AmazonBindActivity amazonBindActivity, View view) {
        amazonBindActivity.unbindAuthor(view);
    }

    @SuppressLint({"StringFormatInvalid"})
    private final void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        StatusBarHelper.trySetStatusBar(this, true);
        toolbar.setPadding(0, StatusBarHelper.getStatusBarHeight(getResources()), 0, 0);
        int i2 = R.string.third_party_author_lvmi;
        int i3 = R.string.third_party_amazon_account;
        toolbar.setTitle(getString(i2, new Object[]{getString(i3)}));
        ExtensionKt.centerTitle(toolbar, -16777216, 16.0f, true);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
        ExtensionKt.support(toolbar, this);
        TextView textView = (TextView) findViewById(R.id.tv_author_name);
        Typeface typeface = this.mAmazonRgFace;
        Objects.requireNonNull(typeface);
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) findViewById(R.id.tv_author_des);
        this.desTx = textView2;
        Objects.requireNonNull(textView2);
        Typeface typeface2 = this.mAmazonLtFace;
        Objects.requireNonNull(typeface2);
        textView2.setTypeface(typeface2);
        TextView textView3 = (TextView) findViewById(R.id.tv_author_des_1);
        this.desTx1 = textView3;
        Objects.requireNonNull(textView3);
        Typeface typeface3 = this.mAmazonRgFace;
        Objects.requireNonNull(typeface3);
        textView3.setTypeface(typeface3);
        TextView textView4 = (TextView) findViewById(R.id.tv_author_des_2);
        this.desTx2 = textView4;
        Objects.requireNonNull(textView4);
        Typeface typeface4 = this.mAmazonLtFace;
        Objects.requireNonNull(typeface4);
        textView4.setTypeface(typeface4);
        TextView textView5 = (TextView) findViewById(R.id.amazon_login_out);
        this.login = textView5;
        Objects.requireNonNull(textView5);
        Typeface typeface5 = this.mAmazonMdFace;
        Objects.requireNonNull(typeface5);
        textView5.setTypeface(typeface5);
        TextView textView6 = this.login;
        Objects.requireNonNull(textView6);
        textView6.setOnClickListener(new View.OnClickListener() { // from class: fc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AmazonBindActivity.i(this.a, view);
            }
        });
        textView.setText(getString(i3));
        this.mTvLearnMore = (TextView) findViewById(R.id.tv_learn_more);
        this.mLine = findViewById(R.id.v_line);
        View viewFindViewById = findViewById(R.id.part_select_language);
        this.selectLanguage = viewFindViewById;
        Objects.requireNonNull(viewFindViewById);
        TextView textView7 = (TextView) viewFindViewById.findViewById(R.id.btn_select_language);
        this.selectBtn = textView7;
        Objects.requireNonNull(textView7);
        textView7.setOnClickListener(new View.OnClickListener() { // from class: gc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AmazonBindActivity.j(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(AmazonBindActivity amazonBindActivity, View view) {
        amazonBindActivity.alexaLanguageHelper.getValue().goToSelectAlexaLanguage(amazonBindActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int errorCode) {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new a(errorCode, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String token) {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new b(token, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new d(null), 2, null);
    }

    private final void o(Bundle savedInstanceState) {
        String string;
        String stringExtra = getIntent().getStringExtra(s);
        if (stringExtra == null) {
            stringExtra = "";
            if (savedInstanceState != null && (string = savedInstanceState.getString(s)) != null) {
                stringExtra = string;
            }
        }
        this.alexaProductID = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("device_id");
        if (stringExtra2 == null) {
            String string2 = savedInstanceState == null ? null : savedInstanceState.getString("device_id");
            if (string2 == null) {
                string2 = this.alexaProductID;
                Objects.requireNonNull(string2);
            }
            stringExtra2 = string2;
        }
        this.deviceID = stringExtra2;
        HMLog.info("speech", new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean isShow) {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new h(isShow, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        showLoadingDialog();
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(null), 3, null);
    }

    private final void r(String str, String spanStr) {
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, spanStr, 0, false, 6, (Object) null);
        int length = spanStr.length() + iLastIndexOf$default;
        SpannableString spannableString = new SpannableString(str);
        Typeface typeface = this.mAmazonLtFace;
        Objects.requireNonNull(typeface);
        spannableString.setSpan(new CustomTypefaceSpan(typeface), 0, iLastIndexOf$default, 18);
        Typeface typeface2 = this.mAmazonLtFace;
        Objects.requireNonNull(typeface2);
        spannableString.setSpan(new CustomTypefaceSpan(typeface2), length, str.length(), 18);
        Typeface typeface3 = this.mAmazonRgFace;
        Objects.requireNonNull(typeface3);
        spannableString.setSpan(new CustomTypefaceSpan(typeface3), iLastIndexOf$default, length, 34);
        spannableString.setSpan(new ClickableSpan() { // from class: com.huami.third.alexa.AmazonBindActivity$setLearMoreTvMovementStr$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                this.a.h();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NotNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.parseColor("#009DC7"));
                ds.setUnderlineText(false);
            }
        }, iLastIndexOf$default, length, 17);
        TextView textView = this.mTvLearnMore;
        Objects.requireNonNull(textView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.mTvLearnMore;
        Objects.requireNonNull(textView2);
        textView2.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        String string = getResources().getString(R.string.third_party_amazon_learn_more);
        if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "Amazon Alexa App", false, 2, (Object) null)) {
            r(string, "Amazon Alexa App");
            return;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "Amazon Alexa", false, 2, (Object) null)) {
            r(string, "Amazon Alexa");
            return;
        }
        TextView textView = this.mTvLearnMore;
        Objects.requireNonNull(textView);
        textView.setText(string);
        TextView textView2 = this.mTvLearnMore;
        Objects.requireNonNull(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AmazonBindActivity.t(this.a, view);
            }
        });
    }

    private final void showLoadingDialog() {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.loadingDialog;
        boolean z = false;
        if (loadingDialog2 == null) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            loadingDialogShowDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.loadingDialog = loadingDialogShowDialog;
            return;
        }
        if (loadingDialog2 != null && loadingDialog2.isShowing()) {
            z = true;
        }
        if (z || (loadingDialog = this.loadingDialog) == null) {
            return;
        }
        loadingDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(AmazonBindActivity amazonBindActivity, View view) {
        amazonBindActivity.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int errorCode) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        builder.setTitle(R.string.third_party_amazon_auth_failed);
        if (errorCode > -1) {
            builder.setMessage("(" + errorCode + ")");
        }
        builder.setNeutralButton(R.string.third_party_amazon_got_it, (DialogInterface.OnClickListener) null);
        builder.show(getSupportFragmentManager()).setGravity(17);
    }

    private final void unbindAuthor(View view) {
        if (UtilsKt.isFastDoubleClick(view)) {
            return;
        }
        showLoadingDialog();
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new j(null), 2, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon_bind);
        getLifecycle().addObserver((LifecycleObserver) g());
        o(savedInstanceState);
        this.mAmazonRgFace = Typeface.createFromAsset(getAssets(), "fonts/AmazonEmberDisplay_Rg.ttf");
        this.mAmazonMdFace = Typeface.createFromAsset(getAssets(), "fonts/AmazonEmberDisplay_Md.ttf");
        this.mAmazonLtFace = Typeface.createFromAsset(getAssets(), "fonts/AmazonEmberDisplay_Lt.ttf");
        initView();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HMLog.info("speech", e.a);
        q();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        HMLog.info("speech", f.a);
        String str = this.alexaProductID;
        Objects.requireNonNull(str);
        outState.putString(s, str);
        String str2 = this.deviceID;
        Objects.requireNonNull(str2);
        outState.putString("device_id", str2);
    }
}
