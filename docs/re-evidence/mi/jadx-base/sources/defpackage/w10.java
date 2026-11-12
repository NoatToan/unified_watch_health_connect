package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w10<I, O, F, T> extends hz9.a<O> implements Runnable {
    public lhe<? extends I> h;
    public F i;

    public static final class a<I, O> extends w10<I, O, dua<? super I, ? extends O>, O> {
        public a(lhe<? extends I> lheVar, dua<? super I, ? extends O> duaVar) {
            super(lheVar, duaVar);
        }

        @Override // defpackage.w10
        public void H(O o) {
            B(o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.w10
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public O G(dua<? super I, ? extends O> duaVar, I i) {
            return duaVar.apply(i);
        }
    }

    public w10(lhe<? extends I> lheVar, F f) {
        this.h = (lhe) c6i.o(lheVar);
        this.i = (F) c6i.o(f);
    }

    public static <I, O> lhe<O> F(lhe<I> lheVar, dua<? super I, ? extends O> duaVar, Executor executor) {
        c6i.o(duaVar);
        a aVar = new a(lheVar, duaVar);
        lheVar.addListener(aVar, c8g.b(executor, aVar));
        return aVar;
    }

    public abstract T G(F f, I i) throws Exception;

    public abstract void H(T t);

    @Override // defpackage.t00
    public final void m() {
        x(this.h);
        this.h = null;
        this.i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        lhe<? extends I> lheVar = this.h;
        F f = this.i;
        if ((isCancelled() | (lheVar == null)) || (f == null)) {
            return;
        }
        this.h = null;
        if (lheVar.isCancelled()) {
            D(lheVar);
            return;
        }
        try {
            try {
                Object objG = G(f, pua.b(lheVar));
                this.i = null;
                H(objG);
            } catch (Throwable th) {
                try {
                    C(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            C(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            C(e2);
        } catch (ExecutionException e3) {
            C(e3.getCause());
        }
    }

    @Override // defpackage.t00
    public String y() {
        String string;
        lhe<? extends I> lheVar = this.h;
        F f = this.i;
        String strY = super.y();
        if (lheVar != null) {
            String strValueOf = String.valueOf(lheVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (f == null) {
            if (strY == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strY.length() != 0 ? strValueOf2.concat(strY) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf3);
        sb2.append("]");
        return sb2.toString();
    }
}
