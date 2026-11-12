package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class StationInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Miai.RadioName>> name = Optional.a();
    private Optional<Slot<String>> sound_name = Optional.a();
    private Optional<Slot<Miai.Artist>> artist = Optional.a();
    private Optional<Slot<Miai.ContentProvider>> content_provider = Optional.a();

    public static class artist implements EntityType {
        public static artist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new artist();
        }

        public static c4h write(artist artistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class content implements EntityType {
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public static content read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            content contentVar = new content();
            if (zsdVar.z("type")) {
                contentVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                contentVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return contentVar;
        }

        public static c4h write(content contentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (contentVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(contentVar.type.b()));
            }
            if (contentVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(contentVar.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public content setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public content setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public static class seasonEpisode implements EntityType {
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();

        public static seasonEpisode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            seasonEpisode seasonepisode = new seasonEpisode();
            if (zsdVar.z("season")) {
                seasonepisode.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                seasonepisode.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            return seasonepisode;
        }

        public static c4h write(seasonEpisode seasonepisode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (seasonepisode.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(seasonepisode.season.b()));
            }
            if (seasonepisode.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(seasonepisode.episode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public seasonEpisode setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        public seasonEpisode setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }
    }

    public StationInfo() {
    }

    public static StationInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        StationInfo stationInfo = new StationInfo(IntentUtils.readEntityType(zsdVar, AIApiConstants.StationInfo.NAME, optional));
        if (zsdVar.z("name")) {
            stationInfo.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.RadioName.class));
        }
        if (zsdVar.z("sound_name")) {
            stationInfo.setSoundName(IntentUtils.readSlot(zsdVar.w("sound_name"), String.class));
        }
        if (zsdVar.z("artist")) {
            stationInfo.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
        }
        if (zsdVar.z("content_provider")) {
            stationInfo.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), Miai.ContentProvider.class));
        }
        return stationInfo;
    }

    public static zsd write(StationInfo stationInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(stationInfo.entity_type);
        if (stationInfo.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(stationInfo.name.b()));
        }
        if (stationInfo.sound_name.c()) {
            c4hVar.f0("sound_name", IntentUtils.writeSlot(stationInfo.sound_name.b()));
        }
        if (stationInfo.artist.c()) {
            c4hVar.f0("artist", IntentUtils.writeSlot(stationInfo.artist.b()));
        }
        if (stationInfo.content_provider.c()) {
            c4hVar.f0("content_provider", IntentUtils.writeSlot(stationInfo.content_provider.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Artist>> getArtist() {
        return this.artist;
    }

    public Optional<Slot<Miai.ContentProvider>> getContentProvider() {
        return this.content_provider;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.RadioName>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getSoundName() {
        return this.sound_name;
    }

    public StationInfo setArtist(Slot<Miai.Artist> slot) {
        this.artist = Optional.e(slot);
        return this;
    }

    public StationInfo setContentProvider(Slot<Miai.ContentProvider> slot) {
        this.content_provider = Optional.e(slot);
        return this;
    }

    @Required
    public StationInfo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public StationInfo setName(Slot<Miai.RadioName> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public StationInfo setSoundName(Slot<String> slot) {
        this.sound_name = Optional.e(slot);
        return this;
    }

    public StationInfo(T t) {
        this.entity_type = t;
    }
}
