package com.huami.bluetooth.profile.channel.module.nfc;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.NFCVersion;
import defpackage.d4;
import defpackage.dm;
import defpackage.em;
import defpackage.fm;
import defpackage.fu;
import defpackage.iw;
import defpackage.nl;
import defpackage.ol;
import defpackage.r3;
import defpackage.t5t;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Ldm;", "loadApi", "Lnm;", "queryVersion", "version", "", "tag", "Ljava/lang/String;", "version$delegate", "Lkotlin/Lazy;", "getVersion", "()Lnm;", "nfcApi$delegate", "getNfcApi", "()Ldm;", "nfcApi", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 36)
public final class NFCModule extends a {
    private static final long TIMEOUT = 5000;

    /* JADX INFO: renamed from: nfcApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcApi;

    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: version$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy version;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldm;", PluginDeviceInfo.FMODEL, "()Ldm;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<dm> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dm invoke() {
            return NFCModule.this.loadApi();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm;", PluginDeviceInfo.FMODEL, "()Lnm;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<NFCVersion> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NFCVersion invoke() {
            return NFCModule.this.queryVersion();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFCModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.tag = "NFCModule";
        this.version = LazyKt__LazyJVMKt.lazy(new c());
        this.nfcApi = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final NFCVersion getVersion() {
        return (NFCVersion) this.version.getValue();
    }

    @Nullable
    public final dm getNfcApi() {
        return (dm) this.nfcApi.getValue();
    }

    @Nullable
    public final dm loadApi(@Nullable NFCVersion version) {
        String string;
        String str = this.tag;
        if (version == null || (string = version.toString()) == null) {
            string = AbstractJsonLexerKt.NULL;
        }
        t5t.d(str, string);
        if (version == null) {
            return null;
        }
        int version2 = version.getVersion();
        if (version2 == 4 || version2 == 5) {
            return new em(this, version);
        }
        t5t.d(this.tag, "UnSupport nfc protocol version");
        return null;
    }

    @Nullable
    public final NFCVersion queryVersion() {
        ol<byte[]> olVarSendRequest = sendRequest(new nl(fm.l.d, null, 0L, null, false, 30, null));
        if (olVarSendRequest == null) {
            return null;
        }
        ol<NFCVersion> olVarA = new iw().a(olVarSendRequest);
        if (olVarA instanceof fu) {
            return (NFCVersion) ((fu) olVarA).a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dm loadApi() {
        return loadApi(getVersion());
    }
}
