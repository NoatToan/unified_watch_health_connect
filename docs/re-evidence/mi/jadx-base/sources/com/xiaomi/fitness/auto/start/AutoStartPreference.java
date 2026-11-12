package com.xiaomi.fitness.auto.start;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/auto/start/AutoStartPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "OPEN_ONCE", "getOPEN_ONCE", "()Z", "setOPEN_ONCE", "(Z)V", "OPEN_ONCE$delegate", "Lkotlin/properties/ReadWriteProperty;", "auto-start_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoStartPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStartPreference.kt\ncom/xiaomi/fitness/auto/start/AutoStartPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,14:1\n135#2,6:15\n*S KotlinDebug\n*F\n+ 1 AutoStartPreference.kt\ncom/xiaomi/fitness/auto/start/AutoStartPreference\n*L\n13#1:15,6\n*E\n"})
public final class AutoStartPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AutoStartPreference.class, "OPEN_ONCE", "getOPEN_ONCE()Z", 0))};

    @NotNull
    public static final AutoStartPreference INSTANCE;

    /* JADX INFO: renamed from: OPEN_ONCE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_ONCE;

    static {
        AutoStartPreference autoStartPreference = new AutoStartPreference();
        INSTANCE = autoStartPreference;
        OPEN_ONCE = autoStartPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.auto.start.AutoStartPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private AutoStartPreference() {
    }

    public final boolean getOPEN_ONCE() {
        return ((Boolean) OPEN_ONCE.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "perm_auto_start";
    }

    public final void setOPEN_ONCE(boolean z) {
        OPEN_ONCE.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
