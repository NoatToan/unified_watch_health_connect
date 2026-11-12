package com.huami.bluetooth.profile.channel.module.find;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.C3621pl;
import defpackage.d4;
import defpackage.ew;
import defpackage.mj;
import defpackage.nl;
import defpackage.qft;
import defpackage.r3;
import defpackage.t5t;
import defpackage.va;
import defpackage.wa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "queryVersion", "()Ljava/lang/Integer;", "", "init", "()V", "version", "Lqft;", "loadApi", "(Ljava/lang/Integer;)Lqft;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule$a;", "cachedApi", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule$a;", "getFindDeviceApi", "()Lqft;", "findDeviceApi", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 26)
public final class FindDeviceModule extends a {
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;

    @NotNull
    private static final String tag = "FindDeviceModule";

    @NotNull
    private final CachedApi cachedApi;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.find.FindDeviceModule$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u000f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceModule$a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PluginDeviceInfo.FDESC, "Z", "()Z", PluginDeviceInfo.FMODEL, "(Z)V", "needRefresh", "Lqft;", "api", "Lqft;", "()Lqft;", "(Lqft;)V", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CachedApi {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @Nullable
        public qft api;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public boolean needRefresh;

        /* JADX WARN: Multi-variable type inference failed */
        public CachedApi() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final qft getApi() {
            return this.api;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getNeedRefresh() {
            return this.needRefresh;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CachedApi) && Intrinsics.areEqual(this.api, ((CachedApi) other).api);
        }

        public int hashCode() {
            qft qftVar = this.api;
            if (qftVar == null) {
                return 0;
            }
            return qftVar.hashCode();
        }

        @NotNull
        public String toString() {
            return "CachedApi(api=" + this.api + ')';
        }

        public CachedApi(@Nullable qft qftVar) {
            this.api = qftVar;
            this.needRefresh = true;
        }

        public final void a(@Nullable qft qftVar) {
            this.api = qftVar;
        }

        public final void a(boolean z) {
            this.needRefresh = z;
        }

        public /* synthetic */ CachedApi(qft qftVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : qftVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FindDeviceModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.cachedApi = new CachedApi(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final qft getFindDeviceApi() {
        qft qftVarLoadApi;
        if (this.cachedApi.getNeedRefresh()) {
            Integer numQueryVersion = queryVersion();
            if (numQueryVersion == null || (qftVarLoadApi = loadApi(numQueryVersion)) == null) {
                return null;
            }
            this.cachedApi.a(qftVarLoadApi);
            this.cachedApi.a(false);
        }
        return this.cachedApi.getApi();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        this.cachedApi.a(true);
    }

    @Nullable
    public final qft loadApi(@Nullable Integer version) {
        t5t.d(tag, "version is: " + version);
        if (version == null) {
            return null;
        }
        int iIntValue = version.intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            return new va(getAddress(), this, version.intValue());
        }
        t5t.d(tag, "UnSupport nfc protocol version");
        return null;
    }

    @Nullable
    public final Integer queryVersion() {
        return (Integer) C3621pl.a(new ew().a(sendRequest(new nl(wa.e.f37754b, mj.t, 0L, null, false, 28, null))));
    }
}
