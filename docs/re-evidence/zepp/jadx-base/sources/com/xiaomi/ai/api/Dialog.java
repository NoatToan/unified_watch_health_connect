package com.xiaomi.ai.api;

import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
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

    @NamespaceName(name = "DialogState", namespace = AIApiConstants.Dialog.NAME)
    public static class DialogState implements ContextPayload {
        private Optional<Boolean> continuous_dialog = Optional.empty();
        private Optional<Boolean> is_interruptable = Optional.empty();
        private Optional<Scene.SceneType> scene = Optional.empty();

        public Optional<Scene.SceneType> getScene() {
            return this.scene;
        }

        public Optional<Boolean> isContinuousDialog() {
            return this.continuous_dialog;
        }

        public Optional<Boolean> isInterruptable() {
            return this.is_interruptable;
        }

        public DialogState setContinuousDialog(boolean z) {
            this.continuous_dialog = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DialogState setIsInterruptable(boolean z) {
            this.is_interruptable = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DialogState setScene(Scene.SceneType sceneType) {
            this.scene = Optional.ofNullable(sceneType);
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
    }

    @NamespaceName(name = SportAnalytics.Params.VALUE_FINISH, namespace = AIApiConstants.Dialog.NAME)
    public static class Finish implements InstructionPayload {
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
        NEARBY_AWAKE(0);

        private int id;

        JudgeFinishType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
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

    @NamespaceName(name = "Reject", namespace = AIApiConstants.Dialog.NAME)
    public static class Reject implements InstructionPayload {

        @Required
        private String query;

        public Reject() {
        }

        public Reject(String str) {
            this.query = str;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public Reject setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    @NamespaceName(name = "TurnOffContinuousDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class TurnOffContinuousDialog implements InstructionPayload {
    }

    @NamespaceName(name = "TurnOnContinuousDialog", namespace = AIApiConstants.Dialog.NAME)
    public static class TurnOnContinuousDialog implements InstructionPayload {
    }
}
