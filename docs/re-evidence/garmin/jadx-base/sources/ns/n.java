package ns;

import com.garmin.android.apps.connectmobile.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/n;", "Lu00/b;", "Lps/g0;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u00.b<ps.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127706c;

    public /* synthetic */ n(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.g() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ps.g0 g0Var = (ps.g0) obj;
        g0Var.getClass();
        c22.l3.f23124b.getClass();
        DecimalFormat decimalFormat = c22.l3.f23131i;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return this.f127706c.a(R.string.string_short_dash_line_string_pattern, c22.l3.a.U(g0Var.f139822a, decimalFormat), c22.l3.a.U(g0Var.f139823b, decimalFormat));
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127706c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l22.b bVar, u00.c<ps.g0> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127706c = bVar;
    }
}
