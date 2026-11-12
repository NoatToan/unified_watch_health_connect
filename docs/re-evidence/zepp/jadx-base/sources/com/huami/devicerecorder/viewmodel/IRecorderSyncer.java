package com.huami.devicerecorder.viewmodel;

import com.huami.devicerecorder.model.RecordFile;
import com.huami.devicerecorder.model.SyncItemData;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer$ISyncerCallback;", "callback", "", "registerCallback", "unRegisterCallback", "Lcom/huami/devicerecorder/model/SyncItemData;", "data", g.g, "ISyncerCallback", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IRecorderSyncer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer$ISyncerCallback;", "", "", "progress", "", "onProgressChanged", "Lcom/huami/devicerecorder/model/RecordFile;", "recordFile", "", "needNotifyAbout", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public interface ISyncerCallback {
        boolean needNotifyAbout(@NotNull RecordFile recordFile);

        void onProgressChanged(int progress);
    }

    void cancel(@NotNull SyncItemData data);

    void registerCallback(@NotNull ISyncerCallback callback);

    void unRegisterCallback(@NotNull ISyncerCallback callback);
}
