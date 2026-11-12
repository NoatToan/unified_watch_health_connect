package com.huawei.hihealth.dictionary.model;

import com.google.gson.annotations.SerializedName;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HiHealthDictionary implements Mergable<HiHealthDictionary> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dictTypes")
    private List<HiHealthDictType> f12290a;

    @SerializedName("version")
    private int g = -1;
    private transient Map<Integer, HiHealthDictType> d = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map<Integer, HiHealthDictStat> f12292c = new HashMap();
    private transient Map<Integer, HiHealthDictField> e = new HashMap();
    private transient Map<Integer, HiHealthDictType> h = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Map<Integer, HiHealthDictType> f12291b = new HashMap();

    private boolean f(int i) {
        return i >= 30001 && i <= 31000;
    }

    @Override // com.huawei.hihealth.dictionary.model.Mergable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void merge(HiHealthDictionary hiHealthDictionary) {
        if (this.g > hiHealthDictionary.h()) {
            LogUtil.c("HiH_HiHealthDictionary", "merge failed. src version:", Integer.valueOf(this.g), " dst version:", Integer.valueOf(hiHealthDictionary.h()));
            return;
        }
        this.d.putAll(hiHealthDictionary.i());
    }

    public List<Integer> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.d.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public List<Integer> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, HiHealthDictType>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            HiHealthDictType value = it.next().getValue();
            int iL = value.l();
            int i = value.i();
            if (i != 0 && iL < 31000) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public HiHealthDictType c(int i) {
        return this.d.get(Integer.valueOf(i));
    }

    public HiHealthDictStat a(int i) {
        return this.f12292c.get(Integer.valueOf(i));
    }

    public HiHealthDictField b(int i) {
        return this.e.get(Integer.valueOf(i));
    }

    public HiHealthDictType d(int i) {
        return this.h.get(Integer.valueOf(i));
    }

    public HiHealthDictType e(int i) {
        return this.f12291b.get(Integer.valueOf(i));
    }

    public void e() {
        LogUtil.e("HiH_HiHealthDictionary", "start to generate validateExpressions.");
        List<HiHealthDictType> list = this.f12290a;
        if (list == null || list.isEmpty()) {
            LogUtil.c("HiH_HiHealthDictionary", "There is no dictTypes.");
            return;
        }
        for (HiHealthDictType hiHealthDictType : this.f12290a) {
            if (f(hiHealthDictType.l())) {
                HiHealthSportSequenceCommonFields.d(hiHealthDictType, HiHealthSportSequenceCommonFields.e());
                HiHealthSportSequenceCommonFields.a(hiHealthDictType);
            }
            hiHealthDictType.d();
        }
    }

    public void a() {
        LogUtil.e("HiH_HiHealthDictionary", "start to generate dict ids.");
        List<HiHealthDictType> list = this.f12290a;
        if (list == null || list.isEmpty()) {
            LogUtil.c("HiH_HiHealthDictionary", "There is no dictTypes.");
            return;
        }
        for (HiHealthDictType hiHealthDictType : this.f12290a) {
            Iterator<HiHealthDictField> it = hiHealthDictType.h().iterator();
            while (it.hasNext()) {
                it.next().a(hiHealthDictType.l());
            }
        }
    }

    public void d() {
        LogUtil.e("HiH_HiHealthDictionary", "start to generate cache maps.");
        for (HiHealthDictType hiHealthDictType : this.f12290a) {
            if (this.d.containsKey(Integer.valueOf(hiHealthDictType.l()))) {
                LogUtil.c("HiH_HiHealthDictionary", "Duplicated typeId for dictType:", hiHealthDictType.j());
                throw new IllegalArgumentException("Duplicated typeId for dictType:" + hiHealthDictType.j());
            }
            this.d.put(Integer.valueOf(hiHealthDictType.l()), hiHealthDictType);
            for (HiHealthDictField hiHealthDictField : hiHealthDictType.h()) {
                if (h(hiHealthDictField.e())) {
                    LogUtil.c("HiH_HiHealthDictionary", "Duplicated typeId for field:", hiHealthDictField.c());
                    throw new IllegalArgumentException("Duplicated typeId for field:" + hiHealthDictField.c());
                }
                this.e.put(Integer.valueOf(hiHealthDictField.e()), hiHealthDictField);
                this.f12291b.put(Integer.valueOf(hiHealthDictField.e()), hiHealthDictType);
                if (hiHealthDictField.j() != null) {
                    for (HiHealthDictStat hiHealthDictStat : hiHealthDictField.j()) {
                        if (h(hiHealthDictStat.c())) {
                            LogUtil.c("HiH_HiHealthDictionary", "Duplicated typeId for stat:", hiHealthDictStat.a());
                            throw new IllegalArgumentException("Duplicated typeId for stat:" + hiHealthDictStat.a());
                        }
                        this.f12292c.put(Integer.valueOf(hiHealthDictStat.c()), hiHealthDictStat);
                        this.h.put(Integer.valueOf(hiHealthDictStat.c()), hiHealthDictType);
                    }
                }
            }
            hiHealthDictType.e();
        }
    }

    public boolean g() {
        int i = this.g;
        if (i < 0) {
            LogUtil.c("HiH_HiHealthDictionary", "dict version error:", Integer.valueOf(i));
            return false;
        }
        List<HiHealthDictType> list = this.f12290a;
        if (list == null || list.isEmpty()) {
            LogUtil.c("HiH_HiHealthDictionary", "dictTypes is null or empty.");
            return false;
        }
        Iterator<HiHealthDictType> it = this.f12290a.iterator();
        while (it.hasNext()) {
            if (!it.next().m()) {
                LogUtil.c("HiH_HiHealthDictionary", "dictType data is illegal.");
                return false;
            }
        }
        return true;
    }

    public int h() {
        return this.g;
    }

    public void i(int i) {
        this.g = i;
    }

    private Map<Integer, HiHealthDictType> i() {
        return this.d;
    }

    private boolean h(int i) {
        return this.e.containsKey(Integer.valueOf(i)) || this.f12292c.containsKey(Integer.valueOf(i));
    }
}
