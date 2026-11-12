package com.xiaomi.fitness.trail.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.trail.export.track.TrackData;
import dagger.hilt.android.EntryPointAccessors;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"0\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\"\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"sportRecordApi", "Lcom/xiaomi/fitness/trail/export/SportRecordApi;", "getSportRecordApi", "()Lcom/xiaomi/fitness/trail/export/SportRecordApi;", "KEY_SPORT_CATEGORY", "", "KEY_TAB_WEEK", "", "KEY_TAB_MONTH", "KEY_TAB_YEAR", "KEY_TAB_TOTAL", "trackList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/trail/export/track/TrackData;", "Ljava/util/ArrayList;", "getTrackList", "()Ljava/util/ArrayList;", "setTrackList", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "NOT_JOINED_OR_FINISHED", "JOINED_BUT_NOT_FINISHED", "JOINED_AND_FINISHED", "NOT_JOINED_BUT_FINISHED", "sport-record-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportRecordApiKt {
    public static final int JOINED_AND_FINISHED = 2;
    public static final int JOINED_BUT_NOT_FINISHED = 1;

    @NotNull
    public static final String KEY_SPORT_CATEGORY = "key_category";
    public static final int KEY_TAB_MONTH = 1;
    public static final int KEY_TAB_TOTAL = 3;
    public static final int KEY_TAB_WEEK = 0;
    public static final int KEY_TAB_YEAR = 2;
    public static final int NOT_JOINED_BUT_FINISHED = 3;
    public static final int NOT_JOINED_OR_FINISHED = 0;

    @NotNull
    private static final SportRecordApi sportRecordApi = ((SportRecordPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportRecordPoint.class)).getSportRecordApi();

    @Nullable
    private static ArrayList<TrackData> trackList;

    @NotNull
    public static final SportRecordApi getSportRecordApi() {
        return sportRecordApi;
    }

    @Nullable
    public static final ArrayList<TrackData> getTrackList() {
        return trackList;
    }

    public static final void setTrackList(@Nullable ArrayList<TrackData> arrayList) {
        trackList = arrayList;
    }
}
