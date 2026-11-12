package com.huami.devicerecorder;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicerecorder.model.RecordFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/devicerecorder/IRecorderDevice;", "", "", "Lcom/huami/devicerecorder/model/RecordFile;", "getRecorderFiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/devicerecorder/IRecorderDevice$IDeviceStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerStatusListener", "unregisterStatusListener", "IDeviceStatusListener", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IRecorderDevice {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/devicerecorder/IRecorderDevice$IDeviceStatusListener;", "", "", "onDeviceConnected", "onDeviceDisconnected", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public interface IDeviceStatusListener {
        void onDeviceConnected();

        void onDeviceDisconnected();
    }

    @Nullable
    Object getRecorderFiles(@NotNull Continuation<? super List<RecordFile>> continuation);

    void registerStatusListener(@NotNull IDeviceStatusListener listener);

    void unregisterStatusListener(@NotNull IDeviceStatusListener listener);
}
