package com.xiaomi.hm.health.di.koin.startup;

import android.content.Context;
import android.content.Intent;
import androidx.startup.Initializer;
import com.huami.account.AccountInitializer;
import com.huami.account.service.AccountComponent;
import com.huami.account.service.AccountService;
import com.huami.account.service.UserInfoService;
import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.AccountLifecycleObserver;
import com.huami.account.service.lifecycle.LogoutStateType;
import com.huami.account.ui.login.LoginActivity;
import com.huami.koinstartup.KoinInitializer;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\f0\u000b0\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/startup/AccountModuleInitializer;", "Lcom/huami/koinstartup/KoinInitializer;", "Lcom/huami/account/service/AccountComponent;", "Lcom/huami/account/service/lifecycle/AccountLifecycle$State$Logout;", "state", "", "a", "Lorg/koin/core/KoinApplication;", "koinApplication", "startKoin", "", "Ljava/lang/Class;", "Landroidx/startup/Initializer;", "dependencies", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AccountModuleInitializer implements KoinInitializer, AccountComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public final void a(AccountLifecycle.State.Logout state) {
        if (ArraysKt___ArraysKt.contains(new LogoutStateType[]{LogoutStateType.BOOT, LogoutStateType.MUTEX}, state.getType())) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(BraceletApp.getContext(), StartUpActivity.class);
        intent.putExtra(StartUpActivity.FROM_LOGOUT, true);
        LogoutStateType logoutStateType = LogoutStateType.BY_USER_LOGIN_MI;
        if (ArraysKt___ArraysKt.contains(new LogoutStateType[]{LogoutStateType.BY_USER, logoutStateType}, state.getType())) {
            intent.putExtra(StartUpActivity.FROM_LOGOUT_BY_USER, true);
        }
        if (state.getType() == logoutStateType) {
            intent.putExtra(LoginActivity.LOGIN_TYPE, "xiaomi");
        }
        intent.setFlags(268468224);
        BraceletApp.getContext().startActivity(intent);
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // com.huami.koinstartup.KoinInitializer, androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return CollectionsKt__CollectionsKt.mutableListOf(AccountInitializer.class);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public AccountLifecycle getAccountLifecycle() {
        return AccountComponent.DefaultImpls.getAccountLifecycle(this);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public AccountService getAccountService() {
        return AccountComponent.DefaultImpls.getAccountService(this);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public UserInfoService getUserInfoService() {
        return AccountComponent.DefaultImpls.getUserInfoService(this);
    }

    @Override // com.huami.koinstartup.KoinInitializer
    public void startKoin(@NotNull KoinApplication koinApplication) {
        koinApplication.modules(ArraysKt___ArraysKt.toList(AccountModuleKt.getAccountModules()));
        getAccountLifecycle().addObserver(new AccountLifecycleObserver() { // from class: com.xiaomi.hm.health.di.koin.startup.AccountModuleInitializer.startKoin.1
            @Override // com.huami.account.service.lifecycle.AccountLifecycleObserver
            public void onChanged(@NotNull AccountLifecycle.State state) {
                if (state instanceof AccountLifecycle.State.Logout) {
                    AccountModuleInitializer.this.a((AccountLifecycle.State.Logout) state);
                } else {
                    if (state instanceof AccountLifecycle.State.NewUser) {
                        return;
                    }
                    boolean z = state instanceof AccountLifecycle.State.LoggedIn;
                }
            }
        });
    }

    @Override // com.huami.koinstartup.KoinInitializer
    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        KoinInitializer.DefaultImpls.create(this, context);
    }
}
