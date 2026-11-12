package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y1, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B+\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Ly1;", "", "Lo4;", PluginDeviceInfo.FBLUETOOTHPAIR, "", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FICONOFF, "", "toString", "", "hashCode", "other", "equals", "Lso;", "gattPeripheral", "Lso;", PluginDeviceInfo.FDESC, "()Lso;", Home.JSON_KEY_ADDRESS, "Ljava/lang/String;", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Lo4;", "version", "Ljava/util/UUID;", "downLinkUUID", "upLinkUUID", "<init>", "(Lso;Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)V", "(Lso;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BleChannelLink {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final UUID g;

    @NotNull
    public static final UUID h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final so gattPeripheral;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String address;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final UUID downLinkUUID;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final UUID upLinkUUID;

    @NotNull
    public ChannelVersion e;

    /* JADX INFO: renamed from: y1$a */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: y1$b */
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
            return "Get version failed";
        }
    }

    /* JADX INFO: renamed from: y1$c */
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
            return "Version response not valid";
        }
    }

    static {
        UUID uuidC = tet.C(22);
        Intrinsics.checkNotNullExpressionValue(uuidC, "uuid128(0x0016)");
        g = uuidC;
        UUID uuidC2 = tet.C(23);
        Intrinsics.checkNotNullExpressionValue(uuidC2, "uuid128(0x0017)");
        h = uuidC2;
    }

    public BleChannelLink(@NotNull so gattPeripheral, @NotNull String address, @NotNull UUID downLinkUUID, @NotNull UUID upLinkUUID) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(downLinkUUID, "downLinkUUID");
        Intrinsics.checkNotNullParameter(upLinkUUID, "upLinkUUID");
        this.gattPeripheral = gattPeripheral;
        this.address = address;
        this.downLinkUUID = downLinkUUID;
        this.upLinkUUID = upLinkUUID;
        this.e = new ChannelVersion(0, null, 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final so getGattPeripheral() {
        return this.gattPeripheral;
    }

    @NotNull
    public final ChannelVersion c() {
        if (this.e.getVersionCode() >= 0) {
            return this.e;
        }
        ChannelVersion channelVersionF = f();
        this.e = channelVersionF;
        return channelVersionF;
    }

    public final boolean d() {
        return c().getVersionCode() >= 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public final boolean e() {
        Object objM886constructorimpl;
        boolean z;
        try {
            Result.Companion companion = Result.Companion;
            boolean zInit = this.gattPeripheral.a(n4.v).init();
            Boolean boolValueOf = Boolean.valueOf(zInit);
            if (!zInit) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                boolean zInit2 = this.gattPeripheral.a(n4.w).init();
                if ((zInit2 ? Boolean.valueOf(zInit2) : null) != null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("判断是否支持Channel时发生异常:");
            sb.append(thM889exceptionOrNullimpl);
            sb.append(",此时的参数 ");
            String string = this.gattPeripheral.toString();
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            }
            sb.append(string);
            t5t.d("BleChannelLink", sb.toString());
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM886constructorimpl).booleanValue();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleChannelLink)) {
            return false;
        }
        BleChannelLink bleChannelLink = (BleChannelLink) other;
        return Intrinsics.areEqual(this.gattPeripheral, bleChannelLink.gattPeripheral) && Intrinsics.areEqual(this.address, bleChannelLink.address) && Intrinsics.areEqual(this.downLinkUUID, bleChannelLink.downLinkUUID) && Intrinsics.areEqual(this.upLinkUUID, bleChannelLink.upLinkUUID);
    }

    @NotNull
    public final ChannelVersion f() {
        n2 n2VarA = this.gattPeripheral.a(n4.v);
        n2VarA.init();
        qe qeVarA = this.gattPeripheral.a(n2VarA, new byte[]{1});
        if (qeVarA != null && qeVarA.j() != null) {
            byte[] bArrJ = qeVarA.j();
            Intrinsics.checkNotNullExpressionValue(bArrJ, "response.originResponseData");
            if (bArrJ.length != 0) {
                if (qeVarA.j().length < 2 || qeVarA.j()[0] != 2) {
                    le.c("BleChannelLink", c.t);
                    return new ChannelVersion(0, null, 3, null);
                }
                ChannelVersion.a aVar = ChannelVersion.c;
                byte[] bArrJ2 = qeVarA.j();
                Intrinsics.checkNotNullExpressionValue(bArrJ2, "response.originResponseData");
                return aVar.a(y2.a(bArrJ2));
            }
        }
        le.c("BleChannelLink", b.t);
        return new ChannelVersion(0, null, 3, null);
    }

    public int hashCode() {
        return (((((this.gattPeripheral.hashCode() * 31) + this.address.hashCode()) * 31) + this.downLinkUUID.hashCode()) * 31) + this.upLinkUUID.hashCode();
    }

    @NotNull
    public String toString() {
        return "BleChannelLink(gattPeripheral=" + this.gattPeripheral + ", address=" + this.address + ", downLinkUUID=" + this.downLinkUUID + ", upLinkUUID=" + this.upLinkUUID + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleChannelLink(@NotNull so gattPeripheral, @NotNull String address) {
        this(gattPeripheral, address, g, h);
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(address, "address");
    }
}
