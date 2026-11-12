package com.huami.bluetooth.profile.channel.module.notification;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.notification.codec.CommandCodec;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoFormat;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoRequest;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.alert.NotificationInfo;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R\u0019\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "", "byteArray", "", "a", "Lcom/xiaomi/hm/health/bt/profile/alert/NotificationInfo;", "info", "Lkotlin/Function1;", "", "action", "notify", "Lcom/huami/bluetooth/profile/channel/module/notification/DeviceNotificationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDeviceNotificationListener", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "getModule", "()Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "module", "b", "Lcom/huami/bluetooth/profile/channel/module/notification/DeviceNotificationListener;", "mDeviceListener", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "c", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "version", BehaviorTaggingWebApi.g.g, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class NotificationApiImpl implements NotificationApi {

    @NotNull
    private static final String d = "NotificationHuamiOS";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NotificationModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private DeviceNotificationListener mDeviceListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final NotificationVersion version;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(NotificationApiImpl notificationApiImpl) {
            super(1, notificationApiImpl, NotificationApiImpl.class, "onDeviceCommand", "onDeviceCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((NotificationApiImpl) this.receiver).a(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImpl$notify$1", f = "NotificationApiImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Function1<Boolean, Unit> c;
        public final /* synthetic */ NotificationApiImpl d;
        public final /* synthetic */ Ref.ObjectRef<Request.Command> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, NotificationApiImpl notificationApiImpl, Ref.ObjectRef<Request.Command> objectRef, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = notificationApiImpl;
            this.e = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function2 = this.c;
                NotificationModule module = this.d.getModule();
                byte[] bArr = this.e.element.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = function2;
                this.b = 1;
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(module, bArr, 0, false, this, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objSendDataWithResult$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.a;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ NotificationCommand a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NotificationCommand notificationCommand) {
            super(0);
            this.a = notificationCommand;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("received command: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, int i2, String str) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "type: " + this.a + " uniqueId: " + this.b + " content:" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "type " + this.a + " received eventType " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "type " + this.a + " received uniqueId " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("not support version: ", Integer.valueOf(NotificationApiImpl.this.getVersion().getVersion()));
        }
    }

    public NotificationApiImpl(@NotNull NotificationModule notificationModule, @NotNull NotificationVersion notificationVersion) {
        this.module = notificationModule;
        this.version = notificationVersion;
        notificationModule.registerNotify(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(byte[] byteArray) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(byteArray, 0, 2, null);
        NotificationCommand notificationCommandDecode = new CommandCodec().decode(byteArray);
        HMLog.info("NotificationHuamiOS", new c(notificationCommandDecode));
        int cmd = notificationCommandDecode.getCmd();
        if (cmd == NotificationCommand.ReplyMessage.INSTANCE.getCmd()) {
            int i = bufByteDecoder.readByte();
            int int$default = BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null);
            String string = bufByteDecoder.readString();
            HMLog.info("NotificationHuamiOS", new d(i, int$default, string));
            DeviceNotificationListener deviceNotificationListener = this.mDeviceListener;
            if (deviceNotificationListener == null) {
                return;
            }
            deviceNotificationListener.onReplied(int$default, string);
            return;
        }
        if (cmd != NotificationCommand.MessageControl.INSTANCE.getCmd()) {
            if (cmd == NotificationCommand.LogoRequest.INSTANCE.getCmd()) {
                if (getVersion().getVersion() < 2) {
                    HMLog.info("NotificationHuamiOS", new g());
                    return;
                }
                bufByteDecoder.readByte();
                String string2 = bufByteDecoder.readString();
                int i2 = bufByteDecoder.readByte();
                int i3 = bufByteDecoder.readInt(2);
                int i4 = bufByteDecoder.readInt(2);
                DeviceNotificationListener deviceNotificationListener2 = this.mDeviceListener;
                if (deviceNotificationListener2 == null) {
                    return;
                }
                deviceNotificationListener2.onRequestLogo(new LogoRequest(string2, LogoFormat.INSTANCE.form(i2), i3, i4));
                return;
            }
            return;
        }
        int i5 = bufByteDecoder.readByte();
        int i6 = bufByteDecoder.readByte();
        HMLog.info("NotificationHuamiOS", new e(i5, i6));
        if (i6 == 1) {
            DeviceNotificationListener deviceNotificationListener3 = this.mDeviceListener;
            if (deviceNotificationListener3 == null) {
                return;
            }
            deviceNotificationListener3.onHangup();
            return;
        }
        if (i6 == 2) {
            DeviceNotificationListener deviceNotificationListener4 = this.mDeviceListener;
            if (deviceNotificationListener4 == null) {
                return;
            }
            deviceNotificationListener4.onMute();
            return;
        }
        if (i6 != 3) {
            return;
        }
        int int$default2 = BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null);
        HMLog.info("NotificationHuamiOS", new f(i5, int$default2));
        DeviceNotificationListener deviceNotificationListener5 = this.mDeviceListener;
        if (deviceNotificationListener5 == null) {
            return;
        }
        deviceNotificationListener5.onDeleted(int$default2);
    }

    @NotNull
    public final NotificationModule getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApi
    @NotNull
    public NotificationVersion getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, com.huami.bluetooth.profile.Request$Command] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, com.huami.bluetooth.profile.Request$Command] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.huami.bluetooth.profile.Request$Command] */
    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApi
    public void notify(@NotNull NotificationInfo info, @NotNull Function1<? super Boolean, Unit> action) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = NotificationCommand.SetNotification.INSTANCE.withBytes(ByteUtilsKt.toByteArray$default(info.getUniqueId(), 0, 1, null)).withByte(info.getCategoryId()).withByte(info.getEventId()).withString(info.getPkgName()).withString(info.getTitle()).withString(info.getMsg()).withString(info.getAppName());
        if (info.getCategoryId() == 3) {
            objectRef.element = ((Request.Command) objectRef.element).withString(info.getPhone());
        }
        objectRef.element = ((Request.Command) objectRef.element).withByte(info.getSupportReply());
        new ModuleRequest((Request.Command) objectRef.element, IncreasePredict.INSTANCE, 0L, null, false, 28, null);
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(action, this, objectRef, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApi
    public void setDeviceNotificationListener(@NotNull DeviceNotificationListener listener) {
        this.mDeviceListener = listener;
    }
}
