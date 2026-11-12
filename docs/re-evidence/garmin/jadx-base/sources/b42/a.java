package b42;

import o82.g;
import p005kotlin.Metadata;
import q71.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb42/a;", "", "<init>", "()V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15716a = new a();

    /* JADX INFO: renamed from: b42.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0222a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15717a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[e.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[e.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f15717a = iArr2;
        }
    }

    private a() {
    }
}
