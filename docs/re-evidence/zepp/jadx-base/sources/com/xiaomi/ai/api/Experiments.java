package com.xiaomi.ai.api;

import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class Experiments {

    public enum ExperimentType {
        UNKNOWN(-1),
        EXPLORE_CARD(0);

        private int id;

        ExperimentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ExploreCardParam {
        private Optional<ExploreCardStyleType> explore_card_style_type = Optional.empty();

        public Optional<ExploreCardStyleType> getExploreCardStyleType() {
            return this.explore_card_style_type;
        }

        public ExploreCardParam setExploreCardStyleType(ExploreCardStyleType exploreCardStyleType) {
            this.explore_card_style_type = Optional.ofNullable(exploreCardStyleType);
            return this;
        }
    }

    public enum ExploreCardStyleType {
        GENERAL(0),
        EXP_A(1),
        EXP_B(2),
        EXP_C(3);

        private int id;

        ExploreCardStyleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
