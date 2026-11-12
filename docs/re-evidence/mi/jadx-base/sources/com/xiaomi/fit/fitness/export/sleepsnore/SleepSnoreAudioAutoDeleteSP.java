package com.xiaomi.fit.fitness.export.sleepsnore;

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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/export/sleepsnore/SleepSnoreAudioAutoDeleteSP;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "OLD_KEY_SNORE_AUDIO_AUTO_DELETE_ENABLED", "OLD_SPF_NAME", "originValue", "", "<set-?>", "AUTO_CLEAN_AUDIO_FILE", "getAUTO_CLEAN_AUDIO_FILE", "()Z", "setAUTO_CLEAN_AUDIO_FILE", "(Z)V", "AUTO_CLEAN_AUDIO_FILE$delegate", "Lkotlin/properties/ReadWriteProperty;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepSnoreAudioAutoDeleteSP.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSnoreAudioAutoDeleteSP.kt\ncom/xiaomi/fit/fitness/export/sleepsnore/SleepSnoreAudioAutoDeleteSP\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,21:1\n211#2,7:22\n*S KotlinDebug\n*F\n+ 1 SleepSnoreAudioAutoDeleteSP.kt\ncom/xiaomi/fit/fitness/export/sleepsnore/SleepSnoreAudioAutoDeleteSP\n*L\n16#1:22,7\n*E\n"})
public final class SleepSnoreAudioAutoDeleteSP extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepSnoreAudioAutoDeleteSP.class, "AUTO_CLEAN_AUDIO_FILE", "getAUTO_CLEAN_AUDIO_FILE()Z", 0))};

    /* JADX INFO: renamed from: AUTO_CLEAN_AUDIO_FILE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AUTO_CLEAN_AUDIO_FILE;

    @NotNull
    public static final SleepSnoreAudioAutoDeleteSP INSTANCE;

    @NotNull
    private static final String OLD_KEY_SNORE_AUDIO_AUTO_DELETE_ENABLED = "enable";

    @NotNull
    private static final String OLD_SPF_NAME = "com.mi.health.audio_file_cached";
    private static final boolean originValue;

    static {
        SleepSnoreAudioAutoDeleteSP sleepSnoreAudioAutoDeleteSP = new SleepSnoreAudioAutoDeleteSP();
        INSTANCE = sleepSnoreAudioAutoDeleteSP;
        boolean zBooleanValue = ((Boolean) AutoFileCacheSwitchRepository.INSTANCE.getValueFromSP("enable", Boolean.FALSE)).booleanValue();
        originValue = zBooleanValue;
        AUTO_CLEAN_AUDIO_FILE = sleepSnoreAudioAutoDeleteSP.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.fitness.export.sleepsnore.SleepSnoreAudioAutoDeleteSP$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), Boolean.valueOf(zBooleanValue), null, OLD_SPF_NAME, "enable");
    }

    private SleepSnoreAudioAutoDeleteSP() {
    }

    public final boolean getAUTO_CLEAN_AUDIO_FILE() {
        return ((Boolean) AUTO_CLEAN_AUDIO_FILE.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sleep_audio_auto_delete";
    }

    public final void setAUTO_CLEAN_AUDIO_FILE(boolean z) {
        AUTO_CLEAN_AUDIO_FILE.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
