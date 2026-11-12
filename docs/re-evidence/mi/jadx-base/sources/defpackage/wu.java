package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u0013\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0012J!\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0014J#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0014X\u0094D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lwu;", "Lc1;", "Lyu;", "Lbgt;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lzv;", "queryVersion", "()Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "rawData", PluginDeviceInfo.FDESC, "([B)Lyu;", "cmd", "data", "", PluginDeviceInfo.FMODEL, "(Lyu;[B)V", "([B)V", "(Lyu;)Lyu;", "", "(Lyu;[B)Ljava/lang/Object;", "Lu4;", "(Lyu;)Lu4;", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "", PluginDeviceInfo.FICONOFF, "()Z", "isFirstRemindEnable", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class wu extends c1<yu> implements bgt {

    @NotNull
    public final String t;
    public final List<xu> u;

    @Nullable
    public Version v;

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
            return "No version, skip DataChanged!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Skip data changed! Device data invalid!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Handle data change error!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr) {
            super(0);
            this.t = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unsupported action(" + ((int) ArraysKt___ArraysKt.first(this.t)) + ")!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e t = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Parse data error!";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        super(module);
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = "TodoApiImpl";
        this.u = Collections.synchronizedList(new ArrayList());
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleCommand(@NotNull yu cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!Intrinsics.areEqual(cmd, yu.b.f40533b)) {
            Object objB = b(cmd, data);
            if (objB != null) {
                dispatchResponse(b(cmd), objB);
                return;
            }
            return;
        }
        if (this.v != null || (queryVersion() instanceof Success)) {
            a(data);
        } else {
            le.a(getT(), (Throwable) null, a.t, 2, (Object) null);
        }
    }

    @Override // defpackage.c1
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public yu parseCommand(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return yu.f40532a.a(rawData);
    }

    public final boolean d() {
        Version version = this.v;
        return version != null && version.getV() >= 2;
    }

    @Override // defpackage.c1
    @NotNull
    /* JADX INFO: renamed from: getTag, reason: from getter */
    public String getT() {
        return this.t;
    }

    @NotNull
    public Response<Version> queryVersion() {
        Response<Version> responseSendRequest$default = c1.sendRequest$default(this, yu.g.f40538b, null, 10000L, 2, null);
        if (responseSendRequest$default instanceof Success) {
            this.v = (Version) ((Success) responseSendRequest$default).getData();
        }
        return responseSendRequest$default;
    }

    public final yu b(yu yuVar) {
        if (Intrinsics.areEqual(yuVar, yu.k.f40542b)) {
            return yu.j.f40541b;
        }
        if (Intrinsics.areEqual(yuVar, yu.d.f40535b)) {
            return yu.c.f40534b;
        }
        if (Intrinsics.areEqual(yuVar, yu.i.f40540b)) {
            return yu.h.f40539b;
        }
        if (Intrinsics.areEqual(yuVar, yu.l.f40543b)) {
            return yu.g.f40538b;
        }
        return Intrinsics.areEqual(yuVar, yu.f.f40537b) ? yu.e.f40536b : yuVar;
    }

    public final void a(byte[] data) {
        x5 x5Var = null;
        if (data.length >= 2) {
            byte bFirst = ArraysKt___ArraysKt.first(data);
            if (bFirst == 1) {
                x5Var = x5.a.f38705a;
            } else if (bFirst == 2) {
                x5Var = x5.b.f38706a;
            } else if (bFirst != 3) {
                le.a(getT(), (Throwable) null, new d(data), 2, (Object) null);
            } else {
                x5Var = x5.c.f38707a;
            }
            if (x5Var == null) {
                return;
            }
            try {
                Object objDecode = a(yu.b.f40533b).decode(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length));
                Intrinsics.checkNotNull(objDecode, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.todo.Todo");
                Todo todo = (Todo) objDecode;
                List<xu> callbackList = this.u;
                Intrinsics.checkNotNullExpressionValue(callbackList, "callbackList");
                Iterator<T> it = callbackList.iterator();
                while (it.hasNext()) {
                    ((xu) it.next()).a(x5Var, todo);
                }
                return;
            } catch (Exception e2) {
                le.a(getT(), null, e2, c.t, 2, null);
                return;
            }
        }
        le.a(getT(), (Throwable) null, b.t, 2, (Object) null);
    }

    public final Object b(yu cmd, byte[] data) {
        try {
            return a(cmd).decode(data);
        } catch (Exception e2) {
            le.a(getT(), null, e2, e.t, 2, null);
            return null;
        }
    }

    public final u4<Object, byte[]> a(yu cmd) {
        if (Intrinsics.areEqual(cmd, yu.l.f40543b)) {
            return new kw();
        }
        if (Intrinsics.areEqual(cmd, yu.f.f40537b) || Intrinsics.areEqual(cmd, yu.h.f40539b)) {
            return new av(d());
        }
        if (Intrinsics.areEqual(cmd, yu.j.f40541b) || Intrinsics.areEqual(cmd, yu.b.f40533b)) {
            return new zu(d());
        }
        if (Intrinsics.areEqual(cmd, yu.k.f40542b) || Intrinsics.areEqual(cmd, yu.d.f40535b) || Intrinsics.areEqual(cmd, yu.i.f40540b)) {
            return new vq();
        }
        throw new v4("Can not find " + cmd + " codec!");
    }
}
