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
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class SportCompetition<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> target;
    private Optional<Slot<Miai.Sport>> sports = Optional.a();
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.Season>> season = Optional.a();
    private Optional<Slot<String>> stage = Optional.a();
    private Optional<Slot<String>> group = Optional.a();
    private Optional<Slot<String>> playing_team = Optional.a();
    private Optional<Slot<String>> player = Optional.a();
    private Optional<Slot<String>> sub_sports = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<String>> medal = Optional.a();
    private Optional<Slot<String>> gender = Optional.a();
    private Optional<Slot<String>> length = Optional.a();
    private Optional<Slot<Boolean>> is_sub_sport = Optional.a();
    private Optional<Slot<String>> role = Optional.a();

    public static class lineup implements EntityType {
        public static lineup read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new lineup();
        }

        public static c4h write(lineup lineupVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class live implements EntityType {
        public static live read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new live();
        }

        public static c4h write(live liveVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class prediction implements EntityType {
        public static prediction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new prediction();
        }

        public static c4h write(prediction predictionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class result implements EntityType {
        public static result read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new result();
        }

        public static c4h write(result resultVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class schedule implements EntityType {
        public static schedule read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new schedule();
        }

        public static c4h write(schedule scheduleVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public SportCompetition() {
    }

    public static SportCompetition read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SportCompetition sportCompetition = new SportCompetition(IntentUtils.readEntityType(zsdVar, AIApiConstants.SportCompetition.NAME, optional));
        sportCompetition.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
        if (zsdVar.z("sports")) {
            sportCompetition.setSports(IntentUtils.readSlot(zsdVar.w("sports"), Miai.Sport.class));
        }
        if (zsdVar.z("name")) {
            sportCompetition.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("season")) {
            sportCompetition.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Miai.Season.class));
        }
        if (zsdVar.z(StepsInfo.KEY_STAGE)) {
            sportCompetition.setStage(IntentUtils.readSlot(zsdVar.w(StepsInfo.KEY_STAGE), String.class));
        }
        if (zsdVar.z("group")) {
            sportCompetition.setGroup(IntentUtils.readSlot(zsdVar.w("group"), String.class));
        }
        if (zsdVar.z("playing_team")) {
            sportCompetition.setPlayingTeam(IntentUtils.readSlot(zsdVar.w("playing_team"), String.class));
        }
        if (zsdVar.z("player")) {
            sportCompetition.setPlayer(IntentUtils.readSlot(zsdVar.w("player"), String.class));
        }
        if (zsdVar.z("sub_sports")) {
            sportCompetition.setSubSports(IntentUtils.readSlot(zsdVar.w("sub_sports"), String.class));
        }
        if (zsdVar.z("duration")) {
            sportCompetition.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("medal")) {
            sportCompetition.setMedal(IntentUtils.readSlot(zsdVar.w("medal"), String.class));
        }
        if (zsdVar.z("gender")) {
            sportCompetition.setGender(IntentUtils.readSlot(zsdVar.w("gender"), String.class));
        }
        if (zsdVar.z("length")) {
            sportCompetition.setLength(IntentUtils.readSlot(zsdVar.w("length"), String.class));
        }
        if (zsdVar.z("is_sub_sport")) {
            sportCompetition.setIsSubSport(IntentUtils.readSlot(zsdVar.w("is_sub_sport"), Boolean.class));
        }
        if (zsdVar.z("role")) {
            sportCompetition.setRole(IntentUtils.readSlot(zsdVar.w("role"), String.class));
        }
        return sportCompetition;
    }

    public static zsd write(SportCompetition sportCompetition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(sportCompetition.entity_type);
        c4hVar.f0("target", IntentUtils.writeSlot(sportCompetition.target));
        if (sportCompetition.sports.c()) {
            c4hVar.f0("sports", IntentUtils.writeSlot(sportCompetition.sports.b()));
        }
        if (sportCompetition.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(sportCompetition.name.b()));
        }
        if (sportCompetition.season.c()) {
            c4hVar.f0("season", IntentUtils.writeSlot(sportCompetition.season.b()));
        }
        if (sportCompetition.stage.c()) {
            c4hVar.f0(StepsInfo.KEY_STAGE, IntentUtils.writeSlot(sportCompetition.stage.b()));
        }
        if (sportCompetition.group.c()) {
            c4hVar.f0("group", IntentUtils.writeSlot(sportCompetition.group.b()));
        }
        if (sportCompetition.playing_team.c()) {
            c4hVar.f0("playing_team", IntentUtils.writeSlot(sportCompetition.playing_team.b()));
        }
        if (sportCompetition.player.c()) {
            c4hVar.f0("player", IntentUtils.writeSlot(sportCompetition.player.b()));
        }
        if (sportCompetition.sub_sports.c()) {
            c4hVar.f0("sub_sports", IntentUtils.writeSlot(sportCompetition.sub_sports.b()));
        }
        if (sportCompetition.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(sportCompetition.duration.b()));
        }
        if (sportCompetition.medal.c()) {
            c4hVar.f0("medal", IntentUtils.writeSlot(sportCompetition.medal.b()));
        }
        if (sportCompetition.gender.c()) {
            c4hVar.f0("gender", IntentUtils.writeSlot(sportCompetition.gender.b()));
        }
        if (sportCompetition.length.c()) {
            c4hVar.f0("length", IntentUtils.writeSlot(sportCompetition.length.b()));
        }
        if (sportCompetition.is_sub_sport.c()) {
            c4hVar.f0("is_sub_sport", IntentUtils.writeSlot(sportCompetition.is_sub_sport.b()));
        }
        if (sportCompetition.role.c()) {
            c4hVar.f0("role", IntentUtils.writeSlot(sportCompetition.role.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getGender() {
        return this.gender;
    }

    public Optional<Slot<String>> getGroup() {
        return this.group;
    }

    public Optional<Slot<Boolean>> getIsSubSport() {
        return this.is_sub_sport;
    }

    public Optional<Slot<String>> getLength() {
        return this.length;
    }

    public Optional<Slot<String>> getMedal() {
        return this.medal;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPlayer() {
        return this.player;
    }

    public Optional<Slot<String>> getPlayingTeam() {
        return this.playing_team;
    }

    public Optional<Slot<String>> getRole() {
        return this.role;
    }

    public Optional<Slot<Miai.Season>> getSeason() {
        return this.season;
    }

    public Optional<Slot<Miai.Sport>> getSports() {
        return this.sports;
    }

    public Optional<Slot<String>> getStage() {
        return this.stage;
    }

    public Optional<Slot<String>> getSubSports() {
        return this.sub_sports;
    }

    @Required
    public Slot<String> getTarget() {
        return this.target;
    }

    public SportCompetition setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public SportCompetition setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public SportCompetition setGender(Slot<String> slot) {
        this.gender = Optional.e(slot);
        return this;
    }

    public SportCompetition setGroup(Slot<String> slot) {
        this.group = Optional.e(slot);
        return this;
    }

    public SportCompetition setIsSubSport(Slot<Boolean> slot) {
        this.is_sub_sport = Optional.e(slot);
        return this;
    }

    public SportCompetition setLength(Slot<String> slot) {
        this.length = Optional.e(slot);
        return this;
    }

    public SportCompetition setMedal(Slot<String> slot) {
        this.medal = Optional.e(slot);
        return this;
    }

    public SportCompetition setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public SportCompetition setPlayer(Slot<String> slot) {
        this.player = Optional.e(slot);
        return this;
    }

    public SportCompetition setPlayingTeam(Slot<String> slot) {
        this.playing_team = Optional.e(slot);
        return this;
    }

    public SportCompetition setRole(Slot<String> slot) {
        this.role = Optional.e(slot);
        return this;
    }

    public SportCompetition setSeason(Slot<Miai.Season> slot) {
        this.season = Optional.e(slot);
        return this;
    }

    public SportCompetition setSports(Slot<Miai.Sport> slot) {
        this.sports = Optional.e(slot);
        return this;
    }

    public SportCompetition setStage(Slot<String> slot) {
        this.stage = Optional.e(slot);
        return this;
    }

    public SportCompetition setSubSports(Slot<String> slot) {
        this.sub_sports = Optional.e(slot);
        return this;
    }

    @Required
    public SportCompetition setTarget(Slot<String> slot) {
        this.target = slot;
        return this;
    }

    public SportCompetition(T t) {
        this.entity_type = t;
    }

    public SportCompetition(T t, Slot<String> slot) {
        this.entity_type = t;
        this.target = slot;
    }
}
