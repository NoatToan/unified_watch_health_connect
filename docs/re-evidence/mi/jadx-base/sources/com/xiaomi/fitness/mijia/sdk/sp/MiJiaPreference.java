package com.xiaomi.fitness.mijia.sdk.sp;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/sp/MiJiaPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "MIJIA_ENV", "getMIJIA_ENV", "()I", "setMIJIA_ENV", "(I)V", "MIJIA_ENV$delegate", "Lkotlin/properties/ReadWriteProperty;", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMiJiaPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaPreference.kt\ncom/xiaomi/fitness/mijia/sdk/sp/MiJiaPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,13:1\n135#2,6:14\n*S KotlinDebug\n*F\n+ 1 MiJiaPreference.kt\ncom/xiaomi/fitness/mijia/sdk/sp/MiJiaPreference\n*L\n11#1:14,6\n*E\n"})
public final class MiJiaPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MiJiaPreference.class, "MIJIA_ENV", "getMIJIA_ENV()I", 0))};

    @NotNull
    public static final MiJiaPreference INSTANCE;

    /* JADX INFO: renamed from: MIJIA_ENV$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty MIJIA_ENV;

    static {
        MiJiaPreference miJiaPreference = new MiJiaPreference();
        INSTANCE = miJiaPreference;
        MIJIA_ENV = miJiaPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.mijia.sdk.sp.MiJiaPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 2, null, true);
    }

    private MiJiaPreference() {
    }

    public final int getMIJIA_ENV() {
        return ((Number) MIJIA_ENV.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "debug";
    }

    public final void setMIJIA_ENV(int i) {
        MIJIA_ENV.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }
}
