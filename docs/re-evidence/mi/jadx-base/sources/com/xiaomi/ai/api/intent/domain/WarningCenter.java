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
public class WarningCenter<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum WarningOpt {
        Earthquake(1, "earthquake"),
        SmartFurniturre(2, "smartFurniturre");

        private int id;
        private String name;

        WarningOpt(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WarningOpt find(String str) {
            for (WarningOpt warningOpt : values()) {
                if (warningOpt.name.equals(str)) {
                    return warningOpt;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WarningOpt read(String str) {
            return find(str);
        }

        public static String write(WarningOpt warningOpt) {
            return warningOpt.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class setting implements EntityType {
        private Optional<Slot<WarningOpt>> opt = Optional.a();

        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            setting settingVar = new setting();
            if (zsdVar.z("opt")) {
                settingVar.setOpt(IntentUtils.readSlot(zsdVar.w("opt"), WarningOpt.class));
            }
            return settingVar;
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (settingVar.opt.c()) {
                c4hVarCreateObjectNode.f0("opt", IntentUtils.writeSlot(settingVar.opt.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WarningOpt>> getOpt() {
            return this.opt;
        }

        public setting setOpt(Slot<WarningOpt> slot) {
            this.opt = Optional.e(slot);
            return this;
        }
    }

    public WarningCenter() {
    }

    public static WarningCenter read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new WarningCenter(IntentUtils.readEntityType(zsdVar, AIApiConstants.WarningCenter.NAME, optional));
    }

    public static zsd write(WarningCenter warningCenter) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(warningCenter.entity_type);
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
    public WarningCenter setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public WarningCenter(T t) {
        this.entity_type = t;
    }
}
