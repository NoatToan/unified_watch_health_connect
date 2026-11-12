package com.xiaomi.fitness.login.preference;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020\u0014J\u000e\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0014J\u000e\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020\u0007J\u001a\u0010*\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001a\u0010,\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/login/preference/PrivacyPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "showPrivacyFinishedListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "", "spName", "", "getSpName", "()Ljava/lang/String;", "mOldFinished", "getMOldFinished", "()Ljava/lang/Boolean;", "setMOldFinished", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "<set-?>", "", "PREF_PRIVACY_AGREE_TIME", "getPREF_PRIVACY_AGREE_TIME", "()J", "setPREF_PRIVACY_AGREE_TIME", "(J)V", "PREF_PRIVACY_AGREE_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_SHOW_PRIVACY_DIALOG_FINISHED", "getKEY_SHOW_PRIVACY_DIALOG_FINISHED", "()Z", "setKEY_SHOW_PRIVACY_DIALOG_FINISHED", "(Z)V", "KEY_SHOW_PRIVACY_DIALOG_FINISHED$delegate", "getPrivacyAgreeTime", "setPrivacyAgreeTime", "time", "setPrivacyAgreeTag", CommonConstants.KEY_AGREE, "setPrivacyDialogFinished", "finished", "getPrivacyDialogFinished", "addPrivacyDialogFinishedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removePrivacyDialogFinishedListener", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyPreference.kt\ncom/xiaomi/fitness/login/preference/PrivacyPreference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,50:1\n1863#2,2:51\n211#3,7:53\n135#3,6:60\n*S KotlinDebug\n*F\n+ 1 PrivacyPreference.kt\ncom/xiaomi/fitness/login/preference/PrivacyPreference\n*L\n34#1:51,2\n15#1:53,7\n17#1:60,6\n*E\n"})
public final class PrivacyPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PrivacyPreference.class, "PREF_PRIVACY_AGREE_TIME", "getPREF_PRIVACY_AGREE_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PrivacyPreference.class, "KEY_SHOW_PRIVACY_DIALOG_FINISHED", "getKEY_SHOW_PRIVACY_DIALOG_FINISHED()Z", 0))};

    @NotNull
    public static final PrivacyPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_SHOW_PRIVACY_DIALOG_FINISHED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SHOW_PRIVACY_DIALOG_FINISHED;

    /* JADX INFO: renamed from: PREF_PRIVACY_AGREE_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_PRIVACY_AGREE_TIME;

    @Nullable
    private static Boolean mOldFinished;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Boolean, Unit>> showPrivacyFinishedListener;

    static {
        PrivacyPreference privacyPreference = new PrivacyPreference();
        INSTANCE = privacyPreference;
        showPrivacyFinishedListener = new CopyOnWriteArraySet<>();
        Boolean bool = Boolean.FALSE;
        mOldFinished = bool;
        PREF_PRIVACY_AGREE_TIME = privacyPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.login.preference.PrivacyPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), 0L, null, "app_pref", "pref_privacy_agree_time");
        KEY_SHOW_PRIVACY_DIALOG_FINISHED = privacyPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.login.preference.PrivacyPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
    }

    private PrivacyPreference() {
    }

    public final void addPrivacyDialogFinishedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArraySet<Function1<Boolean, Unit>> copyOnWriteArraySet = showPrivacyFinishedListener;
        if (copyOnWriteArraySet.contains(listener)) {
            return;
        }
        copyOnWriteArraySet.add(listener);
    }

    public final boolean getKEY_SHOW_PRIVACY_DIALOG_FINISHED() {
        return ((Boolean) KEY_SHOW_PRIVACY_DIALOG_FINISHED.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Nullable
    public final Boolean getMOldFinished() {
        return mOldFinished;
    }

    public final long getPREF_PRIVACY_AGREE_TIME() {
        return ((Number) PREF_PRIVACY_AGREE_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final long getPrivacyAgreeTime() {
        return getPREF_PRIVACY_AGREE_TIME();
    }

    public final boolean getPrivacyDialogFinished() {
        return getKEY_SHOW_PRIVACY_DIALOG_FINISHED();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final void removePrivacyDialogFinishedListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        showPrivacyFinishedListener.remove(listener);
    }

    public final void setKEY_SHOW_PRIVACY_DIALOG_FINISHED(boolean z) {
        KEY_SHOW_PRIVACY_DIALOG_FINISHED.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setMOldFinished(@Nullable Boolean bool) {
        mOldFinished = bool;
    }

    public final void setPREF_PRIVACY_AGREE_TIME(long j) {
        PREF_PRIVACY_AGREE_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setPrivacyAgreeTag(boolean agree) {
        RegionPreference.INSTANCE.setSettingPrivacy(agree);
    }

    public final void setPrivacyAgreeTime(long time) {
        setPREF_PRIVACY_AGREE_TIME(time);
    }

    public final void setPrivacyDialogFinished(boolean finished) {
        setKEY_SHOW_PRIVACY_DIALOG_FINISHED(finished);
        Iterator<T> it = showPrivacyFinishedListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(finished));
        }
    }
}
