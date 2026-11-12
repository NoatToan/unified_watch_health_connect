package com.xiaomi.fitness.route.track.data;

import com.xiaomi.fitness.watch.face.FaceInfoBase;
import defpackage.ump;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/route/track/data/TrackManager;", "", "<init>", "()V", "getTrackRecorderPath", "", "did", FaceInfoBase.FACE_ID, "hash", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackManager {

    @NotNull
    public static final TrackManager INSTANCE = new TrackManager();

    private TrackManager() {
    }

    @NotNull
    public final String getTrackRecorderPath(@NotNull String did, @NotNull String faceId, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        String strB = ump.b();
        String str = File.separator;
        return strB + str + did + str + faceId + str + hash;
    }
}
