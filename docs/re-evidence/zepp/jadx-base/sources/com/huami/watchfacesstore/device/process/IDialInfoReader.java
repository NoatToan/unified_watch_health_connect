package com.huami.watchfacesstore.device.process;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "", "", "path", "", "", "readDialInfo", "(Ljava/lang/String;)[Ljava/lang/Long;", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IDialInfoReader {
    @NotNull
    Long[] readDialInfo(@NotNull String path);
}
