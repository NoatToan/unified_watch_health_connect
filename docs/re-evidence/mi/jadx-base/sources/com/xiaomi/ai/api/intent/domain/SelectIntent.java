package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
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
public class SelectIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Integer>> ordinal = Optional.a();

    @Deprecated
    private Optional<Slot<String>> match_info = Optional.a();

    @Deprecated
    private Optional<Slot<String>> meta_id = Optional.a();

    @Deprecated
    private Optional<Slot<String>> interaction_id = Optional.a();
    private Optional<Slot<Miai.Episode>> episode = Optional.a();
    private Optional<Slot<MeasureWord>> measure_word = Optional.a();
    private Optional<Slot<PartWord>> part_word = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<String>> target = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public enum MeasureWord {
        Ordinal(1, "Ordinal"),
        Chapter(2, "Chapter"),
        Episode(3, "Episode"),
        Season(4, "Season"),
        Scroll(5, "Scroll"),
        Volume(6, "Volume"),
        Lesson(7, "Lesson"),
        Page(8, "Page"),
        Module(9, "Module"),
        Part(10, "Part"),
        Row(11, "Row"),
        Song(12, "Song"),
        Channel(13, "Channel");

        private int id;
        private String name;

        MeasureWord(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MeasureWord find(String str) {
            for (MeasureWord measureWord : values()) {
                if (measureWord.name.equals(str)) {
                    return measureWord;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MeasureWord read(String str) {
            return find(str);
        }

        public static String write(MeasureWord measureWord) {
            return measureWord.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PartWord {
        Upper(1, "Upper"),
        Middle(2, "Middle"),
        Lower(3, "Lower");

        private int id;
        private String name;

        PartWord(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PartWord find(String str) {
            for (PartWord partWord : values()) {
                if (partWord.name.equals(str)) {
                    return partWord;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PartWord read(String str) {
            return find(str);
        }

        public static String write(PartWord partWord) {
            return partWord.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static SelectIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SelectIntent selectIntent = new SelectIntent();
        if (zsdVar.z("ordinal")) {
            selectIntent.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        if (zsdVar.z("match_info")) {
            selectIntent.setMatchInfo(IntentUtils.readSlot(zsdVar.w("match_info"), String.class));
        }
        if (zsdVar.z("meta_id")) {
            selectIntent.setMetaId(IntentUtils.readSlot(zsdVar.w("meta_id"), String.class));
        }
        if (zsdVar.z("interaction_id")) {
            selectIntent.setInteractionId(IntentUtils.readSlot(zsdVar.w("interaction_id"), String.class));
        }
        if (zsdVar.z("episode")) {
            selectIntent.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
        }
        if (zsdVar.z("measure_word")) {
            selectIntent.setMeasureWord(IntentUtils.readSlot(zsdVar.w("measure_word"), MeasureWord.class));
        }
        if (zsdVar.z("part_word")) {
            selectIntent.setPartWord(IntentUtils.readSlot(zsdVar.w("part_word"), PartWord.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            selectIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("target")) {
            selectIntent.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
        }
        if (zsdVar.z("app")) {
            selectIntent.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return selectIntent;
    }

    public static zsd write(SelectIntent selectIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (selectIntent.ordinal.c()) {
            c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(selectIntent.ordinal.b()));
        }
        if (selectIntent.match_info.c()) {
            c4hVarCreateObjectNode.f0("match_info", IntentUtils.writeSlot(selectIntent.match_info.b()));
        }
        if (selectIntent.meta_id.c()) {
            c4hVarCreateObjectNode.f0("meta_id", IntentUtils.writeSlot(selectIntent.meta_id.b()));
        }
        if (selectIntent.interaction_id.c()) {
            c4hVarCreateObjectNode.f0("interaction_id", IntentUtils.writeSlot(selectIntent.interaction_id.b()));
        }
        if (selectIntent.episode.c()) {
            c4hVarCreateObjectNode.f0("episode", IntentUtils.writeSlot(selectIntent.episode.b()));
        }
        if (selectIntent.measure_word.c()) {
            c4hVarCreateObjectNode.f0("measure_word", IntentUtils.writeSlot(selectIntent.measure_word.b()));
        }
        if (selectIntent.part_word.c()) {
            c4hVarCreateObjectNode.f0("part_word", IntentUtils.writeSlot(selectIntent.part_word.b()));
        }
        if (selectIntent.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(selectIntent.keyword.b()));
        }
        if (selectIntent.target.c()) {
            c4hVarCreateObjectNode.f0("target", IntentUtils.writeSlot(selectIntent.target.b()));
        }
        if (selectIntent.app.c()) {
            c4hVarCreateObjectNode.f0("app", IntentUtils.writeSlot(selectIntent.app.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    public Optional<Slot<Miai.Episode>> getEpisode() {
        return this.episode;
    }

    @Deprecated
    public Optional<Slot<String>> getInteractionId() {
        return this.interaction_id;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    @Deprecated
    public Optional<Slot<String>> getMatchInfo() {
        return this.match_info;
    }

    public Optional<Slot<MeasureWord>> getMeasureWord() {
        return this.measure_word;
    }

    @Deprecated
    public Optional<Slot<String>> getMetaId() {
        return this.meta_id;
    }

    public Optional<Slot<Integer>> getOrdinal() {
        return this.ordinal;
    }

    public Optional<Slot<PartWord>> getPartWord() {
        return this.part_word;
    }

    public Optional<Slot<String>> getTarget() {
        return this.target;
    }

    public SelectIntent setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public SelectIntent setEpisode(Slot<Miai.Episode> slot) {
        this.episode = Optional.e(slot);
        return this;
    }

    @Deprecated
    public SelectIntent setInteractionId(Slot<String> slot) {
        this.interaction_id = Optional.e(slot);
        return this;
    }

    public SelectIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    @Deprecated
    public SelectIntent setMatchInfo(Slot<String> slot) {
        this.match_info = Optional.e(slot);
        return this;
    }

    public SelectIntent setMeasureWord(Slot<MeasureWord> slot) {
        this.measure_word = Optional.e(slot);
        return this;
    }

    @Deprecated
    public SelectIntent setMetaId(Slot<String> slot) {
        this.meta_id = Optional.e(slot);
        return this;
    }

    public SelectIntent setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }

    public SelectIntent setPartWord(Slot<PartWord> slot) {
        this.part_word = Optional.e(slot);
        return this;
    }

    public SelectIntent setTarget(Slot<String> slot) {
        this.target = Optional.e(slot);
        return this;
    }
}
