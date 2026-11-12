package com.xiaomi.fitness.medal.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R+\u0010\u001e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/medal/preference/PopMedalDataPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "KEY_POP_MEDAL_LIST_JSON", "KEY_SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK", "KEY_COME_FROM_MEDAL_DETAIL_PAGE", "KEY_POP_MEDAL_DIALOG_IS_SHOWING", "<set-?>", "POP_MEDAL_LIST_JSON", "getPOP_MEDAL_LIST_JSON", "setPOP_MEDAL_LIST_JSON", "(Ljava/lang/String;)V", "POP_MEDAL_LIST_JSON$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK", "getSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK", "()Z", "setSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK", "(Z)V", "SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK$delegate", "COME_FROM_MEDAL_DETAIL_PAGE", "getCOME_FROM_MEDAL_DETAIL_PAGE", "setCOME_FROM_MEDAL_DETAIL_PAGE", "COME_FROM_MEDAL_DETAIL_PAGE$delegate", "POP_MEDAL_DIALOG_IS_SHOWING", "getPOP_MEDAL_DIALOG_IS_SHOWING", "setPOP_MEDAL_DIALOG_IS_SHOWING", "POP_MEDAL_DIALOG_IS_SHOWING$delegate", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPopMedalDataPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopMedalDataPreference.kt\ncom/xiaomi/fitness/medal/preference/PopMedalDataPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,55:1\n140#2:56\n140#2:57\n140#2:58\n140#2:59\n*S KotlinDebug\n*F\n+ 1 PopMedalDataPreference.kt\ncom/xiaomi/fitness/medal/preference/PopMedalDataPreference\n*L\n21#1:56\n30#1:57\n40#1:58\n50#1:59\n*E\n"})
public final class PopMedalDataPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PopMedalDataPreference.class, "POP_MEDAL_LIST_JSON", "getPOP_MEDAL_LIST_JSON()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PopMedalDataPreference.class, "SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK", "getSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PopMedalDataPreference.class, "COME_FROM_MEDAL_DETAIL_PAGE", "getCOME_FROM_MEDAL_DETAIL_PAGE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PopMedalDataPreference.class, "POP_MEDAL_DIALOG_IS_SHOWING", "getPOP_MEDAL_DIALOG_IS_SHOWING()Z", 0))};

    /* JADX INFO: renamed from: COME_FROM_MEDAL_DETAIL_PAGE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty COME_FROM_MEDAL_DETAIL_PAGE;

    @NotNull
    public static final PopMedalDataPreference INSTANCE;

    @NotNull
    private static final String KEY_COME_FROM_MEDAL_DETAIL_PAGE = "come_from_medal_detail_page";

    @NotNull
    private static final String KEY_POP_MEDAL_DIALOG_IS_SHOWING = "pop_medal_dialog_is_showing";

    @NotNull
    private static final String KEY_POP_MEDAL_LIST_JSON = "pop_medal_list_json";

    @NotNull
    private static final String KEY_SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK = "key_should_pull_pop_medal_data_from_network";

    /* JADX INFO: renamed from: POP_MEDAL_DIALOG_IS_SHOWING$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty POP_MEDAL_DIALOG_IS_SHOWING;

    /* JADX INFO: renamed from: POP_MEDAL_LIST_JSON$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty POP_MEDAL_LIST_JSON;

    /* JADX INFO: renamed from: SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK;

    static {
        PopMedalDataPreference popMedalDataPreference = new PopMedalDataPreference();
        INSTANCE = popMedalDataPreference;
        POP_MEDAL_LIST_JSON = popMedalDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.medal.preference.PopMedalDataPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), "", KEY_POP_MEDAL_LIST_JSON, true);
        SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK = popMedalDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.medal.preference.PopMedalDataPreference$special$$inlined$bindToPreferenceField$2
        }.getType(), Boolean.TRUE, KEY_SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK, true);
        Boolean bool = Boolean.FALSE;
        COME_FROM_MEDAL_DETAIL_PAGE = popMedalDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.medal.preference.PopMedalDataPreference$special$$inlined$bindToPreferenceField$3
        }.getType(), bool, KEY_COME_FROM_MEDAL_DETAIL_PAGE, true);
        POP_MEDAL_DIALOG_IS_SHOWING = popMedalDataPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.medal.preference.PopMedalDataPreference$special$$inlined$bindToPreferenceField$4
        }.getType(), bool, KEY_POP_MEDAL_DIALOG_IS_SHOWING, true);
    }

    private PopMedalDataPreference() {
    }

    public final boolean getCOME_FROM_MEDAL_DETAIL_PAGE() {
        return ((Boolean) COME_FROM_MEDAL_DETAIL_PAGE.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getPOP_MEDAL_DIALOG_IS_SHOWING() {
        return ((Boolean) POP_MEDAL_DIALOG_IS_SHOWING.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    @NotNull
    public final String getPOP_MEDAL_LIST_JSON() {
        return (String) POP_MEDAL_LIST_JSON.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean getSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK() {
        return ((Boolean) SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "pop_medal_data";
    }

    public final void setCOME_FROM_MEDAL_DETAIL_PAGE(boolean z) {
        COME_FROM_MEDAL_DETAIL_PAGE.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setPOP_MEDAL_DIALOG_IS_SHOWING(boolean z) {
        POP_MEDAL_DIALOG_IS_SHOWING.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setPOP_MEDAL_LIST_JSON(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        POP_MEDAL_LIST_JSON.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setSHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK(boolean z) {
        SHOULD_PULL_POP_MEDAL_DATA_FROM_NETWORK.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }
}
