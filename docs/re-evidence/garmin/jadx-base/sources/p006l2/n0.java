package p006l2;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class n0 implements p<m, Integer, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f108669a;

    public n0(m2 m2Var) {
        this.f108669a = m2Var;
    }

    @Override // e23.p
    public final String invoke(m mVar, Integer num) {
        m mVar2 = mVar;
        num.intValue();
        mVar2.C(-35972707);
        x1 x1Var = n.f135158a;
        m2 m2Var = this.f108669a;
        m2Var.getClass();
        String string = ((Resources) mVar2.A(AndroidCompositionLocals_androidKt.f6043c)).getString(m2Var.f108663b);
        mVar2.f();
        return string;
    }
}
