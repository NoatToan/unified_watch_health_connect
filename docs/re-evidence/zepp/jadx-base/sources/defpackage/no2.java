package defpackage;

import com.huami.account.api.HMAccountWebAPI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class no2 implements Callable {
    public static final /* synthetic */ no2 a = new no2();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(HMAccountWebAPI.queryMinorAuthorizationState());
    }
}
