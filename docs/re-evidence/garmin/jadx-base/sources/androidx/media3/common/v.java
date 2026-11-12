package androidx.media3.common;

import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final v B = new v(new b());
    public final ImmutableList<String> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f8523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f8524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f8525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f8526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f8527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f8528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f8529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f8530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public final Integer f8531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f8532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public final Integer f8533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f8534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f8535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f8536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f8537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f8538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f8539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f8540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f8541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f8542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f8543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f8544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f8545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f8546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Integer f8547z;

    static {
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(2);
        fa.z.H(3);
        fa.z.H(4);
        fa.z.H(5);
        fa.z.H(6);
        fa.z.H(8);
        fa.z.H(9);
        fa.z.H(10);
        fa.z.H(11);
        fa.z.H(12);
        fa.z.H(13);
        fa.z.H(14);
        fa.z.H(15);
        fa.z.H(16);
        fa.z.H(17);
        fa.z.H(18);
        fa.z.H(19);
        fa.z.H(20);
        fa.z.H(21);
        fa.z.H(22);
        fa.z.H(23);
        fa.z.H(24);
        fa.z.H(25);
        fa.z.H(26);
        fa.z.H(27);
        fa.z.H(28);
        fa.z.H(29);
        fa.z.H(30);
        fa.z.H(31);
        fa.z.H(32);
        fa.z.H(33);
        fa.z.H(34);
        fa.z.H(1000);
    }

    private v(b bVar) {
        Boolean boolValueOf = bVar.f8558k;
        Integer numValueOf = bVar.f8557j;
        Integer numValueOf2 = bVar.f8572y;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i14 = 0;
                            break;
                        case 21:
                            i14 = 2;
                            break;
                        case 22:
                            i14 = 3;
                            break;
                        case 23:
                            i14 = 4;
                            break;
                        case 24:
                            i14 = 5;
                            break;
                        case 25:
                            i14 = 6;
                            break;
                    }
                    i16 = i14;
                }
                numValueOf = Integer.valueOf(i16);
            }
        } else if (numValueOf != null) {
            boolean z14 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z14);
            if (z14 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i15 = 21;
                        break;
                    case 3:
                        i15 = 22;
                        break;
                    case 4:
                        i15 = 23;
                        break;
                    case 5:
                        i15 = 24;
                        break;
                    case 6:
                        i15 = 25;
                        break;
                    default:
                        i15 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i15);
            }
        }
        this.f8522a = bVar.f8548a;
        this.f8523b = bVar.f8549b;
        this.f8524c = bVar.f8550c;
        this.f8525d = bVar.f8551d;
        this.f8526e = bVar.f8552e;
        this.f8527f = bVar.f8553f;
        this.f8528g = bVar.f8554g;
        this.f8529h = bVar.f8555h;
        this.f8530i = bVar.f8556i;
        this.f8531j = numValueOf;
        this.f8532k = boolValueOf;
        Integer num = bVar.f8559l;
        this.f8533l = num;
        this.f8534m = num;
        this.f8535n = bVar.f8560m;
        this.f8536o = bVar.f8561n;
        this.f8537p = bVar.f8562o;
        this.f8538q = bVar.f8563p;
        this.f8539r = bVar.f8564q;
        this.f8540s = bVar.f8565r;
        this.f8541t = bVar.f8566s;
        this.f8542u = bVar.f8567t;
        this.f8543v = bVar.f8568u;
        this.f8544w = bVar.f8569v;
        this.f8545x = bVar.f8570w;
        this.f8546y = bVar.f8571x;
        this.f8547z = numValueOf2;
        this.A = bVar.f8573z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return Objects.equals(this.f8522a, vVar.f8522a) && Objects.equals(this.f8523b, vVar.f8523b) && Objects.equals(this.f8524c, vVar.f8524c) && Objects.equals(this.f8525d, vVar.f8525d) && Objects.equals(this.f8526e, vVar.f8526e) && Arrays.equals(this.f8527f, vVar.f8527f) && Objects.equals(this.f8528g, vVar.f8528g) && Objects.equals(this.f8529h, vVar.f8529h) && Objects.equals(this.f8530i, vVar.f8530i) && Objects.equals(this.f8531j, vVar.f8531j) && Objects.equals(this.f8532k, vVar.f8532k) && Objects.equals(this.f8534m, vVar.f8534m) && Objects.equals(this.f8535n, vVar.f8535n) && Objects.equals(this.f8536o, vVar.f8536o) && Objects.equals(this.f8537p, vVar.f8537p) && Objects.equals(this.f8538q, vVar.f8538q) && Objects.equals(this.f8539r, vVar.f8539r) && Objects.equals(this.f8540s, vVar.f8540s) && Objects.equals(this.f8541t, vVar.f8541t) && Objects.equals(this.f8542u, vVar.f8542u) && Objects.equals(this.f8543v, vVar.f8543v) && Objects.equals(this.f8544w, vVar.f8544w) && Objects.equals(this.f8545x, vVar.f8545x) && Objects.equals(this.f8546y, vVar.f8546y) && Objects.equals(this.f8547z, vVar.f8547z) && Objects.equals(this.A, vVar.A);
    }

    public final int hashCode() {
        return com.google.common.base.Objects.hashCode(this.f8522a, this.f8523b, this.f8524c, this.f8525d, null, null, this.f8526e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f8527f)), this.f8528g, null, this.f8529h, this.f8530i, this.f8531j, this.f8532k, null, this.f8534m, this.f8535n, this.f8536o, this.f8537p, this.f8538q, this.f8539r, this.f8540s, this.f8541t, this.f8542u, this.f8543v, this.f8544w, this.f8545x, null, this.f8546y, this.f8547z, true, this.A);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f8548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f8549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f8550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f8551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f8552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f8553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f8554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f8555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Integer f8556i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Integer f8557j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Boolean f8558k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f8559l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Integer f8560m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Integer f8561n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Integer f8562o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Integer f8563p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Integer f8564q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f8565r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f8566s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence f8567t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Integer f8568u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Integer f8569v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CharSequence f8570w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public CharSequence f8571x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Integer f8572y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ImmutableList<String> f8573z;

        private b(v vVar) {
            this.f8548a = vVar.f8522a;
            this.f8549b = vVar.f8523b;
            this.f8550c = vVar.f8524c;
            this.f8551d = vVar.f8525d;
            this.f8552e = vVar.f8526e;
            this.f8553f = vVar.f8527f;
            this.f8554g = vVar.f8528g;
            this.f8555h = vVar.f8529h;
            this.f8556i = vVar.f8530i;
            this.f8557j = vVar.f8531j;
            this.f8558k = vVar.f8532k;
            this.f8559l = vVar.f8534m;
            this.f8560m = vVar.f8535n;
            this.f8561n = vVar.f8536o;
            this.f8562o = vVar.f8537p;
            this.f8563p = vVar.f8538q;
            this.f8564q = vVar.f8539r;
            this.f8565r = vVar.f8540s;
            this.f8566s = vVar.f8541t;
            this.f8567t = vVar.f8542u;
            this.f8568u = vVar.f8543v;
            this.f8569v = vVar.f8544w;
            this.f8570w = vVar.f8545x;
            this.f8571x = vVar.f8546y;
            this.f8572y = vVar.f8547z;
            this.f8573z = vVar.A;
        }

        @CanIgnoreReturnValue
        public final void a(int i14, byte[] bArr) {
            if (this.f8553f != null) {
                Integer numValueOf = Integer.valueOf(i14);
                int i15 = fa.z.f70071a;
                if (!numValueOf.equals(3) && Objects.equals(this.f8554g, 3)) {
                    return;
                }
            }
            this.f8553f = (byte[]) bArr.clone();
            this.f8554g = Integer.valueOf(i14);
        }

        public b() {
            this.f8573z = ImmutableList.of();
        }
    }
}
