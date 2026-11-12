package com.xiaomi.fitness.sport_capture.app_lifecycle;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0007R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/app_lifecycle/SportCapturePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "isAppForeground", "()Z", "setAppForeground", "(Z)V", "isAppForeground$delegate", "Lkotlin/properties/ReadWriteProperty;", "isAppProjecting", "setAppProjecting", "isAppProjecting$delegate", "setAppProjection", "", "isProjecting", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportCapturePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportCapturePreference.kt\ncom/xiaomi/fitness/sport_capture/app_lifecycle/SportCapturePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,18:1\n135#2,6:19\n135#2,6:25\n*S KotlinDebug\n*F\n+ 1 SportCapturePreference.kt\ncom/xiaomi/fitness/sport_capture/app_lifecycle/SportCapturePreference\n*L\n9#1:19,6\n11#1:25,6\n*E\n"})
public final class SportCapturePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportCapturePreference.class, "isAppForeground", "isAppForeground()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportCapturePreference.class, "isAppProjecting", "isAppProjecting()Z", 0))};

    @NotNull
    public static final SportCapturePreference INSTANCE;

    /* JADX INFO: renamed from: isAppForeground$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isAppForeground;

    /* JADX INFO: renamed from: isAppProjecting$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isAppProjecting;

    static {
        SportCapturePreference sportCapturePreference = new SportCapturePreference();
        INSTANCE = sportCapturePreference;
        Boolean bool = Boolean.FALSE;
        isAppForeground = sportCapturePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        isAppProjecting = sportCapturePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, true);
    }

    private SportCapturePreference() {
    }

    @JvmStatic
    public static final void setAppProjection(boolean isProjecting) {
        INSTANCE.setAppProjecting(isProjecting);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_capture";
    }

    public final boolean isAppForeground() {
        return ((Boolean) isAppForeground.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean isAppProjecting() {
        return ((Boolean) isAppProjecting.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setAppForeground(boolean z) {
        isAppForeground.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setAppProjecting(boolean z) {
        isAppProjecting.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }
}
