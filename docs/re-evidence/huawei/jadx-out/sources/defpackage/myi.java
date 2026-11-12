package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myi {
    public static myg d(byte[] bArr) {
        myg mygVar = new myg();
        if (bArr != null) {
            String strE = eeq.e(bArr);
            ArrayList arrayList = new ArrayList(16);
            if (strE.length() > 4) {
                try {
                    d(strE.substring(4, strE.length()), mygVar, arrayList);
                    mygVar.d(arrayList);
                    return mygVar;
                } catch (eeu e) {
                    ReleaseLogUtil.a("BTSYNC_StressMgrUtil", "getRelaxRecordDetails tlvException:", ExceptionUtils.c(e));
                }
            }
        }
        return mygVar;
    }

    private static void d(String str, myg mygVar, List<mxy> list) throws eeu {
        List<ees> listB = new eet().b(str).b();
        if (listB == null || listB.isEmpty()) {
            return;
        }
        for (ees eesVar : listB) {
            c(mygVar, eesVar.e());
            a(list, eesVar.b());
        }
    }

    private static void a(List<mxy> list, List<ees> list2) throws eeu {
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            mxy mxyVar = new mxy();
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 4) {
                    mxyVar.d(CommonUtil.v(eewVar.b()));
                } else if (iV == 5) {
                    mxyVar.c(CommonUtil.v(eewVar.b()));
                } else if (iV == 6) {
                    mxyVar.e(CommonUtil.v(eewVar.b()));
                } else if (iV == 7) {
                    mxyVar.b(CommonUtil.v(eewVar.b()));
                } else {
                    ReleaseLogUtil.e("BTSYNC_StressMgrUtil", "buildTlvChild child enter default branch");
                }
            }
            list.add(mxyVar);
        }
    }

    private static void c(myg mygVar, List<eew> list) throws eeu {
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 2) {
                mygVar.d(CommonUtil.v(eewVar.b()));
            } else {
                ReleaseLogUtil.e("BTSYNC_StressMgrUtil", "buildTlvList father enter default branch");
            }
        }
    }
}
