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
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class BookStation<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> resource_type = Optional.a();
    private Optional<Slot<String>> payment = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<Miai.ContentProvider>> content_provider = Optional.a();
    private Optional<Slot<String>> trunk_query = Optional.a();
    private Optional<Slot<Miai.Duration>> play_duration = Optional.a();
    private Optional<Slot<StationFeature>> features = Optional.a();
    private Optional<Slot<Boolean>> open_app = Optional.a();
    private Optional<Slot<Boolean>> is_purchased = Optional.a();

    public static class combination implements EntityType {
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<Miai.Artist>> artist = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();
        private Optional<Slot<Miai.FictionalCharacter>> character = Optional.a();
        private Optional<Slot<Miai.Age>> contentAge = Optional.a();

        @Deprecated
        private Optional<Slot<String>> scene = Optional.a();

        @Deprecated
        private Optional<Slot<String>> keyword = Optional.a();

        @Deprecated
        private Optional<Slot<String>> content_provider = Optional.a();

        public static combination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            combination combinationVar = new combination();
            if (zsdVar.z("type")) {
                combinationVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                combinationVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("artist")) {
                combinationVar.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z("datetime")) {
                combinationVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("season")) {
                combinationVar.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                combinationVar.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            if (zsdVar.z("character")) {
                combinationVar.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), Miai.FictionalCharacter.class));
            }
            if (zsdVar.z("contentAge")) {
                combinationVar.setContentAge(IntentUtils.readSlot(zsdVar.w("contentAge"), Miai.Age.class));
            }
            if (zsdVar.z("scene")) {
                combinationVar.setScene(IntentUtils.readSlot(zsdVar.w("scene"), String.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                combinationVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            if (zsdVar.z("content_provider")) {
                combinationVar.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), String.class));
            }
            return combinationVar;
        }

        public static c4h write(combination combinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (combinationVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(combinationVar.type.b()));
            }
            if (combinationVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(combinationVar.tag.b()));
            }
            if (combinationVar.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(combinationVar.artist.b()));
            }
            if (combinationVar.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(combinationVar.datetime.b()));
            }
            if (combinationVar.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(combinationVar.season.b()));
            }
            if (combinationVar.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(combinationVar.episode.b()));
            }
            if (combinationVar.character.c()) {
                c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(combinationVar.character.b()));
            }
            if (combinationVar.contentAge.c()) {
                c4hVarCreateObjectNode.f0("contentAge", IntentUtils.writeSlot(combinationVar.contentAge.b()));
            }
            if (combinationVar.scene.c()) {
                c4hVarCreateObjectNode.f0("scene", IntentUtils.writeSlot(combinationVar.scene.b()));
            }
            if (combinationVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(combinationVar.keyword.b()));
            }
            if (combinationVar.content_provider.c()) {
                c4hVarCreateObjectNode.f0("content_provider", IntentUtils.writeSlot(combinationVar.content_provider.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        public Optional<Slot<Miai.FictionalCharacter>> getCharacter() {
            return this.character;
        }

        public Optional<Slot<Miai.Age>> getContentAge() {
            return this.contentAge;
        }

        @Deprecated
        public Optional<Slot<String>> getContentProvider() {
            return this.content_provider;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        @Deprecated
        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        @Deprecated
        public Optional<Slot<String>> getScene() {
            return this.scene;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public combination setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        public combination setCharacter(Slot<Miai.FictionalCharacter> slot) {
            this.character = Optional.e(slot);
            return this;
        }

        public combination setContentAge(Slot<Miai.Age> slot) {
            this.contentAge = Optional.e(slot);
            return this;
        }

        @Deprecated
        public combination setContentProvider(Slot<String> slot) {
            this.content_provider = Optional.e(slot);
            return this;
        }

        public combination setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public combination setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        @Deprecated
        public combination setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        @Deprecated
        public combination setScene(Slot<String> slot) {
            this.scene = Optional.e(slot);
            return this;
        }

        public combination setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public combination setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public combination setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public static class content implements EntityType {
        private Optional<Slot<Miai.RadioName>> name = Optional.a();
        private Optional<Slot<String>> sound_name = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<Miai.Artist>> artist = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();

        @Deprecated
        private Optional<Slot<String>> keyword = Optional.a();

        @Deprecated
        private Optional<Slot<String>> content_provider = Optional.a();
        private Optional<Slot<Miai.FictionalCharacter>> character = Optional.a();

        public static content read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            content contentVar = new content();
            if (zsdVar.z("name")) {
                contentVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.RadioName.class));
            }
            if (zsdVar.z("sound_name")) {
                contentVar.setSoundName(IntentUtils.readSlot(zsdVar.w("sound_name"), String.class));
            }
            if (zsdVar.z("type")) {
                contentVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                contentVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("artist")) {
                contentVar.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z("datetime")) {
                contentVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("season")) {
                contentVar.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                contentVar.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                contentVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            if (zsdVar.z("content_provider")) {
                contentVar.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), String.class));
            }
            if (zsdVar.z("character")) {
                contentVar.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), Miai.FictionalCharacter.class));
            }
            return contentVar;
        }

        public static c4h write(content contentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (contentVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(contentVar.name.b()));
            }
            if (contentVar.sound_name.c()) {
                c4hVarCreateObjectNode.f0("sound_name", IntentUtils.writeSlot(contentVar.sound_name.b()));
            }
            if (contentVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(contentVar.type.b()));
            }
            if (contentVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(contentVar.tag.b()));
            }
            if (contentVar.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(contentVar.artist.b()));
            }
            if (contentVar.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(contentVar.datetime.b()));
            }
            if (contentVar.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(contentVar.season.b()));
            }
            if (contentVar.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(contentVar.episode.b()));
            }
            if (contentVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(contentVar.keyword.b()));
            }
            if (contentVar.content_provider.c()) {
                c4hVarCreateObjectNode.f0("content_provider", IntentUtils.writeSlot(contentVar.content_provider.b()));
            }
            if (contentVar.character.c()) {
                c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(contentVar.character.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        public Optional<Slot<Miai.FictionalCharacter>> getCharacter() {
            return this.character;
        }

        @Deprecated
        public Optional<Slot<String>> getContentProvider() {
            return this.content_provider;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        @Deprecated
        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<Miai.RadioName>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<String>> getSoundName() {
            return this.sound_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public content setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        public content setCharacter(Slot<Miai.FictionalCharacter> slot) {
            this.character = Optional.e(slot);
            return this;
        }

        @Deprecated
        public content setContentProvider(Slot<String> slot) {
            this.content_provider = Optional.e(slot);
            return this;
        }

        public content setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public content setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        @Deprecated
        public content setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        public content setName(Slot<Miai.RadioName> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public content setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public content setSoundName(Slot<String> slot) {
            this.sound_name = Optional.e(slot);
            return this;
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

    public static class history implements EntityType {
        private Optional<Slot<Miai.RadioName>> name = Optional.a();
        private Optional<Slot<String>> sound_name = Optional.a();
        private Optional<Slot<Miai.Artist>> artist = Optional.a();
        private Optional<Slot<Miai.FictionalCharacter>> character = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();

        @Deprecated
        private Optional<Slot<String>> content_provider = Optional.a();
        private Optional<Slot<Miai.Age>> content_age = Optional.a();

        @Deprecated
        private Optional<Slot<String>> keyword = Optional.a();

        public static history read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            history historyVar = new history();
            if (zsdVar.z("name")) {
                historyVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.RadioName.class));
            }
            if (zsdVar.z("sound_name")) {
                historyVar.setSoundName(IntentUtils.readSlot(zsdVar.w("sound_name"), String.class));
            }
            if (zsdVar.z("artist")) {
                historyVar.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z("character")) {
                historyVar.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), Miai.FictionalCharacter.class));
            }
            if (zsdVar.z("type")) {
                historyVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                historyVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("season")) {
                historyVar.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                historyVar.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            if (zsdVar.z("datetime")) {
                historyVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            if (zsdVar.z("content_provider")) {
                historyVar.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), String.class));
            }
            if (zsdVar.z("content_age")) {
                historyVar.setContentAge(IntentUtils.readSlot(zsdVar.w("content_age"), Miai.Age.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                historyVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            return historyVar;
        }

        public static c4h write(history historyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (historyVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(historyVar.name.b()));
            }
            if (historyVar.sound_name.c()) {
                c4hVarCreateObjectNode.f0("sound_name", IntentUtils.writeSlot(historyVar.sound_name.b()));
            }
            if (historyVar.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(historyVar.artist.b()));
            }
            if (historyVar.character.c()) {
                c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(historyVar.character.b()));
            }
            if (historyVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(historyVar.type.b()));
            }
            if (historyVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(historyVar.tag.b()));
            }
            if (historyVar.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(historyVar.season.b()));
            }
            if (historyVar.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(historyVar.episode.b()));
            }
            if (historyVar.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(historyVar.datetime.b()));
            }
            if (historyVar.content_provider.c()) {
                c4hVarCreateObjectNode.f0("content_provider", IntentUtils.writeSlot(historyVar.content_provider.b()));
            }
            if (historyVar.content_age.c()) {
                c4hVarCreateObjectNode.f0("content_age", IntentUtils.writeSlot(historyVar.content_age.b()));
            }
            if (historyVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(historyVar.keyword.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        public Optional<Slot<Miai.FictionalCharacter>> getCharacter() {
            return this.character;
        }

        public Optional<Slot<Miai.Age>> getContentAge() {
            return this.content_age;
        }

        @Deprecated
        public Optional<Slot<String>> getContentProvider() {
            return this.content_provider;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        @Deprecated
        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<Miai.RadioName>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<String>> getSoundName() {
            return this.sound_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public history setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        public history setCharacter(Slot<Miai.FictionalCharacter> slot) {
            this.character = Optional.e(slot);
            return this;
        }

        public history setContentAge(Slot<Miai.Age> slot) {
            this.content_age = Optional.e(slot);
            return this;
        }

        @Deprecated
        public history setContentProvider(Slot<String> slot) {
            this.content_provider = Optional.e(slot);
            return this;
        }

        public history setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }

        public history setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        @Deprecated
        public history setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        public history setName(Slot<Miai.RadioName> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public history setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public history setSoundName(Slot<String> slot) {
            this.sound_name = Optional.e(slot);
            return this;
        }

        public history setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public history setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public static class tag implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<String>> type = Optional.a();

        @Deprecated
        private Optional<Slot<Miai.FictionalCharacter>> character = Optional.a();

        @Deprecated
        private Optional<Slot<Miai.Artist>> artist = Optional.a();

        @Deprecated
        private Optional<Slot<String>> keyword = Optional.a();

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            if (zsdVar.z("name")) {
                tagVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("type")) {
                tagVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("character")) {
                tagVar.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), Miai.FictionalCharacter.class));
            }
            if (zsdVar.z("artist")) {
                tagVar.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                tagVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (tagVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tagVar.name.b()));
            }
            if (tagVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(tagVar.type.b()));
            }
            if (tagVar.character.c()) {
                c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(tagVar.character.b()));
            }
            if (tagVar.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(tagVar.artist.b()));
            }
            if (tagVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(tagVar.keyword.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Deprecated
        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        @Deprecated
        public Optional<Slot<Miai.FictionalCharacter>> getCharacter() {
            return this.character;
        }

        @Deprecated
        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Deprecated
        public tag setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        @Deprecated
        public tag setCharacter(Slot<Miai.FictionalCharacter> slot) {
            this.character = Optional.e(slot);
            return this;
        }

        @Deprecated
        public tag setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        public tag setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public tag setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public BookStation() {
    }

    public static BookStation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BookStation bookStation = new BookStation(IntentUtils.readEntityType(zsdVar, AIApiConstants.BookStation.NAME, optional));
        if (zsdVar.z("resource_type")) {
            bookStation.setResourceType(IntentUtils.readSlot(zsdVar.w("resource_type"), String.class));
        }
        if (zsdVar.z("payment")) {
            bookStation.setPayment(IntentUtils.readSlot(zsdVar.w("payment"), String.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            bookStation.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("content_provider")) {
            bookStation.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), Miai.ContentProvider.class));
        }
        if (zsdVar.z("trunk_query")) {
            bookStation.setTrunkQuery(IntentUtils.readSlot(zsdVar.w("trunk_query"), String.class));
        }
        if (zsdVar.z("play_duration")) {
            bookStation.setPlayDuration(IntentUtils.readSlot(zsdVar.w("play_duration"), Miai.Duration.class));
        }
        if (zsdVar.z("features")) {
            bookStation.setFeatures(IntentUtils.readSlot(zsdVar.w("features"), StationFeature.class));
        }
        if (zsdVar.z("open_app")) {
            bookStation.setOpenApp(IntentUtils.readSlot(zsdVar.w("open_app"), Boolean.class));
        }
        if (zsdVar.z("is_purchased")) {
            bookStation.setIsPurchased(IntentUtils.readSlot(zsdVar.w("is_purchased"), Boolean.class));
        }
        return bookStation;
    }

    public static zsd write(BookStation bookStation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(bookStation.entity_type);
        if (bookStation.resource_type.c()) {
            c4hVar.f0("resource_type", IntentUtils.writeSlot(bookStation.resource_type.b()));
        }
        if (bookStation.payment.c()) {
            c4hVar.f0("payment", IntentUtils.writeSlot(bookStation.payment.b()));
        }
        if (bookStation.keyword.c()) {
            c4hVar.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(bookStation.keyword.b()));
        }
        if (bookStation.content_provider.c()) {
            c4hVar.f0("content_provider", IntentUtils.writeSlot(bookStation.content_provider.b()));
        }
        if (bookStation.trunk_query.c()) {
            c4hVar.f0("trunk_query", IntentUtils.writeSlot(bookStation.trunk_query.b()));
        }
        if (bookStation.play_duration.c()) {
            c4hVar.f0("play_duration", IntentUtils.writeSlot(bookStation.play_duration.b()));
        }
        if (bookStation.features.c()) {
            c4hVar.f0("features", IntentUtils.writeSlot(bookStation.features.b()));
        }
        if (bookStation.open_app.c()) {
            c4hVar.f0("open_app", IntentUtils.writeSlot(bookStation.open_app.b()));
        }
        if (bookStation.is_purchased.c()) {
            c4hVar.f0("is_purchased", IntentUtils.writeSlot(bookStation.is_purchased.b()));
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

    public Optional<Slot<StationFeature>> getFeatures() {
        return this.features;
    }

    public Optional<Slot<Boolean>> getIsPurchased() {
        return this.is_purchased;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public Optional<Slot<Boolean>> getOpenApp() {
        return this.open_app;
    }

    public Optional<Slot<String>> getPayment() {
        return this.payment;
    }

    public Optional<Slot<Miai.Duration>> getPlayDuration() {
        return this.play_duration;
    }

    public Optional<Slot<String>> getResourceType() {
        return this.resource_type;
    }

    public Optional<Slot<String>> getTrunkQuery() {
        return this.trunk_query;
    }

    public BookStation setContentProvider(Slot<Miai.ContentProvider> slot) {
        this.content_provider = Optional.e(slot);
        return this;
    }

    @Required
    public BookStation setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public BookStation setFeatures(Slot<StationFeature> slot) {
        this.features = Optional.e(slot);
        return this;
    }

    public BookStation setIsPurchased(Slot<Boolean> slot) {
        this.is_purchased = Optional.e(slot);
        return this;
    }

    public BookStation setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public BookStation setOpenApp(Slot<Boolean> slot) {
        this.open_app = Optional.e(slot);
        return this;
    }

    public BookStation setPayment(Slot<String> slot) {
        this.payment = Optional.e(slot);
        return this;
    }

    public BookStation setPlayDuration(Slot<Miai.Duration> slot) {
        this.play_duration = Optional.e(slot);
        return this;
    }

    public BookStation setResourceType(Slot<String> slot) {
        this.resource_type = Optional.e(slot);
        return this;
    }

    public BookStation setTrunkQuery(Slot<String> slot) {
        this.trunk_query = Optional.e(slot);
        return this;
    }

    public static class age implements EntityType {

        @Required
        private Slot<Miai.Age> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public age() {
        }

        public static age read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            age ageVar = new age();
            ageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Age.class));
            if (zsdVar.z("type")) {
                ageVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                ageVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return ageVar;
        }

        public static c4h write(age ageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(ageVar.name));
            if (ageVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(ageVar.type.b()));
            }
            if (ageVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(ageVar.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Age> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public age setName(Slot<Miai.Age> slot) {
            this.name = slot;
            return this;
        }

        public age setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public age setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public age(Slot<Miai.Age> slot) {
            this.name = slot;
        }
    }

    public static class artist implements EntityType {

        @Required
        private Slot<Miai.Artist> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public artist() {
        }

        public static artist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            artist artistVar = new artist();
            artistVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Artist.class));
            if (zsdVar.z("type")) {
                artistVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                artistVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return artistVar;
        }

        public static c4h write(artist artistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(artistVar.name));
            if (artistVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(artistVar.type.b()));
            }
            if (artistVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(artistVar.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Artist> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public artist setName(Slot<Miai.Artist> slot) {
            this.name = slot;
            return this;
        }

        public artist setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public artist setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public artist(Slot<Miai.Artist> slot) {
            this.name = slot;
        }
    }

    public static class character implements EntityType {

        @Required
        private Slot<Miai.FictionalCharacter> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public character() {
        }

        public static character read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            character characterVar = new character();
            characterVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.FictionalCharacter.class));
            if (zsdVar.z("type")) {
                characterVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                characterVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return characterVar;
        }

        public static c4h write(character characterVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(characterVar.name));
            if (characterVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(characterVar.type.b()));
            }
            if (characterVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(characterVar.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.FictionalCharacter> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public character setName(Slot<Miai.FictionalCharacter> slot) {
            this.name = slot;
            return this;
        }

        public character setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public character setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public character(Slot<Miai.FictionalCharacter> slot) {
            this.name = slot;
        }
    }

    public static class contentProvider implements EntityType {

        @Required
        private Slot<Miai.ContentProvider> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public contentProvider() {
        }

        public static contentProvider read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            contentProvider contentprovider = new contentProvider();
            contentprovider.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.ContentProvider.class));
            if (zsdVar.z("type")) {
                contentprovider.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                contentprovider.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return contentprovider;
        }

        public static c4h write(contentProvider contentprovider) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(contentprovider.name));
            if (contentprovider.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(contentprovider.type.b()));
            }
            if (contentprovider.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(contentprovider.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.ContentProvider> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public contentProvider setName(Slot<Miai.ContentProvider> slot) {
            this.name = slot;
            return this;
        }

        public contentProvider setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public contentProvider setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public contentProvider(Slot<Miai.ContentProvider> slot) {
            this.name = slot;
        }
    }

    public BookStation(T t) {
        this.entity_type = t;
    }
}
