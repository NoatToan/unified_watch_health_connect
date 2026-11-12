package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class Selector {

    @NamespaceName(name = "Select", namespace = AIApiConstants.Selector.NAME)
    public static class Select implements InstructionPayload {
        private Optional<Integer> index = Optional.empty();

        @Deprecated
        private Optional<String> name = Optional.empty();
        private Optional<SelectTarget> target = Optional.empty();

        public Optional<Integer> getIndex() {
            return this.index;
        }

        @Deprecated
        public Optional<String> getName() {
            return this.name;
        }

        public Optional<SelectTarget> getTarget() {
            return this.target;
        }

        public Select setIndex(int i) {
            this.index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Deprecated
        public Select setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public Select setTarget(SelectTarget selectTarget) {
            this.target = Optional.ofNullable(selectTarget);
            return this;
        }
    }

    public enum SelectTarget {
        UNKNOWN(-1),
        MAP_NAVIGATION_LIST(0);

        private int id;

        SelectTarget(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
