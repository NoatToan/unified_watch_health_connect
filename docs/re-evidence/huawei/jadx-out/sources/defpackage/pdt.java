package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pdt implements Serializable, Cloneable {
    private static final long serialVersionUID = 5886445939023550795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("courseList")
    private List<CourseDataBean> f45209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recordList")
    private List<pdr> f45210b;

    @SerializedName("clockFlag")
    private int d;

    @SerializedName("dayNumber")
    private int e;

    public void c(List<CourseDataBean> list) {
        this.f45209a = list;
    }

    public List<CourseDataBean> a() {
        return this.f45209a;
    }

    public void d(int i) {
        this.e = i;
    }

    public int d() {
        return this.e;
    }

    public boolean c() {
        return this.d == 1;
    }

    private void e(List<pdr> list) {
        this.f45210b = list;
    }

    public List<pdr> e() {
        return this.f45210b;
    }

    public void a(boolean z) {
        if (z) {
            this.d = 1;
        } else {
            this.d = 0;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            if (!(super.clone() instanceof pdt)) {
                return new pdt();
            }
            pdt pdtVar = (pdt) super.clone();
            if (this.f45209a != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<CourseDataBean> it = this.f45209a.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                pdtVar.c(arrayList);
            }
            if (this.f45210b != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<pdr> it2 = this.f45210b.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
                pdtVar.e(arrayList2);
            }
            return pdtVar;
        } catch (CloneNotSupportedException e) {
            LogUtil.d("PlanDayDataBean clone failed", LogAnonymous.b(e));
            throw new AssertionError();
        }
    }
}
