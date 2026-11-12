package com.xiaomi.miot.centralclientsdk;

import android.util.Base64;
import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13600b;
    public int c;
    public String d;
    public byte[] e;
    public byte[] f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13601k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f13602a = 1;
        public static int limited = 3;
    }

    public b(byte[] bArr) {
        byte[] bArrDecode = Base64.decode(bArr, 0);
        if (bArrDecode.length < 23) {
            throw new InvalidParameterException();
        }
        byte b2 = bArrDecode[0];
        this.f13599a = (b2 & 1) != 0;
        this.f13600b = (b2 & 4) != 0;
        this.c = (b2 & 240) >>> 4;
        this.d = new BigInteger(Arrays.copyOfRange(bArrDecode, 1, 9)).toString();
        this.e = new byte[8];
        for (int i = 0; i < 8; i++) {
            this.e[i] = bArrDecode[16 - i];
        }
        this.f = Arrays.copyOfRange(bArrDecode, 17, 20);
        byte b3 = bArrDecode[20];
        this.g = b3 & 15;
        this.h = (b3 & 240) >>> 4;
        this.i = bArrDecode[21];
        byte b4 = bArrDecode[22];
        this.j = (b4 & 1) != 0;
        this.f13601k = (b4 & 2) != 0;
    }

    public String toString() {
        return "IDMAppsdata{fixedRole=" + this.f13599a + ", isOnline=" + this.f13600b + ", version=" + this.c + ", did='" + this.d + "', groupId=" + Arrays.toString(this.e) + ", priority=" + Arrays.toString(this.f) + ", linkType=" + this.g + ", role=" + this.h + ", rssi=" + this.i + ", suitIDM=" + this.j + ", suitMQTT=" + this.f13601k + AbstractJsonLexerKt.END_OBJ;
    }
}
