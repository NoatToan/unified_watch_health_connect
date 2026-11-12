package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/l0;", "Lu00/b;", "Lqs/m;", "Ll22/b;", "resolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 extends u00.b<qs.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127687c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127688a;

        static {
            int[] iArr = new int[qs.m.values().length];
            try {
                iArr[qs.m.BACKUP_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs.m.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs.m.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127688a = iArr;
        }
    }

    public /* synthetic */ l0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.k() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        int i15;
        qs.m mVar = (qs.m) obj;
        mVar.getClass();
        int i16 = a.f127688a[mVar.ordinal()];
        if (i16 == 1) {
            i15 = R.string.activity_details_gas_status_backup;
        } else if (i16 == 2) {
            i15 = R.string.activity_details_gas_status_deco_enabled;
        } else {
            if (i16 != 3) {
                lc.u0.r();
                return null;
            }
            i15 = R.string.no_value;
        }
        return this.f127687c.getString(i15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(l22.b bVar, u00.c<qs.m> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127687c = bVar;
    }
}
