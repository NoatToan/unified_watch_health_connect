package defpackage;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sync.net.NoNetException;
import defpackage.ob2;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class u92<T extends ob2> extends drk<T> {
    @Override // defpackage.z5h
    public void onComplete() {
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        int iCode;
        if (((th instanceof ApiException) && ((ApiException) th).getErrorCode() == 10003) || (th instanceof NoNetException)) {
            iCode = 22223;
        } else {
            iCode = th instanceof HttpException ? ((HttpException) th).code() : 22222;
        }
        onFail(iCode, th.getMessage());
    }

    public abstract void onFail(int i, String str);

    @Override // defpackage.z5h
    public void onNext(T t) {
        if (t != null && t.oK()) {
            onSuccess(t);
            return;
        }
        if (t == null) {
            Logger.d("BaseObserver", "onNext: fail entity is null");
            onFail(11111, "entity is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onNext: fail ");
        sb.append(t.getCode());
        sb.append("  ");
        sb.append(TextUtils.isEmpty(t.getMsg()) ? "msg is empty" : t.getMsg());
        Logger.d("BaseObserver", sb.toString());
        onFail(t.getCode(), t.getMsg());
    }

    public abstract void onSuccess(T t);
}
