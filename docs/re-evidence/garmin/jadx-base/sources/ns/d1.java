package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/d1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lam/x0;", "activityType", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lam/x0;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 extends u00.b<String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final am.x0 f127634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l22.b bVar, am.x0 x0Var, u00.c<String> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        x0Var.getClass();
        cVar.getClass();
        this.f127633c = bVar;
        this.f127634d = x0Var;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String str = (String) obj;
        str.getClass();
        String strD = am.v1.d(this.f127634d.f4358a, str);
        if (strD == null) {
            return d(8);
        }
        if (!oe2.f.H(i14, 64)) {
            return strD;
        }
        l22.b bVar = this.f127633c;
        return bVar.a(R.string.string_space_string_pattern, strD, bVar.getString(R.string.lbl_max_difficulty_abreviated));
    }

    @Override // u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127633c;
        return oe2.f.H(i14, 64) ? bVar.a(R.string.string_space_string_pattern, bVar.getString(R.string.no_value), bVar.getString(R.string.lbl_max_difficulty_abreviated)) : bVar.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(String str) {
        return this.f127633c.getString(R.string.lbl_max_difficulty);
    }

    public /* synthetic */ d1(l22.b bVar, am.x0 x0Var, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, x0Var, (i14 & 4) != 0 ? new ms.v() : cVar);
    }
}
