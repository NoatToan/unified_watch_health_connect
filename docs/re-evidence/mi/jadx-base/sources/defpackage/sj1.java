package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class sj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f33691a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f33692b = new Class[0];
    public static final String[] c = new String[0];
    public static final long[] d = new long[0];
    public static final Long[] e = new Long[0];
    public static final int[] f = new int[0];
    public static final Integer[] g = new Integer[0];
    public static final short[] h = new short[0];
    public static final Short[] i = new Short[0];
    public static final byte[] j = new byte[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Byte[] f33693k = new Byte[0];
    public static final double[] l = new double[0];
    public static final Double[] m = new Double[0];
    public static final float[] n = new float[0];
    public static final Float[] o = new Float[0];
    public static final boolean[] p = new boolean[0];
    public static final Boolean[] q = new Boolean[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char[] f33694r = new char[0];
    public static final Character[] s = new Character[0];

    public static <T> T[] a(T[] tArr, T t) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else {
            if (t == null) {
                throw new IllegalArgumentException("Arguments cannot both be null");
            }
            cls = t.getClass();
        }
        T[] tArr2 = (T[]) ((Object[]) b(tArr, cls));
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    public static Object b(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 1);
        }
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        return objNewInstance;
    }
}
