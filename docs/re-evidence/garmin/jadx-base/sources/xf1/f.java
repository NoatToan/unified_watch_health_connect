package xf1;

import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.R;
import java.util.EnumSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xf1.f[], still in use, count: 1, list:
  (r0v1 xf1.f[]) from 0x002c: CONSTRUCTOR (r0v1 xf1.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lxf1/f;", "", "", "garminConnectTypeID", "labelResourceID", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    ACT_BOTH_RUNNING_AND_CYCLING(-1, R.string.lbl_any_activity_type),
    /* JADX INFO: Fake field, exist only in values array */
    ACT_RUNNING(1, R.string.lbl_running),
    /* JADX INFO: Fake field, exist only in values array */
    ACT_CYCLING(2, R.string.lbl_cycling);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray<f> f190678c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f190681f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f190682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190683b;

    static {
        f190681f = new w13.c(fVarArr);
        new a(null);
        f190678c = new SparseArray<>();
        Iterator it = EnumSet.allOf(f.class).iterator();
        it.getClass();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            f190678c.put(fVar.f190682a, fVar);
        }
    }

    private f(int i14, int i15) {
        super(str, i);
        this.f190682a = i14;
        this.f190683b = i15;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f190680e.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxf1/f$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lxf1/f;", "lookupByGarminConnectTypeID", "Landroid/util/SparseArray;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
