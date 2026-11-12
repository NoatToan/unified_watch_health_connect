package f1;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.x2;
import b0.b0;
import g1.d0;
import g1.e0;
import j20.x;
import java.util.HashMap;
import java.util.Map;
import k7.i;
import z0.p0;

/* JADX INFO: loaded from: classes.dex */
public class e implements i<d0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f67788g = new Size(1280, 720);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f67790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f67791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f67792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f67793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f67794f;

    public e(String str, x2 x2Var, p0 p0Var, Size size, b0 b0Var, Range<Integer> range) {
        this.f67789a = str;
        this.f67790b = x2Var;
        this.f67791c = p0Var;
        this.f67792d = size;
        this.f67793e = b0Var;
        this.f67794f = range;
    }

    @Override // k7.i
    public final d0 get() {
        Integer num;
        Range<Integer> range = this.f67794f;
        p0 p0Var = this.f67791c;
        b bVarB = d.b(p0Var, range);
        Range<Integer> rangeC = p0Var.c();
        b0 b0Var = this.f67793e;
        int i14 = b0Var.f13861b;
        int i15 = bVarB.f67786b;
        Size size = this.f67792d;
        int width = size.getWidth();
        Size size2 = f67788g;
        int iD = d.d(14000000, i14, 8, i15, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), rangeC);
        HashMap map = h1.b.f80737e;
        String str = this.f67789a;
        Map map2 = (Map) map.get(str);
        int iIntValue = (map2 == null || (num = (Integer) map2.get(b0Var)) == null) ? -1 : num.intValue();
        e0 e0VarA = d.a(iIntValue, str);
        g1.d.b bVarD = d0.d();
        if (str == null) {
            x.l("Null mimeType");
            return null;
        }
        bVarD.f74686a = str;
        x2 x2Var = this.f67790b;
        if (x2Var == null) {
            x.l("Null inputTimebase");
            return null;
        }
        bVarD.f74688c = x2Var;
        bVarD.f74689d = size;
        bVarD.f74695j = Integer.valueOf(iD);
        bVarD.f74692g = Integer.valueOf(bVarB.f67785a);
        bVarD.f74693h = Integer.valueOf(bVarB.f67786b);
        bVarD.f74687b = Integer.valueOf(iIntValue);
        bVarD.b(e0VarA);
        return bVarD.a();
    }
}
