package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'v' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Ln4;", "", "Ljava/util/UUID;", "uuid", "Ljava/util/UUID;", PluginDeviceInfo.FDESC, "()Ljava/util/UUID;", "Llp;", "protocol", "<init>", "(Ljava/lang/String;ILlp;Ljava/util/UUID;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class n4 {
    public static final n4 v;
    public static final n4 w;
    public static final /* synthetic */ n4[] x;

    @NotNull
    public final lp t;

    @NotNull
    public final UUID u;

    static {
        lp lpVar = lp.CHANNEL_DOWN;
        UUID uuidC = tet.C(22);
        Intrinsics.checkNotNullExpressionValue(uuidC, "uuid128(0x0016)");
        v = new n4("ChannelDown", 0, lpVar, uuidC);
        lp lpVar2 = lp.CHANNEL_UP;
        UUID uuidC2 = tet.C(23);
        Intrinsics.checkNotNullExpressionValue(uuidC2, "uuid128(0x0017)");
        w = new n4("ChannelUp", 1, lpVar2, uuidC2);
        x = a();
    }

    public n4(String str, int i, lp lpVar, UUID uuid) {
        super(str, i);
        this.t = lpVar;
        this.u = uuid;
    }

    public static final /* synthetic */ n4[] a() {
        return new n4[]{v, w};
    }

    public static n4 valueOf(String str) {
        return (n4) Enum.valueOf(n4.class, str);
    }

    public static n4[] values() {
        return (n4[]) x.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getU() {
        return this.u;
    }
}
