package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class Dialog {

    @NamespaceName(name = "CacheInstructions", namespace = AIApiConstants.Dialog.NAME)
    public static class CacheInstructions implements InstructionPayload {

        @Required
        private int duration_in_ms;

        public CacheInstructions() {
        }

        public CacheInstructions(int i) {
            this.duration_in_ms = i;
        }

        @Required
        public int getDurationInMs() {
            return this.duration_in_ms;
        }

        @Required
        public CacheInstructions setDurationInMs(int i) {
            this.duration_in_ms = i;
            return this;
        }
    }

    public enum DialogRejectType {
        UNKNOWN(-1),
        NON_HUMAN(0),
        NO_NEED_RESPONSE(1),
        UNCLEAR(2);

        private int id;

        DialogRejectType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "DialogState", namespace = AIApiConstants.Dialog.NAME)
    public static class DialogState implements ContextPayload {
        private Optional<Boolean> continuous_dialog = Optional.a();
        private Optional<Boolean> is_interruptable = Optional.a();
        private Optional<Scene.SceneType> scene = Optional.a();
        private Optional<Integer> wait_in_seconds = Optional.a();

        public Optional<Scene.SceneType> getScene() {
            return this.scene;
        }

        public Optional<Integer> getWaitInSeconds() {
            return this.wait_in_seconds;
        }

        public Optional<Boolean> isContinuousDialog() {
            return this.continuous_dialog;
        }

        public Optional<Boolean> isInterruptable() {
            return this.is_interruptable;
        }

        public DialogState setContinuousDialog(boolean z) {
            this.continuous_dialog = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DialogState setIsInterruptable(boolean z) {
            this.is_interruptable = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DialogState setScene(Scene.SceneType sceneType) {
            this.scene = Optional.e(sceneType);
            return this;
        }

        public DialogState setWaitInSeconds(int i) {
            this.wait_in_seconds = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "EnterTemporaryContinuousDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class EnterTemporaryContinuousDialog implements InstructionPayload {
    }

    @NamespaceName(name = "ExitContinuousDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class ExitContinuousDialog implements InstructionPayload {
    }

    @NamespaceName(name = "ExitMultipleTurn", namespace = AIApiConstants.Dialog.NAME)
    public static class ExitMultipleTurn implements InstructionPayload {
        private Optional<String> message = Optional.a();

        public Optional<String> getMessage() {
            return this.message;
        }

        public ExitMultipleTurn setMessage(String str) {
            this.message = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "Finish", namespace = AIApiConstants.Dialog.NAME)
    public static class Finish implements InstructionPayload {
    }

    @NamespaceName(name = "InFullDuplexState", namespace = AIApiConstants.Dialog.NAME)
    public static class InFullDuplexState implements ContextPayload {
    }

    @NamespaceName(name = "JudgeFinish", namespace = AIApiConstants.Dialog.NAME)
    public static class JudgeFinish implements InstructionPayload {

        @Required
        private JudgeFinishType source;

        public JudgeFinish() {
        }

        public JudgeFinish(JudgeFinishType judgeFinishType) {
            this.source = judgeFinishType;
        }

        @Required
        public JudgeFinishType getSource() {
            return this.source;
        }

        @Required
        public JudgeFinish setSource(JudgeFinishType judgeFinishType) {
            this.source = judgeFinishType;
            return this;
        }
    }

    public enum JudgeFinishType {
        UNKNOWN(-1),
        NEARBY_AWAKE(0);

        private int id;

        JudgeFinishType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "KeyWordFreeResult", namespace = AIApiConstants.Dialog.NAME)
    public static class KeyWordFreeResult implements InstructionPayload {

        @Required
        private boolean is_passed;

        public KeyWordFreeResult() {
        }

        public KeyWordFreeResult(boolean z) {
            this.is_passed = z;
        }

        @Required
        public boolean isPassed() {
            return this.is_passed;
        }

        @Required
        public KeyWordFreeResult setIsPassed(boolean z) {
            this.is_passed = z;
            return this;
        }
    }

    @NamespaceName(name = "MultipleTurnInProgress", namespace = AIApiConstants.Dialog.NAME)
    public static class MultipleTurnInProgress implements InstructionPayload {

        @Required
        private String name;

        public MultipleTurnInProgress() {
        }

        public MultipleTurnInProgress(String str) {
            this.name = str;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public MultipleTurnInProgress setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "SingleTurnDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class SingleTurnDialog implements ContextPayload {
    }

    @NamespaceName(name = "TurnOffContinuousDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class TurnOffContinuousDialog implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOnContinuousDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class TurnOnContinuousDialog implements InstructionPayload {
    }

    @NamespaceName(name = "EnterThirdPartyLLMSkill", namespace = AIApiConstants.Dialog.NAME)
    public static class EnterThirdPartyLLMSkill implements EventPayload {
        private Optional<String> file_id = Optional.a();

        @Required
        private String skill_id;

        public EnterThirdPartyLLMSkill() {
        }

        public Optional<String> getFileId() {
            return this.file_id;
        }

        @Required
        public String getSkillId() {
            return this.skill_id;
        }

        public EnterThirdPartyLLMSkill setFileId(String str) {
            this.file_id = Optional.e(str);
            return this;
        }

        @Required
        public EnterThirdPartyLLMSkill setSkillId(String str) {
            this.skill_id = str;
            return this;
        }

        public EnterThirdPartyLLMSkill(String str) {
            this.skill_id = str;
        }
    }

    @NamespaceName(name = "Reject", namespace = AIApiConstants.Dialog.NAME)
    public static class Reject implements InstructionPayload {

        @Required
        private String query;
        private Optional<DialogRejectType> reject_type = Optional.a();

        public Reject() {
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<DialogRejectType> getRejectType() {
            return this.reject_type;
        }

        @Required
        public Reject setQuery(String str) {
            this.query = str;
            return this;
        }

        public Reject setRejectType(DialogRejectType dialogRejectType) {
            this.reject_type = Optional.e(dialogRejectType);
            return this;
        }

        public Reject(String str) {
            this.query = str;
        }
    }

    @NamespaceName(name = "IllegalContent", namespace = AIApiConstants.Dialog.NAME)
    public static class IllegalContent implements InstructionPayload {
        private Optional<Integer> code = Optional.a();
        private Optional<Boolean> delete_content = Optional.a();

        @Required
        private String msg;

        public IllegalContent() {
        }

        public Optional<Integer> getCode() {
            return this.code;
        }

        @Required
        public String getMsg() {
            return this.msg;
        }

        public Optional<Boolean> isDeleteContent() {
            return this.delete_content;
        }

        public IllegalContent setCode(int i) {
            this.code = Optional.e(Integer.valueOf(i));
            return this;
        }

        public IllegalContent setDeleteContent(boolean z) {
            this.delete_content = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public IllegalContent setMsg(String str) {
            this.msg = str;
            return this;
        }

        public IllegalContent(String str) {
            this.msg = str;
        }
    }
}
