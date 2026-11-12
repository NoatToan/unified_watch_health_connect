package b2;

import android.os.Parcel;
import android.util.Base64;
import g6.q;
import g6.r;
import o13.z;
import o4.d0;
import o53.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb2/c;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcel f14461a;

    public c(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f14461a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final long a() {
        d0.a aVar = d0.f128823b;
        long j8 = this.f14461a.readLong();
        long j14 = 63 & j8;
        if (j14 >= 16) {
            j8 = (j8 & (-64)) | (j14 + 1);
        }
        z.a aVar2 = z.f128618b;
        return j8;
    }

    public final long b() {
        long j8;
        Parcel parcel = this.f14461a;
        byte b14 = parcel.readByte();
        if (b14 == 1) {
            r.f76022b.getClass();
            j8 = r.f76023c;
        } else if (b14 == 2) {
            r.f76022b.getClass();
            j8 = r.f76024d;
        } else {
            r.f76022b.getClass();
            j8 = 0;
        }
        r.f76022b.getClass();
        if (!r.b(j8, 0L)) {
            return f0.H(parcel.readFloat(), j8);
        }
        q.f76018b.getClass();
        return q.f76020d;
    }
}
