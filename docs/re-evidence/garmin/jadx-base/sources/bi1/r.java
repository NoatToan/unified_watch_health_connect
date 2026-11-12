package bi1;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi1/r;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<v> f18064a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<v, y0<bi1.a>> f18065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18066c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18067a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18067a = iArr;
        }
    }

    public r() {
        v[] vVarArrValues = v.values();
        ArrayList arrayList = new ArrayList(vVarArrValues.length);
        for (v vVar : vVarArrValues) {
            y0 y0Var = new y0();
            y0Var.m(new bi1.a(vVar, null, null, 6, null));
            arrayList.add(new o13.p(vVar, y0Var));
        }
        this.f18065b = u0.l(arrayList);
        this.f18066c = new LinkedHashMap();
    }

    public final bi1.a x4() {
        y0<bi1.a> y0Var;
        v vVarD = this.f18064a.d();
        if (vVarD == null || (y0Var = this.f18065b.get(vVarD)) == null) {
            return null;
        }
        return y0Var.d();
    }
}
