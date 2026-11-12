package com.xiaomi.fitness.login.internaltest;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/login/internaltest/InternalTestAgreePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "IS_AGREE_SELECT", "getIS_AGREE_SELECT", "()Z", "setIS_AGREE_SELECT", "(Z)V", "IS_AGREE_SELECT$delegate", "Lkotlin/properties/ReadWriteProperty;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInternalTestAgreePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalTestAgreePreference.kt\ncom/xiaomi/fitness/login/internaltest/InternalTestAgreePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,10:1\n135#2,6:11\n*S KotlinDebug\n*F\n+ 1 InternalTestAgreePreference.kt\ncom/xiaomi/fitness/login/internaltest/InternalTestAgreePreference\n*L\n9#1:11,6\n*E\n"})
public final class InternalTestAgreePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(InternalTestAgreePreference.class, "IS_AGREE_SELECT", "getIS_AGREE_SELECT()Z", 0))};

    @NotNull
    public static final InternalTestAgreePreference INSTANCE;

    /* JADX INFO: renamed from: IS_AGREE_SELECT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_AGREE_SELECT;

    static {
        InternalTestAgreePreference internalTestAgreePreference = new InternalTestAgreePreference();
        INSTANCE = internalTestAgreePreference;
        IS_AGREE_SELECT = internalTestAgreePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.login.internaltest.InternalTestAgreePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private InternalTestAgreePreference() {
    }

    public final boolean getIS_AGREE_SELECT() {
        return ((Boolean) IS_AGREE_SELECT.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "internal_test";
    }

    public final void setIS_AGREE_SELECT(boolean z) {
        IS_AGREE_SELECT.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
