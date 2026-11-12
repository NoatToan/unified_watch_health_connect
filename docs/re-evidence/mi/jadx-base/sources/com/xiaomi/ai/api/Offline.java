package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class Offline {

    @NamespaceName(name = "CloudStop", namespace = AIApiConstants.Offline.NAME)
    public static class CloudStop implements InstructionPayload {
        private Optional<String> next_round_rid = Optional.a();
        private Optional<Integer> stop_audio_duration = Optional.a();

        public Optional<String> getNextRoundRid() {
            return this.next_round_rid;
        }

        public Optional<Integer> getStopAudioDuration() {
            return this.stop_audio_duration;
        }

        public CloudStop setNextRoundRid(String str) {
            this.next_round_rid = Optional.e(str);
            return this;
        }

        public CloudStop setStopAudioDuration(int i) {
            this.stop_audio_duration = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.EmptyQuery.NAME, namespace = AIApiConstants.Offline.NAME)
    public static class EmptyQuery implements InstructionPayload {
        private Optional<Boolean> is_need_empty_query = Optional.a();

        public Optional<Boolean> isNeedEmptyQuery() {
            return this.is_need_empty_query;
        }

        public EmptyQuery setIsNeedEmptyQuery(boolean z) {
            this.is_need_empty_query = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }
}
