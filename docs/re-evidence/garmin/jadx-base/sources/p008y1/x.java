package p008y1;

import p005kotlin.Metadata;
import s1.j1;
import s1.l;

/* JADX INFO: loaded from: classes.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f193700a = a.f193701a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/x$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f193701a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j1 f193702b = l.c(7, 0.0f, 0.0f, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C3615a f193703c = new C3615a();

        /* JADX INFO: renamed from: y1.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/x$a$a", "Ly1/x;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3615a implements x {
        }

        private a() {
        }
    }

    default float a(float f14, float f15, float f16) {
        f193700a.getClass();
        float f17 = f15 + f14;
        if ((f14 >= 0.0f && f17 <= f16) || (f14 < 0.0f && f17 > f16)) {
            return 0.0f;
        }
        float f18 = f17 - f16;
        return Math.abs(f14) < Math.abs(f18) ? f14 : f18;
    }
}
