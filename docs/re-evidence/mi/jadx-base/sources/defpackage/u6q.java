package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class u6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35477b;
    public int c;
    public v6q d;
    public final w6q e;
    public x6q f;
    public byte[] g;

    public u6q(v6q v6qVar, w6q w6qVar, x6q x6qVar) {
        this.d = v6qVar;
        this.e = w6qVar;
        this.f = x6qVar;
        String string = v6qVar.f().toString();
        Charset charset = StandardCharsets.UTF_8;
        this.f35476a = string.getBytes(charset).length;
        this.f35477b = w6qVar.a().length;
        this.c = x6qVar.b().toString().getBytes(charset).length;
        try {
            this.g = a();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static boolean f(u6q[] u6qVarArr) {
        if (u6qVarArr == null || u6qVarArr.length == 0) {
            return false;
        }
        v6q v6qVarB = u6qVarArr[0].b();
        q6q q6qVarC = v6qVarB.c();
        if (!(q6qVarC instanceof y6q)) {
            return false;
        }
        y6q y6qVar = (y6q) q6qVarC;
        v6qVarB.b();
        y6qVar.c();
        y6qVar.e();
        return true;
    }

    public static u6q g(u6q[] u6qVarArr) throws JSONException {
        if (!f(u6qVarArr)) {
            jpe.b("UDTMessage", "sliced udt messages is not valid.");
            return null;
        }
        u6q u6qVar = u6qVarArr[0];
        v6q v6qVarB = u6qVar.b();
        q6q q6qVarC = v6qVarB.c();
        if (!(q6qVarC instanceof y6q)) {
            return null;
        }
        y6q y6qVar = (y6q) q6qVarC;
        int iC = (int) y6qVar.g().c();
        byte[] bArr = new byte[iC];
        int length = 0;
        for (int i = 0; i < u6qVarArr.length; i++) {
            System.arraycopy(u6qVarArr[i].c().a(), 0, bArr, length, u6qVarArr[i].c().a().length);
            length += u6qVarArr[i].c().a().length;
        }
        jpe.b("UDTMessage", "size: " + iC);
        y6qVar.h(null);
        return new u6q(v6qVarB, new w6q(bArr), u6qVar.d());
    }

    public final byte[] a() throws UnsupportedEncodingException {
        byte[] bArrE = h5q.e(this.f35476a);
        byte[] bArrE2 = h5q.e(this.f35477b);
        byte[] bArrE3 = h5q.e(this.c);
        String string = this.d.f().toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        byte[] bArrA = this.e.a();
        byte[] bytes2 = this.f.b().toString().getBytes(charset);
        byte[] bArr = new byte[bArrE.length + bArrE2.length + bArrE3.length + bytes.length + bArrA.length + bytes2.length];
        int i = 0;
        for (byte b2 : bArrE) {
            bArr[i] = b2;
            i++;
        }
        for (byte b3 : bArrE2) {
            bArr[i] = b3;
            i++;
        }
        for (byte b4 : bArrE3) {
            bArr[i] = b4;
            i++;
        }
        for (byte b5 : bytes) {
            bArr[i] = b5;
            i++;
        }
        for (byte b6 : bArrA) {
            bArr[i] = b6;
            i++;
        }
        for (byte b7 : bytes2) {
            bArr[i] = b7;
            i++;
        }
        return bArr;
    }

    public v6q b() {
        return this.d;
    }

    public w6q c() {
        return this.e;
    }

    public x6q d() {
        return this.f;
    }

    public byte[] e() {
        return this.g;
    }

    public u6q(byte[] bArr) {
        this.g = bArr;
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        this.f35476a = h5q.b(bArr2);
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 4, bArr3, 0, 4);
        this.f35477b = h5q.b(bArr3);
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr, 8, bArr4, 0, 4);
        this.c = h5q.b(bArr4);
        int i = this.f35476a;
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr, 12, bArr5, 0, i);
        int i2 = 12 + i;
        try {
            this.d = v6q.a(new JSONObject(new String(bArr5, StandardCharsets.UTF_8)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int i3 = this.f35477b;
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArr, i2, bArr6, 0, i3);
        int i4 = i2 + i3;
        this.e = new w6q(bArr6);
        int i5 = this.c;
        byte[] bArr7 = new byte[i5];
        System.arraycopy(bArr, i4, bArr7, 0, i5);
        try {
            this.f = x6q.a(new JSONObject(new String(bArr7, StandardCharsets.UTF_8)));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
