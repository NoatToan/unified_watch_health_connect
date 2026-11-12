package com.huami.devicerecorder.player;

import android.content.res.AssetFileDescriptor;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u0013\u0010\n\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0016\u001a\u00020\u0014H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/huami/devicerecorder/player/IPlayer;", "", "", "path", "", "play", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/res/AssetFileDescriptor;", "fileDesc", "(Landroid/content/res/AssetFileDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pause", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Command.RESUME, "", "position", "setPosition", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", Command.STOP, "Lcom/huami/devicerecorder/player/IPlayer$IPlayerCallback;", "callback", "", "setCallback", "release", "IPlayerCallback", "PlayerStatus", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IPlayer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/huami/devicerecorder/player/IPlayer$IPlayerCallback;", "", "", "position", "duration", "", "onPositionChanged", "Lcom/huami/devicerecorder/player/IPlayer$PlayerStatus;", "status", "onStatusChanged", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public interface IPlayerCallback {
        void onPositionChanged(int position, int duration);

        void onStatusChanged(@NotNull PlayerStatus status);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/devicerecorder/player/IPlayer$PlayerStatus;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_COMPLETE", "STATUS_FILE_NOT_EXIST", "STATUS_ERROR", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public enum PlayerStatus {
        STATUS_COMPLETE,
        STATUS_FILE_NOT_EXIST,
        STATUS_ERROR
    }

    @Nullable
    Object pause(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object play(@NotNull AssetFileDescriptor assetFileDescriptor, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object play(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    void release();

    @Nullable
    Object resume(@NotNull Continuation<? super Boolean> continuation);

    void setCallback(@NotNull IPlayerCallback callback);

    @Nullable
    Object setPosition(int i, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object stop(@NotNull Continuation<? super Boolean> continuation);
}
