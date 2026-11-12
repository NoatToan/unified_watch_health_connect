package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class kie {

    /* JADX INFO: Add missing generic type declarations: [In] */
    public class a<In> implements Observer<In> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Out f23880a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1p f23881b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Function d;
        public final /* synthetic */ gmf e;

        /* JADX INFO: renamed from: kie$a$a, reason: collision with other inner class name */
        public class RunnableC0991a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f23882a;

            public RunnableC0991a(Object obj) {
                this.f23882a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.c) {
                    try {
                        ?? Apply = a.this.d.apply(this.f23882a);
                        a aVar = a.this;
                        Out out = aVar.f23880a;
                        if (out == 0 && Apply != 0) {
                            aVar.f23880a = Apply;
                            aVar.e.postValue(Apply);
                        } else if (out != 0 && !out.equals(Apply)) {
                            a aVar2 = a.this;
                            aVar2.f23880a = Apply;
                            aVar2.e.postValue(Apply);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public a(m1p m1pVar, Object obj, Function function, gmf gmfVar) {
            this.f23881b = m1pVar;
            this.c = obj;
            this.d = function;
            this.e = gmfVar;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(In in) {
            this.f23881b.b(new RunnableC0991a(in));
        }
    }

    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> a(LiveData<In> liveData, Function<In, Out> function, m1p m1pVar) {
        Object obj = new Object();
        gmf gmfVar = new gmf();
        gmfVar.addSource(liveData, new a(m1pVar, obj, function, gmfVar));
        return gmfVar;
    }
}
