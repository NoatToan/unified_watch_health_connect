package com.xiaomi.fitness.track;

import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/track/TrackDataHolder;", "", "<init>", "()V", "tracks", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Ljava/util/ArrayList;", "getTracks", "()Ljava/util/ArrayList;", "setTracks", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackDataHolder {

    @NotNull
    public static final TrackDataHolder INSTANCE = new TrackDataHolder();

    @Nullable
    private static ArrayList<CommonTrackData> tracks;

    private TrackDataHolder() {
    }

    @Nullable
    public final ArrayList<CommonTrackData> getTracks() {
        return tracks;
    }

    public final void setTracks(@Nullable ArrayList<CommonTrackData> arrayList) {
        tracks = arrayList;
    }
}
