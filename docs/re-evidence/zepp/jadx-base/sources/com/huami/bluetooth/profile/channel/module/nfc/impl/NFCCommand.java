package com.huami.bluetooth.profile.channel.module.nfc.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b!\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0019\u0011\u0012\u0013\u0014\u0015\u0010\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getCmd", "()I", Constant.h, "", "c", "[B", "getExtra", "()[B", "extra", "<init>", "(I[B)V", "Companion", "APDUCommand", "APDUStateChangedCommand", "CardConfigCommand", "CheckApplicationSupportCommand", "CloseAPDUCommand", "DeleteTimeSwitchCard", "GetAreaCodeCommand", "GetCPLCCommand", "GetCardDetailCommand", "GetTransactionCommand", "IndicateCardStateCommand", "LoadServiceCommand", "MasterAPDUCommand", "OpenAPDUCommand", "PasswordCommand", "QueryBalanceCommand", "QueryVersionCommand", "ReadCardCommand", "ReadTradesCommand", "RefreshCardListCommand", "RequestTimeSwitchCardList", "SetCardNameCommand", "SetTimeSwitchCard", "TradeChangedCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class NFCCommand extends Request.Command {
    private static final int d = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cmd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final byte[] extra;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$APDUCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class APDUCommand extends NFCCommand {

        @NotNull
        public static final APDUCommand INSTANCE = new APDUCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private APDUCommand() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$APDUStateChangedCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class APDUStateChangedCommand extends NFCCommand {

        @NotNull
        public static final APDUStateChangedCommand INSTANCE = new APDUStateChangedCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private APDUStateChangedCommand() {
            super(20, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$CardConfigCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CardConfigCommand extends NFCCommand {

        @NotNull
        public static final CardConfigCommand INSTANCE = new CardConfigCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private CardConfigCommand() {
            super(7, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$CheckApplicationSupportCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CheckApplicationSupportCommand extends NFCCommand {

        @NotNull
        public static final CheckApplicationSupportCommand INSTANCE = new CheckApplicationSupportCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private CheckApplicationSupportCommand() {
            super(14, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$CloseAPDUCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CloseAPDUCommand extends NFCCommand {

        @NotNull
        public static final CloseAPDUCommand INSTANCE = new CloseAPDUCommand();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        private CloseAPDUCommand() {
            int i = 2;
            super(i, null, i, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$DeleteTimeSwitchCard;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteTimeSwitchCard extends NFCCommand {

        @NotNull
        public static final DeleteTimeSwitchCard INSTANCE = new DeleteTimeSwitchCard();

        /* JADX WARN: Multi-variable type inference failed */
        private DeleteTimeSwitchCard() {
            super(25, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$GetAreaCodeCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetAreaCodeCommand extends NFCCommand {

        @NotNull
        public static final GetAreaCodeCommand INSTANCE = new GetAreaCodeCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private GetAreaCodeCommand() {
            super(13, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$GetCPLCCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetCPLCCommand extends NFCCommand {

        @NotNull
        public static final GetCPLCCommand INSTANCE = new GetCPLCCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private GetCPLCCommand() {
            super(12, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$GetCardDetailCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetCardDetailCommand extends NFCCommand {

        @NotNull
        public static final GetCardDetailCommand INSTANCE = new GetCardDetailCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private GetCardDetailCommand() {
            super(11, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$GetTransactionCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetTransactionCommand extends NFCCommand {

        @NotNull
        public static final GetTransactionCommand INSTANCE = new GetTransactionCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private GetTransactionCommand() {
            super(10, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$IndicateCardStateCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class IndicateCardStateCommand extends NFCCommand {

        @NotNull
        public static final IndicateCardStateCommand INSTANCE = new IndicateCardStateCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private IndicateCardStateCommand() {
            super(18, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$LoadServiceCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class LoadServiceCommand extends NFCCommand {

        @NotNull
        public static final LoadServiceCommand INSTANCE = new LoadServiceCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private LoadServiceCommand() {
            super(23, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$MasterAPDUCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class MasterAPDUCommand extends NFCCommand {

        @NotNull
        public static final MasterAPDUCommand INSTANCE = new MasterAPDUCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private MasterAPDUCommand() {
            super(17, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$OpenAPDUCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OpenAPDUCommand extends NFCCommand {

        @NotNull
        public static final OpenAPDUCommand INSTANCE = new OpenAPDUCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private OpenAPDUCommand() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$PasswordCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PasswordCommand extends NFCCommand {

        @NotNull
        public static final PasswordCommand INSTANCE = new PasswordCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private PasswordCommand() {
            super(21, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$QueryBalanceCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryBalanceCommand extends NFCCommand {

        @NotNull
        public static final QueryBalanceCommand INSTANCE = new QueryBalanceCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private QueryBalanceCommand() {
            super(9, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$QueryVersionCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersionCommand extends NFCCommand {

        @NotNull
        public static final QueryVersionCommand INSTANCE = new QueryVersionCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private QueryVersionCommand() {
            super(0, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$ReadCardCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReadCardCommand extends NFCCommand {

        @NotNull
        public static final ReadCardCommand INSTANCE = new ReadCardCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private ReadCardCommand() {
            super(4, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$ReadTradesCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReadTradesCommand extends NFCCommand {

        @NotNull
        public static final ReadTradesCommand INSTANCE = new ReadTradesCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private ReadTradesCommand() {
            super(6, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$RefreshCardListCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class RefreshCardListCommand extends NFCCommand {

        @NotNull
        public static final RefreshCardListCommand INSTANCE = new RefreshCardListCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private RefreshCardListCommand() {
            super(8, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$RequestTimeSwitchCardList;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class RequestTimeSwitchCardList extends NFCCommand {

        @NotNull
        public static final RequestTimeSwitchCardList INSTANCE = new RequestTimeSwitchCardList();

        /* JADX WARN: Multi-variable type inference failed */
        private RequestTimeSwitchCardList() {
            super(26, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$SetCardNameCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetCardNameCommand extends NFCCommand {

        @NotNull
        public static final SetCardNameCommand INSTANCE = new SetCardNameCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private SetCardNameCommand() {
            super(19, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$SetTimeSwitchCard;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetTimeSwitchCard extends NFCCommand {

        @NotNull
        public static final SetTimeSwitchCard INSTANCE = new SetTimeSwitchCard();

        /* JADX WARN: Multi-variable type inference failed */
        private SetTimeSwitchCard() {
            super(24, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand$TradeChangedCommand;", "Lcom/huami/bluetooth/profile/channel/module/nfc/impl/NFCCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class TradeChangedCommand extends NFCCommand {

        @NotNull
        public static final TradeChangedCommand INSTANCE = new TradeChangedCommand();

        /* JADX WARN: Multi-variable type inference failed */
        private TradeChangedCommand() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    public NFCCommand(int i, @NotNull byte[] bArr) {
        super(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(i, 1), bArr));
        this.cmd = i;
        this.extra = bArr;
    }

    public final int getCmd() {
        return this.cmd;
    }

    @NotNull
    public final byte[] getExtra() {
        return this.extra;
    }

    public /* synthetic */ NFCCommand(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new byte[0] : bArr);
    }
}
