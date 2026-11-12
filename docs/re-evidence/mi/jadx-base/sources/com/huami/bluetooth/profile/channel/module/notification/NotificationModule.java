package com.huami.bluetooth.profile.channel.module.notification;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.NotificationVersion;
import defpackage.an;
import defpackage.bw;
import defpackage.cn;
import defpackage.d4;
import defpackage.fu;
import defpackage.g7;
import defpackage.le;
import defpackage.mj;
import defpackage.nl;
import defpackage.nq;
import defpackage.ol;
import defpackage.r3;
import defpackage.wm;
import defpackage.xm;
import defpackage.ym;
import defpackage.zm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001a\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "data", "", "onNotify", "Lhn;", "queryVersion", "init", "Lwm;", "loadApi", "Lkotlin/Function1;", "notify", "registerNotify", "Lkotlin/jvm/functions/Function1;", "Lr3;", "api", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 30)
public final class NotificationModule extends com.huami.bluetooth.profile.channel.module.a {

    @NotNull
    private final g7 mRequestHandler;

    @Nullable
    private wm notificationApi;

    @NotNull
    private Function1<? super byte[], Unit> notify;

    @Nullable
    private NotificationVersion version;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "reset version";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "mRequestHandler: " + NotificationModule.this.mRequestHandler;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "loadApi version: " + NotificationModule.this.version;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public d(Object obj) {
            super(1, obj, NotificationModule.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((NotificationModule) this.receiver).onNotify(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/notification/NotificationModule$e", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function1<byte[], Unit> {
        public static final f t = new f();

        public f() {
            super(1);
        }

        public final void a(@NotNull byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<byte[]> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ol<byte[]> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "version response: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h t = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Version is null";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.notify = f.t;
        this.mRequestHandler = new g7(new d(this), new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotify(byte[] data) {
        this.notify.invoke2(data);
    }

    private final NotificationVersion queryVersion() {
        ol<byte[]> olVarSendRequest = sendRequest(new nl(cn.e.c, mj.t, 0L, null, false, 28, null));
        le.c("NotificationHuamiOS", new g(olVarSendRequest));
        if (olVarSendRequest instanceof fu) {
            return new bw().decode((byte[]) ((fu) olVarSendRequest).a());
        }
        le.c("NotificationHuamiOS", h.t);
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        le.c("NotificationHuamiOS", a.t);
        this.version = null;
        le.c("NotificationHuamiOS", new b());
        registerDeviceRequestHandler(this.mRequestHandler);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    @Nullable
    public final wm loadApi() {
        wm xmVar;
        le.c("NotificationHuamiOS", new c());
        if (this.version == null) {
            NotificationVersion notificationVersionQueryVersion = queryVersion();
            this.version = notificationVersionQueryVersion;
            if (notificationVersionQueryVersion == null) {
                xmVar = null;
            } else {
                int version = notificationVersionQueryVersion.getVersion();
                if (version == 1) {
                    xmVar = new xm(this, notificationVersionQueryVersion);
                } else if (version == 2) {
                    xmVar = new ym(this, notificationVersionQueryVersion);
                } else if (version == 3) {
                    xmVar = new zm(this, notificationVersionQueryVersion);
                } else if (version != 4) {
                    xmVar = null;
                } else {
                    xmVar = new an(this, notificationVersionQueryVersion);
                }
            }
            this.notificationApi = xmVar;
        }
        return this.notificationApi;
    }

    public final void registerNotify(@NotNull Function1<? super byte[], Unit> notify) {
        Intrinsics.checkNotNullParameter(notify, "notify");
        this.notify = notify;
    }
}
