package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.onetrack.b.g;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class OpenSkill<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<SkillType> type;
    private Optional<Slot<String>> app_id = Optional.a();
    private Optional<Slot<String>> developer_id = Optional.a();
    private Optional<Slot<RequestType>> request_type = Optional.a();
    private Optional<Slot<Boolean>> is_direct_wakeup = Optional.a();
    private Optional<Slot<String>> skill_slots = Optional.a();
    private Optional<Slot<String>> file_id = Optional.a();
    private Optional<Slot<String>> file_name = Optional.a();
    private Optional<Slot<Boolean>> is_suggestion = Optional.a();

    public enum RequestType {
        Start(0, "Start"),
        Intent(1, "Intent"),
        End(2, "End"),
        Event(3, "Event");

        private int id;
        private String name;

        RequestType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static RequestType find(String str) {
            for (RequestType requestType : values()) {
                if (requestType.name.equals(str)) {
                    return requestType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static RequestType read(String str) {
            return find(str);
        }

        public static String write(RequestType requestType) {
            return requestType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SkillType {
        Custom(0, "Custom"),
        FlashBriefing(1, "FlashBriefing"),
        OpenHome(2, "OpenHome"),
        Device(3, AIApiConstants.Device.NAME),
        Enterprise(4, "Enterprise"),
        Builtin(5, "Builtin"),
        Game(6, "Game"),
        NoCode(7, "NoCode"),
        Bluetooth(8, "Bluetooth"),
        LargeModel(9, "LargeModel");

        private int id;
        private String name;

        SkillType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SkillType find(String str) {
            for (SkillType skillType : values()) {
                if (skillType.name.equals(str)) {
                    return skillType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SkillType read(String str) {
            return find(str);
        }

        public static String write(SkillType skillType) {
            return skillType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class chineseStringUpPuzzle implements EntityType {
        public static chineseStringUpPuzzle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new chineseStringUpPuzzle();
        }

        public static c4h write(chineseStringUpPuzzle chinesestringuppuzzle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class llm implements EntityType {
        public static llm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new llm();
        }

        public static c4h write(llm llmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class meituan implements EntityType {
        public static meituan read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new meituan();
        }

        public static c4h write(meituan meituanVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miApplePolishers implements EntityType {
        public static miApplePolishers read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miApplePolishers();
        }

        public static c4h write(miApplePolishers miapplepolishers) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miAprilFools implements EntityType {
        public static miAprilFools read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miAprilFools();
        }

        public static c4h write(miAprilFools miaprilfools) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miBrainTeasers implements EntityType {
        public static miBrainTeasers read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miBrainTeasers();
        }

        public static c4h write(miBrainTeasers mibrainteasers) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miChitchat implements EntityType {
        public static miChitchat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miChitchat();
        }

        public static c4h write(miChitchat michitchat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miCompliments implements EntityType {
        public static miCompliments read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miCompliments();
        }

        public static c4h write(miCompliments micompliments) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miEmojiGame implements EntityType {
        public static miEmojiGame read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miEmojiGame();
        }

        public static c4h write(miEmojiGame miemojigame) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miPlayInstrument implements EntityType {
        public static miPlayInstrument read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miPlayInstrument();
        }

        public static c4h write(miPlayInstrument miplayinstrument) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miRiddle implements EntityType {
        public static miRiddle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miRiddle();
        }

        public static c4h write(miRiddle miriddle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miSweetNothings implements EntityType {
        public static miSweetNothings read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miSweetNothings();
        }

        public static c4h write(miSweetNothings misweetnothings) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class plantTrees implements EntityType {
        public static plantTrees read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new plantTrees();
        }

        public static c4h write(plantTrees planttrees) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class virtualBoyfriend implements EntityType {
        public static virtualBoyfriend read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new virtualBoyfriend();
        }

        public static c4h write(virtualBoyfriend virtualboyfriend) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class xiaoice implements EntityType {
        public static xiaoice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new xiaoice();
        }

        public static c4h write(xiaoice xiaoiceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public OpenSkill() {
    }

    public static OpenSkill read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        OpenSkill openSkill = new OpenSkill(IntentUtils.readEntityType(zsdVar, AIApiConstants.OpenSkill.NAME, optional));
        openSkill.setType(IntentUtils.readSlot(zsdVar.w("type"), SkillType.class));
        if (zsdVar.z(g.d)) {
            openSkill.setAppId(IntentUtils.readSlot(zsdVar.w(g.d), String.class));
        }
        if (zsdVar.z("developer_id")) {
            openSkill.setDeveloperId(IntentUtils.readSlot(zsdVar.w("developer_id"), String.class));
        }
        if (zsdVar.z("request_type")) {
            openSkill.setRequestType(IntentUtils.readSlot(zsdVar.w("request_type"), RequestType.class));
        }
        if (zsdVar.z("is_direct_wakeup")) {
            openSkill.setIsDirectWakeup(IntentUtils.readSlot(zsdVar.w("is_direct_wakeup"), Boolean.class));
        }
        if (zsdVar.z("skill_slots")) {
            openSkill.setSkillSlots(IntentUtils.readSlot(zsdVar.w("skill_slots"), String.class));
        }
        if (zsdVar.z("file_id")) {
            openSkill.setFileId(IntentUtils.readSlot(zsdVar.w("file_id"), String.class));
        }
        if (zsdVar.z("file_name")) {
            openSkill.setFileName(IntentUtils.readSlot(zsdVar.w("file_name"), String.class));
        }
        if (zsdVar.z("is_suggestion")) {
            openSkill.setIsSuggestion(IntentUtils.readSlot(zsdVar.w("is_suggestion"), Boolean.class));
        }
        return openSkill;
    }

    public static zsd write(OpenSkill openSkill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(openSkill.entity_type);
        c4hVar.f0("type", IntentUtils.writeSlot(openSkill.type));
        if (openSkill.app_id.c()) {
            c4hVar.f0(g.d, IntentUtils.writeSlot(openSkill.app_id.b()));
        }
        if (openSkill.developer_id.c()) {
            c4hVar.f0("developer_id", IntentUtils.writeSlot(openSkill.developer_id.b()));
        }
        if (openSkill.request_type.c()) {
            c4hVar.f0("request_type", IntentUtils.writeSlot(openSkill.request_type.b()));
        }
        if (openSkill.is_direct_wakeup.c()) {
            c4hVar.f0("is_direct_wakeup", IntentUtils.writeSlot(openSkill.is_direct_wakeup.b()));
        }
        if (openSkill.skill_slots.c()) {
            c4hVar.f0("skill_slots", IntentUtils.writeSlot(openSkill.skill_slots.b()));
        }
        if (openSkill.file_id.c()) {
            c4hVar.f0("file_id", IntentUtils.writeSlot(openSkill.file_id.b()));
        }
        if (openSkill.file_name.c()) {
            c4hVar.f0("file_name", IntentUtils.writeSlot(openSkill.file_name.b()));
        }
        if (openSkill.is_suggestion.c()) {
            c4hVar.f0("is_suggestion", IntentUtils.writeSlot(openSkill.is_suggestion.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAppId() {
        return this.app_id;
    }

    public Optional<Slot<String>> getDeveloperId() {
        return this.developer_id;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getFileId() {
        return this.file_id;
    }

    public Optional<Slot<String>> getFileName() {
        return this.file_name;
    }

    public Optional<Slot<Boolean>> getIsDirectWakeup() {
        return this.is_direct_wakeup;
    }

    public Optional<Slot<Boolean>> getIsSuggestion() {
        return this.is_suggestion;
    }

    public Optional<Slot<RequestType>> getRequestType() {
        return this.request_type;
    }

    public Optional<Slot<String>> getSkillSlots() {
        return this.skill_slots;
    }

    @Required
    public Slot<SkillType> getType() {
        return this.type;
    }

    public OpenSkill setAppId(Slot<String> slot) {
        this.app_id = Optional.e(slot);
        return this;
    }

    public OpenSkill setDeveloperId(Slot<String> slot) {
        this.developer_id = Optional.e(slot);
        return this;
    }

    @Required
    public OpenSkill setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public OpenSkill setFileId(Slot<String> slot) {
        this.file_id = Optional.e(slot);
        return this;
    }

    public OpenSkill setFileName(Slot<String> slot) {
        this.file_name = Optional.e(slot);
        return this;
    }

    public OpenSkill setIsDirectWakeup(Slot<Boolean> slot) {
        this.is_direct_wakeup = Optional.e(slot);
        return this;
    }

    public OpenSkill setIsSuggestion(Slot<Boolean> slot) {
        this.is_suggestion = Optional.e(slot);
        return this;
    }

    public OpenSkill setRequestType(Slot<RequestType> slot) {
        this.request_type = Optional.e(slot);
        return this;
    }

    public OpenSkill setSkillSlots(Slot<String> slot) {
        this.skill_slots = Optional.e(slot);
        return this;
    }

    @Required
    public OpenSkill setType(Slot<SkillType> slot) {
        this.type = slot;
        return this;
    }

    public OpenSkill(T t) {
        this.entity_type = t;
    }

    public OpenSkill(T t, Slot<SkillType> slot) {
        this.entity_type = t;
        this.type = slot;
    }
}
