package com.ximalaya.ting.android.sdkdownloader.db;

import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DownloadState;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmDbManager {
    boolean batchDelete(List<Long> list, boolean z);

    boolean changeDownloadSavePath(long j, String str);

    boolean changeDownloadSavePath(Map<Long, String> map);

    boolean delete(long j, boolean z);

    List<Track> findAll();

    Track getTrack(long j);

    List<Track> getTracksByIds(Set<Long> set);

    void release();

    boolean saveTrack(Track track);

    boolean saveTrackList(Collection<Track> collection);

    void setAllTrackStatue(DownloadState downloadState, DownloadState downloadState2);

    void setAllTrackStatue(DownloadState downloadState, DownloadState downloadState2, List<Long> list);

    void setAllTrackStatueExcludeFinished(DownloadState downloadState);

    void update(Track track);

    void updateDownloadedTrackPosition(Map<Long, Integer> map);
}
