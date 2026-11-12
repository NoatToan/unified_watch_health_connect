package defpackage;

import android.text.TextUtils;
import com.metv.airkan_sdk.exception.CbcKeyLengthException;

/* JADX INFO: loaded from: classes5.dex */
public class l83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24759b;

    public String a() {
        return this.f24759b;
    }

    public String b() {
        return this.f24758a;
    }

    public void c(String str) throws CbcKeyLengthException {
        if (TextUtils.isEmpty(str) || str.length() != 16) {
            throw new CbcKeyLengthException();
        }
        this.f24759b = str;
    }

    public void d(String str) throws CbcKeyLengthException {
        if (TextUtils.isEmpty(str) || str.length() != 16) {
            throw new CbcKeyLengthException();
        }
        this.f24758a = str;
    }
}
