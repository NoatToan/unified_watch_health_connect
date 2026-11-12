package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myj {
    private static int[] e(ees eesVar) {
        List<eew> listE = eesVar.e();
        int size = listE.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            String strB = listE.get(i).b();
            if (CommonUtil.v(listE.get(i).e()) != 127) {
                ReleaseLogUtil.e("BTSYNC_StressUnPackage", "unTlvGetErrorCode enter default branch");
            } else if (size > 0) {
                iArr[0] = CommonUtil.v(strB);
            }
        }
        return iArr;
    }

    public static int e(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length >= 4) {
                    String strE = eeq.e(bArr);
                    int[] iArrE = e(new eet().b(strE.substring(4, strE.length())));
                    if (iArrE.length <= 0) {
                        ReleaseLogUtil.e("BTSYNC_StressUnPackage", "errorCodeArray is invalid");
                        return 0;
                    }
                    int i = iArrE[0];
                    if (i == 100000) {
                        return 0;
                    }
                    return i;
                }
            } catch (eeu e) {
                ReleaseLogUtil.a("BTSYNC_StressUnPackage", "getErrorCode tlvException:", ExceptionUtils.c(e));
                return 0;
            }
        }
        ReleaseLogUtil.e("BTSYNC_StressUnPackage", "data is invalid");
        return -1;
    }

    public static myd a(byte[] bArr) {
        myd mydVar = new myd();
        if (bArr != null) {
            String strE = eeq.e(bArr);
            if (strE.length() > 4) {
                String strSubstring = strE.substring(4, strE.length());
                ArrayList arrayList = new ArrayList(10);
                try {
                    List<ees> listB = new eet().b(strSubstring).b();
                    if (listB != null && !listB.isEmpty()) {
                        c(mydVar, arrayList, listB);
                    }
                    mydVar.c(arrayList);
                    return mydVar;
                } catch (eeu e) {
                    ReleaseLogUtil.a("BTSYNC_StressUnPackage", "unPackageStressRecordDetail tlvException:", ExceptionUtils.c(e));
                }
            }
        }
        return mydVar;
    }

    private static void c(myd mydVar, List<Integer> list, List<ees> list2) {
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    mydVar.d(CommonUtil.v(eewVar.b()));
                } else if (iV == 5) {
                    list.add(Integer.valueOf(CommonUtil.v(eewVar.b())));
                } else {
                    ReleaseLogUtil.e("BTSYNC_StressUnPackage", "unPackageStressFrameIndexList enter default branch");
                }
            }
        }
    }

    public static myf b(byte[] bArr) {
        myf myfVar = new myf();
        if (bArr != null) {
            String strE = eeq.e(bArr);
            ArrayList arrayList = new ArrayList(10);
            if (strE.length() > 4) {
                try {
                    a(myfVar, arrayList, new eet().b(strE.substring(4, strE.length())).b());
                    myfVar.b(arrayList);
                    return myfVar;
                } catch (eeu unused) {
                    ReleaseLogUtil.a("BTSYNC_StressUnPackage", "unPackageStressRecordDetail tlvException");
                }
            }
        }
        return myfVar;
    }

    private static void a(myf myfVar, List<myc> list, List<ees> list2) {
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (ees eesVar : list2) {
            a(myfVar, eesVar.e());
            b(list, eesVar);
        }
    }

    private static void a(myf myfVar, List<eew> list) {
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 2) {
                myfVar.a(CommonUtil.v(eewVar.b()));
            } else {
                ReleaseLogUtil.e("BTSYNC_StressUnPackage", "for enter default branch");
            }
        }
    }

    private static void b(List<myc> list, ees eesVar) {
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            myc mycVar = new myc();
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 4) {
                    mycVar.a(CommonUtil.v(eewVar.b()));
                } else if (iV == 5) {
                    mycVar.e(CommonUtil.v(eewVar.b()));
                } else if (iV == 6) {
                    mycVar.d(CommonUtil.v(eewVar.b()));
                } else {
                    ReleaseLogUtil.e("BTSYNC_StressUnPackage", "unPackageStressRecordDetail enter default branch");
                }
            }
            list.add(mycVar);
        }
    }

    public static mye d(byte[] bArr) {
        mye myeVar = new mye();
        if (bArr != null) {
            String strE = eeq.e(bArr);
            if (strE.length() > 4) {
                String strSubstring = strE.substring(4, strE.length());
                ArrayList arrayList = new ArrayList(10);
                try {
                    List<ees> listB = new eet().b(strSubstring).b();
                    if (listB != null && !listB.isEmpty()) {
                        d(myeVar, arrayList, listB);
                    }
                    myeVar.c(arrayList);
                    return myeVar;
                } catch (eeu e) {
                    ReleaseLogUtil.a("BTSYNC_StressUnPackage", "unPackageRelaxFrameIndexList tlvException:", ExceptionUtils.c(e));
                }
            }
        }
        return myeVar;
    }

    private static void d(mye myeVar, List<Integer> list, List<ees> list2) {
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    myeVar.d(CommonUtil.v(eewVar.b()));
                } else if (iV == 5) {
                    list.add(Integer.valueOf(CommonUtil.v(eewVar.b())));
                } else {
                    ReleaseLogUtil.e("BTSYNC_StressUnPackage", "unPackageRelaxFrameIndexList enter default branch");
                }
            }
        }
    }

    public static myg c(byte[] bArr) {
        return bArr == null ? new myg() : myi.d(bArr);
    }
}
