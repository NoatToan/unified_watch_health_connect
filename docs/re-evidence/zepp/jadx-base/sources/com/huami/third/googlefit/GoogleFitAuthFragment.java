package com.huami.third.googlefit;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006R=\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R=\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R=\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R=\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u0006."}, d2 = {"Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "Landroidx/fragment/app/Fragment;", "", "msg", "", "resultCode", "", "f", "e", "", GoogleApiAvailabilityLight.a, "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "b", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "c", "requestCode", "Landroid/content/Intent;", "data", "onActivityResult", "signIn", "requestFitnessPermission", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "googleSignInAccount", "a", "Lkotlin/jvm/functions/Function1;", "getSignInSuccess", "()Lkotlin/jvm/functions/Function1;", "setSignInSuccess", "(Lkotlin/jvm/functions/Function1;)V", "signInSuccess", "getFitnessPermissionSuccess", "setFitnessPermissionSuccess", "fitnessPermissionSuccess", "getSignInError", "setSignInError", "signInError", "getFitnessPermissionError", "setFitnessPermissionError", "fitnessPermissionError", "<init>", "()V", "Companion", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final class GoogleFitAuthFragment extends Fragment {
    public static final int REQUEST_CODE_PERMISSION = 1000;
    public static final int REQUEST_CODE_SIGN_IN = 10000;

    @NotNull
    public static final String TAG = "GoogleFitAuth";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Function1<? super GoogleSignInAccount, Unit> signInSuccess = p.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Function1<? super GoogleSignInAccount, Unit> fitnessPermissionSuccess = b.a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Function1<? super Integer, Unit> signInError = o.a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Function1<? super Integer, Unit> fitnessPermissionError = a.a;
    private HashMap e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function1<GoogleSignInAccount, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull GoogleSignInAccount googleSignInAccount) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleSignInAccount googleSignInAccount) {
            a(googleSignInAccount);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "google fit权限请求成功";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ GoogleSignInAccount a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GoogleSignInAccount googleSignInAccount) {
            super(0);
            this.a = googleSignInAccount;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "google account用户名：" + this.a.getDisplayName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "google账户登录成功，用户名：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "存储用户名，userName = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "尝试请求fitness权限";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "尝试请求fitness权限";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "requestFitnessPermission";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fitness权限已存在";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请求fitness权限";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "google signIn()";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 4, 1})
    public static final class o extends Lambda implements Function1<Integer, Unit> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        public final void a(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
    public static final class p extends Lambda implements Function1<GoogleSignInAccount, Unit> {
        public static final p a = new p();

        public p() {
            super(1);
        }

        public final void a(@NotNull GoogleSignInAccount googleSignInAccount) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleSignInAccount googleSignInAccount) {
            a(googleSignInAccount);
            return Unit.INSTANCE;
        }
    }

    private final GoogleSignInAccount b() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(GoogleSignIn.getAccountForExtension(requireContext(), GoogleFitAuthKt.getFitnessOptions()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (GoogleSignInAccount) objM3845constructorimpl;
    }

    private final GoogleSignInClient c(FragmentActivity activity) {
        return GoogleSignIn.getClient((Activity) activity, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestProfile().requestId().build());
    }

    private final boolean d() {
        return GoogleSignIn.hasPermissions(b(), GoogleFitAuthKt.getFitnessOptions());
    }

    private final void e(String msg, int resultCode) {
        HMLog.error$default(TAG, null, null, new i(msg), 6, null);
        this.fitnessPermissionError.invoke(Integer.valueOf(resultCode));
    }

    private final void f(String msg, int resultCode) {
        HMLog.error$default(TAG, null, null, new j(msg), 6, null);
        this.signInError.invoke(Integer.valueOf(resultCode));
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i2);
        this.e.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @NotNull
    public final Function1<Integer, Unit> getFitnessPermissionError() {
        return this.fitnessPermissionError;
    }

    @NotNull
    public final Function1<GoogleSignInAccount, Unit> getFitnessPermissionSuccess() {
        return this.fitnessPermissionSuccess;
    }

    @NotNull
    public final Function1<Integer, Unit> getSignInError() {
        return this.signInError;
    }

    @NotNull
    public final Function1<GoogleSignInAccount, Unit> getSignInSuccess() {
        return this.signInSuccess;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Throwable {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1) {
            if (requestCode == 1000) {
                e("google fit 授权失败：resultCode = " + resultCode, resultCode);
                return;
            }
            if (requestCode != 10000) {
                return;
            }
            f("google账户登录失败：resultCode = " + resultCode, resultCode);
            return;
        }
        if (requestCode == 1000) {
            HMLog.info(TAG, c.a);
            GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(getContext());
            if (lastSignedInAccount == null) {
                e("google fit 授权失败：获取account为空", resultCode);
                return;
            } else {
                HMLog.info(TAG, new d(lastSignedInAccount));
                this.fitnessPermissionSuccess.invoke(lastSignedInAccount);
                return;
            }
        }
        if (requestCode != 10000) {
            return;
        }
        try {
            GoogleSignInAccount result = GoogleSignIn.getSignedInAccountFromIntent(data).getResult(ApiException.class);
            if (result == null) {
                HMLog.info(TAG, h.a);
                f("google账户登录失败：获取account为空", resultCode);
                return;
            }
            String displayName = result.getDisplayName();
            HMLog.info(TAG, new e(displayName));
            if (displayName != null) {
                HMLog.info(TAG, new f(displayName));
                UserCache.INSTANCE.saveUserName(displayName);
            }
            this.signInSuccess.invoke(result);
            HMLog.info(TAG, g.a);
            requestFitnessPermission();
        } catch (ApiException e2) {
            f("google账户登录失败：" + e2.getMessage(), resultCode);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void requestFitnessPermission() {
        HMLog.info(TAG, k.a);
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(getContext());
        if (!d() || lastSignedInAccount == null) {
            HMLog.info(TAG, m.a);
            GoogleSignIn.requestPermissions(this, 1000, b(), GoogleFitAuthKt.getFitnessOptions());
        } else {
            HMLog.info(TAG, l.a);
            this.fitnessPermissionSuccess.invoke(lastSignedInAccount);
        }
    }

    public final void setFitnessPermissionError(@NotNull Function1<? super Integer, Unit> function1) {
        this.fitnessPermissionError = function1;
    }

    public final void setFitnessPermissionSuccess(@NotNull Function1<? super GoogleSignInAccount, Unit> function1) {
        this.fitnessPermissionSuccess = function1;
    }

    public final void setSignInError(@NotNull Function1<? super Integer, Unit> function1) {
        this.signInError = function1;
    }

    public final void setSignInSuccess(@NotNull Function1<? super GoogleSignInAccount, Unit> function1) {
        this.signInSuccess = function1;
    }

    public final void signIn() {
        HMLog.info(TAG, n.a);
        startActivityForResult(c(requireActivity()).getSignInIntent(), 10000);
    }
}
