package il2;

import android.content.Context;
import android.content.Intent;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o53.a0;
import o53.c0;
import o53.s0;
import ok2.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import wb2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lil2/e;", "Lec2/c;", "Lec2/d;", "Ldc2/a;", "Lok2/d;", "config", "legacyCallback", "<init>", "(Lok2/d;Lec2/c;)V", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e implements ec2.c, ec2.d, dc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok2.d f94039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec2.c f94040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f94041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cz2.c<Unit> f94042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<Long, List<String>> f94043e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94044a;

        static {
            int[] iArr = new int[y.d.values().length];
            try {
                iArr[y.d.FORCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.d.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.d.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94044a = iArr;
        }
    }

    public e(ok2.d dVar, ec2.c cVar) {
        dVar.getClass();
        cVar.getClass();
        this.f94039a = dVar;
        this.f94040b = cVar;
        this.f94041c = c0.a(t13.g.a.C3052a.d(new a0("DataQueryCallbackShim"), ge1.b.h()));
        this.f94042d = new cz2.c<>();
        this.f94043e = new ConcurrentHashMap<>();
    }

    public static dl2.b l() {
        return (dl2.b) ok2.a0.f132585h.a().getConfiguration();
    }

    @Override // ec2.c
    public final List<gy2.g> a(DeviceProfile deviceProfile) {
        deviceProfile.getClass();
        return this.f94040b.a(deviceProfile);
    }

    @Override // ec2.c
    public final Long b(long j8) {
        return this.f94040b.b(j8);
    }

    @Override // dc2.a
    public final void c(Context context) {
        context.getClass();
        ec2.c cVar = this.f94040b;
        dc2.a aVar = cVar instanceof dc2.a ? (dc2.a) cVar : null;
        if (aVar != null) {
            aVar.c(context);
        } else {
            dc2.a.C1258a.a(this, context);
        }
    }

    @Override // ec2.c
    public final boolean d(DeviceProfile deviceProfile) {
        deviceProfile.getClass();
        return this.f94040b.d(deviceProfile);
    }

    @Override // ec2.c
    public final bc2.g.a e(t0 t0Var) {
        return this.f94040b.e(t0Var);
    }

    @Override // dc2.a
    public final void f(Context context, Intent intent) {
        context.getClass();
        ec2.c cVar = this.f94040b;
        dc2.a aVar = cVar instanceof dc2.a ? (dc2.a) cVar : null;
        if (aVar != null) {
            aVar.f(context, intent);
        }
    }

    @Override // ec2.c
    public final boolean g(long j8, String str) {
        return this.f94040b.g(j8, str);
    }

    @Override // ec2.c
    @o13.e
    public final long getUserProfilePk() {
        return this.f94040b.getUserProfilePk();
    }

    @Override // dc2.a
    public final boolean h(int i14) {
        ec2.c cVar = this.f94040b;
        dc2.a aVar = cVar instanceof dc2.a ? (dc2.a) cVar : null;
        if (aVar != null) {
            return aVar.h(i14);
        }
        return false;
    }

    @Override // ec2.c
    public final boolean i() {
        return this.f94040b.i();
    }

    @Override // ec2.c
    public final boolean j() {
        return this.f94040b.j();
    }

    public final void k(long j8, y yVar) {
        synchronized (this.f94043e) {
            try {
                if (yVar == null) {
                    this.f94043e.remove(Long.valueOf(j8));
                } else if (yVar.f132809c == y.d.BLOCKED) {
                    this.f94043e.put(Long.valueOf(j8), j0.f134944a);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Collection<String> collection = yVar.f132807a;
                    List<String> listB1 = collection != null ? h0.b1(collection) : null;
                    if (listB1 != null) {
                        this.f94043e.put(Long.valueOf(j8), listB1);
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        this.f94043e.remove(Long.valueOf(j8));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Context m() {
        Context context = this.f94039a.f132622b;
        context.getClass();
        return context;
    }

    public final zi2.a n() {
        zi2.a aVarA;
        hy2.d dVar = l().f60322o;
        return (dVar == null || (aVarA = dVar.a()) == null) ? zi2.a.PROD : aVarA;
    }

    public final boolean o() {
        return !this.f94039a.p();
    }

    public final boolean p() {
        hy2.d dVar = l().f60322o;
        my2.a aVar = dVar instanceof my2.a ? (my2.a) dVar : null;
        return (aVar != null ? aVar.f121526a.a() : null) != null;
    }

    public final boolean q() {
        dl2.b bVarL = l();
        x53.c cVar = s0.f129406a;
        ge1.b.T(this.f94041c, x53.b.f189152a, null, new f(this, bVarL, null), 2);
        return l().d();
    }
}
