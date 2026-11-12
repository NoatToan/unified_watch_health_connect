package com.xiaomi.ai.api.local;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.zsd;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class General {

    @NamespaceName(name = "DataTemplate", namespace = "Internal")
    public static class DataTemplate implements InstructionPayload {

        @Required
        private zsd data;

        @Required
        private String type;

        @Required
        public zsd getData() {
            return this.data;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public DataTemplate setData(zsd zsdVar) {
            this.data = zsdVar;
            return this;
        }

        @Required
        public DataTemplate setType(String str) {
            this.type = str;
            return this;
        }
    }

    @NamespaceName(name = "GeneralChangeHMI", namespace = "Internal")
    public static class GeneralChangeHMI implements EventPayload {

        @Required
        private String packageName;

        @Required
        public String getPackageName() {
            return this.packageName;
        }

        @Required
        public GeneralChangeHMI setPackageName(String str) {
            this.packageName = str;
            return this;
        }
    }

    @NamespaceName(name = "GeneralCloseApp", namespace = "Internal")
    public static class GeneralCloseApp implements EventPayload {

        @Required
        private String packageName;

        @Required
        public String getPackageName() {
            return this.packageName;
        }

        @Required
        public GeneralCloseApp setPackageName(String str) {
            this.packageName = str;
            return this;
        }
    }

    @NamespaceName(name = "GeneralCloseHMI", namespace = "Internal")
    public static class GeneralCloseHMI implements EventPayload {

        @Required
        private String packageName;

        @Required
        public String getPackageName() {
            return this.packageName;
        }

        @Required
        public GeneralCloseHMI setPackageName(String str) {
            this.packageName = str;
            return this;
        }
    }

    @NamespaceName(name = "GeneralLocalInstructions", namespace = "Internal")
    public static class GeneralLocalInstructions implements EventPayload {

        @Required
        private List<Instruction<? extends InstructionPayload>> instructions;

        @Required
        public List<Instruction<? extends InstructionPayload>> getInstructions() {
            return this.instructions;
        }

        @Required
        public GeneralLocalInstructions setInstructions(List<Instruction<? extends InstructionPayload>> list) {
            this.instructions = list;
            return this;
        }
    }

    @NamespaceName(name = "GeneralSelectItem", namespace = "Internal")
    public static class GeneralSelectItem implements EventPayload {

        @Required
        private Integer index;
        private Optional<String> itemId;

        @Required
        private String packageName;
        private Optional<String> type;

        @Required
        public Integer getIndex() {
            return this.index;
        }

        public Optional<String> getItemId() {
            return this.itemId;
        }

        @Required
        public String getPackageName() {
            return this.packageName;
        }

        public Optional<String> getType() {
            return this.type;
        }

        @Required
        public GeneralSelectItem setIndex(Integer num) {
            this.index = num;
            return this;
        }

        public GeneralSelectItem setItemId(Optional<String> optional) {
            this.itemId = optional;
            return this;
        }

        @Required
        public GeneralSelectItem setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        public GeneralSelectItem setType(Optional<String> optional) {
            this.type = optional;
            return this;
        }
    }

    @NamespaceName(name = "PathJumpEvent", namespace = "Internal")
    public static class PathJumpEvent implements EventPayload {
        private Optional<String> identifier = Optional.a();

        @Required
        private String localSkillName;
        private Optional<String> pkgName;

        @Required
        private String uri;

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        public String getLocalSkillName() {
            return this.localSkillName;
        }

        public Optional<String> getPkgName() {
            return this.pkgName;
        }

        public String getUri() {
            return this.uri;
        }

        public void setIdentifier(Optional<String> optional) {
            this.identifier = optional;
        }

        public PathJumpEvent setLocalSkillName(String str) {
            this.localSkillName = str;
            return this;
        }

        public PathJumpEvent setPkgName(Optional<String> optional) {
            this.pkgName = optional;
            return this;
        }

        public PathJumpEvent setUri(String str) {
            this.uri = str;
            return this;
        }
    }
}
