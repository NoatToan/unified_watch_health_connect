package vk0;

import f12.l;
import jk0.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvk0/d;", "Lvk0/c;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f178567a;

    static {
        new a(null);
    }

    public d(l lVar) {
        lVar.getClass();
        this.f178567a = lVar;
    }

    @Override // vk0.c
    public final void a(Long l14) {
        this.f178567a.h2(l14.longValue(), "gearBrandModelCacheMillis");
    }

    @Override // vk0.c
    public final Long b() {
        long jD3 = this.f178567a.D3(0L, "gearBrandModelCacheMillis");
        Long lValueOf = Long.valueOf(jD3);
        if (jD3 != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // vk0.c
    public final void c(o oVar) {
        oVar.getClass();
        this.f178567a.S("gearSortOrder", oVar.f99304a);
    }

    @Override // vk0.c
    public final o d() {
        Object next;
        String strA0 = this.f178567a.a0("gearSortOrder");
        w13.c cVar = o.f99303f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (!s.g(((o) next).f99304a, strA0));
        o oVar = (o) next;
        return oVar == null ? (o) h0.b0(o.f99303f) : oVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvk0/d$a;", "", "<init>", "()V", "", "GEAR_SORT_ORDER", "Ljava/lang/String;", "GEAR_BRAND_MODEL_CACHE_MILLIS", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
