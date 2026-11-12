package defpackage;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lxz {
    private static int b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return 0;
            case 4:
            case 5:
                return 1;
            case 6:
            case 7:
                return 2;
            case 8:
                return 3;
            case 9:
                return 4;
            case 10:
                return 6;
            case 11:
                return 7;
            default:
                LogUtil.j("FitnessUnpackFrame", "switchCompressionMotionType default");
                return 255;
        }
    }

    private static int a(byte[] bArr) {
        return lsh.a(lsh.a(bArr[2]));
    }

    private static void b(int i, int i2, int i3, lye lyeVar) {
        lyeVar.a(i3);
        lyeVar.e(i);
        lyeVar.b(i2);
    }

    private static void c(int i, lyb lybVar) {
        lybVar.c(i);
    }

    private static void b(List<lye> list, List<lyb> list2, int i, int i2, lyr lyrVar) {
        if (lyrVar == null) {
            LogUtil.j("FitnessUnpackFrame", "frameData is null");
            return;
        }
        int iC = lyrVar.c();
        int iD = lyrVar.d();
        int iE = lyrVar.e();
        int iA = lyrVar.a();
        if (iC != 11 && iC != 10) {
            lye lyeVar = new lye();
            lyeVar.c(i + ((i2 - 1) * 60));
            lyeVar.d(b(iC));
            b(iD, iE, iA, lyeVar);
            list.add(lyeVar);
            return;
        }
        lyb lybVar = new lyb();
        lybVar.d(b(iC));
        lybVar.c(i + ((i2 - 1) * 60));
        c(iD, lybVar);
        list2.add(lybVar);
    }

    private static boolean d(List<lye> list, long j) {
        lye lyeVar = list.get(list.size() - 1);
        if (lyeVar == null) {
            LogUtil.j("FitnessUnpackFrame", "tempSportData is null");
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd", Locale.ENGLISH);
        return !simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date(lyeVar.e() * 1000)));
    }

    private static void e(List<lye> list, int i, int i2, int i3, lye lyeVar) {
        lye lyeVar2 = list.get(list.size() - 1);
        b(i + lyeVar2.d(), i2 + lyeVar2.b(), i3 + lyeVar2.a(), lyeVar);
    }

    private static void d(List<lyb> list, int i, lyb lybVar) {
        lybVar.c(list.get(list.size() - 1).b() + i);
    }

    private static void a(List<lye> list, List<lyb> list2, int i, int i2, lyr lyrVar) {
        if (lyrVar == null) {
            LogUtil.j("FitnessUnpackFrame", "data is null");
            return;
        }
        int iC = lyrVar.c();
        int iD = lyrVar.d();
        int iE = lyrVar.e();
        int iA = lyrVar.a();
        if (iC != 11 && iC != 10) {
            lye lyeVar = new lye();
            long j = i + ((i2 - 1) * 60);
            lyeVar.c(j);
            lyeVar.d(b(iC));
            if (list.size() < 1) {
                LogUtil.j("FitnessUnpackFrame", "totalSportDataList size less than 1");
            } else if (d(list, j * 1000)) {
                b(iD, iE, iA, lyeVar);
            } else {
                e(list, iD, iE, iA, lyeVar);
            }
            list.add(lyeVar);
            return;
        }
        lyb lybVar = new lyb();
        lybVar.d(b(iC));
        lybVar.c(i + ((i2 - 1) * 60));
        if (list2.size() >= 1) {
            d(list2, iD, lybVar);
        }
        list2.add(lybVar);
    }

    public static lxy b(ees eesVar) {
        lxy lxyVar = new lxy();
        List<ees> listB = eesVar.b();
        String strB = "";
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                if (CommonUtil.v(listE.get(i2).e()) == 3) {
                    strB = listE.get(i2).b();
                } else {
                    LogUtil.j("FitnessUnpackFrame", "unTlvGetFrameData default");
                }
            }
        }
        byte[] bArrC = eeq.c(strB);
        if (bArrC.length >= 16) {
            int iE = lsh.e(bArrC);
            lxyVar.c(iE);
            LogUtil.a("FitnessUnpackFrame", "unGetFrameData(),time:", Integer.valueOf(iE), " date:", new Date(((long) iE) * 1000));
            if (a(bArrC) != 0) {
                int length = (bArrC.length - 16) / 16;
                StringBuilder sb = new StringBuilder(16);
                for (int i3 = 16; i3 < bArrC.length; i3++) {
                    sb.append(lsh.a(bArrC[i3]));
                }
                d(length, sb, iE, lxyVar);
                return lxyVar;
            }
        }
        return lxyVar;
    }

    private static lxy d(int i, StringBuilder sb, int i2, lxy lxyVar) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * 128;
            int i5 = i4 + 15;
            int i6 = i4 + 32;
            int i7 = i4 + 56;
            int i8 = i4 + 75;
            b(arrayList, arrayList2, i2, lsh.a(sb.substring(i4, i4 + 7)), new lyr(lsh.a(sb.substring(i4 + 8, i5)), lsh.a(sb.substring(i6, i7)), lsh.a(sb.substring(i5, i6)), lsh.a(sb.substring(i7, i8))));
            int i9 = i4 + 90;
            int iA = lsh.a(sb.substring(i4 + 83, i9));
            int i10 = i4 + AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
            int iA2 = lsh.a(sb.substring(i10, i4 + 128));
            int i11 = i4 + 101;
            int iA3 = lsh.a(sb.substring(i9, i11));
            int iA4 = lsh.a(sb.substring(i11, i10));
            int iA5 = lsh.a(sb.substring(i8, i4 + 82));
            if (iA5 != 0) {
                a(arrayList, arrayList2, i2, iA5, new lyr(iA, iA4, iA3, iA2));
            }
        }
        lxyVar.c(arrayList);
        lxyVar.a(arrayList2);
        return lxyVar;
    }
}
