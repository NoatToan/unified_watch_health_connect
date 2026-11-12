package wu2;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import dv0.n;
import e23.p;
import gw2.j;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwu2/a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187327a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f187328b = new cx2.h("ActionClickHelper", null, 2, null);

    /* JADX INFO: renamed from: wu2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wu2/a$a", "Lwu2/i$a;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3485a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ba2.e f187329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wt0.i f187330b = new wt0.i((byte) 0, 5);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ba2.e f187331c;

        public C3485a(int i14) {
            this.f187329a = new ba2.e(i14, 15);
            this.f187331c = new ba2.e(i14, 16);
        }

        @Override // wu2.i.a
        public final p<Fragment, dx2.c, Unit> a() {
            return this.f187329a;
        }

        @Override // wu2.i.a
        public final p<Fragment, dx2.c, Unit> b() {
            return this.f187330b;
        }

        @Override // wu2.i.a
        public final p<Fragment, dx2.c, Unit> c() {
            return this.f187331c;
        }
    }

    private a() {
    }

    public static void a(Fragment fragment, dx2.c cVar, int i14) {
        f187328b.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        cVar.c5(contextRequireContext, j.ACTION, i14, null, new n(2));
    }

    public static void b(Fragment fragment, View view2, zw2.f fVar, dx2.c cVar, Map map) {
        view2.getClass();
        cVar.getClass();
        f187328b.getClass();
        view2.setOnClickListener(new ew2.c(fragment, cVar, map, fVar));
    }
}
