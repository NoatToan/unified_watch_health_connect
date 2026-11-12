package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.exception.AddDownloadException;
import com.ximalaya.ting.android.sdkdownloader.model.XmDownloadAlbum;
import com.ximalaya.ting.android.sdkdownloader.model.XmDownloadAlbumHaveTracks;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public interface IDownloadManager {
    public static final int Auto = 5;
    public static final int B = 4;
    public static final int G = 1;
    public static final int KB = 2;
    public static final int MB = 3;

    public @interface DownloadSizePrecision {
    }

    boolean albumHaveDownloadingTrack(long j);

    void batchCancelDownloadTracks(List<Long> list, IDoSomethingProgress iDoSomethingProgress);

    void batchClearDownloadedTracks(List<Long> list, IDoSomethingProgress iDoSomethingProgress);

    Map<Long, DownloadState> batchGetTracksDownloadStatus(List<Long> list);

    void batchPauseDownloadTracks(Collection<Long> collection, IDoSomethingProgress iDoSomethingProgress);

    void batchResumeDownloadTracks(List<Long> list, IDoSomethingProgress iDoSomethingProgress);

    void cancelAllDownloads(IDoSomethingProgress iDoSomethingProgress);

    void cancelDownloadSingleTrack(long j);

    void cancelDownloadTracksInAlbum(long j, IDoSomethingProgress iDoSomethingProgress);

    void changeSavePath(String str);

    void changeSavePathAndTransfer(String str, ITransferFileProgress iTransferFileProgress);

    void clearAllDownloadedTracks(IDoSomethingProgress iDoSomethingProgress);

    void clearDownloadedAlbum(long j, IDoSomethingProgress iDoSomethingProgress);

    void clearDownloadedTrack(long j);

    void downloadSingleTrack(long j, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress);

    void downloadSingleTrack(long j, boolean z, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress);

    void downloadTracks(List<Long> list, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress);

    void downloadTracks(List<Long> list, boolean z, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress);

    Map<Long, DownloadState> getAllDownloadStatus();

    List<XmDownloadAlbum> getDownloadAlbums(boolean z);

    Track getDownloadInfo(long j, boolean z);

    List<XmDownloadAlbumHaveTracks> getDownloadListByAlbum(boolean z);

    int getDownloadTrackCount(boolean z);

    List<Track> getDownloadTrackInAlbum(long j, boolean z);

    List<Track> getDownloadTracks(boolean z);

    String getHumanReadableDownloadOccupation(@DownloadSizePrecision int i);

    DownloadState getSingleTrackDownloadStatus(long j);

    Map<Long, DownloadState> getTracksInAlbumDownloadStatus(long j);

    boolean haveDowningTask();

    void pauseAllDownloads(IDoSomethingProgress iDoSomethingProgress);

    void pauseDownloadSingleTrack(long j);

    void pauseDownloadTracksInAlbum(long j, IDoSomethingProgress iDoSomethingProgress);

    void release();

    void resumeAllDownloads(IDoSomethingProgress iDoSomethingProgress);

    void resumeDownloadSingleTrack(long j);

    void resumeDownloadTracksInAlbum(long j, IDoSomethingProgress iDoSomethingProgress);

    void setAddDownloadProgressListener(IDoSomethingProgress iDoSomethingProgress);

    void setHttpConfig(Config config);

    void swapDownloadedPosition(Map<Long, Integer> map, IDoSomethingProgress iDoSomethingProgress);
}
