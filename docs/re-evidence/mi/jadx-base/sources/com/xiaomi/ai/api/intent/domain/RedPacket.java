package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
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
public class RedPacket<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<RedPacketSource>> source = Optional.a();
    private Optional<Slot<Boolean>> received = Optional.a();

    public enum RedPacketSource {
        Wechat(1, "wechat"),
        QQ(2, AIApiConstants.QQ.NAME);

        private int id;
        private String name;

        RedPacketSource(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static RedPacketSource find(String str) {
            for (RedPacketSource redPacketSource : values()) {
                if (redPacketSource.name.equals(str)) {
                    return redPacketSource;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static RedPacketSource read(String str) {
            return find(str);
        }

        public static String write(RedPacketSource redPacketSource) {
            return redPacketSource.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class number implements EntityType {
        public static number read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new number();
        }

        public static c4h write(number numberVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sum implements EntityType {
        public static sum read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new sum();
        }

        public static c4h write(sum sumVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public RedPacket() {
    }

    public static RedPacket read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        RedPacket redPacket = new RedPacket(IntentUtils.readEntityType(zsdVar, AIApiConstants.RedPacket.NAME, optional));
        if (zsdVar.z("source")) {
            redPacket.setSource(IntentUtils.readSlot(zsdVar.w("source"), RedPacketSource.class));
        }
        if (zsdVar.z("received")) {
            redPacket.setReceived(IntentUtils.readSlot(zsdVar.w("received"), Boolean.class));
        }
        return redPacket;
    }

    public static zsd write(RedPacket redPacket) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(redPacket.entity_type);
        if (redPacket.source.c()) {
            c4hVar.f0("source", IntentUtils.writeSlot(redPacket.source.b()));
        }
        if (redPacket.received.c()) {
            c4hVar.f0("received", IntentUtils.writeSlot(redPacket.received.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getReceived() {
        return this.received;
    }

    public Optional<Slot<RedPacketSource>> getSource() {
        return this.source;
    }

    @Required
    public RedPacket setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public RedPacket setReceived(Slot<Boolean> slot) {
        this.received = Optional.e(slot);
        return this;
    }

    public RedPacket setSource(Slot<RedPacketSource> slot) {
        this.source = Optional.e(slot);
        return this;
    }

    public RedPacket(T t) {
        this.entity_type = t;
    }
}
