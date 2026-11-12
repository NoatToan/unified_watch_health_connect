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
public class ShortVideo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> trunk_query = Optional.a();
    private Optional<Slot<String>> keyword_tag = Optional.a();
    private Optional<Slot<Miai.ContentProvider>> content_provider = Optional.a();
    private Optional<Slot<VideoFeature>> features = Optional.a();

    public static class content implements EntityType {
        private Optional<Slot<String>> category = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> keyword = Optional.a();
        private Optional<Slot<String>> type = Optional.a();

        public static content read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            content contentVar = new content();
            if (zsdVar.z("category")) {
                contentVar.setCategory(IntentUtils.readSlot(zsdVar.w("category"), String.class));
            }
            if (zsdVar.z("tag")) {
                contentVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
                contentVar.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
            }
            if (zsdVar.z("type")) {
                contentVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            return contentVar;
        }

        public static c4h write(content contentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (contentVar.category.c()) {
                c4hVarCreateObjectNode.f0("category", IntentUtils.writeSlot(contentVar.category.b()));
            }
            if (contentVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(contentVar.tag.b()));
            }
            if (contentVar.keyword.c()) {
                c4hVarCreateObjectNode.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(contentVar.keyword.b()));
            }
            if (contentVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(contentVar.type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCategory() {
            return this.category;
        }

        public Optional<Slot<String>> getKeyword() {
            return this.keyword;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public content setCategory(Slot<String> slot) {
            this.category = Optional.e(slot);
            return this;
        }

        public content setKeyword(Slot<String> slot) {
            this.keyword = Optional.e(slot);
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

    public ShortVideo() {
    }

    public static ShortVideo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ShortVideo shortVideo = new ShortVideo(IntentUtils.readEntityType(zsdVar, AIApiConstants.ShortVideo.NAME, optional));
        if (zsdVar.z("trunk_query")) {
            shortVideo.setTrunkQuery(IntentUtils.readSlot(zsdVar.w("trunk_query"), String.class));
        }
        if (zsdVar.z("keyword_tag")) {
            shortVideo.setKeywordTag(IntentUtils.readSlot(zsdVar.w("keyword_tag"), String.class));
        }
        if (zsdVar.z("content_provider")) {
            shortVideo.setContentProvider(IntentUtils.readSlot(zsdVar.w("content_provider"), Miai.ContentProvider.class));
        }
        if (zsdVar.z("features")) {
            shortVideo.setFeatures(IntentUtils.readSlot(zsdVar.w("features"), VideoFeature.class));
        }
        return shortVideo;
    }

    public static zsd write(ShortVideo shortVideo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(shortVideo.entity_type);
        if (shortVideo.trunk_query.c()) {
            c4hVar.f0("trunk_query", IntentUtils.writeSlot(shortVideo.trunk_query.b()));
        }
        if (shortVideo.keyword_tag.c()) {
            c4hVar.f0("keyword_tag", IntentUtils.writeSlot(shortVideo.keyword_tag.b()));
        }
        if (shortVideo.content_provider.c()) {
            c4hVar.f0("content_provider", IntentUtils.writeSlot(shortVideo.content_provider.b()));
        }
        if (shortVideo.features.c()) {
            c4hVar.f0("features", IntentUtils.writeSlot(shortVideo.features.b()));
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

    public Optional<Slot<String>> getKeywordTag() {
        return this.keyword_tag;
    }

    public Optional<Slot<String>> getTrunkQuery() {
        return this.trunk_query;
    }

    public ShortVideo setContentProvider(Slot<Miai.ContentProvider> slot) {
        this.content_provider = Optional.e(slot);
        return this;
    }

    @Required
    public ShortVideo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ShortVideo setFeatures(Slot<VideoFeature> slot) {
        this.features = Optional.e(slot);
        return this;
    }

    public ShortVideo setKeywordTag(Slot<String> slot) {
        this.keyword_tag = Optional.e(slot);
        return this;
    }

    public ShortVideo setTrunkQuery(Slot<String> slot) {
        this.trunk_query = Optional.e(slot);
        return this;
    }

    public ShortVideo(T t) {
        this.entity_type = t;
    }
}
