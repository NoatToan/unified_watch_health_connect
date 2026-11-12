package com.huami.devicerecorder;

import com.huami.devicerecorder.model.IRecorderDB;
import com.huami.watch.musicupload.viewmodel.IWifiFtpDevice;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lcom/huami/devicerecorder/IContentProvider;", "", "", PointCategory.INIT, "Lcom/huami/devicerecorder/model/IRecorderDB;", "getRecorderDB", "Lcom/huami/devicerecorder/IRecorderDevice;", "getRecorderDevice", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "getWifiFtpDevice", "Lcom/huami/devicerecorder/IRecorderDecoder;", "getRecorderDecoder", "", "getLocalRecorderSaveFolder", "deInit", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IContentProvider {
    void deInit();

    @NotNull
    String getLocalRecorderSaveFolder();

    @NotNull
    IRecorderDB getRecorderDB();

    @NotNull
    IRecorderDecoder getRecorderDecoder();

    @NotNull
    IRecorderDevice getRecorderDevice();

    @NotNull
    IWifiFtpDevice getWifiFtpDevice();

    void init();
}
