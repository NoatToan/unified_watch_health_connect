package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class eio implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f16692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16693b;
    public String c;

    public eio() {
        this(32);
    }

    public eio a(char c) {
        i(k() + 1);
        char[] cArr = this.f16692a;
        int i = this.f16693b;
        this.f16693b = i + 1;
        cArr[i] = c;
        return this;
    }

    public eio b(double d) {
        return f(String.valueOf(d));
    }

    public eio c(int i) {
        return f(String.valueOf(i));
    }

    public Object clone() throws CloneNotSupportedException {
        eio eioVar = (eio) super.clone();
        char[] cArr = new char[this.f16692a.length];
        eioVar.f16692a = cArr;
        char[] cArr2 = this.f16692a;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        return eioVar;
    }

    public eio d(long j) {
        return f(String.valueOf(j));
    }

    public eio e(Object obj) {
        return obj == null ? h() : f(obj.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof eio) {
            return j((eio) obj);
        }
        return false;
    }

    public eio f(String str) {
        if (str == null) {
            return h();
        }
        int length = str.length();
        if (length > 0) {
            int iK = k();
            i(iK + length);
            str.getChars(0, length, this.f16692a, iK);
            this.f16693b += length;
        }
        return this;
    }

    public eio g(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return h();
        }
        if (i < 0 || i > cArr.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid startIndex: ");
            stringBuffer.append(i2);
            throw new StringIndexOutOfBoundsException(stringBuffer.toString());
        }
        if (i2 < 0 || i + i2 > cArr.length) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Invalid length: ");
            stringBuffer2.append(i2);
            throw new StringIndexOutOfBoundsException(stringBuffer2.toString());
        }
        if (i2 > 0) {
            int iK = k();
            i(iK + i2);
            System.arraycopy(cArr, i, this.f16692a, iK, i2);
            this.f16693b += i2;
        }
        return this;
    }

    public eio h() {
        String str = this.c;
        return str == null ? this : f(str);
    }

    public int hashCode() {
        char[] cArr = this.f16692a;
        int i = 0;
        for (int i2 = this.f16693b - 1; i2 >= 0; i2--) {
            i = (i * 31) + cArr[i2];
        }
        return i;
    }

    public eio i(int i) {
        char[] cArr = this.f16692a;
        if (i > cArr.length) {
            char[] cArr2 = new char[i * 2];
            this.f16692a = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f16693b);
        }
        return this;
    }

    public boolean j(eio eioVar) {
        if (this == eioVar) {
            return true;
        }
        int i = this.f16693b;
        if (i != eioVar.f16693b) {
            return false;
        }
        char[] cArr = this.f16692a;
        char[] cArr2 = eioVar.f16692a;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int k() {
        return this.f16693b;
    }

    public String toString() {
        return new String(this.f16692a, 0, this.f16693b);
    }

    public eio(int i) {
        this.f16692a = new char[i <= 0 ? 32 : i];
    }
}
