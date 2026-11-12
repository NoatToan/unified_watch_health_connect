package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;

/* JADX INFO: loaded from: classes18.dex */
public class TVController {

    public enum BLEActionType {
        BOOT(0);

        private int id;

        BLEActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Operate", namespace = AIApiConstants.TVController.NAME)
    public static class Operate implements InstructionPayload {
        private Optional<String> action = Optional.empty();
        private Optional<String> query = Optional.empty();
        private Optional<BLEActionType> ble_action = Optional.empty();
        private Optional<String> bluetooth_mac = Optional.empty();

        public Optional<String> getAction() {
            return this.action;
        }

        public Optional<BLEActionType> getBleAction() {
            return this.ble_action;
        }

        public Optional<String> getBluetoothMac() {
            return this.bluetooth_mac;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Operate setAction(String str) {
            this.action = Optional.ofNullable(str);
            return this;
        }

        public Operate setBleAction(BLEActionType bLEActionType) {
            this.ble_action = Optional.ofNullable(bLEActionType);
            return this;
        }

        public Operate setBluetoothMac(String str) {
            this.bluetooth_mac = Optional.ofNullable(str);
            return this;
        }

        public Operate setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = TrainingAnalytics.ParamKey.STATE, namespace = AIApiConstants.TVController.NAME)
    public static class State implements ContextPayload {
        private Optional<Boolean> tv_binded = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<String> bluetooth_mac = Optional.empty();
        private Optional<Integer> tv_num = Optional.empty();

        public Optional<String> getBluetoothMac() {
            return this.bluetooth_mac;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Integer> getTvNum() {
            return this.tv_num;
        }

        public Optional<Boolean> isTvBinded() {
            return this.tv_binded;
        }

        public State setBluetoothMac(String str) {
            this.bluetooth_mac = Optional.ofNullable(str);
            return this;
        }

        public State setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public State setTvBinded(boolean z) {
            this.tv_binded = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setTvNum(int i) {
            this.tv_num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }
}
