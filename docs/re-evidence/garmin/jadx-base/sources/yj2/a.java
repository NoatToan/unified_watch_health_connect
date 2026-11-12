package yj2;

import am.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Pair;
import bj2.d;
import com.garmin.connectiq.common.devices.DeviceException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f197578b = LoggerFactory.getLogger("CIQReq#ConnectIQBufferedImage");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f197579a;

    /* JADX INFO: renamed from: yj2.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C3703a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197580a;

        static {
            int[] iArr = new int[ut2.a.b.valuesCustom().length];
            f197580a = iArr;
            try {
                iArr[ut2.a.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f197580a[ut2.a.b.FLOYD_STEINBERG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(Bitmap bitmap) {
        this.f197579a = bitmap;
    }

    public static Bitmap a(String str, OkHttpClient okHttpClient) {
        Logger logger = f197578b;
        Call callNewCall = okHttpClient.newCall(new Request.Builder().url(str).build());
        AutoCloseable autoCloseable = null;
        try {
            try {
                Response responseExecute = callNewCall.execute();
                if (responseExecute == null) {
                    throw new IOException("null response object");
                }
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody == null) {
                    throw new IOException("null response body object");
                }
                byte[] bArrBytes = responseBodyBody.bytes();
                int length = bArrBytes.length;
                long contentLength = responseBodyBody.getContentLength();
                logger.debug("actual length: " + length + ", content length:" + contentLength);
                if (contentLength > 0 && length != contentLength) {
                    throw new IOException("Length mismatch, corrupted file?");
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
                responseExecute.close();
                return bitmapDecodeByteArray;
            } catch (IOException e4) {
                logger.error("downloadImage", (Throwable) e4);
                throw e4;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th3;
        }
    }

    public static Pair b(OkHttpClient okHttpClient, String str, String str2, String str3, int i14, int i15, ut2.a.C3225a[] c3225aArr, ut2.a.b bVar, int i16, long j8) {
        AutoCloseable autoCloseable = null;
        try {
            HttpUrl.Builder builderAddEncodedQueryParameter = new HttpUrl.Builder().scheme("https").host(str).addEncodedPathSegments("image-service/v2/ciq/image").addEncodedQueryParameter("applicationId", str2).addEncodedQueryParameter("partNumber", String.valueOf(i16)).addEncodedQueryParameter("unitId", String.valueOf(j8)).addQueryParameter("url", str3).addEncodedQueryParameter("compress", String.valueOf(true));
            if (i14 > 0 && i15 > 0) {
                builderAddEncodedQueryParameter.addEncodedQueryParameter("maxWidth", String.valueOf(i14)).addEncodedQueryParameter("maxHeight", String.valueOf(i15));
            }
            if (c3225aArr != null && c3225aArr.length > 0) {
                for (ut2.a.C3225a c3225a : c3225aArr) {
                    builderAddEncodedQueryParameter.addEncodedQueryParameter("palette", c3225a.toString());
                }
            }
            if (bVar != null) {
                builderAddEncodedQueryParameter.addEncodedQueryParameter("dithering", C3703a.f197580a[bVar.ordinal()] != 1 ? "FLOYD_STEINBERG" : "NONE");
            }
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(builderAddEncodedQueryParameter.build()).build()).execute();
            if (responseExecute == null) {
                throw new IOException("null response object");
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody == null) {
                throw new IOException("null response body object");
            }
            Pair pair = new Pair(responseBodyBody.bytes(), Integer.valueOf(Integer.parseInt(responseExecute.header("original-image-size"))));
            responseExecute.close();
            return pair;
        } catch (Throwable th3) {
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x0453  */
    /* JADX WARN: Code duplicated, block: B:200:0x0456  */
    /* JADX WARN: Code duplicated, block: B:202:0x0459  */
    /* JADX WARN: Code duplicated, block: B:203:0x045b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0468  */
    /* JADX WARN: Code duplicated, block: B:209:0x0480 A[LOOP:2: B:207:0x0476->B:209:0x0480, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x048c  */
    /* JADX WARN: Code duplicated, block: B:216:0x049e  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:224:0x04af  */
    /* JADX WARN: Code duplicated, block: B:228:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:234:0x04ee A[LOOP:11: B:231:0x04e6->B:234:0x04ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x04ff A[LOOP:10: B:229:0x04cf->B:235:0x04ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x0521  */
    /* JADX WARN: Code duplicated, block: B:239:0x0523  */
    /* JADX WARN: Code duplicated, block: B:242:0x052c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x0553  */
    /* JADX WARN: Code duplicated, block: B:251:0x0557  */
    /* JADX WARN: Code duplicated, block: B:254:0x0561  */
    /* JADX WARN: Code duplicated, block: B:256:0x0567  */
    /* JADX WARN: Code duplicated, block: B:257:0x0573  */
    /* JADX WARN: Code duplicated, block: B:259:0x0578  */
    /* JADX WARN: Code duplicated, block: B:261:0x057e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0585 A[LOOP:7: B:262:0x057f->B:264:0x0585, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:267:0x059c A[LOOP:3: B:212:0x0490->B:267:0x059c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:330:0x0595 A[SYNTHETIC] */
    public static byte[] d(Context context, a aVar, int i14, ut2.a.C3225a[] c3225aArr, ut2.a.b bVar) throws Exception {
        bj2.b bVar2;
        ut2.a.C3225a[] c3225aArr2;
        int i15;
        ut2.a.d[] dVarArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        ut2.a.d[] dVarArr2;
        ut2.a.c cVar;
        boolean z14;
        ut2.a.c cVar2;
        int[][] iArr;
        int[][] iArr2;
        int i25;
        int i26;
        int i27;
        int length;
        int length2;
        DataOutputStream dataOutputStream;
        int i28;
        int i29;
        int iMax;
        int i30;
        byte[] byteArray;
        int i34;
        ArrayList<Byte> arrayList;
        int length3;
        int i35;
        byte[] bArr;
        Iterator<Byte> it;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        DataOutputStream dataOutputStream2;
        int length4;
        int i54;
        int iG;
        ut2.a.C3225a c3225aB;
        int i55;
        int i56;
        int i57;
        int i58;
        Logger logger = f197578b;
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("connectiq_devices.xml");
            d dVar = new d();
            HashMap map = dVar.f18374b;
            dVar.c(fileInputStreamOpenFileInput);
            String str = (String) map.get(Integer.valueOf(i14));
            if (str == null) {
                logger.debug("using fallback product nbr [2544 to format image...");
                str = (String) map.get(2544);
            }
            if (str == null) {
                throw new DeviceException("Part number not found:" + i14);
            }
            bVar2 = (bj2.b) dVar.f18373a.get(str);
            if (bVar2 == null) {
                throw new DeviceException(j.h(i14, "Part number not found:"));
            }
            new ut2.a();
            ut2.a.b bVar3 = bVar == null ? ut2.a.b.FLOYD_STEINBERG : bVar;
            EnumSet<ut2.a.e> enumSet = ut2.a.e.f172624c;
            int i59 = bVar2.f18355d;
            List<bj2.b.C0267b> list = bVar2.f18354c;
            int i64 = 0;
            if (list == null) {
                c3225aArr2 = null;
            } else {
                c3225aArr2 = new ut2.a.C3225a[list.size()];
                int i65 = 0;
                while (i65 < list.size()) {
                    bj2.b.C0267b c0267b = list.get(i65);
                    c3225aArr2[i65] = new ut2.a.C3225a(c0267b.f18359b, c0267b.f18360c, c0267b.f18361d, c0267b.f18358a);
                    i65++;
                    i64 = i64;
                    i59 = i59;
                }
            }
            ut2.a.C3225a[] c3225aArrB = ut2.a.b(c3225aArr2);
            bj2.b.d dVar2 = bVar2.f18356e;
            ut2.a.C3225a[] c3225aArrB2 = ut2.a.b(c3225aArr);
            int i66 = (c3225aArrB2 == null || c3225aArrB2.length == 0) ? 1 : i64;
            if (c3225aArrB == null || c3225aArrB.length == 0) {
                i15 = 1;
                if (i66 == 0) {
                    ut2.a.d[] dVarArr3 = new ut2.a.d[c3225aArrB2.length];
                    for (int i67 = 0; i67 < c3225aArrB2.length; i67++) {
                        dVarArr3[i67] = new ut2.a.d(c3225aArrB2[i67], i67, c3225aArrB2[i67].b(i59), c3225aArrB2[i67].g(i59, false));
                    }
                    dVarArr = dVarArr3;
                } else {
                    dVarArr = null;
                }
            } else {
                if (i66 != 0) {
                    ut2.a.d[] dVarArr4 = new ut2.a.d[c3225aArrB.length];
                    for (int i68 = i64; i68 < c3225aArrB.length; i68++) {
                        ut2.a.C3225a c3225a = c3225aArrB[i68];
                        dVarArr4[i68] = new ut2.a.d(c3225a, i68, c3225a, i68);
                    }
                    dVarArr = dVarArr4;
                } else {
                    ut2.a.d[] dVarArr5 = new ut2.a.d[c3225aArrB2.length];
                    for (int i69 = i64; i69 < c3225aArrB2.length; i69++) {
                        ut2.a.C3225a c3225a2 = c3225aArrB2[i69];
                        ut2.a.C3225a c3225a3 = c3225aArrB[i64];
                        int length5 = c3225aArrB.length;
                        int i74 = i64;
                        int i75 = i74;
                        int i76 = i75;
                        while (i75 < length5) {
                            ut2.a.C3225a c3225a4 = c3225aArrB[i75];
                            ut2.a.C3225a[] c3225aArr3 = c3225aArrB;
                            if (c3225a4.c(c3225a2) < c3225a3.c(c3225a2)) {
                                c3225a3 = c3225a4;
                                i74 = i76;
                            }
                            i76++;
                            i75++;
                            c3225aArrB = c3225aArr3;
                            i64 = 0;
                        }
                        dVarArr5[i69] = new ut2.a.d(c3225aArrB2[i69], i69, c3225aArrB[i74], i74);
                    }
                    dVarArr = dVarArr5;
                }
                i15 = 1;
            }
            int i77 = 2;
            if (dVarArr != null) {
                int length6 = dVarArr.length + (!enumSet.contains(ut2.a.e.DISABLE_TRANSPARENCY) ? 1 : 0);
                if (length6 == 0) {
                    throw new InvalidParameterException("A usable palette could not be determined.");
                }
                if (length6 > 256) {
                    throw new InvalidParameterException("Invalid bits per pixel value.");
                }
                if (length6 <= 2) {
                    i58 = i15;
                } else {
                    i58 = 4;
                    if (length6 <= 4) {
                        i58 = 2;
                    } else if (length6 > 16) {
                        i58 = (length6 > 256 && length6 <= 65537) ? 16 : 8;
                    }
                }
                i16 = length6;
                i59 = i58;
            } else {
                i16 = i15 << i59;
            }
            if (i59 > 8) {
                bVar3 = ut2.a.b.NONE;
            }
            if (!enumSet.contains(ut2.a.e.DISABLE_TRANSPARENCY)) {
                if (dVarArr == null) {
                    i17 = -1;
                    break;
                }
                i17 = 0;
                while (true) {
                    if (i17 >= dVarArr.length) {
                        i17 = -1;
                        break;
                    }
                    if (dVarArr[i17].f172620c.e(i59)) {
                        break;
                    }
                    i17++;
                }
            } else {
                i17 = Integer.MAX_VALUE;
            }
            if (c3225aArrB2 == null || c3225aArrB2.length == 0) {
                i18 = 2;
                i19 = 8;
                i24 = i17;
                dVarArr2 = null;
            } else {
                dVarArr2 = new ut2.a.d[i16];
                int i78 = 0;
                while (i78 < dVarArr.length) {
                    dVarArr2[i78] = dVarArr[i78];
                    i78++;
                    i77 = i77;
                }
                ut2.a.e eVar = ut2.a.e.DISABLE_TRANSPARENCY;
                if (enumSet.contains(eVar)) {
                    i18 = i77;
                    i19 = 8;
                } else {
                    int i79 = i16 - 1;
                    i19 = 8;
                    i18 = i77;
                    dVarArr2[i79] = new ut2.a.d(new ut2.a.C3225a(255, 255, 255, 0), i79, new ut2.a.C3225a(255, 0, 255, 0), -1);
                    if (enumSet.contains(eVar)) {
                        i57 = Integer.MAX_VALUE;
                    } else {
                        i57 = 0;
                        while (true) {
                            if (i57 >= i16) {
                                i57 = -1;
                                break;
                            }
                            if (dVarArr2[i57].f172620c.e(i59)) {
                                break;
                            }
                            i57++;
                        }
                    }
                    i17 = i57 == -1 ? i79 : i57;
                }
                i24 = i17;
            }
            int[] iArr3 = ut2.a.f172604a;
            if (iArr3 == null) {
                iArr3 = new int[ut2.a.b.valuesCustom().length];
                try {
                    iArr3[ut2.a.b.FLOYD_STEINBERG.ordinal()] = i18;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr3[ut2.a.b.NONE.ordinal()] = i15;
                } catch (NoSuchFieldError unused2) {
                }
                ut2.a.f172604a = iArr3;
            }
            int i84 = iArr3[bVar3.ordinal()];
            Class cls = Integer.TYPE;
            if (i84 != i15) {
                int i85 = i18;
                if (i84 != i85) {
                    cVar2 = null;
                } else {
                    int[] iArr4 = new int[i85];
                    int[] iArr5 = new int[i85];
                    int[] iArr6 = {aVar.f197579a.getWidth(), aVar.f197579a.getHeight()};
                    ut2.b bVar4 = new ut2.b(dVar2, iArr6[0], iArr6[1]);
                    bVar4.c(iArr6, iArr4);
                    int i86 = iArr4[0];
                    int i87 = iArr4[1];
                    int i88 = (i86 * i59) % 32;
                    int iFloor = i88 != 0 ? (int) (Math.floor((32 - i88) / i59) + ((double) i86)) : i86;
                    ut2.a.C3225a[][] c3225aArr4 = (ut2.a.C3225a[][]) Array.newInstance((Class<?>) ut2.a.C3225a.class, i87, i86);
                    int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) cls, i87, iFloor);
                    int i89 = 0;
                    while (i89 < i87) {
                        int i93 = i87;
                        int i94 = i86;
                        int i95 = 0;
                        while (i95 < i94) {
                            iArr4[0] = i95;
                            iArr4[1] = i89;
                            bVar4.b(iArr4, iArr5);
                            int i96 = i95;
                            c3225aArr4[i89][i96] = new ut2.a.C3225a(aVar.f197579a.getPixel(iArr5[0], iArr5[1]));
                            i95 = i96 + 1;
                            iArr4 = iArr4;
                            i59 = i59;
                        }
                        i89++;
                        i86 = i94;
                        i87 = i93;
                    }
                    int i97 = 0;
                    while (i97 < i87) {
                        int i98 = i87;
                        int i99 = i86;
                        int i100 = iFloor;
                        if (i24 != Integer.MAX_VALUE) {
                            for (int i101 = 0; i101 < i100; i101++) {
                                iArr7[i97][i101] = i24;
                            }
                        }
                        int i102 = 0;
                        while (i102 < i99) {
                            ut2.a.C3225a c3225a5 = c3225aArr4[i97][i102];
                            if (dVarArr != null) {
                                iG = ut2.a.a(c3225a5, dVarArr, i59);
                                c3225aB = dVarArr[iG].f172620c;
                            } else {
                                iG = c3225a5.g(i59, false);
                                c3225aB = c3225a5.b(i59);
                            }
                            if (!c3225a5.e(i59)) {
                                i55 = i100;
                                i56 = i102;
                                ut2.a.C3225a c3225a6 = new ut2.a.C3225a(c3225a5.f172605a - c3225aB.f172605a, c3225a5.f172606b - c3225aB.f172606b, c3225a5.f172607c - c3225aB.f172607c, c3225a5.f172608d - c3225aB.f172608d);
                                int i103 = i56 + 1;
                                if (i103 < i99) {
                                    ut2.a.C3225a[] c3225aArr5 = c3225aArr4[i97];
                                    c3225aArr5[i103] = c3225aArr5[i103].a(c3225a6.f(0.4375f));
                                }
                                int i104 = i97 + 1;
                                if (i104 < i98) {
                                    ut2.a.C3225a[] c3225aArr6 = c3225aArr4[i104];
                                    c3225aArr6[i56] = c3225aArr6[i56].a(c3225a6.f(0.3125f));
                                    int i105 = i56 - 1;
                                    if (i105 >= 0) {
                                        ut2.a.C3225a[] c3225aArr7 = c3225aArr4[i104];
                                        c3225aArr7[i105] = c3225aArr7[i105].a(c3225a6.f(0.1875f));
                                    }
                                    if (i103 < i99) {
                                        ut2.a.C3225a[] c3225aArr8 = c3225aArr4[i104];
                                        c3225aArr8[i103] = c3225aArr8[i103].a(c3225a6.f(0.0625f));
                                    }
                                }
                            } else {
                                if (i24 == Integer.MAX_VALUE) {
                                    q2.u("Transparency detected in source image while transparency is disabled.");
                                    return null;
                                }
                                i55 = i100;
                                i56 = i102;
                                iG = i24;
                            }
                            iArr7[i97][i56] = iG;
                            i102 = i56 + 1;
                            i100 = i55;
                        }
                        i97++;
                        iFloor = i100;
                        i86 = i99;
                        i87 = i98;
                    }
                    cVar = new ut2.a.c(i59, i86, i87, iFloor, iArr7, null);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream);
                int i106 = cVar2.f172615d;
                iArr = cVar2.f172616e;
                iArr2 = cVar2.f172617f;
                i25 = cVar2.f172614c;
                i26 = cVar2.f172613b;
                double d14 = i106;
                i27 = cVar2.f172612a;
                int iCeil = (int) Math.ceil(d14 / (8.0d / ((double) i27)));
                if (dVarArr2 != null) {
                    length = dVarArr2.length;
                } else {
                    length = 0;
                }
                if (dVarArr2 != null) {
                    length2 = dVarArr2.length;
                } else {
                    length2 = 0;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                if (length2 != 0) {
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    dataOutputStream2 = new DataOutputStream(byteArrayOutputStream3);
                    length4 = dVarArr2.length;
                    i54 = 0;
                    while (i54 < length4) {
                        int i107 = i54;
                        dataOutputStream2.writeInt(dVarArr2[i107].f172621d);
                        i54 = i107 + 1;
                    }
                    dataOutputStream.write(byteArrayOutputStream3.toByteArray());
                }
                i28 = 0;
                i29 = 0;
                while (i29 < i27) {
                    i28 |= 1 << i29;
                    i29++;
                    cVar2 = cVar2;
                    i19 = 8;
                }
                iMax = Math.max(i19 / i27, 1);
                i30 = 0;
                while (i30 < i25) {
                    i44 = 0;
                    while (i44 < cVar2.f172615d) {
                        if (i27 <= 8) {
                            i46 = 0;
                            for (i47 = 0; i47 < iMax; i47++) {
                                i48 = i46;
                                i49 = i44 + i47;
                                if (i49 < i26) {
                                    i46 = i48 | ((iArr[i30][i49] & i28) << (i47 * i27));
                                } else {
                                    i46 = i48;
                                }
                            }
                            dataOutputStream.writeByte(i46);
                        } else {
                            if (i27 % 8 == 0) {
                                h.C("Specified bpp/palette configuration not supported!");
                                return null;
                            }
                            for (i45 = 0; i45 < i27; i45 += 8) {
                                dataOutputStream.writeByte((iArr[i30][i44] >> i45) & 255);
                            }
                        }
                        i44 += iMax;
                        cVar2 = cVar2;
                    }
                    i30++;
                    i19 = 8;
                }
                if (iArr2 != null) {
                    for (i37 = 0; i37 < i25; i37++) {
                        for (i38 = 0; i38 < i26; i38++) {
                            if (iArr2 != null) {
                                i39 = iArr2[i37][i38];
                            } else {
                                i39 = 0;
                            }
                            dataOutputStream.writeByte(i39);
                        }
                    }
                }
                byteArray = byteArrayOutputStream2.toByteArray();
                if (enumSet.contains(ut2.a.e.COMPRESS)) {
                    aj2.a aVar2 = new aj2.a();
                    arrayList = new ArrayList<>(byteArray.length);
                    length3 = byteArray.length;
                    i35 = 0;
                    while (i35 < length3) {
                        arrayList.add(Byte.valueOf(byteArray[i35]));
                        i35++;
                        i19 = 8;
                    }
                    ArrayList<Byte> arrayList2 = new ArrayList<>();
                    aVar2.a(arrayList, arrayList2, i19);
                    bArr = new byte[arrayList2.size()];
                    it = arrayList2.iterator();
                    i36 = 0;
                    while (it.hasNext()) {
                        bArr[i36] = it.next().byteValue();
                        i36++;
                    }
                    byteArray = bArr;
                }
                int length7 = byteArray.length + 13;
                dataOutputStream3.writeInt(202501726);
                dataOutputStream3.writeInt(length7);
                dataOutputStream3.writeShort(i26);
                dataOutputStream3.writeShort(i25);
                if (iArr2 != null) {
                    i34 = 7;
                } else {
                    i34 = 0;
                }
                if (enumSet.contains(ut2.a.e.COMPRESS)) {
                    i34 |= 8;
                }
                dataOutputStream3.writeShort(65535);
                dataOutputStream3.writeShort(i34);
                dataOutputStream3.writeShort(iCeil);
                dataOutputStream3.writeByte(i27);
                dataOutputStream3.writeShort(length);
                dataOutputStream3.write(byteArray);
                return byteArrayOutputStream.toByteArray();
            }
            int i108 = i18;
            int i109 = i59;
            int[] iArr8 = new int[i108];
            int[] iArr9 = new int[i108];
            int[] iArr10 = {aVar.f197579a.getWidth(), aVar.f197579a.getHeight()};
            ut2.b bVar5 = new ut2.b(dVar2, iArr10[0], iArr10[1]);
            bVar5.c(iArr10, iArr8);
            int i110 = iArr8[0];
            int i111 = iArr8[1];
            int i112 = (i110 * i109) % 32;
            int iFloor2 = i112 != 0 ? (int) (Math.floor((32 - i112) / i109) + ((double) i110)) : i110;
            ut2.a.C3225a[][] c3225aArr9 = (ut2.a.C3225a[][]) Array.newInstance((Class<?>) ut2.a.C3225a.class, i111, i110);
            int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i111, iFloor2);
            int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, i111, iFloor2);
            boolean z15 = false;
            int i113 = 0;
            while (i113 < i111) {
                int i114 = i111;
                int i115 = i110;
                int i116 = i109;
                int i117 = iFloor2;
                int i118 = i19;
                int i119 = 0;
                while (i119 < i115) {
                    iArr8[0] = i119;
                    iArr8[1] = i113;
                    bVar5.b(iArr8, iArr9);
                    int i120 = i115;
                    boolean z16 = z15;
                    ut2.a.d[] dVarArr6 = dVarArr2;
                    c3225aArr9[i113][i119] = new ut2.a.C3225a(aVar.f197579a.getPixel(iArr9[0], iArr9[1]));
                    if (!c3225aArr9[i113][i119].e(i116)) {
                        int i121 = c3225aArr9[i113][i119].f172608d;
                        if (i116 >= 16 ? i121 < 255 : i121 < 128) {
                            z14 = dVarArr == null;
                        }
                        i119++;
                        dVarArr2 = dVarArr6;
                        z15 = z14;
                        i115 = i120;
                    }
                    z14 = z16;
                    i119++;
                    dVarArr2 = dVarArr6;
                    z15 = z14;
                    i115 = i120;
                }
                i113++;
                i109 = i116;
                i110 = i115;
                i111 = i114;
                iFloor2 = i117;
                i19 = i118;
            }
            int i122 = 0;
            while (i122 < i111) {
                int i123 = i110;
                int i124 = i109;
                int i125 = iFloor2;
                int i126 = i19;
                int i127 = i122;
                int i128 = i111;
                if (i24 != Integer.MAX_VALUE) {
                    for (int i129 = 0; i129 < i125; i129++) {
                        iArr11[i127][i129] = i24;
                        iArr12[i127][i129] = 128 - new ut2.a.C3225a(i24).d();
                    }
                }
                for (int i130 = 0; i130 < i123; i130++) {
                    ut2.a.C3225a c3225a7 = c3225aArr9[i127][i130];
                    int i131 = c3225a7.f172608d;
                    if (i124 >= 16 ? i131 < 255 : i131 < 128) {
                        if (i24 == Integer.MAX_VALUE) {
                            q2.u("Transparency detected in image while transparency is disabled.");
                            return null;
                        }
                    }
                    int iA = c3225a7.e(i124) ? i24 : dVarArr != null ? ut2.a.a(c3225a7, dVarArr, i124) : c3225a7.g(i124, z15);
                    iArr12[i127][i130] = 128 - c3225a7.d();
                    iArr11[i127][i130] = iA;
                }
                i122 = i127 + 1;
                i109 = i124;
                i110 = i123;
                i111 = i128;
                iFloor2 = i125;
                i19 = i126;
            }
            cVar = new ut2.a.c(i109, i110, i111, iFloor2, iArr11, z15 ? iArr12 : null);
            cVar2 = cVar;
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream4 = new DataOutputStream(byteArrayOutputStream4);
            int i1010 = cVar2.f172615d;
            iArr = cVar2.f172616e;
            iArr2 = cVar2.f172617f;
            i25 = cVar2.f172614c;
            i26 = cVar2.f172613b;
            double d15 = i1010;
            i27 = cVar2.f172612a;
            int iCeil2 = (int) Math.ceil(d15 / (8.0d / ((double) i27)));
            if (dVarArr2 != null) {
                length = dVarArr2.length;
            } else {
                length = 0;
            }
            if (dVarArr2 != null) {
                length2 = dVarArr2.length;
            } else {
                length2 = 0;
            }
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream5);
            if (length2 != 0) {
                ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                dataOutputStream2 = new DataOutputStream(byteArrayOutputStream6);
                length4 = dVarArr2.length;
                i54 = 0;
                while (i54 < length4) {
                    int i1011 = i54;
                    dataOutputStream2.writeInt(dVarArr2[i1011].f172621d);
                    i54 = i1011 + 1;
                }
                dataOutputStream.write(byteArrayOutputStream6.toByteArray());
            }
            i28 = 0;
            i29 = 0;
            while (i29 < i27) {
                i28 |= 1 << i29;
                i29++;
                cVar2 = cVar2;
                i19 = 8;
            }
            iMax = Math.max(i19 / i27, 1);
            i30 = 0;
            while (i30 < i25) {
                i44 = 0;
                while (i44 < cVar2.f172615d) {
                    if (i27 <= 8) {
                        i46 = 0;
                        while (i47 < iMax) {
                            i48 = i46;
                            i49 = i44 + i47;
                            if (i49 < i26) {
                                i46 = i48 | ((iArr[i30][i49] & i28) << (i47 * i27));
                            } else {
                                i46 = i48;
                            }
                        }
                        dataOutputStream.writeByte(i46);
                    } else {
                        if (i27 % 8 == 0) {
                            h.C("Specified bpp/palette configuration not supported!");
                            return null;
                        }
                        while (i45 < i27) {
                            dataOutputStream.writeByte((iArr[i30][i44] >> i45) & 255);
                        }
                    }
                    i44 += iMax;
                    cVar2 = cVar2;
                }
                i30++;
                i19 = 8;
            }
            if (iArr2 != null) {
                while (i37 < i25) {
                    while (i38 < i26) {
                        if (iArr2 != null) {
                            i39 = iArr2[i37][i38];
                        } else {
                            i39 = 0;
                        }
                        dataOutputStream.writeByte(i39);
                    }
                }
            }
            byteArray = byteArrayOutputStream5.toByteArray();
            if (enumSet.contains(ut2.a.e.COMPRESS)) {
                aj2.a aVar3 = new aj2.a();
                arrayList = new ArrayList<>(byteArray.length);
                length3 = byteArray.length;
                i35 = 0;
                while (i35 < length3) {
                    arrayList.add(Byte.valueOf(byteArray[i35]));
                    i35++;
                    i19 = 8;
                }
                ArrayList<Byte> arrayList3 = new ArrayList<>();
                aVar3.a(arrayList, arrayList3, i19);
                bArr = new byte[arrayList3.size()];
                it = arrayList3.iterator();
                i36 = 0;
                while (it.hasNext()) {
                    bArr[i36] = it.next().byteValue();
                    i36++;
                }
                byteArray = bArr;
            }
            int length8 = byteArray.length + 13;
            dataOutputStream4.writeInt(202501726);
            dataOutputStream4.writeInt(length8);
            dataOutputStream4.writeShort(i26);
            dataOutputStream4.writeShort(i25);
            if (iArr2 != null) {
                i34 = 7;
            } else {
                i34 = 0;
            }
            if (enumSet.contains(ut2.a.e.COMPRESS)) {
                i34 |= 8;
            }
            dataOutputStream4.writeShort(65535);
            dataOutputStream4.writeShort(i34);
            dataOutputStream4.writeShort(iCeil2);
            dataOutputStream4.writeByte(i27);
            dataOutputStream4.writeShort(length);
            dataOutputStream4.write(byteArray);
            return byteArrayOutputStream4.toByteArray();
        } catch (Exception e4) {
            logger.error("lookupCiqDeviceDefinition failure", (Throwable) e4);
            bVar2 = null;
        }
    }

    public final float c(int i14, int i15) {
        float height = 1.0f;
        float width = (i14 <= 0 || i14 >= this.f197579a.getWidth()) ? 1.0f : i14 / this.f197579a.getWidth();
        if (i15 > 0 && i15 < this.f197579a.getHeight()) {
            height = i15 / this.f197579a.getHeight();
        }
        return width < height ? width : height;
    }

    public final void e(float f14) {
        int width = (int) (this.f197579a.getWidth() * f14);
        int height = (int) (this.f197579a.getHeight() * f14);
        int width2 = this.f197579a.getWidth();
        int height2 = this.f197579a.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(width / width2, height / height2);
        this.f197579a = Bitmap.createBitmap(this.f197579a, 0, 0, width2, height2, matrix, false);
    }
}
