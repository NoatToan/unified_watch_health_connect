package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hwonesdk.datastructure.request.DataType;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class nqj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile nqj f43451a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nqq f43452b;

    public int c(int i) {
        if (i == 2) {
            return 1;
        }
        return i;
    }

    public static nqj a() {
        if (f43451a == null) {
            synchronized (d) {
                if (f43451a == null) {
                    f43451a = new nqj();
                }
            }
        }
        return f43451a;
    }

    private nqj() {
        if (this.f43452b == null) {
            try {
                this.f43452b = (nqq) lls.a(BaseApplication.b().getAssets().open("dict_config.json"), nqq.class);
            } catch (IOException e) {
                LogUtil.c("DictConfigManager", e.toString());
            }
        }
    }

    public nqq.e a(int i) {
        nqq nqqVar = this.f43452b;
        if (nqqVar == null) {
            return null;
        }
        for (nqq.e eVar : nqqVar.b()) {
            if (eVar.g() == i) {
                return eVar;
            }
        }
        return null;
    }

    public int[] e(int i, String str) {
        ArrayList arrayList = new ArrayList();
        if (this.f43452b == null) {
            return CommonUtil.c((List<Integer>) arrayList);
        }
        nqq.e eVarA = a(i);
        if (eVarA == null) {
            int iC = HiHealthDictManager.a(BaseApplication.b()).c(i, str, 0);
            HiHealthDictField hiHealthDictFieldE = HiHealthDictManager.a(BaseApplication.b()).e(i, str);
            int iE = hiHealthDictFieldE != null ? hiHealthDictFieldE.e() : 0;
            if (iE > 0) {
                arrayList.add(Integer.valueOf(iE));
            } else if (iC > 0) {
                arrayList.add(Integer.valueOf(iC));
            } else {
                arrayList.add(Integer.valueOf(i));
            }
        } else if (eVarA.d(str) <= 0) {
            Iterator<nqq.e.a> it = eVarA.b().iterator();
            while (it.hasNext()) {
                List<nqq.e.a.b> listI = it.next().i();
                if (!CollectionUtils.a(listI)) {
                    for (nqq.e.a.b bVar : listI) {
                        if (str.equals(bVar.b())) {
                            arrayList.add(Integer.valueOf(bVar.d()));
                        }
                    }
                }
            }
        } else {
            arrayList.add(Integer.valueOf(eVarA.d(str)));
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }

    public int d(nqo nqoVar, String str, int i) {
        int i2 = nqoVar.d().getmId();
        int iB = nqoVar.e().b();
        nqq.e eVarA = a(i2);
        if (eVarA != null && iB >= 3 && nqoVar.a() == null) {
            for (nqq.e.a aVar : eVarA.b()) {
                if (str.equals(aVar.e())) {
                    List<nqq.e.a.b> listI = aVar.i();
                    if (CollectionUtils.a(listI)) {
                        continue;
                    } else {
                        for (nqq.e.a.b bVar : listI) {
                            if (!TextUtils.isEmpty(bVar.a()) && nqk.e(bVar.a()) == i) {
                                return bVar.d();
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public String b(int i) {
        if (this.f43452b == null) {
            return "";
        }
        nqq.e eVarA = a(i);
        if (eVarA != null) {
            return eVarA.d();
        }
        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a((Context) null).a(i);
        return hiHealthDictTypeA == null ? "" : hiHealthDictTypeA.j();
    }

    public int[] a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (this.f43452b == null) {
            return CommonUtil.c((List<Integer>) arrayList);
        }
        for (int i : iArr) {
            nqq.e eVarA = a(i);
            if (eVarA == null) {
                arrayList.add(Integer.valueOf(i));
            } else {
                arrayList.addAll(eVarA.a());
            }
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }

    public int[] c(int i, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (this.f43452b == null) {
            return CommonUtil.c((List<Integer>) arrayList);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Set hashSet = new HashSet();
            if (entry.getValue() instanceof Map) {
                hashSet = ((Map) entry.getValue()).keySet();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.addAll(d(i, (String) it.next()));
            }
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }

    public Map<Integer, String> e(int i, List<Integer> list, List<Integer> list2, List<String> list3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<nqq.e.a> listA = a(i, list, list2, list3);
        if (!CollectionUtils.a(listA)) {
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2) != null && list2.get(i2) != null) {
                    map.put(list.get(i2) + ":" + list2.get(i2), Integer.valueOf(i2));
                }
            }
            for (nqq.e.a aVar : listA) {
                if (aVar != null) {
                    Integer numValueOf = Integer.valueOf(aVar.a());
                    Integer numValueOf2 = Integer.valueOf(aVar.f());
                    List<nqq.e.a.b> listI = aVar.i();
                    if (numValueOf != null && numValueOf2 != null && !CollectionUtils.a(listI) && listI.get(0) != null) {
                        Integer num = (Integer) map.get(numValueOf + ":" + numValueOf2);
                        if (num != null && num.intValue() >= 0 && num.intValue() < list3.size()) {
                            linkedHashMap.put(Integer.valueOf(listI.get(0).d()), list3.get(num.intValue()));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private List<nqq.e.a> a(int i, List<Integer> list, List<Integer> list2, List<String> list3) {
        if (i < 0 || list == null || list2 == null || list3 == null) {
            return Collections.EMPTY_LIST;
        }
        if (list.size() != list2.size() || list.size() != list3.size()) {
            return Collections.EMPTY_LIST;
        }
        nqq.e eVarA = a(i);
        if (eVarA == null) {
            return Collections.EMPTY_LIST;
        }
        List<nqq.e.a> listB = eVarA.b();
        return (listB == null || listB.isEmpty()) ? Collections.EMPTY_LIST : listB;
    }

    private List<Integer> d(int i, String str) {
        ArrayList arrayList = new ArrayList();
        if (this.f43452b != null) {
            nqq.e eVarA = a(i);
            if (eVarA == null) {
                int iC = HiHealthDictManager.a(BaseApplication.b()).c(i, str, 0);
                if (iC <= 0) {
                    arrayList.add(Integer.valueOf(i));
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(iC));
                return arrayList;
            }
            if (eVarA.d(str) <= 0) {
                Iterator<nqq.e.a> it = eVarA.b().iterator();
                while (it.hasNext()) {
                    List<nqq.e.a.b> listI = it.next().i();
                    if (!CollectionUtils.a(listI)) {
                        for (nqq.e.a.b bVar : listI) {
                            if (str.equals(bVar.b())) {
                                arrayList.add(Integer.valueOf(bVar.d()));
                            }
                        }
                    }
                }
            } else {
                arrayList.add(Integer.valueOf(eVarA.d(str)));
                return arrayList;
            }
        }
        return arrayList;
    }

    public List<JsonObject> a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (this.f43452b != null) {
            nqq.e eVarA = a(i);
            if (eVarA == null) {
                HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(BaseApplication.b()).c(i2);
                if (hiHealthDictFieldC != null) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty(nqk.f43453a, hiHealthDictFieldC.c());
                    jsonObject.addProperty(nqk.d, Integer.valueOf(i));
                    jsonObject.addProperty(nqk.f43455c, Boolean.valueOf("string".equalsIgnoreCase(hiHealthDictFieldC.d())));
                    arrayList.add(jsonObject);
                    return arrayList;
                }
                List<HiHealthDictField> listH = HiHealthDictManager.a(BaseApplication.b()).h(i2);
                if (CollectionUtils.a(listH)) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty(nqk.f43453a, "");
                    jsonObject2.addProperty(nqk.d, Integer.valueOf(i));
                    arrayList.add(jsonObject2);
                    return arrayList;
                }
                for (HiHealthDictField hiHealthDictField : listH) {
                    JsonObject jsonObject3 = new JsonObject();
                    jsonObject3.addProperty(nqk.f43453a, hiHealthDictField.c());
                    jsonObject3.addProperty(nqk.d, Integer.valueOf(i));
                    arrayList.add(jsonObject3);
                }
            } else {
                for (nqq.e.a aVar : eVarA.b()) {
                    if (aVar.a() == i2) {
                        JsonObject jsonObject4 = new JsonObject();
                        jsonObject4.addProperty(nqk.f43453a, aVar.e());
                        jsonObject4.addProperty(nqk.f43455c, Boolean.valueOf(aVar.j()));
                        jsonObject4.addProperty(nqk.d, Integer.valueOf(i));
                        arrayList.add(jsonObject4);
                    } else if (aVar.b() == i2) {
                        JsonObject jsonObject5 = new JsonObject();
                        jsonObject5.addProperty(nqk.f43453a, aVar.e());
                        jsonObject5.addProperty(nqk.f43455c, Boolean.valueOf(aVar.j()));
                        jsonObject5.addProperty(nqk.d, Integer.valueOf(i));
                        if (!TextUtils.isEmpty(aVar.d())) {
                            jsonObject5.addProperty(nqk.e, aVar.d());
                        }
                        arrayList.add(jsonObject5);
                    }
                }
            }
        }
        return arrayList;
    }

    public int a(int i, String str) {
        if (this.f43452b == null) {
            return -1;
        }
        nqq.e eVarA = a(i);
        if (eVarA == null) {
            return HiHealthDictManager.a(BaseApplication.b()).c(i, str, 0);
        }
        Iterator<nqq.e.a> it = eVarA.b().iterator();
        while (it.hasNext()) {
            List<nqq.e.a.b> listI = it.next().i();
            if (!CollectionUtils.a(listI)) {
                for (nqq.e.a.b bVar : listI) {
                    if (str.equals(bVar.b())) {
                        return bVar.d();
                    }
                }
            }
        }
        return -1;
    }

    public Map<Integer, Integer> b(int[] iArr) {
        HashMap map = new HashMap();
        if (this.f43452b != null) {
            for (int i : iArr) {
                nqq.e eVarA = a(i);
                if (eVarA == null) {
                    if (HiHealthDictManager.a((Context) null).k(i)) {
                        map.put(Integer.valueOf(i), Integer.valueOf(i));
                    } else {
                        Iterator<Integer> it = d(new int[]{i}).iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            map.put(it.next(), Integer.valueOf(i));
                            z = true;
                        }
                        if (!z) {
                            map.put(Integer.valueOf(i), Integer.valueOf(i));
                        }
                    }
                } else {
                    Iterator<Integer> it2 = eVarA.a().iterator();
                    while (it2.hasNext()) {
                        map.put(it2.next(), Integer.valueOf(i));
                    }
                }
            }
        }
        return map;
    }

    public Map<Integer, Integer> c(int[] iArr) {
        HashMap map = new HashMap();
        if (this.f43452b != null) {
            for (int i : iArr) {
                nqq.e eVarA = a(i);
                if (eVarA == null) {
                    if (!HiHealthDictManager.a((Context) null).k(i)) {
                        map.put(Integer.valueOf(i), Integer.valueOf(i));
                    } else {
                        Iterator<Integer> it = d(new int[]{i}).iterator();
                        while (it.hasNext()) {
                            map.put(it.next(), Integer.valueOf(i));
                        }
                    }
                } else {
                    Iterator<Integer> it2 = eVarA.c().iterator();
                    while (it2.hasNext()) {
                        map.put(it2.next(), Integer.valueOf(i));
                    }
                }
            }
        }
        return map;
    }

    public String e(int[] iArr) {
        nqq nqqVar = this.f43452b;
        if (nqqVar == null || iArr == null || iArr.length == 0) {
            return null;
        }
        for (nqq.b bVar : nqqVar.d()) {
            for (int i : iArr) {
                if (bVar.c() == i) {
                    return bVar.d();
                }
            }
        }
        return null;
    }

    public List<Integer> d(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (this.f43452b != null) {
            for (int i : iArr) {
                if (d(i)) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    nqq.e eVarA = a(i);
                    if (eVarA == null) {
                        arrayList.addAll(HiHealthDictManager.a((Context) null).f(i));
                    } else {
                        arrayList.addAll(eVarA.c());
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean d(int i) {
        return HiHealthDataType.Category.SEQUENCE == HiHealthDataType.d(i);
    }

    public List<Integer> b(List<DataType> list) {
        ArrayList arrayList = new ArrayList();
        for (DataType dataType : list) {
            nqq.e eVarA = a(dataType.getmId());
            if (eVarA == null) {
                arrayList.add(Integer.valueOf(dataType.getmId()));
            } else if (eVarA.e() == 0) {
                arrayList.add(Integer.valueOf(dataType.getmId()));
            } else {
                arrayList.add(Integer.valueOf(eVarA.e()));
            }
        }
        return arrayList;
    }

    public int e(int i, int i2, String str) {
        if (this.f43452b == null) {
            return -1;
        }
        nqq.e eVarA = a(i);
        if (eVarA == null) {
            return HiHealthDictManager.a(BaseApplication.b()).a(i, i2, str, 0);
        }
        for (nqq.e.a aVar : eVarA.b()) {
            if (aVar.a() == i2) {
                List<nqq.e.a.b> listI = aVar.i();
                if (CollectionUtils.a(listI)) {
                    continue;
                } else {
                    for (nqq.e.a.b bVar : listI) {
                        if (str.equals(bVar.b())) {
                            return bVar.d();
                        }
                    }
                }
            }
        }
        return -1;
    }

    public int b(int i, int i2) {
        if (this.f43452b == null) {
            return -1;
        }
        nqq.e eVarA = a(i);
        if (eVarA == null) {
            LogUtil.d("DictConfigManager", "dictConfig is null");
        } else {
            for (nqq.e.a aVar : eVarA.b()) {
                if (aVar.a() == i2) {
                    return aVar.b();
                }
            }
        }
        return -1;
    }
}
