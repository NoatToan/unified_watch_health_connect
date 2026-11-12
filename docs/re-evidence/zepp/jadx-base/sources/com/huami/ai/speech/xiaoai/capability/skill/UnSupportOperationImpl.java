package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.skill.UnSupportOperation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/UnSupportOperationImpl;", "Lcom/huami/ai/skill/UnSupportOperation;", "", "doUnSupport", "Lcom/huami/ai/notify/EngineExceptionNotify;", "a", "Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "<init>", "(Lcom/huami/ai/notify/EngineExceptionNotify;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class UnSupportOperationImpl implements UnSupportOperation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EngineExceptionNotify engineExceptionNotify;

    public UnSupportOperationImpl(@NotNull EngineExceptionNotify engineExceptionNotify) {
        this.engineExceptionNotify = engineExceptionNotify;
    }

    @Override // com.huami.ai.skill.UnSupportOperation
    public void doUnSupport() {
        this.engineExceptionNotify.engineException(17);
    }
}
