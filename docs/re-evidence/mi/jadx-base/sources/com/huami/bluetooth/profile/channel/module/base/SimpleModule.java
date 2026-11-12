package com.huami.bluetooth.profile.channel.module.base;

import android.os.ConditionVariable;
import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.e6;
import defpackage.r3;
import defpackage.t2;
import defpackage.v2;
import defpackage.wi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/SimpleModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "init", "Le6;", "interceptor", "setInterceptor", "Lt2;", "request", "Lv2;", "sendRequest", "", RnReportConst.ApiReport.PARAM_MODULE, "I", "getModule", "()I", "", "Lwi;", "requests", "Ljava/util/Map;", "moduleId", "Lr3;", "channelController", "<init>", "(ILr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class SimpleModule extends a {
    private static final long timeoutMs = 3000;

    @Nullable
    private e6 interceptor;
    private final int module;

    @NotNull
    private final Map<t2, wi> requests;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            byte bFirst = ArraysKt___ArraysKt.first(response.getData());
            Map map = SimpleModule.this.requests;
            SimpleModule simpleModule = SimpleModule.this;
            for (Map.Entry entry : map.entrySet()) {
                t2 t2Var = (t2) entry.getKey();
                wi wiVar = (wi) entry.getValue();
                if (bFirst == t2Var.getF34218b()) {
                    wiVar.a(response.getData());
                    simpleModule.requests.remove(t2Var);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/base/SimpleModule$c", "Lwi;", "", "data", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements wi {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<byte[]> f9861b;
        public final /* synthetic */ ConditionVariable c;

        public c(Ref.ObjectRef<byte[]> objectRef, ConditionVariable conditionVariable) {
            this.f9861b = objectRef;
            this.c = conditionVariable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wi
        public void a(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            e6 e6Var = SimpleModule.this.interceptor;
            if (e6Var != null) {
                e6Var.b(data);
            }
            this.f9861b.element = data;
            this.c.open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleModule(int i, @NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.module = i;
        this.requests = new LinkedHashMap();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final v2 sendRequest(@NotNull t2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ConditionVariable conditionVariable = new ConditionVariable();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.requests.put(request, new c(objectRef, conditionVariable));
        e6 e6Var = this.interceptor;
        if (e6Var != null) {
            e6Var.a(request.getF34217a());
        }
        if (!a.syncSendData$default(this, request.getF34217a(), 0, 2, null)) {
            return new v2(false, null, 2, null);
        }
        try {
            return conditionVariable.block(3000L) ? new v2(true, (byte[]) objectRef.element) : new v2(false, null, 2, null);
        } catch (Exception unused) {
            return new v2(false, null, 2, null);
        }
    }

    public final void setInterceptor(@NotNull e6 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptor = interceptor;
    }
}
