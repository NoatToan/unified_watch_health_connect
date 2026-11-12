package kd0;

import android.content.Context;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/h4;", "Lkg2/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h4 implements kg2.b {
    @Override // kg2.b
    public final String a(String str, Object... objArr) {
        String str2;
        switch (str) {
            case "720":
                c22.x0.f23314a.getClass();
                str2 = c22.x0.f23611rb;
                break;
            case "721":
                c22.x0.f23314a.getClass();
                str2 = c22.x0.Cb;
                break;
            case "722":
                c22.x0.f23314a.getClass();
                str2 = c22.x0.f23627sb;
                break;
            default:
                str2 = null;
                break;
        }
        return str2 != null ? dh.b.C((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), str2, Arrays.copyOf(objArr, objArr.length)) : "";
    }
}
