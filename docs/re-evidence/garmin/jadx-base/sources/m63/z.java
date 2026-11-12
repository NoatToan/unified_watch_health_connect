package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm63/z;", "", "Lk63/e;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lk63/e;Le23/p;)V", "a", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f117050e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k63.e f117051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<k63.e, Integer, Boolean> f117052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f117053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f117054d;

    static {
        new a(null);
        f117050e = new long[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(k63.e eVar, e23.p<? super k63.e, ? super Integer, Boolean> pVar) {
        eVar.getClass();
        pVar.getClass();
        this.f117051a = eVar;
        this.f117052b = pVar;
        int iC = eVar.c();
        if (iC <= 64) {
            this.f117053c = iC != 64 ? (-1) << iC : 0L;
            this.f117054d = f117050e;
            return;
        }
        this.f117053c = 0L;
        int i14 = (iC - 1) >>> 6;
        long[] jArr = new long[i14];
        if ((iC & 63) != 0) {
            jArr[i14 - 1] = (-1) << iC;
        }
        this.f117054d = jArr;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm63/z$a;", "", "<init>", "()V", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
