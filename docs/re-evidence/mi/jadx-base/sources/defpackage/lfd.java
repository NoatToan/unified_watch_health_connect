package defpackage;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class lfd extends hnq {
    public static final Pattern t = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
    public final double[] i;
    public final double[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25006k;
    public double[][] l;
    public final boolean m;
    public final Matcher n;
    public final String o;
    public final String p;
    public hnq q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25007r;
    public int s;

    public lfd(ReadableMap readableMap) {
        this.i = m(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        boolean z = array.getType(0) == ReadableType.String;
        this.m = z;
        if (z) {
            int size = array.size();
            this.j = new double[size];
            String string = array.getString(0);
            this.f25006k = string;
            this.f25007r = string.startsWith("rgb");
            this.n = t.matcher(this.f25006k);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                Matcher matcher = t.matcher(array.getString(i));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.j[i] = ((Double) arrayList2.get(0)).doubleValue();
            }
            int size2 = ((ArrayList) arrayList.get(0)).size();
            this.s = size2;
            this.l = new double[size2][];
            for (int i2 = 0; i2 < this.s; i2++) {
                double[] dArr = new double[size];
                this.l[i2] = dArr;
                for (int i3 = 0; i3 < size; i3++) {
                    dArr[i3] = ((Double) ((ArrayList) arrayList.get(i3)).get(i2)).doubleValue();
                }
            }
        } else {
            this.j = m(array);
            this.n = null;
        }
        this.o = readableMap.getString("extrapolateLeft");
        this.p = readableMap.getString("extrapolateRight");
    }

    public static int l(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    public static double[] m(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    public static double n(double d, double d2, double d3, double d4, double d5, String str, String str2) {
        double d6;
        if (d < d2) {
            str.hashCode();
            switch (str) {
                case "extend":
                    d6 = d;
                    break;
                case "identity":
                    return d;
                case "clamp":
                    d6 = d2;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("Invalid extrapolation type " + str + "for left extrapolation");
            }
        } else {
            d6 = d;
        }
        if (d6 > d3) {
            str2.hashCode();
            switch (str2) {
                case "extend":
                    break;
                case "identity":
                    return d6;
                case "clamp":
                    d6 = d3;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("Invalid extrapolation type " + str2 + "for right extrapolation");
            }
        }
        if (d4 == d5) {
            return d4;
        }
        if (d2 == d3) {
            return d <= d2 ? d4 : d5;
        }
        return d4 + (((d5 - d4) * (d6 - d2)) / (d3 - d2));
    }

    public static double o(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int iL = l(d, dArr);
        int i = iL + 1;
        return n(d, dArr[iL], dArr[i], dArr2[iL], dArr2[i], str, str2);
    }

    @Override // defpackage.dc1
    public void b(dc1 dc1Var) {
        if (this.q != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(dc1Var instanceof hnq)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.q = (hnq) dc1Var;
    }

    @Override // defpackage.dc1
    public void c(dc1 dc1Var) {
        if (dc1Var != this.q) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.q = null;
    }

    @Override // defpackage.dc1
    public void e() {
        hnq hnqVar = this.q;
        if (hnqVar == null) {
            return;
        }
        double dI = hnqVar.i();
        double dO = o(dI, this.i, this.j, this.o, this.p);
        this.f = dO;
        if (this.m) {
            if (this.s <= 1) {
                this.e = this.n.replaceFirst(String.valueOf(dO));
                return;
            }
            StringBuffer stringBuffer = new StringBuffer(this.f25006k.length());
            this.n.reset();
            int i = 0;
            while (this.n.find()) {
                int i2 = i + 1;
                double dO2 = o(dI, this.i, this.l[i], this.o, this.p);
                if (this.f25007r) {
                    boolean z = i2 == 4;
                    if (z) {
                        dO2 *= 1000.0d;
                    }
                    int iRound = (int) Math.round(dO2);
                    this.n.appendReplacement(stringBuffer, z ? Double.toString(((double) iRound) / 1000.0d) : Integer.toString(iRound));
                } else {
                    int i3 = (int) dO2;
                    this.n.appendReplacement(stringBuffer, ((double) i3) != dO2 ? Double.toString(dO2) : Integer.toString(i3));
                }
                i = i2;
            }
            this.n.appendTail(stringBuffer);
            this.e = stringBuffer.toString();
        }
    }
}
