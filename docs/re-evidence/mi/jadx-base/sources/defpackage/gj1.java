package defpackage;

import com.xiaomi.fitness.sync.model.EventRecurrence;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f19043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19044b = EventRecurrence.TH;

    public gj1() {
    }

    public int a() {
        return this.f19044b;
    }

    public Object[] b() {
        return this.f19043a;
    }

    public fai c(int i) {
        Object[] objArr = this.f19043a;
        fai faiVar = (fai) objArr[objArr.length - 1];
        faiVar.e(this);
        this.f19044b = i;
        return faiVar;
    }

    public abstract Object d(Object[] objArr) throws Throwable;

    public gj1(Object[] objArr) {
        this.f19043a = objArr;
    }
}
