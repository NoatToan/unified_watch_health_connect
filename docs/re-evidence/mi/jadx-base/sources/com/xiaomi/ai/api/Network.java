package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;

/* JADX INFO: loaded from: classes6.dex */
public class Network {

    public enum NetworkType {
        UNKNOWN(-1),
        WIFI(0),
        DATA(1),
        HOTSPOT(2),
        DATA_2G(3),
        DATA_3G(4),
        DATA_4G(5),
        DATA_5G(6);

        private int id;

        NetworkType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Switch.NAME, namespace = "Network")
    public static class Switch implements InstructionPayload {

        @Required
        private NetworkType target;

        public Switch() {
        }

        public Switch(NetworkType networkType) {
            this.target = networkType;
        }

        @Required
        public NetworkType getTarget() {
            return this.target;
        }

        @Required
        public Switch setTarget(NetworkType networkType) {
            this.target = networkType;
            return this;
        }
    }

    @NamespaceName(name = "TurnOff", namespace = "Network")
    public static class TurnOff implements InstructionPayload {

        @Required
        private NetworkType target;

        public TurnOff() {
        }

        public TurnOff(NetworkType networkType) {
            this.target = networkType;
        }

        @Required
        public NetworkType getTarget() {
            return this.target;
        }

        @Required
        public TurnOff setTarget(NetworkType networkType) {
            this.target = networkType;
            return this;
        }
    }

    @NamespaceName(name = "TurnOn", namespace = "Network")
    public static class TurnOn implements InstructionPayload {

        @Required
        private NetworkType target;

        public TurnOn() {
        }

        public TurnOn(NetworkType networkType) {
            this.target = networkType;
        }

        @Required
        public NetworkType getTarget() {
            return this.target;
        }

        @Required
        public TurnOn setTarget(NetworkType networkType) {
            this.target = networkType;
            return this;
        }
    }
}
