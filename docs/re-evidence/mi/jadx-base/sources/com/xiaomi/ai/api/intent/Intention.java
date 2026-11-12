package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mibi.sdk.component.Constants;
import com.xiaomi.common.Optional;
import defpackage.dsd;
import defpackage.ycd;
import defpackage.zcd;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@dsd(using = ycd.class)
@JsonSerialize(using = zcd.class)
public class Intention<S> {
    private String category;
    private String id;
    private IntentionInfo info;
    private String name;
    private S slots;
    private String sub_category;
    private Optional<zsd> task;

    public Intention() {
        this.task = Optional.a();
    }

    private static String genRequestId() {
        UUID uuidRandomUUID = UUID.randomUUID();
        return Long.toHexString(uuidRandomUUID.getMostSignificantBits()) + Long.toHexString(uuidRandomUUID.getLeastSignificantBits());
    }

    public static <A extends IntentionAction, S> Intention<S> newInstance(IntentionInfo intentionInfo, A a2) {
        return new Intention<>(a2.actionName().intentName(), intentionInfo, a2, a2.actionName().getCategory(), a2.actionName().getSubCategory());
    }

    public Optional<action.ActionName> actionName() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Optional<action.ActionName> optionalFindActionName = ActionFormatRegistry.findActionName(this.name);
        return !optionalFindActionName.c() ? Optional.a() : Optional.d(IntentUtils.readAction((zsd) this.slots, optionalFindActionName.b()).actionName());
    }

    public Optional<DialogTask> dialogTask() throws JsonProcessingException {
        return !this.task.c() ? Optional.a() : Optional.e(IntentUtils.readDialogTask(this.task.b()));
    }

    public String getCategory() {
        return this.category;
    }

    public String getId() {
        return this.id;
    }

    public IntentionInfo getInfo() {
        return this.info;
    }

    public String getName() {
        return this.name;
    }

    public S getSlots() {
        return this.slots;
    }

    public String getSubCategory() {
        return this.sub_category;
    }

    public Optional<zsd> getTask() {
        return this.task;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDialogTask(DialogTask dialogTask) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        this.task = Optional.e(IntentUtils.writeDialogTask(dialogTask));
    }

    public void setInfo(IntentionInfo intentionInfo) {
        this.info = intentionInfo;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSlots(S s) {
        this.slots = s;
    }

    public void setSubCategory(String str) {
        this.sub_category = str;
    }

    public void setTask(Optional<zsd> optional) {
        this.task = optional;
    }

    public String signature() {
        return this.category + "." + this.sub_category + "." + this.name;
    }

    public <V> Optional<Slot<V>> slot(String str, Class<?> cls) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return Optional.e(IntentUtils.readSlot(IntentUtils.writeIntention(this).w("slots").w(str), cls));
    }

    public <A> A slotAs() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Optional<action.ActionName> optionalFindActionName = ActionFormatRegistry.findActionName(getName());
        return ((this.slots instanceof zsd) && optionalFindActionName.c()) ? (A) IntentUtils.readAction((zsd) this.slots, optionalFindActionName.b()) : this.slots;
    }

    public Map<String, Slot<zsd>> slotMap() throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        zsd zsdVarW = IntentUtils.writeIntention(this).w("slots");
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, zsd>> itV = zsdVarW.v();
        while (itV.hasNext()) {
            Map.Entry<String, zsd> next = itV.next();
            map.put(next.getKey(), IntentUtils.readSlot(next.getValue(), zsd.class));
        }
        return map;
    }

    public <V> List<V> slotValue(String str) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return (List) IntentUtils.fromJsonNode(IntentUtils.writeIntention(this).w("slots").w(str).w(Constants.KEY_RECHARGE_VALUES), List.class);
    }

    public String toJsonString() throws JsonProcessingException {
        return IntentUtils.toJsonString(this);
    }

    public String toString() {
        try {
            return IntentUtils.toJsonString(IntentUtils.writeIntention(this));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static <A extends IntentionAction, S> Intention<S> newInstance(IntentionInfo intentionInfo, A a2, String str, String str2) {
        return new Intention<>(a2.actionName().intentName(), intentionInfo, a2, str, str2);
    }

    public Intention(String str, IntentionInfo intentionInfo, S s, String str2, String str3) {
        this.task = Optional.a();
        this.name = str;
        this.info = intentionInfo;
        this.slots = s;
        this.category = str2;
        this.sub_category = str3;
        this.id = genRequestId();
    }

    public static <A extends IntentionAction, S> Intention<S> newInstance(IntentionInfo intentionInfo, A a2, DialogTask dialogTask) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return new Intention<>(a2.actionName().intentName(), intentionInfo, a2, a2.actionName().getCategory(), a2.actionName().getSubCategory(), (Optional<zsd>) Optional.e(IntentUtils.writeDialogTask(dialogTask)));
    }

    public Intention(String str, IntentionInfo intentionInfo, S s, String str2, String str3, Optional<zsd> optional) {
        Optional.a();
        this.name = str;
        this.info = intentionInfo;
        this.slots = s;
        this.category = str2;
        this.sub_category = str3;
        this.task = optional;
        this.id = genRequestId();
    }

    public Intention(String str, IntentionInfo intentionInfo, S s, String str2, String str3, String str4) {
        this.task = Optional.a();
        this.name = str;
        this.info = intentionInfo;
        this.slots = s;
        this.category = str2;
        this.sub_category = str3;
        this.id = str4;
    }
}
