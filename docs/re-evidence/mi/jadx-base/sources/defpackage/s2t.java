package defpackage;

import android.content.Context;
import com.amap.api.col.p0003sl.ik;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0t f33225b;
    public boolean c = true;
    public String d = "40C27E38DCAD404B5465362914090908";
    public s3t e = new s3t("40C27E38DCAD404B5465362914090908");

    public final void a(Context context, boolean z, String str, String str2, String str3, String[] strArr) {
        try {
            o0t o0tVarD = new o0t.a(str, str2, str).c(strArr).a(str3).d();
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.f33224a = applicationContext;
                this.f33225b = o0tVarD;
                this.c = z;
                this.e.c(applicationContext, o0tVarD);
            }
        } catch (ik unused) {
        }
    }

    public final void b(String str, String str2) {
        List<o0t> listB = this.e.b(this.f33224a);
        t2t t2tVar = t2t.a.f34250a;
        t2t.b(this.f33224a, str, str2, listB, this.c, this.f33225b);
    }
}
