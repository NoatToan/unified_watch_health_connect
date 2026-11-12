package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class Microphone {

    @NamespaceName(name = "TurnOff", namespace = "Microphone")
    public static class TurnOff implements InstructionPayload {
        private Optional<Integer> duration = Optional.a();

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public TurnOff setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "TurnOn", namespace = "Microphone")
    public static class TurnOn implements InstructionPayload {
    }
}
