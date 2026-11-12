package com.huami.third.googlefit;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J¨\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u00042#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0003J\\\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u0004H\u0007J4\u0010\u001a\u001a&\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u0018 \u0019*\u0012\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\u00170\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J&\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006$"}, d2 = {"Lcom/huami/third/googlefit/GoogleFit;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function1;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "Lkotlin/ParameterName;", "name", "googleSignInAccount", "", "signInSuccess", "permissionSuccess", "", "resultCode", "signInError", "permissionError", "Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "auth", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "a", "requestPermissions", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", WatchFaceApi.CUSTOMIZABLE_DISABLE, "", "result", "signOut", "isSignedIn", "hasFitnessPermissions", "getLastSignedInAccount", "getFitnessGoogleAccount", "<init>", "()V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final class GoogleFit {

    @NotNull
    public static final GoogleFit INSTANCE = new GoogleFit();

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "", "a", "(Lcom/huami/third/googlefit/GoogleFitAuthFragment;)V"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function1<GoogleFitAuthFragment, Unit> {
        public final /* synthetic */ Function1 a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ Function1 c;
        public final /* synthetic */ Function1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, Function1 function2, Function1 function3, Function1 function4) {
            super(1);
            this.a = function1;
            this.b = function2;
            this.c = function3;
            this.d = function4;
        }

        public final void a(@NotNull GoogleFitAuthFragment googleFitAuthFragment) {
            googleFitAuthFragment.setSignInSuccess(this.a);
            googleFitAuthFragment.setFitnessPermissionSuccess(this.b);
            googleFitAuthFragment.setSignInError(this.c);
            googleFitAuthFragment.setFitnessPermissionError(this.d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleFitAuthFragment googleFitAuthFragment) {
            a(googleFitAuthFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "it", "", "a", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V"}, k = 3, mv = {1, 4, 1})
    public static final class f extends Lambda implements Function1<GoogleSignInAccount, Unit> {
        public static final f a = new f();

        public f() {
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
    public static final class g extends Lambda implements Function1<Integer, Unit> {
        public static final g a = new g();

        public g() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/third/googlefit/GoogleFitAuthFragment;", "", "a", "(Lcom/huami/third/googlefit/GoogleFitAuthFragment;)V"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function1<GoogleFitAuthFragment, Unit> {
        public final /* synthetic */ Function1 a;
        public final /* synthetic */ Function1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, Function1 function2) {
            super(1);
            this.a = function1;
            this.b = function2;
        }

        public final void a(@NotNull GoogleFitAuthFragment googleFitAuthFragment) {
            googleFitAuthFragment.setFitnessPermissionSuccess(this.a);
            googleFitAuthFragment.setFitnessPermissionError(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleFitAuthFragment googleFitAuthFragment) {
            a(googleFitAuthFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i extends Lambda implements Function1<Boolean, Unit> {
        public static final i a = new i();

        public i() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "task", "", "onComplete", "(Lcom/google/android/gms/tasks/Task;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j<TResult> implements OnCompleteListener<Void> {
        public final /* synthetic */ Function1 a;

        public j(Function1 function1) {
            this.a = function1;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NotNull Task<Void> task) {
            this.a.invoke(Boolean.valueOf(task.isSuccessful()));
        }
    }

    private GoogleFit() {
    }

    @JvmStatic
    private static final GoogleSignInClient a(Context context) {
        return GoogleSignIn.getClient(context, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build());
    }

    @JvmStatic
    @NotNull
    public static final GoogleFitAuthFragment auth(@NotNull FragmentActivity activity, @NotNull Function1<? super GoogleSignInAccount, Unit> signInSuccess, @NotNull Function1<? super GoogleSignInAccount, Unit> permissionSuccess, @NotNull Function1<? super Integer, Unit> signInError, @NotNull Function1<? super Integer, Unit> permissionError) {
        return GoogleFitAuth.INSTANCE.with(activity).googleSignIn(new e(signInSuccess, permissionSuccess, signInError, permissionError));
    }

    public static /* synthetic */ GoogleFitAuthFragment auth$default(FragmentActivity fragmentActivity, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = a.a;
        }
        if ((i2 & 4) != 0) {
            function2 = b.a;
        }
        if ((i2 & 8) != 0) {
            function3 = c.a;
        }
        if ((i2 & 16) != 0) {
            function4 = d.a;
        }
        return auth(fragmentActivity, function1, function2, function3, function4);
    }

    @JvmStatic
    public static final Task<Void> disable(@NotNull Context context) {
        return Fitness.getConfigClient(context, GoogleSignIn.getAccountForExtension(context, GoogleFitAuthKt.getFitnessOptions())).disableFit();
    }

    @JvmStatic
    @NotNull
    public static final GoogleSignInAccount getFitnessGoogleAccount(@NotNull Context context) {
        return GoogleSignIn.getAccountForExtension(context, GoogleFitAuthKt.getFitnessOptions());
    }

    @JvmStatic
    @Nullable
    public static final GoogleSignInAccount getLastSignedInAccount(@NotNull Context context) {
        return GoogleSignIn.getLastSignedInAccount(context);
    }

    @JvmStatic
    public static final boolean hasFitnessPermissions(@NotNull Context context) {
        return GoogleSignIn.hasPermissions(GoogleSignIn.getAccountForExtension(context, GoogleFitAuthKt.getFitnessOptions()), GoogleFitAuthKt.getFitnessOptions());
    }

    @JvmStatic
    public static final boolean isSignedIn(@NotNull Context context) {
        return GoogleSignIn.getLastSignedInAccount(context) != null;
    }

    @JvmStatic
    @NotNull
    public static final GoogleFitAuthFragment requestPermissions(@NotNull FragmentActivity activity, @NotNull Function1<? super GoogleSignInAccount, Unit> permissionSuccess, @NotNull Function1<? super Integer, Unit> permissionError) {
        return GoogleFitAuth.INSTANCE.with(activity).requestFitPermissions(new h(permissionSuccess, permissionError));
    }

    public static /* synthetic */ GoogleFitAuthFragment requestPermissions$default(FragmentActivity fragmentActivity, Function1 function1, Function1 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = f.a;
        }
        if ((i2 & 4) != 0) {
            function2 = g.a;
        }
        return requestPermissions(fragmentActivity, function1, function2);
    }

    @JvmStatic
    public static final void signOut(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> result) {
        UserCache.INSTANCE.removeUserName();
        Task<Void> taskSignOut = a(context).signOut();
        if (taskSignOut != null) {
            taskSignOut.addOnCompleteListener(new j(result));
        }
    }

    public static /* synthetic */ void signOut$default(Context context, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = i.a;
        }
        signOut(context, function1);
    }
}
