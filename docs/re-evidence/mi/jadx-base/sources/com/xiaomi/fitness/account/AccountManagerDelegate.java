package com.xiaomi.fitness.account;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.account.AccountManagerDelegate;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b5\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0016\u001a\u00020\u00042!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ#\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R/\u0010)\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R$\u00100\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010+\"\u0004\b.\u0010/R$\u00101\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010+\"\u0004\b2\u0010/R\u0014\u00103\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010+R\u0014\u00104\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010+¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/account/AccountManagerDelegate;", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "", "sid", "", "init", "(Ljava/lang/String;)V", "", "accessAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroid/os/Bundle;", "callback", "login", "(Lkotlin/jvm/functions/Function1;)V", "removeLoginCallback", TrackConstants.LOGOUT, "()V", "", "Lkotlin/ParameterName;", "name", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addAccountListener", "removeAccountListener", "getUserId", "()Ljava/lang/String;", "key", "getUserData", "(Ljava/lang/String;)Ljava/lang/String;", "forceRefresh", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getMiAccountCoreInfoSync", "(Z)Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "Lcom/xiaomi/fitness/account/a;", "<set-?>", "mManagerRemoteImpl$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMManagerRemoteImpl", "()Lcom/xiaomi/fitness/account/a;", "setMManagerRemoteImpl", "(Lcom/xiaomi/fitness/account/a;)V", "mManagerRemoteImpl", "isLogin", "()Z", "value", "getLoggingIn", "setLoggingIn", "(Z)V", "loggingIn", "isStaging", "setStaging", "isUseSystem", "isUseLocal", "<init>", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AccountManagerDelegate implements AccountManager {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccountManagerDelegate.class, "mManagerRemoteImpl", "getMManagerRemoteImpl()Lcom/xiaomi/fitness/account/AccountManagerRemote;", 0))};
    public static final int KEY_ACCOUNT_MANAGER_BINDER_CODE = 15;

    /* JADX INFO: renamed from: mManagerRemoteImpl$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mManagerRemoteImpl = new BinderDelegate("mManagerRemoteImpl");

    public AccountManagerDelegate() {
        ServiceConnector.INSTANCE.getInstance().getBinder(15, new Function1() { // from class: w80
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountManagerDelegate._init_$lambda$0(this.f37706a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(AccountManagerDelegate this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        sb.append("mManagerRemoteImpl: ");
        sb.append(iBinder);
        this$0.setMManagerRemoteImpl(a.AbstractBinderC0377a.asInterface(iBinder));
        return Unit.INSTANCE;
    }

    private final a getMManagerRemoteImpl() {
        return (a) this.mManagerRemoteImpl.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMManagerRemoteImpl(a aVar) {
        this.mManagerRemoteImpl.setValue((Object) this, $$delegatedProperties[0], aVar);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @Nullable
    public Object accessAccount(@NotNull Continuation<? super Integer> continuation) {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void addAccountListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean getLoggingIn() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @Nullable
    public AccountCoreInfo getMiAccountCoreInfoSync(boolean forceRefresh) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @NotNull
    public String getUserData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new NotImplementedError(null, 1, null);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    @Nullable
    public String getUserId() {
        throw new NotImplementedError(null, 1, null);
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void init(@NotNull String sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isLogin() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isStaging() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isUseLocal() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public boolean isUseSystem() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void login(@NotNull Function1<? super Bundle, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void logout() {
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void removeAccountListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void removeLoginCallback(@NotNull Function1<? super Bundle, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void setLoggingIn(boolean z) {
    }

    @Override // com.xiaomi.fitness.account.manager.AccountManager
    public void setStaging(boolean z) {
    }
}
