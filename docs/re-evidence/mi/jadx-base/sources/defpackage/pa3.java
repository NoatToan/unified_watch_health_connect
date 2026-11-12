package defpackage;

import com.xiaomi.idm.exception.IDMException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes11.dex */
public class pa3<T> extends o1p<T> {
    private a<T> mCallBck = null;

    public interface a<T> {
        void onFailed(pa3<T> pa3Var, Throwable th);

        void onResponse(pa3<T> pa3Var, T t);
    }

    public static <T> pa3<T> failed(Throwable th) {
        return new pa3().setFailed(th);
    }

    public static <T> pa3<T> success(T t) {
        return new pa3().setDone(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCallBack(a<T> aVar) {
        this.mCallBck = aVar;
        if (super.isDone()) {
            try {
                setDone(super.get());
            } catch (InterruptedException | ExecutionException e) {
                setFailed(IDMException.asIDMException(e));
            }
        }
    }

    public pa3<T> setDone(T t) {
        a<T> aVar = this.mCallBck;
        if (aVar != null) {
            aVar.onResponse(this, t);
        }
        super.obtrudeValue(t, false);
        this.mCallBck = null;
        return this;
    }

    public pa3<T> setFailed(Throwable th) {
        a<T> aVar = this.mCallBck;
        if (aVar != null) {
            aVar.onFailed(this, th);
        }
        super.obtrudeException(th, false);
        this.mCallBck = null;
        return this;
    }
}
