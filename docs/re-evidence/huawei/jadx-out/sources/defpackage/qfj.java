package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qfj extends qet {

    @SerializedName("schedules")
    private List<qfz> d;

    @SerializedName("metadata")
    private String e;

    public List<qfz> i() {
        return this.d;
    }

    public void b(List<qfz> list) {
        this.d = list;
    }

    public String b() {
        return this.e;
    }

    public void h(String str) {
        this.e = str;
    }

    public qep c() {
        if (TextUtils.isEmpty(this.e)) {
            return null;
        }
        return (qep) HiJsonUtil.d(this.e, qep.class);
    }

    public Map<String, Integer> d() {
        qep qepVarC = c();
        if (qepVarC == null) {
            return new HashMap();
        }
        return qepVarC.a();
    }

    public List<String> c(List<String> list) {
        if (CollectionUtils.a(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && c(str) == 1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public int a(List<String> list) {
        return c(list).size();
    }

    public List<String> h() {
        if (CollectionUtils.a(this.d)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (qfz qfzVar : this.d) {
            if (qfzVar != null) {
                arrayList.add(qfzVar.g());
            }
        }
        return arrayList;
    }

    public List<qfk> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        if (CollectionUtils.a(this.d)) {
            return Collections.EMPTY_LIST;
        }
        for (qfz qfzVar : this.d) {
            if (qfzVar != null && str.equals(qfzVar.g())) {
                return qfzVar.j();
            }
        }
        return Collections.EMPTY_LIST;
    }

    public qfz j(String str) {
        if (TextUtils.isEmpty(str) || CollectionUtils.a(this.d)) {
            return null;
        }
        for (qfz qfzVar : this.d) {
            if (qfzVar != null && str.equals(qfzVar.g())) {
                return qfzVar;
            }
        }
        return null;
    }

    public String e(String str) {
        List<qfk> listD = d(str);
        if (CollectionUtils.a(listD)) {
            return "";
        }
        for (qfk qfkVar : listD) {
            if (qfkVar != null) {
                return qfkVar.j();
            }
        }
        return "";
    }

    public String g(String str) {
        List<qfk> listD = d(str);
        if (CollectionUtils.a(listD)) {
            return "";
        }
        for (qfk qfkVar : listD) {
            if (qfkVar != null) {
                return qfkVar.aa();
            }
        }
        return "";
    }

    public int c(String str) {
        List<qfk> listD = d(str);
        if (CollectionUtils.a(listD)) {
            return 0;
        }
        for (qfk qfkVar : listD) {
            if (qfkVar != null) {
                return qfkVar.p();
            }
        }
        return 0;
    }

    public int b(String str) {
        List<qfk> listD = d(str);
        if (CollectionUtils.a(listD)) {
            return 0;
        }
        for (qfk qfkVar : listD) {
            if (qfkVar != null) {
                return qfkVar.z();
            }
        }
        return 0;
    }

    @Override // defpackage.qet
    public String toString() {
        return "QuerySchedulesResp{" + super.toString() + ",schedules=" + this.d + ", metadata='" + this.e + '}';
    }
}
