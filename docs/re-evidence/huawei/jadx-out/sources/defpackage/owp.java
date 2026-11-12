package defpackage;

import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.pluginachievement.report.iterface.PageAccessible;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class owp implements PageAccessible {
    @Override // com.huawei.pluginachievement.report.iterface.PageAccessible
    public List<String> getAnnualPageByYear() {
        return new ArrayList();
    }

    @Override // com.huawei.pluginachievement.report.iterface.PageAccessible
    public List<Integer> getAnnualPageArrayByType(String str) {
        return new ArrayList(2);
    }

    @Override // com.huawei.pluginachievement.report.iterface.PageAccessible
    public Task<Void> calculateAnnualData(final int i) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: owp.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() {
                CommonUtil.d("Annual2019", "compute start");
                owp owpVar = owp.this;
                Task taskA = owpVar.a((Callable<Void>) owpVar.d(i));
                CountDownLatch countDownLatch = new CountDownLatch(5);
                owp.this.d((Task<Void>) taskA, countDownLatch);
                owp owpVar2 = owp.this;
                owp.this.d((Task<Void>) owpVar2.a((Callable<Void>) owpVar2.b(i)), countDownLatch);
                owp owpVar3 = owp.this;
                owp.this.d((Task<Void>) owpVar3.a((Callable<Void>) owpVar3.c(i)), countDownLatch);
                owp owpVar4 = owp.this;
                owp.this.d((Task<Void>) owpVar4.a((Callable<Void>) owpVar4.e(i)), countDownLatch);
                owp owpVar5 = owp.this;
                owp.this.d((Task<Void>) owpVar5.a((Callable<Void>) owpVar5.i(i)), countDownLatch);
                new ovn().a(i);
                oxi.d(countDownLatch, 8000L);
                CommonUtil.d("Annual2019", "compute end!");
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Task<Void> task, final CountDownLatch countDownLatch) {
        task.addOnCompleteListener(new OnCompleteListener<Void>() { // from class: owp.4
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<Void> task2) {
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> a(Callable<Void> callable) {
        return Tasks.callInBackground(callable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> b(final int i) {
        return new Callable<Void>() { // from class: owp.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void call() {
                ovx ovxVar = new ovx();
                ovxVar.d(2);
                ovxVar.b(2015, i);
                ovxVar.d();
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> d(final int i) {
        return new Callable() { // from class: owo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return owp.a(i);
            }
        };
    }

    static /* synthetic */ Void a(int i) throws Exception {
        new ovz().compute(i);
        new owc().compute(i);
        new ouy().compute(i);
        new oup().compute(i);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> c(final int i) {
        return new Callable<Void>() { // from class: owp.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovc().d(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> i(final int i) {
        return new Callable<Void>() { // from class: owp.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovw().d(i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Void> e(final int i) {
        return new Callable<Void>() { // from class: owp.8
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new ovd().b(i);
                return null;
            }
        };
    }
}
