package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Personalize {

    @NamespaceName(name = "Execute", namespace = AIApiConstants.Personalize.NAME)
    public static class Execute implements InstructionPayload {

        @Required
        private List<PersonalCmd> cmds;

        public Execute() {
        }

        public Execute(List<PersonalCmd> list) {
            this.cmds = list;
        }

        @Required
        public List<PersonalCmd> getCmds() {
            return this.cmds;
        }

        @Required
        public Execute setCmds(List<PersonalCmd> list) {
            this.cmds = list;
            return this;
        }
    }

    public static class PersonalCmd {

        @Required
        private String cmd;
        private Optional<Long> duration = Optional.a();

        @Required
        private String type;

        public PersonalCmd() {
        }

        @Required
        public String getCmd() {
            return this.cmd;
        }

        public Optional<Long> getDuration() {
            return this.duration;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public PersonalCmd setCmd(String str) {
            this.cmd = str;
            return this;
        }

        public PersonalCmd setDuration(long j) {
            this.duration = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public PersonalCmd setType(String str) {
            this.type = str;
            return this;
        }

        public PersonalCmd(String str, String str2) {
            this.cmd = str;
            this.type = str2;
        }
    }
}
