package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import defpackage.c4h;

/* JADX INFO: loaded from: classes6.dex */
public class CustomDirective {

    @NamespaceName(name = "ExecuteDeviceSkill", namespace = AIApiConstants.CustomDirective.NAME)
    public static class ExecuteDeviceSkill implements InstructionPayload {

        @Required
        private c4h directive;

        public ExecuteDeviceSkill() {
        }

        public ExecuteDeviceSkill(c4h c4hVar) {
            this.directive = c4hVar;
        }

        @Required
        public c4h getDirective() {
            return this.directive;
        }

        @Required
        public ExecuteDeviceSkill setDirective(c4h c4hVar) {
            this.directive = c4hVar;
            return this;
        }
    }
}
