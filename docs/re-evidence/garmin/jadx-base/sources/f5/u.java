package f5;

import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf5/u;", "Lf5/r2;", "", "name", "", "rulers", "<init>", "(Ljava/lang/String;[Lf5/r2;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2[] f69117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f69118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f69119e;

    public u(String str, r2[] r2VarArr) {
        this.f69116b = str;
        this.f69117c = r2VarArr;
        int i14 = x1.f69155a;
        ArrayList arrayList = new ArrayList(r2VarArr.length);
        for (r2 r2Var : r2VarArr) {
            arrayList.add(r2Var.getCurrent());
        }
        x1[] x1VarArr = (x1[]) arrayList.toArray(new x1[0]);
        this.f69118d = new t((x1[]) Arrays.copyOf(x1VarArr, x1VarArr.length));
        int i15 = x1.f69155a;
        r2[] r2VarArr2 = this.f69117c;
        ArrayList arrayList2 = new ArrayList(r2VarArr2.length);
        for (r2 r2Var2 : r2VarArr2) {
            arrayList2.add(r2Var2.getMaximum());
        }
        x1[] x1VarArr2 = (x1[]) arrayList2.toArray(new x1[0]);
        this.f69119e = new t((x1[]) Arrays.copyOf(x1VarArr2, x1VarArr2.length));
    }

    @Override // f5.r2
    public final x1 getCurrent() {
        return this.f69118d;
    }

    @Override // f5.r2
    public final x1 getMaximum() {
        return this.f69119e;
    }

    public final String toString() {
        String str = this.f69116b;
        return str == null ? p13.u.P(this.f69117c, null, "innermostOf(", ")", null, 57) : str;
    }
}
