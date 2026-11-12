package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class InputController {

    public enum InputType {
        HDMI(0),
        AV(1),
        DTMB(2),
        TV(3);

        private int id;

        InputType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SelectInput", namespace = AIApiConstants.InputController.NAME)
    public static class SelectInput implements InstructionPayload {
        private Optional<Integer> index = Optional.empty();

        @Required
        private InputType input;

        public SelectInput() {
        }

        public SelectInput(InputType inputType) {
            this.input = inputType;
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        @Required
        public InputType getInput() {
            return this.input;
        }

        public SelectInput setIndex(int i) {
            this.index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public SelectInput setInput(InputType inputType) {
            this.input = inputType;
            return this;
        }
    }
}
