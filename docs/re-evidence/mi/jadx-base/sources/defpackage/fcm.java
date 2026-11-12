package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f17654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17655b;

    public fcm(BigInteger bigInteger, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f17654a = bigInteger;
        this.f17655b = i;
    }

    public fcm a(fcm fcmVar) {
        c(fcmVar);
        return new fcm(this.f17654a.add(fcmVar.f17654a), this.f17655b);
    }

    public fcm b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        int i2 = this.f17655b;
        return i == i2 ? this : new fcm(this.f17654a.shiftLeft(i - i2), i);
    }

    public final void c(fcm fcmVar) {
        if (this.f17655b != fcmVar.f17655b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public int d(BigInteger bigInteger) {
        return this.f17654a.compareTo(bigInteger.shiftLeft(this.f17655b));
    }

    public BigInteger e() {
        return this.f17654a.shiftRight(this.f17655b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcm)) {
            return false;
        }
        fcm fcmVar = (fcm) obj;
        return this.f17654a.equals(fcmVar.f17654a) && this.f17655b == fcmVar.f17655b;
    }

    public int f() {
        return this.f17655b;
    }

    public fcm g() {
        return new fcm(this.f17654a.negate(), this.f17655b);
    }

    public BigInteger h() {
        return a(new fcm(z77.f40976b, 1).b(this.f17655b)).e();
    }

    public int hashCode() {
        return this.f17654a.hashCode() ^ this.f17655b;
    }

    public fcm i(fcm fcmVar) {
        return a(fcmVar.g());
    }

    public fcm j(BigInteger bigInteger) {
        return new fcm(this.f17654a.subtract(bigInteger.shiftLeft(this.f17655b)), this.f17655b);
    }

    public String toString() {
        if (this.f17655b == 0) {
            return this.f17654a.toString();
        }
        BigInteger bigIntegerE = e();
        BigInteger bigIntegerSubtract = this.f17654a.subtract(bigIntegerE.shiftLeft(this.f17655b));
        if (this.f17654a.signum() == -1) {
            bigIntegerSubtract = z77.f40976b.shiftLeft(this.f17655b).subtract(bigIntegerSubtract);
        }
        if (bigIntegerE.signum() == -1 && !bigIntegerSubtract.equals(z77.f40975a)) {
            bigIntegerE = bigIntegerE.add(z77.f40976b);
        }
        String string = bigIntegerE.toString();
        char[] cArr = new char[this.f17655b];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i = this.f17655b - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = string2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
