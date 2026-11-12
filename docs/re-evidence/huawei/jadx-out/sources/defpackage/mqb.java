package defpackage;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class mqb {
    private static int d(int i) {
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
                LogUtil.j("BasicUnpackFrame", "switchCompressionMotionType default");
                return 255;
        }
    }

    private static int c(byte[] bArr) {
        return lsh.a(lsh.a(bArr[2]));
    }

    private static void d(int i, int i2, int i3, mqd mqdVar) {
        mqdVar.a(i3);
        mqdVar.b(i);
        mqdVar.d(i2);
    }

    private static void b(int i, mqa mqaVar) {
        mqaVar.b(i);
    }

    private static void a(List<mqd> list, List<mqa> list2, int i, int i2, mqo mqoVar) {
        if (mqoVar == null) {
            LogUtil.j("BasicUnpackFrame", "frameData is null");
            return;
        }
        int iB = mqoVar.b();
        int iD = mqoVar.d();
        int iC = mqoVar.c();
        int iA = mqoVar.a();
        if (iB != 11 && iB != 10) {
            mqd mqdVar = new mqd();
            mqdVar.e(i + ((i2 - 1) * 60));
            mqdVar.c(d(iB));
            d(iD, iC, iA, mqdVar);
            list.add(mqdVar);
            return;
        }
        mqa mqaVar = new mqa();
        mqaVar.e(d(iB));
        mqaVar.e(i + ((i2 - 1) * 60));
        b(iD, mqaVar);
        list2.add(mqaVar);
    }

    private static boolean b(List<mqd> list, long j) {
        mqd mqdVar = list.get(list.size() - 1);
        if (mqdVar == null) {
            LogUtil.j("BasicUnpackFrame", "tempSportData is null");
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd", Locale.ENGLISH);
        return !simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date(mqdVar.c() * 1000)));
    }

    private static void b(List<mqd> list, int i, int i2, int i3, mqd mqdVar) {
        mqd mqdVar2 = list.get(list.size() - 1);
        d(i + mqdVar2.b(), i2 + mqdVar2.a(), i3 + mqdVar2.d(), mqdVar);
    }

    private static void b(List<mqa> list, int i, mqa mqaVar) {
        mqaVar.b(list.get(list.size() - 1).c() + i);
    }

    private static void c(List<mqd> list, List<mqa> list2, int i, int i2, mqo mqoVar) {
        if (mqoVar == null) {
            LogUtil.j("BasicUnpackFrame", "data is null");
            return;
        }
        int iB = mqoVar.b();
        int iD = mqoVar.d();
        int iC = mqoVar.c();
        int iA = mqoVar.a();
        if (iB != 11 && iB != 10) {
            mqd mqdVar = new mqd();
            long j = i + ((i2 - 1) * 60);
            mqdVar.e(j);
            mqdVar.c(d(iB));
            if (list.size() < 1) {
                LogUtil.j("BasicUnpackFrame", "totalSportDataList size less than 1");
            } else if (b(list, j * 1000)) {
                d(iD, iC, iA, mqdVar);
            } else {
                b(list, iD, iC, iA, mqdVar);
            }
            list.add(mqdVar);
            return;
        }
        mqa mqaVar = new mqa();
        mqaVar.e(d(iB));
        mqaVar.e(i + ((i2 - 1) * 60));
        if (list2.size() >= 1) {
            b(list2, iD, mqaVar);
        }
        list2.add(mqaVar);
    }

    public static mqe c(ees eesVar) {
        List<ees> listB = eesVar.b();
        String strB = "";
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                if (CommonUtil.v(listE.get(i2).e()) == 3) {
                    strB = listE.get(i2).b();
                } else {
                    LogUtil.j("BasicUnpackFrame", "unTlvGetFrameData default");
                }
            }
        }
        byte[] bArrC = eeq.c(strB);
        mqe mqeVar = new mqe();
        if (bArrC.length >= 16) {
            int iE = lsh.e(bArrC);
            mqeVar.a(iE);
            LogUtil.a("BasicUnpackFrame", "unGetFrameData(),time:", Integer.valueOf(iE), " date:", new Date(((long) iE) * 1000));
            if (c(bArrC) != 0) {
                int length = (bArrC.length - 16) / 16;
                StringBuilder sb = new StringBuilder(16);
                for (int i3 = 16; i3 < bArrC.length; i3++) {
                    sb.append(lsh.a(bArrC[i3]));
                }
                a(length, sb, iE, mqeVar);
                return mqeVar;
            }
        }
        return mqeVar;
    }

    private static mqe a(int i, StringBuilder sb, int i2, mqe mqeVar) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * 128;
            int i5 = i4 + 15;
            int i6 = i4 + 32;
            int i7 = i4 + 56;
            int i8 = i4 + 75;
            a(arrayList, arrayList2, i2, lsh.a(sb.substring(i4, i4 + 7)), new mqo(lsh.a(sb.substring(i4 + 8, i5)), lsh.a(sb.substring(i6, i7)), lsh.a(sb.substring(i5, i6)), lsh.a(sb.substring(i7, i8))));
            int i9 = i4 + 90;
            int iA = lsh.a(sb.substring(i4 + 83, i9));
            int i10 = i4 + AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
            int iA2 = lsh.a(sb.substring(i10, i4 + 128));
            int i11 = i4 + 101;
            int iA3 = lsh.a(sb.substring(i9, i11));
            int iA4 = lsh.a(sb.substring(i11, i10));
            int iA5 = lsh.a(sb.substring(i8, i4 + 82));
            if (iA5 != 0) {
                c(arrayList, arrayList2, i2, iA5, new mqo(iA, iA4, iA3, iA2));
            }
        }
        mqeVar.e(arrayList);
        mqeVar.d(arrayList2);
        return mqeVar;
    }
}
