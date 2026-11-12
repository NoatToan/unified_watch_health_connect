package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Notification {

    public enum DeviceOpType {
        OPEN(0),
        CLOSE(1);

        private int id;

        DeviceOpType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CloseDeviceRemind", namespace = "Notification")
    public static class CloseDeviceRemind implements InstructionPayload {

        @Required
        private DeviceOpType op;

        @Required
        private List<String> pids;
        private Optional<Long> remind_delay_time = Optional.a();

        public CloseDeviceRemind() {
        }

        @Required
        public DeviceOpType getOp() {
            return this.op;
        }

        @Required
        public List<String> getPids() {
            return this.pids;
        }

        public Optional<Long> getRemindDelayTime() {
            return this.remind_delay_time;
        }

        @Required
        public CloseDeviceRemind setOp(DeviceOpType deviceOpType) {
            this.op = deviceOpType;
            return this;
        }

        @Required
        public CloseDeviceRemind setPids(List<String> list) {
            this.pids = list;
            return this;
        }

        public CloseDeviceRemind setRemindDelayTime(long j) {
            this.remind_delay_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public CloseDeviceRemind(DeviceOpType deviceOpType, List<String> list) {
            this.op = deviceOpType;
            this.pids = list;
        }
    }

    public static class GeneralUIAction {
        private Optional<Template.Launcher> confirm_action = Optional.a();

        @Required
        private boolean enable_back;

        @Required
        private boolean enable_confirm;

        public GeneralUIAction() {
        }

        public Optional<Template.Launcher> getConfirmAction() {
            return this.confirm_action;
        }

        @Required
        public boolean isEnableBack() {
            return this.enable_back;
        }

        @Required
        public boolean isEnableConfirm() {
            return this.enable_confirm;
        }

        public GeneralUIAction setConfirmAction(Template.Launcher launcher) {
            this.confirm_action = Optional.e(launcher);
            return this;
        }

        @Required
        public GeneralUIAction setEnableBack(boolean z) {
            this.enable_back = z;
            return this;
        }

        @Required
        public GeneralUIAction setEnableConfirm(boolean z) {
            this.enable_confirm = z;
            return this;
        }

        public GeneralUIAction(boolean z, boolean z2) {
            this.enable_back = z;
            this.enable_confirm = z2;
        }
    }

    @NamespaceName(name = AIApiConstants.General.NAME, namespace = "Notification")
    public static class General implements InstructionPayload {

        @Required
        private GeneralUIAction action;

        @Required
        private String channel_name;

        @Required
        private long duration;

        @Required
        private String guide;

        @Required
        private Template.Image logo;

        @Required
        private String message;
        private Optional<String> secondary_message = Optional.a();
        private Optional<Template.Image> image = Optional.a();

        public General() {
        }

        @Required
        public GeneralUIAction getAction() {
            return this.action;
        }

        @Required
        public String getChannelName() {
            return this.channel_name;
        }

        @Required
        public long getDuration() {
            return this.duration;
        }

        @Required
        public String getGuide() {
            return this.guide;
        }

        public Optional<Template.Image> getImage() {
            return this.image;
        }

        @Required
        public Template.Image getLogo() {
            return this.logo;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        public Optional<String> getSecondaryMessage() {
            return this.secondary_message;
        }

        @Required
        public General setAction(GeneralUIAction generalUIAction) {
            this.action = generalUIAction;
            return this;
        }

        @Required
        public General setChannelName(String str) {
            this.channel_name = str;
            return this;
        }

        @Required
        public General setDuration(long j) {
            this.duration = j;
            return this;
        }

        @Required
        public General setGuide(String str) {
            this.guide = str;
            return this;
        }

        public General setImage(Template.Image image) {
            this.image = Optional.e(image);
            return this;
        }

        @Required
        public General setLogo(Template.Image image) {
            this.logo = image;
            return this;
        }

        @Required
        public General setMessage(String str) {
            this.message = str;
            return this;
        }

        public General setSecondaryMessage(String str) {
            this.secondary_message = Optional.e(str);
            return this;
        }

        public General(String str, String str2, String str3, long j, Template.Image image, GeneralUIAction generalUIAction) {
            this.channel_name = str;
            this.message = str2;
            this.guide = str3;
            this.duration = j;
            this.logo = image;
            this.action = generalUIAction;
        }
    }
}
