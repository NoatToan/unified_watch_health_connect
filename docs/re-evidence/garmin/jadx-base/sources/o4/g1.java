package o4;

import android.graphics.DashPathEffect;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f128855a = a.f128856a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/g1$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f128856a = new a();

        private a() {
        }

        public static k a(float f14, float[] fArr) {
            return new k(new DashPathEffect(fArr, f14));
        }

        public static /* synthetic */ k b(a aVar, float[] fArr) {
            aVar.getClass();
            return a(0.0f, fArr);
        }
    }
}
