package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.SyncHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class mtm {
    public static void c(List<Bean> list, String str, List<Bean> list2, List<String> list3) {
        LogUtil.a("ContactsCompareUtils", "compare: start. ");
        boolean zIsEmpty = TextUtils.isEmpty(str);
        List<msy> listE = mti.e(str);
        boolean z = true;
        boolean z2 = zIsEmpty || listE.isEmpty();
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z && z2) {
            LogUtil.a("ContactsCompareUtils", "compare: SCENARIO 1.");
            return;
        }
        if (z2) {
            list2.addAll(d(list));
            LogUtil.a("ContactsCompareUtils", "compare: SCENARIO 2. updated's size: ", Integer.valueOf(list2.size()));
            return;
        }
        if (z) {
            LogUtil.a("ContactsCompareUtils", "compare: SCENARIO 3.1. ");
        } else {
            LogUtil.a("ContactsCompareUtils", "compare: SCENARIO 3.2. ");
        }
        List<String> listA = a(listE);
        mtv.e(list);
        mtv.e(listE);
        mtv.e(listA);
        d(list, listE, list2, list3);
    }

    private static Bean c(Bean bean) {
        bean.setUid(SyncHelper.e());
        return bean;
    }

    private static List<Bean> d(List<Bean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("ContactsCompareUtils", "fillUid: list is null or empty.");
            return new ArrayList(0);
        }
        for (Bean bean : list) {
            if (TextUtils.isEmpty(bean.getUid())) {
                c(bean);
            }
        }
        return list;
    }

    private static List<String> a(List<msy> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("ContactsCompareUtils", "getCachedUidList: cache list is null or empty.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<msy> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }

    private static void d(List<Bean> list, List<msy> list2, List<Bean> list3, List<String> list4) {
        LogUtil.a("ContactsCompareUtils", "calculate: start.");
        HashMap map = new HashMap(list2.size());
        for (msy msyVar : list2) {
            map.put(Integer.valueOf(msyVar.a()), msyVar);
        }
        Set setKeySet = map.keySet();
        e(setKeySet, map, list4);
        if (list != null && !list.isEmpty()) {
            a(setKeySet, map, list, list3);
        }
        LogUtil.a("ContactsCompareUtils", "calculate: updated/deleted size: ", Integer.valueOf(list3.size()), Integer.valueOf(list4.size()));
    }

    private static void e(Set<Integer> set, Map<Integer, msy> map, List<String> list) {
        ArrayList arrayList = new ArrayList(set);
        List<Bean> listC = msm.c();
        ArrayList arrayList2 = new ArrayList(listC.size());
        if (!listC.isEmpty()) {
            Iterator<Bean> it = listC.iterator();
            while (it.hasNext()) {
                int iE = CommonUtil.e(it.next().getId(), -1);
                if (iE != -1) {
                    arrayList2.add(Integer.valueOf(iE));
                }
            }
        }
        if (arrayList.removeAll(arrayList2)) {
            LogUtil.a("ContactsCompareUtils", "calculate: deletedRidList or updateContactRidList is empty.");
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            msy msyVar = map.get((Integer) it2.next());
            if (msyVar != null) {
                list.add(msyVar.c());
            }
        }
    }

    private static void a(Set<Integer> set, Map<Integer, msy> map, List<Bean> list, List<Bean> list2) {
        for (Bean bean : list) {
            if (!(bean instanceof mtc)) {
                LogUtil.a("ContactsCompareUtils", "calculateUpdatedContacts: bean is not instance of RawContactBean.");
            } else {
                int iE = CommonUtil.e(bean.getId(), -1);
                if (iE != -1) {
                    if (!set.contains(Integer.valueOf(iE))) {
                        LogUtil.a("ContactsCompareUtils", "calculateUpdatedContacts: KeySet do not contains rid: ", Integer.valueOf(iE));
                        list2.add(c(bean));
                    } else {
                        msy msyVar = map.get(Integer.valueOf(iE));
                        if (msyVar == null) {
                            LogUtil.a("ContactsCompareUtils", "calculateUpdatedContacts: cachedSimpleContactBean is null.");
                        } else {
                            mtc mtcVar = (mtc) bean;
                            mtcVar.setUid("0");
                            if (!mtr.b(mtq.e(mtcVar)).equals(msyVar.e())) {
                                bean.setUid(msyVar.c());
                                list2.add(bean);
                            } else {
                                LogUtil.a("ContactsCompareUtils", "calculateUpdatedContacts: the rawContactFeature is same to cache's rawContactFeature ");
                            }
                        }
                    }
                }
            }
        }
    }
}
