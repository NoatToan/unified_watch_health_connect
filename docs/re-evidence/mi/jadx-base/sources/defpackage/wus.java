package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class wus {
    public static byte[] a(boolean z, byte[] bArr, int i, int i2, int i3, Bitmap bitmap, Bitmap bitmap2) {
        byte[] bArrG;
        StringBuilder sb = new StringBuilder();
        sb.append("getNewCustomClockDialData source_data len = ");
        sb.append(bArr.length);
        byte[] bArr2 = null;
        try {
            dss dssVar = new dss(bArr);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getNewCustomClockDialData mHandleCustomClockDialModle len = ");
            sb2.append(dssVar.toString());
            byte[] bArr3 = new byte[dssVar.E()];
            try {
                if (dssVar.V()) {
                    System.arraycopy(bArr, dssVar.y(), bArr3, dssVar.A(), dssVar.C());
                }
                if (dssVar.T()) {
                    ArrayList<gjs> arrayListS = dssVar.s();
                    ArrayList arrayList = new ArrayList();
                    if (arrayListS != null && arrayListS.size() > 0) {
                        for (int i4 = 0; i4 < arrayListS.size(); i4++) {
                            gjs gjsVar = arrayListS.get(i4);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("getNewCustomClockDialData i = ");
                            sb3.append(i4);
                            sb3.append(" mCustomDataModle = ");
                            sb3.append(gjsVar.toString());
                            if (gjsVar.d() == 0 && gjsVar.f() == 0) {
                                sns snsVar = new sns(gjsVar.c());
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("getNewCustomClockDialData i = ");
                                sb4.append(i4);
                                sb4.append(" mCustomModleDataA = ");
                                sb4.append(snsVar.toString());
                                byte[] bArrB = snsVar.b(z, i, i2, i3, bArr, bitmap);
                                if (bArrB != null) {
                                    arrayList.add(bArrB);
                                }
                            }
                        }
                        byte[] bArrA = r3s.a(arrayList);
                        if (bArrA != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("getNewCustomClockDialData endData.len = ");
                            sb5.append(bArrA.length);
                            System.arraycopy(bArrA, 0, bArr3, dssVar.u(), dssVar.w());
                        }
                    }
                }
                if (dssVar.X() && dssVar.K() > 0 && dssVar.G() > 0) {
                    int I = dssVar.I();
                    int iK = dssVar.K();
                    int iG = dssVar.G();
                    int iM = dssVar.M();
                    int iO = dssVar.O();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("getNewCustomClockDialData 缩略图-类型 = ");
                    sb6.append(I);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("getNewCustomClockDialData 缩略图-宽度 = ");
                    sb7.append(iK);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("getNewCustomClockDialData 缩略图-高度 = ");
                    sb8.append(iG);
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("getNewCustomClockDialData 缩略图-写入-地址 = ");
                    sb9.append(iM);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("getNewCustomClockDialData 缩略图-写入-大小 = ");
                    sb10.append(iO);
                    Bitmap bitmapA = gas.a(bArr, i, i2, i3, bitmap, bitmap2, false);
                    if (bitmapA != null) {
                        Bitmap bitmapC = afs.c(bitmapA, iK, iG);
                        if (I == 0) {
                            byte[] bArrG2 = afs.g(z, bitmapC);
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("getNewCustomClockDialData thumbnail_data_len = ");
                            sb11.append(bArrG2.length);
                            System.arraycopy(bArrG2, 0, bArr3, iM, iO);
                        }
                    }
                }
                if (!dssVar.R()) {
                    return bArr3;
                }
                int iH = dssVar.h();
                int iK2 = dssVar.k();
                int iA = dssVar.a();
                int iN = dssVar.n();
                int iQ = dssVar.q();
                StringBuilder sb12 = new StringBuilder();
                sb12.append("getNewCustomClockDialData 背景-类型 = ");
                sb12.append(iH);
                StringBuilder sb13 = new StringBuilder();
                sb13.append("getNewCustomClockDialData 背景-宽度 = ");
                sb13.append(iK2);
                StringBuilder sb14 = new StringBuilder();
                sb14.append("getNewCustomClockDialData 背景-高度 = ");
                sb14.append(iA);
                StringBuilder sb15 = new StringBuilder();
                sb15.append("getNewCustomClockDialData 背景-写入-地址 = ");
                sb15.append(iN);
                StringBuilder sb16 = new StringBuilder();
                sb16.append("getNewCustomClockDialData 背景-写入-大小 = ");
                sb16.append(iQ);
                if (iH != 0 || (bArrG = afs.g(z, bitmap)) == null) {
                    return bArr3;
                }
                StringBuilder sb17 = new StringBuilder();
                sb17.append("bg_data_len = ");
                sb17.append(bArrG.length);
                System.arraycopy(bArrG, 0, bArr3, iN, iQ);
                return bArr3;
            } catch (Exception e) {
                e = e;
                bArr2 = bArr3;
                e.printStackTrace();
                return bArr2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
