package defpackage;

import android.content.Context;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.obtain.PhoneException;
import com.xiaomi.phonenum.procedure.cert.AccountCertificationFetchException;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class ibh implements qoc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20973b;

    public ibh(String str, String str2) {
        this.f20972a = str;
        this.f20973b = str2;
    }

    @Override // defpackage.qoc
    public AccountCertification a(Context context, int i) throws AccountCertificationFetchException {
        try {
            return d6h.a(context).f(i, this.f20972a, this.f20973b);
        } catch (PhoneException e) {
            throw new AccountCertificationFetchException(e);
        } catch (IOException e2) {
            throw new AccountCertificationFetchException(e2);
        }
    }
}
