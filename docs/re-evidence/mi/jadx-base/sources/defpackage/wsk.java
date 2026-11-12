package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class wsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f38319b;
    public final int c;
    public atk[] d;
    public final BarcodeFormat e;
    public Map<ResultMetadataType, Object> f;
    public final long g;

    public wsk(String str, byte[] bArr, atk[] atkVarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, atkVarArr, barcodeFormat, j);
    }

    public void a(atk[] atkVarArr) {
        atk[] atkVarArr2 = this.d;
        if (atkVarArr2 == null) {
            this.d = atkVarArr;
            return;
        }
        if (atkVarArr == null || atkVarArr.length <= 0) {
            return;
        }
        atk[] atkVarArr3 = new atk[atkVarArr2.length + atkVarArr.length];
        System.arraycopy(atkVarArr2, 0, atkVarArr3, 0, atkVarArr2.length);
        System.arraycopy(atkVarArr, 0, atkVarArr3, atkVarArr2.length, atkVarArr.length);
        this.d = atkVarArr3;
    }

    public BarcodeFormat b() {
        return this.e;
    }

    public byte[] c() {
        return this.f38319b;
    }

    public Map<ResultMetadataType, Object> d() {
        return this.f;
    }

    public atk[] e() {
        return this.d;
    }

    public String f() {
        return this.f38318a;
    }

    public void g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f;
            if (map2 == null) {
                this.f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f == null) {
            this.f = new EnumMap(ResultMetadataType.class);
        }
        this.f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f38318a;
    }

    public wsk(String str, byte[] bArr, atk[] atkVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, atkVarArr, barcodeFormat, System.currentTimeMillis());
    }

    public wsk(String str, byte[] bArr, int i, atk[] atkVarArr, BarcodeFormat barcodeFormat, long j) {
        this.f38318a = str;
        this.f38319b = bArr;
        this.c = i;
        this.d = atkVarArr;
        this.e = barcodeFormat;
        this.f = null;
        this.g = j;
    }
}
