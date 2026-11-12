package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class Selector {

    @NamespaceName(name = "Select", namespace = AIApiConstants.Selector.NAME)
    public static class Select implements InstructionPayload {
        private Optional<Integer> index = Optional.a();

        @Deprecated
        private Optional<String> name = Optional.a();
        private Optional<SelectTarget> target = Optional.a();
        private Optional<String> poi_id = Optional.a();

        public Optional<Integer> getIndex() {
            return this.index;
        }

        @Deprecated
        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPoiId() {
            return this.poi_id;
        }

        public Optional<SelectTarget> getTarget() {
            return this.target;
        }

        public Select setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Deprecated
        public Select setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public Select setPoiId(String str) {
            this.poi_id = Optional.e(str);
            return this;
        }

        public Select setTarget(SelectTarget selectTarget) {
            this.target = Optional.e(selectTarget);
            return this;
        }
    }

    public enum SelectTarget {
        UNKNOWN(-1),
        MAP_NAVIGATION_LIST(0),
        PARKING_SPACE(1),
        MUSIC_PLAY_LIST(2),
        TEMPLATE_APPLICATION_LIST(3);

        private int id;

        SelectTarget(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
