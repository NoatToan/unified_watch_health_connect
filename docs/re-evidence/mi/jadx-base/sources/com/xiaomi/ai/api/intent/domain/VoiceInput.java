package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.Intention;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceInput<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> text;
    private Optional<Slot<Integer>> repetition = Optional.a();
    private Optional<Slot<String>> display_title = Optional.a();
    private Optional<Slot<String>> emoji_url = Optional.a();
    private Optional<Slot<Intention<Object>>> refer_intention = Optional.a();
    private Optional<Slot<GameContent>> game_content = Optional.a();

    public static class GameContent implements DomainType {
        private Optional<String> id = Optional.a();
        private Optional<String> index = Optional.a();
        private Optional<String> type = Optional.a();
        private Optional<String> value = Optional.a();

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<String> getIndex() {
            return this.index;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public Optional<String> getValue() {
            return this.value;
        }

        public GameContent setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public GameContent setIndex(String str) {
            this.index = Optional.e(str);
            return this;
        }

        public GameContent setType(String str) {
            this.type = Optional.e(str);
            return this;
        }

        public GameContent setValue(String str) {
            this.value = Optional.e(str);
            return this;
        }
    }

    public static class inputGuide implements EntityType {
        public static inputGuide read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new inputGuide();
        }

        public static c4h write(inputGuide inputguide) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public VoiceInput() {
    }

    public static VoiceInput read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VoiceInput voiceInput = new VoiceInput(IntentUtils.readEntityType(zsdVar, AIApiConstants.VoiceInput.NAME, optional));
        voiceInput.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
        if (zsdVar.z("repetition")) {
            voiceInput.setRepetition(IntentUtils.readSlot(zsdVar.w("repetition"), Integer.class));
        }
        if (zsdVar.z("display_title")) {
            voiceInput.setDisplayTitle(IntentUtils.readSlot(zsdVar.w("display_title"), String.class));
        }
        if (zsdVar.z("emoji_url")) {
            voiceInput.setEmojiUrl(IntentUtils.readSlot(zsdVar.w("emoji_url"), String.class));
        }
        if (zsdVar.z("refer_intention")) {
            voiceInput.setReferIntention(IntentUtils.readSlot(zsdVar.w("refer_intention"), Intention.class));
        }
        if (zsdVar.z("game_content")) {
            voiceInput.setGameContent(IntentUtils.readSlot(zsdVar.w("game_content"), GameContent.class));
        }
        return voiceInput;
    }

    public static zsd write(VoiceInput voiceInput) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(voiceInput.entity_type);
        c4hVar.f0("text", IntentUtils.writeSlot(voiceInput.text));
        if (voiceInput.repetition.c()) {
            c4hVar.f0("repetition", IntentUtils.writeSlot(voiceInput.repetition.b()));
        }
        if (voiceInput.display_title.c()) {
            c4hVar.f0("display_title", IntentUtils.writeSlot(voiceInput.display_title.b()));
        }
        if (voiceInput.emoji_url.c()) {
            c4hVar.f0("emoji_url", IntentUtils.writeSlot(voiceInput.emoji_url.b()));
        }
        if (voiceInput.refer_intention.c()) {
            c4hVar.f0("refer_intention", IntentUtils.writeSlot(voiceInput.refer_intention.b()));
        }
        if (voiceInput.game_content.c()) {
            c4hVar.f0("game_content", IntentUtils.writeSlot(voiceInput.game_content.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDisplayTitle() {
        return this.display_title;
    }

    public Optional<Slot<String>> getEmojiUrl() {
        return this.emoji_url;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<GameContent>> getGameContent() {
        return this.game_content;
    }

    public Optional<Slot<Intention<Object>>> getReferIntention() {
        return this.refer_intention;
    }

    public Optional<Slot<Integer>> getRepetition() {
        return this.repetition;
    }

    @Required
    public Slot<String> getText() {
        return this.text;
    }

    public VoiceInput setDisplayTitle(Slot<String> slot) {
        this.display_title = Optional.e(slot);
        return this;
    }

    public VoiceInput setEmojiUrl(Slot<String> slot) {
        this.emoji_url = Optional.e(slot);
        return this;
    }

    @Required
    public VoiceInput setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VoiceInput setGameContent(Slot<GameContent> slot) {
        this.game_content = Optional.e(slot);
        return this;
    }

    public VoiceInput setReferIntention(Slot<Intention<Object>> slot) {
        this.refer_intention = Optional.e(slot);
        return this;
    }

    public VoiceInput setRepetition(Slot<Integer> slot) {
        this.repetition = Optional.e(slot);
        return this;
    }

    @Required
    public VoiceInput setText(Slot<String> slot) {
        this.text = slot;
        return this;
    }

    public VoiceInput(T t) {
        this.entity_type = t;
    }

    public VoiceInput(T t, Slot<String> slot) {
        this.entity_type = t;
        this.text = slot;
    }
}
