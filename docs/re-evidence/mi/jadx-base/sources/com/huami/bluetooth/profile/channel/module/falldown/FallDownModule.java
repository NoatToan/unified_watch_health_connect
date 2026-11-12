package com.huami.bluetooth.profile.channel.module.falldown;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.C3621pl;
import defpackage.FallDownTrigger;
import defpackage.cvs;
import defpackage.d4;
import defpackage.g7;
import defpackage.le;
import defpackage.mj;
import defpackage.nl;
import defpackage.nq;
import defpackage.ol;
import defpackage.r0;
import defpackage.r3;
import defpackage.s9;
import defpackage.sh;
import defpackage.t9;
import defpackage.tet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R!\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/falldown/FallDownModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "data", "", "onNotify", "([B)V", "init", "()V", "Lsh;", "observer", "registerObserver", "(Lsh;)V", "unregisterObserver", "", "queryVersion", "()Ljava/lang/Integer;", "", "enable", "setFallDownSwitch", "(Z)Z", "setSOSSwitch", "Lcvs;", "contact", "setEmergencyContact", "(Lcvs;)Z", "getFallDownMonitorSwitch", "()Z", "getSOSSwitch", "Ls9;", "codeC$delegate", "Lkotlin/Lazy;", "getCodeC", "()Ls9;", "codeC", "", "observers$delegate", "getObservers", "()Ljava/util/List;", "observers", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 69)
public final class FallDownModule extends com.huami.bluetooth.profile.channel.module.a {

    @NotNull
    private static final a Companion = new a(null);

    @Deprecated
    private static final int MaxNameCharSize = 99;

    @Deprecated
    private static final int MaxNumCharSize = 20;

    @Deprecated
    @NotNull
    private static final String TAG = "FallDownModule";

    /* JADX INFO: renamed from: codeC$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy codeC;

    @NotNull
    private final g7 deviceRequestHandler;

    /* JADX INFO: renamed from: observers$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy observers;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/falldown/FallDownModule$a;", "", "", "MaxNameCharSize", "I", "MaxNumCharSize", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls9;", PluginDeviceInfo.FMODEL, "()Ls9;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<s9> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9 invoke() {
            return new s9();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public c(Object obj) {
            super(1, obj, FallDownModule.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((FallDownModule) this.receiver).onNotify(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/falldown/FallDownModule$d", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return r0.a(ArraysKt___ArraysKt.first(byteArray)) == t9.d.f34465b.getF34464a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<Boolean> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ol<Boolean> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "query fall down monitor switch status result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<Boolean> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ol<Boolean> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "query sos switch status result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lsh;", PluginDeviceInfo.FMODEL, "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<List<sh>> {
        public static final g t = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<sh> invoke() {
            return new ArrayList();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(byte[] bArr) {
            super(0);
            this.t = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "on notify " + tet.x(this.t);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<Integer> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ol<Integer> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "query version result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<s9.Response> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ol<s9.Response> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "set fall down switch result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ ol<s9.Response> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ol<s9.Response> olVar) {
            super(0);
            this.t = olVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "set sos switch result: " + this.t;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallDownModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.codeC = LazyKt__LazyJVMKt.lazy(b.t);
        this.observers = LazyKt__LazyJVMKt.lazy(g.t);
        this.deviceRequestHandler = new g7(new c(this), new d());
    }

    private final s9 getCodeC() {
        return (s9) this.codeC.getValue();
    }

    private final List<sh> getObservers() {
        return (List) this.observers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNotify(byte[] data) {
        FallDownTrigger fallDownTriggerA;
        if (data.length == 0) {
            return;
        }
        le.c(TAG, new h(data));
        if (data[0] != t9.d.f34465b.getF34464a() || (fallDownTriggerA = getCodeC().a(data)) == null) {
            return;
        }
        Iterator<T> it = getObservers().iterator();
        while (it.hasNext()) {
            ((sh) it.next()).a(fallDownTriggerA);
        }
    }

    public final boolean getFallDownMonitorSwitch() {
        ol<Boolean> olVarC = getCodeC().c(sendRequest(new nl(new t9.a(), mj.t, 0L, null, false, 28, null)));
        le.c(TAG, new e(olVarC));
        Boolean bool = (Boolean) C3621pl.a(olVarC);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getSOSSwitch() {
        ol<Boolean> olVarC = getCodeC().c(sendRequest(new nl(new t9.b(), mj.t, 0L, null, false, 28, null)));
        le.c(TAG, new f(olVarC));
        Boolean bool = (Boolean) C3621pl.a(olVarC);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        unregisterDeviceRequestHandler(this.deviceRequestHandler);
        registerDeviceRequestHandler(this.deviceRequestHandler);
    }

    @Nullable
    public final Integer queryVersion() {
        ol<Integer> olVarD = getCodeC().d(sendRequest(new nl(new t9.c(), mj.t, 0L, null, false, 28, null)));
        le.c(TAG, new i(olVarD));
        return (Integer) C3621pl.a(olVarD);
    }

    public final void registerObserver(@NotNull sh observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        getObservers().add(observer);
    }

    public final boolean setEmergencyContact(@NotNull cvs contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        throw null;
    }

    public final boolean setFallDownSwitch(boolean enable) {
        ol<s9.Response> olVarB = getCodeC().b(sendRequest(new nl(new t9.e().withBoolean(enable), mj.t, 0L, null, false, 28, null)));
        le.c(TAG, new j(olVarB));
        s9.Response response = (s9.Response) C3621pl.a(olVarB);
        if (response != null) {
            return response.a();
        }
        return false;
    }

    public final boolean setSOSSwitch(boolean enable) {
        ol<s9.Response> olVarB = getCodeC().b(sendRequest(new nl(new t9.f().withBoolean(enable), mj.t, 0L, null, false, 28, null)));
        le.c(TAG, new k(olVarB));
        s9.Response response = (s9.Response) C3621pl.a(olVarB);
        if (response != null) {
            return response.a();
        }
        return false;
    }

    public final void unregisterObserver(@NotNull sh observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        getObservers().remove(observer);
    }
}
