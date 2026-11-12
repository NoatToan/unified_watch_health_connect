package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f16044a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16045b = 0;

    public void a(boolean z, byte[] bArr, int i, int i2, int i3, boolean z2) {
        float[] fArrMultiBarcodeDetect = LoadOpencvJNIUtil.multiBarcodeDetect(bArr, i, i2, i3, z2);
        if (fArrMultiBarcodeDetect != null) {
            this.f16045b = fArrMultiBarcodeDetect.length / 10;
        } else {
            this.f16045b = 0;
        }
        for (int i4 = 0; i4 < this.f16045b; i4++) {
            int i5 = i4 * 10;
            if (w7.a(fArrMultiBarcodeDetect, i5)) {
                int i6 = i5 + 1;
                if (w7.a(fArrMultiBarcodeDetect, i6)) {
                    int i7 = i5 + 2;
                    if (w7.a(fArrMultiBarcodeDetect, i7)) {
                        int i8 = i5 + 3;
                        if (w7.a(fArrMultiBarcodeDetect, i8)) {
                            int i9 = i5 + 4;
                            if (w7.a(fArrMultiBarcodeDetect, i9)) {
                                int i10 = i5 + 5;
                                if (w7.a(fArrMultiBarcodeDetect, i10)) {
                                    int i11 = i5 + 6;
                                    if (w7.a(fArrMultiBarcodeDetect, i11)) {
                                        int i12 = i5 + 7;
                                        if (w7.a(fArrMultiBarcodeDetect, i12)) {
                                            int i13 = i5 + 8;
                                            if (w7.a(fArrMultiBarcodeDetect, i13)) {
                                                int i14 = i5 + 9;
                                                if (w7.a(fArrMultiBarcodeDetect, i14)) {
                                                    this.f16044a.add(new j2(z, fArrMultiBarcodeDetect[i5], fArrMultiBarcodeDetect[i6], fArrMultiBarcodeDetect[i7], fArrMultiBarcodeDetect[i8], fArrMultiBarcodeDetect[i9], fArrMultiBarcodeDetect[i10], fArrMultiBarcodeDetect[i11], fArrMultiBarcodeDetect[i12], fArrMultiBarcodeDetect[i13], fArrMultiBarcodeDetect[i14]));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
