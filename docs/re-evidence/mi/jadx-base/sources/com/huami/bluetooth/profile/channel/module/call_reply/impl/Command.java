package com.huami.bluetooth.profile.channel.module.call_reply.impl;

import defpackage.c3;
import defpackage.jq;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0011\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0010\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "Ljq$a;", "", "cmd", "<init>", "(I)V", "Companion", "Delete", "DeleteResult", "EditSms", "QueryData", "QueryDataResult", "QuerySmsPermission", "QuerySmsPermissionResult", "QueryVersion", "ReplyCall", "ReplyCallResult", "ReplyContent", "SyncData", "SyncDataResult", "UpdateData", "UpdateDataResult", "VersionResult", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$Delete;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$DeleteResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$EditSms;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermission;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermissionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCall;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCallResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyContent;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$VersionResult;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class Command extends jq.a {
    private static final int CMD_BYTE_LEN = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$Companion;", "", "()V", "CMD_BYTE_LEN", "", "toCommand", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Command toCommand(@NotNull final byte[] bArr) throws Exception {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Function1<Command, Boolean> function1 = new Function1<Command, Boolean>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.Command$Companion$toCommand$isCommand$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0021  */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Command cmd) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(cmd, "cmd");
                    byte[] bytes = cmd.getBytes();
                    byte[] bArr2 = bArr;
                    if (bArr2.length >= bytes.length) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bytes.length);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                        if (Arrays.equals(bytes, bArrCopyOf)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            };
            Command command = QueryVersion.INSTANCE;
            if (!function1.invoke(command).booleanValue()) {
                command = VersionResult.INSTANCE;
                if (!function1.invoke(command).booleanValue()) {
                    command = QueryData.INSTANCE;
                    if (!function1.invoke(command).booleanValue()) {
                        command = QueryDataResult.INSTANCE;
                        if (!function1.invoke(command).booleanValue()) {
                            command = UpdateData.INSTANCE;
                            if (!function1.invoke(command).booleanValue()) {
                                command = UpdateDataResult.INSTANCE;
                                if (!function1.invoke(command).booleanValue()) {
                                    command = Delete.INSTANCE;
                                    if (!function1.invoke(command).booleanValue()) {
                                        command = DeleteResult.INSTANCE;
                                        if (!function1.invoke(command).booleanValue()) {
                                            command = SyncData.INSTANCE;
                                            if (!function1.invoke(command).booleanValue()) {
                                                command = SyncDataResult.INSTANCE;
                                                if (!function1.invoke(command).booleanValue()) {
                                                    command = ReplyCall.INSTANCE;
                                                    if (!function1.invoke(command).booleanValue()) {
                                                        command = ReplyCallResult.INSTANCE;
                                                        if (!function1.invoke(command).booleanValue()) {
                                                            command = QuerySmsPermission.INSTANCE;
                                                            if (!function1.invoke(command).booleanValue()) {
                                                                command = QuerySmsPermissionResult.INSTANCE;
                                                                if (!function1.invoke(command).booleanValue()) {
                                                                    command = EditSms.INSTANCE;
                                                                    if (!function1.invoke(command).booleanValue()) {
                                                                        command = ReplyContent.INSTANCE;
                                                                        if (!function1.invoke(command).booleanValue()) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$Delete;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Delete extends Command {

        @NotNull
        public static final Delete INSTANCE = new Delete();

        private Delete() {
            super(7, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$DeleteResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DeleteResult extends Command {

        @NotNull
        public static final DeleteResult INSTANCE = new DeleteResult();

        private DeleteResult() {
            super(8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$EditSms;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EditSms extends Command {

        @NotNull
        public static final EditSms INSTANCE = new EditSms();

        private EditSms() {
            super(15, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QueryData extends Command {

        @NotNull
        public static final QueryData INSTANCE = new QueryData();

        private QueryData() {
            super(3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QueryDataResult extends Command {

        @NotNull
        public static final QueryDataResult INSTANCE = new QueryDataResult();

        private QueryDataResult() {
            super(4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermission;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QuerySmsPermission extends Command {

        @NotNull
        public static final QuerySmsPermission INSTANCE = new QuerySmsPermission();

        private QuerySmsPermission() {
            super(13, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QuerySmsPermissionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QuerySmsPermissionResult extends Command {

        @NotNull
        public static final QuerySmsPermissionResult INSTANCE = new QuerySmsPermissionResult();

        private QuerySmsPermissionResult() {
            super(14, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$QueryVersion;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class QueryVersion extends Command {

        @NotNull
        public static final QueryVersion INSTANCE = new QueryVersion();

        private QueryVersion() {
            super(1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCall;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReplyCall extends Command {

        @NotNull
        public static final ReplyCall INSTANCE = new ReplyCall();

        private ReplyCall() {
            super(11, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyCallResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReplyCallResult extends Command {

        @NotNull
        public static final ReplyCallResult INSTANCE = new ReplyCallResult();

        private ReplyCallResult() {
            super(12, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$ReplyContent;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReplyContent extends Command {

        @NotNull
        public static final ReplyContent INSTANCE = new ReplyContent();

        private ReplyContent() {
            super(16, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SyncData extends Command {

        @NotNull
        public static final SyncData INSTANCE = new SyncData();

        private SyncData() {
            super(9, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$SyncDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SyncDataResult extends Command {

        @NotNull
        public static final SyncDataResult INSTANCE = new SyncDataResult();

        private SyncDataResult() {
            super(10, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateData;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UpdateData extends Command {

        @NotNull
        public static final UpdateData INSTANCE = new UpdateData();

        private UpdateData() {
            super(5, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$UpdateDataResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UpdateDataResult extends Command {

        @NotNull
        public static final UpdateDataResult INSTANCE = new UpdateDataResult();

        private UpdateDataResult() {
            super(6, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command$VersionResult;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VersionResult extends Command {

        @NotNull
        public static final VersionResult INSTANCE = new VersionResult();

        private VersionResult() {
            super(2, null);
        }
    }

    public /* synthetic */ Command(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private Command(int i) {
        super(c3.a(i, 1));
    }
}
