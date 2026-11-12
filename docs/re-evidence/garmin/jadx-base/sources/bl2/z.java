package bl2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbl2/z;", "", "Lwk2/i;", "item", "Lzy2/e;", "clock", "<init>", "(Lwk2/i;Lzy2/e;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk2.i f18752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy2.e f18753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f18755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f18756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f18757f;

    public z(wk2.i iVar, zy2.e eVar) {
        iVar.getClass();
        eVar.getClass();
        this.f18752a = iVar;
        this.f18753b = eVar;
        this.f18754c = new Object();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000f, B:15:0x002a, B:11:0x0016, B:14:0x001e), top: B:20:0x0003 }] */
    public final void a() {
        synchronized (this.f18754c) {
            try {
                Long l14 = this.f18756e;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    Long l15 = this.f18755d;
                    if (jLongValue < (l15 != null ? l15.longValue() : l14.longValue())) {
                        this.f18756e = Long.valueOf(this.f18753b.millis());
                    }
                } else {
                    this.f18756e = Long.valueOf(this.f18753b.millis());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Long b() {
        Long lValueOf;
        synchronized (this.f18754c) {
            try {
                long jD = this.f18752a.d();
                Long l14 = this.f18757f;
                lValueOf = Long.valueOf(jD - (l14 != null ? l14.longValue() : 0L));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return lValueOf;
    }

    public final Integer c() {
        synchronized (this.f18754c) {
            Long l14 = this.f18755d;
            Long l15 = this.f18756e;
            if (l14 != null && l15 != null) {
                return Integer.valueOf((int) (l15.longValue() - l14.longValue()));
            }
            return null;
        }
    }

    public final void d() {
        synchronized (this.f18754c) {
            try {
                this.f18755d = Long.valueOf(this.f18753b.millis());
                wk2.d f205154d = this.f18752a.getF205154d();
                this.f18757f = f205154d != null ? Long.valueOf(f205154d.getSize()) : null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
