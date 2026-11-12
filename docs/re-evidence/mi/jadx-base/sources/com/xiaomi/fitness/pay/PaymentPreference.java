package com.xiaomi.fitness.pay;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/pay/PaymentPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "<set-?>", "", "AGREE_MIBI_PRIVACY", "getAGREE_MIBI_PRIVACY", "()Z", "setAGREE_MIBI_PRIVACY", "(Z)V", "AGREE_MIBI_PRIVACY$delegate", "Lkotlin/properties/ReadWriteProperty;", "spName", "", "getSpName", "()Ljava/lang/String;", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPreference.kt\ncom/xiaomi/fitness/pay/PaymentPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,11:1\n135#2,6:12\n*S KotlinDebug\n*F\n+ 1 PaymentPreference.kt\ncom/xiaomi/fitness/pay/PaymentPreference\n*L\n7#1:12,6\n*E\n"})
public final class PaymentPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaymentPreference.class, "AGREE_MIBI_PRIVACY", "getAGREE_MIBI_PRIVACY()Z", 0))};

    /* JADX INFO: renamed from: AGREE_MIBI_PRIVACY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AGREE_MIBI_PRIVACY;

    @NotNull
    public static final PaymentPreference INSTANCE;

    static {
        PaymentPreference paymentPreference = new PaymentPreference();
        INSTANCE = paymentPreference;
        AGREE_MIBI_PRIVACY = paymentPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.pay.PaymentPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private PaymentPreference() {
    }

    public final boolean getAGREE_MIBI_PRIVACY() {
        return ((Boolean) AGREE_MIBI_PRIVACY.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "mibi_payment";
    }

    public final void setAGREE_MIBI_PRIVACY(boolean z) {
        AGREE_MIBI_PRIVACY.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
