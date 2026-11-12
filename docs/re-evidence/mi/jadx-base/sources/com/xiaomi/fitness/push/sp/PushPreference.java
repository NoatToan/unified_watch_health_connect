package com.xiaomi.fitness.push.sp;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/push/sp/PushPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "isOpenPush", "()Z", "setOpenPush", "(Z)V", "isOpenPush$delegate", "Lkotlin/properties/ReadWriteProperty;", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushPreference.kt\ncom/xiaomi/fitness/push/sp/PushPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,16:1\n140#2:17\n*S KotlinDebug\n*F\n+ 1 PushPreference.kt\ncom/xiaomi/fitness/push/sp/PushPreference\n*L\n15#1:17\n*E\n"})
public final class PushPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PushPreference.class, "isOpenPush", "isOpenPush()Z", 0))};

    @NotNull
    public static final PushPreference INSTANCE;

    /* JADX INFO: renamed from: isOpenPush$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isOpenPush;

    static {
        PushPreference pushPreference = new PushPreference();
        INSTANCE = pushPreference;
        isOpenPush = pushPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.push.sp.PushPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), Boolean.TRUE, "is_open_push", true);
    }

    private PushPreference() {
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_push";
    }

    public final boolean isOpenPush() {
        return ((Boolean) isOpenPush.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setOpenPush(boolean z) {
        isOpenPush.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
