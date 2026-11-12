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
public class StationPlaylist<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();

    public static class collect implements EntityType {
        public static collect read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new collect();
        }

        public static c4h write(collect collectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public StationPlaylist() {
    }

    public static StationPlaylist read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        StationPlaylist stationPlaylist = new StationPlaylist(IntentUtils.readEntityType(zsdVar, AIApiConstants.StationPlaylist.NAME, optional));
        if (zsdVar.z("name")) {
            stationPlaylist.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return stationPlaylist;
    }

    public static zsd write(StationPlaylist stationPlaylist) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(stationPlaylist.entity_type);
        if (stationPlaylist.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(stationPlaylist.name.b()));
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

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    @Required
    public StationPlaylist setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public StationPlaylist setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public StationPlaylist(T t) {
        this.entity_type = t;
    }
}
