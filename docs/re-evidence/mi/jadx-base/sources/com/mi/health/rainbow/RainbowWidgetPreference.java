package com.mi.health.rainbow;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/mi/health/rainbow/RainbowWidgetPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "UPDATE_TIME_2_2", "getUPDATE_TIME_2_2", "()J", "setUPDATE_TIME_2_2", "(J)V", "UPDATE_TIME_2_2$delegate", "Lkotlin/properties/ReadWriteProperty;", "UPDATE_TIME_4_2", "getUPDATE_TIME_4_2", "setUPDATE_TIME_4_2", "UPDATE_TIME_4_2$delegate", "getUpdateTime", "type", "", "setUpdateTime", "", "time", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRainbowWidgetPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RainbowWidgetPreference.kt\ncom/mi/health/rainbow/RainbowWidgetPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,33:1\n135#2,6:34\n135#2,6:40\n*S KotlinDebug\n*F\n+ 1 RainbowWidgetPreference.kt\ncom/mi/health/rainbow/RainbowWidgetPreference\n*L\n11#1:34,6\n13#1:40,6\n*E\n"})
public final class RainbowWidgetPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RainbowWidgetPreference.class, "UPDATE_TIME_2_2", "getUPDATE_TIME_2_2()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RainbowWidgetPreference.class, "UPDATE_TIME_4_2", "getUPDATE_TIME_4_2()J", 0))};

    @NotNull
    public static final RainbowWidgetPreference INSTANCE;

    /* JADX INFO: renamed from: UPDATE_TIME_2_2$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty UPDATE_TIME_2_2;

    /* JADX INFO: renamed from: UPDATE_TIME_4_2$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty UPDATE_TIME_4_2;

    static {
        RainbowWidgetPreference rainbowWidgetPreference = new RainbowWidgetPreference();
        INSTANCE = rainbowWidgetPreference;
        UPDATE_TIME_2_2 = rainbowWidgetPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.mi.health.rainbow.RainbowWidgetPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1L, null, true);
        UPDATE_TIME_4_2 = rainbowWidgetPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.mi.health.rainbow.RainbowWidgetPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), -1L, null, true);
    }

    private RainbowWidgetPreference() {
    }

    private final long getUPDATE_TIME_2_2() {
        return ((Number) UPDATE_TIME_2_2.getValue(this, $$delegatedProperties[0])).longValue();
    }

    private final long getUPDATE_TIME_4_2() {
        return ((Number) UPDATE_TIME_4_2.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final void setUPDATE_TIME_2_2(long j) {
        UPDATE_TIME_2_2.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    private final void setUPDATE_TIME_4_2(long j) {
        UPDATE_TIME_4_2.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "spf_rainbow_widget";
    }

    public final long getUpdateTime(int type) {
        if (type == 0) {
            return getUPDATE_TIME_2_2();
        }
        if (type != 1) {
            return -1L;
        }
        return getUPDATE_TIME_4_2();
    }

    public final void setUpdateTime(int type, long time) {
        if (type == 0) {
            setUPDATE_TIME_2_2(time);
        } else {
            if (type != 1) {
                return;
            }
            setUPDATE_TIME_4_2(time);
        }
    }
}
