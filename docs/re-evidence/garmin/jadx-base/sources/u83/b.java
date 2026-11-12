package u83;

import j83.f;
import o83.e;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes11.dex */
public class b<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<? super T> f169500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f169501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f169502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f169503d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f169504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f169505b;

        public final void a(Object obj) {
            int i14 = this.f169505b;
            Object[] objArr = this.f169504a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f169504a = objArr;
            } else if (i14 == objArr.length) {
                Object[] objArr2 = new Object[(i14 >> 2) + i14];
                System.arraycopy(objArr, 0, objArr2, 0, i14);
                this.f169504a = objArr2;
                objArr = objArr2;
            }
            objArr[i14] = obj;
            this.f169505b = i14 + 1;
        }
    }

    public b(f<? super T> fVar) {
        this.f169500a = fVar;
    }

    @Override // j83.f
    public final void a() {
        if (this.f169502c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f169502c) {
                    return;
                }
                this.f169502c = true;
                if (!this.f169501b) {
                    this.f169501b = true;
                    this.f169500a.a();
                    return;
                }
                a aVar = this.f169503d;
                if (aVar == null) {
                    aVar = new a();
                    this.f169503d = aVar;
                }
                aVar.a(e.f130873a);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // j83.f
    public final void c(T t7) {
        if (this.f169502c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f169502c) {
                    return;
                }
                if (this.f169501b) {
                    a aVar = this.f169503d;
                    if (aVar == null) {
                        aVar = new a();
                        this.f169503d = aVar;
                    }
                    if (t7 == null) {
                        t7 = (T) e.f130874b;
                    } else {
                        e.a aVar2 = e.f130873a;
                    }
                    aVar.a(t7);
                    return;
                }
                this.f169501b = true;
                try {
                    this.f169500a.c(t7);
                    while (true) {
                        synchronized (this) {
                            try {
                                a aVar3 = this.f169503d;
                                if (aVar3 == null) {
                                    this.f169501b = false;
                                    return;
                                }
                                this.f169503d = null;
                                for (Object obj : aVar3.f169504a) {
                                    if (obj == null) {
                                        break;
                                    }
                                    try {
                                        if (e.a(this.f169500a, obj)) {
                                            this.f169502c = true;
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        this.f169502c = true;
                                        m83.a.b(th3);
                                        this.f169500a.onError(OnErrorThrowable.addValueAsLastCause(th3, t7));
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    this.f169502c = true;
                    f<? super T> fVar = this.f169500a;
                    m83.a.b(th5);
                    fVar.onError(OnErrorThrowable.addValueAsLastCause(th5, t7));
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // j83.f
    public final void onError(Throwable th3) {
        m83.a.b(th3);
        if (this.f169502c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f169502c) {
                    return;
                }
                this.f169502c = true;
                if (!this.f169501b) {
                    this.f169501b = true;
                    this.f169500a.onError(th3);
                    return;
                }
                a aVar = this.f169503d;
                if (aVar == null) {
                    aVar = new a();
                    this.f169503d = aVar;
                }
                e.a aVar2 = e.f130873a;
                aVar.a(new e.c(th3));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
