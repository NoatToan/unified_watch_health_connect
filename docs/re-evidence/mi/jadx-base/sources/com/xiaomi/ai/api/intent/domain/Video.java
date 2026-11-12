package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.common.Required;
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
public class Video<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> trunk_query = Optional.a();
    private Optional<Slot<String>> keyword_tag = Optional.a();
    private Optional<Slot<Miai.ContentProvider>> content_provider = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<VideoFeature>> features = Optional.a();

    public enum Order {
        Desc(1, "desc"),
        Asc(2, "asc");

        private int id;
        private String name;

        Order(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Order find(String str) {
            for (Order order : values()) {
                if (order.name.equals(str)) {
                    return order;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Order read(String str) {
            return find(str);
        }

        public static String write(Order order) {
            return order.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ScreenResolution {
        Fluent(0, "Fluent"),
        Speed(1, "Speed"),
        StandardDefinition(2, "StandardDefinition"),
        HighDefinition(3, "HighDefinition"),
        UltraHighDefinition(4, "UltraHighDefinition"),
        _720P(5, "720P"),
        _1080P(6, "1080P"),
        _4K(7, "4K");

        private int id;
        private String name;

        ScreenResolution(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ScreenResolution find(String str) {
            for (ScreenResolution screenResolution : values()) {
                if (screenResolution.name.equals(str)) {
                    return screenResolution;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ScreenResolution read(String str) {
            return find(str);
        }

        public static String write(ScreenResolution screenResolution) {
            return screenResolution.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class artist implements EntityType {
        private Optional<Slot<Miai.Artist>> name = Optional.a();
        private Optional<Slot<Miai.Artist>> actor = Optional.a();
        private Optional<Slot<Miai.Artist>> director = Optional.a();
        private Optional<Slot<Miai.Artist>> singer = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();

        public static artist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            artist artistVar = new artist();
            if (zsdVar.z("name")) {
                artistVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Artist.class));
            }
            if (zsdVar.z("actor")) {
                artistVar.setActor(IntentUtils.readSlot(zsdVar.w("actor"), Miai.Artist.class));
            }
            if (zsdVar.z("director")) {
                artistVar.setDirector(IntentUtils.readSlot(zsdVar.w("director"), Miai.Artist.class));
            }
            if (zsdVar.z("singer")) {
                artistVar.setSinger(IntentUtils.readSlot(zsdVar.w("singer"), Miai.Artist.class));
            }
            if (zsdVar.z("type")) {
                artistVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                artistVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                artistVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            return artistVar;
        }

        public static c4h write(artist artistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (artistVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(artistVar.name.b()));
            }
            if (artistVar.actor.c()) {
                c4hVarCreateObjectNode.f0("actor", IntentUtils.writeSlot(artistVar.actor.b()));
            }
            if (artistVar.director.c()) {
                c4hVarCreateObjectNode.f0("director", IntentUtils.writeSlot(artistVar.director.b()));
            }
            if (artistVar.singer.c()) {
                c4hVarCreateObjectNode.f0("singer", IntentUtils.writeSlot(artistVar.singer.b()));
            }
            if (artistVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(artistVar.type.b()));
            }
            if (artistVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(artistVar.tag.b()));
            }
            if (artistVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(artistVar.category.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Artist>> getActor() {
            return this.actor;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.Artist>> getDirector() {
            return this.director;
        }

        public Optional<Slot<Miai.Artist>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Artist>> getSinger() {
            return this.singer;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public artist setActor(Slot<Miai.Artist> slot) {
            this.actor = Optional.e(slot);
            return this;
        }

        public artist setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public artist setDirector(Slot<Miai.Artist> slot) {
            this.director = Optional.e(slot);
            return this;
        }

        public artist setName(Slot<Miai.Artist> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public artist setSinger(Slot<Miai.Artist> slot) {
            this.singer = Optional.e(slot);
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
    }

    public static class combination implements EntityType {
        private Optional<Slot<Miai.Artist>> artist = Optional.a();
        private Optional<Slot<Miai.Artist>> actor = Optional.a();
        private Optional<Slot<Miai.Artist>> director = Optional.a();
        private Optional<Slot<Miai.Artist>> singer = Optional.a();
        private Optional<Slot<Miai.MovieName>> name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();
        private Optional<Slot<String>> v_type = Optional.a();
        private Optional<Slot<String>> keyword = Optional.a();
        private Optional<Slot<Boolean>> payment = Optional.a();
        private Optional<Slot<Miai.Language>> language = Optional.a();
        private Optional<Slot<Miai.Datetime>> publish_time = Optional.a();
        private Optional<Slot<ScreenResolution>> resolution = Optional.a();
        private Optional<Slot<Miai.ContentProvider>> content_provider = Optional.a();
        private Optional<Slot<Miai.Rating>> content_rating = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Miai.Location>> area = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> sub_award = Optional.a();
        private Optional<Slot<Miai.Datetime>> award_year = Optional.a();
        private Optional<Slot<Order>> publish_time_order = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<Miai.Age>> age = Optional.a();
        private Optional<Slot<Miai.FictionalCharacter>> character = Optional.a();
        private Optional<Slot<Order>> popularity = Optional.a();
        private Optional<Slot<Miai.MovieAward>> award = Optional.a();
        private Optional<Slot<Order>> rating_order = Optional.a();
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<String>> publisher = Optional.a();
        private Optional<Slot<String>> box = Optional.a();

        public static combination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            combination combinationVar = new combination();
            if (zsdVar.z("artist")) {
                combinationVar.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
            }
            if (zsdVar.z("actor")) {
                combinationVar.setActor(IntentUtils.readSlot(zsdVar.w("actor"), Miai.Artist.class));
            }
            if (zsdVar.z("director")) {
                combinationVar.setDirector(IntentUtils.readSlot(zsdVar.w("director"), Miai.Artist.class));
            }
            if (zsdVar.z("singer")) {
                combinationVar.setSinger(IntentUtils.readSlot(zsdVar.w("singer"), Miai.Artist.class));
            }
            if (zsdVar.z("name")) {
                combinationVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                combinationVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                combinationVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("season")) {
                combinationVar.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                combinationVar.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            if (zsdVar.z("v_type")) {
                combinationVar.setVType(IntentUtils.readSlot(zsdVar.w("v_type"), String.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                combinationVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            if (zsdVar.z("payment")) {
                combinationVar.setPayment(IntentUtils.readSlot(zsdVar.w("payment"), Boolean.class));
            }
            if (zsdVar.z("language")) {
                combinationVar.setLanguage(IntentUtils.readSlot(zsdVar.w("language"), Miai.Language.class));
            }
            if (zsdVar.z("publish_time")) {
                combinationVar.setPublishTime(IntentUtils.readSlot(zsdVar.w("publish_time"), Miai.Datetime.class));
            }
            if (zsdVar.z("resolution")) {
                combinationVar.setResolution(IntentUtils.readSlot(zsdVar.w("resolution"), ScreenResolution.class));
            }
            if (zsdVar.z("content_provider")) {
                combinationVar.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), Miai.ContentProvider.class));
            }
            if (zsdVar.z("content_rating")) {
                combinationVar.setContentRating(IntentUtils.readSlot(zsdVar.w("content_rating"), Miai.Rating.class));
            }
            if (zsdVar.z("category")) {
                combinationVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("area")) {
                combinationVar.setArea(IntentUtils.readSlot(zsdVar.w("area"), Miai.Location.class));
            }
            if (zsdVar.z("tag")) {
                combinationVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("sub_award")) {
                combinationVar.setSubAward(IntentUtils.readSlot(zsdVar.w("sub_award"), String.class));
            }
            if (zsdVar.z("award_year")) {
                combinationVar.setAwardYear(IntentUtils.readSlot(zsdVar.w("award_year"), Miai.Datetime.class));
            }
            if (zsdVar.z("publish_time_order")) {
                combinationVar.setPublishTimeOrder(IntentUtils.readSlot(zsdVar.w("publish_time_order"), Order.class));
            }
            if (zsdVar.z("type")) {
                combinationVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("age")) {
                combinationVar.setAge(IntentUtils.readSlot(zsdVar.w("age"), Miai.Age.class));
            }
            if (zsdVar.z("character")) {
                combinationVar.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), Miai.FictionalCharacter.class));
            }
            if (zsdVar.z("popularity")) {
                combinationVar.setPopularity(IntentUtils.readSlot(zsdVar.w("popularity"), Order.class));
            }
            if (zsdVar.z("award")) {
                combinationVar.setAward(IntentUtils.readSlot(zsdVar.w("award"), Miai.MovieAward.class));
            }
            if (zsdVar.z("rating_order")) {
                combinationVar.setRatingOrder(IntentUtils.readSlot(zsdVar.w("rating_order"), Order.class));
            }
            if (zsdVar.z("duration")) {
                combinationVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("publisher")) {
                combinationVar.setPublisher(IntentUtils.readSlot(zsdVar.w("publisher"), String.class));
            }
            if (zsdVar.z("box")) {
                combinationVar.setBox(IntentUtils.readSlot(zsdVar.w("box"), String.class));
            }
            return combinationVar;
        }

        public static c4h write(combination combinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (combinationVar.artist.c()) {
                c4hVarCreateObjectNode.f0("artist", IntentUtils.writeSlot(combinationVar.artist.b()));
            }
            if (combinationVar.actor.c()) {
                c4hVarCreateObjectNode.f0("actor", IntentUtils.writeSlot(combinationVar.actor.b()));
            }
            if (combinationVar.director.c()) {
                c4hVarCreateObjectNode.f0("director", IntentUtils.writeSlot(combinationVar.director.b()));
            }
            if (combinationVar.singer.c()) {
                c4hVarCreateObjectNode.f0("singer", IntentUtils.writeSlot(combinationVar.singer.b()));
            }
            if (combinationVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(combinationVar.name.b()));
            }
            if (combinationVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(combinationVar.main_name.b()));
            }
            if (combinationVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(combinationVar.sub_name.b()));
            }
            if (combinationVar.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(combinationVar.season.b()));
            }
            if (combinationVar.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(combinationVar.episode.b()));
            }
            if (combinationVar.v_type.c()) {
                c4hVarCreateObjectNode.f0("v_type", IntentUtils.writeSlot(combinationVar.v_type.b()));
            }
            if (combinationVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(combinationVar.keyword.b()));
            }
            if (combinationVar.payment.c()) {
                c4hVarCreateObjectNode.f0("payment", IntentUtils.writeSlot(combinationVar.payment.b()));
            }
            if (combinationVar.language.c()) {
                c4hVarCreateObjectNode.f0("language", IntentUtils.writeSlot(combinationVar.language.b()));
            }
            if (combinationVar.publish_time.c()) {
                c4hVarCreateObjectNode.f0("publish_time", IntentUtils.writeSlot(combinationVar.publish_time.b()));
            }
            if (combinationVar.resolution.c()) {
                c4hVarCreateObjectNode.f0("resolution", IntentUtils.writeSlot(combinationVar.resolution.b()));
            }
            if (combinationVar.content_provider.c()) {
                c4hVarCreateObjectNode.f0("content_provider", IntentUtils.writeSlot(combinationVar.content_provider.b()));
            }
            if (combinationVar.content_rating.c()) {
                c4hVarCreateObjectNode.f0("content_rating", IntentUtils.writeSlot(combinationVar.content_rating.b()));
            }
            if (combinationVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(combinationVar.category.b()));
            }
            if (combinationVar.area.c()) {
                c4hVarCreateObjectNode.f0("area", IntentUtils.writeSlot(combinationVar.area.b()));
            }
            if (combinationVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(combinationVar.tag.b()));
            }
            if (combinationVar.sub_award.c()) {
                c4hVarCreateObjectNode.f0("sub_award", IntentUtils.writeSlot(combinationVar.sub_award.b()));
            }
            if (combinationVar.award_year.c()) {
                c4hVarCreateObjectNode.f0("award_year", IntentUtils.writeSlot(combinationVar.award_year.b()));
            }
            if (combinationVar.publish_time_order.c()) {
                c4hVarCreateObjectNode.f0("publish_time_order", IntentUtils.writeSlot(combinationVar.publish_time_order.b()));
            }
            if (combinationVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(combinationVar.type.b()));
            }
            if (combinationVar.age.c()) {
                c4hVarCreateObjectNode.f0("age", IntentUtils.writeSlot(combinationVar.age.b()));
            }
            if (combinationVar.character.c()) {
                c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(combinationVar.character.b()));
            }
            if (combinationVar.popularity.c()) {
                c4hVarCreateObjectNode.f0("popularity", IntentUtils.writeSlot(combinationVar.popularity.b()));
            }
            if (combinationVar.award.c()) {
                c4hVarCreateObjectNode.f0("award", IntentUtils.writeSlot(combinationVar.award.b()));
            }
            if (combinationVar.rating_order.c()) {
                c4hVarCreateObjectNode.f0("rating_order", IntentUtils.writeSlot(combinationVar.rating_order.b()));
            }
            if (combinationVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(combinationVar.duration.b()));
            }
            if (combinationVar.publisher.c()) {
                c4hVarCreateObjectNode.f0("publisher", IntentUtils.writeSlot(combinationVar.publisher.b()));
            }
            if (combinationVar.box.c()) {
                c4hVarCreateObjectNode.f0("box", IntentUtils.writeSlot(combinationVar.box.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Artist>> getActor() {
            return this.actor;
        }

        public Optional<Slot<Miai.Age>> getAge() {
            return this.age;
        }

        public Optional<Slot<Miai.Location>> getArea() {
            return this.area;
        }

        public Optional<Slot<Miai.Artist>> getArtist() {
            return this.artist;
        }

        public Optional<Slot<Miai.MovieAward>> getAward() {
            return this.award;
        }

        public Optional<Slot<Miai.Datetime>> getAwardYear() {
            return this.award_year;
        }

        public Optional<Slot<String>> getBox() {
            return this.box;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.FictionalCharacter>> getCharacter() {
            return this.character;
        }

        public Optional<Slot<Miai.ContentProvider>> getContentProvider() {
            return this.content_provider;
        }

        public Optional<Slot<Miai.Rating>> getContentRating() {
            return this.content_rating;
        }

        public Optional<Slot<Miai.Artist>> getDirector() {
            return this.director;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<Miai.Language>> getLanguage() {
            return this.language;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getName() {
            return this.name;
        }

        public Optional<Slot<Boolean>> getPayment() {
            return this.payment;
        }

        public Optional<Slot<Order>> getPopularity() {
            return this.popularity;
        }

        public Optional<Slot<Miai.Datetime>> getPublishTime() {
            return this.publish_time;
        }

        public Optional<Slot<Order>> getPublishTimeOrder() {
            return this.publish_time_order;
        }

        public Optional<Slot<String>> getPublisher() {
            return this.publisher;
        }

        public Optional<Slot<Order>> getRatingOrder() {
            return this.rating_order;
        }

        public Optional<Slot<ScreenResolution>> getResolution() {
            return this.resolution;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<Miai.Artist>> getSinger() {
            return this.singer;
        }

        public Optional<Slot<String>> getSubAward() {
            return this.sub_award;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public Optional<Slot<String>> getVType() {
            return this.v_type;
        }

        public combination setActor(Slot<Miai.Artist> slot) {
            this.actor = Optional.e(slot);
            return this;
        }

        public combination setAge(Slot<Miai.Age> slot) {
            this.age = Optional.e(slot);
            return this;
        }

        public combination setArea(Slot<Miai.Location> slot) {
            this.area = Optional.e(slot);
            return this;
        }

        public combination setArtist(Slot<Miai.Artist> slot) {
            this.artist = Optional.e(slot);
            return this;
        }

        public combination setAward(Slot<Miai.MovieAward> slot) {
            this.award = Optional.e(slot);
            return this;
        }

        public combination setAwardYear(Slot<Miai.Datetime> slot) {
            this.award_year = Optional.e(slot);
            return this;
        }

        public combination setBox(Slot<String> slot) {
            this.box = Optional.e(slot);
            return this;
        }

        public combination setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public combination setCharacter(Slot<Miai.FictionalCharacter> slot) {
            this.character = Optional.e(slot);
            return this;
        }

        public combination setContentProvider(Slot<Miai.ContentProvider> slot) {
            this.content_provider = Optional.e(slot);
            return this;
        }

        public combination setContentRating(Slot<Miai.Rating> slot) {
            this.content_rating = Optional.e(slot);
            return this;
        }

        public combination setDirector(Slot<Miai.Artist> slot) {
            this.director = Optional.e(slot);
            return this;
        }

        public combination setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public combination setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        public combination setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
            return this;
        }

        public combination setLanguage(Slot<Miai.Language> slot) {
            this.language = Optional.e(slot);
            return this;
        }

        public combination setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public combination setName(Slot<Miai.MovieName> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public combination setPayment(Slot<Boolean> slot) {
            this.payment = Optional.e(slot);
            return this;
        }

        public combination setPopularity(Slot<Order> slot) {
            this.popularity = Optional.e(slot);
            return this;
        }

        public combination setPublishTime(Slot<Miai.Datetime> slot) {
            this.publish_time = Optional.e(slot);
            return this;
        }

        public combination setPublishTimeOrder(Slot<Order> slot) {
            this.publish_time_order = Optional.e(slot);
            return this;
        }

        public combination setPublisher(Slot<String> slot) {
            this.publisher = Optional.e(slot);
            return this;
        }

        public combination setRatingOrder(Slot<Order> slot) {
            this.rating_order = Optional.e(slot);
            return this;
        }

        public combination setResolution(Slot<ScreenResolution> slot) {
            this.resolution = Optional.e(slot);
            return this;
        }

        public combination setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public combination setSinger(Slot<Miai.Artist> slot) {
            this.singer = Optional.e(slot);
            return this;
        }

        public combination setSubAward(Slot<String> slot) {
            this.sub_award = Optional.e(slot);
            return this;
        }

        public combination setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
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

        public combination setVType(Slot<String> slot) {
            this.v_type = Optional.e(slot);
            return this;
        }
    }

    public static class history implements EntityType {
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Miai.MovieName>> video_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public static history read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            history historyVar = new history();
            if (zsdVar.z("duration")) {
                historyVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("type")) {
                historyVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                historyVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                historyVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("video_name")) {
                historyVar.setVideoName(IntentUtils.readSlot(zsdVar.w("video_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                historyVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                historyVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            return historyVar;
        }

        public static c4h write(history historyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (historyVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(historyVar.duration.b()));
            }
            if (historyVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(historyVar.type.b()));
            }
            if (historyVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(historyVar.tag.b()));
            }
            if (historyVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(historyVar.category.b()));
            }
            if (historyVar.video_name.c()) {
                c4hVarCreateObjectNode.f0("video_name", IntentUtils.writeSlot(historyVar.video_name.b()));
            }
            if (historyVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(historyVar.main_name.b()));
            }
            if (historyVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(historyVar.sub_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public Optional<Slot<Miai.MovieName>> getVideoName() {
            return this.video_name;
        }

        public history setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public history setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public history setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public history setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
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

        public history setVideoName(Slot<Miai.MovieName> slot) {
            this.video_name = Optional.e(slot);
            return this;
        }
    }

    public static class publishTime implements EntityType {
        private Optional<Slot<Miai.Datetime>> value = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Order>> publish_time_order = Optional.a();

        public static publishTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            publishTime publishtime = new publishTime();
            if (zsdVar.z("value")) {
                publishtime.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Datetime.class));
            }
            if (zsdVar.z("type")) {
                publishtime.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                publishtime.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                publishtime.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("publish_time_order")) {
                publishtime.setPublishTimeOrder(IntentUtils.readSlot(zsdVar.w("publish_time_order"), Order.class));
            }
            return publishtime;
        }

        public static c4h write(publishTime publishtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (publishtime.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(publishtime.value.b()));
            }
            if (publishtime.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(publishtime.type.b()));
            }
            if (publishtime.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(publishtime.tag.b()));
            }
            if (publishtime.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(publishtime.category.b()));
            }
            if (publishtime.publish_time_order.c()) {
                c4hVarCreateObjectNode.f0("publish_time_order", IntentUtils.writeSlot(publishtime.publish_time_order.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Order>> getPublishTimeOrder() {
            return this.publish_time_order;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public Optional<Slot<Miai.Datetime>> getValue() {
            return this.value;
        }

        public publishTime setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public publishTime setPublishTimeOrder(Slot<Order> slot) {
            this.publish_time_order = Optional.e(slot);
            return this;
        }

        public publishTime setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public publishTime setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public publishTime setValue(Slot<Miai.Datetime> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class summary implements EntityType {
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Miai.MovieName>> video_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public static summary read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            summary summaryVar = new summary();
            if (zsdVar.z("type")) {
                summaryVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                summaryVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                summaryVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("video_name")) {
                summaryVar.setVideoName(IntentUtils.readSlot(zsdVar.w("video_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                summaryVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                summaryVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            return summaryVar;
        }

        public static c4h write(summary summaryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (summaryVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(summaryVar.type.b()));
            }
            if (summaryVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(summaryVar.tag.b()));
            }
            if (summaryVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(summaryVar.category.b()));
            }
            if (summaryVar.video_name.c()) {
                c4hVarCreateObjectNode.f0("video_name", IntentUtils.writeSlot(summaryVar.video_name.b()));
            }
            if (summaryVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(summaryVar.main_name.b()));
            }
            if (summaryVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(summaryVar.sub_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public Optional<Slot<Miai.MovieName>> getVideoName() {
            return this.video_name;
        }

        public summary setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public summary setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public summary setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public summary setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public summary setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public summary setVideoName(Slot<Miai.MovieName> slot) {
            this.video_name = Optional.e(slot);
            return this;
        }
    }

    public static class tag implements EntityType {
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Order>> content_popularity = Optional.a();
        private Optional<Slot<Order>> content_rating_order = Optional.a();
        private Optional<Slot<Miai.Rating>> content_rating = Optional.a();
        private Optional<Slot<Order>> content_publish_time = Optional.a();

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            if (zsdVar.z("type")) {
                tagVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                tagVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                tagVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("content_popularity")) {
                tagVar.setContentPopularity(IntentUtils.readSlot(zsdVar.w("content_popularity"), Order.class));
            }
            if (zsdVar.z("content_rating_order")) {
                tagVar.setContentRatingOrder(IntentUtils.readSlot(zsdVar.w("content_rating_order"), Order.class));
            }
            if (zsdVar.z("content_rating")) {
                tagVar.setContentRating(IntentUtils.readSlot(zsdVar.w("content_rating"), Miai.Rating.class));
            }
            if (zsdVar.z("content_publish_time")) {
                tagVar.setContentPublishTime(IntentUtils.readSlot(zsdVar.w("content_publish_time"), Order.class));
            }
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (tagVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(tagVar.type.b()));
            }
            if (tagVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(tagVar.tag.b()));
            }
            if (tagVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(tagVar.category.b()));
            }
            if (tagVar.content_popularity.c()) {
                c4hVarCreateObjectNode.f0("content_popularity", IntentUtils.writeSlot(tagVar.content_popularity.b()));
            }
            if (tagVar.content_rating_order.c()) {
                c4hVarCreateObjectNode.f0("content_rating_order", IntentUtils.writeSlot(tagVar.content_rating_order.b()));
            }
            if (tagVar.content_rating.c()) {
                c4hVarCreateObjectNode.f0("content_rating", IntentUtils.writeSlot(tagVar.content_rating.b()));
            }
            if (tagVar.content_publish_time.c()) {
                c4hVarCreateObjectNode.f0("content_publish_time", IntentUtils.writeSlot(tagVar.content_publish_time.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Order>> getContentPopularity() {
            return this.content_popularity;
        }

        public Optional<Slot<Order>> getContentPublishTime() {
            return this.content_publish_time;
        }

        public Optional<Slot<Miai.Rating>> getContentRating() {
            return this.content_rating;
        }

        public Optional<Slot<Order>> getContentRatingOrder() {
            return this.content_rating_order;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public tag setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public tag setContentPopularity(Slot<Order> slot) {
            this.content_popularity = Optional.e(slot);
            return this;
        }

        public tag setContentPublishTime(Slot<Order> slot) {
            this.content_publish_time = Optional.e(slot);
            return this;
        }

        public tag setContentRating(Slot<Miai.Rating> slot) {
            this.content_rating = Optional.e(slot);
            return this;
        }

        public tag setContentRatingOrder(Slot<Order> slot) {
            this.content_rating_order = Optional.e(slot);
            return this;
        }

        public tag setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public tag setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public Video() {
    }

    public static Video read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Video video = new Video(IntentUtils.readEntityType(zsdVar, "Video", optional));
        if (zsdVar.z("trunk_query")) {
            video.setTrunkQuery(IntentUtils.readSlot(zsdVar.w("trunk_query"), String.class));
        }
        if (zsdVar.z("keyword_tag")) {
            video.setKeywordTag(IntentUtils.readSlot(zsdVar.w("keyword_tag"), String.class));
        }
        if (zsdVar.z("content_provider")) {
            video.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), Miai.ContentProvider.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            video.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("features")) {
            video.setFeatures(IntentUtils.readSlot(zsdVar.w("features"), VideoFeature.class));
        }
        return video;
    }

    public static zsd write(Video video) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(video.entity_type);
        if (video.trunk_query.c()) {
            c4hVar.f0("trunk_query", IntentUtils.writeSlot(video.trunk_query.b()));
        }
        if (video.keyword_tag.c()) {
            c4hVar.f0("keyword_tag", IntentUtils.writeSlot(video.keyword_tag.b()));
        }
        if (video.content_provider.c()) {
            c4hVar.f0("content_provider", IntentUtils.writeSlot(video.content_provider.b()));
        }
        if (video.keyword.c()) {
            c4hVar.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(video.keyword.b()));
        }
        if (video.features.c()) {
            c4hVar.f0("features", IntentUtils.writeSlot(video.features.b()));
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

    public Optional<Slot<VideoFeature>> getFeatures() {
        return this.features;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public Optional<Slot<String>> getKeywordTag() {
        return this.keyword_tag;
    }

    public Optional<Slot<String>> getTrunkQuery() {
        return this.trunk_query;
    }

    public Video setContentProvider(Slot<Miai.ContentProvider> slot) {
        this.content_provider = Optional.e(slot);
        return this;
    }

    @Required
    public Video setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Video setFeatures(Slot<VideoFeature> slot) {
        this.features = Optional.e(slot);
        return this;
    }

    public Video setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public Video setKeywordTag(Slot<String> slot) {
        this.keyword_tag = Optional.e(slot);
        return this;
    }

    public Video setTrunkQuery(Slot<String> slot) {
        this.trunk_query = Optional.e(slot);
        return this;
    }

    public static class name implements EntityType {

        @Required
        private Slot<Miai.MovieName> name;
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public name() {
        }

        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            name nameVar = new name();
            nameVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
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
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(nameVar.name));
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

        @Required
        public Slot<Miai.MovieName> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public name setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        @Required
        public name setName(Slot<Miai.MovieName> slot) {
            this.name = slot;
            return this;
        }

        public name setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public name(Slot<Miai.MovieName> slot) {
            this.name = slot;
        }
    }

    public static class nameCategory implements EntityType {

        @Required
        private Slot<String> category;

        @Required
        private Slot<Miai.MovieName> name;
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public nameCategory() {
        }

        public static nameCategory read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            nameCategory namecategory = new nameCategory();
            namecategory.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            if (zsdVar.z("main_name")) {
                namecategory.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                namecategory.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            namecategory.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            return namecategory;
        }

        public static c4h write(nameCategory namecategory) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(namecategory.name));
            if (namecategory.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(namecategory.main_name.b()));
            }
            if (namecategory.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(namecategory.sub_name.b()));
            }
            c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(namecategory.category));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        @Required
        public Slot<Miai.MovieName> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        @Required
        public nameCategory setCategory(Slot<String> slot) {
            this.category = slot;
            return this;
        }

        public nameCategory setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        @Required
        public nameCategory setName(Slot<Miai.MovieName> slot) {
            this.name = slot;
            return this;
        }

        public nameCategory setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public nameCategory(Slot<Miai.MovieName> slot, Slot<String> slot2) {
            this.name = slot;
            this.category = slot2;
        }
    }

    public static class area implements EntityType {

        @Required
        private Slot<Miai.Location> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();

        public area() {
        }

        public static area read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            area areaVar = new area();
            areaVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Location.class));
            if (zsdVar.z("type")) {
                areaVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                areaVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                areaVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            return areaVar;
        }

        public static c4h write(area areaVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(areaVar.name));
            if (areaVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(areaVar.type.b()));
            }
            if (areaVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(areaVar.tag.b()));
            }
            if (areaVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(areaVar.category.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        @Required
        public Slot<Miai.Location> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public area setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        @Required
        public area setName(Slot<Miai.Location> slot) {
            this.name = slot;
            return this;
        }

        public area setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public area setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public area(Slot<Miai.Location> slot) {
            this.name = slot;
        }
    }

    public static class character implements EntityType {

        @Required
        private Slot<Miai.FictionalCharacter> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();

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
            if (zsdVar.z("category")) {
                characterVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
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
            if (characterVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(characterVar.category.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
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

        public character setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
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

    public static class contentAge implements EntityType {

        @Required
        private Slot<Miai.Age> value;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();

        public contentAge() {
        }

        public static contentAge read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            contentAge contentage = new contentAge();
            contentage.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Age.class));
            if (zsdVar.z("type")) {
                contentage.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                contentage.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                contentage.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            return contentage;
        }

        public static c4h write(contentAge contentage) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(contentage.value));
            if (contentage.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(contentage.type.b()));
            }
            if (contentage.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(contentage.tag.b()));
            }
            if (contentage.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(contentage.category.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public Slot<Miai.Age> getValue() {
            return this.value;
        }

        public contentAge setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public contentAge setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public contentAge setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        @Required
        public contentAge setValue(Slot<Miai.Age> slot) {
            this.value = slot;
            return this;
        }

        public contentAge(Slot<Miai.Age> slot) {
            this.value = slot;
        }
    }

    public static class content implements EntityType {

        @Required
        private Slot<String> category;
        private Optional<Slot<Order>> popularity = Optional.a();
        private Optional<Slot<Order>> rating_order = Optional.a();
        private Optional<Slot<Miai.Rating>> rating = Optional.a();
        private Optional<Slot<Order>> publish_time = Optional.a();

        public content() {
        }

        public static content read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            content contentVar = new content();
            contentVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            if (zsdVar.z("popularity")) {
                contentVar.setPopularity(IntentUtils.readSlot(zsdVar.w("popularity"), Order.class));
            }
            if (zsdVar.z("rating_order")) {
                contentVar.setRatingOrder(IntentUtils.readSlot(zsdVar.w("rating_order"), Order.class));
            }
            if (zsdVar.z("rating")) {
                contentVar.setRating(IntentUtils.readSlot(zsdVar.w("rating"), Miai.Rating.class));
            }
            if (zsdVar.z("publish_time")) {
                contentVar.setPublishTime(IntentUtils.readSlot(zsdVar.w("publish_time"), Order.class));
            }
            return contentVar;
        }

        public static c4h write(content contentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(contentVar.category));
            if (contentVar.popularity.c()) {
                c4hVarCreateObjectNode.f0("popularity", IntentUtils.writeSlot(contentVar.popularity.b()));
            }
            if (contentVar.rating_order.c()) {
                c4hVarCreateObjectNode.f0("rating_order", IntentUtils.writeSlot(contentVar.rating_order.b()));
            }
            if (contentVar.rating.c()) {
                c4hVarCreateObjectNode.f0("rating", IntentUtils.writeSlot(contentVar.rating.b()));
            }
            if (contentVar.publish_time.c()) {
                c4hVarCreateObjectNode.f0("publish_time", IntentUtils.writeSlot(contentVar.publish_time.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getCategory() {
            return this.category;
        }

        public Optional<Slot<Order>> getPopularity() {
            return this.popularity;
        }

        public Optional<Slot<Order>> getPublishTime() {
            return this.publish_time;
        }

        public Optional<Slot<Miai.Rating>> getRating() {
            return this.rating;
        }

        public Optional<Slot<Order>> getRatingOrder() {
            return this.rating_order;
        }

        @Required
        public content setCategory(Slot<String> slot) {
            this.category = slot;
            return this;
        }

        public content setPopularity(Slot<Order> slot) {
            this.popularity = Optional.e(slot);
            return this;
        }

        public content setPublishTime(Slot<Order> slot) {
            this.publish_time = Optional.e(slot);
            return this;
        }

        public content setRating(Slot<Miai.Rating> slot) {
            this.rating = Optional.e(slot);
            return this;
        }

        public content setRatingOrder(Slot<Order> slot) {
            this.rating_order = Optional.e(slot);
            return this;
        }

        public content(Slot<String> slot) {
            this.category = slot;
        }
    }

    public static class nameSpecific implements EntityType {

        @Required
        private Slot<Miai.MovieName> name;
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();
        private Optional<Slot<Miai.Season>> season = Optional.a();
        private Optional<Slot<Miai.Episode>> episode = Optional.a();

        public nameSpecific() {
        }

        public static nameSpecific read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            nameSpecific namespecific = new nameSpecific();
            namespecific.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            if (zsdVar.z("main_name")) {
                namespecific.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                namespecific.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("season")) {
                namespecific.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
            }
            if (zsdVar.z("episode")) {
                namespecific.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
            }
            return namespecific;
        }

        public static c4h write(nameSpecific namespecific) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(namespecific.name));
            if (namespecific.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(namespecific.main_name.b()));
            }
            if (namespecific.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(namespecific.sub_name.b()));
            }
            if (namespecific.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(namespecific.season.b()));
            }
            if (namespecific.episode.c()) {
                c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(namespecific.episode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Episode>> getEpisode() {
            return this.episode;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        @Required
        public Slot<Miai.MovieName> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public nameSpecific setEpisode(Slot<Miai.Episode> slot) {
            this.episode = Optional.e(slot);
            return this;
        }

        public nameSpecific setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        @Required
        public nameSpecific setName(Slot<Miai.MovieName> slot) {
            this.name = slot;
            return this;
        }

        public nameSpecific setSeason(Slot<Miai.Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public nameSpecific setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public nameSpecific(Slot<Miai.MovieName> slot) {
            this.name = slot;
        }
    }

    public static class movieAward implements EntityType {

        @Required
        private Slot<Miai.MovieAward> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<String>> sub_award = Optional.a();
        private Optional<Slot<Miai.Datetime>> award_year = Optional.a();

        public movieAward() {
        }

        public static movieAward read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            movieAward movieaward = new movieAward();
            movieaward.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieAward.class));
            if (zsdVar.z("type")) {
                movieaward.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                movieaward.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                movieaward.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("sub_award")) {
                movieaward.setSubAward(IntentUtils.readSlot(zsdVar.w("sub_award"), String.class));
            }
            if (zsdVar.z("award_year")) {
                movieaward.setAwardYear(IntentUtils.readSlot(zsdVar.w("award_year"), Miai.Datetime.class));
            }
            return movieaward;
        }

        public static c4h write(movieAward movieaward) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(movieaward.name));
            if (movieaward.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(movieaward.type.b()));
            }
            if (movieaward.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(movieaward.tag.b()));
            }
            if (movieaward.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(movieaward.category.b()));
            }
            if (movieaward.sub_award.c()) {
                c4hVarCreateObjectNode.f0("sub_award", IntentUtils.writeSlot(movieaward.sub_award.b()));
            }
            if (movieaward.award_year.c()) {
                c4hVarCreateObjectNode.f0("award_year", IntentUtils.writeSlot(movieaward.award_year.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getAwardYear() {
            return this.award_year;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        @Required
        public Slot<Miai.MovieAward> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getSubAward() {
            return this.sub_award;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public movieAward setAwardYear(Slot<Miai.Datetime> slot) {
            this.award_year = Optional.e(slot);
            return this;
        }

        public movieAward setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        @Required
        public movieAward setName(Slot<Miai.MovieAward> slot) {
            this.name = slot;
            return this;
        }

        public movieAward setSubAward(Slot<String> slot) {
            this.sub_award = Optional.e(slot);
            return this;
        }

        public movieAward setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public movieAward setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public movieAward(Slot<Miai.MovieAward> slot) {
            this.name = slot;
        }
    }

    public static class nameTag implements EntityType {

        @Required
        private Slot<Miai.MovieName> name;
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();

        public nameTag() {
        }

        public static nameTag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            nameTag nametag = new nameTag();
            nametag.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.MovieName.class));
            if (zsdVar.z("main_name")) {
                nametag.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                nametag.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("type")) {
                nametag.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                nametag.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                nametag.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            return nametag;
        }

        public static c4h write(nameTag nametag) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(nametag.name));
            if (nametag.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(nametag.main_name.b()));
            }
            if (nametag.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(nametag.sub_name.b()));
            }
            if (nametag.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(nametag.type.b()));
            }
            if (nametag.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(nametag.tag.b()));
            }
            if (nametag.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(nametag.category.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        @Required
        public Slot<Miai.MovieName> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public nameTag setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public nameTag setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        @Required
        public nameTag setName(Slot<Miai.MovieName> slot) {
            this.name = slot;
            return this;
        }

        public nameTag setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public nameTag setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public nameTag setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public nameTag(Slot<Miai.MovieName> slot) {
            this.name = slot;
        }
    }

    public static class contentProvider implements EntityType {

        @Required
        private Slot<String> name;
        private Optional<Slot<Miai.MovieName>> videoName = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();

        public contentProvider() {
        }

        public static contentProvider read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            contentProvider contentprovider = new contentProvider();
            contentprovider.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            if (zsdVar.z("videoName")) {
                contentprovider.setVideoName(IntentUtils.readSlot(zsdVar.w("videoName"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                contentprovider.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                contentprovider.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("type")) {
                contentprovider.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                contentprovider.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                contentprovider.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            return contentprovider;
        }

        public static c4h write(contentProvider contentprovider) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(contentprovider.name));
            if (contentprovider.videoName.c()) {
                c4hVarCreateObjectNode.f0("videoName", IntentUtils.writeSlot(contentprovider.videoName.b()));
            }
            if (contentprovider.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(contentprovider.main_name.b()));
            }
            if (contentprovider.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(contentprovider.sub_name.b()));
            }
            if (contentprovider.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(contentprovider.type.b()));
            }
            if (contentprovider.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(contentprovider.tag.b()));
            }
            if (contentprovider.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(contentprovider.category.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public Optional<Slot<Miai.MovieName>> getVideoName() {
            return this.videoName;
        }

        public contentProvider setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public contentProvider setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        @Required
        public contentProvider setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }

        public contentProvider setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
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

        public contentProvider setVideoName(Slot<Miai.MovieName> slot) {
            this.videoName = Optional.e(slot);
            return this;
        }

        public contentProvider(Slot<String> slot) {
            this.name = slot;
        }
    }

    public static class language implements EntityType {

        @Required
        private Slot<Miai.Language> name;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Miai.MovieName>> video_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public language() {
        }

        public static language read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            language languageVar = new language();
            languageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Language.class));
            if (zsdVar.z("type")) {
                languageVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                languageVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                languageVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("video_name")) {
                languageVar.setVideoName(IntentUtils.readSlot(zsdVar.w("video_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                languageVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                languageVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            return languageVar;
        }

        public static c4h write(language languageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(languageVar.name));
            if (languageVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(languageVar.type.b()));
            }
            if (languageVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(languageVar.tag.b()));
            }
            if (languageVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(languageVar.category.b()));
            }
            if (languageVar.video_name.c()) {
                c4hVarCreateObjectNode.f0("video_name", IntentUtils.writeSlot(languageVar.video_name.b()));
            }
            if (languageVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(languageVar.main_name.b()));
            }
            if (languageVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(languageVar.sub_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        @Required
        public Slot<Miai.Language> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public Optional<Slot<Miai.MovieName>> getVideoName() {
            return this.video_name;
        }

        public language setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public language setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        @Required
        public language setName(Slot<Miai.Language> slot) {
            this.name = slot;
            return this;
        }

        public language setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public language setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public language setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public language setVideoName(Slot<Miai.MovieName> slot) {
            this.video_name = Optional.e(slot);
            return this;
        }

        public language(Slot<Miai.Language> slot) {
            this.name = slot;
        }
    }

    public static class payment implements EntityType {

        @Required
        private Slot<Boolean> value;
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<Miai.MovieName>> video_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> main_name = Optional.a();
        private Optional<Slot<Miai.MovieName>> sub_name = Optional.a();

        public payment() {
        }

        public static payment read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            payment paymentVar = new payment();
            paymentVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Boolean.class));
            if (zsdVar.z("type")) {
                paymentVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("tag")) {
                paymentVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("category")) {
                paymentVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("video_name")) {
                paymentVar.setVideoName(IntentUtils.readSlot(zsdVar.w("video_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("main_name")) {
                paymentVar.setMainName(IntentUtils.readSlot(zsdVar.w("main_name"), Miai.MovieName.class));
            }
            if (zsdVar.z("sub_name")) {
                paymentVar.setSubName(IntentUtils.readSlot(zsdVar.w("sub_name"), Miai.MovieName.class));
            }
            return paymentVar;
        }

        public static c4h write(payment paymentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(paymentVar.value));
            if (paymentVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(paymentVar.type.b()));
            }
            if (paymentVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(paymentVar.tag.b()));
            }
            if (paymentVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(paymentVar.category.b()));
            }
            if (paymentVar.video_name.c()) {
                c4hVarCreateObjectNode.f0("video_name", IntentUtils.writeSlot(paymentVar.video_name.b()));
            }
            if (paymentVar.main_name.c()) {
                c4hVarCreateObjectNode.f0("main_name", IntentUtils.writeSlot(paymentVar.main_name.b()));
            }
            if (paymentVar.sub_name.c()) {
                c4hVarCreateObjectNode.f0("sub_name", IntentUtils.writeSlot(paymentVar.sub_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<Miai.MovieName>> getMainName() {
            return this.main_name;
        }

        public Optional<Slot<Miai.MovieName>> getSubName() {
            return this.sub_name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public Slot<Boolean> getValue() {
            return this.value;
        }

        public Optional<Slot<Miai.MovieName>> getVideoName() {
            return this.video_name;
        }

        public payment setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public payment setMainName(Slot<Miai.MovieName> slot) {
            this.main_name = Optional.e(slot);
            return this;
        }

        public payment setSubName(Slot<Miai.MovieName> slot) {
            this.sub_name = Optional.e(slot);
            return this;
        }

        public payment setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public payment setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        @Required
        public payment setValue(Slot<Boolean> slot) {
            this.value = slot;
            return this;
        }

        public payment setVideoName(Slot<Miai.MovieName> slot) {
            this.video_name = Optional.e(slot);
            return this;
        }

        public payment(Slot<Boolean> slot) {
            this.value = slot;
        }
    }

    public Video(T t) {
        this.entity_type = t;
    }
}
