package hq1;

import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhq1/b;", "Lhq1/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements hq1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f85230a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f85230a = lVar;
    }

    @Override // hq1.a
    public final boolean a() {
        return this.f85230a.W2("key_steps_portrait_chart_hint", true);
    }

    @Override // hq1.a
    public final void b() {
        this.f85230a.O2("key_steps_landscape_chart_hint", false);
    }

    @Override // hq1.a
    public final void c() {
        this.f85230a.O2("key_steps_portrait_chart_hint", false);
    }

    @Override // hq1.a
    public final boolean d() {
        return this.f85230a.W2("key_steps_landscape_chart_hint", true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lhq1/b$a;", "", "<init>", "()V", "", "USER_STEPS_PORTRAIT_CHART_HINT", "Ljava/lang/String;", "USER_STEPS_LANDSCAPE_CHART_HINT", "USER_SUMMARY_INTERVAL_TAB", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
