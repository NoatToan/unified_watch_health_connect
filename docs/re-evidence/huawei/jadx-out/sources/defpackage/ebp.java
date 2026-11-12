package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.wifi.entity.builder.BaseBuilder;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes7.dex */
public class ebp extends BaseBuilder {
    private static final long serialVersionUID = 7967385940897486810L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ebr f32685c;
    private int i;
    private Long l;
    private String m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f32683a = new byte[0];
    private byte[] j = new byte[16];
    private byte[] f = new byte[16];
    private byte[] h = null;
    private byte[] g = null;
    private byte[] n = null;
    private byte[] e = {67, 2};
    private byte[] d = {-70, 99, 108, 111, 117, 100, 83, 101, 116, 117, 112};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32684b = {17, 50};

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public ebl makeResponseEntity(String str) {
        return null;
    }

    static {
        eci.d();
    }

    public ebp(ebr ebrVar, String str, Long l, int i) {
        this.f32685c = null;
        this.m = "";
        super.setUri("/cloudSetup");
        super.setDefaultTime(10000L);
        this.f32685c = ebrVar;
        this.m = str;
        this.l = l;
        this.i = i;
        dyg.e(true, "CoapIdentifyCodeBuilder", "mOptSeq: ", Integer.valueOf(i));
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public String makeRequestStream() {
        return "";
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public byte[] makeRequestByte() {
        return b();
    }

    @Override // com.huawei.health.device.wifi.entity.builder.BaseBuilder
    public ebl makeResponseEntity(byte[] bArr) {
        ebr ebrVar = new ebr();
        if (bArr == null || bArr.length < 32) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "first makeResponseEntity para is not right!");
            return ebrVar;
        }
        if (this.j == null || this.f == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "second makeResponseEntity para is not right!");
            return ebrVar;
        }
        dyg.e(true, "CoapIdentifyCodeBuilder", "makeResponseEntity: ", ecj.b(bArr));
        try {
            int length = bArr.length - 32;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            String strD = ecg.d(bArr2, this.j, this.f);
            dyg.e(true, "CoapIdentifyCodeBuilder", "decrypt String: ", strD);
            return d(strD, ebrVar);
        } catch (UnsupportedEncodingException e) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "makeResponseEntity: ", e.getMessage());
            return ebrVar;
        } catch (NumberFormatException e2) {
            dyg.c(true, "CoapIdentifyCodeBuilder", e2.getMessage());
            return ebrVar;
        } catch (InvalidAlgorithmParameterException e3) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "makeResponseEntity: ", e3.getMessage());
            return ebrVar;
        } catch (InvalidKeyException e4) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "makeResponseEntity: ", e4.getMessage());
            return ebrVar;
        } catch (BadPaddingException e5) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "makeResponseEntity: ", e5.getMessage());
            return ebrVar;
        } catch (IllegalBlockSizeException e6) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "makeResponseEntity: ", e6.getMessage());
            return ebrVar;
        }
    }

    private ebl d(String str, ebr ebrVar) {
        Map<String, Object> mapA = JsonParser.a(str);
        if (mapA.isEmpty()) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "jsonMap is isEmpty!");
            return ebrVar;
        }
        dyg.e(true, "CoapIdentifyCodeBuilder", "jsonMap ", mapA.toString());
        if (mapA.containsKey("errcode")) {
            ebrVar.a(qrs.a(mapA.get("errcode").toString()));
            return ebrVar;
        }
        dyg.c(true, "CoapIdentifyCodeBuilder", "ERROR_CODE is null!");
        return ebrVar;
    }

    public void e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "snAppRandom1 or snDeviceRandom is not right!");
            return;
        }
        if (str.length() != 16 || str2.length() != 16) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "snAppRandom1 or snDeviceRandom length is not right!");
            return;
        }
        byte[] bArrC = ecj.c(str);
        byte[] bArrC2 = ecj.c(str2);
        if (bArrC.length == 0 || bArrC2.length == 0) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "bSn1 or bSn2 is null! ");
            return;
        }
        byte[] bArr = new byte[bArrC.length + bArrC2.length];
        this.h = bArr;
        System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
        System.arraycopy(bArrC2, 0, this.h, bArrC.length, bArrC2.length);
        byte[] bArrD = new byte[0];
        try {
            bArrD = ecj.d(this.h, 1, 32);
        } catch (InvalidKeyException e) {
            dyg.e(true, "CoapIdentifyCodeBuilder", e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            dyg.e(true, "CoapIdentifyCodeBuilder", e2.getMessage());
        }
        if (bArrD.length != 32) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "get digest error! ");
            return;
        }
        byte[] bArr2 = this.j;
        System.arraycopy(bArrD, 0, bArr2, 0, bArr2.length);
        int length = this.j.length;
        byte[] bArr3 = this.f;
        System.arraycopy(bArrD, length, bArr3, 0, bArr3.length);
    }

    public byte[] b() {
        if (this.f32685c == null || this.j == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "mEntityModel or mPskKey is empty!");
            return this.f32683a;
        }
        if (this.f == null || this.h == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "mPskIv or mSalt is empty!");
            return this.f32683a;
        }
        HashMap map = new HashMap(16);
        if (this.f32685c.e() != null) {
            map.put("code", this.f32685c.e());
        }
        if (this.f32685c.c() != null) {
            map.put("devId", this.f32685c.c());
        }
        if (this.f32685c.d() != null) {
            map.put("psk", this.f32685c.d());
        }
        if (this.f32685c.b() != null) {
            map.put("cloudUrl", this.f32685c.b());
        }
        String string = JsonParser.a(map).toString();
        dyg.e(true, "CoapIdentifyCodeBuilder", "data = ", string);
        return a(string);
    }

    private byte[] a(String str) {
        try {
            byte[] bArrE = ecg.e(str, this.j, this.f);
            if (bArrE == null) {
                dyg.c(true, "CoapIdentifyCodeBuilder", "encryptResult is null!");
                return this.f32683a;
            }
            return c(eco.d(this.j, this.h, 1, 32), bArrE);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException e) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "makeRequestStream: ", e.getMessage());
            return this.f32683a;
        }
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "digest1 is null!");
            return this.f32683a;
        }
        dyg.e(true, "CoapIdentifyCodeBuilder", "digest1 = ", ecj.b(bArr));
        byte[] bArrB = b(bArr2);
        if (bArrB == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "macCant is null!");
            return this.f32683a;
        }
        byte[] bArrC = eco.c(bArr, bArrB);
        if (bArrC == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "mac is null!");
            return this.f32683a;
        }
        dyg.e(true, "CoapIdentifyCodeBuilder", "mac = ", ecj.b(bArrC));
        byte[] bArr3 = new byte[bArr2.length + bArrC.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArrC, 0, bArr3, bArr2.length, bArrC.length);
        dyg.e(true, "CoapIdentifyCodeBuilder", "makeRequestStream: ", ecj.b(bArr2) + ecj.b(bArrC));
        return bArr3;
    }

    private byte[] b(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "getCoapFrame payload is null!");
            return this.f32683a;
        }
        String str = this.m;
        if (str == null || this.l == null) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "getCoapFrame para is wroing!");
            return this.f32683a;
        }
        int length = str.getBytes(Charset.forName("UTF-8")).length;
        if (length > 16) {
            dyg.c(true, "CoapIdentifyCodeBuilder", "mSessId.len is wrong!");
            return this.f32683a;
        }
        if (length >= 13) {
            bArr2 = new byte[length + 4];
            bArr3 = new byte[]{-19, 6, -25, (byte) (length - 13)};
        } else {
            bArr2 = new byte[length + 3];
            bArr3 = new byte[]{(byte) (length | 224), 6, -25};
        }
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(this.m.getBytes(Charset.forName("UTF-8")), 0, bArr2, bArr3.length, length);
        String hexString = Long.toHexString(this.l.longValue() + 1);
        if (hexString.length() % 2 != 0) {
            hexString = "0" + hexString;
        }
        int length2 = hexString.length() / 2;
        byte[] bArr4 = new byte[length2 + 2];
        byte[] bArrC = ecj.c("5" + String.valueOf(length2));
        byte[] bArrC2 = ecj.c(hexString);
        if (bArrC.length != 0 && bArrC2.length != 0) {
            System.arraycopy(bArrC, 0, bArr4, 0, bArrC.length);
            System.arraycopy(bArrC2, 0, bArr4, bArrC.length, length2);
        }
        bArr4[length2 + 1] = -1;
        this.g = ecj.d(2);
        this.n = ecj.d(3);
        return a(bArr2, bArr4, bArr);
    }

    private byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = this.e;
        byte[] bArr5 = new byte[bArr4.length + this.g.length + this.n.length + this.d.length + this.f32684b.length + bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        byte[] bArr6 = this.g;
        System.arraycopy(bArr6, 0, bArr5, this.e.length, bArr6.length);
        byte[] bArr7 = this.n;
        System.arraycopy(bArr7, 0, bArr5, this.e.length + this.g.length, bArr7.length);
        byte[] bArr8 = this.d;
        System.arraycopy(bArr8, 0, bArr5, this.e.length + this.g.length + this.n.length, bArr8.length);
        byte[] bArr9 = this.f32684b;
        System.arraycopy(bArr9, 0, bArr5, this.e.length + this.g.length + this.n.length + this.d.length, bArr9.length);
        System.arraycopy(bArr, 0, bArr5, this.e.length + this.g.length + this.n.length + this.d.length + this.f32684b.length, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, this.e.length + this.g.length + this.n.length + this.d.length + this.f32684b.length + bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, this.e.length + this.g.length + this.n.length + this.d.length + this.f32684b.length + bArr.length + bArr2.length, bArr3.length);
        dyg.e(true, "CoapIdentifyCodeBuilder", "macCant = ", ecj.b(bArr5));
        return bArr5;
    }

    public String a() {
        return this.m;
    }

    public Long c() {
        return this.l;
    }

    public byte[] e() {
        byte[] bArr = this.n;
        return bArr == null ? this.f32683a : (byte[]) bArr.clone();
    }

    public byte[] d() {
        byte[] bArr = this.g;
        return bArr == null ? this.f32683a : (byte[]) bArr.clone();
    }
}
