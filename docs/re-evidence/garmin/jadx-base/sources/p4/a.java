package p4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp4/a;", "", "", "transform", "<init>", "([F)V", "d", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f135532b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2569a f135533c = new C2569a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f135534a;

    /* JADX INFO: renamed from: p4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p4/a$a", "Lp4/a;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2569a extends a {
        public C2569a(float[] fArr) {
            super(fArr, null);
        }

        public final String toString() {
            return "Bradford";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p4/a$b", "Lp4/a;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {
        public b(float[] fArr) {
            super(fArr, null);
        }

        public final String toString() {
            return "Ciecat02";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p4/a$c", "Lp4/a;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends a {
        public c(float[] fArr) {
            super(fArr, null);
        }

        public final String toString() {
            return "VonKries";
        }
    }

    static {
        new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
        new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    }

    private a(float[] fArr) {
        this.f135534a = fArr;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp4/a$d;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ a(float[] fArr, p005kotlin.jvm.internal.j jVar) {
        this(fArr);
    }
}
