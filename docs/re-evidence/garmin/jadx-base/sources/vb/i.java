package vb;

import androidx.media3.common.w;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.flexbox.FlexItem;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private i() {
    }

    public static ga.a a(w wVar, String str) {
        int i14 = 0;
        while (true) {
            w.b[] bVarArr = wVar.f8574a;
            if (i14 >= bVarArr.length) {
                return null;
            }
            w.b bVar = bVarArr[i14];
            if (bVar instanceof ga.a) {
                ga.a aVar = (ga.a) bVar;
                if (aVar.f76500a.equals(str)) {
                    return aVar;
                }
            }
            i14++;
        }
    }

    public static pb.a b(fa.r rVar) {
        String str;
        int iG = rVar.g();
        if (rVar.g() != 1684108385) {
            fa.k.g("Failed to parse cover art attribute");
            return null;
        }
        int iG2 = rVar.g();
        byte[] bArr = b.f176657a;
        int i14 = iG2 & FlexItem.MAX_SIZE;
        if (i14 == 13) {
            str = MimeTypes.IMAGE_JPEG;
        } else {
            str = i14 == 14 ? "image/png" : null;
        }
        if (str == null) {
            fb1.c.r(i14, "Unrecognized cover art flags: ");
            return null;
        }
        rVar.H(4);
        int i15 = iG - 16;
        byte[] bArr2 = new byte[i15];
        rVar.e(bArr2, 0, i15);
        return new pb.a(str, null, 3, bArr2);
    }

    public static pb.m c(int i14, fa.r rVar, String str) {
        int iG = rVar.g();
        if (rVar.g() == 1684108385 && iG >= 22) {
            rVar.H(10);
            int iA = rVar.A();
            if (iA > 0) {
                String strH = am.j.h(iA, "");
                int iA2 = rVar.A();
                if (iA2 > 0) {
                    strH = h.h(iA2, strH, "/");
                }
                return new pb.m(str, (String) null, ImmutableList.of(strH));
            }
        }
        fa.k.g("Failed to parse index/count attribute: ".concat(ga.b.a(i14)));
        return null;
    }

    public static int d(fa.r rVar) {
        int iG = rVar.g();
        if (rVar.g() == 1684108385) {
            rVar.H(8);
            int i14 = iG - 16;
            if (i14 == 1) {
                return rVar.u();
            }
            if (i14 == 2) {
                return rVar.A();
            }
            if (i14 == 3) {
                return rVar.x();
            }
            if (i14 == 4 && (rVar.f70054a[rVar.f70055b] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return rVar.y();
            }
        }
        fa.k.g("Failed to parse data atom to int");
        return -1;
    }

    public static pb.h e(int i14, String str, fa.r rVar, boolean z14, boolean z15) {
        int iD = d(rVar);
        if (z15) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z14 ? new pb.m(str, (String) null, ImmutableList.of(Integer.toString(iD))) : new pb.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iD));
        }
        fa.k.g("Failed to parse uint8 attribute: ".concat(ga.b.a(i14)));
        return null;
    }

    public static pb.m f(int i14, fa.r rVar, String str) {
        int iG = rVar.g();
        if (rVar.g() == 1684108385) {
            rVar.H(8);
            return new pb.m(str, (String) null, ImmutableList.of(rVar.q(iG - 16)));
        }
        fa.k.g("Failed to parse text attribute: ".concat(ga.b.a(i14)));
        return null;
    }
}
