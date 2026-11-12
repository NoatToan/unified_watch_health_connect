package com.huami.devicerecorder.adapter;

import com.huami.devicerecorder.model.PlayItemData;
import com.huami.devicerecorder.player.IRecorderPlayer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/huami/devicerecorder/adapter/IItemClickListener;", "", "", "position", "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "", "onShareClick", "onDeleteClick", "onPlayInvalidFile", "onPlayFileNotFound", "Lcom/huami/devicerecorder/player/IRecorderPlayer$IPlayerCallback;", "callback", "registerPlayerCallback", "unRegisterPlayerCallback", "", "select", "onSelected", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IItemClickListener {
    void onDeleteClick(int position, @Nullable PlayItemData itemData);

    void onPlayFileNotFound(int position, @NotNull PlayItemData itemData);

    void onPlayInvalidFile(int position, @NotNull PlayItemData itemData);

    void onSelected(int position, @Nullable PlayItemData itemData, boolean select);

    void onShareClick(int position, @Nullable PlayItemData itemData);

    void registerPlayerCallback(@NotNull IRecorderPlayer.IPlayerCallback callback);

    void unRegisterPlayerCallback(@NotNull IRecorderPlayer.IPlayerCallback callback);
}
