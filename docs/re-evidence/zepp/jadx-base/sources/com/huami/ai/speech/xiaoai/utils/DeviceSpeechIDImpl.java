package com.huami.ai.speech.xiaoai.utils;

import com.huami.ai.helper.DeviceSpeechID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/speech/xiaoai/utils/DeviceSpeechIDImpl;", "Lcom/huami/ai/helper/DeviceSpeechID;", "", "getId", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "autoIncrementID", "<init>", "()V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceSpeechIDImpl implements DeviceSpeechID {
    private static final int b = 255;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AtomicInteger autoIncrementID = new AtomicInteger(0);

    @Override // com.huami.ai.helper.DeviceSpeechID
    public int getId() {
        if (this.autoIncrementID.get() <= 255) {
            return this.autoIncrementID.getAndIncrement();
        }
        this.autoIncrementID.set(0);
        return 0;
    }
}
