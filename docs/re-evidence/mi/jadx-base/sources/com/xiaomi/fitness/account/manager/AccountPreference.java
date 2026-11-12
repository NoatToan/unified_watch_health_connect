package com.xiaomi.fitness.account.manager;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/account/manager/AccountPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "ACCOUNT_USER_SYSTEM", "getACCOUNT_USER_SYSTEM", "()Z", "setACCOUNT_USER_SYSTEM", "(Z)V", "ACCOUNT_USER_SYSTEM$delegate", "Lkotlin/properties/ReadWriteProperty;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPreference.kt\ncom/xiaomi/fitness/account/manager/AccountPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,9:1\n135#2,6:10\n*S KotlinDebug\n*F\n+ 1 AccountPreference.kt\ncom/xiaomi/fitness/account/manager/AccountPreference\n*L\n8#1:10,6\n*E\n"})
public final class AccountPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccountPreference.class, "ACCOUNT_USER_SYSTEM", "getACCOUNT_USER_SYSTEM()Z", 0))};

    /* JADX INFO: renamed from: ACCOUNT_USER_SYSTEM$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ACCOUNT_USER_SYSTEM;

    @NotNull
    public static final AccountPreference INSTANCE;

    static {
        AccountPreference accountPreference = new AccountPreference();
        INSTANCE = accountPreference;
        ACCOUNT_USER_SYSTEM = accountPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.manager.AccountPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.TRUE, null, true);
    }

    private AccountPreference() {
    }

    public final boolean getACCOUNT_USER_SYSTEM() {
        return ((Boolean) ACCOUNT_USER_SYSTEM.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_account_spf";
    }

    public final void setACCOUNT_USER_SYSTEM(boolean z) {
        ACCOUNT_USER_SYSTEM.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
