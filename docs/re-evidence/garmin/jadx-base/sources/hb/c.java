package hb;

import androidx.media3.extractor.flv.TagPayloadReader;
import bb.k;
import com.google.android.exoplayer2.C;
import fa.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f82738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f82739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f82740d;

    public c() {
        super(new k());
        this.f82738b = C.TIME_UNSET;
        this.f82739c = new long[0];
        this.f82740d = new long[0];
    }

    public static Serializable a(int i14, r rVar) {
        if (i14 == 0) {
            return Double.valueOf(Double.longBitsToDouble(rVar.o()));
        }
        if (i14 == 1) {
            return Boolean.valueOf(rVar.u() == 1);
        }
        if (i14 == 2) {
            return c(rVar);
        }
        if (i14 != 3) {
            if (i14 == 8) {
                return b(rVar);
            }
            if (i14 != 10) {
                if (i14 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(rVar.o()));
                rVar.H(2);
                return date;
            }
            int iY = rVar.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i15 = 0; i15 < iY; i15++) {
                Serializable serializableA = a(rVar.u(), rVar);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(rVar);
            int iU = rVar.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableA2 = a(iU, rVar);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(r rVar) {
        int iY = rVar.y();
        HashMap<String, Object> map = new HashMap<>(iY);
        for (int i14 = 0; i14 < iY; i14++) {
            String strC = c(rVar);
            Serializable serializableA = a(rVar.u(), rVar);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(r rVar) {
        int iA = rVar.A();
        int i14 = rVar.f70055b;
        rVar.H(iA);
        return new String(rVar.f70054a, i14, iA);
    }
}
