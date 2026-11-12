package com.xiaomi.fitness.feedback.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/feedback/preference/FeedbackPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "PREF_PRIVACY_STORAGE_TAG", "getPREF_PRIVACY_STORAGE_TAG", "()Z", "setPREF_PRIVACY_STORAGE_TAG", "(Z)V", "PREF_PRIVACY_STORAGE_TAG$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "COMMENT_VERSION", "getCOMMENT_VERSION", "()J", "setCOMMENT_VERSION", "(J)V", "COMMENT_VERSION$delegate", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedbackPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackPreference.kt\ncom/xiaomi/fitness/feedback/preference/FeedbackPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,17:1\n135#2,6:18\n135#2,6:24\n*S KotlinDebug\n*F\n+ 1 FeedbackPreference.kt\ncom/xiaomi/fitness/feedback/preference/FeedbackPreference\n*L\n14#1:18,6\n16#1:24,6\n*E\n"})
public final class FeedbackPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FeedbackPreference.class, "PREF_PRIVACY_STORAGE_TAG", "getPREF_PRIVACY_STORAGE_TAG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FeedbackPreference.class, "COMMENT_VERSION", "getCOMMENT_VERSION()J", 0))};

    /* JADX INFO: renamed from: COMMENT_VERSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty COMMENT_VERSION;

    @NotNull
    public static final FeedbackPreference INSTANCE;

    /* JADX INFO: renamed from: PREF_PRIVACY_STORAGE_TAG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_PRIVACY_STORAGE_TAG;

    static {
        FeedbackPreference feedbackPreference = new FeedbackPreference();
        INSTANCE = feedbackPreference;
        PREF_PRIVACY_STORAGE_TAG = feedbackPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.feedback.preference.FeedbackPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
        COMMENT_VERSION = feedbackPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.feedback.preference.FeedbackPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
    }

    private FeedbackPreference() {
    }

    public final long getCOMMENT_VERSION() {
        return ((Number) COMMENT_VERSION.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final boolean getPREF_PRIVACY_STORAGE_TAG() {
        return ((Boolean) PREF_PRIVACY_STORAGE_TAG.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final void setCOMMENT_VERSION(long j) {
        COMMENT_VERSION.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setPREF_PRIVACY_STORAGE_TAG(boolean z) {
        PREF_PRIVACY_STORAGE_TAG.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
