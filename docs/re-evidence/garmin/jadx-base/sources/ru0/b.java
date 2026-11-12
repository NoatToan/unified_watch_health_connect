package ru0;

import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru0/b;", "Lru0/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements ru0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f154576a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f154576a = lVar;
    }

    @Override // ru0.a
    public final void a(boolean z14) {
        this.f154576a.O2("userHasEventSharingCapableDevice", z14);
    }

    @Override // ru0.a
    public final boolean b() {
        return this.f154576a.W2("userHasEventSharingCapableDevice", false);
    }

    @Override // ru0.a
    public final boolean c() {
        return this.f154576a.W2("userHasLiveEventSharingCapableDevice", true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru0/b$a;", "", "<init>", "()V", "", "USER_HAS_LIVE_EVENT_SHARING_CAPABLE_DEVICE", "Ljava/lang/String;", "USER_HAS_EVENT_SHARING_CAPABLE_DEVICE", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
