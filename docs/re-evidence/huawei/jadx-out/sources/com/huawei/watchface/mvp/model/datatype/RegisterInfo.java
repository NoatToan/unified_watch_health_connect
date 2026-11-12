package com.huawei.watchface.mvp.model.datatype;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class RegisterInfo {
    private List<RegisterBean> list;

    public static class RegisterBean {
        private String bluetoothTlvName;
        private int commandId;
        private int commandType;
        private String deviceCommand;
        private int serviceId;
        private int type;

        public String getBluetoothTlvName() {
            return this.bluetoothTlvName;
        }

        public int getCommandId() {
            return this.commandId;
        }

        public int getCommandType() {
            return this.commandType;
        }

        public String getDeviceCommand() {
            return this.deviceCommand;
        }

        public int getServiceId() {
            return this.serviceId;
        }

        public int getType() {
            return this.type;
        }

        public void setBluetoothTlvName(String str) {
            this.bluetoothTlvName = str;
        }

        public void setCommandId(int i) {
            this.commandId = i;
        }

        public void setCommandType(int i) {
            this.commandType = i;
        }

        public void setDeviceCommand(String str) {
            this.deviceCommand = str;
        }

        public void setServiceId(int i) {
            this.serviceId = i;
        }

        public void setType(int i) {
            this.type = i;
        }
    }

    public List<RegisterBean> getList() {
        return this.list;
    }

    public void setList(List<RegisterBean> list) {
        this.list = list;
    }
}
