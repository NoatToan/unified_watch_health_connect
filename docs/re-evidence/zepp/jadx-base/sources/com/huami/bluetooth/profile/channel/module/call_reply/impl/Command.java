package com.huami.bluetooth.profile.channel.module.call_reply.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0011\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0010\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "<init>", "(I)V", "Companion", "Delete", "DeleteResult", "EditSms", "QueryData", "QueryDataResult", "QuerySmsPermission", "QuerySmsPermissionResult", "QueryVersion", "ReplyCall", "ReplyCallResult", "ReplyContent", "SyncData", "SyncDataResult", "UpdateData", "UpdateDataResult", "VersionResult", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$Delete;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$DeleteResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCall;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCallResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermission;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermissionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$EditSms;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyContent;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class Command extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$Companion;", "", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "toCommand", "", "CMD_BYTE_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", Constant.h, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Command, Boolean> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(byte[] bArr) {
                super(1);
                this.a = bArr;
            }

            public final boolean a(@NotNull Command command) {
                byte[] bArr = command.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                byte[] bArr2 = this.a;
                return bArr2.length >= bArr.length && Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr.length));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Command command) {
                return Boolean.valueOf(a(command));
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Command toCommand(@NotNull byte[] bArr) throws Exception {
            a aVar = new a(bArr);
            Command command = QueryVersion.INSTANCE;
            if (!aVar.invoke(command).booleanValue()) {
                command = VersionResult.INSTANCE;
                if (!aVar.invoke(command).booleanValue()) {
                    command = QueryData.INSTANCE;
                    if (!aVar.invoke(command).booleanValue()) {
                        command = QueryDataResult.INSTANCE;
                        if (!aVar.invoke(command).booleanValue()) {
                            command = UpdateData.INSTANCE;
                            if (!aVar.invoke(command).booleanValue()) {
                                command = UpdateDataResult.INSTANCE;
                                if (!aVar.invoke(command).booleanValue()) {
                                    command = Delete.INSTANCE;
                                    if (!aVar.invoke(command).booleanValue()) {
                                        command = DeleteResult.INSTANCE;
                                        if (!aVar.invoke(command).booleanValue()) {
                                            command = SyncData.INSTANCE;
                                            if (!aVar.invoke(command).booleanValue()) {
                                                command = SyncDataResult.INSTANCE;
                                                if (!aVar.invoke(command).booleanValue()) {
                                                    command = ReplyCall.INSTANCE;
                                                    if (!aVar.invoke(command).booleanValue()) {
                                                        command = ReplyCallResult.INSTANCE;
                                                        if (!aVar.invoke(command).booleanValue()) {
                                                            command = QuerySmsPermission.INSTANCE;
                                                            if (!aVar.invoke(command).booleanValue()) {
                                                                command = QuerySmsPermissionResult.INSTANCE;
                                                                if (!aVar.invoke(command).booleanValue()) {
                                                                    command = EditSms.INSTANCE;
                                                                    if (!aVar.invoke(command).booleanValue()) {
                                                                        command = ReplyContent.INSTANCE;
                                                                        if (!aVar.invoke(command).booleanValue()) {
                                                                            throw new Exception("Unknown command!");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return command;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$Delete;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Delete extends Command {

        @NotNull
        public static final Delete INSTANCE = new Delete();

        private Delete() {
            super(7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$DeleteResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteResult extends Command {

        @NotNull
        public static final DeleteResult INSTANCE = new DeleteResult();

        private DeleteResult() {
            super(8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$EditSms;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EditSms extends Command {

        @NotNull
        public static final EditSms INSTANCE = new EditSms();

        private EditSms() {
            super(15, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryData extends Command {

        @NotNull
        public static final QueryData INSTANCE = new QueryData();

        private QueryData() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryDataResult extends Command {

        @NotNull
        public static final QueryDataResult INSTANCE = new QueryDataResult();

        private QueryDataResult() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermission;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QuerySmsPermission extends Command {

        @NotNull
        public static final QuerySmsPermission INSTANCE = new QuerySmsPermission();

        private QuerySmsPermission() {
            super(13, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermissionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QuerySmsPermissionResult extends Command {

        @NotNull
        public static final QuerySmsPermissionResult INSTANCE = new QuerySmsPermissionResult();

        private QuerySmsPermissionResult() {
            super(14, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryVersion extends Command {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCall;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReplyCall extends Command {

        @NotNull
        public static final ReplyCall INSTANCE = new ReplyCall();

        private ReplyCall() {
            super(11, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCallResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReplyCallResult extends Command {

        @NotNull
        public static final ReplyCallResult INSTANCE = new ReplyCallResult();

        private ReplyCallResult() {
            super(12, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyContent;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ReplyContent extends Command {

        @NotNull
        public static final ReplyContent INSTANCE = new ReplyContent();

        private ReplyContent() {
            super(16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncData extends Command {

        @NotNull
        public static final SyncData INSTANCE = new SyncData();

        private SyncData() {
            super(9, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SyncDataResult extends Command {

        @NotNull
        public static final SyncDataResult INSTANCE = new SyncDataResult();

        private SyncDataResult() {
            super(10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateData extends Command {

        @NotNull
        public static final UpdateData INSTANCE = new UpdateData();

        private UpdateData() {
            super(5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class UpdateDataResult extends Command {

        @NotNull
        public static final UpdateDataResult INSTANCE = new UpdateDataResult();

        private UpdateDataResult() {
            super(6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class VersionResult extends Command {

        @NotNull
        public static final VersionResult INSTANCE = new VersionResult();

        private VersionResult() {
            super(2, null);
        }
    }

    private Command(int i) {
        super(ByteUtilsKt.toByteArray(i, 1));
    }

    public /* synthetic */ Command(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
