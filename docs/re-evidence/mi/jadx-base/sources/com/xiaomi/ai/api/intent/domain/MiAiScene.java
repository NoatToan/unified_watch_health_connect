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
public class MiAiScene<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> control_domain;

    @Required
    private T entity_type;
    private Optional<Slot<String>> scenes_type = Optional.a();

    public static class aiPanel implements EntityType {
        public static aiPanel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new aiPanel();
        }

        public static c4h write(aiPanel aipanel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class backHome implements EntityType {
        public static backHome read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new backHome();
        }

        public static c4h write(backHome backhome) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class birthday implements EntityType {
        public static birthday read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new birthday();
        }

        public static c4h write(birthday birthdayVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class cold implements EntityType {
        public static cold read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new cold();
        }

        public static c4h write(cold coldVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dark implements EntityType {
        public static dark read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dark();
        }

        public static c4h write(dark darkVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class explore implements EntityType {
        public static explore read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new explore();
        }

        public static c4h write(explore exploreVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class festival implements EntityType {
        public static festival read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new festival();
        }

        public static c4h write(festival festivalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class getUp implements EntityType {
        public static getUp read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new getUp();
        }

        public static c4h write(getUp getup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class goodAfterNoon implements EntityType {
        public static goodAfterNoon read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goodAfterNoon();
        }

        public static c4h write(goodAfterNoon goodafternoon) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class goodEvening implements EntityType {
        public static goodEvening read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goodEvening();
        }

        public static c4h write(goodEvening goodevening) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class goodMorning implements EntityType {
        public static goodMorning read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goodMorning();
        }

        public static c4h write(goodMorning goodmorning) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class goodNoon implements EntityType {
        public static goodNoon read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goodNoon();
        }

        public static c4h write(goodNoon goodnoon) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class goodbye implements EntityType {
        public static goodbye read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goodbye();
        }

        public static c4h write(goodbye goodbyeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class hot implements EntityType {
        public static hot read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new hot();
        }

        public static c4h write(hot hotVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class leaveHome implements EntityType {
        public static leaveHome read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leaveHome();
        }

        public static c4h write(leaveHome leavehome) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mute implements EntityType {
        public static mute read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mute();
        }

        public static c4h write(mute muteVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class muteoff implements EntityType {
        public static muteoff read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new muteoff();
        }

        public static c4h write(muteoff muteoffVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class needAir implements EntityType {
        public static needAir read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new needAir();
        }

        public static c4h write(needAir needair) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sleep implements EntityType {
        public static sleep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new sleep();
        }

        public static c4h write(sleep sleepVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MiAiScene() {
    }

    public static MiAiScene read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MiAiScene miAiScene = new MiAiScene(IntentUtils.readEntityType(zsdVar, AIApiConstants.MiAiScene.NAME, optional));
        miAiScene.setControlDomain(IntentUtils.readSlot(zsdVar.w("control_domain"), String.class));
        if (zsdVar.z("scenes_type")) {
            miAiScene.setScenesType(IntentUtils.readSlot(zsdVar.w("scenes_type"), String.class));
        }
        return miAiScene;
    }

    public static zsd write(MiAiScene miAiScene) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(miAiScene.entity_type);
        c4hVar.f0("control_domain", IntentUtils.writeSlot(miAiScene.control_domain));
        if (miAiScene.scenes_type.c()) {
            c4hVar.f0("scenes_type", IntentUtils.writeSlot(miAiScene.scenes_type.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getControlDomain() {
        return this.control_domain;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getScenesType() {
        return this.scenes_type;
    }

    @Required
    public MiAiScene setControlDomain(Slot<String> slot) {
        this.control_domain = slot;
        return this;
    }

    @Required
    public MiAiScene setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MiAiScene setScenesType(Slot<String> slot) {
        this.scenes_type = Optional.e(slot);
        return this;
    }

    public MiAiScene(T t) {
        this.entity_type = t;
    }

    public MiAiScene(T t, Slot<String> slot) {
        this.entity_type = t;
        this.control_domain = slot;
    }
}
