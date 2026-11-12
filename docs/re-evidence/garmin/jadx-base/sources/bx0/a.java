package bx0;

import n70.a0;
import o13.p;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pb2.e;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB3\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbx0/a;", "Ln70/a0;", "Lr53/i;", "Lbx0/d;", "Lj70/d;", "Lo13/p;", "", "Lpb2/e$r;", "data", "Lax0/a;", "mctDelegate", "<init>", "(Lr53/i;Lax0/a;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends d>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21649c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<p<String, e.r>>> f21650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax0.a f21651b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21652a;

        static {
            int[] iArr = new int[ww0.a.values().length];
            try {
                iArr[ww0.a.PREGNANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ww0.a.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ww0.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ww0.a.REGULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ww0.a.IRREGULAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21652a = iArr;
        }
    }

    static {
        new C0332a(null);
    }

    public a(i<j70.d<p<String, e.r>>> iVar, ax0.a aVar) {
        iVar.getClass();
        aVar.getClass();
        this.f21650a = iVar;
        this.f21651b = aVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetWomenHealthDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends d> invoke() {
        return s.A(new bx0.b(this.f21650a, this), s0.f129406a);
    }

    /* JADX INFO: renamed from: bx0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbx0/a$a;", "", "<init>", "()V", "", "MAX_OF_TOTAL_DAYS_IN_PREGNANCY", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0332a {
        public /* synthetic */ C0332a(j jVar) {
            this();
        }

        private C0332a() {
        }
    }
}
