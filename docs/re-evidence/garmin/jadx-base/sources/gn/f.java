package gn;

import java.util.ArrayList;
import java.util.Iterator;
import n70.a0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.p0;
import p13.y;
import r53.u1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgn/f;", "Ln70/a0;", "Lr53/i;", "Lin/c;", "Lk70/a;", "data", "Lzd0/o;", "getStartActivityCapablePairedDevicesUseCase", "Lgn/k;", "getActivityTrendsQuickActionsUseCase", "<init>", "(Lr53/i;Lzd0/o;Lgn/k;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements a0<r53.i<? extends in.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<k70.a> f78023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd0.o f78024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f78025c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78027b;

        static {
            int[] iArr = new int[in.b.values().length];
            try {
                iArr[in.b.Total.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f78026a = iArr;
            int[] iArr2 = new int[k70.b.values().length];
            try {
                iArr2[k70.b.Distance.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[k70.b.Duration.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f78027b = iArr2;
        }
    }

    public f(r53.i<k70.a> iVar, zd0.o oVar, k kVar) {
        iVar.getClass();
        oVar.getClass();
        kVar.getClass();
        this.f78023a = iVar;
        this.f78024b = oVar;
        this.f78025c = kVar;
    }

    public static ArrayList c() {
        LocalDate localDateMinusDays = LocalDate.now().minusDays(6);
        j23.l lVar = new j23.l(0, 6);
        ArrayList arrayList = new ArrayList(y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((j23.k) it).f96801c) {
            arrayList.add(localDateMinusDays.plusDays(((p0) it).nextInt()));
        }
        return arrayList;
    }

    public static double d(k70.b bVar, pb2.b.C2596b c2596b) {
        Double d14;
        int i14 = a.f78027b[bVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 && (d14 = c2596b.f136917d) != null) {
                return d14.doubleValue();
            }
            return 0.0d;
        }
        Double d15 = c2596b.f136916c;
        if (d15 != null) {
            return d15.doubleValue();
        }
        return 0.0d;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetActivityTrendsCardDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends in.c> invoke() {
        u1 u1VarA = this.f78024b.a();
        return r53.s.l(this.f78023a, u1VarA, r53.s.N(u1VarA, new h(null, this)), new i(this, null));
    }
}
