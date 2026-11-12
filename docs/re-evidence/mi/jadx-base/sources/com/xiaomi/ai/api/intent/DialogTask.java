package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DialogTask<T> {
    private DialogAction action;
    private Optional<ErrorType> error_type;
    private List<String> focus_slots;
    private String name;
    private T slots;

    public enum DialogAction {
        INVOKE(1, "INVOKE"),
        INFORM(2, "INFORM"),
        SELECT(3, "SELECT"),
        AFFIRM(4, "AFFIRM"),
        DENY(5, "DENY"),
        NEGATE(6, "NEGATE"),
        CANCEL(7, "CANCEL"),
        CLOSE(8, "CLOSE"),
        EXIT(9, "EXIT"),
        BACK(10, "BACK");

        private int id;
        private String name;

        DialogAction(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DialogAction find(String str) {
            for (DialogAction dialogAction : values()) {
                if (dialogAction.name.equals(str)) {
                    return dialogAction;
                }
            }
            return INVOKE;
        }

        public static DialogAction read(String str) {
            return find(str);
        }

        public static String write(DialogAction dialogAction) {
            return dialogAction.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ErrorType {
        OUT_OF_DOMAIN(1, "OUT_OF_DOMAIN"),
        IRRELEVANT(2, "IRRELEVANT"),
        EMPTY(3, "EMPTY");

        private int id;
        private String name;

        ErrorType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Optional<ErrorType> find(String str) {
            for (ErrorType errorType : values()) {
                if (errorType.name.equals(str)) {
                    return Optional.e(errorType);
                }
            }
            return Optional.a();
        }

        public static Optional<ErrorType> read(String str) {
            return find(str);
        }

        public static String write(ErrorType errorType) {
            return errorType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class select implements EntityType {
        private Optional<Slot<Integer>> ordinal = Optional.a();
        private Optional<Slot<String>> keyword = Optional.a();

        public static select read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            select selectVar = new select();
            if (zsdVar.z("ordinal")) {
                selectVar.setOrdinal(Optional.e(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class)));
            }
            return selectVar;
        }

        public static c4h write(select selectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (selectVar.getOrdinal().c()) {
                c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(selectVar.ordinal.b()));
            }
            if (selectVar.getKeyword().c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(selectVar.keyword.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<Integer>> getOrdinal() {
            return this.ordinal;
        }

        public void setKeyword(Optional<Slot<String>> optional) {
            this.keyword = optional;
        }

        public void setOrdinal(Optional<Slot<Integer>> optional) {
            this.ordinal = optional;
        }
    }

    public DialogTask() {
        this.slots = (T) new general();
        this.error_type = Optional.a();
        this.focus_slots = new ArrayList();
    }

    public DialogAction getAction() {
        return this.action;
    }

    public Optional<ErrorType> getError_type() {
        return this.error_type;
    }

    public List<String> getFocus_slots() {
        return this.focus_slots;
    }

    public String getName() {
        return this.name;
    }

    public T getSlots() {
        return this.slots;
    }

    public void setAction(DialogAction dialogAction) {
        this.action = dialogAction;
    }

    public void setError_type(Optional<ErrorType> optional) {
        this.error_type = optional;
    }

    public void setFocus_slots(List<String> list) {
        this.focus_slots = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSlots(T t) {
        this.slots = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <A> A slotAs() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        T t = this.slots;
        return t instanceof zsd ? (A) IntentUtils.readEntityType((zsd) t, "DialogTask", Optional.e(this.action.toString().toLowerCase())) : t;
    }

    public DialogTask(String str, DialogAction dialogAction) {
        this.slots = (T) new general();
        this.error_type = Optional.a();
        this.focus_slots = new ArrayList();
        this.name = str;
        this.action = dialogAction;
    }

    public DialogTask(String str, DialogAction dialogAction, T t) {
        this.slots = (T) new general();
        this.error_type = Optional.a();
        this.focus_slots = new ArrayList();
        this.name = str;
        this.action = dialogAction;
        this.slots = t;
    }

    public DialogTask(String str, DialogAction dialogAction, Optional<ErrorType> optional) {
        this.slots = (T) new general();
        this.error_type = Optional.a();
        this.focus_slots = new ArrayList();
        this.name = str;
        this.action = dialogAction;
        this.error_type = optional;
    }
}
