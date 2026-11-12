package com.huami.third.xiaomi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.XiaoMiHelper;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0002J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0010J3\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¨\u0006\u0017"}, d2 = {"Lcom/huami/third/xiaomi/MiSource;", "", "Landroidx/fragment/app/FragmentActivity;", DbUtils.Const.Table.CONTEXT, "", "code", "Lcom/huami/passport/entity/TpaConfig;", "config", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "auth", "", "callback", "a", "Landroid/content/Context;", "checkNeedAuth", "activity", "getAuthorCode", "<init>", "()V", "Companion", "xiaomi_release"}, k = 1, mv = {1, 4, 1})
public final class MiSource {

    @NotNull
    public static final String TAG = "XiaoMiSourceImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(FragmentActivity context, String code, TpaConfig config, Function1<? super Boolean, Unit> callback) {
        AccountManager.getDefault(context).getToken(new MiSource$getMiAccessToken$2(context, config, code, callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(MiSource miSource, FragmentActivity fragmentActivity, String str, TpaConfig tpaConfig, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = b.a;
        }
        miSource.a(fragmentActivity, str, tpaConfig, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAuthorCode$default(MiSource miSource, FragmentActivity fragmentActivity, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = a.a;
        }
        miSource.getAuthorCode(fragmentActivity, function1);
    }

    public final boolean checkNeedAuth(@NotNull Context context) {
        return MiTokenUtil.INSTANCE.checkNeedMiAuth(context);
    }

    public final void getAuthorCode(@NotNull final FragmentActivity activity, @NotNull final Function1<? super Boolean, Unit> callback) {
        LoadingView loadingView = MiHolder.INSTANCE.getLoadingView();
        if (loadingView != null) {
            loadingView.showLoading(activity);
        }
        final TpaConfig tpaConfig = Utils.getTpaConfigs(activity).get("xiaomi");
        if (tpaConfig != null) {
            XiaoMiHelper.getOAuthCode(activity, tpaConfig, new IAccount.Callback<XiaomiOAuthResults, ErrorCode>() { // from class: com.huami.third.xiaomi.MiSource.getAuthorCode.2

                /* JADX INFO: renamed from: com.huami.third.xiaomi.MiSource$getAuthorCode$2$a */
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
                        return "getOAuthCode: onError:" + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.huami.third.xiaomi.MiSource$getAuthorCode$2$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ XiaomiOAuthResults a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(XiaomiOAuthResults xiaomiOAuthResults) {
                        super(0);
                        this.a = xiaomiOAuthResults;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "getOAuthCode:onSuccess: " + this.a;
                    }
                }

                @Override // com.huami.passport.IAccount.Callback
                public void onError(@Nullable ErrorCode errorCode) {
                    HMLog.info(MiSource.TAG, new a(errorCode));
                    LoadingView loadingView2 = MiHolder.INSTANCE.getLoadingView();
                    if (loadingView2 != null) {
                        loadingView2.hideLoading(activity);
                    }
                    if (errorCode == null || !Intrinsics.areEqual(ErrorCode.USER_CANCEL_ERROR, errorCode.getErrorCode())) {
                        FragmentActivity fragmentActivity = activity;
                        Toast.makeText(fragmentActivity, fragmentActivity.getString(R.string.mi_author_code_failed), 0).show();
                    }
                }

                @Override // com.huami.passport.IAccount.Callback
                public void onSuccess(@Nullable XiaomiOAuthResults xiaomiOAuthResults) {
                    HMLog.info(MiSource.TAG, new b(xiaomiOAuthResults));
                    if (xiaomiOAuthResults != null && !TextUtils.isEmpty(xiaomiOAuthResults.getCode())) {
                        MiSource.this.a(activity, xiaomiOAuthResults.getCode(), tpaConfig, callback);
                        return;
                    }
                    LoadingView loadingView2 = MiHolder.INSTANCE.getLoadingView();
                    if (loadingView2 != null) {
                        loadingView2.hideLoading(activity);
                    }
                    FragmentActivity fragmentActivity = activity;
                    Toast.makeText(fragmentActivity, fragmentActivity.getString(R.string.mi_author_code_failed), 1).show();
                }
            });
        }
    }
}
