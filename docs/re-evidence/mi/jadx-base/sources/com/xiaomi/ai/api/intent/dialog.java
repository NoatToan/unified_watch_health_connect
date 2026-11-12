package com.xiaomi.ai.api.intent;

import com.xiaomi.ai.api.code;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dialog {

    public enum DialogAct {
        UNKNOWN(-1),
        INFORM(0),
        REQUEST(1),
        SELECT(2),
        CONFIRM(3),
        AFFIRM(4),
        DENY(5),
        NEGATE(6),
        INVOKE(7),
        API_SUCCESS(8),
        CANCEL(9),
        CLOSE(10),
        EXIT(11),
        OFFER_INTENT(12),
        BACK(13),
        REQUEST_ACTION(14);

        private int id;

        DialogAct(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LiveState {
        private Optional<List<String>> intent_values = Optional.a();
        private Optional<List<DialogAct>> dialog_acts = Optional.a();
        private Optional<List<SlotState>> slot_states = Optional.a();

        public Optional<List<DialogAct>> getDialogActs() {
            return this.dialog_acts;
        }

        public Optional<List<String>> getIntentValues() {
            return this.intent_values;
        }

        public Optional<List<SlotState>> getSlotStates() {
            return this.slot_states;
        }

        public LiveState setDialogActs(List<DialogAct> list) {
            this.dialog_acts = Optional.e(list);
            return this;
        }

        public LiveState setIntentValues(List<String> list) {
            this.intent_values = Optional.e(list);
            return this;
        }

        public LiveState setSlotStates(List<SlotState> list) {
            this.slot_states = Optional.e(list);
            return this;
        }
    }

    public static class TaskState {
        private Optional<List<Task>> tasks = Optional.a();
        private Optional<Boolean> is_task_affected = Optional.a();
        private Optional<LiveState> live_state = Optional.a();

        public Optional<LiveState> getLiveState() {
            return this.live_state;
        }

        public Optional<List<Task>> getTasks() {
            return this.tasks;
        }

        public Optional<Boolean> isTaskAffected() {
            return this.is_task_affected;
        }

        public TaskState setIsTaskAffected(boolean z) {
            this.is_task_affected = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TaskState setLiveState(LiveState liveState) {
            this.live_state = Optional.e(liveState);
            return this;
        }

        public TaskState setTasks(List<Task> list) {
            this.tasks = Optional.e(list);
            return this;
        }
    }

    public static class UnexpectedTimes {

        @Required
        private int empty;

        @Required
        private int nonsense;

        @Required
        private int out_of_domain;

        @Required
        private int same_ask;

        public UnexpectedTimes() {
        }

        public UnexpectedTimes(int i, int i2, int i3, int i4) {
            this.same_ask = i;
            this.empty = i2;
            this.nonsense = i3;
            this.out_of_domain = i4;
        }

        @Required
        public int getEmpty() {
            return this.empty;
        }

        @Required
        public int getNonsense() {
            return this.nonsense;
        }

        @Required
        public int getOutOfDomain() {
            return this.out_of_domain;
        }

        @Required
        public int getSameAsk() {
            return this.same_ask;
        }

        @Required
        public UnexpectedTimes setEmpty(int i) {
            this.empty = i;
            return this;
        }

        @Required
        public UnexpectedTimes setNonsense(int i) {
            this.nonsense = i;
            return this;
        }

        @Required
        public UnexpectedTimes setOutOfDomain(int i) {
            this.out_of_domain = i;
            return this;
        }

        @Required
        public UnexpectedTimes setSameAsk(int i) {
            this.same_ask = i;
            return this;
        }
    }

    public static class SlotValue {
        private Optional<String> norm_value = Optional.a();

        @Required
        private String slot;

        @Required
        private String value;

        public SlotValue() {
        }

        public Optional<String> getNormValue() {
            return this.norm_value;
        }

        @Required
        public String getSlot() {
            return this.slot;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        public SlotValue setNormValue(String str) {
            this.norm_value = Optional.e(str);
            return this;
        }

        @Required
        public SlotValue setSlot(String str) {
            this.slot = str;
            return this;
        }

        @Required
        public SlotValue setValue(String str) {
            this.value = str;
            return this;
        }

        public SlotValue(String str, String str2) {
            this.slot = str;
            this.value = str2;
        }
    }

    public static class BeliefState {

        @Required
        private String intent;
        private Optional<List<SlotState>> slot_states = Optional.a();
        private Optional<Boolean> complete = Optional.a();

        public BeliefState() {
        }

        @Required
        public String getIntent() {
            return this.intent;
        }

        public Optional<List<SlotState>> getSlotStates() {
            return this.slot_states;
        }

        public Optional<Boolean> isComplete() {
            return this.complete;
        }

        public BeliefState setComplete(boolean z) {
            this.complete = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public BeliefState setIntent(String str) {
            this.intent = str;
            return this;
        }

        public BeliefState setSlotStates(List<SlotState> list) {
            this.slot_states = Optional.e(list);
            return this;
        }

        public BeliefState(String str) {
            this.intent = str;
        }
    }

    public static class QueryIntention {

        @Required
        private DialogAct act;

        @Required
        private String domain;

        @Required
        private String intent;

        @Required
        private boolean is_multi_turn;

        @Required
        private float score;
        private Optional<List<SlotValue>> slot_values = Optional.a();
        private Optional<DialogStatus> dialog_status = Optional.a();

        public QueryIntention() {
        }

        @Required
        public DialogAct getAct() {
            return this.act;
        }

        public Optional<DialogStatus> getDialogStatus() {
            return this.dialog_status;
        }

        @Required
        public String getDomain() {
            return this.domain;
        }

        @Required
        public String getIntent() {
            return this.intent;
        }

        @Required
        public float getScore() {
            return this.score;
        }

        public Optional<List<SlotValue>> getSlotValues() {
            return this.slot_values;
        }

        @Required
        public boolean isMultiTurn() {
            return this.is_multi_turn;
        }

        @Required
        public QueryIntention setAct(DialogAct dialogAct) {
            this.act = dialogAct;
            return this;
        }

        public QueryIntention setDialogStatus(DialogStatus dialogStatus) {
            this.dialog_status = Optional.e(dialogStatus);
            return this;
        }

        @Required
        public QueryIntention setDomain(String str) {
            this.domain = str;
            return this;
        }

        @Required
        public QueryIntention setIntent(String str) {
            this.intent = str;
            return this;
        }

        @Required
        public QueryIntention setIsMultiTurn(boolean z) {
            this.is_multi_turn = z;
            return this;
        }

        @Required
        public QueryIntention setScore(float f) {
            this.score = f;
            return this;
        }

        public QueryIntention setSlotValues(List<SlotValue> list) {
            this.slot_values = Optional.e(list);
            return this;
        }

        public QueryIntention(String str, String str2, DialogAct dialogAct, float f, boolean z) {
            this.domain = str;
            this.intent = str2;
            this.act = dialogAct;
            this.score = f;
            this.is_multi_turn = z;
        }
    }

    public static class SlotState {

        @Required
        private boolean required;

        @Required
        private String slot;

        @Required
        @Deprecated
        private String slot_type;

        @Deprecated
        private Optional<List<String>> values = Optional.a();
        private Optional<Integer> live_times = Optional.a();
        private Optional<zsd> value = Optional.a();

        public SlotState() {
        }

        public Optional<Integer> getLiveTimes() {
            return this.live_times;
        }

        @Required
        public String getSlot() {
            return this.slot;
        }

        @Required
        @Deprecated
        public String getSlotType() {
            return this.slot_type;
        }

        public Optional<zsd> getValue() {
            return this.value;
        }

        @Deprecated
        public Optional<List<String>> getValues() {
            return this.values;
        }

        @Required
        public boolean isRequired() {
            return this.required;
        }

        public SlotState setLiveTimes(int i) {
            this.live_times = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public SlotState setRequired(boolean z) {
            this.required = z;
            return this;
        }

        @Required
        public SlotState setSlot(String str) {
            this.slot = str;
            return this;
        }

        @Required
        @Deprecated
        public SlotState setSlotType(String str) {
            this.slot_type = str;
            return this;
        }

        public SlotState setValue(zsd zsdVar) {
            this.value = Optional.e(zsdVar);
            return this;
        }

        @Deprecated
        public SlotState setValues(List<String> list) {
            this.values = Optional.e(list);
            return this;
        }

        public SlotState(String str, String str2, boolean z) {
            this.slot = str;
            this.slot_type = str2;
            this.required = z;
        }
    }

    public static class Task {

        @Required
        private String name;
        private Optional<List<SlotState>> slot_states = Optional.a();
        private Optional<Boolean> complete = Optional.a();
        private Optional<Boolean> finish = Optional.a();
        private Optional<String> id = Optional.a();

        public Task() {
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<List<SlotState>> getSlotStates() {
            return this.slot_states;
        }

        public Optional<Boolean> isComplete() {
            return this.complete;
        }

        public Optional<Boolean> isFinish() {
            return this.finish;
        }

        public Task setComplete(boolean z) {
            this.complete = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Task setFinish(boolean z) {
            this.finish = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Task setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public Task setName(String str) {
            this.name = str;
            return this;
        }

        public Task setSlotStates(List<SlotState> list) {
            this.slot_states = Optional.e(list);
            return this;
        }

        public Task(String str) {
            this.name = str;
        }
    }

    public static class SystemAction {

        @Required
        private DialogAct act;
        private Optional<List<String>> request_slots = Optional.a();
        private Optional<List<SlotValue>> slot_values = Optional.a();
        private Optional<String> api_call = Optional.a();
        private Optional<String> api_code = Optional.a();
        private Optional<c4h> api_result = Optional.a();
        private Optional<String> confirm_intent = Optional.a();

        public SystemAction() {
        }

        @Required
        public DialogAct getAct() {
            return this.act;
        }

        public Optional<String> getApiCall() {
            return this.api_call;
        }

        public Optional<String> getApiCode() {
            return this.api_code;
        }

        public Optional<c4h> getApiResult() {
            return this.api_result;
        }

        public Optional<String> getConfirmIntent() {
            return this.confirm_intent;
        }

        public Optional<List<String>> getRequestSlots() {
            return this.request_slots;
        }

        public Optional<List<SlotValue>> getSlotValues() {
            return this.slot_values;
        }

        @Required
        public SystemAction setAct(DialogAct dialogAct) {
            this.act = dialogAct;
            return this;
        }

        public SystemAction setApiCall(String str) {
            this.api_call = Optional.e(str);
            return this;
        }

        public SystemAction setApiCode(String str) {
            this.api_code = Optional.e(str);
            return this;
        }

        public SystemAction setApiResult(c4h c4hVar) {
            this.api_result = Optional.e(c4hVar);
            return this;
        }

        public SystemAction setConfirmIntent(String str) {
            this.confirm_intent = Optional.e(str);
            return this;
        }

        public SystemAction setRequestSlots(List<String> list) {
            this.request_slots = Optional.e(list);
            return this;
        }

        public SystemAction setSlotValues(List<SlotValue> list) {
            this.slot_values = Optional.e(list);
            return this;
        }

        public SystemAction(DialogAct dialogAct) {
            this.act = dialogAct;
        }
    }

    public static class DialogState {

        @Required
        private String query;
        private Optional<QueryIntention> query_intention = Optional.a();

        @Deprecated
        private Optional<BeliefState> belief_state = Optional.a();
        private Optional<UnexpectedTimes> unexpected_times = Optional.a();

        @Deprecated
        private Optional<Integer> ask_times = Optional.a();
        private Optional<List<SystemAction>> system_actions = Optional.a();
        private Optional<String> response = Optional.a();
        private Optional<TaskState> task_state = Optional.a();
        private Optional<c4h> ast_status = Optional.a();
        private Optional<code.SemanticCode> code = Optional.a();

        public DialogState() {
        }

        @Deprecated
        public Optional<Integer> getAskTimes() {
            return this.ask_times;
        }

        public Optional<c4h> getAstStatus() {
            return this.ast_status;
        }

        @Deprecated
        public Optional<BeliefState> getBeliefState() {
            return this.belief_state;
        }

        public Optional<code.SemanticCode> getCode() {
            return this.code;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<QueryIntention> getQueryIntention() {
            return this.query_intention;
        }

        public Optional<String> getResponse() {
            return this.response;
        }

        public Optional<List<SystemAction>> getSystemActions() {
            return this.system_actions;
        }

        public Optional<TaskState> getTaskState() {
            return this.task_state;
        }

        public Optional<UnexpectedTimes> getUnexpectedTimes() {
            return this.unexpected_times;
        }

        @Deprecated
        public DialogState setAskTimes(int i) {
            this.ask_times = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DialogState setAstStatus(c4h c4hVar) {
            this.ast_status = Optional.e(c4hVar);
            return this;
        }

        @Deprecated
        public DialogState setBeliefState(BeliefState beliefState) {
            this.belief_state = Optional.e(beliefState);
            return this;
        }

        public DialogState setCode(code.SemanticCode semanticCode) {
            this.code = Optional.e(semanticCode);
            return this;
        }

        @Required
        public DialogState setQuery(String str) {
            this.query = str;
            return this;
        }

        public DialogState setQueryIntention(QueryIntention queryIntention) {
            this.query_intention = Optional.e(queryIntention);
            return this;
        }

        public DialogState setResponse(String str) {
            this.response = Optional.e(str);
            return this;
        }

        public DialogState setSystemActions(List<SystemAction> list) {
            this.system_actions = Optional.e(list);
            return this;
        }

        public DialogState setTaskState(TaskState taskState) {
            this.task_state = Optional.e(taskState);
            return this;
        }

        public DialogState setUnexpectedTimes(UnexpectedTimes unexpectedTimes) {
            this.unexpected_times = Optional.e(unexpectedTimes);
            return this;
        }

        public DialogState(String str) {
            this.query = str;
        }
    }
}
