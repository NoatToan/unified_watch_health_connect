package com.xiaomi.fitness.login.preference;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001a\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001a\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0006\u0010)\u001a\u00020\u001bJ\u000e\u0010*\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001bJ\u000e\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\"J\u0006\u0010-\u001a\u00020\"R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/login/preference/ModePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "selectModeListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "", "spName", "", "getSpName", "()Ljava/lang/String;", "getSelectMode", "setSelectMode", DeviceSettingConfigKey.KEY_SELECT_MODE, "addSelectModeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeSelectModeListener", "<set-?>", "SELECT_MODE", "getSELECT_MODE", "()I", "setSELECT_MODE", "(I)V", "SELECT_MODE$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "WELCOME_FINISH", "getWELCOME_FINISH", "()Z", "setWELCOME_FINISH", "(Z)V", "WELCOME_FINISH$delegate", "", "TOKEN_REFRESH_TIME", "getTOKEN_REFRESH_TIME", "()J", "setTOKEN_REFRESH_TIME", "(J)V", "TOKEN_REFRESH_TIME$delegate", "getWelcomeFinish", "setWelcomeFinish", "setTokenRefreshTime", "time", "getTokenRefreshRecordTime", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModePreference.kt\ncom/xiaomi/fitness/login/preference/ModePreference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,54:1\n1863#2,2:55\n135#3,6:57\n135#3,6:63\n135#3,6:69\n*S KotlinDebug\n*F\n+ 1 ModePreference.kt\ncom/xiaomi/fitness/login/preference/ModePreference\n*L\n19#1:55,2\n32#1:57,6\n34#1:63,6\n36#1:69,6\n*E\n"})
public final class ModePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ModePreference.class, "SELECT_MODE", "getSELECT_MODE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ModePreference.class, "WELCOME_FINISH", "getWELCOME_FINISH()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ModePreference.class, "TOKEN_REFRESH_TIME", "getTOKEN_REFRESH_TIME()J", 0))};

    @NotNull
    public static final ModePreference INSTANCE;

    /* JADX INFO: renamed from: SELECT_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SELECT_MODE;

    /* JADX INFO: renamed from: TOKEN_REFRESH_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty TOKEN_REFRESH_TIME;

    /* JADX INFO: renamed from: WELCOME_FINISH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty WELCOME_FINISH;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Integer, Unit>> selectModeListener;

    static {
        ModePreference modePreference = new ModePreference();
        INSTANCE = modePreference;
        selectModeListener = new CopyOnWriteArraySet<>();
        SELECT_MODE = modePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.login.preference.ModePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1, null, true);
        WELCOME_FINISH = modePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.login.preference.ModePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.FALSE, null, true);
        TOKEN_REFRESH_TIME = modePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.login.preference.ModePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0L, null, true);
    }

    private ModePreference() {
    }

    public final void addSelectModeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArraySet<Function1<Integer, Unit>> copyOnWriteArraySet = selectModeListener;
        if (copyOnWriteArraySet.contains(listener)) {
            return;
        }
        copyOnWriteArraySet.add(listener);
    }

    public final int getSELECT_MODE() {
        return ((Number) SELECT_MODE.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getSelectMode() {
        return getSELECT_MODE();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final long getTOKEN_REFRESH_TIME() {
        return ((Number) TOKEN_REFRESH_TIME.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final long getTokenRefreshRecordTime() {
        return getTOKEN_REFRESH_TIME();
    }

    public final boolean getWELCOME_FINISH() {
        return ((Boolean) WELCOME_FINISH.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getWelcomeFinish() {
        return getWELCOME_FINISH();
    }

    public final void removeSelectModeListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        selectModeListener.remove(listener);
    }

    public final void setSELECT_MODE(int i) {
        SELECT_MODE.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setSelectMode(int selectMode) {
        setSELECT_MODE(selectMode);
        Iterator<T> it = selectModeListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Integer.valueOf(selectMode));
        }
    }

    public final void setTOKEN_REFRESH_TIME(long j) {
        TOKEN_REFRESH_TIME.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setTokenRefreshTime(long time) {
        setTOKEN_REFRESH_TIME(time);
    }

    public final void setWELCOME_FINISH(boolean z) {
        WELCOME_FINISH.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setWelcomeFinish(boolean selectMode) {
        setWELCOME_FINISH(selectMode);
    }
}
