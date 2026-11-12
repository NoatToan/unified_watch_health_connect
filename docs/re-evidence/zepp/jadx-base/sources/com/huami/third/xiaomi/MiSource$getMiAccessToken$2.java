package com.huami.third.xiaomi;

import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.XiaoMiHelper;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.TpaConfig;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\t"}, d2 = {"com/huami/third/xiaomi/MiSource$getMiAccessToken$2", "Lcom/huami/passport/IAccount$Callback;", "Lcom/huami/passport/entity/Token;", "Lcom/huami/passport/ErrorCode;", "result", "", "onSuccess", "error", "onError", "xiaomi_release"}, k = 1, mv = {1, 4, 1})
public final class MiSource$getMiAccessToken$2 implements IAccount.Callback<Token, ErrorCode> {
    public final /* synthetic */ FragmentActivity a;
    public final /* synthetic */ TpaConfig b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ErrorCode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ErrorCode errorCode) {
            super(0);
            this.a = errorCode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getHuamiToken:error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.third.xiaomi.MiSource$getMiAccessToken$2$onError$2", f = "MiSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ErrorCode c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ErrorCode errorCode, Continuation continuation) {
            super(2, continuation);
            this.c = errorCode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MiSource$getMiAccessToken$2.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
            LoadingView loadingView = MiHolder.INSTANCE.getLoadingView();
            if (loadingView != null) {
                loadingView.hideLoading(MiSource$getMiAccessToken$2.this.a);
            }
            ErrorCode errorCode = this.c;
            if (errorCode == null || !Intrinsics.areEqual(ErrorCode.USER_CANCEL_ERROR, errorCode.getErrorCode())) {
                FragmentActivity fragmentActivity = MiSource$getMiAccessToken$2.this.a;
                StringBuilder sb = new StringBuilder();
                sb.append(MiSource$getMiAccessToken$2.this.a.getString(R.string.huami_author_failed));
                ErrorCode errorCode2 = this.c;
                sb.append(errorCode2 != null ? errorCode2.getErrorCode() : null);
                Toast.makeText(fragmentActivity, sb.toString(), 1).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Token a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Token token) {
            super(0);
            this.a = token;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getHuamiToken:onSuccess: " + this.a;
        }
    }

    public MiSource$getMiAccessToken$2(FragmentActivity fragmentActivity, TpaConfig tpaConfig, String str, Function1 function1) {
        this.a = fragmentActivity;
        this.b = tpaConfig;
        this.c = str;
        this.d = function1;
    }

    @Override // com.huami.passport.IAccount.Callback
    public void onError(@Nullable ErrorCode error) {
        HMLog.info(MiSource.TAG, new a(error));
        UtilKt.launchCoroutine$default(null, null, new b(error, null), 3, null);
    }

    @Override // com.huami.passport.IAccount.Callback
    public void onSuccess(@NotNull Token result) {
        HMLog.info(MiSource.TAG, new c(result));
        XiaoMiHelper.getAccessToken(this.a.getApplicationContext(), this.b.getThirdName(), result.getAccessToken(), this.c, new IAccount.Callback<ThirdPartyToken, ErrorCode>() { // from class: com.huami.third.xiaomi.MiSource$getMiAccessToken$2$onSuccess$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ErrorCode a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ErrorCode errorCode) {
                    super(0);
                    this.a = errorCode;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "getHuamiToken:getAccessToken:error:" + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ ThirdPartyToken a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ThirdPartyToken thirdPartyToken) {
                    super(0);
                    this.a = thirdPartyToken;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "getHuamiToken:getAccessToken:onSuccess: " + this.a;
                }
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode errorCode) {
                HMLog.info(MiSource.TAG, new a(errorCode));
                LoadingView loadingView = MiHolder.INSTANCE.getLoadingView();
                if (loadingView != null) {
                    loadingView.hideLoading(this.a.a);
                }
                if (errorCode == null || !Intrinsics.areEqual(ErrorCode.USER_CANCEL_ERROR, errorCode.getErrorCode())) {
                    Toast.makeText(this.a.a, this.a.a.getString(R.string.author_failed) + errorCode.getErrorCode(), 1).show();
                }
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0033  */
            /* JADX WARN: Instruction removed from duplicated block: B:7:0x0033, please report this as an issue */
            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable ThirdPartyToken token) {
                HMLog.info(MiSource.TAG, new b(token));
                if (token != null) {
                    MiTokenUtil miTokenUtil = MiTokenUtil.INSTANCE;
                    if (miTokenUtil.checkMiTokenExists(token)) {
                        miTokenUtil.saveMiToken(token);
                        FragmentActivity fragmentActivity = this.a.a;
                        Toast.makeText(fragmentActivity, fragmentActivity.getString(R.string.author_success), 0).show();
                        this.a.d.invoke(Boolean.TRUE);
                    } else {
                        Toast.makeText(this.a.a, this.a.a.getString(R.string.author_failed) + token.getResult(), 0).show();
                    }
                } else {
                    Toast.makeText(this.a.a, this.a.a.getString(R.string.author_failed) + token.getResult(), 0).show();
                }
                LoadingView loadingView = MiHolder.INSTANCE.getLoadingView();
                if (loadingView != null) {
                    loadingView.hideLoading(this.a.a);
                }
            }
        });
    }
}
