package com.huami.snore.core.util;

import com.huami.snore.core.domain.RecorderConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/huami/snore/core/util/RecorderUtil;", "", "Lcom/huami/snore/core/domain/RecorderConfig;", "config", "", "getWindowByteSize", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderUtil {

    @NotNull
    public static final RecorderUtil INSTANCE = new RecorderUtil();

    private RecorderUtil() {
    }

    public final int getWindowByteSize(@Nullable RecorderConfig config) {
        if (config == null) {
            return 0;
        }
        return (int) ((((((double) config.getSampleRate()) * config.getWindowLen()) * ((double) config.getBitsPerSample())) / ((double) 8)) * ((double) config.getChannels()));
    }
}
