package com.huami.ai.speech.xiaoai.event;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.EventPayload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/event/UploadEvent;", "", "Lcom/xiaomi/ai/api/common/EventPayload;", "eventPayload", "", "uploadEvent", "Lcom/xiaomi/ai/android/core/Engine;", "a", "Lcom/xiaomi/ai/android/core/Engine;", "engine", "<init>", "(Lcom/xiaomi/ai/android/core/Engine;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public abstract class UploadEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Engine engine;

    public UploadEvent(@NotNull Engine engine) {
        this.engine = engine;
    }

    public final boolean uploadEvent(@NotNull EventPayload eventPayload) {
        return this.engine.postEvent(APIUtils.buildEvent(eventPayload));
    }
}
