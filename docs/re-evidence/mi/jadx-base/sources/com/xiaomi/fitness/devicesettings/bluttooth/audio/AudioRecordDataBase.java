package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {AudioRecordEntity.class}, exportSchema = false, version = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDataBase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "audioRecordDao", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDao;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioRecordDataBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordDataBase.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDataBase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,23:1\n20#2,8:24\n*S KotlinDebug\n*F\n+ 1 AudioRecordDataBase.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDataBase\n*L\n19#1:24,8\n*E\n"})
public abstract class AudioRecordDataBase extends BaseDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AudioRecordDataBase instance;

    @NotNull
    public static final String sName = "audio_record";
    public static final int sVersion = 2;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDataBase$Companion;", "", "<init>", "()V", LanguageSettingFragment.sName, "", "sVersion", "", "instance", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDataBase;", "getInstance", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDataBase;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AudioRecordDataBase getInstance() {
            return AudioRecordDataBase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = sName;
        instance = (AudioRecordDataBase) ((BaseDatabase) new SingleHolder(new Function1<Context, AudioRecordDataBase>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDataBase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordDataBase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final AudioRecordDataBase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (BaseDatabase) Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), AudioRecordDataBase.class, str).allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract AudioRecordDao audioRecordDao();
}
