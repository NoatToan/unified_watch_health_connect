package rl1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lrl1/k;", "", "", "value", "resColor", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum k {
    DEEP(0, R.color.gcm_sleep_chart_levels_deep),
    LIGHT(1, R.color.gcm_sleep_chart_levels_light),
    REM(2, R.color.gcm_sleep_chart_levels_rem),
    AWAKE(3, R.color.gcm_sleep_chart_levels_awake),
    MANUAL(4, R.color.gcm_sleep_chart_manual),
    NO_LEVELS(5, R.color.gcm_sleep_chart_no_levels);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f153439c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153448b;

    k(int i14, int i15) {
        this.f153447a = i14;
        this.f153448b = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrl1/k$a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: rl1.k$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2904a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f153449a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.DEEP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k.REM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[k.AWAKE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[k.MANUAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[k.NO_LEVELS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f153449a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(k kVar, m mVar) {
            kVar.getClass();
            x1 x1Var = n.f135158a;
            switch (C2904a.f153449a[kVar.ordinal()]) {
                case 1:
                    mVar.C(207056657);
                    gl.c.f77766a.getClass();
                    long jB = gl.c.a(mVar).b();
                    mVar.f();
                    return jB;
                case 2:
                    mVar.C(207058419);
                    gl.c.f77766a.getClass();
                    long jC = gl.c.a(mVar).c();
                    mVar.f();
                    return jC;
                case 3:
                    mVar.C(207060179);
                    gl.c.f77766a.getClass();
                    long jP = gl.c.a(mVar).p();
                    mVar.f();
                    return jP;
                case 4:
                    mVar.C(207062005);
                    gl.c.f77766a.getClass();
                    long jQ = gl.c.a(mVar).q();
                    mVar.f();
                    return jQ;
                case 5:
                    mVar.C(207063923);
                    gl.c.f77766a.getClass();
                    long jC2 = gl.c.a(mVar).c();
                    mVar.f();
                    return jC2;
                case 6:
                    mVar.C(207065868);
                    mVar.f();
                    gl.c.f77766a.getClass();
                    return gl.c.f77767b.f77785i;
                default:
                    throw n23.j.m(mVar, 207055218);
            }
        }

        private a() {
        }
    }
}
