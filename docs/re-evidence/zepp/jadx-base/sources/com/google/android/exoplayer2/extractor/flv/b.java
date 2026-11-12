package com.google.android.exoplayer2.extractor.flv;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class b extends TagPayloadReader {
    private static final String e = "onMetaData";
    private static final String f = "duration";
    private static final String g = "keyframes";
    private static final String h = "filepositions";
    private static final String i = "times";
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 8;
    private static final int o = 9;
    private static final int p = 10;
    private static final int q = 11;
    private long b;
    private long[] c;
    private long[] d;

    public b() {
        super(new DummyTrackOutput());
        this.b = C.TIME_UNSET;
        this.c = new long[0];
        this.d = new long[0];
    }

    private static Boolean h(ParsableByteArray data) {
        return Boolean.valueOf(data.readUnsignedByte() == 1);
    }

    @Nullable
    private static Object i(ParsableByteArray data, int type) {
        if (type == 0) {
            return k(data);
        }
        if (type == 1) {
            return h(data);
        }
        if (type == 2) {
            return o(data);
        }
        if (type == 3) {
            return m(data);
        }
        if (type == 8) {
            return l(data);
        }
        if (type == 10) {
            return n(data);
        }
        if (type != 11) {
            return null;
        }
        return j(data);
    }

    private static Date j(ParsableByteArray data) {
        Date date = new Date((long) k(data).doubleValue());
        data.skipBytes(2);
        return date;
    }

    private static Double k(ParsableByteArray data) {
        return Double.valueOf(Double.longBitsToDouble(data.readLong()));
    }

    private static HashMap<String, Object> l(ParsableByteArray data) {
        int unsignedIntToInt = data.readUnsignedIntToInt();
        HashMap<String, Object> map = new HashMap<>(unsignedIntToInt);
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            String strO = o(data);
            Object objI = i(data, p(data));
            if (objI != null) {
                map.put(strO, objI);
            }
        }
        return map;
    }

    private static HashMap<String, Object> m(ParsableByteArray data) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strO = o(data);
            int iP = p(data);
            if (iP == 9) {
                return map;
            }
            Object objI = i(data, iP);
            if (objI != null) {
                map.put(strO, objI);
            }
        }
    }

    private static ArrayList<Object> n(ParsableByteArray data) {
        int unsignedIntToInt = data.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(unsignedIntToInt);
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            Object objI = i(data, p(data));
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        return arrayList;
    }

    private static String o(ParsableByteArray data) {
        int unsignedShort = data.readUnsignedShort();
        int position = data.getPosition();
        data.skipBytes(unsignedShort);
        return new String(data.getData(), position, unsignedShort);
    }

    private static int p(ParsableByteArray data) {
        return data.readUnsignedByte();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(ParsableByteArray data) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(ParsableByteArray data, long timeUs) {
        if (p(data) != 2 || !e.equals(o(data)) || p(data) != 8) {
            return false;
        }
        HashMap<String, Object> mapL = l(data);
        Object obj = mapL.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapL.get(g);
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(h);
            Object obj4 = map.get(i);
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void d() {
    }

    public long e() {
        return this.b;
    }

    public long[] f() {
        return this.d;
    }

    public long[] g() {
        return this.c;
    }
}
