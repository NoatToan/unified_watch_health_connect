package wb2;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c extends v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f183966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f183967w;

    public c(Context context, String str, g0 g0Var) {
        super(context, str, g0Var);
        this.f183966v = null;
        this.f183967w = new b();
    }

    public final void U() {
        if (((il2.e) ec2.e.b()).f94040b.j()) {
            StringBuilder sb3 = new StringBuilder(r());
            String strW = W();
            if (!TextUtils.isEmpty(strW)) {
                sb3.append(strW);
            }
            String string = sb3.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f184159a.info(string);
            synchronized (this) {
                this.f183966v = string;
            }
        }
    }

    public final void V() {
        Logger logger = this.f184159a;
        if (((il2.e) ec2.e.b()).f94040b.j()) {
            try {
                StringBuilder sb3 = new StringBuilder(this.f183967w.toString());
                String strW = W();
                if (!TextUtils.isEmpty(strW)) {
                    sb3.append(strW);
                }
                if (TextUtils.isEmpty(sb3.toString())) {
                    return;
                }
                logger.info(sb3.toString());
                String string = sb3.toString();
                synchronized (this) {
                    this.f183966v = string;
                }
            } catch (NullPointerException unused) {
                logger.error("createExecutionResult: NPE caught");
            }
        }
    }

    public String W() {
        return null;
    }

    @Override // wb2.v
    public void u() {
        V();
    }

    @Override // wb2.v
    public final void x() {
        this.f183966v = null;
    }
}
