package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class yj1<T> extends wtd<T> {
    public static wtd<int[]> c = new h(null);
    public static wtd<Integer[]> d = new i(null);
    public static wtd<short[]> e = new j(null);
    public static wtd<Short[]> f = new k(null);
    public static wtd<byte[]> g = new l(null);
    public static wtd<Byte[]> h = new m(null);
    public static wtd<char[]> i = new n(null);
    public static wtd<Character[]> j = new o(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static wtd<long[]> f40227k = new p(null);
    public static wtd<Long[]> l = new a(null);
    public static wtd<float[]> m = new b(null);
    public static wtd<Float[]> n = new c(null);
    public static wtd<double[]> o = new d(null);
    public static wtd<Double[]> p = new e(null);
    public static wtd<boolean[]> q = new f(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static wtd<Boolean[]> f40228r = new g(null);

    public class a extends yj1<Long[]> {
        public a(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Long[] b(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        lArr[i] = (Long) obj2;
                    } else {
                        lArr[i] = Long.valueOf(((Number) obj2).longValue());
                    }
                    i++;
                }
            }
            return lArr;
        }
    }

    public class b extends yj1<float[]> {
        public b(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public float[] b(Object obj) {
            List list = (List) obj;
            float[] fArr = new float[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                fArr[i] = ((Number) it.next()).floatValue();
                i++;
            }
            return fArr;
        }
    }

    public class c extends yj1<Float[]> {
        public c(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Float[] b(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        fArr[i] = (Float) obj2;
                    } else {
                        fArr[i] = Float.valueOf(((Number) obj2).floatValue());
                    }
                    i++;
                }
            }
            return fArr;
        }
    }

    public class d extends yj1<double[]> {
        public d(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public double[] b(Object obj) {
            List list = (List) obj;
            double[] dArr = new double[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                dArr[i] = ((Number) it.next()).doubleValue();
                i++;
            }
            return dArr;
        }
    }

    public class e extends yj1<Double[]> {
        public e(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double[] b(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Double) {
                        dArr[i] = (Double) obj2;
                    } else {
                        dArr[i] = Double.valueOf(((Number) obj2).doubleValue());
                    }
                    i++;
                }
            }
            return dArr;
        }
    }

    public class f extends yj1<boolean[]> {
        public f(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Object obj) {
            List list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                zArr[i] = ((Boolean) it.next()).booleanValue();
                i++;
            }
            return zArr;
        }
    }

    public class g extends yj1<Boolean[]> {
        public g(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean[] b(Object obj) {
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Boolean) {
                        boolArr[i] = (Boolean) obj2;
                    } else {
                        if (!(obj2 instanceof Number)) {
                            throw new RuntimeException("can not convert " + obj2 + " toBoolean");
                        }
                        boolArr[i] = Boolean.valueOf(((Number) obj2).intValue() != 0);
                    }
                    i++;
                }
            }
            return boolArr;
        }
    }

    public class h extends yj1<int[]> {
        public h(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int[] b(Object obj) {
            List list = (List) obj;
            int[] iArr = new int[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((Number) it.next()).intValue();
                i++;
            }
            return iArr;
        }
    }

    public class i extends yj1<Integer[]> {
        public i(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer[] b(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Integer) {
                        numArr[i] = (Integer) obj2;
                    } else {
                        numArr[i] = Integer.valueOf(((Number) obj2).intValue());
                    }
                    i++;
                }
            }
            return numArr;
        }
    }

    public class j extends yj1<short[]> {
        public j(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public short[] b(Object obj) {
            List list = (List) obj;
            short[] sArr = new short[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                sArr[i] = ((Number) it.next()).shortValue();
                i++;
            }
            return sArr;
        }
    }

    public class k extends yj1<Short[]> {
        public k(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Short[] b(Object obj) {
            List list = (List) obj;
            Short[] shArr = new Short[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Short) {
                        shArr[i] = (Short) obj2;
                    } else {
                        shArr[i] = Short.valueOf(((Number) obj2).shortValue());
                    }
                    i++;
                }
            }
            return shArr;
        }
    }

    public class l extends yj1<byte[]> {
        public l(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public byte[] b(Object obj) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                bArr[i] = ((Number) it.next()).byteValue();
                i++;
            }
            return bArr;
        }
    }

    public class m extends yj1<Byte[]> {
        public m(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Byte[] b(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Byte) {
                        bArr[i] = (Byte) obj2;
                    } else {
                        bArr[i] = Byte.valueOf(((Number) obj2).byteValue());
                    }
                    i++;
                }
            }
            return bArr;
        }
    }

    public class n extends yj1<char[]> {
        public n(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public char[] b(Object obj) {
            List list = (List) obj;
            char[] cArr = new char[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                cArr[i] = it.next().toString().charAt(0);
                i++;
            }
            return cArr;
        }
    }

    public class o extends yj1<Character[]> {
        public o(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Character[] b(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    chArr[i] = Character.valueOf(obj2.toString().charAt(0));
                    i++;
                }
            }
            return chArr;
        }
    }

    public class p extends yj1<long[]> {
        public p(vtd vtdVar) {
            super(vtdVar);
        }

        @Override // defpackage.wtd
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public long[] b(Object obj) {
            List list = (List) obj;
            long[] jArr = new long[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                jArr[i] = ((Number) it.next()).intValue();
                i++;
            }
            return jArr;
        }
    }

    public yj1(vtd vtdVar) {
        super(vtdVar);
    }

    @Override // defpackage.wtd
    public void a(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // defpackage.wtd
    public Object c() {
        return new ArrayList();
    }
}
