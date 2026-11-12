package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.SyncHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class muf {
    public static void b(List<Bean> list, String str, List<Bean> list2, List<Bean> list3, List<Bean> list4) {
        LogUtil.a("SportContactsCompareUtils", "compare: start. ");
        boolean zIsEmpty = TextUtils.isEmpty(str);
        List<msz> listF = mti.f(str);
        boolean z = true;
        boolean z2 = zIsEmpty || listF.isEmpty();
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z && z2) {
            ReleaseLogUtil.c("R_SportContactsCompareUtils", "compare: SCENARIO 1.");
            return;
        }
        if (z2) {
            list4.addAll(b(list));
            ReleaseLogUtil.c("R_SportContactsCompareUtils", "compare: SCENARIO 2. updated's size: ", Integer.valueOf(list4.size()));
            return;
        }
        if (z) {
            ReleaseLogUtil.c("R_SportContactsCompareUtils", "compare: SCENARIO 3.1. ");
        } else {
            LogUtil.a("SportContactsCompareUtils", "compare: SCENARIO 3.2. ");
        }
        List<String> listD = d(listF);
        mtv.e(list);
        mtv.e(listF);
        mtv.e(listD);
        d(list, listF, list2, list3, list4);
    }

    private static Bean b(Bean bean) {
        bean.setUid(SyncHelper.e());
        return bean;
    }

    private static List<Bean> b(List<Bean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("SportContactsCompareUtils", "fillUid: list is null or empty.");
            return new ArrayList(0);
        }
        for (Bean bean : list) {
            if (TextUtils.isEmpty(bean.getUid())) {
                b(bean);
            }
        }
        return list;
    }

    private static List<String> d(List<msz> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("SportContactsCompareUtils", "getCachedUidList: cache list is null or empty.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<msz> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private static void d(List<Bean> list, List<msz> list2, List<Bean> list3, List<Bean> list4, List<Bean> list5) {
        LogUtil.a("SportContactsCompareUtils", "calculate: start.");
        HashMap map = new HashMap(list2.size());
        for (msz mszVar : list2) {
            map.put(Integer.valueOf(mszVar.b()), mszVar);
        }
        Set setKeySet = map.keySet();
        e(setKeySet, map, list4);
        if (!njy.e(list)) {
            b((Set<Integer>) setKeySet, map, list, list5, list4);
        }
        LogUtil.a("SportContactsCompareUtils", "calculate: updated/deleted/added size: ", Integer.valueOf(list3.size()), Integer.valueOf(list4.size()), Integer.valueOf(list5.size()));
    }

    private static void e(Set<Integer> set, Map<Integer, msz> map, List<Bean> list) {
        ArrayList arrayList = new ArrayList(set);
        LogUtil.a("SportContactsCompareUtils", "deletedRidList is :", arrayList);
        List<Bean> listD = msm.d();
        LogUtil.a("SportContactsCompareUtils", "allContacts size  is :", Integer.valueOf(listD.size()));
        ArrayList arrayList2 = new ArrayList(listD.size());
        if (!listD.isEmpty()) {
            Iterator<Bean> it = listD.iterator();
            while (it.hasNext()) {
                int iE = CommonUtil.e(it.next().getId(), -1);
                LogUtil.a("SportContactsCompareUtils", "intern rid is :", Integer.valueOf(iE));
                if (iE != -1) {
                    arrayList2.add(Integer.valueOf(iE));
                }
            }
        }
        LogUtil.a("SportContactsCompareUtils", "allContactRidList is :", arrayList2);
        if (arrayList.removeAll(arrayList2)) {
            LogUtil.a("SportContactsCompareUtils", "calculate: deletedRidList remove allContactRidList ");
        }
        LogUtil.a("SportContactsCompareUtils", "deletedRidList size is :", Integer.valueOf(arrayList.size()));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            msz mszVar = map.get((Integer) it2.next());
            if (mszVar != null) {
                mtc mtcVar = new mtc();
                mtcVar.setUid(mszVar.a());
                mtcVar.f(mszVar.c());
                list.add(mtcVar);
            }
        }
        LogUtil.a("SportContactsCompareUtils", "deleted size is :", Integer.valueOf(list.size()));
    }

    private static void b(Set<Integer> set, Map<Integer, msz> map, List<Bean> list, List<Bean> list2, List<Bean> list3) {
        for (Bean bean : list) {
            if (!(bean instanceof mtc)) {
                LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts: bean is not instance of RawContactBean.");
            } else {
                int iE = CommonUtil.e(bean.getId(), -1);
                if (iE != -1) {
                    if (!set.contains(Integer.valueOf(iE))) {
                        LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts: KeySet do not contains rid: ", Integer.valueOf(iE));
                        list2.add(b(bean));
                    } else {
                        msz mszVar = map.get(Integer.valueOf(iE));
                        if (mszVar == null) {
                            LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts: cachedSimpleContactBean is null.");
                        } else {
                            mtc mtcVar = (mtc) bean;
                            String strD = mtcVar.d("data1");
                            if (StringUtils.g(strD)) {
                                strD = mub.e().a(mtcVar);
                            }
                            String strB = mtr.b(mub.e().d(mtcVar, mub.e().c(mtcVar.n(), strD), strD));
                            LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts new rawContactFeature is : ", strB);
                            String strE = mszVar.e();
                            LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts cache cachedRawContactFeature is : ", strE);
                            if (!strB.equals(strE)) {
                                mtc mtcVar2 = new mtc();
                                mtcVar2.setUid(mszVar.a());
                                mtcVar2.f(mszVar.c());
                                list3.add(mtcVar2);
                                list2.add(b(bean));
                            } else {
                                LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts: the rawContactFeature is same to cache's rawContactFeature ");
                            }
                        }
                    }
                }
            }
        }
        LogUtil.a("SportContactsCompareUtils", "calculateUpdatedContacts deleted size is :", Integer.valueOf(list3.size()), "added size is :", Integer.valueOf(list2.size()));
    }
}
