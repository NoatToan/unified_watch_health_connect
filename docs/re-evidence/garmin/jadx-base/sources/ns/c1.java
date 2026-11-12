package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lns/c1;", "Lns/t;", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "<init>", "(Ll22/b;Z)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l22.b f127628i;

    public /* synthetic */ c1(l22.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14);
    }

    @Override // u00.b
    public final String b(int i14, Object obj, boolean z14) {
        l22.b bVar = this.f127628i;
        String strC = u00.b.c(new q(bVar, false, 2, null), (Double) obj, i14, 4);
        if (strC == null) {
            strC = "";
        }
        return oe2.f.H(i14, 64) ? bVar.a(R.string.longest_value, strC) : strC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(l22.b bVar, boolean z14) {
        super(bVar, z14);
        bVar.getClass();
        this.f127628i = bVar;
    }
}
