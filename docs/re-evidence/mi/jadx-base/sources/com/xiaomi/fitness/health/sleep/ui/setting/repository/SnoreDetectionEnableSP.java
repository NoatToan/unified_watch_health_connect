package com.xiaomi.fitness.health.sleep.ui.setting.repository;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SnoreDetectionEnableSP;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "KEY_DENIED_AUDIO_PERMISSION", "getKEY_DENIED_AUDIO_PERMISSION", "()I", "setKEY_DENIED_AUDIO_PERMISSION", "(I)V", "KEY_DENIED_AUDIO_PERMISSION$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_NEVER_SHOW", "getKEY_NEVER_SHOW", "()Z", "setKEY_NEVER_SHOW", "(Z)V", "KEY_NEVER_SHOW$delegate", "", "KEY_CLICK_NOT_NOW", "getKEY_CLICK_NOT_NOW", "()J", "setKEY_CLICK_NOT_NOW", "(J)V", "KEY_CLICK_NOT_NOW$delegate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnoreDetectionEnableSP.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnoreDetectionEnableSP.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/repository/SnoreDetectionEnableSP\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,13:1\n135#2,6:14\n135#2,6:20\n135#2,6:26\n*S KotlinDebug\n*F\n+ 1 SnoreDetectionEnableSP.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/repository/SnoreDetectionEnableSP\n*L\n9#1:14,6\n10#1:20,6\n12#1:26,6\n*E\n"})
public final class SnoreDetectionEnableSP extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SnoreDetectionEnableSP.class, "KEY_DENIED_AUDIO_PERMISSION", "getKEY_DENIED_AUDIO_PERMISSION()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SnoreDetectionEnableSP.class, "KEY_NEVER_SHOW", "getKEY_NEVER_SHOW()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SnoreDetectionEnableSP.class, "KEY_CLICK_NOT_NOW", "getKEY_CLICK_NOT_NOW()J", 0))};

    @NotNull
    public static final SnoreDetectionEnableSP INSTANCE;

    /* JADX INFO: renamed from: KEY_CLICK_NOT_NOW$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_CLICK_NOT_NOW;

    /* JADX INFO: renamed from: KEY_DENIED_AUDIO_PERMISSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_DENIED_AUDIO_PERMISSION;

    /* JADX INFO: renamed from: KEY_NEVER_SHOW$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NEVER_SHOW;

    static {
        SnoreDetectionEnableSP snoreDetectionEnableSP = new SnoreDetectionEnableSP();
        INSTANCE = snoreDetectionEnableSP;
        KEY_DENIED_AUDIO_PERMISSION = snoreDetectionEnableSP.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SnoreDetectionEnableSP$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, "denied_audio_perm", true);
        KEY_NEVER_SHOW = snoreDetectionEnableSP.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SnoreDetectionEnableSP$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.FALSE, "ns", true);
        KEY_CLICK_NOT_NOW = snoreDetectionEnableSP.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SnoreDetectionEnableSP$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0L, "cnn", true);
    }

    private SnoreDetectionEnableSP() {
    }

    public final long getKEY_CLICK_NOT_NOW() {
        return ((Number) KEY_CLICK_NOT_NOW.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final int getKEY_DENIED_AUDIO_PERMISSION() {
        return ((Number) KEY_DENIED_AUDIO_PERMISSION.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final boolean getKEY_NEVER_SHOW() {
        return ((Boolean) KEY_NEVER_SHOW.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "snore_guide";
    }

    public final void setKEY_CLICK_NOT_NOW(long j) {
        KEY_CLICK_NOT_NOW.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setKEY_DENIED_AUDIO_PERMISSION(int i) {
        KEY_DENIED_AUDIO_PERMISSION.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setKEY_NEVER_SHOW(boolean z) {
        KEY_NEVER_SHOW.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }
}
