package com.xiaomi.fitness.login.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/login/preference/IntentStartActivityPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "getIntentStartApp", "", "setIntentStartApp", "", DeviceSettingConfigKey.KEY_SELECT_MODE, "<set-?>", "INTETNT_START_APP", "getINTETNT_START_APP", "()Z", "setINTETNT_START_APP", "(Z)V", "INTETNT_START_APP$delegate", "Lkotlin/properties/ReadWriteProperty;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntentStartActivityPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentStartActivityPreference.kt\ncom/xiaomi/fitness/login/preference/IntentStartActivityPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,19:1\n135#2,6:20\n*S KotlinDebug\n*F\n+ 1 IntentStartActivityPreference.kt\ncom/xiaomi/fitness/login/preference/IntentStartActivityPreference\n*L\n18#1:20,6\n*E\n"})
public final class IntentStartActivityPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(IntentStartActivityPreference.class, "INTETNT_START_APP", "getINTETNT_START_APP()Z", 0))};

    @NotNull
    public static final IntentStartActivityPreference INSTANCE;

    /* JADX INFO: renamed from: INTETNT_START_APP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty INTETNT_START_APP;

    static {
        IntentStartActivityPreference intentStartActivityPreference = new IntentStartActivityPreference();
        INSTANCE = intentStartActivityPreference;
        INTETNT_START_APP = intentStartActivityPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.login.preference.IntentStartActivityPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private IntentStartActivityPreference() {
    }

    public final boolean getINTETNT_START_APP() {
        return ((Boolean) INTETNT_START_APP.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getIntentStartApp() {
        return getINTETNT_START_APP();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_intent_start_app";
    }

    public final void setINTETNT_START_APP(boolean z) {
        INTETNT_START_APP.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setIntentStartApp(boolean selectMode) {
        setINTETNT_START_APP(selectMode);
    }
}
