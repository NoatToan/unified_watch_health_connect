package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/o;", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/n;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/n;Landroidx/lifecycle/k0;)V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f7967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f7968b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7969a;

        static {
            int[] iArr = new int[b0.a.values().length];
            try {
                iArr[b0.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b0.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b0.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7969a = iArr;
        }
    }

    public o(n nVar, k0 k0Var) {
        nVar.getClass();
        this.f7967a = nVar;
        this.f7968b = k0Var;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(n0 n0Var, b0.a aVar) {
        int i14 = a.f7969a[aVar.ordinal()];
        n nVar = this.f7967a;
        switch (i14) {
            case 1:
                nVar.onCreate(n0Var);
                break;
            case 2:
                nVar.onStart(n0Var);
                break;
            case 3:
                nVar.onResume(n0Var);
                break;
            case 4:
                nVar.onPause(n0Var);
                break;
            case 5:
                nVar.onStop(n0Var);
                break;
            case 6:
                nVar.onDestroy(n0Var);
                break;
            case 7:
                vb.h.s("ON_ANY must not been send by anybody");
                return;
            default:
                lc.u0.r();
                return;
        }
        k0 k0Var = this.f7968b;
        if (k0Var != null) {
            k0Var.onStateChanged(n0Var, aVar);
        }
    }
}
