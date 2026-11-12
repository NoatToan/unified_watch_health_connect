package com.huami.watch.musicupload.viewmodel;

import com.huami.watch.musicupload.adapter.FileInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable;", "", "Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable$IUploadObserver;", "observer", "", "registerObserver", "unRegisterObserver", "IUploadObserver", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IMusicUploadObservable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/IMusicUploadObservable$IUploadObserver;", "", "", "progress", "", "onProgressChanged", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "", "needNotifyAbout", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public interface IUploadObserver {
        boolean needNotifyAbout(@NotNull FileInfo fileInfo);

        void onProgressChanged(int progress);
    }

    void registerObserver(@NotNull IUploadObserver observer);

    void unRegisterObserver(@NotNull IUploadObserver observer);
}
