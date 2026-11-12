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
public class NFC<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<CardType> card_type;

    public enum CardType {
        TrafficCard(1, "TrafficCard"),
        AccessCard(2, "AccessCard"),
        BankCard(3, AIApiConstants.BankCard.NAME),
        NfcCard(4, "NfcCard");

        private int id;
        private String name;

        CardType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CardType find(String str) {
            for (CardType cardType : values()) {
                if (cardType.name.equals(str)) {
                    return cardType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CardType read(String str) {
            return find(str);
        }

        public static String write(CardType cardType) {
            return cardType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public NFC() {
    }

    public static NFC read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        NFC nfc = new NFC();
        nfc.setCardType(IntentUtils.readSlot(zsdVar.w("card_type"), CardType.class));
        return nfc;
    }

    public static zsd write(NFC nfc) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("card_type", IntentUtils.writeSlot(nfc.card_type));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<CardType> getCardType() {
        return this.card_type;
    }

    @Required
    public NFC setCardType(Slot<CardType> slot) {
        this.card_type = slot;
        return this;
    }

    public NFC(Slot<CardType> slot) {
        this.card_type = slot;
    }
}
