package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Agent {

    @NamespaceName(name = "Answer", namespace = AIApiConstants.Agent.NAME)
    public static class Answer implements InstructionPayload {

        @Required
        private c4h answer;

        public Answer() {
        }

        public Answer(c4h c4hVar) {
            this.answer = c4hVar;
        }

        @Required
        public c4h getAnswer() {
            return this.answer;
        }

        @Required
        public Answer setAnswer(c4h c4hVar) {
            this.answer = c4hVar;
            return this;
        }
    }

    @NamespaceName(name = "Forward", namespace = AIApiConstants.Agent.NAME)
    public static class Forward implements InstructionPayload {

        @Required
        private Instruction<InstructionPayload> forward;

        @Required
        private TargetDef target;

        public Forward() {
        }

        public Forward(Instruction<InstructionPayload> instruction, TargetDef targetDef) {
            this.forward = instruction;
            this.target = targetDef;
        }

        @Required
        public Instruction<InstructionPayload> getForward() {
            return this.forward;
        }

        @Required
        public TargetDef getTarget() {
            return this.target;
        }

        @Required
        public Forward setForward(Instruction<InstructionPayload> instruction) {
            this.forward = instruction;
            return this;
        }

        @Required
        public Forward setTarget(TargetDef targetDef) {
            this.target = targetDef;
            return this;
        }
    }

    @NamespaceName(name = "Query", namespace = AIApiConstants.Agent.NAME)
    public static class Query implements InstructionPayload {

        @Required
        private String query;

        public Query() {
        }

        public Query(String str) {
            this.query = str;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public Query setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    public enum TargetDef {
        UNKNOWN(-1),
        TV(0),
        REMOTE_CONTROLLER(1);

        private int id;

        TargetDef(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ActionResultEvent", namespace = AIApiConstants.Agent.NAME)
    public static class ActionResultEvent implements EventPayload {

        @Required
        private String out;
        private Optional<Integer> status = Optional.a();

        @Required
        private String type;

        public ActionResultEvent() {
        }

        @Required
        public String getOut() {
            return this.out;
        }

        public Optional<Integer> getStatus() {
            return this.status;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public ActionResultEvent setOut(String str) {
            this.out = str;
            return this;
        }

        public ActionResultEvent setStatus(int i) {
            this.status = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public ActionResultEvent setType(String str) {
            this.type = str;
            return this;
        }

        public ActionResultEvent(String str, String str2) {
            this.type = str;
            this.out = str2;
        }
    }

    public static class CodeTTS {

        @Required
        private long code;
        private Optional<String> text = Optional.a();

        public CodeTTS() {
        }

        @Required
        public long getCode() {
            return this.code;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public CodeTTS setCode(long j) {
            this.code = j;
            return this;
        }

        public CodeTTS setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public CodeTTS(long j) {
            this.code = j;
        }
    }

    @NamespaceName(name = "Action", namespace = AIApiConstants.Agent.NAME)
    public static class Action implements InstructionPayload {

        @Required
        private List<String> action;

        @Required
        private List<CodeTTS> action_status_tts;

        @Required
        private List<CodeTTS> status_tts;
        private Optional<Boolean> is_loading = Optional.a();
        private Optional<Boolean> is_background = Optional.a();

        public Action() {
        }

        @Required
        public List<String> getAction() {
            return this.action;
        }

        @Required
        public List<CodeTTS> getActionStatusTts() {
            return this.action_status_tts;
        }

        @Required
        public List<CodeTTS> getStatusTts() {
            return this.status_tts;
        }

        public Optional<Boolean> isBackground() {
            return this.is_background;
        }

        public Optional<Boolean> isLoading() {
            return this.is_loading;
        }

        @Required
        public Action setAction(List<String> list) {
            this.action = list;
            return this;
        }

        @Required
        public Action setActionStatusTts(List<CodeTTS> list) {
            this.action_status_tts = list;
            return this;
        }

        public Action setIsBackground(boolean z) {
            this.is_background = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Action setIsLoading(boolean z) {
            this.is_loading = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Action setStatusTts(List<CodeTTS> list) {
            this.status_tts = list;
            return this;
        }

        public Action(List<String> list, List<CodeTTS> list2, List<CodeTTS> list3) {
            this.action = list;
            this.status_tts = list2;
            this.action_status_tts = list3;
        }
    }
}
