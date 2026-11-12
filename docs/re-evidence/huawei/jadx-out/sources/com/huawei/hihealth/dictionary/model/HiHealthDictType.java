package com.huawei.hihealth.dictionary.model;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.dictionary.expression.Expression;
import com.huawei.hihealth.dictionary.expression.Pattern;
import com.huawei.hihealth.dictionary.utils.DictUtils;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public class HiHealthDictType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("commonStatTypes")
    private int[] f12287b;

    @SerializedName("category")
    private int d;

    @SerializedName("mergeMode")
    private HiHealthDictMergeMode f;

    @SerializedName("name")
    private String g;

    @SerializedName("sensitivityLevel")
    private int i;

    @SerializedName("mergePolicy")
    private String j;
    private transient List<Expression> k;

    @SerializedName("validatePolicies")
    private List<String> l;

    @SerializedName("subType")
    private int m;

    @SerializedName("type")
    private int n;

    @SerializedName("typeId")
    private int o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("delaySecondToDelete")
    private int f12286a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fields")
    private List<HiHealthDictField> f12288c = new ArrayList();
    private transient Map<String, HiHealthDictField> h = new ArrayMap();
    private transient SparseArray<HiHealthDictField> e = new SparseArray<>();

    public HiHealthDictField e(String str) {
        return this.h.get(str);
    }

    public void e() {
        LogUtil.e("HiH_HiHealthDictType", "start to generate field map.");
        for (HiHealthDictField hiHealthDictField : this.f12288c) {
            this.h.put(hiHealthDictField.c(), hiHealthDictField);
            this.e.put(hiHealthDictField.e(), hiHealthDictField);
        }
    }

    public void d() {
        if (this.f12288c == null) {
            LogUtil.a("HiH_HiHealthDictType", "mValidatePolicies is null or empty.");
            return;
        }
        HashMap map = new HashMap();
        for (HiHealthDictField hiHealthDictField : this.f12288c) {
            if (hiHealthDictField != null && hiHealthDictField.f() != null && !hiHealthDictField.f().isEmpty()) {
                map.put(hiHealthDictField.c(), Pattern.b(hiHealthDictField.f()));
            }
        }
        List<String> list = this.l;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = this.l.iterator();
            while (it.hasNext()) {
                Expression expressionB = Pattern.b(it.next());
                Set<String> setC = expressionB.c();
                if (!setC.isEmpty() && setC.iterator().hasNext()) {
                    map.putIfAbsent(setC.iterator().next(), expressionB);
                }
            }
        }
        this.k = new ArrayList();
        map.forEach(new BiConsumer() { // from class: com.huawei.hihealth.dictionary.model.HiHealthDictType$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f12289a.d((String) obj, (Expression) obj2);
            }
        });
    }

    /* synthetic */ void d(String str, Expression expression) {
        this.k.add(expression);
    }

    public boolean d(Map<String, Double> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.d("HiH_HiHealthDictType", "paramsMap is null or empty.");
            return false;
        }
        List<Expression> list = this.k;
        if (list == null || list.isEmpty()) {
            LogUtil.e("HiH_HiHealthDictType", "mValidateExpressions is null or empty.");
            return true;
        }
        for (Expression expression : this.k) {
            if (map.keySet().containsAll(expression.c()) && !expression.a(map)) {
                LogUtil.a("HiH_HiHealthDictType", "expression = ", expression.c());
                return false;
            }
        }
        return true;
    }

    public boolean m() {
        if (!DictUtils.e(this.g)) {
            LogUtil.c("HiH_HiHealthDictType", "name is illegal: ", this.g);
            return false;
        }
        if (!HealthDataCategory.validate(Integer.valueOf(this.d))) {
            LogUtil.c("HiH_HiHealthDictType", "category is illegal: ", Integer.valueOf(this.d));
            return false;
        }
        HiHealthDictMergeMode hiHealthDictMergeMode = this.f;
        if (hiHealthDictMergeMode != null && (!HealthDataMergePolicy.validate(hiHealthDictMergeMode.c()) || !HealthDataMergePolicy.validate(this.f.e()))) {
            LogUtil.c("HiH_HiHealthDictType", "mergePolicy is illegal: ", this.j);
            return false;
        }
        if (!SensitivityLevel.validate(Integer.valueOf(this.i))) {
            LogUtil.c("HiH_HiHealthDictType", "sensitivityLevel is illegal: ", Integer.valueOf(this.i));
            return false;
        }
        if (!HealthDataType.validate(Integer.valueOf(this.n))) {
            LogUtil.c("HiH_HiHealthDictType", "type is illegal: ", Integer.valueOf(this.n));
            return false;
        }
        for (HiHealthDictField hiHealthDictField : this.f12288c) {
            if (!hiHealthDictField.i()) {
                LogUtil.c("HiH_HiHealthDictType", "field data is illegal: ", hiHealthDictField.c());
                return false;
            }
        }
        return true;
    }

    public int l() {
        return this.o;
    }

    public int i() {
        return this.m;
    }

    public String j() {
        return this.g;
    }

    public int c() {
        return this.d;
    }

    public int g() {
        return this.i;
    }

    public int b() {
        return this.f12286a;
    }

    public int[] a() {
        return (int[]) this.f12287b.clone();
    }

    public HiHealthDictMergeMode f() {
        return this.f;
    }

    public List<HiHealthDictField> h() {
        return this.f12288c;
    }

    public void d(List<HiHealthDictField> list) {
        this.f12288c = list;
    }
}
