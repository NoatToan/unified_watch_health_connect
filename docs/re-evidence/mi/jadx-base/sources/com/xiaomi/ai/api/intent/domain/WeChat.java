package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class WeChat<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class applet implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static applet read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            applet appletVar = new applet();
            if (zsdVar.z("name")) {
                appletVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return appletVar;
        }

        public static c4h write(applet appletVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (appletVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(appletVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public applet setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class broadcast implements EntityType {
        public static broadcast read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new broadcast();
        }

        public static c4h write(broadcast broadcastVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class collection implements EntityType {
        public static collection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new collection();
        }

        public static c4h write(collection collectionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class conversationHistory implements EntityType {
        private Optional<Slot<String>> with = Optional.a();

        public static conversationHistory read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            conversationHistory conversationhistory = new conversationHistory();
            if (zsdVar.z("with")) {
                conversationhistory.setWith(IntentUtils.readSlot(zsdVar.w("with"), String.class));
            }
            return conversationhistory;
        }

        public static c4h write(conversationHistory conversationhistory) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (conversationhistory.with.c()) {
                c4hVarCreateObjectNode.f0("with", IntentUtils.writeSlot(conversationhistory.with.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getWith() {
            return this.with;
        }

        public conversationHistory setWith(Slot<String> slot) {
            this.with = Optional.e(slot);
            return this;
        }
    }

    public static class groupAA implements EntityType {
        public static groupAA read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new groupAA();
        }

        public static c4h write(groupAA groupaa) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class image implements EntityType {
        private Optional<Slot<Integer>> number = Optional.a();

        public static image read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            image imageVar = new image();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                imageVar.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Integer.class));
            }
            return imageVar;
        }

        public static c4h write(image imageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (imageVar.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(imageVar.number.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getNumber() {
            return this.number;
        }

        public image setNumber(Slot<Integer> slot) {
            this.number = Optional.e(slot);
            return this;
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
        private Optional<Slot<String>> text = Optional.a();
        private Optional<Slot<Boolean>> contains_image = Optional.a();
        private Optional<Slot<Integer>> number_image = Optional.a();
        private Optional<Slot<Boolean>> check_messgae = Optional.a();

        public static moments read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            moments momentsVar = new moments();
            if (zsdVar.z("whose")) {
                momentsVar.setWhose(IntentUtils.readSlot(zsdVar.w("whose"), String.class));
            }
            if (zsdVar.z("text")) {
                momentsVar.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
            }
            if (zsdVar.z("contains_image")) {
                momentsVar.setContainsImage(IntentUtils.readSlot(zsdVar.w("contains_image"), Boolean.class));
            }
            if (zsdVar.z("number_image")) {
                momentsVar.setNumberImage(IntentUtils.readSlot(zsdVar.w("number_image"), Integer.class));
            }
            if (zsdVar.z("check_messgae")) {
                momentsVar.setCheckMessgae(IntentUtils.readSlot(zsdVar.w("check_messgae"), Boolean.class));
            }
            return momentsVar;
        }

        public static c4h write(moments momentsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (momentsVar.whose.c()) {
                c4hVarCreateObjectNode.f0("whose", IntentUtils.writeSlot(momentsVar.whose.b()));
            }
            if (momentsVar.text.c()) {
                c4hVarCreateObjectNode.f0("text", IntentUtils.writeSlot(momentsVar.text.b()));
            }
            if (momentsVar.contains_image.c()) {
                c4hVarCreateObjectNode.f0("contains_image", IntentUtils.writeSlot(momentsVar.contains_image.b()));
            }
            if (momentsVar.number_image.c()) {
                c4hVarCreateObjectNode.f0("number_image", IntentUtils.writeSlot(momentsVar.number_image.b()));
            }
            if (momentsVar.check_messgae.c()) {
                c4hVarCreateObjectNode.f0("check_messgae", IntentUtils.writeSlot(momentsVar.check_messgae.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getCheckMessgae() {
            return this.check_messgae;
        }

        public Optional<Slot<Boolean>> getContainsImage() {
            return this.contains_image;
        }

        public Optional<Slot<Integer>> getNumberImage() {
            return this.number_image;
        }

        public Optional<Slot<String>> getText() {
            return this.text;
        }

        public Optional<Slot<String>> getWhose() {
            return this.whose;
        }

        public moments setCheckMessgae(Slot<Boolean> slot) {
            this.check_messgae = Optional.e(slot);
            return this;
        }

        public moments setContainsImage(Slot<Boolean> slot) {
            this.contains_image = Optional.e(slot);
            return this;
        }

        public moments setNumberImage(Slot<Integer> slot) {
            this.number_image = Optional.e(slot);
            return this;
        }

        public moments setText(Slot<String> slot) {
            this.text = Optional.e(slot);
            return this;
        }

        public moments setWhose(Slot<String> slot) {
            this.whose = Optional.e(slot);
            return this;
        }
    }

    public static class paymentCode implements EntityType {
        public static paymentCode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new paymentCode();
        }

        public static c4h write(paymentCode paymentcode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class qrCode implements EntityType {
        public static qrCode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new qrCode();
        }

        public static c4h write(qrCode qrcode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class receiptCode implements EntityType {
        public static receiptCode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new receiptCode();
        }

        public static c4h write(receiptCode receiptcode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class redPacket implements EntityType {
        private Optional<Slot<Double>> amount = Optional.a();
        private Optional<Slot<Integer>> number = Optional.a();
        private Optional<Slot<String>> message = Optional.a();

        public static redPacket read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            redPacket redpacket = new redPacket();
            if (zsdVar.z("amount")) {
                redpacket.setAmount(IntentUtils.readSlot(zsdVar.w("amount"), Double.class));
            }
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                redpacket.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Integer.class));
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
            if (redpacket.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(redpacket.number.b()));
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

        public Optional<Slot<Integer>> getNumber() {
            return this.number;
        }

        public redPacket setAmount(Slot<Double> slot) {
            this.amount = Optional.e(slot);
            return this;
        }

        public redPacket setMessage(Slot<String> slot) {
            this.message = Optional.e(slot);
            return this;
        }

        public redPacket setNumber(Slot<Integer> slot) {
            this.number = Optional.e(slot);
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

    public static class transfer implements EntityType {
        private Optional<Slot<Double>> amount = Optional.a();

        public static transfer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            transfer transferVar = new transfer();
            if (zsdVar.z("amount")) {
                transferVar.setAmount(IntentUtils.readSlot(zsdVar.w("amount"), Double.class));
            }
            return transferVar;
        }

        public static c4h write(transfer transferVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (transferVar.amount.c()) {
                c4hVarCreateObjectNode.f0("amount", IntentUtils.writeSlot(transferVar.amount.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Double>> getAmount() {
            return this.amount;
        }

        public transfer setAmount(Slot<Double> slot) {
            this.amount = Optional.e(slot);
            return this;
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

    public WeChat() {
    }

    public static WeChat read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new WeChat(IntentUtils.readEntityType(zsdVar, "WeChat", optional));
    }

    public static zsd write(WeChat weChat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(weChat.entity_type);
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
    public WeChat setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public WeChat(T t) {
        this.entity_type = t;
    }
}
