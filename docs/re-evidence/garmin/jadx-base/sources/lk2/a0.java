package lk2;

import com.mapbox.maps.MapboxMap;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llk2/a0;", "", "", "transferHandle", "transport", "", MapboxMap.QFE_OFFSET, "windowBits", "<init>", "(IILjava/lang/Long;Ljava/lang/Integer;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f113160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f113161d;

    public a0(int i14, int i15, Long l14, Integer num) {
        this.f113158a = i14;
        this.f113159b = i15;
        this.f113160c = l14;
        this.f113161d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f113158a == a0Var.f113158a && this.f113159b == a0Var.f113159b && p005kotlin.jvm.internal.s.g(this.f113160c, a0Var.f113160c) && p005kotlin.jvm.internal.s.g(this.f113161d, a0Var.f113161d);
    }

    public final int hashCode() {
        int iD = q2.d(this.f113159b, Integer.hashCode(this.f113158a) * 31, 31);
        Long l14 = this.f113160c;
        int iHashCode = (iD + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num = this.f113161d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f113158a, this.f113159b, "TransferItemResponse(transferHandle=", ", transport=", ", offset=");
        sbJ.append(this.f113160c);
        sbJ.append(", windowBits=");
        sbJ.append(this.f113161d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
