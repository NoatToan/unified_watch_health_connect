package n81;

import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\tB\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln81/a;", "Ln70/a0;", "Lr53/i;", "Ln81/e;", "Lj70/d;", "", "data", "<init>", "(Lr53/i;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends e>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f124931b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<String>> f124932a;

    static {
        new C2403a(null);
    }

    public a(i<j70.d<String>> iVar) {
        iVar.getClass();
        this.f124932a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetHillScoreDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends e> invoke() {
        return s.A(new b(this.f124932a, this), s0.f129406a);
    }

    /* JADX INFO: renamed from: n81.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln81/a$a;", "", "<init>", "()V", "", "MIN_SLICE_VALUE", "D", "MAX_SLICE_VALUE", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2403a {
        public /* synthetic */ C2403a(j jVar) {
            this();
        }

        private C2403a() {
        }
    }
}
