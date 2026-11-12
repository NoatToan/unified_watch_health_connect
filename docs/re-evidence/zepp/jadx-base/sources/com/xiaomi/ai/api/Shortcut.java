package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class Shortcut {

    @NamespaceName(name = "GetCoverInfo", namespace = AIApiConstants.Shortcut.NAME)
    public static class GetCoverInfo implements EventPayload {

        @Required
        private String id;
        private Optional<ObjectNode> param = Optional.empty();

        public GetCoverInfo() {
        }

        public GetCoverInfo(String str) {
            this.id = str;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<ObjectNode> getParam() {
            return this.param;
        }

        @Required
        public GetCoverInfo setId(String str) {
            this.id = str;
            return this;
        }

        public GetCoverInfo setParam(ObjectNode objectNode) {
            this.param = Optional.ofNullable(objectNode);
            return this;
        }
    }

    @NamespaceName(name = "Skill", namespace = AIApiConstants.Shortcut.NAME)
    public static class Skill implements ContextPayload {

        @Required
        private String id;
        private Optional<ArrayNode> params = Optional.empty();

        public Skill() {
        }

        public Skill(String str) {
            this.id = str;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<ArrayNode> getParams() {
            return this.params;
        }

        @Required
        public Skill setId(String str) {
            this.id = str;
            return this;
        }

        public Skill setParams(ArrayNode arrayNode) {
            this.params = Optional.ofNullable(arrayNode);
            return this;
        }
    }
}
