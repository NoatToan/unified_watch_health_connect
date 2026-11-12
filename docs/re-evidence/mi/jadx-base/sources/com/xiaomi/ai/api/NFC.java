package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;

/* JADX INFO: loaded from: classes6.dex */
public class NFC {

    public enum CardType {
        UNKNOWN(-1),
        BANK(0),
        TRAFFIC(1),
        ACCESS(2),
        DEFAULT(3);

        private int id;

        CardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Switch.NAME, namespace = "NFC")
    public static class Switch implements InstructionPayload {

        @Required
        private CardType card;

        public Switch() {
        }

        public Switch(CardType cardType) {
            this.card = cardType;
        }

        @Required
        public CardType getCard() {
            return this.card;
        }

        @Required
        public Switch setCard(CardType cardType) {
            this.card = cardType;
            return this;
        }
    }

    @NamespaceName(name = "TurnOff", namespace = "NFC")
    public static class TurnOff implements InstructionPayload {

        @Required
        private CardType card;

        public TurnOff() {
        }

        public TurnOff(CardType cardType) {
            this.card = cardType;
        }

        @Required
        public CardType getCard() {
            return this.card;
        }

        @Required
        public TurnOff setCard(CardType cardType) {
            this.card = cardType;
            return this;
        }
    }

    @NamespaceName(name = "TurnOn", namespace = "NFC")
    public static class TurnOn implements InstructionPayload {

        @Required
        private CardType card;

        public TurnOn() {
        }

        public TurnOn(CardType cardType) {
            this.card = cardType;
        }

        @Required
        public CardType getCard() {
            return this.card;
        }

        @Required
        public TurnOn setCard(CardType cardType) {
            this.card = cardType;
            return this;
        }
    }
}
