package com.xiaomi.fitness.login;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import defpackage.auf;
import defpackage.av6;
import defpackage.fai;
import defpackage.obm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.AppCompatActivity;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/login/NeedLoginAspect;", "", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/account/manager/AccountManager;", "accountManager", "", "needLoginDialogGuide", "Lfai;", "joinPoint", "", "login", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/account/manager/AccountManager;ZLfai;)V", "Lcom/xiaomi/fitness/login/annotation/NeedLogin;", "needLogin", "pointcutNeedLogin", "(Lcom/xiaomi/fitness/login/annotation/NeedLogin;)V", "aroundNeedLogin", "(Lfai;Lcom/xiaomi/fitness/login/annotation/NeedLogin;)V", "<init>", "()V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NeedLoginAspect {
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ NeedLoginAspect ajc$perSingletonInstance;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new NeedLoginAspect();
    }

    public static NeedLoginAspect aspectOf() {
        NeedLoginAspect needLoginAspect = ajc$perSingletonInstance;
        if (needLoginAspect != null) {
            return needLoginAspect;
        }
        throw new NoAspectBoundException("com.xiaomi.fitness.login.NeedLoginAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.xiaomi.fitness.login.NeedLoginAspect$login$observer$1, nfe] */
    private final void login(final FragmentActivity activity, final AccountManager accountManager, boolean needLoginDialogGuide, final fai joinPoint) {
        final Function1<? super Boolean, Unit> function1 = new Function1() { // from class: vig
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NeedLoginAspect.login$lambda$1(joinPoint, ((Boolean) obj).booleanValue());
            }
        };
        accountManager.addAccountListener(function1);
        final ?? r6 = new LifecycleEventObserver() { // from class: com.xiaomi.fitness.login.NeedLoginAspect$login$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    accountManager.removeAccountListener(function1);
                    source.getLifecycle().removeObserver(this);
                }
            }
        };
        activity.getLifecycle().addObserver(r6);
        if (needLoginDialogGuide) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(activity).addDialogCallback(new av6() { // from class: com.xiaomi.fitness.login.NeedLoginAspect.login.1
                @Override // defpackage.av6
                public void onDialogEvent(String dialogName, DialogInterface dialog, int what) {
                    super.onDialogEvent(dialogName, dialog, what);
                    if (what == 3) {
                        accountManager.removeAccountListener(function1);
                        activity.getLifecycle().removeObserver(r6);
                    }
                }
            });
        } else {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit login$lambda$1(fai joinPoint, boolean z) throws Throwable {
        Intrinsics.checkNotNullParameter(joinPoint, "$joinPoint");
        if (z) {
            joinPoint.b();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[LOOP:0: B:20:0x006f->B:24:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007c A[EDGE_INSN: B:53:0x007c->B:26:0x007c BREAK  A[LOOP:0: B:20:0x006f->B:24:0x0078], SYNTHETIC] */
    public final void aroundNeedLogin(@NotNull fai joinPoint, @NotNull NeedLogin needLogin) throws Throwable {
        Object[] objArrC;
        int length;
        int i;
        Object obj;
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(joinPoint, "joinPoint");
        Intrinsics.checkNotNullParameter(needLogin, "needLogin");
        obm obmVarA = joinPoint.a();
        Intrinsics.checkNotNull(obmVarA, "null cannot be cast to non-null type org.aspectj.lang.reflect.MethodSignature");
        if (((auf) obmVarA).a().isAnnotationPresent(NeedLogin.class)) {
            Object target = joinPoint.getTarget();
            Intrinsics.checkNotNullExpressionValue(target, "getTarget(...)");
            if (target instanceof BaseFragment) {
                activity = ((BaseFragment) target).getActivity();
            } else if (target instanceof AppCompatActivity) {
                activity = (FragmentActivity) target;
            } else if (target instanceof View) {
                View view = (View) target;
                if (view.getContext() instanceof AppCompatActivity) {
                    Context context = view.getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type miuix.appcompat.app.AppCompatActivity");
                    activity = (AppCompatActivity) context;
                } else if (target instanceof Context) {
                    activity = (AppCompatActivity) target;
                } else {
                    objArrC = joinPoint.c();
                    Intrinsics.checkNotNullExpressionValue(objArrC, "getArgs(...)");
                    length = objArrC.length;
                    i = 0;
                    while (true) {
                        if (i < length) {
                            obj = null;
                            break;
                        }
                        obj = objArrC[i];
                        if (obj instanceof Context) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (obj instanceof AppCompatActivity) {
                        activity = (AppCompatActivity) obj;
                    } else if (obj instanceof ContextWrapper) {
                        Context baseContext = ((ContextWrapper) obj).getBaseContext();
                        Intrinsics.checkNotNull(baseContext, "null cannot be cast to non-null type miuix.appcompat.app.AppCompatActivity");
                        activity = (AppCompatActivity) baseContext;
                    } else {
                        activity = null;
                    }
                }
            } else if (target instanceof Context) {
                activity = (AppCompatActivity) target;
            } else {
                objArrC = joinPoint.c();
                Intrinsics.checkNotNullExpressionValue(objArrC, "getArgs(...)");
                length = objArrC.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        obj = null;
                        break;
                    }
                    obj = objArrC[i];
                    if (obj instanceof Context) {
                        break;
                        break;
                    }
                    i++;
                }
                if (obj instanceof AppCompatActivity) {
                    activity = (AppCompatActivity) obj;
                } else if (obj instanceof ContextWrapper) {
                    Context baseContext2 = ((ContextWrapper) obj).getBaseContext();
                    Intrinsics.checkNotNull(baseContext2, "null cannot be cast to non-null type miuix.appcompat.app.AppCompatActivity");
                    activity = (AppCompatActivity) baseContext2;
                } else {
                    activity = null;
                }
            }
            AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
            if (!accountManagerExtKt.isLogin()) {
                if (!needLogin.needLogin() || activity == null) {
                    joinPoint.b();
                    return;
                } else {
                    login(activity, accountManagerExtKt, needLogin.needLoginDialogGuide(), joinPoint);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
            }
            if (!needLogin.needCompleteUserInfo()) {
                joinPoint.b();
                return;
            }
            if (UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).isCompleted()) {
                joinPoint.b();
                return;
            }
            Logger.d("Login check userInfo is not complete! " + target, new Object[0]);
            if (activity != null) {
                SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).showUserInfoDialog(activity);
            } else {
                Logger.i("dialogActivity is null", new Object[0]);
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void pointcutNeedLogin(@NotNull NeedLogin needLogin) {
        Intrinsics.checkNotNullParameter(needLogin, "needLogin");
    }
}
