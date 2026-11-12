package com.huami.watchfacesstore.device.process;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "", "originPath", "process", "", "originSize", "finalSize", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IDialProcessor {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static long finalSize(@NotNull IDialProcessor iDialProcessor) {
            return 0L;
        }

        public static long originSize(@NotNull IDialProcessor iDialProcessor) {
            return 0L;
        }
    }

    long finalSize();

    long originSize();

    @NotNull
    String process(@NotNull String originPath);
}
