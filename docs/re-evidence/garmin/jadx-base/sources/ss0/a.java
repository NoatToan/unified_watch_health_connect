package ss0;

import o70.t;
import p005kotlin.Metadata;
import qs0.e;
import r70.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lss0/a;", "Lr70/s;", "Lqs0/e;", "getLactateThresholdDataUseCase", "Lxs0/a;", "lactateThresholdSportType", "<init>", "(Lqs0/e;Lxs0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f160609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xs0.a f160610b;

    /* JADX INFO: renamed from: ss0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3035a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160611a;

        static {
            int[] iArr = new int[xs0.a.values().length];
            try {
                iArr[xs0.a.ROWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f160611a = iArr;
        }
    }

    public a(e eVar, xs0.a aVar) {
        eVar.getClass();
        aVar.getClass();
        this.f160609a = eVar;
        this.f160610b = aVar;
    }

    @Override // r70.s
    public final String a() {
        return C3035a.f160611a[this.f160610b.ordinal()] == 1 ? t.E.a() : t.D.a();
    }
}
