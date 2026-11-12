package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/w0;", "Lns/e2;", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "Lu00/c;", "", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 extends e2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l22.b f127789e;

    public /* synthetic */ w0(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? new ms.a0() : cVar);
    }

    @Override // ns.e2
    public final String i(double d14, c22.q3 q3Var, boolean z14) {
        q3Var.getClass();
        c22.l3.f23124b.getClass();
        String str = c22.l3.f23138p.format(c22.l3.a.w(d14, c22.q3.METERS_PER_SECOND, q3Var));
        if (!z14) {
            str.getClass();
            return str;
        }
        str.getClass();
        int i14 = q3Var.f23223e;
        l22.b bVar = this.f127789e;
        return bVar.a(R.string.string_space_string_pattern, str, bVar.getString(i14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(l22.b bVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, z14, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127789e = bVar;
    }
}
