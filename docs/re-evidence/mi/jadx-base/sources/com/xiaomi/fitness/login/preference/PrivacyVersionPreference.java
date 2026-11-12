package com.xiaomi.fitness.login.preference;

import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/login/preference/PrivacyVersionPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "PATH_NO_ACCOUNT", "", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_PRIVACY_VERSION", "getKEY_PRIVACY_VERSION", "setKEY_PRIVACY_VERSION", "(Ljava/lang/String;)V", "KEY_PRIVACY_VERSION$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPrivacyVersion", "setPrivacyVersion", "", "version", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyVersionPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyVersionPreference.kt\ncom/xiaomi/fitness/login/preference/PrivacyVersionPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,25:1\n211#2,7:26\n*S KotlinDebug\n*F\n+ 1 PrivacyVersionPreference.kt\ncom/xiaomi/fitness/login/preference/PrivacyVersionPreference\n*L\n16#1:26,7\n*E\n"})
public final class PrivacyVersionPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PrivacyVersionPreference.class, "KEY_PRIVACY_VERSION", "getKEY_PRIVACY_VERSION()Ljava/lang/String;", 0))};

    @NotNull
    public static final PrivacyVersionPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_PRIVACY_VERSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_PRIVACY_VERSION;

    @NotNull
    private static final String PATH_NO_ACCOUNT;

    static {
        PrivacyVersionPreference privacyVersionPreference = new PrivacyVersionPreference();
        INSTANCE = privacyVersionPreference;
        PATH_NO_ACCOUNT = FitnessDBConstants.PATH_NO_ACCOUNT;
        KEY_PRIVACY_VERSION = privacyVersionPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.login.preference.PrivacyVersionPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId(), "key_privacy_version");
    }

    private PrivacyVersionPreference() {
    }

    @NotNull
    public final String getKEY_PRIVACY_VERSION() {
        return (String) KEY_PRIVACY_VERSION.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getPrivacyVersion() {
        return getKEY_PRIVACY_VERSION();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        return userId == null ? PATH_NO_ACCOUNT : userId;
    }

    public final void setKEY_PRIVACY_VERSION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_PRIVACY_VERSION.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setPrivacyVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        setKEY_PRIVACY_VERSION(version);
    }
}
