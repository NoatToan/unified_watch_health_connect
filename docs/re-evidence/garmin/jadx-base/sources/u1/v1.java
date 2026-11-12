package u1;

import android.os.Build;
import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f167696a = a.f167697a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/v1$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f167697a = new a();

        private a() {
        }

        public static v1 a() {
            p5.j0<e23.a<n4.c>> j0Var = j1.f167577a;
            return Build.VERSION.SDK_INT == 28 ? w1.f167706b : x1.f167719b;
        }
    }

    boolean a();

    u1 b(View view2, boolean z14, long j8, float f14, float f15, boolean z15, g6.c cVar, float f16);
}
