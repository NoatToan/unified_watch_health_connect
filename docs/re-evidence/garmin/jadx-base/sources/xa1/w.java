package xa1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxa1/w;", "Landroidx/lifecycle/x1$c;", "Lab1/g;", "powerGuidanceSummary", "", "powerGuideToReplace", "<init>", "(Lab1/g;Ljava/lang/Long;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab1.g f189820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f189821b;

    static {
        ab1.g.Companion companion = ab1.g.INSTANCE;
    }

    public w(ab1.g gVar, Long l14) {
        gVar.getClass();
        this.f189820a = gVar;
        this.f189821b = l14;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(k.class)) {
            return new k(this.f189820a, this.f189821b);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
