package com.huami.bluetooth.profile.channel.module.call_reply.impl;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.base.BaseApiImpl;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.base.ResultCodec;
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
import com.huami.bluetooth.profile.channel.module.ex.CoderException;
import com.huami.bluetooth.profile.channel.module.ex.ParseException;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002IJB\u000f\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002J)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0014\u0010\u0013\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0016H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010$\u001a\u00020#H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010'\u001a\u00020&H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016J\u0010\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020/H\u0016J\u0012\u00102\u001a\u0004\u0018\u00010\u00022\u0006\u00101\u001a\u00020\u0006H\u0014J\u0018\u00103\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u001c\u00109\u001a\u0002048\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u0016\u0010D\u001a\u00020A8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006K"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl;", "Lcom/huami/bluetooth/profile/channel/module/base/BaseApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/Command;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", GoogleApiAvailabilityLight.b, Constant.h, "", "data", "", hl.k, "", z.j, ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "", "action", "m", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "g", "f", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "h", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "queryData", "msg", "update", "", "id", "delete", "msgList", "syncMsg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyResult;", "result", "sendReplyResult", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", PointCategory.PERMISSION, "sendSmsPermission", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyContent;", "content", "sendReplyContent", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "delegate", "setReplyDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "setEditCallReplyContentDelegate", "rawData", "parseCommand", "handleCommand", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "e", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "callReplyDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/EditCallReplyContentDelegate;", "editCallReplyContentDelegate", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "version", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "i", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "a", "b", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CallReplyImpl extends BaseApiImpl<Command> implements CallReplyApi {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private CallReplyDelegate callReplyDelegate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private EditCallReplyContentDelegate editCallReplyContentDelegate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Version version;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"com/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$a", "", "", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "b", "phoneNo", "msg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$a;", "c", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "e", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Reply {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String phoneNo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final ReplyMsg msg;

        public Reply(@NotNull String str, @NotNull ReplyMsg replyMsg) {
            this.phoneNo = str;
            this.msg = replyMsg;
        }

        public static /* synthetic */ Reply d(Reply reply, String str, ReplyMsg replyMsg, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reply.phoneNo;
            }
            if ((i & 2) != 0) {
                replyMsg = reply.msg;
            }
            return reply.c(str, replyMsg);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPhoneNo() {
            return this.phoneNo;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ReplyMsg getMsg() {
            return this.msg;
        }

        @NotNull
        public final Reply c(@NotNull String phoneNo, @NotNull ReplyMsg msg) {
            return new Reply(phoneNo, msg);
        }

        @NotNull
        public final ReplyMsg e() {
            return this.msg;
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
        public final String f() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"com/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$b", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl$a;", "", "value", "b", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;", "msgCodec", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Codec<Reply, byte[]> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ReplyMsgCodec msgCodec;

        public b(@NotNull ReplyMsgCodec replyMsgCodec) {
            this.msgCodec = replyMsgCodec;
        }

        @Override // com.huami.bluetooth.profile.channel.module.base.Codec
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Reply decode(@NotNull byte[] value) {
            String str;
            int length;
            if (value.length == 0) {
                throw new ParseException(null, 1, null);
            }
            int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(value, 0);
            if (iFindStringEndFlag < 0) {
                byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(value, 0, value.length);
                length = value.length;
                str = new String(bArrCopyOfRange, Charsets.UTF_8);
            } else if (iFindStringEndFlag == 0) {
                str = "";
                length = 1;
            } else {
                str = new String(ArraysKt___ArraysJvmKt.copyOfRange(value, 0, iFindStringEndFlag), Charsets.UTF_8);
                length = iFindStringEndFlag + 1;
            }
            if (length < value.length) {
                return new Reply(str, this.msgCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, length, value.length)));
            }
            throw new ParseException(null, 1, null);
        }

        @Override // com.huami.bluetooth.profile.channel.module.base.Codec
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] encode(@NotNull Reply value) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Command b;
        public final /* synthetic */ byte[] c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "On received no version!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Command command, byte[] bArr) {
            super(1);
            this.b = command;
            this.c = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                HMLog.warn$default(CallReplyImpl.this.getTag(), null, a.a, 2, null);
                return;
            }
            Object objK = CallReplyImpl.this.k(this.b, this.c);
            if (objK == null) {
                return;
            }
            CallReplyImpl.this.j(this.b, objK);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Command b;
        public final /* synthetic */ byte[] c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "On received no version!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Command command, byte[] bArr) {
            super(1);
            this.b = command;
            this.c = bArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                HMLog.warn$default(CallReplyImpl.this.getTag(), null, a.a, 2, null);
                return;
            }
            Object objK = CallReplyImpl.this.k(this.b, this.c);
            if (objK == null) {
                return;
            }
            CallReplyImpl callReplyImpl = CallReplyImpl.this;
            callReplyImpl.dispatchResponse(callReplyImpl.n(this.b), objK);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Parse data error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Boolean, Response<List<? extends ReplyMsg>>> {
        public f() {
            super(1);
        }

        @NotNull
        public final Response<List<ReplyMsg>> a(boolean z) {
            return !z ? new Failure("No version!", 0, 2, null) : BaseApiImpl.sendRequest$default(CallReplyImpl.this, Command.QueryData.INSTANCE, null, 15000L, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Response<List<? extends ReplyMsg>> invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Boolean, Response<Boolean>> {
        public final /* synthetic */ List<ReplyMsg> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<ReplyMsg> list) {
            super(1);
            this.b = list;
        }

        @NotNull
        public final Response<Boolean> a(boolean z) {
            if (!z) {
                return new Failure("No version!", 0, 2, null);
            }
            CallReplyImpl callReplyImpl = CallReplyImpl.this;
            Command.SyncData syncData = Command.SyncData.INSTANCE;
            return callReplyImpl.sendRequest(syncData, callReplyImpl.g(this.b, syncData), 15000L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Response<Boolean> invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<Boolean, Response<Boolean>> {
        public final /* synthetic */ ReplyMsg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ReplyMsg replyMsg) {
            super(1);
            this.b = replyMsg;
        }

        @NotNull
        public final Response<Boolean> a(boolean z) {
            if (!z) {
                return new Failure("No version!", 0, 2, null);
            }
            CallReplyImpl callReplyImpl = CallReplyImpl.this;
            Command.UpdateData updateData = Command.UpdateData.INSTANCE;
            return BaseApiImpl.sendRequest$default(callReplyImpl, updateData, callReplyImpl.g(this.b, updateData), 0L, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Response<Boolean> invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    public CallReplyImpl(@NotNull BaseModule baseModule) {
        super(baseModule);
        this.tag = "CallReplyImpl";
    }

    private final Object f(byte[] bArr, Command command) {
        return h(command).decode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] g(Object obj, Command command) {
        return h(command).encode(obj);
    }

    private final Codec<Object, byte[]> h(Command cmd) {
        if (Intrinsics.areEqual(cmd, Command.VersionResult.INSTANCE)) {
            return new VersionCodec();
        }
        if (Intrinsics.areEqual(cmd, Command.QueryDataResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.SyncData.INSTANCE)) {
            return new ReplyMsgListCodec(i());
        }
        if (Intrinsics.areEqual(cmd, Command.UpdateData.INSTANCE)) {
            return new ReplyMsgCodec(i());
        }
        if (Intrinsics.areEqual(cmd, Command.ReplyCall.INSTANCE)) {
            return new b(new ReplyMsgCodec(i()));
        }
        if (Intrinsics.areEqual(cmd, Command.ReplyCallResult.INSTANCE)) {
            return new ReplyResultCodec();
        }
        if (Intrinsics.areEqual(cmd, Command.QuerySmsPermissionResult.INSTANCE)) {
            return new SmsPermissionCodec();
        }
        if (Intrinsics.areEqual(cmd, Command.EditSms.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.ReplyContent.INSTANCE)) {
            return new ReplyContentCodec(i());
        }
        if (Intrinsics.areEqual(cmd, Command.UpdateDataResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.DeleteResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.SyncDataResult.INSTANCE)) {
            return new ResultCodec();
        }
        throw new CoderException("Can not find " + cmd + " codec!");
    }

    private final ContentCodec i() {
        ContentCodec contentCodecImpl;
        Version version = this.version;
        if (version == null) {
            contentCodecImpl = null;
        } else if (version.getV() > 1) {
            contentCodecImpl = new ContentCodecV2(version.getEncode() == 1 ? Charsets.UTF_16LE : Charsets.UTF_8);
        } else {
            contentCodecImpl = new ContentCodecImpl();
        }
        return contentCodecImpl == null ? new ContentCodecImpl() : contentCodecImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Command cmd, Object data) {
        EditCallReplyContentDelegate editCallReplyContentDelegate;
        if (Intrinsics.areEqual(cmd, Command.ReplyCall.INSTANCE) && (data instanceof Reply)) {
            CallReplyDelegate callReplyDelegate = this.callReplyDelegate;
            if (callReplyDelegate == null) {
                return;
            }
            Reply reply = (Reply) data;
            callReplyDelegate.requestCallReply(reply.f(), reply.e());
            return;
        }
        if (Intrinsics.areEqual(cmd, Command.EditSms.INSTANCE) && (data instanceof ReplyContent) && (editCallReplyContentDelegate = this.editCallReplyContentDelegate) != null) {
            editCallReplyContentDelegate.requestEdit((ReplyContent) data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(Command cmd, byte[] data) {
        try {
            return f(data, cmd);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, e2, e.a, 2, null);
            return null;
        }
    }

    private final <T> T m(Function1<? super Boolean, ? extends T> action) {
        return this.version != null ? action.invoke(Boolean.TRUE) : action.invoke(Boolean.valueOf(queryVersion() instanceof Success));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Command n(Command command) {
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
        return BaseApiImpl.sendRequest$default(this, Command.Delete.INSTANCE, ByteUtilsKt.toByteArray$default(id, 0, 1, null), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<List<ReplyMsg>> queryData() {
        return (Response) m(new f());
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Version> queryVersion() {
        Response<Version> responseSendRequest$default = BaseApiImpl.sendRequest$default(this, Command.QueryVersion.INSTANCE, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            this.version = (Version) ((Success) responseSendRequest$default).getData();
        }
        return responseSendRequest$default;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> sendReplyContent(@NotNull ReplyContent content) {
        Command.ReplyContent replyContent = Command.ReplyContent.INSTANCE;
        return BaseApiImpl.sendRequestNoResponse$default(this, replyContent, g(content, replyContent), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> sendReplyResult(@NotNull ReplyResult result) {
        Command.ReplyCallResult replyCallResult = Command.ReplyCallResult.INSTANCE;
        return BaseApiImpl.sendRequestNoResponse$default(this, replyCallResult, g(result, replyCallResult), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> sendSmsPermission(@NotNull SmsPermission permission) {
        Command.QuerySmsPermissionResult querySmsPermissionResult = Command.QuerySmsPermissionResult.INSTANCE;
        return BaseApiImpl.sendRequestNoResponse$default(this, querySmsPermissionResult, g(permission, querySmsPermissionResult), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    public void setEditCallReplyContentDelegate(@NotNull EditCallReplyContentDelegate delegate) {
        this.editCallReplyContentDelegate = delegate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    public void setReplyDelegate(@NotNull CallReplyDelegate delegate) {
        this.callReplyDelegate = delegate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> syncMsg(@NotNull List<ReplyMsg> msgList) {
        return (Response) m(new g(msgList));
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi
    @NotNull
    public Response<Boolean> update(@NotNull ReplyMsg msg) {
        return (Response) m(new h(msg));
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    public void handleCommand(@NotNull Command cmd, @NotNull byte[] data) {
        if (Intrinsics.areEqual(cmd, Command.QuerySmsPermission.INSTANCE)) {
            CallReplyDelegate callReplyDelegate = this.callReplyDelegate;
            if (callReplyDelegate == null) {
                return;
            }
            callReplyDelegate.requestSmsPermission();
            return;
        }
        if (Intrinsics.areEqual(cmd, Command.ReplyCall.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.EditSms.INSTANCE)) {
            m(new c(cmd, data));
            return;
        }
        if (Intrinsics.areEqual(cmd, Command.QueryDataResult.INSTANCE)) {
            m(new d(cmd, data));
            return;
        }
        if (!(Intrinsics.areEqual(cmd, Command.VersionResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.UpdateDataResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.DeleteResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.SyncDataResult.INSTANCE))) {
            throw new RuntimeException("Invalid device command!");
        }
        Object objK = k(cmd, data);
        if (objK == null) {
            return;
        }
        dispatchResponse(n(cmd), objK);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @Nullable
    public Command parseCommand(@NotNull byte[] rawData) {
        return Command.INSTANCE.toCommand(rawData);
    }
}
