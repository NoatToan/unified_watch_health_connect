package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class News<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Boolean>> is_hot = Optional.a();
    private Optional<Slot<Boolean>> is_new = Optional.a();

    public static class area implements EntityType {

        @Required
        private Slot<String> name;

        public area() {
        }

        public area(Slot<String> slot) {
            this.name = slot;
        }

        public static area read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            area areaVar = new area();
            areaVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return areaVar;
        }

        public static c4h write(area areaVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(areaVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public area setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class combination implements EntityType {
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> area = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<String>> keyword = Optional.a();
        private Optional<Slot<String>> publisher = Optional.a();
        private Optional<Slot<String>> program = Optional.a();

        public static combination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            combination combinationVar = new combination();
            if (zsdVar.z("type")) {
                combinationVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("area")) {
                combinationVar.setArea(IntentUtils.readSlot(zsdVar.w("area"), String.class));
            }
            if (zsdVar.z("datetime")) {
                combinationVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                combinationVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            if (zsdVar.z("publisher")) {
                combinationVar.setPublisher(IntentUtils.readSlot(zsdVar.w("publisher"), String.class));
            }
            if (zsdVar.z("program")) {
                combinationVar.setProgram(IntentUtils.readSlot(zsdVar.w("program"), String.class));
            }
            return combinationVar;
        }

        public static c4h write(combination combinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (combinationVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(combinationVar.type.b()));
            }
            if (combinationVar.area.c()) {
                c4hVarCreateObjectNode.f0("area", IntentUtils.writeSlot(combinationVar.area.b()));
            }
            if (combinationVar.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(combinationVar.datetime.b()));
            }
            if (combinationVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(combinationVar.keyword.b()));
            }
            if (combinationVar.publisher.c()) {
                c4hVarCreateObjectNode.f0("publisher", IntentUtils.writeSlot(combinationVar.publisher.b()));
            }
            if (combinationVar.program.c()) {
                c4hVarCreateObjectNode.f0("program", IntentUtils.writeSlot(combinationVar.program.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getArea() {
            return this.area;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<String>> getProgram() {
            return this.program;
        }

        public Optional<Slot<String>> getPublisher() {
            return this.publisher;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public combination setArea(Slot<String> slot) {
            this.area = Optional.e(slot);
            return this;
        }

        public combination setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public combination setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        public combination setProgram(Slot<String> slot) {
            this.program = Optional.e(slot);
            return this;
        }

        public combination setPublisher(Slot<String> slot) {
            this.publisher = Optional.e(slot);
            return this;
        }

        public combination setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public static class datetime implements EntityType {

        @Required
        private Slot<Miai.Datetime> name;

        public datetime() {
        }

        public datetime(Slot<Miai.Datetime> slot) {
            this.name = slot;
        }

        public static datetime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            datetime datetimeVar = new datetime();
            datetimeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Datetime.class));
            return datetimeVar;
        }

        public static c4h write(datetime datetimeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(datetimeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Datetime> getName() {
            return this.name;
        }

        @Required
        public datetime setName(Slot<Miai.Datetime> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class eveningPost implements EntityType {
        private Optional<Slot<String>> area = Optional.a();

        public static eveningPost read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            eveningPost eveningpost = new eveningPost();
            if (zsdVar.z("area")) {
                eveningpost.setArea(IntentUtils.readSlot(zsdVar.w("area"), String.class));
            }
            return eveningpost;
        }

        public static c4h write(eveningPost eveningpost) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (eveningpost.area.c()) {
                c4hVarCreateObjectNode.f0("area", IntentUtils.writeSlot(eveningpost.area.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getArea() {
            return this.area;
        }

        public eveningPost setArea(Slot<String> slot) {
            this.area = Optional.e(slot);
            return this;
        }
    }

    public static class keyword implements EntityType {

        @Required
        private Slot<String> name;

        public keyword() {
        }

        public keyword(Slot<String> slot) {
            this.name = slot;
        }

        public static keyword read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            keyword keywordVar = new keyword();
            keywordVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return keywordVar;
        }

        public static c4h write(keyword keywordVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(keywordVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public keyword setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class morningPost implements EntityType {
        private Optional<Slot<String>> area = Optional.a();

        public static morningPost read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            morningPost morningpost = new morningPost();
            if (zsdVar.z("area")) {
                morningpost.setArea(IntentUtils.readSlot(zsdVar.w("area"), String.class));
            }
            return morningpost;
        }

        public static c4h write(morningPost morningpost) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (morningpost.area.c()) {
                c4hVarCreateObjectNode.f0("area", IntentUtils.writeSlot(morningpost.area.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getArea() {
            return this.area;
        }

        public morningPost setArea(Slot<String> slot) {
            this.area = Optional.e(slot);
            return this;
        }
    }

    public static class newsType implements EntityType {

        @Required
        private Slot<String> name;

        public newsType() {
        }

        public newsType(Slot<String> slot) {
            this.name = slot;
        }

        public static newsType read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            newsType newstype = new newsType();
            newstype.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return newstype;
        }

        public static c4h write(newsType newstype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(newstype.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public newsType setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public News() {
    }

    public static News read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        News news = new News(IntentUtils.readEntityType(zsdVar, AIApiConstants.News.NAME, optional));
        if (zsdVar.z("is_hot")) {
            news.setIsHot(IntentUtils.readSlot(zsdVar.w("is_hot"), Boolean.class));
        }
        if (zsdVar.z("is_new")) {
            news.setIsNew(IntentUtils.readSlot(zsdVar.w("is_new"), Boolean.class));
        }
        return news;
    }

    public static zsd write(News news) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(news.entity_type);
        if (news.is_hot.c()) {
            c4hVar.f0("is_hot", IntentUtils.writeSlot(news.is_hot.b()));
        }
        if (news.is_new.c()) {
            c4hVar.f0("is_new", IntentUtils.writeSlot(news.is_new.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsHot() {
        return this.is_hot;
    }

    public Optional<Slot<Boolean>> getIsNew() {
        return this.is_new;
    }

    @Required
    public News setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public News setIsHot(Slot<Boolean> slot) {
        this.is_hot = Optional.e(slot);
        return this;
    }

    public News setIsNew(Slot<Boolean> slot) {
        this.is_new = Optional.e(slot);
        return this;
    }

    public News(T t) {
        this.entity_type = t;
    }
}
