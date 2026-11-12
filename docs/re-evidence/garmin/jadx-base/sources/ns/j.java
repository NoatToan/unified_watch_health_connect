package ns;

import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/j;", "Lu00/b;", "Lps/f0;", "Ll22/b;", "resolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j extends u00.b<ps.f0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127667c;

    public /* synthetic */ j(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.e() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ps.f0 f0Var = (ps.f0) obj;
        f0Var.getClass();
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        return this.f127667c.a(R.string.string_new_line_string_pattern, String.format(Locale.getDefault(), "%.6f", Arrays.copyOf(new Object[]{f0Var.f139812a}, 1)), String.format(Locale.getDefault(), "%.6f", Arrays.copyOf(new Object[]{f0Var.f139813b}, 1)));
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127667c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l22.b bVar, u00.c<ps.f0> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127667c = bVar;
    }
}
