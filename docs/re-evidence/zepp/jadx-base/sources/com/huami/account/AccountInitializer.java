package com.huami.account;

import android.content.Context;
import androidx.startup.Initializer;
import com.huami.account.auth.AuthModuleKt;
import com.huami.account.di.AccountModuleKt;
import com.huami.account.di.LifecycleModuleKt;
import com.huami.account.ui.login.LoginViewModuleKt;
import com.huami.koinstartup.KoinInitializer;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.KoinApplication;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/account/AccountInitializer;", "Lcom/huami/koinstartup/KoinInitializer;", "Lorg/koin/core/KoinApplication;", "koinApplication", "", "startKoin", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountInitializer implements KoinInitializer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AccountInitializer: load account-service module";
        }
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.INSTANCE;
    }

    @Override // com.huami.koinstartup.KoinInitializer, androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return KoinInitializer.DefaultImpls.dependencies(this);
    }

    @Override // com.huami.koinstartup.KoinInitializer
    public void startKoin(@NotNull KoinApplication koinApplication) {
        HMLog.info("AccountInitializer", a.a);
        koinApplication.modules(AccountModuleKt.getAccountServiceModule(), AuthModuleKt.getAuthModule(), LoginViewModuleKt.getLoginViewModule(), LifecycleModuleKt.getLifecycleModule());
    }

    @Override // com.huami.koinstartup.KoinInitializer
    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        KoinInitializer.DefaultImpls.create(this, context);
    }
}
