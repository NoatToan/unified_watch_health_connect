package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class c5 implements l8 {

    static abstract /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16026a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f16026a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16026a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16026a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16026a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16026a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16026a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16026a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16026a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16026a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16026a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16026a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16026a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16026a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x020c A[Catch: Exception -> 0x01f9, IllegalArgumentException -> 0x01fc, OutOfMemoryError -> 0x01ff, TryCatch #2 {OutOfMemoryError -> 0x01ff, blocks: (B:106:0x0129, B:109:0x012f, B:111:0x0133, B:113:0x0151, B:116:0x0158, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:128:0x01bb, B:133:0x01dc, B:129:0x01cb, B:131:0x01d1, B:132:0x01d7, B:134:0x01df, B:135:0x01e2, B:146:0x020c, B:149:0x0220, B:153:0x0232, B:155:0x0238, B:157:0x0243, B:156:0x023e, B:158:0x0246, B:159:0x0249, B:167:0x027b, B:168:0x0282, B:170:0x028a), top: B:188:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x0220 A[Catch: Exception -> 0x01f9, IllegalArgumentException -> 0x01fc, OutOfMemoryError -> 0x01ff, TryCatch #2 {OutOfMemoryError -> 0x01ff, blocks: (B:106:0x0129, B:109:0x012f, B:111:0x0133, B:113:0x0151, B:116:0x0158, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:128:0x01bb, B:133:0x01dc, B:129:0x01cb, B:131:0x01d1, B:132:0x01d7, B:134:0x01df, B:135:0x01e2, B:146:0x020c, B:149:0x0220, B:153:0x0232, B:155:0x0238, B:157:0x0243, B:156:0x023e, B:158:0x0246, B:159:0x0249, B:167:0x027b, B:168:0x0282, B:170:0x028a), top: B:188:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232 A[Catch: Exception -> 0x01f9, IllegalArgumentException -> 0x01fc, OutOfMemoryError -> 0x01ff, TryCatch #2 {OutOfMemoryError -> 0x01ff, blocks: (B:106:0x0129, B:109:0x012f, B:111:0x0133, B:113:0x0151, B:116:0x0158, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:128:0x01bb, B:133:0x01dc, B:129:0x01cb, B:131:0x01d1, B:132:0x01d7, B:134:0x01df, B:135:0x01e2, B:146:0x020c, B:149:0x0220, B:153:0x0232, B:155:0x0238, B:157:0x0243, B:156:0x023e, B:158:0x0246, B:159:0x0249, B:167:0x027b, B:168:0x0282, B:170:0x028a), top: B:188:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0238 A[Catch: Exception -> 0x01f9, IllegalArgumentException -> 0x01fc, OutOfMemoryError -> 0x01ff, TryCatch #2 {OutOfMemoryError -> 0x01ff, blocks: (B:106:0x0129, B:109:0x012f, B:111:0x0133, B:113:0x0151, B:116:0x0158, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:128:0x01bb, B:133:0x01dc, B:129:0x01cb, B:131:0x01d1, B:132:0x01d7, B:134:0x01df, B:135:0x01e2, B:146:0x020c, B:149:0x0220, B:153:0x0232, B:155:0x0238, B:157:0x0243, B:156:0x023e, B:158:0x0246, B:159:0x0249, B:167:0x027b, B:168:0x0282, B:170:0x028a), top: B:188:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x023e A[Catch: Exception -> 0x01f9, IllegalArgumentException -> 0x01fc, OutOfMemoryError -> 0x01ff, TryCatch #2 {OutOfMemoryError -> 0x01ff, blocks: (B:106:0x0129, B:109:0x012f, B:111:0x0133, B:113:0x0151, B:116:0x0158, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:128:0x01bb, B:133:0x01dc, B:129:0x01cb, B:131:0x01d1, B:132:0x01d7, B:134:0x01df, B:135:0x01e2, B:146:0x020c, B:149:0x0220, B:153:0x0232, B:155:0x0238, B:157:0x0243, B:156:0x023e, B:158:0x0246, B:159:0x0249, B:167:0x027b, B:168:0x0282, B:170:0x028a), top: B:188:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0270  */
    /* JADX WARN: Code duplicated, block: B:170:0x028a A[Catch: Exception -> 0x01f9, IllegalArgumentException -> 0x01fc, OutOfMemoryError -> 0x01ff, TRY_LEAVE, TryCatch #2 {OutOfMemoryError -> 0x01ff, blocks: (B:106:0x0129, B:109:0x012f, B:111:0x0133, B:113:0x0151, B:116:0x0158, B:120:0x01ab, B:122:0x01af, B:124:0x01b3, B:126:0x01b7, B:128:0x01bb, B:133:0x01dc, B:129:0x01cb, B:131:0x01d1, B:132:0x01d7, B:134:0x01df, B:135:0x01e2, B:146:0x020c, B:149:0x0220, B:153:0x0232, B:155:0x0238, B:157:0x0243, B:156:0x023e, B:158:0x0246, B:159:0x0249, B:167:0x027b, B:168:0x0282, B:170:0x028a), top: B:188:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0294  */
    /* JADX WARN: Code duplicated, block: B:174:0x0299  */
    /* JADX WARN: Code duplicated, block: B:37:0x0057  */
    public Bitmap a(String str, int i, int i2, int i3, HmsBuildBitmapOption hmsBuildBitmapOption) throws WriterException {
        int i4;
        BarcodeFormat barcodeFormat;
        BarcodeFormat barcodeFormat2;
        BarcodeFormat barcodeFormat3;
        boolean z;
        BarcodeFormat barcodeFormat4;
        BarcodeFormat barcodeFormat5;
        s sVarA;
        int iD;
        int iB;
        int[] iArr;
        int i5;
        Bitmap bitmapCreateBitmap;
        float f;
        Bitmap bitmapA;
        int i6;
        Bundle bundleA = com.huawei.hms.hmsscankit.f.a(str, i, i2, i3, hmsBuildBitmapOption);
        if (i2 > 0 && i3 > 0 && i2 <= 5120 && i3 <= 5120) {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 2953) {
                    int i7 = HmsScanBase.QRCODE_SCAN_TYPE;
                    if (i == i7) {
                        i4 = 1;
                    } else if (i == HmsScanBase.PDF417_SCAN_TYPE) {
                        i4 = i2 / 30;
                    } else if (i == HmsScanBase.EAN13_SCAN_TYPE || i == HmsScanBase.EAN8_SCAN_TYPE || i == HmsScanBase.CODE39_SCAN_TYPE || i == HmsScanBase.CODE93_SCAN_TYPE || i == HmsScanBase.CODE128_SCAN_TYPE || i == HmsScanBase.CODABAR_SCAN_TYPE || i == HmsScanBase.ITF14_SCAN_TYPE || i == HmsScanBase.UPCCODE_A_SCAN_TYPE || i == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
                        i4 = 6;
                    } else {
                        i4 = 1;
                    }
                    b3 b3Var = b3.L;
                    String string = b3Var.toString();
                    int i8 = -16777216;
                    int i9 = -197381;
                    if (hmsBuildBitmapOption != null) {
                        int i10 = hmsBuildBitmapOption.margin;
                        if (i10 != 1) {
                            i4 = i10;
                        }
                        int i11 = hmsBuildBitmapOption.bimapColor;
                        i8 = i11 != -1 ? i11 : -16777216;
                        int i12 = hmsBuildBitmapOption.bitmapBackgroundColor;
                        i9 = i12 != -1 ? i12 : -197381;
                        HmsBuildBitmapOption.ErrorCorrectionLevel errorCorrectionLevel = hmsBuildBitmapOption.QRErrorCorrection;
                        string = errorCorrectionLevel == null ? b3Var.toString() : errorCorrectionLevel.value;
                    }
                    int i13 = i9;
                    int i14 = i8;
                    int i15 = i4;
                    Hashtable hashtable = new Hashtable();
                    hashtable.put(u2.CHARACTER_SET, "utf-8");
                    hashtable.put(u2.MARGIN, Integer.valueOf(i15));
                    try {
                        try {
                            try {
                                if (i == HmsScanBase.AZTEC_SCAN_TYPE) {
                                    barcodeFormat = BarcodeFormat.AZTEC;
                                } else if (i == HmsScanBase.DATAMATRIX_SCAN_TYPE) {
                                    barcodeFormat = BarcodeFormat.DATA_MATRIX;
                                } else {
                                    if (i == HmsScanBase.PDF417_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.PDF_417;
                                        hashtable.put(u2.ERROR_CORRECTION, 2);
                                    } else if (i == i7) {
                                        barcodeFormat = BarcodeFormat.QR_CODE;
                                        hashtable.put(u2.ERROR_CORRECTION, string);
                                    } else if (i == HmsScanBase.CODABAR_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.CODABAR;
                                    } else if (i == HmsScanBase.CODE39_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.CODE_39;
                                    } else if (i == HmsScanBase.CODE93_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.CODE_93;
                                    } else if (i == HmsScanBase.CODE128_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.CODE_128;
                                    } else if (i == HmsScanBase.EAN8_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.EAN_8;
                                    } else if (i == HmsScanBase.EAN13_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.EAN_13;
                                    } else if (i == HmsScanBase.ITF14_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.ITF;
                                    } else if (i == HmsScanBase.UPCCODE_A_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.UPC_A;
                                    } else if (i == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
                                        barcodeFormat2 = BarcodeFormat.UPC_E;
                                    } else {
                                        barcodeFormat = BarcodeFormat.QR_CODE;
                                        hashtable.put(u2.ERROR_CORRECTION, string);
                                    }
                                    barcodeFormat3 = barcodeFormat2;
                                    z = true;
                                    if (hmsBuildBitmapOption == null && hmsBuildBitmapOption.logoBitmap != null && barcodeFormat3 != BarcodeFormat.QR_CODE) {
                                        throw new WriterException("Non-QR code should not contains logos");
                                    }
                                    if (barcodeFormat3 != BarcodeFormat.QR_CODE && hmsBuildBitmapOption != null && hmsBuildBitmapOption.logoBitmap != null) {
                                        hashtable.put(u2.ERROR_CORRECTION, b3.H.toString());
                                        hashtable.put(u2.LOGO, Boolean.TRUE);
                                        s sVarA2 = a(str, barcodeFormat3, i2, i3, hashtable);
                                        if (sVarA2 == null) {
                                            return null;
                                        }
                                        int iD2 = (sVarA2.d() - (i15 * 2)) / 8;
                                        int iD3 = sVarA2.d() / 2;
                                        int iB2 = sVarA2.b() / 2;
                                        Matrix matrix = new Matrix();
                                        float f2 = iD2 * 2.0f;
                                        matrix.setScale(f2 / hmsBuildBitmapOption.logoBitmap.getWidth(), f2 / hmsBuildBitmapOption.logoBitmap.getHeight());
                                        Bitmap bitmap = hmsBuildBitmapOption.logoBitmap;
                                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), hmsBuildBitmapOption.logoBitmap.getHeight(), matrix, false);
                                        int[] iArr2 = new int[i2 * i2];
                                        for (int i16 = 0; i16 < i2; i16++) {
                                            for (int i17 = 0; i17 < i2; i17++) {
                                                if (i17 > iD3 - iD2 && i17 < iD3 + iD2 && i16 > iB2 - iD2 && i16 < iB2 + iD2) {
                                                    iArr2[(i16 * i2) + i17] = bitmapCreateBitmap2.getPixel((i17 - iD3) + iD2, (i16 - iB2) + iD2);
                                                } else if (sVarA2.b(i17, i16)) {
                                                    iArr2[(i16 * i2) + i17] = i14;
                                                } else {
                                                    iArr2[(i16 * i2) + i17] = i13;
                                                }
                                            }
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.setPixels(iArr2, 0, i2, 0, 0, i2, i2);
                                    } else {
                                        sVarA = a(str, barcodeFormat3, i2, i3, hashtable);
                                        if (sVarA == null) {
                                            return null;
                                        }
                                        iD = sVarA.d();
                                        iB = sVarA.b();
                                        iArr = new int[iD * iB];
                                        for (i5 = 0; i5 < iB; i5++) {
                                            for (i6 = 0; i6 < iD; i6++) {
                                                if (sVarA.b(i6, i5)) {
                                                    iArr[(i5 * iD) + i6] = i14;
                                                } else {
                                                    iArr[(i5 * iD) + i6] = i13;
                                                }
                                            }
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(iD, iB, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.setPixels(iArr, 0, iD, 0, 0, iD, iB);
                                        float f3 = iD;
                                        f = f3 / i2;
                                        float f4 = iB;
                                        float f5 = f4 / i3;
                                        if (f == 1.0f && f5 != 1.0f && z) {
                                            if (f > f5) {
                                                bitmapA = w7.a(bitmapCreateBitmap, i2, (int) (f4 / f));
                                            } else {
                                                bitmapA = w7.a(bitmapCreateBitmap, (int) (f3 / f5), i3);
                                            }
                                            bitmapCreateBitmap = bitmapA;
                                        } else {
                                            o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                                        }
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        com.huawei.hms.hmsscankit.f.a(0, bitmapCreateBitmap, bundleA);
                                        return bitmapCreateBitmap;
                                    }
                                    com.huawei.hms.hmsscankit.f.a(-1015, bitmapCreateBitmap, bundleA);
                                    return bitmapCreateBitmap;
                                }
                                if (barcodeFormat3 != BarcodeFormat.QR_CODE) {
                                    sVarA = a(str, barcodeFormat3, i2, i3, hashtable);
                                    if (sVarA == null) {
                                        return null;
                                    }
                                    iD = sVarA.d();
                                    iB = sVarA.b();
                                    iArr = new int[iD * iB];
                                    while (i5 < iB) {
                                        while (i6 < iD) {
                                            if (sVarA.b(i6, i5)) {
                                                iArr[(i5 * iD) + i6] = i14;
                                            } else {
                                                iArr[(i5 * iD) + i6] = i13;
                                            }
                                        }
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(iD, iB, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.setPixels(iArr, 0, iD, 0, 0, iD, iB);
                                    float f6 = iD;
                                    f = f6 / i2;
                                    float f7 = iB;
                                    float f8 = f7 / i3;
                                    if (f == 1.0f) {
                                        o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                                    } else {
                                        o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                                    }
                                } else {
                                    sVarA = a(str, barcodeFormat3, i2, i3, hashtable);
                                    if (sVarA == null) {
                                        return null;
                                    }
                                    iD = sVarA.d();
                                    iB = sVarA.b();
                                    iArr = new int[iD * iB];
                                    while (i5 < iB) {
                                        while (i6 < iD) {
                                            if (sVarA.b(i6, i5)) {
                                                iArr[(i5 * iD) + i6] = i14;
                                            } else {
                                                iArr[(i5 * iD) + i6] = i13;
                                            }
                                        }
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(iD, iB, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.setPixels(iArr, 0, iD, 0, 0, iD, iB);
                                    float f9 = iD;
                                    f = f9 / i2;
                                    float f10 = iB;
                                    float f11 = f10 / i3;
                                    if (f == 1.0f) {
                                        o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                                    } else {
                                        o4.a("MultiFormatWriter", "wMultiple == 1f || hMultiple == 1f || !reFormFlag");
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    com.huawei.hms.hmsscankit.f.a(0, bitmapCreateBitmap, bundleA);
                                    return bitmapCreateBitmap;
                                }
                                com.huawei.hms.hmsscankit.f.a(-1015, bitmapCreateBitmap, bundleA);
                                return bitmapCreateBitmap;
                            } catch (IllegalArgumentException e) {
                                e = e;
                                com.huawei.hms.hmsscankit.f.a(-1016, (Bitmap) null, bundleA);
                                throw new WriterException(e.getMessage(), barcodeFormat5.toString());
                            } catch (Exception e2) {
                                e = e2;
                                com.huawei.hms.hmsscankit.f.a(-1013, (Bitmap) null, bundleA);
                                throw new WriterException(e.getMessage(), barcodeFormat4.toString());
                            }
                        } catch (OutOfMemoryError e3) {
                            com.huawei.hms.hmsscankit.f.a(-1014, (Bitmap) null, bundleA);
                            throw new WriterException(e3.getMessage());
                        }
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        barcodeFormat5 = barcodeFormat3;
                    } catch (Exception e5) {
                        e = e5;
                        barcodeFormat4 = barcodeFormat3;
                    }
                    barcodeFormat3 = barcodeFormat;
                    z = false;
                    if (hmsBuildBitmapOption == null) {
                    }
                } else {
                    com.huawei.hms.hmsscankit.f.a(-1012, (Bitmap) null, bundleA);
                    throw new WriterException("IllegalArgumentException:contents.length > 2953");
                }
            } else {
                com.huawei.hms.hmsscankit.f.a(-1011, (Bitmap) null, bundleA);
                throw new WriterException("Content is empty");
            }
        } else {
            com.huawei.hms.hmsscankit.f.a(-1010, (Bitmap) null, bundleA);
            throw new WriterException("IllegalArgumentException:width & height should >0 & <5120");
        }
    }

    @Override // com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        l8 r2Var;
        switch (a.f16026a[barcodeFormat.ordinal()]) {
            case 1:
                r2Var = new r2();
                break;
            case 2:
                r2Var = new t7();
                break;
            case 3:
                r2Var = new p2();
                break;
            case 4:
                r2Var = new m7();
                break;
            case 5:
                r2Var = new k6();
                break;
            case 6:
                r2Var = new u0();
                break;
            case 7:
                r2Var = new w0();
                break;
            case 8:
                r2Var = new s0();
                break;
            case 9:
                r2Var = new k4();
                break;
            case 10:
                r2Var = new u5();
                break;
            case 11:
                r2Var = new q0();
                break;
            case 12:
                r2Var = new k1();
                break;
            case 13:
                r2Var = new i();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + barcodeFormat);
        }
        return r2Var.a(str, barcodeFormat, i, i2, map);
    }
}
