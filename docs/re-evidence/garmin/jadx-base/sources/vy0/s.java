package vy0;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvy0/s;", "Lvy0/r;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f180768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f180769b;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"vy0/s$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<List<? extends String>> {
    }

    static {
        new a(null);
    }

    public s(f12.l lVar) {
        lVar.getClass();
        this.f180768a = lVar;
        this.f180769b = g2.b(1, 0, null, 6);
    }

    @Override // vy0.r
    public final List<String> a() {
        String strA4 = this.f180768a.A4("keyMoreMenuRecentSearches", null);
        if (strA4 == null || strA4.length() == 0) {
            return j0.f134944a;
        }
        return (List) GsonUtil.f47253b.fromJson(strA4, new b().getType());
    }

    @Override // vy0.r
    public final void b(String str) {
        str.getClass();
        ArrayList arrayListD1 = p13.h0.d1(a());
        arrayListD1.remove(str);
        arrayListD1.add(0, str);
        if (arrayListD1.size() > 10) {
            arrayListD1.subList(10, arrayListD1.size()).clear();
        }
        this.f180768a.S("keyMoreMenuRecentSearches", GsonUtil.a(arrayListD1));
    }

    @Override // vy0.r
    public final boolean c() {
        return this.f180768a.W2("keyMagicSearchEnabled", false);
    }

    @Override // vy0.r
    public final void d(boolean z14) {
        this.f180769b.d(Boolean.valueOf(z14));
    }

    @Override // vy0.r
    public final void e(boolean z14) {
        this.f180768a.O2("keySimilarityThresholdEnabled", z14);
    }

    @Override // vy0.r
    public final double f() {
        return ((double) this.f180768a.i2(60, "keySimilarityThreshold")) / 100.0d;
    }

    @Override // vy0.r
    public final void g(boolean z14) {
        this.f180768a.O2("keyMagicSearchEnabled", z14);
    }

    @Override // vy0.r
    /* JADX INFO: renamed from: h, reason: from getter */
    public final e2 getF180769b() {
        return this.f180769b;
    }

    @Override // vy0.r
    public final void i(int i14) {
        this.f180768a.u2(j23.t.e(i14, 0, 100), "keySimilarityThreshold");
    }

    @Override // vy0.r
    public final void j(String str) {
        str.getClass();
        ArrayList arrayListD1 = p13.h0.d1(a());
        arrayListD1.remove(str);
        this.f180768a.S("keyMoreMenuRecentSearches", GsonUtil.a(arrayListD1));
    }

    @Override // vy0.r
    public final boolean k() {
        return this.f180768a.W2("keySimilarityThresholdEnabled", false);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lvy0/s$a;", "", "<init>", "()V", "", "KEY_MORE_MENU_RECENT_SEARCHES", "Ljava/lang/String;", "", "MAX_RECENT_SEARCHES", "I", "KEY_MAGIC_SEARCH_ENABLED", "MAGIC_WORD", "KEY_SIMILARITY_THRESHOLD", "KEY_SIMILARITY_THRESHOLD_ENABLED", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
