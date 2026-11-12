package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;

/* JADX INFO: loaded from: classes18.dex */
public class CustomDirective {

    @NamespaceName(name = "ExecuteDeviceSkill", namespace = AIApiConstants.CustomDirective.NAME)
    public static class ExecuteDeviceSkill implements InstructionPayload {

        @Required
        private ObjectNode directive;

        public ExecuteDeviceSkill() {
        }

        public ExecuteDeviceSkill(ObjectNode objectNode) {
            this.directive = objectNode;
        }

        @Required
        public ObjectNode getDirective() {
            return this.directive;
        }

        @Required
        public ExecuteDeviceSkill setDirective(ObjectNode objectNode) {
            this.directive = objectNode;
            return this;
        }
    }
}
