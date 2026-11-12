package com.huami.devicerecorder.repository;

import com.huami.devicerecorder.IRecorderDevice;
import com.huami.devicerecorder.model.RecordFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/devicerecorder/repository/DeviceRecordRepo;", "", "", "Lcom/huami/devicerecorder/model/RecordFile;", "getAllDeviceRecords", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/devicerecorder/IRecorderDevice;", "a", "Lcom/huami/devicerecorder/IRecorderDevice;", "device", "<init>", "(Lcom/huami/devicerecorder/IRecorderDevice;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceRecordRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRecorderDevice device;

    public DeviceRecordRepo(@NotNull IRecorderDevice iRecorderDevice) {
        this.device = iRecorderDevice;
    }

    @Nullable
    public final Object getAllDeviceRecords(@NotNull Continuation<? super List<RecordFile>> continuation) {
        return this.device.getRecorderFiles(continuation);
    }
}
