package ru;

import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/f;", "Lru/e;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f154575a;

    static {
        new a(null);
    }

    public f(l lVar) {
        lVar.getClass();
        this.f154575a = lVar;
    }

    @Override // ru.e
    public final long a() {
        return this.f154575a.D3(0L, "badgeRewardsUnredeemedLastServerUpdate");
    }

    @Override // ru.e
    public final void b(long j8) {
        this.f154575a.h2(j8, "badgeRewardsUnredeemedLastServerUpdate");
    }

    @Override // ru.e
    public final void c(String str) {
        str.getClass();
        this.f154575a.S("badgeTranslationsLastModified", str);
    }

    @Override // ru.e
    public final String d() {
        return this.f154575a.a0("badgeTranslationsLastModified");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/f$a;", "", "<init>", "()V", "", "BADGE_REWARD_UNREDEEMED_SERVER_UPDATE", "Ljava/lang/String;", "BADGE_TRANSLATIONS_LAST_MODIFIED", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
