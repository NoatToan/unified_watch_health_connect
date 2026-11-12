package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/b;", "Lu00/b;", "Lns/a;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u00.b<ns.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127619c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127620a;

        static {
            int[] iArr = new int[to.i.values().length];
            try {
                iArr[to.i.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[to.i.ADVANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127620a = iArr;
        }
    }

    public /* synthetic */ b(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strC;
        ns.a aVar = (ns.a) obj;
        aVar.getClass();
        int i15 = a.f127620a[aVar.getClimbMode().ordinal()];
        if (i15 == 1) {
            strC = u00.b.c(new c(this.f127619c, x.a.Ascent), aVar.getElevationGain(), i14, 4);
        } else {
            if (i15 != 2) {
                lc.u0.r();
                return null;
            }
            d1 d1Var = new d1(this.f127619c, am.x0.f4352y2, null, 4, null);
            String maxDiffKey = aVar.getMaxDiffKey();
            if (maxDiffKey == null) {
                maxDiffKey = "";
            }
            strC = u00.b.c(d1Var, maxDiffKey, i14, 4);
        }
        return strC == null ? d(8) : strC;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127619c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(ns.a aVar) {
        ns.a aVar2 = aVar;
        to.i climbMode = aVar2 != null ? aVar2.getClimbMode() : null;
        int i14 = climbMode == null ? -1 : a.f127620a[climbMode.ordinal()];
        l22.b bVar = this.f127619c;
        if (i14 != 2) {
            return new c(bVar, x.a.Ascent).i();
        }
        d1 d1Var = new d1(bVar, am.x0.f4352y2, null, 4, null);
        aVar2.getClass();
        return d1Var.f127633c.getString(R.string.lbl_max_difficulty);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l22.b bVar, u00.c<ns.a> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127619c = bVar;
    }
}
