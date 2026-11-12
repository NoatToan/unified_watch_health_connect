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
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Book<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> type = Optional.a();

    public static class author implements EntityType {

        @Required
        private Slot<String> name;

        public author() {
        }

        public author(Slot<String> slot) {
            this.name = slot;
        }

        public static author read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            author authorVar = new author();
            authorVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return authorVar;
        }

        public static c4h write(author authorVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(authorVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public author setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class combination implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> author = Optional.a();
        private Optional<Slot<String>> character = Optional.a();
        private Optional<Slot<String>> keyword = Optional.a();

        public static combination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            combination combinationVar = new combination();
            if (zsdVar.z("name")) {
                combinationVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("tag")) {
                combinationVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("author")) {
                combinationVar.setAuthor(IntentUtils.readSlot(zsdVar.w("author"), String.class));
            }
            if (zsdVar.z("character")) {
                combinationVar.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), String.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                combinationVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            return combinationVar;
        }

        public static c4h write(combination combinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (combinationVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(combinationVar.name.b()));
            }
            if (combinationVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(combinationVar.tag.b()));
            }
            if (combinationVar.author.c()) {
                c4hVarCreateObjectNode.f0("author", IntentUtils.writeSlot(combinationVar.author.b()));
            }
            if (combinationVar.character.c()) {
                c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(combinationVar.character.b()));
            }
            if (combinationVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(combinationVar.keyword.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getAuthor() {
            return this.author;
        }

        public Optional<Slot<String>> getCharacter() {
            return this.character;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public combination setAuthor(Slot<String> slot) {
            this.author = Optional.e(slot);
            return this;
        }

        public combination setCharacter(Slot<String> slot) {
            this.character = Optional.e(slot);
            return this;
        }

        public combination setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        public combination setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public combination setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }
    }

    public static class name implements EntityType {

        @Required
        private Slot<String> name;

        public name() {
        }

        public name(Slot<String> slot) {
            this.name = slot;
        }

        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            name nameVar = new name();
            nameVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return nameVar;
        }

        public static c4h write(name nameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(nameVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public name setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class tag implements EntityType {

        @Required
        private Slot<String> name;

        public tag() {
        }

        public tag(Slot<String> slot) {
            this.name = slot;
        }

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            tagVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tagVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public tag setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public Book() {
    }

    public static Book read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Book book = new Book(IntentUtils.readEntityType(zsdVar, AIApiConstants.Book.NAME, optional));
        if (zsdVar.z("type")) {
            book.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        return book;
    }

    public static zsd write(Book book) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(book.entity_type);
        if (book.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(book.type.b()));
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

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    @Required
    public Book setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Book setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public Book(T t) {
        this.entity_type = t;
    }
}
