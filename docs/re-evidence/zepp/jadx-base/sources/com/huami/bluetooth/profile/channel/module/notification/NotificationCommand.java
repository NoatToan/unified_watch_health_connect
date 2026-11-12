package com.huami.bluetooth.profile.channel.module.notification;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u001b\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0015\u0011\u0012\u0013\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "toString", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(I)V", "Companion", "AddContactSettingItem", "AddResultCommand", "AppReplyResult", "DeleteContactSettingItems", "DeleteResultCommand", "LogoRequest", "LogoResponse", "MessageControl", "ModifyContactSettingItem", "ModifyResultCommand", "QueryContactSettingItems", "QueryResultCommand", "QueryVersion", "ReplyMessage", "ReplyVersion", "SetNotification", "UpdateContactSettings", "UpdateResultCommand", "VibrateResultCommand", "VibrateSpecificMode", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class NotificationCommand extends Request.Command {
    private static final int c = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$AddContactSettingItem;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AddContactSettingItem extends NotificationCommand {

        @NotNull
        public static final AddContactSettingItem INSTANCE = new AddContactSettingItem();

        private AddContactSettingItem() {
            super(11);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$AddResultCommand;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AddResultCommand extends NotificationCommand {

        @NotNull
        public static final AddResultCommand INSTANCE = new AddResultCommand();

        private AddResultCommand() {
            super(12);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$AppReplyResult;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AppReplyResult extends NotificationCommand {

        @NotNull
        public static final AppReplyResult INSTANCE = new AppReplyResult();

        private AppReplyResult() {
            super(6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$DeleteContactSettingItems;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteContactSettingItems extends NotificationCommand {

        @NotNull
        public static final DeleteContactSettingItems INSTANCE = new DeleteContactSettingItems();

        private DeleteContactSettingItems() {
            super(15);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$DeleteResultCommand;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteResultCommand extends NotificationCommand {

        @NotNull
        public static final DeleteResultCommand INSTANCE = new DeleteResultCommand();

        private DeleteResultCommand() {
            super(18);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$LogoRequest;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class LogoRequest extends NotificationCommand {

        @NotNull
        public static final LogoRequest INSTANCE = new LogoRequest();

        private LogoRequest() {
            super(16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$LogoResponse;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class LogoResponse extends NotificationCommand {

        @NotNull
        public static final LogoResponse INSTANCE = new LogoResponse();

        private LogoResponse() {
            super(17);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$MessageControl;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class MessageControl extends NotificationCommand {

        @NotNull
        public static final MessageControl INSTANCE = new MessageControl();

        private MessageControl() {
            super(5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$ModifyContactSettingItem;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifyContactSettingItem extends NotificationCommand {

        @NotNull
        public static final ModifyContactSettingItem INSTANCE = new ModifyContactSettingItem();

        private ModifyContactSettingItem() {
            super(13);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$ModifyResultCommand;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ModifyResultCommand extends NotificationCommand {

        @NotNull
        public static final ModifyResultCommand INSTANCE = new ModifyResultCommand();

        private ModifyResultCommand() {
            super(14);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$QueryContactSettingItems;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryContactSettingItems extends NotificationCommand {

        @NotNull
        public static final QueryContactSettingItems INSTANCE = new QueryContactSettingItems();

        private QueryContactSettingItems() {
            super(7);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$QueryResultCommand;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryResultCommand extends NotificationCommand {

        @NotNull
        public static final QueryResultCommand INSTANCE = new QueryResultCommand();

        private QueryResultCommand() {
            super(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends NotificationCommand {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$ReplyMessage;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReplyMessage extends NotificationCommand {

        @NotNull
        public static final ReplyMessage INSTANCE = new ReplyMessage();

        private ReplyMessage() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$ReplyVersion;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReplyVersion extends NotificationCommand {

        @NotNull
        public static final ReplyVersion INSTANCE = new ReplyVersion();

        private ReplyVersion() {
            super(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$SetNotification;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetNotification extends NotificationCommand {

        @NotNull
        public static final SetNotification INSTANCE = new SetNotification();

        private SetNotification() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$UpdateContactSettings;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateContactSettings extends NotificationCommand {

        @NotNull
        public static final UpdateContactSettings INSTANCE = new UpdateContactSettings();

        private UpdateContactSettings() {
            super(9);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$UpdateResultCommand;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateResultCommand extends NotificationCommand {

        @NotNull
        public static final UpdateResultCommand INSTANCE = new UpdateResultCommand();

        private UpdateResultCommand() {
            super(10);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$VibrateResultCommand;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VibrateResultCommand extends NotificationCommand {

        @NotNull
        public static final VibrateResultCommand INSTANCE = new VibrateResultCommand();

        private VibrateResultCommand() {
            super(20);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand$VibrateSpecificMode;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VibrateSpecificMode extends NotificationCommand {

        @NotNull
        public static final VibrateSpecificMode INSTANCE = new VibrateSpecificMode();

        private VibrateSpecificMode() {
            super(19);
        }
    }

    public NotificationCommand(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
        this.cmd = i;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    /* JADX INFO: renamed from: getBytes */
    public byte[] getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String() {
        return ByteUtilsKt.toByteArray(this.cmd, 1);
    }

    public final int getCmd() {
        return this.cmd;
    }

    @Override // com.huami.bluetooth.profile.Request.Command
    @NotNull
    public String toString() {
        return "NotificationCommand {cmd: " + this.cmd + '}';
    }
}
