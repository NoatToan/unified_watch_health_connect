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
public class Accessibility<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class display implements EntityType {
        private Optional<Slot<Boolean>> color_inversion = Optional.a();

        public static display read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            display displayVar = new display();
            if (zsdVar.z("color_inversion")) {
                displayVar.setColorInversion(IntentUtils.readSlot(zsdVar.w("color_inversion"), Boolean.class));
            }
            return displayVar;
        }

        public static c4h write(display displayVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (displayVar.color_inversion.c()) {
                c4hVarCreateObjectNode.f0("color_inversion", IntentUtils.writeSlot(displayVar.color_inversion.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getColorInversion() {
            return this.color_inversion;
        }

        public display setColorInversion(Slot<Boolean> slot) {
            this.color_inversion = Optional.e(slot);
            return this;
        }
    }

    public static class selectToSpeak implements EntityType {
        public static selectToSpeak read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new selectToSpeak();
        }

        public static c4h write(selectToSpeak selecttospeak) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class talkBack implements EntityType {
        public static talkBack read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new talkBack();
        }

        public static c4h write(talkBack talkback) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Accessibility() {
    }

    public static Accessibility read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Accessibility(IntentUtils.readEntityType(zsdVar, AIApiConstants.Accessibility.NAME, optional));
    }

    public static zsd write(Accessibility accessibility) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(accessibility.entity_type);
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
    public Accessibility setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Accessibility(T t) {
        this.entity_type = t;
    }
}
