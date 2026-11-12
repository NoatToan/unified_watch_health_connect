package com.huami.bluetooth.profile.channel.module.call_reply.impl;

import com.huami.bluetooth.profile.channel.module.a;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate;
import com.huami.bluetooth.profile.channel.module.call_reply.EditCallReplyContentDelegate;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyContent;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyResult;
import com.huami.bluetooth.profile.channel.module.call_reply.SmsPermission;
import com.huami.bluetooth.profile.channel.module.call_reply.Version;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodecImpl;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodecV2;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ReplyContentCodec;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ReplyMsgCodec;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ReplyMsgListCodec;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ReplyResultCodec;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.SmsPermissionCodec;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.VersionCodec;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.c1;
import defpackage.c3;
import defpackage.le;
import defpackage.oo;
import defpackage.ql;
import defpackage.u4;
import defpackage.v4;
import defpackage.vq;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002GHB\u000f\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002J)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0016H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010$\u001a\u00020#H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010'\u001a\u00020&H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016J\u0010\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020/H\u0016J\u0012\u00102\u001a\u0004\u0018\u00010\u00022\u0006\u00101\u001a\u00020\u0006H\u0014J\u0018\u00103\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u001a\u00105\u001a\u0002048\u0014X\u0094D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006I"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl;", "Lc1;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "toRequestCmd", "cmd", "", "data", "", "parseData", "", "handleDeviceRequest", "T", "Lkotlin/Function1;", "", "action", "runWithVersionCheck", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "encode", "decode", "Lu4;", "getCodec", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "queryData", "msg", "update", "", "id", "delete", "msgList", "syncMsg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "result", "sendReplyResult", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "permission", "sendSmsPermission", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", MiuiCursorConstants.CONTENT, "sendReplyContent", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "delegate", "setReplyDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "setEditCallReplyContentDelegate", "rawData", "parseCommand", "handleCommand", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "callReplyDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "editCallReplyContentDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "version", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "getContentCodec", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "Reply", "ReplyCodec", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class CallReplyImpl extends c1<Command> implements CallReplyApi {

    @Nullable
    private CallReplyDelegate callReplyDelegate;

    @Nullable
    private EditCallReplyContentDelegate editCallReplyContentDelegate;

    @NotNull
    private final String tag;

    @Nullable
    private Version version;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$Reply;", "", "phoneNo", "", "msg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;)V", "getMsg", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "getPhoneNo", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Reply {

        @NotNull
        private final ReplyMsg msg;

        @NotNull
        private final String phoneNo;

        public Reply(@NotNull String phoneNo, @NotNull ReplyMsg msg) {
            Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.phoneNo = phoneNo;
            this.msg = msg;
        }

        public static /* synthetic */ Reply copy$default(Reply reply, String str, ReplyMsg replyMsg, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reply.phoneNo;
            }
            if ((i & 2) != 0) {
                replyMsg = reply.msg;
            }
            return reply.copy(str, replyMsg);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhoneNo() {
            return this.phoneNo;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ReplyMsg getMsg() {
            return this.msg;
        }

        @NotNull
        public final Reply copy(@NotNull String phoneNo, @NotNull ReplyMsg msg) {
            Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new Reply(phoneNo, msg);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reply)) {
                return false;
            }
            Reply reply = (Reply) other;
            return Intrinsics.areEqual(this.phoneNo, reply.phoneNo) && Intrinsics.areEqual(this.msg, reply.msg);
        }

        @NotNull
        public final ReplyMsg getMsg() {
            return this.msg;
        }

        @NotNull
        public final String getPhoneNo() {
            return this.phoneNo;
        }

        public int hashCode() {
            return (this.phoneNo.hashCode() * 31) + this.msg.hashCode();
        }

        @NotNull
        public String toString() {
            return "Reply(phoneNo=" + this.phoneNo + ", msg=" + this.msg + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$ReplyCodec;", "Lu4;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$Reply;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;", "msgCodec", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class ReplyCodec implements u4<Reply, byte[]> {

        @NotNull
        private final ReplyMsgCodec msgCodec;

        public ReplyCodec(@NotNull ReplyMsgCodec msgCodec) {
            Intrinsics.checkNotNullParameter(msgCodec, "msgCodec");
            this.msgCodec = msgCodec;
        }

        @Override // defpackage.u4
        @NotNull
        public Reply decode(@NotNull byte[] value) {
            int length;
            String str;
            Intrinsics.checkNotNullParameter(value, "value");
            if (value.length == 0) {
                throw new oo(null, 1, null);
            }
            int iA = ql.a(value, 0);
            if (iA < 0) {
                byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(value, 0, value.length);
                length = value.length;
                str = new String(bArrCopyOfRange, Charsets.UTF_8);
            } else if (iA == 0) {
                str = "";
                length = 1;
            } else {
                byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(value, 0, iA);
                length = iA + 1;
                str = new String(bArrCopyOfRange2, Charsets.UTF_8);
            }
            if (length < value.length) {
                return new Reply(str, this.msgCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, length, value.length)));
            }
            throw new oo(null, 1, null);
        }

        @Override // defpackage.u4
        @NotNull
        public byte[] encode(@NotNull Reply value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallReplyImpl(@NotNull a module) {
        super(module);
        Intrinsics.checkNotNullParameter(module, "module");
        this.tag = "CallReplyImpl";
    }

    private final Object decode(byte[] bArr, Command command) {
        return getCodec(command).decode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(Object obj, Command command) {
        return getCodec(command).encode(obj);
    }

    private final u4<Object, byte[]> getCodec(Command cmd) {
        if (Intrinsics.areEqual(cmd, Command.VersionResult.INSTANCE)) {
            return new VersionCodec();
        }
        if (Intrinsics.areEqual(cmd, Command.QueryDataResult.INSTANCE) || Intrinsics.areEqual(cmd, Command.SyncData.INSTANCE)) {
            return new ReplyMsgListCodec(getContentCodec());
        }
        if (Intrinsics.areEqual(cmd, Command.UpdateData.INSTANCE)) {
            return new ReplyMsgCodec(getContentCodec());
        }
        if (Intrinsics.areEqual(cmd, Command.ReplyCall.INSTANCE)) {
            return new ReplyCodec(new ReplyMsgCodec(getContentCodec()));
        }
        if (Intrinsics.areEqual(cmd, Command.ReplyCallResult.INSTANCE)) {
            return new ReplyResultCodec();
        }
        if (Intrinsics.areEqual(cmd, Command.QuerySmsPermissionResult.INSTANCE)) {
            return new SmsPermissionCodec();
        }
        if (Intrinsics.areEqual(cmd, Command.EditSms.INSTANCE) || Intrinsics.areEqual(cmd, Command.ReplyContent.INSTANCE)) {
            return new ReplyContentCodec(getContentCodec());
        }
        if (Intrinsics.areEqual(cmd, Command.UpdateDataResult.INSTANCE) || Intrinsics.areEqual(cmd, Command.DeleteResult.INSTANCE) || Intrinsics.areEqual(cmd, Command.SyncDataResult.INSTANCE)) {
            return new vq();
        }
        throw new v4("Can not find " + cmd + " codec!");
    }

    private final ContentCodec getContentCodec() {
        Version version = this.version;
        if (version != null && version.getV() > 1) {
            return new ContentCodecV2(version.getEncode() == 1 ? Charsets.UTF_16LE : Charsets.UTF_8);
        }
        return new ContentCodecImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDeviceRequest(Command cmd, Object data) {
        EditCallReplyContentDelegate editCallReplyContentDelegate;
        if (Intrinsics.areEqual(cmd, Command.ReplyCall.INSTANCE) && (data instanceof Reply)) {
            CallReplyDelegate callReplyDelegate = this.callReplyDelegate;
            if (callReplyDelegate != null) {
                Reply reply = (Reply) data;
                callReplyDelegate.requestCallReply(reply.getPhoneNo(), reply.getMsg());
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(cmd, Command.EditSms.INSTANCE) && (data instanceof ReplyContent) && (editCallReplyContentDelegate = this.editCallReplyContentDelegate) != null) {
            editCallReplyContentDelegate.requestEdit((ReplyContent) data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseData(Command cmd, byte[] data) {
        try {
            return decode(data, cmd);
        } catch (Exception e) {
            le.a(getTag(), null, e, new Function0<String>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.parseData.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Parse data error!";
                }
            }, 2, null);
            return null;
        }
    }

    private final <T> T runWithVersionCheck(Function1<? super Boolean, ? extends T> action) {
        return this.version != null ? action.invoke2(Boolean.TRUE) : action.invoke2(Boolean.valueOf(queryVersion() instanceof Success));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Command toRequestCmd(Command command) {
        if (Intrinsics.areEqual(command, Command.UpdateDataResult.INSTANCE)) {
            return Command.UpdateData.INSTANCE;
        }
        if (Intrinsics.areEqual(command, Command.DeleteResult.INSTANCE)) {
            return Command.Delete.INSTANCE;
        }
        if (Intrinsics.areEqual(command, Command.SyncDataResult.INSTANCE)) {
            return Command.SyncData.INSTANCE;
        }
        if (Intrinsics.areEqual(command, Command.VersionResult.INSTANCE)) {
            return Command.QueryVersion.INSTANCE;
        }
        return Intrinsics.areEqual(command, Command.QueryDataResult.INSTANCE) ? Command.QueryData.INSTANCE : command;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> delete(int id) {
        return c1.sendRequest$default(this, Command.Delete.INSTANCE, c3.a(id, 0, 1, null), 0L, 4, null);
    }

    @Override // defpackage.c1
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<List<ReplyMsg>> queryData() {
        return (Response) runWithVersionCheck(new Function1<Boolean, Response<List<? extends ReplyMsg>>>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.queryData.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Response<List<? extends ReplyMsg>> invoke2(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            @NotNull
            public final Response<List<ReplyMsg>> invoke(boolean z) {
                return !z ? new Failure("No version!", 0, 2, null) : c1.sendRequest$default(CallReplyImpl.this, Command.QueryData.INSTANCE, null, 15000L, 2, null);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Version> queryVersion() {
        Response<Version> responseSendRequest$default = c1.sendRequest$default(this, Command.QueryVersion.INSTANCE, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            this.version = (Version) ((Success) responseSendRequest$default).getData();
        }
        return responseSendRequest$default;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> sendReplyContent(@NotNull ReplyContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Command.ReplyContent replyContent = Command.ReplyContent.INSTANCE;
        return c1.sendRequestNoResponse$default(this, replyContent, encode(content, replyContent), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> sendReplyResult(@NotNull ReplyResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Command.ReplyCallResult replyCallResult = Command.ReplyCallResult.INSTANCE;
        return c1.sendRequestNoResponse$default(this, replyCallResult, encode(result, replyCallResult), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> sendSmsPermission(@NotNull SmsPermission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Command.QuerySmsPermissionResult querySmsPermissionResult = Command.QuerySmsPermissionResult.INSTANCE;
        return c1.sendRequestNoResponse$default(this, querySmsPermissionResult, encode(permission, querySmsPermissionResult), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    public void setEditCallReplyContentDelegate(@NotNull EditCallReplyContentDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.editCallReplyContentDelegate = delegate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    public void setReplyDelegate(@NotNull CallReplyDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.callReplyDelegate = delegate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> syncMsg(@NotNull final List<ReplyMsg> msgList) {
        Intrinsics.checkNotNullParameter(msgList, "msgList");
        return (Response) runWithVersionCheck(new Function1<Boolean, Response<Boolean>>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.syncMsg.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Response<Boolean> invoke2(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            @NotNull
            public final Response<Boolean> invoke(boolean z) {
                if (!z) {
                    return new Failure("No version!", 0, 2, null);
                }
                CallReplyImpl callReplyImpl = CallReplyImpl.this;
                Command.SyncData syncData = Command.SyncData.INSTANCE;
                return callReplyImpl.sendRequest(syncData, callReplyImpl.encode(msgList, syncData), 15000L);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> update(@NotNull final ReplyMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return (Response) runWithVersionCheck(new Function1<Boolean, Response<Boolean>>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.update.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Response<Boolean> invoke2(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            @NotNull
            public final Response<Boolean> invoke(boolean z) {
                if (!z) {
                    return new Failure("No version!", 0, 2, null);
                }
                CallReplyImpl callReplyImpl = CallReplyImpl.this;
                Command.UpdateData updateData = Command.UpdateData.INSTANCE;
                return c1.sendRequest$default(callReplyImpl, updateData, callReplyImpl.encode(msg, updateData), 0L, 4, null);
            }
        });
    }

    @Override // defpackage.c1
    public void handleCommand(@NotNull final Command cmd, @NotNull final byte[] data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(cmd, Command.QuerySmsPermission.INSTANCE)) {
            CallReplyDelegate callReplyDelegate = this.callReplyDelegate;
            if (callReplyDelegate != null) {
                callReplyDelegate.requestSmsPermission();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(cmd, Command.ReplyCall.INSTANCE) || Intrinsics.areEqual(cmd, Command.EditSms.INSTANCE)) {
            runWithVersionCheck(new Function1<Boolean, Unit>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.handleCommand.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    if (!z) {
                        le.a(CallReplyImpl.this.getTag(), (Throwable) null, new Function0<String>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.handleCommand.1.1
                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            public final String invoke() {
                                return "On received no version!";
                            }
                        }, 2, (Object) null);
                        return;
                    }
                    Object data2 = CallReplyImpl.this.parseData(cmd, data);
                    if (data2 != null) {
                        CallReplyImpl.this.handleDeviceRequest(cmd, data2);
                    }
                }
            });
            return;
        }
        if (Intrinsics.areEqual(cmd, Command.QueryDataResult.INSTANCE)) {
            runWithVersionCheck(new Function1<Boolean, Unit>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.handleCommand.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    if (!z) {
                        le.a(CallReplyImpl.this.getTag(), (Throwable) null, new Function0<String>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl.handleCommand.2.1
                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            public final String invoke() {
                                return "On received no version!";
                            }
                        }, 2, (Object) null);
                        return;
                    }
                    Object data2 = CallReplyImpl.this.parseData(cmd, data);
                    if (data2 != null) {
                        CallReplyImpl callReplyImpl = CallReplyImpl.this;
                        callReplyImpl.dispatchResponse(callReplyImpl.toRequestCmd(cmd), data2);
                    }
                }
            });
            return;
        }
        if (!Intrinsics.areEqual(cmd, Command.VersionResult.INSTANCE) && !Intrinsics.areEqual(cmd, Command.UpdateDataResult.INSTANCE) && !Intrinsics.areEqual(cmd, Command.DeleteResult.INSTANCE) && !Intrinsics.areEqual(cmd, Command.SyncDataResult.INSTANCE)) {
            throw new RuntimeException("Invalid device command!");
        }
        Object data2 = parseData(cmd, data);
        if (data2 != null) {
            dispatchResponse(toRequestCmd(cmd), data2);
        }
    }

    @Override // defpackage.c1
    @Nullable
    public Command parseCommand(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return Command.INSTANCE.toCommand(rawData);
    }
}
