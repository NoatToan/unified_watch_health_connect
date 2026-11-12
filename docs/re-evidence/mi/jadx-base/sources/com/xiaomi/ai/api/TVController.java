package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;

/* JADX INFO: loaded from: classes6.dex */
public class TVController {

    public enum BLEActionType {
        UNKNOWN(-1),
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
        private Optional<String> action = Optional.a();
        private Optional<String> query = Optional.a();
        private Optional<BLEActionType> ble_action = Optional.a();
        private Optional<String> bluetooth_mac = Optional.a();

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
            this.action = Optional.e(str);
            return this;
        }

        public Operate setBleAction(BLEActionType bLEActionType) {
            this.ble_action = Optional.e(bLEActionType);
            return this;
        }

        public Operate setBluetoothMac(String str) {
            this.bluetooth_mac = Optional.e(str);
            return this;
        }

        public Operate setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }
    }

    public enum PatchWallType {
        UNKNOWN(-1),
        FEEDS(0),
        HYPER_TERMINAL(1);

        private int id;

        PatchWallType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "State", namespace = AIApiConstants.TVController.NAME)
    public static class State implements ContextPayload {
        private Optional<Boolean> tv_binded = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> bluetooth_mac = Optional.a();
        private Optional<Integer> tv_num = Optional.a();
        private Optional<PatchWallInfo> patchwall_info = Optional.a();

        public Optional<String> getBluetoothMac() {
            return this.bluetooth_mac;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<PatchWallInfo> getPatchwallInfo() {
            return this.patchwall_info;
        }

        public Optional<Integer> getTvNum() {
            return this.tv_num;
        }

        public Optional<Boolean> isTvBinded() {
            return this.tv_binded;
        }

        public State setBluetoothMac(String str) {
            this.bluetooth_mac = Optional.e(str);
            return this;
        }

        public State setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public State setPatchwallInfo(PatchWallInfo patchWallInfo) {
            this.patchwall_info = Optional.e(patchWallInfo);
            return this;
        }

        public State setTvBinded(boolean z) {
            this.tv_binded = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setTvNum(int i) {
            this.tv_num = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "StateReport", namespace = AIApiConstants.TVController.NAME)
    public static class StateReport implements EventPayload {
        private Optional<TVControllerErrorType> control_error = Optional.a();
        private Optional<Boolean> is_success = Optional.a();

        public Optional<TVControllerErrorType> getControlError() {
            return this.control_error;
        }

        public Optional<Boolean> isSuccess() {
            return this.is_success;
        }

        public StateReport setControlError(TVControllerErrorType tVControllerErrorType) {
            this.control_error = Optional.e(tVControllerErrorType);
            return this;
        }

        public StateReport setIsSuccess(boolean z) {
            this.is_success = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum TVControllerErrorType {
        UNKNOWN(-1),
        OPEN_TV_SOCKET_FAIL(0),
        OPEN_TV_MESH_FAIL(1),
        OPEN_TV_BLE_FAIL(2);

        private int id;

        TVControllerErrorType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PatchWallInfo {
        private Optional<Boolean> is_poor_performance = Optional.a();

        @Required
        private c4h pass_through;

        @Required
        private PatchWallType type;

        public PatchWallInfo() {
        }

        @Required
        public c4h getPassThrough() {
            return this.pass_through;
        }

        @Required
        public PatchWallType getType() {
            return this.type;
        }

        public Optional<Boolean> isPoorPerformance() {
            return this.is_poor_performance;
        }

        public PatchWallInfo setIsPoorPerformance(boolean z) {
            this.is_poor_performance = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public PatchWallInfo setPassThrough(c4h c4hVar) {
            this.pass_through = c4hVar;
            return this;
        }

        @Required
        public PatchWallInfo setType(PatchWallType patchWallType) {
            this.type = patchWallType;
            return this;
        }

        public PatchWallInfo(c4h c4hVar, PatchWallType patchWallType) {
            this.pass_through = c4hVar;
            this.type = patchWallType;
        }
    }
}
