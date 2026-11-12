package go0;

import f12.l;
import j70.j;
import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\u000fB9\u0012 \u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgo0/a;", "Ln70/a0;", "Lr53/i;", "Lgo0/e;", "Lj70/j;", "", "", "Lhd1/a0;", "data", "Lae0/b;", "userSummariesUseCase", "Lf12/l;", "userSettings", "<init>", "(Lr53/i;Lae0/b;Lf12/l;)V", "a", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<List<String>, hd1.a0>> f78179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f78180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f78181c;

    static {
        new C1577a(null);
    }

    public a(i<j<List<String>, hd1.a0>> iVar, ae0.b bVar, l lVar) {
        iVar.getClass();
        bVar.getClass();
        lVar.getClass();
        this.f78179a = iVar;
        this.f78180b = bVar;
        this.f78181c = lVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetHeartRateDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends e> invoke() {
        return s.A(new b(this.f78179a, this), s0.f129406a);
    }

    /* JADX INFO: renamed from: go0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo0/a$a;", "", "<init>", "()V", "", "CHART_TIMELINE_HOURS", "I", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1577a {
        public /* synthetic */ C1577a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1577a() {
        }
    }
}
