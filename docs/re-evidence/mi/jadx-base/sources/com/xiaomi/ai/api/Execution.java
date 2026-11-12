package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.mj1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Execution {

    @NamespaceName(name = "CheckIsInRequest", namespace = AIApiConstants.Execution.NAME)
    public static class CheckIsInRequest implements InstructionPayload {

        @Required
        private String request_id;

        public CheckIsInRequest() {
        }

        public CheckIsInRequest(String str) {
            this.request_id = str;
        }

        @Required
        public String getRequestId() {
            return this.request_id;
        }

        @Required
        public CheckIsInRequest setRequestId(String str) {
            this.request_id = str;
            return this;
        }
    }

    @NamespaceName(name = "CrossDeviceControl", namespace = AIApiConstants.Execution.NAME)
    public static class CrossDeviceControl implements InstructionPayload {
        private Optional<String> query = Optional.a();
        private Optional<mj1> instructions = Optional.a();
        private Optional<String> device_id = Optional.a();
        private Optional<String> guiding_tts = Optional.a();
        private Optional<String> guiding_url = Optional.a();
        private Optional<String> native_device_id = Optional.a();

        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getGuidingTts() {
            return this.guiding_tts;
        }

        public Optional<String> getGuidingUrl() {
            return this.guiding_url;
        }

        public Optional<mj1> getInstructions() {
            return this.instructions;
        }

        public Optional<String> getNativeDeviceId() {
            return this.native_device_id;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public CrossDeviceControl setDeviceId(String str) {
            this.device_id = Optional.e(str);
            return this;
        }

        public CrossDeviceControl setGuidingTts(String str) {
            this.guiding_tts = Optional.e(str);
            return this;
        }

        public CrossDeviceControl setGuidingUrl(String str) {
            this.guiding_url = Optional.e(str);
            return this;
        }

        public CrossDeviceControl setInstructions(mj1 mj1Var) {
            this.instructions = Optional.e(mj1Var);
            return this;
        }

        public CrossDeviceControl setNativeDeviceId(String str) {
            this.native_device_id = Optional.e(str);
            return this;
        }

        public CrossDeviceControl setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "CrossDeviceControlPhone", namespace = AIApiConstants.Execution.NAME)
    public static class CrossDeviceControlPhone implements InstructionPayload {
        private Optional<String> query = Optional.a();
        private Optional<mj1> instructions = Optional.a();
        private Optional<String> device_id = Optional.a();
        private Optional<String> guiding_tts = Optional.a();
        private Optional<String> guiding_url = Optional.a();

        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getGuidingTts() {
            return this.guiding_tts;
        }

        public Optional<String> getGuidingUrl() {
            return this.guiding_url;
        }

        public Optional<mj1> getInstructions() {
            return this.instructions;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public CrossDeviceControlPhone setDeviceId(String str) {
            this.device_id = Optional.e(str);
            return this;
        }

        public CrossDeviceControlPhone setGuidingTts(String str) {
            this.guiding_tts = Optional.e(str);
            return this;
        }

        public CrossDeviceControlPhone setGuidingUrl(String str) {
            this.guiding_url = Optional.e(str);
            return this;
        }

        public CrossDeviceControlPhone setInstructions(mj1 mj1Var) {
            this.instructions = Optional.e(mj1Var);
            return this;
        }

        public CrossDeviceControlPhone setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "Group", namespace = AIApiConstants.Execution.NAME)
    public static class Group implements InstructionPayload {

        @Required
        private GroupCategory category;

        @Required
        private List<String> ids;

        public Group() {
        }

        public Group(List<String> list, GroupCategory groupCategory) {
            this.ids = list;
            this.category = groupCategory;
        }

        @Required
        public GroupCategory getCategory() {
            return this.category;
        }

        @Required
        public List<String> getIds() {
            return this.ids;
        }

        @Required
        public Group setCategory(GroupCategory groupCategory) {
            this.category = groupCategory;
            return this;
        }

        @Required
        public Group setIds(List<String> list) {
            this.ids = list;
            return this;
        }
    }

    public enum GroupCategory {
        UNKNOWN(-1),
        CONCURRENT(0);

        private int id;

        GroupCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InstructionBehavior {
        UNKNOWN(-1),
        CONCURRENT(0),
        WAIT_PREVIOUS_FINISH(1),
        REPLACE_ALL(2),
        INSERT_FRONT(3);

        private int id;

        InstructionBehavior(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "InstructionControl", namespace = AIApiConstants.Execution.NAME)
    public static class InstructionControl implements InstructionPayload {

        @Required
        private InstructionBehavior behavior;

        public InstructionControl() {
        }

        public InstructionControl(InstructionBehavior instructionBehavior) {
            this.behavior = instructionBehavior;
        }

        @Required
        public InstructionBehavior getBehavior() {
            return this.behavior;
        }

        @Required
        public InstructionControl setBehavior(InstructionBehavior instructionBehavior) {
            this.behavior = instructionBehavior;
            return this;
        }
    }

    public enum ProcessFlag {
        UNKNOWN(-1),
        PROVIDER(0),
        RESULT(1);

        private int id;

        ProcessFlag(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RequestControl", namespace = AIApiConstants.Execution.NAME)
    public static class RequestControl implements ContextPayload {

        @Required
        private List<RequestControlType> disabled;

        public RequestControl() {
        }

        public RequestControl(List<RequestControlType> list) {
            this.disabled = list;
        }

        @Required
        public List<RequestControlType> getDisabled() {
            return this.disabled;
        }

        @Required
        public RequestControl setDisabled(List<RequestControlType> list) {
            this.disabled = list;
            return this;
        }
    }

    public enum RequestControlType {
        UNKNOWN(-1),
        NLP(0),
        TTS(1),
        TTS_STREAM(2);

        private int id;

        RequestControlType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetMultiInstructionMode", namespace = AIApiConstants.Execution.NAME)
    public static class SetMultiInstructionMode implements InstructionPayload {
    }
}
