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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class HelpGuide<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class blackTechnology implements EntityType {
        public static blackTechnology read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new blackTechnology();
        }

        public static c4h write(blackTechnology blacktechnology) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class detailedFunction implements EntityType {

        @Required
        private Slot<String> name;

        public detailedFunction() {
        }

        public detailedFunction(Slot<String> slot) {
            this.name = slot;
        }

        public static detailedFunction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            detailedFunction detailedfunction = new detailedFunction();
            detailedfunction.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return detailedfunction;
        }

        public static c4h write(detailedFunction detailedfunction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(detailedfunction.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public detailedFunction setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class deviceControl implements EntityType {
        public static deviceControl read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new deviceControl();
        }

        public static c4h write(deviceControl devicecontrol) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class doSomething implements EntityType {
        public static doSomething read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new doSomething();
        }

        public static c4h write(doSomething dosomething) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class egg implements EntityType {
        public static egg read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new egg();
        }

        public static c4h write(egg eggVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class interesting implements EntityType {
        public static interesting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new interesting();
        }

        public static c4h write(interesting interestingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class language implements EntityType {
        public static language read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new language();
        }

        public static c4h write(language languageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mode();
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class music implements EntityType {
        public static music read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new music();
        }

        public static c4h write(music musicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class needHelp implements EntityType {
        public static needHelp read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new needHelp();
        }

        public static c4h write(needHelp needhelp) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class newFunction implements EntityType {

        @Required
        private Slot<String> version;

        public newFunction() {
        }

        public newFunction(Slot<String> slot) {
            this.version = slot;
        }

        public static newFunction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            newFunction newfunction = new newFunction();
            newfunction.setVersion(IntentUtils.readSlot(zsdVar.w("version"), String.class));
            return newfunction;
        }

        public static c4h write(newFunction newfunction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("version", IntentUtils.writeSlot(newfunction.version));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getVersion() {
            return this.version;
        }

        @Required
        public newFunction setVersion(Slot<String> slot) {
            this.version = slot;
            return this;
        }
    }

    public static class phoneAnswer implements EntityType {
        public static phoneAnswer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new phoneAnswer();
        }

        public static c4h write(phoneAnswer phoneanswer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class phoneCall implements EntityType {
        public static phoneCall read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new phoneCall();
        }

        public static c4h write(phoneCall phonecall) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class playGame implements EntityType {
        public static playGame read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new playGame();
        }

        public static c4h write(playGame playgame) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class record implements EntityType {
        public static record read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new record();
        }

        public static c4h write(record recordVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class videoPhone implements EntityType {
        public static videoPhone read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new videoPhone();
        }

        public static c4h write(videoPhone videophone) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class whoAreYou implements EntityType {
        public static whoAreYou read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new whoAreYou();
        }

        public static c4h write(whoAreYou whoareyou) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public HelpGuide() {
    }

    public static HelpGuide read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new HelpGuide(IntentUtils.readEntityType(zsdVar, AIApiConstants.HelpGuide.NAME, optional));
    }

    public static zsd write(HelpGuide helpGuide) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(helpGuide.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public HelpGuide setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public HelpGuide(T t) {
        this.entity_type = t;
    }
}
