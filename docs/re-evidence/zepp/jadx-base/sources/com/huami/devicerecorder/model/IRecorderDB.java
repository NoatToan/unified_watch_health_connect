package com.huami.devicerecorder.model;

import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/devicerecorder/model/IRecorderDB;", "", "Lcom/huami/devicerecorder/model/RecordFile;", "recorderFile", "", Constant.METHOD_INSERT, "", "recorderFiles", "delete", "queryAll", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IRecorderDB {
    void delete(@NotNull RecordFile recorderFile);

    void delete(@NotNull List<RecordFile> recorderFiles);

    void insert(@NotNull RecordFile recorderFile);

    void insert(@NotNull List<RecordFile> recorderFiles);

    @NotNull
    List<RecordFile> queryAll();
}
