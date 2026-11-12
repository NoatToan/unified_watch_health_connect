package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nj, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B1\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lnj;", "Loj;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "toString", "", "hashCode", "", "other", "", "equals", "value", "I", "getValue", "()I", "setValue", "(I)V", "min", "Ljava/lang/Integer;", "getMin", "()Ljava/lang/Integer;", "setMin", "(Ljava/lang/Integer;)V", VibrateModeSetFragment.MAX, "getMax", "setMax", "containDesc", "Z", "getContainDesc", "()Z", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Z)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Int32Data extends oj implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a x = new a(null);
    public int t;

    @Nullable
    public Integer u;

    @Nullable
    public Integer v;
    public final boolean w;

    /* JADX INFO: renamed from: nj$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnj$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Int32Data(int i, @Nullable Integer num, @Nullable Integer num2, boolean z) {
        super(i, null, null, 6, null);
        this.t = i;
        this.u = num;
        this.v = num2;
        this.w = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Int32Data)) {
            return false;
        }
        Int32Data int32Data = (Int32Data) other;
        return getT() == int32Data.getT() && Intrinsics.areEqual(getU(), int32Data.getU()) && Intrinsics.areEqual(getV(), int32Data.getV()) && getW() == int32Data.getW();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    /* JADX INFO: renamed from: getContainDesc, reason: from getter */
    public boolean getW() {
        return this.w;
    }

    @Override // defpackage.oj
    @Nullable
    /* JADX INFO: renamed from: getMax, reason: from getter */
    public Integer getV() {
        return this.v;
    }

    @Override // defpackage.oj
    @Nullable
    /* JADX INFO: renamed from: getMin, reason: from getter */
    public Integer getU() {
        return this.u;
    }

    @Override // defpackage.oj
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public int getT() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(getT()) * 31) + (getU() == null ? 0 : getU().hashCode())) * 31) + (getV() != null ? getV().hashCode() : 0)) * 31;
        boolean w = getW();
        ?? r1 = w;
        if (w) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @Override // defpackage.oj
    public void setMax(@Nullable Integer num) {
        this.v = num;
    }

    @Override // defpackage.oj
    public void setMin(@Nullable Integer num) {
        this.u = num;
    }

    @Override // defpackage.oj
    public void setValue(int i) {
        this.t = i;
    }

    @NotNull
    public String toString() {
        return "Int32Data(value=" + getT() + ", min=" + getU() + ", max=" + getV() + ", containDesc=" + getW() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) throws IOException {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(3);
        bos.write(tet.p(getT()));
    }

    public Int32Data(int i) {
        this(i, null, null, false);
    }
}
