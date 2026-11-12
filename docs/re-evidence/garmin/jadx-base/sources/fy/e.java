package fy;

import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vx.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfy/e;", "Lvx/g;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f73873a;

    static {
        new a(null);
    }

    public e(l lVar) {
        lVar.getClass();
        this.f73873a = lVar;
    }

    @Override // vx.g
    public final void a() {
        this.f73873a.O2("key_calendar_landscape_chart_hint", false);
    }

    @Override // vx.g
    public final void b() {
        this.f73873a.O2("key_calendar_portrait_chart_hint", false);
    }

    @Override // vx.g
    public final boolean c() {
        return this.f73873a.W2("key_calendar_portrait_chart_hint", true);
    }

    @Override // vx.g
    public final boolean d() {
        return this.f73873a.W2("key_calendar_landscape_chart_hint", true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lfy/e$a;", "", "<init>", "()V", "", "USER_HR_PORTRAIT_CHART_HINT", "Ljava/lang/String;", "USER_HR_LANDSCAPE_CHART_HINT", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
