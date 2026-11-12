package com.huawei.health.knit.ui;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fts;
import defpackage.fvz;
import defpackage.njy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class KnitSectionRecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KnitFragment f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Consumer<Boolean> f8006b;
    private final List<SectionBean> j = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<SectionBean> f8007c = new ArrayList();
    private final SparseBooleanArray d = new SparseBooleanArray();
    private boolean e = false;

    public KnitSectionRecyclerAdapter(KnitFragment knitFragment) {
        this.f8005a = knitFragment;
    }

    public boolean c() {
        return njy.b(this.j);
    }

    public List<SectionBean> e() {
        return this.f8007c;
    }

    public void d(final List<SectionBean> list) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: fwq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34648a.b(list);
                }
            });
            return;
        }
        this.j.clear();
        this.j.addAll(list);
        this.f8007c.clear();
        for (SectionBean sectionBean : this.j) {
            if (sectionBean.r() && !sectionBean.p()) {
                this.f8007c.add(sectionBean);
            }
        }
        notifyDataSetChanged();
    }

    public /* synthetic */ void b(List list) {
        d((List<SectionBean>) list);
    }

    public void d(final List<SectionBean> list, final Consumer<Boolean> consumer) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: fwt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(list, consumer);
                }
            });
            return;
        }
        e(list, consumer);
        this.j.clear();
        this.j.addAll(list);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (SectionBean sectionBean : this.j) {
            if (this.f8007c.contains(sectionBean)) {
                arrayList.add(sectionBean);
            }
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.put((SectionBean) arrayList.get(i2), Integer.valueOf(i2));
        }
        int i3 = 0;
        while (i3 < this.f8007c.size()) {
            Integer num = (Integer) map.get(this.f8007c.get(i3));
            if (num == null) {
                LogUtil.e("KnitSectionRecyclerAdapter", "failed to find pos for activeBean, continue!");
            } else {
                int iIntValue = num.intValue();
                if (i3 != iIntValue) {
                    Collections.swap(this.f8007c, i3, iIntValue);
                }
            }
            i3++;
        }
        for (SectionBean sectionBean2 : this.j) {
            if (!this.f8007c.contains(sectionBean2)) {
                if (sectionBean2.r() && !sectionBean2.p()) {
                    this.f8007c.add(i, sectionBean2);
                }
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (SectionBean sectionBean3 : this.f8007c) {
            if (sectionBean3 != null && sectionBean3.r()) {
                arrayList2.add(sectionBean3);
            }
        }
        this.f8007c.clear();
        this.f8007c.addAll(arrayList2);
        notifyDataSetChanged();
    }

    public /* synthetic */ void b(List list, Consumer consumer) {
        d((List<SectionBean>) list, (Consumer<Boolean>) consumer);
    }

    private void e(List<SectionBean> list, Consumer<Boolean> consumer) {
        this.f8006b = consumer;
        if (consumer != null) {
            this.d.clear();
            for (int i = 0; i < list.size(); i++) {
                this.d.put(i, !list.get(i).t());
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(final SectionBean sectionBean) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: fwl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34640c.c(sectionBean);
                }
            });
            return;
        }
        SectionBean.Operation operationF = sectionBean.f();
        int i = AnonymousClass4.f8009a[operationF.ordinal()];
        if (i == 1 || i == 2) {
            a(sectionBean, operationF);
        } else if (i == 3) {
            a(sectionBean);
        } else {
            LogUtil.e("KnitSectionRecyclerAdapter", "updateItem failed cause operation type is unknown");
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.knit.ui.KnitSectionRecyclerAdapter$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8009a;

        static {
            int[] iArr = new int[SectionBean.Operation.values().length];
            f8009a = iArr;
            try {
                iArr[SectionBean.Operation.CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8009a[SectionBean.Operation.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8009a[SectionBean.Operation.INSERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8009a[SectionBean.Operation.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void a(SectionBean sectionBean) {
        LogUtil.a("KnitSectionRecyclerAdapter", "processItemInsert");
        if (this.f8007c.contains(sectionBean)) {
            LogUtil.e("KnitSectionRecyclerAdapter", "no need to processItemInsert for ", sectionBean);
            return;
        }
        if (!sectionBean.r()) {
            LogUtil.e("KnitSectionRecyclerAdapter", "no active not processItemInsert for ", sectionBean);
            return;
        }
        int i = 0;
        for (SectionBean sectionBean2 : this.j) {
            if (this.f8007c.contains(sectionBean2)) {
                i++;
            }
            if (sectionBean2 == sectionBean) {
                this.f8007c.add(i, sectionBean);
                notifyItemInserted(i);
                return;
            }
        }
    }

    private void a(SectionBean sectionBean, SectionBean.Operation operation) {
        LogUtil.a("KnitSectionRecyclerAdapter", "processItemChangeOrRemove");
        for (int i = 0; i < this.f8007c.size(); i++) {
            if (this.f8007c.get(i) == sectionBean) {
                if (operation == SectionBean.Operation.CHANGE) {
                    notifyItemChanged(i);
                    return;
                } else if (operation == SectionBean.Operation.REMOVE) {
                    this.f8007c.remove(i);
                    notifyItemRemoved(i);
                    return;
                } else {
                    LogUtil.e("KnitSectionRecyclerAdapter", "processItemChangeOrRemove failed, cause operation is ", operation);
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        SectionBean sectionBeanB = b(i);
        if (sectionBeanB != null) {
            return sectionBeanB.hashCode();
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("KnitSectionRecyclerAdapter", "onCreateViewHolder, viewType: ", Integer.valueOf(i));
        BaseSection baseSectionA = fts.a(this.f8005a.getActivity(), fvz.e(i));
        if (baseSectionA != null) {
            baseSectionA.initView(this.f8005a, i);
        }
        return new BaseViewHolder(baseSectionA);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        LogUtil.a("KnitSectionRecyclerAdapter", "onBindViewHolder, position: ", Integer.valueOf(i));
        SectionBean sectionBeanB = b(i);
        if (sectionBeanB.i() == null) {
            sectionBeanB.b((Consumer<Boolean>) new e(this, i));
            baseViewHolder.d(sectionBeanB, true);
        } else {
            baseViewHolder.d(sectionBeanB, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.e || this.d.indexOfKey(i) < 0 || this.d.get(i)) {
            return;
        }
        this.d.put(i, true);
        LogUtil.a("KnitSectionRecyclerAdapter", "checkAllSectionsDone at : ", Integer.valueOf(i));
        int i2 = 0;
        while (i2 < this.d.size()) {
            SparseBooleanArray sparseBooleanArray = this.d;
            if (!sparseBooleanArray.get(sparseBooleanArray.keyAt(i2), false)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < this.d.size() || this.f8006b == null) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.ui.KnitSectionRecyclerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                KnitSectionRecyclerAdapter.this.f8006b.accept(true);
            }
        });
        this.e = true;
    }

    public List<BaseSection> b() {
        WeakReference<BaseSection> weakReferenceK;
        BaseSection baseSection;
        ArrayList arrayList = new ArrayList();
        for (SectionBean sectionBean : this.f8007c) {
            if ("true".equals(sectionBean.x()) && (weakReferenceK = sectionBean.k()) != null && (baseSection = weakReferenceK.get()) != null) {
                arrayList.add(baseSection);
            }
        }
        for (SectionBean sectionBean2 : this.j) {
            if (!sectionBean2.r() && "true".equals(sectionBean2.x())) {
                int iL = sectionBean2.l();
                BaseSection baseSectionA = fts.a(this.f8005a.getActivity(), fvz.e(iL));
                if (baseSectionA != null) {
                    baseSectionA.initView(this.f8005a, iL);
                    baseSectionA.onBind(sectionBean2);
                    arrayList.add(baseSectionA);
                }
            }
        }
        return arrayList;
    }

    public List<Bitmap> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<SectionBean> it = this.f8007c.iterator();
        while (it.hasNext()) {
            List<Bitmap> listM = it.next().m();
            if (listM != null) {
                arrayList.addAll(listM);
            }
        }
        return arrayList;
    }

    public SectionBean b(int i) {
        if (njy.c(this.f8007c, i)) {
            return this.f8007c.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        SectionBean sectionBeanB = b(i);
        if (sectionBeanB != null) {
            return sectionBeanB.l();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8007c.size();
    }

    public void h() {
        BaseSection baseSection;
        LogUtil.a("KnitSectionRecyclerAdapter", "onDestroy");
        if (njy.e(this.j)) {
            LogUtil.a("KnitSectionRecyclerAdapter", "mTotalBeanList is empty");
            return;
        }
        for (SectionBean sectionBean : this.j) {
            if (sectionBean == null) {
                LogUtil.a("KnitSectionRecyclerAdapter", "section is null");
            } else {
                WeakReference<BaseSection> weakReferenceK = sectionBean.k();
                if (weakReferenceK != null && (baseSection = weakReferenceK.get()) != null) {
                    LogUtil.a("KnitSectionRecyclerAdapter", "onDestroy section: ", baseSection);
                    baseSection.clear();
                }
            }
        }
    }

    public void d() {
        this.j.clear();
        this.f8007c.clear();
    }

    public static class BaseViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BaseSection f8010a;

        public BaseViewHolder(BaseSection baseSection) {
            super(baseSection);
            this.f8010a = baseSection;
        }

        public void d(SectionBean sectionBean, boolean z) {
            if (z) {
                this.f8010a.getViewTreeObserver().addOnDrawListener(new b(sectionBean.i(), this.f8010a));
            }
            this.f8010a.onBind(sectionBean);
        }

        static final class b implements ViewTreeObserver.OnDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WeakReference<View> f8011b;
            private Consumer<Boolean> e;

            public b(Consumer<Boolean> consumer, View view) {
                this.e = consumer;
                this.f8011b = new WeakReference<>(view);
            }

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                Consumer<Boolean> consumer = this.e;
                if (consumer != null) {
                    consumer.accept(true);
                }
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.ui.KnitSectionRecyclerAdapter.BaseViewHolder.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        View view = (View) b.this.f8011b.get();
                        if (view == null) {
                            LogUtil.j("KnitSectionRecyclerAdapter", "view is null in HolderOnDrawListener onDraw.");
                        } else {
                            view.getViewTreeObserver().removeOnDrawListener(b.this);
                        }
                    }
                });
            }
        }
    }

    static final class e implements Consumer<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8013a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KnitSectionRecyclerAdapter> f8014c;

        public e(KnitSectionRecyclerAdapter knitSectionRecyclerAdapter, int i) {
            this.f8014c = new WeakReference<>(knitSectionRecyclerAdapter);
            this.f8013a = i;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void accept(Boolean bool) {
            KnitSectionRecyclerAdapter knitSectionRecyclerAdapter = this.f8014c.get();
            if (knitSectionRecyclerAdapter == null) {
                return;
            }
            knitSectionRecyclerAdapter.c(this.f8013a);
        }
    }
}
