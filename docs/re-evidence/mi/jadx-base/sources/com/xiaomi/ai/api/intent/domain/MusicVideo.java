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
public class MusicVideo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<MusicPlayer>> media_player = Optional.a();
    private Optional<Slot<PlaybackMode.PlayMode>> play_mode = Optional.a();
    private Optional<Slot<Long>> play_duration = Optional.a();
    private Optional<Slot<Boolean>> is_whole_house_play = Optional.a();
    private Optional<Slot<Integer>> offset = Optional.a();
    private Optional<Slot<String>> trunk_query = Optional.a();
    private Optional<Slot<PlayIntent.AudioSourceType>> audio_source = Optional.a();
    private Optional<Slot<MusicEmotion>> emotion = Optional.a();
    private Optional<Slot<MusicFeature>> features = Optional.a();
    private Optional<Slot<Boolean>> open_app = Optional.a();
    private Optional<Slot<Boolean>> is_continue_play = Optional.a();

    public static class album implements EntityType {

        @Required
        private Slot<Miai.MusicAlbum> name;

        public album() {
        }

        public album(Slot<Miai.MusicAlbum> slot) {
            this.name = slot;
        }

        public static album read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            album albumVar = new album();
            albumVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MusicAlbum.class));
            return albumVar;
        }

        public static c4h write(album albumVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(albumVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.MusicAlbum> getName() {
            return this.name;
        }

        @Required
        public album setName(Slot<Miai.MusicAlbum> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class artist implements EntityType {

        @Required
        private Slot<Miai.Artist> name;

        public artist() {
        }

        public artist(Slot<Miai.Artist> slot) {
            this.name = slot;
        }

        public static artist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            artist artistVar = new artist();
            artistVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Artist.class));
            return artistVar;
        }

        public static c4h write(artist artistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(artistVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Artist> getName() {
            return this.name;
        }

        @Required
        public artist setName(Slot<Miai.Artist> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class combination implements EntityType {
        private Optional<Slot<Miai.MusicAlbum>> album = Optional.a();
        private Optional<Slot<Miai.Artist>> artist = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<Miai.Song>> song = Optional.a();
        private Optional<Slot<Miai.Lyricist>> lyricist = Optional.a();
        private Optional<Slot<Miai.Composer>> composer = Optional.a();

        public static combination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            combination combinationVar = new combination();
            if (zsdVar.z("album")) {
                combinationVar.setAlbum(IntentUtils.readSlot(zsdVar.w("album"), Miai.MusicAlbum.class));
            }
            if (zsdVar.z("artist")) {
                combinationVar.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z("tag")) {
                combinationVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("song")) {
                combinationVar.setSong(IntentUtils.readSlot(zsdVar.w("song"), Miai.Song.class));
            }
            if (zsdVar.z("lyricist")) {
                combinationVar.setLyricist(IntentUtils.readSlot(zsdVar.w("lyricist"), Miai.Lyricist.class));
            }
            if (zsdVar.z("composer")) {
                combinationVar.setComposer(IntentUtils.readSlot(zsdVar.w("composer"), Miai.Composer.class));
            }
            return combinationVar;
        }

        public static c4h write(combination combinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (combinationVar.album.c()) {
                c4hVarCreateObjectNode.f0("album", IntentUtils.writeSlot(combinationVar.album.b()));
            }
            if (combinationVar.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(combinationVar.artist.b()));
            }
            if (combinationVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(combinationVar.tag.b()));
            }
            if (combinationVar.song.c()) {
                c4hVarCreateObjectNode.f0("song", IntentUtils.writeSlot(combinationVar.song.b()));
            }
            if (combinationVar.lyricist.c()) {
                c4hVarCreateObjectNode.f0("lyricist", IntentUtils.writeSlot(combinationVar.lyricist.b()));
            }
            if (combinationVar.composer.c()) {
                c4hVarCreateObjectNode.f0("composer", IntentUtils.writeSlot(combinationVar.composer.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.MusicAlbum>> getAlbum() {
            return this.album;
        }

        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        public Optional<Slot<Miai.Composer>> getComposer() {
            return this.composer;
        }

        public Optional<Slot<Miai.Lyricist>> getLyricist() {
            return this.lyricist;
        }

        public Optional<Slot<Miai.Song>> getSong() {
            return this.song;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public combination setAlbum(Slot<Miai.MusicAlbum> slot) {
            this.album = Optional.e(slot);
            return this;
        }

        public combination setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        public combination setComposer(Slot<Miai.Composer> slot) {
            this.composer = Optional.e(slot);
            return this;
        }

        public combination setLyricist(Slot<Miai.Lyricist> slot) {
            this.lyricist = Optional.e(slot);
            return this;
        }

        public combination setSong(Slot<Miai.Song> slot) {
            this.song = Optional.e(slot);
            return this;
        }

        public combination setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }
    }

    public static class composer implements EntityType {

        @Required
        private Slot<Miai.Composer> name;

        public composer() {
        }

        public composer(Slot<Miai.Composer> slot) {
            this.name = slot;
        }

        public static composer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            composer composerVar = new composer();
            composerVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Composer.class));
            return composerVar;
        }

        public static c4h write(composer composerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(composerVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Composer> getName() {
            return this.name;
        }

        @Required
        public composer setName(Slot<Miai.Composer> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class keyword implements EntityType {

        @Required
        private Slot<String> name;

        public keyword() {
        }

        public keyword(Slot<String> slot) {
            this.name = slot;
        }

        public static keyword read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            keyword keywordVar = new keyword();
            keywordVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return keywordVar;
        }

        public static c4h write(keyword keywordVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(keywordVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public keyword setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class lyric implements EntityType {

        @Required
        private Slot<Miai.Song> song;

        public lyric() {
        }

        public lyric(Slot<Miai.Song> slot) {
            this.song = slot;
        }

        public static lyric read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            lyric lyricVar = new lyric();
            lyricVar.setSong(IntentUtils.readSlot(zsdVar.w("song"), Miai.Song.class));
            return lyricVar;
        }

        public static c4h write(lyric lyricVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("song", IntentUtils.writeSlot(lyricVar.song));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Song> getSong() {
            return this.song;
        }

        @Required
        public lyric setSong(Slot<Miai.Song> slot) {
            this.song = slot;
            return this;
        }
    }

    public static class lyricist implements EntityType {

        @Required
        private Slot<Miai.Lyricist> name;

        public lyricist() {
        }

        public lyricist(Slot<Miai.Lyricist> slot) {
            this.name = slot;
        }

        public static lyricist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            lyricist lyricistVar = new lyricist();
            lyricistVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Lyricist.class));
            return lyricistVar;
        }

        public static c4h write(lyricist lyricistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(lyricistVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Lyricist> getName() {
            return this.name;
        }

        @Required
        public lyricist setName(Slot<Miai.Lyricist> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class song implements EntityType {

        @Required
        private Slot<Miai.Song> name;

        public song() {
        }

        public song(Slot<Miai.Song> slot) {
            this.name = slot;
        }

        public static song read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            song songVar = new song();
            songVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Song.class));
            return songVar;
        }

        public static c4h write(song songVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(songVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Song> getName() {
            return this.name;
        }

        @Required
        public song setName(Slot<Miai.Song> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class tag implements EntityType {

        @Required
        private Slot<String> name;

        public tag() {
        }

        public tag(Slot<String> slot) {
            this.name = slot;
        }

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            tagVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tagVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public tag setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public MusicVideo() {
    }

    public static MusicVideo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MusicVideo musicVideo = new MusicVideo(IntentUtils.readEntityType(zsdVar, AIApiConstants.MusicVideo.NAME, optional));
        if (zsdVar.z("media_player")) {
            musicVideo.setMediaPlayer(IntentUtils.readSlot(zsdVar.w("media_player"), MusicPlayer.class));
        }
        if (zsdVar.z("play_mode")) {
            musicVideo.setPlayMode(IntentUtils.readSlot(zsdVar.w("play_mode"), PlaybackMode.PlayMode.class));
        }
        if (zsdVar.z("play_duration")) {
            musicVideo.setPlayDuration(IntentUtils.readSlot(zsdVar.w("play_duration"), Long.class));
        }
        if (zsdVar.z("is_whole_house_play")) {
            musicVideo.setIsWholeHousePlay(IntentUtils.readSlot(zsdVar.w("is_whole_house_play"), Boolean.class));
        }
        if (zsdVar.z("offset")) {
            musicVideo.setOffset(IntentUtils.readSlot(zsdVar.w("offset"), Integer.class));
        }
        if (zsdVar.z("trunk_query")) {
            musicVideo.setTrunkQuery(IntentUtils.readSlot(zsdVar.w("trunk_query"), String.class));
        }
        if (zsdVar.z("audio_source")) {
            musicVideo.setAudioSource(IntentUtils.readSlot(zsdVar.w("audio_source"), PlayIntent.AudioSourceType.class));
        }
        if (zsdVar.z("emotion")) {
            musicVideo.setEmotion(IntentUtils.readSlot(zsdVar.w("emotion"), MusicEmotion.class));
        }
        if (zsdVar.z("features")) {
            musicVideo.setFeatures(IntentUtils.readSlot(zsdVar.w("features"), MusicFeature.class));
        }
        if (zsdVar.z("open_app")) {
            musicVideo.setOpenApp(IntentUtils.readSlot(zsdVar.w("open_app"), Boolean.class));
        }
        if (zsdVar.z("is_continue_play")) {
            musicVideo.setIsContinuePlay(IntentUtils.readSlot(zsdVar.w("is_continue_play"), Boolean.class));
        }
        return musicVideo;
    }

    public static zsd write(MusicVideo musicVideo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(musicVideo.entity_type);
        if (musicVideo.media_player.c()) {
            c4hVar.f0("media_player", IntentUtils.writeSlot(musicVideo.media_player.b()));
        }
        if (musicVideo.play_mode.c()) {
            c4hVar.f0("play_mode", IntentUtils.writeSlot(musicVideo.play_mode.b()));
        }
        if (musicVideo.play_duration.c()) {
            c4hVar.f0("play_duration", IntentUtils.writeSlot(musicVideo.play_duration.b()));
        }
        if (musicVideo.is_whole_house_play.c()) {
            c4hVar.f0("is_whole_house_play", IntentUtils.writeSlot(musicVideo.is_whole_house_play.b()));
        }
        if (musicVideo.offset.c()) {
            c4hVar.f0("offset", IntentUtils.writeSlot(musicVideo.offset.b()));
        }
        if (musicVideo.trunk_query.c()) {
            c4hVar.f0("trunk_query", IntentUtils.writeSlot(musicVideo.trunk_query.b()));
        }
        if (musicVideo.audio_source.c()) {
            c4hVar.f0("audio_source", IntentUtils.writeSlot(musicVideo.audio_source.b()));
        }
        if (musicVideo.emotion.c()) {
            c4hVar.f0("emotion", IntentUtils.writeSlot(musicVideo.emotion.b()));
        }
        if (musicVideo.features.c()) {
            c4hVar.f0("features", IntentUtils.writeSlot(musicVideo.features.b()));
        }
        if (musicVideo.open_app.c()) {
            c4hVar.f0("open_app", IntentUtils.writeSlot(musicVideo.open_app.b()));
        }
        if (musicVideo.is_continue_play.c()) {
            c4hVar.f0("is_continue_play", IntentUtils.writeSlot(musicVideo.is_continue_play.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<PlayIntent.AudioSourceType>> getAudioSource() {
        return this.audio_source;
    }

    public Optional<Slot<MusicEmotion>> getEmotion() {
        return this.emotion;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<MusicFeature>> getFeatures() {
        return this.features;
    }

    public Optional<Slot<Boolean>> getIsContinuePlay() {
        return this.is_continue_play;
    }

    public Optional<Slot<Boolean>> getIsWholeHousePlay() {
        return this.is_whole_house_play;
    }

    public Optional<Slot<MusicPlayer>> getMediaPlayer() {
        return this.media_player;
    }

    public Optional<Slot<Integer>> getOffset() {
        return this.offset;
    }

    public Optional<Slot<Boolean>> getOpenApp() {
        return this.open_app;
    }

    public Optional<Slot<Long>> getPlayDuration() {
        return this.play_duration;
    }

    public Optional<Slot<PlaybackMode.PlayMode>> getPlayMode() {
        return this.play_mode;
    }

    public Optional<Slot<String>> getTrunkQuery() {
        return this.trunk_query;
    }

    public MusicVideo setAudioSource(Slot<PlayIntent.AudioSourceType> slot) {
        this.audio_source = Optional.e(slot);
        return this;
    }

    public MusicVideo setEmotion(Slot<MusicEmotion> slot) {
        this.emotion = Optional.e(slot);
        return this;
    }

    @Required
    public MusicVideo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MusicVideo setFeatures(Slot<MusicFeature> slot) {
        this.features = Optional.e(slot);
        return this;
    }

    public MusicVideo setIsContinuePlay(Slot<Boolean> slot) {
        this.is_continue_play = Optional.e(slot);
        return this;
    }

    public MusicVideo setIsWholeHousePlay(Slot<Boolean> slot) {
        this.is_whole_house_play = Optional.e(slot);
        return this;
    }

    public MusicVideo setMediaPlayer(Slot<MusicPlayer> slot) {
        this.media_player = Optional.e(slot);
        return this;
    }

    public MusicVideo setOffset(Slot<Integer> slot) {
        this.offset = Optional.e(slot);
        return this;
    }

    public MusicVideo setOpenApp(Slot<Boolean> slot) {
        this.open_app = Optional.e(slot);
        return this;
    }

    public MusicVideo setPlayDuration(Slot<Long> slot) {
        this.play_duration = Optional.e(slot);
        return this;
    }

    public MusicVideo setPlayMode(Slot<PlaybackMode.PlayMode> slot) {
        this.play_mode = Optional.e(slot);
        return this;
    }

    public MusicVideo setTrunkQuery(Slot<String> slot) {
        this.trunk_query = Optional.e(slot);
        return this;
    }

    public static class history implements EntityType {

        @Required
        private Slot<Miai.Datetime> datetime;
        private Optional<Slot<String>> tag = Optional.a();

        public history() {
        }

        public static history read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            history historyVar = new history();
            historyVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            if (zsdVar.z("tag")) {
                historyVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return historyVar;
        }

        public static c4h write(history historyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(historyVar.datetime));
            if (historyVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(historyVar.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Datetime> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        @Required
        public history setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
            return this;
        }

        public history setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public history(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
        }
    }

    public MusicVideo(T t) {
        this.entity_type = t;
    }
}
