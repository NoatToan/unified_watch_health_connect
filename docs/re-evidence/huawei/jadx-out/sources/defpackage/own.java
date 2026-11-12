package defpackage;

import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.PageAccessible;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class own implements PageAccessible {
    @Override // com.huawei.pluginachievement.report.iterface.PageAccessible
    public List<String> getAnnualPageByYear() {
        return owd.b();
    }

    @Override // com.huawei.pluginachievement.report.iterface.PageAccessible
    public List<Integer> getAnnualPageArrayByType(String str) {
        List<owf> listD = owd.d(str);
        if (!njy.e(listD)) {
            ArrayList arrayList = new ArrayList(listD.size());
            for (int i = 0; i < listD.size(); i++) {
                arrayList.add(Integer.valueOf(listD.get(i).e()));
            }
            return arrayList;
        }
        return new ArrayList(2);
    }

    @Override // com.huawei.pluginachievement.report.iterface.PageAccessible
    public Task<Void> calculateAnnualData(final int i) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: own.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                CommonUtil.d("Annual2020", "compute start");
                CountDownLatch countDownLatch = new CountDownLatch(10);
                own ownVar = own.this;
                ownVar.c((Task<Void>) ownVar.e((Callable<Void>) ownVar.j(i)), countDownLatch);
                own ownVar2 = own.this;
                ownVar2.c((Task<Void>) ownVar2.e((Callable<Void>) ownVar2.l(i)), countDownLatch);
                own ownVar3 = own.this;
                ownVar3.c((Task<Void>) ownVar3.e((Callable<Void>) ownVar3.i(i)), countDownLatch);
                own ownVar4 = own.this;
                ownVar4.c((Task<Void>) ownVar4.e((Callable<Void>) ownVar4.g(i)), countDownLatch);
                own ownVar5 = own.this;
                ownVar5.c((Task<Void>) ownVar5.e((Callable<Void>) ownVar5.k(i)), countDownLatch);
                own ownVar6 = own.this;
                ownVar6.c((Task<Void>) ownVar6.e((Callable<Void>) ownVar6.h(i)), countDownLatch);
                own ownVar7 = own.this;
                ownVar7.c((Task<Void>) ownVar7.e((Callable<Void>) ownVar7.f(i)), countDownLatch);
                own ownVar8 = own.this;
                ownVar8.c((Task<Void>) ownVar8.e((Callable<Void>) ownVar8.b(i)), countDownLatch);
                own ownVar9 = own.this;
                ownVar9.c((Task<Void>) ownVar9.e((Callable<Void>) ownVar9.o(i)), countDownLatch);
                own ownVar10 = own.this;
                ownVar10.c((Task<Void>) ownVar10.e((Callable<Void>) ownVar10.a(i)), countDownLatch);
                oxi.d(countDownLatch, 8000L);
                CommonUtil.d("Annual2020", "compute end");
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Task<Void> task, final CountDownLatch countDownLatch) {
        task.addOnCompleteListener(new OnCompleteListener<Void>() { // from class: own.2
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<Void> task2) {
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> e(Callable<Void> callable) {
        return Tasks.callInBackground(callable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> k(final int i) {
        return new Callable<Void>() { // from class: own.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovw().compute(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> g(final int i) {
        return new Callable<Void>() { // from class: own.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovd().d(i);
                new ovi().compute(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> i(final int i) {
        return new Callable<Void>() { // from class: own.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovc().compute(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> l(final int i) {
        return new Callable<Void>() { // from class: own.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                ovx ovxVar = new ovx();
                ovxVar.d(i >= 2022 ? 3 : 2);
                int i2 = i;
                ovxVar.b(i2 - 1, i2);
                ovxVar.d();
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> j(final int i) {
        return new Callable<Void>() { // from class: own.7
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovz().compute(i);
                new owc().c(i);
                new oux().compute(i);
                new ouv().compute(i);
                if (i < 2025) {
                    return null;
                }
                new ovh().compute(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> h(final int i) {
        return new Callable<Void>() { // from class: own.9
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new oup().compute(i);
                new ovv().compute(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> f(final int i) {
        return new Callable() { // from class: owv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return own.c(i);
            }
        };
    }

    static /* synthetic */ Void c(int i) throws Exception {
        LogUtil.a("Annual2020", "makeInitialCallable start");
        ovn ovnVar = new ovn();
        ovnVar.compute(i);
        ovnVar.insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 6006, ovnVar.getStarAcquired());
        ovnVar.clearStarData();
        LogUtil.a("Annual2020", "makeInitialCallable end");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> b(final int i) {
        return new Callable() { // from class: owq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return own.e(i);
            }
        };
    }

    static /* synthetic */ Void e(int i) throws Exception {
        if (i < 2022) {
            return null;
        }
        LogUtil.a("Annual2020", "make2022DataTaskCallable start");
        new ova().compute(i);
        new ovg().compute(i);
        LogUtil.a("Annual2020", "make2022DataTaskCallable end");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> o(final int i) {
        return new Callable<Void>() { // from class: own.8
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                if (i < 2023) {
                    return null;
                }
                new ovp().compute(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> a(final int i) {
        return new Callable() { // from class: owr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return own.d(i);
            }
        };
    }

    static /* synthetic */ Void d(int i) throws Exception {
        if (i <= 2023) {
            return null;
        }
        LogUtil.a("Annual2020", "make2024DataTaskCallable start");
        new ovb().compute(i);
        new ous().compute(i);
        new ovj().compute(i);
        LogUtil.a("Annual2020", "make2024DataTaskCallable end");
        return null;
    }
}
