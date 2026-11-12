package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
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
        private Optional<ExploreCardStyleType> explore_card_style_type = Optional.a();

        public Optional<ExploreCardStyleType> getExploreCardStyleType() {
            return this.explore_card_style_type;
        }

        public ExploreCardParam setExploreCardStyleType(ExploreCardStyleType exploreCardStyleType) {
            this.explore_card_style_type = Optional.e(exploreCardStyleType);
            return this;
        }
    }

    public enum ExploreCardStyleType {
        UNKNOWN(-1),
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

    @NamespaceName(name = "State", namespace = AIApiConstants.Experiments.NAME)
    public static class State implements ContextPayload {
        private Optional<String> group = Optional.a();
        private Optional<String> video_group = Optional.a();

        public Optional<String> getGroup() {
            return this.group;
        }

        public Optional<String> getVideoGroup() {
            return this.video_group;
        }

        public State setGroup(String str) {
            this.group = Optional.e(str);
            return this;
        }

        public State setVideoGroup(String str) {
            this.video_group = Optional.e(str);
            return this;
        }
    }
}
