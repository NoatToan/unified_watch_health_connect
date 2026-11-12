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
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Font<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum SetingOpt {
        Size(1, MediaStoreUtil.MediaInfo.SIZE),
        Style(2, "style");

        private int id;
        private String name;

        SetingOpt(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SetingOpt find(String str) {
            for (SetingOpt setingOpt : values()) {
                if (setingOpt.name.equals(str)) {
                    return setingOpt;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SetingOpt read(String str) {
            return find(str);
        }

        public static String write(SetingOpt setingOpt) {
            return setingOpt.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class setting implements EntityType {
        private Optional<Slot<SetingOpt>> opt = Optional.a();

        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            setting settingVar = new setting();
            if (zsdVar.z("opt")) {
                settingVar.setOpt(IntentUtils.readSlot(zsdVar.w("opt"), SetingOpt.class));
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

        public Optional<Slot<SetingOpt>> getOpt() {
            return this.opt;
        }

        public setting setOpt(Slot<SetingOpt> slot) {
            this.opt = Optional.e(slot);
            return this;
        }
    }

    public Font() {
    }

    public static Font read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Font(IntentUtils.readEntityType(zsdVar, AIApiConstants.Font.NAME, optional));
    }

    public static zsd write(Font font) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(font.entity_type);
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
    public Font setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Font(T t) {
        this.entity_type = t;
    }
}
