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
public class VoiceAwaken<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class setting implements EntityType {
        private Optional<Slot<Boolean>> custom_design = Optional.a();

        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            setting settingVar = new setting();
            if (zsdVar.z("custom_design")) {
                settingVar.setCustomDesign(IntentUtils.readSlot(zsdVar.w("custom_design"), Boolean.class));
            }
            return settingVar;
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (settingVar.custom_design.c()) {
                c4hVarCreateObjectNode.f0("custom_design", IntentUtils.writeSlot(settingVar.custom_design.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getCustomDesign() {
            return this.custom_design;
        }

        public setting setCustomDesign(Slot<Boolean> slot) {
            this.custom_design = Optional.e(slot);
            return this;
        }
    }

    public VoiceAwaken() {
    }

    public static VoiceAwaken read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new VoiceAwaken(IntentUtils.readEntityType(zsdVar, AIApiConstants.VoiceAwaken.NAME, optional));
    }

    public static zsd write(VoiceAwaken voiceAwaken) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(voiceAwaken.entity_type);
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
    public VoiceAwaken setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VoiceAwaken(T t) {
        this.entity_type = t;
    }
}
