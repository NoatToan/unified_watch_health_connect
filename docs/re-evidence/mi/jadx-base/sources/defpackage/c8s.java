package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class c8s implements j7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f5060b;
    public Object c;
    public Method d = null;
    public Method e = null;
    public Method f = null;
    public Method g = null;

    public c8s(Context context) {
        this.f5059a = context;
        c(context);
    }

    private void c(Context context) {
        try {
            Class<?> clsC = odt.c(context, "com.android.id.impl.IdProviderImpl");
            this.f5060b = clsC;
            this.c = clsC.newInstance();
            this.e = this.f5060b.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            x9s.q("miui load class error", e);
        }
    }

    @Override // defpackage.j7s
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo66a() {
        return (this.f5060b == null || this.c == null) ? false : true;
    }

    public final String b(Context context, Method method) {
        Object obj = this.c;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e) {
            x9s.q("miui invoke error", e);
            return null;
        }
    }

    @Override // defpackage.j7s
    public String a() {
        return b(this.f5059a, this.e);
    }
}
