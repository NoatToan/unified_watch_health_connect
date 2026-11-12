package com.huami.sky.lib.properties;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/sky/lib/properties/SkyPropertiesKey;", "", "", "PLAY_SETTINGS", "Ljava/lang/String;", "QUESTION_COMPLETE_STATUS", "MUSIC_PREFERENCE_QUESTIONNAIRE", "SLEEP_REMINDER_SETTING", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPropertiesKey {

    @NotNull
    public static final SkyPropertiesKey INSTANCE = new SkyPropertiesKey();

    @NotNull
    public static final String MUSIC_PREFERENCE_QUESTIONNAIRE = "user.relaxmusic.preference";

    @NotNull
    public static final String PLAY_SETTINGS = "user.settings.relaxmusic.play";

    @NotNull
    public static final String QUESTION_COMPLETE_STATUS = "user.status.relaxmusic.questionnaire";

    @NotNull
    public static final String SLEEP_REMINDER_SETTING = "user.settings.sleepreminder";

    private SkyPropertiesKey() {
    }
}
