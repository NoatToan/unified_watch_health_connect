package com.xiaomi.fitness.main.sharepreference;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\fJ\u001a\u0010\u0019\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/main/sharepreference/PrivacySensitivePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "showUserSettingFinishedListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "", "<set-?>", "KEY_USER_SETTING_SUCCEED", "getKEY_USER_SETTING_SUCCEED", "()Z", "setKEY_USER_SETTING_SUCCEED", "(Z)V", "KEY_USER_SETTING_SUCCEED$delegate", "Lkotlin/properties/ReadWriteProperty;", "getKeyUserSetting", "setKeyUserSetting", "value", "addUserSettingFinishedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "privacy_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacySensitivePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacySensitivePreference.kt\ncom/xiaomi/fitness/main/sharepreference/PrivacySensitivePreference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,31:1\n1863#2,2:32\n135#3,6:34\n*S KotlinDebug\n*F\n+ 1 PrivacySensitivePreference.kt\ncom/xiaomi/fitness/main/sharepreference/PrivacySensitivePreference\n*L\n23#1:32,2\n15#1:34,6\n*E\n"})
public final class PrivacySensitivePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PrivacySensitivePreference.class, "KEY_USER_SETTING_SUCCEED", "getKEY_USER_SETTING_SUCCEED()Z", 0))};

    @NotNull
    public static final PrivacySensitivePreference INSTANCE;

    /* JADX INFO: renamed from: KEY_USER_SETTING_SUCCEED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_USER_SETTING_SUCCEED;

    @NotNull
    private static final String TAG;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Boolean, Unit>> showUserSettingFinishedListener;

    static {
        PrivacySensitivePreference privacySensitivePreference = new PrivacySensitivePreference();
        INSTANCE = privacySensitivePreference;
        TAG = "PrivacyPreference";
        showUserSettingFinishedListener = new CopyOnWriteArraySet<>();
        KEY_USER_SETTING_SUCCEED = privacySensitivePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.sharepreference.PrivacySensitivePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private PrivacySensitivePreference() {
    }

    private final boolean getKEY_USER_SETTING_SUCCEED() {
        return ((Boolean) KEY_USER_SETTING_SUCCEED.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setKEY_USER_SETTING_SUCCEED(boolean z) {
        KEY_USER_SETTING_SUCCEED.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void addUserSettingFinishedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArraySet<Function1<Boolean, Unit>> copyOnWriteArraySet = showUserSettingFinishedListener;
        if (copyOnWriteArraySet.contains(listener)) {
            return;
        }
        copyOnWriteArraySet.add(listener);
    }

    public final boolean getKeyUserSetting() {
        return getKEY_USER_SETTING_SUCCEED();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final void setKeyUserSetting(boolean value) {
        setKEY_USER_SETTING_SUCCEED(value);
        Iterator<T> it = showUserSettingFinishedListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(value));
        }
    }
}
