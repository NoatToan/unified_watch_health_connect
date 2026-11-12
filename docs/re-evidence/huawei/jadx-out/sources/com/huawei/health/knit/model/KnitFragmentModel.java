package com.huawei.health.knit.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.model.KnitFragmentModel;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseDialog;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class KnitFragmentModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7212b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableLiveData<List<SectionBean>> f7213c;
    private final List<SectionBean> d;
    private final MutableLiveData<SectionBean> e;

    private boolean d(int i) {
        return i == 1005 || i == 1006 || i == 1007 || i == 1008 || i == 1009 || i == 1010 || i == 1011 || i == 1012 || i == 1013;
    }

    public KnitFragmentModel() {
        LogUtil.a("KnitFragmentModel", "KnitFragmentModel");
        this.d = new ArrayList();
        this.f7213c = new MutableLiveData<>();
        this.e = new MutableLiveData<>();
    }

    public void b(List<SectionBean> list) {
        LogUtil.a("KnitFragmentModel", "setSectionBeansListWithoutPost");
        if (njy.e(list)) {
            LogUtil.e("KnitFragmentModel", "do not setSectionBeans with empty or null beansList!");
            return;
        }
        a(list);
        j();
        Iterator<SectionBean> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        Collections.sort(this.d, new Comparator() { // from class: fon
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return KnitFragmentModel.b((SectionBean) obj, (SectionBean) obj2);
            }
        });
        g();
        for (SectionBean sectionBean : this.d) {
            LogUtil.a("KnitFragmentModel", "dp: ", sectionBean.c(), ", online data: ", sectionBean.j() == null ? Constants.NULL : "not null");
        }
    }

    public static /* synthetic */ int b(SectionBean sectionBean, SectionBean sectionBean2) {
        return sectionBean2.g() - sectionBean.g();
    }

    private void g() {
        ArrayList<SectionBean> arrayList = new ArrayList(this.d);
        this.d.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (SectionBean sectionBean : arrayList) {
            if (sectionBean != null) {
                int iL = sectionBean.l();
                if (d(sectionBean.o())) {
                    arrayList2.add(sectionBean);
                } else if (iL == 1033) {
                    arrayList3.add(sectionBean);
                } else {
                    this.d.add(sectionBean);
                }
            }
        }
        if (njy.b(arrayList2)) {
            this.d.addAll(0, arrayList2);
        }
        SectionBean sectionBeanD = d(arrayList3);
        if (sectionBeanD != null) {
            this.d.add(0, sectionBeanD);
        }
        this.d.addAll(0, e(arrayList3));
    }

    private List<SectionBean> e(List<SectionBean> list) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SectionBean sectionBean = list.get(i);
            if (sectionBean != null && sectionBean.n() == null) {
                arrayList.add(sectionBean);
            }
        }
        return arrayList;
    }

    private SectionBean d(List<SectionBean> list) {
        ResourceContentBase content;
        if (njy.e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SectionBean sectionBean = list.get(i);
            if (sectionBean != null) {
                ResourceBriefInfo resourceBriefInfoN = sectionBean.n();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (resourceBriefInfoN != null && jCurrentTimeMillis >= resourceBriefInfoN.getEffectiveTime() && jCurrentTimeMillis <= resourceBriefInfoN.getExpirationTime() && (content = resourceBriefInfoN.getContent()) != null && !TextUtils.isEmpty(content.getContent())) {
                    arrayList.add(sectionBean);
                }
            }
        }
        if (njy.e(arrayList)) {
            return null;
        }
        Collections.sort(arrayList, new Comparator<SectionBean>() { // from class: com.huawei.health.knit.model.KnitFragmentModel.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(SectionBean sectionBean2, SectionBean sectionBean3) {
                ResourceBriefInfo resourceBriefInfoN2 = sectionBean2.n();
                ResourceBriefInfo resourceBriefInfoN3 = sectionBean3.n();
                if (resourceBriefInfoN2.getPriority() == resourceBriefInfoN3.getPriority()) {
                    return Long.compare(resourceBriefInfoN3.getModifyTime(), resourceBriefInfoN2.getModifyTime());
                }
                return resourceBriefInfoN3.getPriority() - resourceBriefInfoN2.getPriority();
            }
        });
        LogUtil.a("KnitFragmentModel", "validList: ", arrayList);
        return (SectionBean) arrayList.get(0);
    }

    private void a(List<SectionBean> list) {
        SectionBean[] sectionBeanArr = (SectionBean[]) this.d.toArray(new SectionBean[0]);
        ArrayList arrayList = new ArrayList(this.d);
        for (SectionBean sectionBean : sectionBeanArr) {
            if (sectionBean != null && sectionBean.n() != null) {
                Iterator<SectionBean> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        SectionBean next = it.next();
                        if (next != null && next.n() != null && TextUtils.equals(next.n().getResourceId(), sectionBean.n().getResourceId())) {
                            break;
                        }
                    } else {
                        sectionBean.b(true);
                        break;
                    }
                }
            }
        }
        LogUtil.a("KnitFragmentModel", "onChanged init card list size: ", Integer.valueOf(list.size()), ", old card list size: ", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SectionBean sectionBean2 = list.get(i);
            LogUtil.d("KnitFragmentModel", "new card i = ", Integer.valueOf(i), ", newCard = ", sectionBean2);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                SectionBean sectionBean3 = (SectionBean) arrayList.get(i2);
                if (sectionBean2.l() == sectionBean3.l() && sectionBean3.n() == null) {
                    LogUtil.a("KnitFragmentModel", "find type = ", Integer.valueOf(sectionBean2.l()));
                    sectionBean3.e(sectionBean2);
                    break;
                } else {
                    if (sectionBean3.n() != null && sectionBean2.n() != null && TextUtils.equals(sectionBean3.n().getResourceId(), sectionBean2.n().getResourceId())) {
                        sectionBean3.e(sectionBean2);
                        break;
                    }
                    i2++;
                }
            }
            if (i2 >= arrayList.size()) {
                LogUtil.a("KnitFragmentModel", "onChanged not found at i = " + i + ", type = " + sectionBean2.l());
                arrayList2.add(Integer.valueOf(i));
            }
        }
        this.d.clear();
        this.d.addAll(arrayList);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            SectionBean sectionBean4 = list.get(((Integer) it2.next()).intValue());
            if (sectionBean4 != null && !sectionBean4.s()) {
                this.d.add(sectionBean4);
            }
        }
    }

    private void j() {
        SectionBean sectionBean = null;
        boolean z = false;
        boolean z2 = false;
        for (SectionBean sectionBean2 : this.d) {
            if (!z) {
                z = sectionBean2.l() == 31;
                sectionBean = sectionBean2;
            }
            if (!z2) {
                z2 = sectionBean2.l() == 61;
            }
        }
        if (z && z2) {
            sectionBean.c(SectionBean.Operation.REMOVE);
            this.d.remove(sectionBean);
            this.e.setValue(sectionBean);
        }
    }

    public List<SectionBean> a() {
        return this.d;
    }

    public void b(Context context, SectionBean.LoadReason loadReason) {
        LogUtil.a("KnitFragmentModel", "loadSectionBeans, loadReason: ", loadReason);
        for (int i = 0; i < this.d.size(); i++) {
            SectionBean sectionBean = this.d.get(i);
            if (sectionBean != null) {
                LogUtil.a("KnitFragmentModel", "dp: ", sectionBean.c());
                sectionBean.d(context, loadReason);
            }
        }
    }

    public void e(Context context) {
        for (int i = 0; i < this.d.size(); i++) {
            SectionBean sectionBean = this.d.get(i);
            if (sectionBean != null) {
                LogUtil.a("KnitFragmentModel", "dp: ", sectionBean.c());
                sectionBean.b(context);
            }
        }
    }

    public void b() {
        if (njy.e(this.d)) {
            return;
        }
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.w();
            }
        }
    }

    public void h() {
        LogUtil.a("KnitFragmentModel", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (njy.e(this.d)) {
            return;
        }
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.ad();
            }
        }
    }

    public void d() {
        LogUtil.a("KnitFragmentModel", "onConfigurationChanged");
        if (njy.e(this.d)) {
            return;
        }
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.v();
            }
        }
    }

    public void c() {
        if (njy.e(this.d)) {
            return;
        }
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.aa();
            }
        }
    }

    public void f() {
        if (njy.e(this.d)) {
            return;
        }
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.ac();
                KnitDataProvider knitDataProviderC = sectionBean.c();
                if (knitDataProviderC != null) {
                    knitDataProviderC.onStop();
                }
            }
        }
    }

    public void d(boolean z) {
        if (njy.e(this.d)) {
            return;
        }
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.d(z);
            }
        }
    }

    public void e(SectionBean sectionBean) {
        LogUtil.a("KnitFragmentModel", "updateSection");
        this.e.setValue(sectionBean);
    }

    public void e(LifecycleOwner lifecycleOwner, Observer<List<SectionBean>> observer) {
        LogUtil.a("KnitFragmentModel", "observeOverAll");
        this.f7213c.observe(lifecycleOwner, observer);
    }

    public void c(LifecycleOwner lifecycleOwner, Observer<SectionBean> observer) {
        LogUtil.a("KnitFragmentModel", "observeIndividual");
        this.e.observe(lifecycleOwner, observer);
    }

    public void a(LifecycleOwner lifecycleOwner, Observer<SectionBean> observer) {
        LogUtil.a("KnitFragmentModel", "unregisterAllObservers");
        this.f7213c.removeObservers(lifecycleOwner);
        this.e.removeObservers(lifecycleOwner);
        if (observer != null) {
            this.e.removeObserver(observer);
        }
    }

    public void b(LifecycleOwner lifecycleOwner, Observer<SectionBean> observer) {
        LogUtil.a("KnitFragmentModel", "onDestroy with lifecycleOwner");
        a(lifecycleOwner, observer);
        for (SectionBean sectionBean : this.d) {
            if (sectionBean != null) {
                sectionBean.u();
            }
        }
    }

    public void b(int i) {
        LogUtil.a("KnitFragmentModel", "updateGpsSignal");
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            SectionBean sectionBean = this.d.get(i2);
            if (sectionBean != null && sectionBean.l() == 62) {
                sectionBean.a(i);
            }
        }
    }

    public List<SectionBean> e() {
        return this.d;
    }

    public void b(Observer<SectionBean> observer) {
        this.e.observeForever(observer);
    }
}
