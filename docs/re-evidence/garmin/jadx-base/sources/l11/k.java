package l11;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll11/k;", "Landroidx/lifecycle/u1;", "Lv01/u1;", "reportFoodIssueUseCase", "<init>", "(Lv01/u1;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v01.u1 f108176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f108177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f108178c;

    public k(v01.u1 u1Var) {
        u1Var.getClass();
        this.f108176a = u1Var;
        p2 p2VarA = q2.a(new i(null, null, null, false, false, false, false, 127, null));
        this.f108177b = p2VarA;
        this.f108178c = r53.s.d(p2VarA);
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f108177b;
            value = p2Var.getValue();
        } while (!p2Var.b(value, i.a((i) value, null, null, false, false, false, false, 31)));
    }

    public final void y4() {
        Object value;
        i iVar;
        boolean z14;
        p2 p2Var = this.f108177b;
        String str = ((i) p2Var.getValue()).f108165b;
        String str2 = ((i) p2Var.getValue()).f108166c;
        do {
            value = p2Var.getValue();
            iVar = (i) value;
            z14 = true;
            if (str.length() <= 0) {
                z14 = false;
            }
        } while (!p2Var.b(value, i.a(iVar, null, null, z14, str.length() > 0 || !d53.w.J(str2), false, false, 103)));
    }
}
