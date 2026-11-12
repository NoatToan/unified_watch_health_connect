package com.huami.third.googlefit.ui;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.huami.third.googlefit.GoogleFit;
import com.huami.third.googlefit.UserCache;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J¦\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\r0\b2#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\r0\bJ\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u001d"}, d2 = {"Lcom/huami/third/googlefit/ui/GoogleFitViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "hasAuthorized", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function1;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "Lkotlin/ParameterName;", "name", "googleSignInAccount", "", "signInSuccess", "permissionSuccess", "", "resultCode", "signInError", "permissionError", "auth", "Lkotlin/Function0;", "unbindSuccess", HMUnbindBaseLogic.TAG, "", "getSignInAccountName", "<init>", "()V", "Companion", "googlefit-ui_release"}, k = 1, mv = {1, 4, 1})
public final class GoogleFitViewModel extends ViewModel {
    private static final String a = "GoogleFitViewModel";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<GoogleSignInAccount, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@Nullable GoogleSignInAccount googleSignInAccount) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleSignInAccount googleSignInAccount) {
            a(googleSignInAccount);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function1<GoogleSignInAccount, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@Nullable GoogleSignInAccount googleSignInAccount) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleSignInAccount googleSignInAccount) {
            a(googleSignInAccount);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function1<Integer, Unit> {
        public static final c a = new c();

        public c() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function1<Integer, Unit> {
        public static final d a = new d();

        public d() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.ObjectRef objectRef) {
            super(0);
            this.a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取google fit用户名，displayName = " + ((String) this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.ObjectRef objectRef) {
            super(0);
            this.a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "缓存读取获取google fit用户名，displayName = " + ((String) this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "success", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Function0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(1);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.a.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void auth$default(GoogleFitViewModel googleFitViewModel, FragmentActivity fragmentActivity, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = a.a;
        }
        Function1 function5 = function1;
        if ((i & 4) != 0) {
            function2 = b.a;
        }
        Function1 function6 = function2;
        if ((i & 8) != 0) {
            function3 = c.a;
        }
        Function1 function7 = function3;
        if ((i & 16) != 0) {
            function4 = d.a;
        }
        googleFitViewModel.auth(fragmentActivity, function5, function6, function7, function4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void unbind$default(GoogleFitViewModel googleFitViewModel, Context context, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = g.a;
        }
        googleFitViewModel.unbind(context, function0);
    }

    public final void auth(@NotNull FragmentActivity activity, @NotNull Function1<? super GoogleSignInAccount, Unit> signInSuccess, @NotNull Function1<? super GoogleSignInAccount, Unit> permissionSuccess, @NotNull Function1<? super Integer, Unit> signInError, @NotNull Function1<? super Integer, Unit> permissionError) {
        GoogleFit.auth(activity, signInSuccess, permissionSuccess, signInError, permissionError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    @Nullable
    public final String getSignInAccountName(@NotNull Context context) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        GoogleSignInAccount lastSignedInAccount = GoogleFit.getLastSignedInAccount(context);
        objectRef.element = lastSignedInAccount != null ? lastSignedInAccount.getDisplayName() : 0;
        HMLog.debug(a, new e(objectRef));
        if (((String) objectRef.element) == null) {
            objectRef.element = UserCache.INSTANCE.getUserName();
            HMLog.debug(a, new f(objectRef));
        }
        return (String) objectRef.element;
    }

    public final boolean hasAuthorized(@NotNull Context context) {
        return GoogleFit.isSignedIn(context) && GoogleFit.hasFitnessPermissions(context);
    }

    public final void unbind(@NotNull Context context, @NotNull Function0<Unit> unbindSuccess) {
        GoogleFit.signOut(context, new h(unbindSuccess));
    }
}
