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
public class PinDuoDuo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;

    public static class page implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static page read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            page pageVar = new page();
            if (zsdVar.z("name")) {
                pageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return pageVar;
        }

        public static c4h write(page pageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (pageVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(pageVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public page setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class search implements EntityType {
        private Optional<Slot<String>> keyword = Optional.a();

        public static search read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            search searchVar = new search();
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                searchVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            return searchVar;
        }

        public static c4h write(search searchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (searchVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(searchVar.keyword.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public search setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }
    }

    public PinDuoDuo() {
    }

    public static PinDuoDuo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PinDuoDuo pinDuoDuo = new PinDuoDuo(IntentUtils.readEntityType(zsdVar, AIApiConstants.PinDuoDuo.NAME, optional));
        pinDuoDuo.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return pinDuoDuo;
    }

    public static zsd write(PinDuoDuo pinDuoDuo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(pinDuoDuo.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(pinDuoDuo.package_name));
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

    @Required
    public Slot<String> getPackageName() {
        return this.package_name;
    }

    @Required
    public PinDuoDuo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public PinDuoDuo setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public PinDuoDuo(T t) {
        this.entity_type = t;
    }

    public PinDuoDuo(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
