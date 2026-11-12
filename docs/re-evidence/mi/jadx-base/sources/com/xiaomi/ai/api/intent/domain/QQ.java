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
public class QQ<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class addFriend implements EntityType {
        public static addFriend read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new addFriend();
        }

        public static c4h write(addFriend addfriend) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class contacts implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static contacts read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            contacts contactsVar = new contacts();
            if (zsdVar.z("name")) {
                contactsVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return contactsVar;
        }

        public static c4h write(contacts contactsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (contactsVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(contactsVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public contacts setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class createGroup implements EntityType {
        public static createGroup read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new createGroup();
        }

        public static c4h write(createGroup creategroup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class message implements EntityType {
        private Optional<Slot<String>> text = Optional.a();

        public static message read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            message messageVar = new message();
            if (zsdVar.z("text")) {
                messageVar.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
            }
            return messageVar;
        }

        public static c4h write(message messageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (messageVar.text.c()) {
                c4hVarCreateObjectNode.f0("text", IntentUtils.writeSlot(messageVar.text.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getText() {
            return this.text;
        }

        public message setText(Slot<String> slot) {
            this.text = Optional.e(slot);
            return this;
        }
    }

    public static class moments implements EntityType {
        private Optional<Slot<String>> whose = Optional.a();

        public static moments read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            moments momentsVar = new moments();
            if (zsdVar.z("whose")) {
                momentsVar.setWhose(IntentUtils.readSlot(zsdVar.w("whose"), String.class));
            }
            return momentsVar;
        }

        public static c4h write(moments momentsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (momentsVar.whose.c()) {
                c4hVarCreateObjectNode.f0("whose", IntentUtils.writeSlot(momentsVar.whose.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getWhose() {
            return this.whose;
        }

        public moments setWhose(Slot<String> slot) {
            this.whose = Optional.e(slot);
            return this;
        }
    }

    public static class redPacket implements EntityType {
        private Optional<Slot<Double>> amount = Optional.a();
        private Optional<Slot<String>> message = Optional.a();

        public static redPacket read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            redPacket redpacket = new redPacket();
            if (zsdVar.z("amount")) {
                redpacket.setAmount(IntentUtils.readSlot(zsdVar.w("amount"), Double.class));
            }
            if (zsdVar.z("message")) {
                redpacket.setMessage(IntentUtils.readSlot(zsdVar.w("message"), String.class));
            }
            return redpacket;
        }

        public static c4h write(redPacket redpacket) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (redpacket.amount.c()) {
                c4hVarCreateObjectNode.f0("amount", IntentUtils.writeSlot(redpacket.amount.b()));
            }
            if (redpacket.message.c()) {
                c4hVarCreateObjectNode.f0("message", IntentUtils.writeSlot(redpacket.message.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Double>> getAmount() {
            return this.amount;
        }

        public Optional<Slot<String>> getMessage() {
            return this.message;
        }

        public redPacket setAmount(Slot<Double> slot) {
            this.amount = Optional.e(slot);
            return this;
        }

        public redPacket setMessage(Slot<String> slot) {
            this.message = Optional.e(slot);
            return this;
        }
    }

    public static class scan implements EntityType {
        public static scan read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new scan();
        }

        public static c4h write(scan scanVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class videoChat implements EntityType {
        public static videoChat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new videoChat();
        }

        public static c4h write(videoChat videochat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class voiceChat implements EntityType {
        public static voiceChat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new voiceChat();
        }

        public static c4h write(voiceChat voicechat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public QQ() {
    }

    public static QQ read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new QQ(IntentUtils.readEntityType(zsdVar, AIApiConstants.QQ.NAME, optional));
    }

    public static zsd write(QQ qq) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(qq.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public QQ setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public QQ(T t) {
        this.entity_type = t;
    }
}
