package com.xiaomi.fitness.login.export;

import android.content.Intent;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/login/export/PrivacyEasyModePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "PREF_PRIVACY_EASY_MODE", "getPREF_PRIVACY_EASY_MODE", "()I", "setPREF_PRIVACY_EASY_MODE", "(I)V", "PREF_PRIVACY_EASY_MODE$delegate", "Lkotlin/properties/ReadWriteProperty;", "isEasyMode", "", "()Z", "setEasyMode", "", "value", "login-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyEasyModePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyEasyModePreference.kt\ncom/xiaomi/fitness/login/export/PrivacyEasyModePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,33:1\n135#2,6:34\n*S KotlinDebug\n*F\n+ 1 PrivacyEasyModePreference.kt\ncom/xiaomi/fitness/login/export/PrivacyEasyModePreference\n*L\n18#1:34,6\n*E\n"})
public final class PrivacyEasyModePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PrivacyEasyModePreference.class, "PREF_PRIVACY_EASY_MODE", "getPREF_PRIVACY_EASY_MODE()I", 0))};

    @NotNull
    public static final PrivacyEasyModePreference INSTANCE;

    /* JADX INFO: renamed from: PREF_PRIVACY_EASY_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_PRIVACY_EASY_MODE;

    @NotNull
    public static final String TAG = "PrivacyEasyModePreference";

    static {
        PrivacyEasyModePreference privacyEasyModePreference = new PrivacyEasyModePreference();
        INSTANCE = privacyEasyModePreference;
        PREF_PRIVACY_EASY_MODE = privacyEasyModePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.login.export.PrivacyEasyModePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1, null, true);
    }

    private PrivacyEasyModePreference() {
    }

    private final int getPREF_PRIVACY_EASY_MODE() {
        return ((Number) PREF_PRIVACY_EASY_MODE.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final void setPREF_PRIVACY_EASY_MODE(int i) {
        PREF_PRIVACY_EASY_MODE.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final boolean isEasyMode() {
        return getPREF_PRIVACY_EASY_MODE() == 1;
    }

    public final void setEasyMode(boolean value) {
        int pref_privacy_easy_mode = getPREF_PRIVACY_EASY_MODE();
        Logger.i(TAG, "setEasyMode lastValue:" + pref_privacy_easy_mode + " newValue:" + value);
        setPREF_PRIVACY_EASY_MODE(value ? 1 : 0);
        if (pref_privacy_easy_mode != 1 || value) {
            return;
        }
        Intent intent = new Intent("APP_ACCOUNT_REFRESH");
        intent.putExtra("extra_update_type", 3);
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }
}
