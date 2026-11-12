package com.huami.ai.speech.xiaoai.capability.instruction.entity;

import com.huami.watch.companion.xiaomiai.VoiceProtocol;
import com.xiaomi.ai.api.common.InstructionPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/entity/CombineAnswer;", "", "<init>", "()V", "Companion", "CombineAnswerPayload", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class CombineAnswer {

    @NotNull
    public static final String NAME_SPACE = "CombineAnswer";

    @NotNull
    public static final String PAYLOAD_NAME = "AnswerText";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/entity/CombineAnswer$CombineAnswerPayload;", "Lcom/xiaomi/ai/api/common/InstructionPayload;", "", "component1", VoiceProtocol.ANSWER, "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getAnswer", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class CombineAnswerPayload implements InstructionPayload {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String answer;

        public CombineAnswerPayload(@NotNull String str) {
            this.answer = str;
        }

        public static /* synthetic */ CombineAnswerPayload copy$default(CombineAnswerPayload combineAnswerPayload, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = combineAnswerPayload.answer;
            }
            return combineAnswerPayload.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        @NotNull
        public final CombineAnswerPayload copy(@NotNull String answer) {
            return new CombineAnswerPayload(answer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CombineAnswerPayload) && Intrinsics.areEqual(this.answer, ((CombineAnswerPayload) other).answer);
        }

        @NotNull
        public final String getAnswer() {
            return this.answer;
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        @NotNull
        public String toString() {
            return "CombineAnswerPayload(answer=" + this.answer + ')';
        }
    }
}
