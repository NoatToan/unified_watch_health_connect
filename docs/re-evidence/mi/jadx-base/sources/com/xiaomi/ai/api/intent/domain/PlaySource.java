package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
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
public class PlaySource<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<ContentType>> about_slot = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();

    public enum ContentType {
        Name(1, "Name"),
        Artist(2, "Artist"),
        Episode(3, "Episode");

        private int id;
        private String name;

        ContentType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ContentType find(String str) {
            for (ContentType contentType : values()) {
                if (contentType.name.equals(str)) {
                    return contentType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ContentType read(String str) {
            return find(str);
        }

        public static String write(ContentType contentType) {
            return contentType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static PlaySource read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PlaySource playSource = new PlaySource();
        if (zsdVar.z("about_slot")) {
            playSource.setAboutSlot(IntentUtils.readSlot(zsdVar.w("about_slot"), ContentType.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            playSource.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        return playSource;
    }

    public static zsd write(PlaySource playSource) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (playSource.about_slot.c()) {
            c4hVarCreateObjectNode.f0("about_slot", IntentUtils.writeSlot(playSource.about_slot.b()));
        }
        if (playSource.keyword.c()) {
            c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(playSource.keyword.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<ContentType>> getAboutSlot() {
        return this.about_slot;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public PlaySource setAboutSlot(Slot<ContentType> slot) {
        this.about_slot = Optional.e(slot);
        return this;
    }

    public PlaySource setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }
}
