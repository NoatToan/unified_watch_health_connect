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
public class VideoInfo<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.ContentProvider>> content_provider = Optional.a();

    @Required
    private T entity_type;

    public enum ArtistType {
        Artist(0, "Artist"),
        Actor(1, "Actor"),
        Director(2, "Director"),
        Singer(3, "Singer");

        private int id;
        private String name;

        ArtistType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ArtistType find(String str) {
            for (ArtistType artistType : values()) {
                if (artistType.name.equals(str)) {
                    return artistType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ArtistType read(String str) {
            return find(str);
        }

        public static String write(ArtistType artistType) {
            return artistType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum EpisodeType {
        Default(0, "Default"),
        UpdateEpisode(1, "UpdateEpisode"),
        TotalEpisode(2, "TotalEpisode"),
        CurEpisode(3, "CurEpisode"),
        LeftEpisode(4, "LeftEpisode");

        private int id;
        private String name;

        EpisodeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static EpisodeType find(String str) {
            for (EpisodeType episodeType : values()) {
                if (episodeType.name.equals(str)) {
                    return episodeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static EpisodeType read(String str) {
            return find(str);
        }

        public static String write(EpisodeType episodeType) {
            return episodeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class artist implements EntityType {
        private Optional<Slot<Miai.MovieName>> name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();
        private Optional<Slot<ArtistType>> artist_type = Optional.a();

        public static artist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            artist artistVar = new artist();
            if (zsdVar.z("name")) {
                artistVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                artistVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                artistVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("artist_type")) {
                artistVar.setArtistType(IntentUtils.readSlot(zsdVar.w("artist_type"), ArtistType.class));
            }
            return artistVar;
        }

        public static c4h write(artist artistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (artistVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(artistVar.name.b()));
            }
            if (artistVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(artistVar.main_name.b()));
            }
            if (artistVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(artistVar.sub_name.b()));
            }
            if (artistVar.artist_type.c()) {
                c4hVarCreateObjectNode.f0("artist_type", IntentUtils.writeSlot(artistVar.artist_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ArtistType>> getArtistType() {
            return this.artist_type;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public artist setArtistType(Slot<ArtistType> slot) {
            this.artist_type = Optional.e(slot);
            return this;
        }

        public artist setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public artist setName(Slot<Miai.MovieName> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public artist setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }
    }

    public static class name implements EntityType {
        private Optional<Slot<Miai.MovieName>> name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            name nameVar = new name();
            if (zsdVar.z("name")) {
                nameVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                nameVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                nameVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            return nameVar;
        }

        public static c4h write(name nameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (nameVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(nameVar.name.b()));
            }
            if (nameVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(nameVar.main_name.b()));
            }
            if (nameVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(nameVar.sub_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public name setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public name setName(Slot<Miai.MovieName> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public name setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }
    }

    public static class seasonEpisode implements EntityType {
        private Optional<Slot<Miai.MovieName>> name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();
        private Optional<Slot<Miai.Episode>> cur_episode = Optional.a();
        private Optional<Slot<Miai.Artist>> artist = Optional.a();
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();
        private Optional<Slot<EpisodeType>> episode_type = Optional.a();

        public static seasonEpisode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            seasonEpisode seasonepisode = new seasonEpisode();
            if (zsdVar.z("name")) {
                seasonepisode.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                seasonepisode.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                seasonepisode.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("cur_episode")) {
                seasonepisode.setCurEpisode(IntentUtils.readSlot(zsdVar.w("cur_episode"), Miai.Episode.class));
            }
            if (zsdVar.z("artist")) {
                seasonepisode.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z("season")) {
                seasonepisode.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                seasonepisode.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            if (zsdVar.z("episode_type")) {
                seasonepisode.setEpisodeType(IntentUtils.readSlot(zsdVar.w("episode_type"), EpisodeType.class));
            }
            return seasonepisode;
        }

        public static c4h write(seasonEpisode seasonepisode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (seasonepisode.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(seasonepisode.name.b()));
            }
            if (seasonepisode.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(seasonepisode.main_name.b()));
            }
            if (seasonepisode.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(seasonepisode.sub_name.b()));
            }
            if (seasonepisode.cur_episode.c()) {
                c4hVarCreateObjectNode.f0("cur_episode", IntentUtils.writeSlot(seasonepisode.cur_episode.b()));
            }
            if (seasonepisode.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(seasonepisode.artist.b()));
            }
            if (seasonepisode.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(seasonepisode.season.b()));
            }
            if (seasonepisode.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(seasonepisode.episode.b()));
            }
            if (seasonepisode.episode_type.c()) {
                c4hVarCreateObjectNode.f0("episode_type", IntentUtils.writeSlot(seasonepisode.episode_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        public Optional<Slot<Miai.Episode>> getCurEpisode() {
            return this.cur_episode;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        public Optional<Slot<EpisodeType>> getEpisodeType() {
            return this.episode_type;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public seasonEpisode setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        public seasonEpisode setCurEpisode(Slot<Miai.Episode> slot) {
            this.cur_episode = Optional.e(slot);
            return this;
        }

        public seasonEpisode setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        public seasonEpisode setEpisodeType(Slot<EpisodeType> slot) {
            this.episode_type = Optional.e(slot);
            return this;
        }

        public seasonEpisode setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public seasonEpisode setName(Slot<Miai.MovieName> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public seasonEpisode setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public seasonEpisode setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }
    }

    public VideoInfo() {
    }

    public static VideoInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VideoInfo videoInfo = new VideoInfo(IntentUtils.readEntityType(zsdVar, AIApiConstants.VideoInfo.NAME, optional));
        if (zsdVar.z("content_provider")) {
            videoInfo.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), Miai.ContentProvider.class));
        }
        return videoInfo;
    }

    public static zsd write(VideoInfo videoInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(videoInfo.entity_type);
        if (videoInfo.content_provider.c()) {
            c4hVar.f0("content_provider", IntentUtils.writeSlot(videoInfo.content_provider.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.ContentProvider>> getContentProvider() {
        return this.content_provider;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public VideoInfo setContentProvider(Slot<Miai.ContentProvider> slot) {
        this.content_provider = Optional.e(slot);
        return this;
    }

    @Required
    public VideoInfo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VideoInfo(T t) {
        this.entity_type = t;
    }
}
