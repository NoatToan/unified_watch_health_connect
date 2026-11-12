package zv1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.o0;
import hv1.e;
import jv1.o;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzv1/a;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f207176a;

    public a(l22.b bVar) {
        bVar.getClass();
        this.f207176a = bVar;
    }

    public final String a(o oVar, Double d14, e eVar) {
        if (oVar == null) {
            return null;
        }
        int i14 = oVar.f101106b;
        boolean zD = zf.b.D(d14);
        l22.b bVar = this.f207176a;
        if (!zD) {
            return (eVar == null || eVar == e.FLAT) ? bVar.getString(i14) : bVar.a(R.string.string_space_bullet_string_pattern, bVar.getString(i14), bVar.getString(eVar.f85849b));
        }
        o0 o0VarG = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        String strA = bVar.a(R.string.string_space_string_pattern, l3.a.b0(bVar, dDoubleValue, o0VarG, false, l3.f23131i), bVar.getString(R.string.lbl_total_ascent));
        return (eVar == null || eVar == e.FLAT) ? strA : bVar.a(R.string.string_space_bullet_string_pattern, strA, bVar.getString(eVar.f85849b));
    }
}
