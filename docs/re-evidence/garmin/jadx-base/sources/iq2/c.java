package iq2;

import androidx.core.view.j;
import lc.u0;
import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Liq2/c;", "", "", "sequenceNumber", "", "dateTimeValue", "typeId", "", "amount", "balanceAfterTransaction", "systemId", "locationId", "spid", "equipmentNumber", "<init>", "(BJBSSBBSS)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f94737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f94739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f94740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final short f94741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f94742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f94743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f94744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short f94745i;

    public c(byte b14, long j8, byte b15, short s8, short s14, byte b16, byte b17, short s15, short s16) {
        this.f94737a = b14;
        this.f94738b = j8;
        this.f94739c = b15;
        this.f94740d = s8;
        this.f94741e = s14;
        this.f94742f = b16;
        this.f94743g = b17;
        this.f94744h = s15;
        this.f94745i = s16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f94737a == cVar.f94737a && this.f94738b == cVar.f94738b && this.f94739c == cVar.f94739c && this.f94740d == cVar.f94740d && this.f94741e == cVar.f94741e && this.f94742f == cVar.f94742f && this.f94743g == cVar.f94743g && this.f94744h == cVar.f94744h && this.f94745i == cVar.f94745i;
    }

    public final int hashCode() {
        return Short.hashCode(this.f94745i) + ((Short.hashCode(this.f94744h) + ((Byte.hashCode(this.f94743g) + ((Byte.hashCode(this.f94742f) + ((Short.hashCode(this.f94741e) + ((Short.hashCode(this.f94740d) + ((Byte.hashCode(this.f94739c) + f.e(Byte.hashCode(this.f94737a) * 31, 31, this.f94738b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PreloadTransitTransactionRecord(sequenceNumber=");
        sb3.append((int) this.f94737a);
        sb3.append(", dateTimeValue=");
        sb3.append(this.f94738b);
        j.m(this.f94739c, this.f94740d, ", typeId=", ", amount=", sb3);
        j.m(this.f94741e, this.f94742f, ", balanceAfterTransaction=", ", systemId=", sb3);
        j.m(this.f94743g, this.f94744h, ", locationId=", ", spid=", sb3);
        return u0.k(sb3, ", equipmentNumber=", this.f94745i, ")");
    }
}
