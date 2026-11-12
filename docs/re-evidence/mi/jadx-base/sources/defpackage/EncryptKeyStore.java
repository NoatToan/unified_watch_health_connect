package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: j9, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lj9;", "", "", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FICONON, "value", "", "", "toString", "rawKey", "keyMateriel", "<init>", "([B[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class EncryptKeyStore {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public byte[] key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public long r0;

    /* JADX INFO: renamed from: c, reason: from toString */
    public long r1;

    /* JADX INFO: renamed from: j9$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lj9$a;", "", "", "MAX_N_ONCE", "J", "N_ONCE_THRESHOLD", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EncryptKeyStore(@NotNull byte[] rawKey, @NotNull byte[] keyMateriel) {
        Intrinsics.checkNotNullParameter(rawKey, "rawKey");
        Intrinsics.checkNotNullParameter(keyMateriel, "keyMateriel");
        int i = 0;
        w2 w2Var = new w2(rawKey, 0, 2, null);
        this.r0 = w2Var.d(4);
        this.r1 = w2Var.d(4);
        byte[] bArrA = w2Var.a(16);
        ArrayList arrayList = new ArrayList(bArrA.length);
        int length = bArrA.length;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (keyMateriel[i2 % keyMateriel.length] ^ bArrA[i])));
            i++;
            i2++;
        }
        this.key = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        t5t.d("EncryptKeyStore", y2.c(rawKey) + ",R0:" + this.r0 + ",R1:" + this.r1);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getR0() {
        return this.r0;
    }

    public final void c() {
        this.r0 = (this.r0 + 1) % 4294967295L;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptKeyStore(key=");
        String string = Arrays.toString(this.key);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(", r0=");
        sb.append(this.r0);
        sb.append(", r1=");
        sb.append(this.r1);
        sb.append(')');
        return sb.toString();
    }

    public final boolean a(long value) {
        boolean z = ((value - this.r1) + 4294967295L) % 4294967295L <= 100000;
        if (z) {
            this.r1 = value;
        }
        return z;
    }
}
