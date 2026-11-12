package com.xiaomi.fitness.membership.util;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/membership/util/MembershipPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "LAST_RETENTION_TIME", "getLAST_RETENTION_TIME", "()J", "setLAST_RETENTION_TIME", "(J)V", "LAST_RETENTION_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMembershipPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembershipPreference.kt\ncom/xiaomi/fitness/membership/util/MembershipPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,11:1\n135#2,6:12\n*S KotlinDebug\n*F\n+ 1 MembershipPreference.kt\ncom/xiaomi/fitness/membership/util/MembershipPreference\n*L\n9#1:12,6\n*E\n"})
public final class MembershipPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MembershipPreference.class, "LAST_RETENTION_TIME", "getLAST_RETENTION_TIME()J", 0))};

    @NotNull
    public static final MembershipPreference INSTANCE;

    /* JADX INFO: renamed from: LAST_RETENTION_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_RETENTION_TIME;

    static {
        MembershipPreference membershipPreference = new MembershipPreference();
        INSTANCE = membershipPreference;
        LAST_RETENTION_TIME = membershipPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.membership.util.MembershipPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
    }

    private MembershipPreference() {
    }

    public final long getLAST_RETENTION_TIME() {
        return ((Number) LAST_RETENTION_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "MembershipPreference";
    }

    public final void setLAST_RETENTION_TIME(long j) {
        LAST_RETENTION_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }
}
