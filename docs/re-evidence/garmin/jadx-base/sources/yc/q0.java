package yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/q0;", "T", "", "Lkotlin/Function1;", "", "callbackInvoker", "Lkotlin/Function0;", "", "invalidGetter", "<init>", "(Le23/l;Le23/a;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<T, Unit> f196323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Boolean> f196324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f196325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f196326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f196327e;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(e23.l<? super T, Unit> lVar, e23.a<Boolean> aVar) {
        lVar.getClass();
        this.f196323a = lVar;
        this.f196324b = aVar;
        this.f196325c = new ReentrantLock();
        this.f196326d = new ArrayList();
    }

    public final boolean a() {
        ArrayList arrayList = this.f196326d;
        if (this.f196327e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f196325c;
        try {
            reentrantLock.lock();
            if (this.f196327e) {
                reentrantLock.unlock();
                return false;
            }
            this.f196327e = true;
            List listB1 = p13.h0.b1(arrayList);
            arrayList.clear();
            reentrantLock.unlock();
            Iterator<T> it = listB1.iterator();
            while (it.hasNext()) {
                this.f196323a.invoke(it.next());
            }
            return true;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void b(T t7) {
        boolean z14 = true;
        e23.a<Boolean> aVar = this.f196324b;
        if (aVar != null && aVar.invoke().booleanValue()) {
            a();
        }
        boolean z15 = this.f196327e;
        e23.l<T, Unit> lVar = this.f196323a;
        if (z15) {
            lVar.invoke(t7);
            return;
        }
        ReentrantLock reentrantLock = this.f196325c;
        try {
            reentrantLock.lock();
            if (!this.f196327e) {
                this.f196326d.add(t7);
                z14 = false;
            }
            if (z14) {
                lVar.invoke(t7);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(T t7) {
        ReentrantLock reentrantLock = this.f196325c;
        try {
            reentrantLock.lock();
            this.f196326d.remove(t7);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ q0(e23.l lVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, (i14 & 2) != 0 ? null : aVar);
    }
}
