package com.huami.account.ui.bind;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.huami.account.event.EventPhoneBinding;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.account.ui.common.GlobalTitleStyleKt;
import com.huami.account.utils.AccountConstants;
import com.huami.account.utils.UtilsKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.Message;
import com.huami.passport.entity.Profile;
import com.huami.passport.entity.SmsCode;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import de.greenrobot.event.EventBus;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0001_B\u0007¢\u0006\u0004\b]\u0010^J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\u0014\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020\nH\u0002J\u0012\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014J\"\u0010)\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010'H\u0014R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00103R\u001d\u00109\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R%\u0010>\u001a\n ;*\u0004\u0018\u00010:0:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b+\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R%\u0010E\u001a\n ;*\u0004\u0018\u00010B0B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\bC\u0010DR%\u0010I\u001a\n ;*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bG\u0010HR%\u0010L\u001a\n ;*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u0010HR%\u0010M\u001a\n ;*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\b/\u0010HR%\u0010P\u001a\n ;*\u0004\u0018\u00010N0N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\b<\u0010OR%\u0010Q\u001a\n ;*\u0004\u0018\u00010N0N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b?\u0010OR%\u0010S\u001a\n ;*\u0004\u0018\u00010F0F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bJ\u0010HR$\u0010W\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010X\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010VR\u0016\u0010\\\u001a\u00020Y8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006`"}, d2 = {"Lcom/huami/account/ui/bind/PhoneBindActivity;", "Lcom/huami/account/ui/common/BaseTitleOauthActivity;", "Lkotlinx/coroutines/CoroutineScope;", "", "getBindType", "", "rawPhone", "Landroid/text/SpannableString;", "C", "Lkotlin/Function1;", "", "phoneNumberCallback", "z", ExifInterface.LATITUDE_SOUTH, "initViews", LogUtil.D, PhoneBindPasswordActivity.EXTRA_SMS_CODE, "phone", "L", "P", "Lcom/huami/passport/entity/Message;", "message", "v", "R", "reason", "w", "u", "O", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/Job;", "y", "msg", "Q", "hideProgressDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lkotlinx/coroutines/CompletableJob;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlinx/coroutines/CompletableJob;", "job", "", "B", "Z", "isCountingDown", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "Lkotlin/Lazy;", "G", "()Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "lastLoginInfoRepository", "Lcom/huami/passport/AccountManager;", "kotlin.jvm.PlatformType", "E", "()Lcom/huami/passport/AccountManager;", "accountManager", "F", "Ljava/lang/String;", "currentPhone", "Landroid/view/View;", "H", "()Landroid/view/View;", "layoutChangeBindHead", "Landroid/widget/TextView;", "J", "()Landroid/widget/TextView;", "tvBindNewPhoneHead", LogUtil.I, "K", "tvCurrentPhone", "confirmBtn", "Landroid/widget/EditText;", "()Landroid/widget/EditText;", "inputPhoneNumber", "inputVerificationCode", "M", "sendVerifyBtn", "Landroid/text/Editable;", "N", "Lkotlin/jvm/functions/Function1;", "verifyCodeBtnStateListener", "nextStepButtonStateListener", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneBindActivity extends BaseTitleOauthActivity implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_BIND_TYPE = "bindType";
    public static final int EXTRA_BIND_TYPE_BIND = 1;
    public static final int EXTRA_BIND_TYPE_CHANGE = 2;
    public static final int EXTRA_BIND_TYPE_UNKNOWN = -1;
    public static final int REQUEST_SET_PASSWORD = 1000;
    public static final int RESEND_DELAY_SECONDS = 60;

    @NotNull
    public static final String TAG = "PhoneBindActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob job = JobKt__JobKt.d(null, 1, null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isCountingDown;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy lastLoginInfoRepository;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private String currentPhone;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutChangeBindHead;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvBindNewPhoneHead;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvCurrentPhone;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirmBtn;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPhoneNumber;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputVerificationCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendVerifyBtn;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final Function1<Editable, Unit> verifyCodeBtnStateListener;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Function1<Editable, Unit> nextStepButtonStateListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/bind/PhoneBindActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PhoneBindActivity.EXTRA_BIND_TYPE, "Landroid/content/Intent;", "getIntent", "", "EXTRA_BIND_TYPE", "Ljava/lang/String;", "EXTRA_BIND_TYPE_BIND", LogUtil.I, "EXTRA_BIND_TYPE_CHANGE", "EXTRA_BIND_TYPE_UNKNOWN", "REQUEST_SET_PASSWORD", "RESEND_DELAY_SECONDS", "TAG", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent getIntent(@NotNull Context context, int bindType) {
            Intent intent = new Intent(context, (Class<?>) PhoneBindActivity.class);
            intent.putExtra(PhoneBindActivity.EXTRA_BIND_TYPE, bindType);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/passport/AccountManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AccountManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountManager getA() {
            return AccountManager.getDefault(PhoneBindActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TextView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) PhoneBindActivity.this.findViewById(R.id.confirm_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.bind.PhoneBindActivity$enableResendAfterDelay$1", f = "PhoneBindActivity.kt", i = {0}, l = {428}, m = "invokeSuspend", n = {"timeRemain"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PhoneBindActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x007d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007b -> B:13:0x007e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.e
                r2 = 60
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 != r4) goto L20
                int r1 = r9.d
                int r2 = r9.c
                java.lang.Object r5 = r9.b
                com.huami.account.ui.bind.PhoneBindActivity r5 = (com.huami.account.ui.bind.PhoneBindActivity) r5
                java.lang.Object r6 = r9.a
                kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r1
                r1 = r9
                goto L7e
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                kotlin.ResultKt.throwOnFailure(r10)
                com.huami.account.ui.bind.PhoneBindActivity r10 = com.huami.account.ui.bind.PhoneBindActivity.this
                android.widget.TextView r10 = com.huami.account.ui.bind.PhoneBindActivity.access$getSendVerifyBtn(r10)
                r10.setEnabled(r3)
                kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
                r10.<init>()
                r10.element = r2
                com.huami.account.ui.bind.PhoneBindActivity r1 = com.huami.account.ui.bind.PhoneBindActivity.this
                com.huami.account.ui.bind.PhoneBindActivity.access$setCountingDown$p(r1, r4)
                com.huami.account.ui.bind.PhoneBindActivity r1 = com.huami.account.ui.bind.PhoneBindActivity.this
                r6 = r10
                r5 = r1
                r10 = 60
                r2 = 0
                r1 = r9
            L48:
                if (r2 >= r10) goto L86
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                r7.intValue()
                int r7 = r6.element
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = "s"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                android.widget.TextView r8 = com.huami.account.ui.bind.PhoneBindActivity.access$getSendVerifyBtn(r5)
                r8.setText(r7)
                r7 = 1000(0x3e8, double:4.94E-321)
                r1.a = r6
                r1.b = r5
                r1.c = r2
                r1.d = r10
                r1.e = r4
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r7, r1)
                if (r7 != r0) goto L7e
                return r0
            L7e:
                int r7 = r6.element
                int r7 = r7 + (-1)
                r6.element = r7
                int r2 = r2 + r4
                goto L48
            L86:
                com.huami.account.ui.bind.PhoneBindActivity r10 = com.huami.account.ui.bind.PhoneBindActivity.this
                com.huami.account.ui.bind.PhoneBindActivity.access$setCountingDown$p(r10, r3)
                com.huami.account.ui.bind.PhoneBindActivity r10 = com.huami.account.ui.bind.PhoneBindActivity.this
                android.widget.TextView r10 = com.huami.account.ui.bind.PhoneBindActivity.access$getSendVerifyBtn(r10)
                com.huami.account.ui.bind.PhoneBindActivity r0 = com.huami.account.ui.bind.PhoneBindActivity.this
                android.content.res.Resources r0 = r0.getResources()
                int r2 = com.huami.account.ui.R.string.account_ui_register_phone_resend_code
                java.lang.String r0 = r0.getString(r2)
                r10.setText(r0)
                com.huami.account.ui.bind.PhoneBindActivity r10 = com.huami.account.ui.bind.PhoneBindActivity.this
                android.widget.TextView r10 = com.huami.account.ui.bind.PhoneBindActivity.access$getSendVerifyBtn(r10)
                r10.setEnabled(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.account.ui.bind.PhoneBindActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EditText> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) PhoneBindActivity.this.findViewById(R.id.input_phone_number);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<EditText> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) PhoneBindActivity.this.findViewById(R.id.input_verification_code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<View> {
        public f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return PhoneBindActivity.this.findViewById(R.id.layout_change_bind_head);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Editable, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            invoke2(editable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Editable editable) {
            PhoneBindActivity.this.S();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<String, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            PhoneBindActivity.this.K().setText(PhoneBindActivity.this.C(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<TextView> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) PhoneBindActivity.this.findViewById(R.id.send_verify_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<TextView> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) PhoneBindActivity.this.findViewById(R.id.tv_bind_new_phone_head);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<TextView> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) PhoneBindActivity.this.findViewById(R.id.tv_current_phone);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<Editable, Unit> {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
            invoke2(editable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Editable editable) {
            PhoneBindActivity.this.I().setEnabled(PhoneBindActivity.this.E().length() > 0 && !PhoneBindActivity.this.isCountingDown);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneBindActivity() {
        final Qualifier qualifier = null;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.lastLoginInfoRepository = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LastLoginInfoRepository>() { // from class: com.huami.account.ui.bind.PhoneBindActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.auth.repository.LastLoginInfoRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final LastLoginInfoRepository getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(LastLoginInfoRepository.class), qualifier, objArr);
            }
        });
        this.accountManager = LazyKt__LazyJVMKt.lazy(new a());
        this.layoutChangeBindHead = LazyKt__LazyJVMKt.lazy(new f());
        this.tvBindNewPhoneHead = LazyKt__LazyJVMKt.lazy(new j());
        this.tvCurrentPhone = LazyKt__LazyJVMKt.lazy(new k());
        this.confirmBtn = LazyKt__LazyJVMKt.lazy(new b());
        this.inputPhoneNumber = LazyKt__LazyJVMKt.lazy(new d());
        this.inputVerificationCode = LazyKt__LazyJVMKt.lazy(new e());
        this.sendVerifyBtn = LazyKt__LazyJVMKt.lazy(new i());
        this.verifyCodeBtnStateListener = new l();
        this.nextStepButtonStateListener = new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountManager A() {
        return (AccountManager) this.accountManager.getValue();
    }

    private final TextView B() {
        return (TextView) this.confirmBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpannableString C(String rawPhone) {
        if (m.startsWith$default(rawPhone, AccountConstants.DEFAULT_AREA_CODE, false, 2, null)) {
            Objects.requireNonNull(rawPhone, "null cannot be cast to non-null type java.lang.String");
            rawPhone = rawPhone.substring(3);
        }
        String string = getString(R.string.account_ui_account_current_phone_tip, new Object[]{rawPhone});
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, rawPhone, 0, false, 6, (Object) null);
        int length = rawPhone.length() + iIndexOf$default;
        int color = ContextCompat.getColor(this, R.color.s1);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf$default, length, 33);
        return spannableString;
    }

    private final String D() {
        return AccountConstants.DEFAULT_AREA_CODE + ((Object) E().getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText E() {
        return (EditText) this.inputPhoneNumber.getValue();
    }

    private final EditText F() {
        return (EditText) this.inputVerificationCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LastLoginInfoRepository G() {
        return (LastLoginInfoRepository) this.lastLoginInfoRepository.getValue();
    }

    private final View H() {
        return (View) this.layoutChangeBindHead.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView I() {
        return (TextView) this.sendVerifyBtn.getValue();
    }

    private final TextView J() {
        return (TextView) this.tvBindNewPhoneHead.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView K() {
        return (TextView) this.tvCurrentPhone.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String smsCode, String phone) {
        startActivityForResult(PhoneBindPasswordActivity.INSTANCE.getIntent(this, phone, smsCode), 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(PhoneBindActivity phoneBindActivity, View view) {
        if (!UtilsKt.isPhoneNumFormat(phoneBindActivity.E().getText().toString())) {
            IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_login_phone_format_error));
        } else if (NetUtil.isNetworkConnected(phoneBindActivity)) {
            phoneBindActivity.P();
        } else {
            IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_no_network_connection));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(PhoneBindActivity phoneBindActivity, View view) {
        if (!UtilsKt.isPhoneNumFormat(phoneBindActivity.E().getText().toString())) {
            IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_login_phone_format_error));
            return;
        }
        if (phoneBindActivity.F().length() == 0) {
            IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_account_input_verify_code));
            return;
        }
        if (!NetUtil.isNetworkConnected(phoneBindActivity)) {
            IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_no_network_connection));
            return;
        }
        int bindType = phoneBindActivity.getBindType();
        if (bindType == 1) {
            phoneBindActivity.T();
        } else {
            if (bindType != 2) {
                return;
            }
            phoneBindActivity.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setSuccess(getString(R.string.account_ui_account_bind_success), 500, new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.ui.bind.PhoneBindActivity$onChangePhoneSuccess$1
            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(@NotNull LoadingDialog dialog) {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(@NotNull LoadingDialog dialog) {
                this.a.finish();
            }
        });
    }

    private final void P() {
        String strD = D();
        I().setEnabled(false);
        Q(R.string.account_ui_account_verify_code_sending);
        A().checkSmsBinding(strD, SelectAreaHelper.getAreaBySave().getValue(), new IAccount.Callback<Message, ErrorCode>() { // from class: com.huami.account.ui.bind.PhoneBindActivity$sendVerifyCode$1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneBindActivity.TAG, String.valueOf(errorCode), new Object[0]);
                if (!Intrinsics.areEqual(errorCode == null ? null : errorCode.getErrorCode(), "429")) {
                    PhoneBindActivity.x(this.a, null, 1, null);
                } else {
                    PhoneBindActivity phoneBindActivity = this.a;
                    phoneBindActivity.w(phoneBindActivity.getString(UtilsKt.toSmsLimitPrompt(errorCode.getMessage())));
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable Message message) {
                HMLog.i(PhoneBindActivity.TAG, "message code:" + (message == null ? null : Integer.valueOf(message.getCode())) + ";errorMsg:" + (message != null ? message.getErrorMsg() : null), new Object[0]);
                this.a.v(message);
            }
        });
    }

    private final void Q(int msg) {
        if (isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this, getString(msg));
        } else if (loadingDialog != null) {
            loadingDialog.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog2 = this.mLoadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setCancelable(false);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    private final void R() {
        int bindType = getBindType();
        if (bindType == 1) {
            IconToast.showError(this, getString(R.string.account_ui_account_bind_phone_num_exist));
        } else {
            if (bindType != 2) {
                return;
            }
            new AlertDialogFragment.Builder(this).setMessage(R.string.account_ui_account_bind_phone_exist_tip).setNeutralButton(R.string.account_ui_yes, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        B().setEnabled(UtilsKt.isPhoneNumFormat(E().getText().toString()) && E().length() > 0 && F().length() > 0);
    }

    private final void T() {
        final String strD = D();
        A().verfyCode(strD, "register", F().getText().toString(), new IAccount.Callback<SmsCode, ErrorCode>() { // from class: com.huami.account.ui.bind.PhoneBindActivity$verifyCode$1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneBindActivity.TAG, String.valueOf(errorCode), new Object[0]);
                PhoneBindActivity phoneBindActivity = this.a;
                IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_account_verify_code_wrong));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable SmsCode smsCode) {
                if ((smsCode == null ? null : smsCode.getCode()) != null) {
                    this.a.L(smsCode.getCode(), strD);
                    return;
                }
                HMLog.i(PhoneBindActivity.TAG, "verifyCode: " + smsCode, new Object[0]);
            }
        });
    }

    private final int getBindType() {
        return getIntent().getIntExtra(EXTRA_BIND_TYPE, -1);
    }

    @JvmStatic
    @NotNull
    public static final Intent getIntent(@NotNull Context context, int i2) {
        return INSTANCE.getIntent(context, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgressDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }

    private final void initViews() {
        I().setOnClickListener(new View.OnClickListener() { // from class: dw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBindActivity.M(this.a, view);
            }
        });
        B().setOnClickListener(new View.OnClickListener() { // from class: cw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBindActivity.N(this.a, view);
            }
        });
        EditText editTextE = E();
        final Function1<Editable, Unit> function1 = this.verifyCodeBtnStateListener;
        editTextE.addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.bind.PhoneBindActivity$initViews$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                function1.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        EditText editTextE2 = E();
        final Function1<Editable, Unit> function2 = this.nextStepButtonStateListener;
        editTextE2.addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.bind.PhoneBindActivity$initViews$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                function2.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        EditText editTextF = F();
        final Function1<Editable, Unit> function3 = this.nextStepButtonStateListener;
        editTextF.addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.bind.PhoneBindActivity$initViews$$inlined$doAfterTextChanged$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                function3.invoke(s);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
    }

    private final void u() {
        final String strD = D();
        final String string = F().getText().toString();
        Q(R.string.account_ui_account_binding);
        z(new Function1<String, Unit>() { // from class: com.huami.account.ui.bind.PhoneBindActivity$changePhone$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                AccountManager accountManagerA = this.a.A();
                final String str2 = strD;
                String str3 = string;
                final PhoneBindActivity phoneBindActivity = this.a;
                accountManagerA.changeUserName(str, str2, null, str3, new IAccount.Callback<String, ErrorCode>() { // from class: com.huami.account.ui.bind.PhoneBindActivity$changePhone$1.1
                    @Override // com.huami.passport.IAccount.Callback
                    public void onError(@Nullable ErrorCode errorCode) {
                        HMLog.i(PhoneBindActivity.TAG, String.valueOf(errorCode), new Object[0]);
                        phoneBindActivity.hideProgressDialog();
                        PhoneBindActivity phoneBindActivity2 = phoneBindActivity;
                        IconToast.showError(phoneBindActivity2, phoneBindActivity2.getString(R.string.account_ui_account_bind_failed));
                    }

                    @Override // com.huami.passport.IAccount.Callback
                    public void onSuccess(@Nullable String s) {
                        phoneBindActivity.O();
                        phoneBindActivity.G().updateUsername("huami_phone", str2);
                        EventBus.getDefault().post(new EventPhoneBinding(str2));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Message message) {
        Integer numValueOf = message == null ? null : Integer.valueOf(message.getCode());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog != null) {
                loadingDialog.setSuccess(getString(R.string.account_ui_account_sms_send_success));
            }
            y();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 12) {
            hideProgressDialog();
            IconToast.showError(this, getString(R.string.account_ui_account_too_much_operation));
            I().setEnabled(true);
        } else {
            if (numValueOf == null || numValueOf.intValue() != 10) {
                x(this, null, 1, null);
                return;
            }
            hideProgressDialog();
            R();
            I().setText(getResources().getString(R.string.account_ui_register_phone_resend_code));
            I().setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String reason) {
        hideProgressDialog();
        if (reason == null) {
            reason = getString(R.string.account_ui_register_phone_failed_please_retry);
        }
        IconToast.showError(this, reason);
        I().setEnabled(true);
    }

    public static /* synthetic */ void x(PhoneBindActivity phoneBindActivity, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        phoneBindActivity.w(str);
    }

    private final Job y() {
        return kotlinx.coroutines.e.f(this, null, null, new c(null), 3, null);
    }

    private final void z(final Function1<? super String, Unit> phoneNumberCallback) {
        String str = this.currentPhone;
        if (str != null && !TextUtils.isEmpty(str)) {
            phoneNumberCallback.invoke(str);
            return;
        }
        Q(R.string.account_ui_account_bind_loading);
        K().setText(getString(R.string.account_ui_account_current_phone_tip, new Object[]{"--"}));
        A().getProfile(new IAccount.Callback<Profile, ErrorCode>() { // from class: com.huami.account.ui.bind.PhoneBindActivity$fetchCurrentPhoneNumber$1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.i(PhoneBindActivity.TAG, String.valueOf(errorCode), new Object[0]);
                this.a.hideProgressDialog();
                PhoneBindActivity phoneBindActivity = this.a;
                IconToast.showError(phoneBindActivity, phoneBindActivity.getString(R.string.account_ui_account_bind_load_failed));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable Profile profile) {
                String phoneNumber;
                if (profile == null || (phoneNumber = profile.getPhoneNumber()) == null) {
                    return;
                }
                PhoneBindActivity phoneBindActivity = this.a;
                Function1<String, Unit> function1 = phoneNumberCallback;
                phoneBindActivity.currentPhone = phoneNumber;
                function1.invoke(phoneNumber);
                phoneBindActivity.hideProgressDialog();
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.job.plus(Dispatchers.getMain());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000 && resultCode == -1) {
            setResult(-1);
            finish();
        }
        if (requestCode == 1000 && resultCode == 0) {
            setResult(0);
            finish();
        }
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui_activity_bind_phone_change);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, GlobalTitleStyleKt.getTitleBgColor(this), !RainbowUtils.isDarkMode(this));
        GlobalTitleStyleKt.setupAccountTitleStyle(this);
        int bindType = getBindType();
        if (bindType == 1) {
            setTitleText(R.string.account_ui_account_bind_phone);
            H().setVisibility(8);
            J().setVisibility(0);
        } else if (bindType == 2) {
            setTitleText(R.string.account_ui_account_change_bind_phone_title);
            H().setVisibility(0);
            J().setVisibility(8);
            z(new h());
        }
        initViews();
    }
}
