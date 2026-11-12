package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.mj1;

/* JADX INFO: loaded from: classes6.dex */
public class Shortcut {

    @NamespaceName(name = "GetCoverInfo", namespace = "Shortcut")
    public static class GetCoverInfo implements EventPayload {

        @Required
        private String id;
        private Optional<c4h> param = Optional.a();

        public GetCoverInfo() {
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<c4h> getParam() {
            return this.param;
        }

        @Required
        public GetCoverInfo setId(String str) {
            this.id = str;
            return this;
        }

        public GetCoverInfo setParam(c4h c4hVar) {
            this.param = Optional.e(c4hVar);
            return this;
        }

        public GetCoverInfo(String str) {
            this.id = str;
        }
    }

    @NamespaceName(name = "Skill", namespace = "Shortcut")
    public static class Skill implements ContextPayload {

        @Required
        private String id;
        private Optional<mj1> params = Optional.a();

        public Skill() {
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<mj1> getParams() {
            return this.params;
        }

        @Required
        public Skill setId(String str) {
            this.id = str;
            return this;
        }

        public Skill setParams(mj1 mj1Var) {
            this.params = Optional.e(mj1Var);
            return this;
        }

        public Skill(String str) {
            this.id = str;
        }
    }
}
