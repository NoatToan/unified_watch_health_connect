package b63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Lb63/d;", "Lb63/f;", "", "totalMonths", "", "days", "<init>", "(JI)V", "years", "months", "(III)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.c.class)
public final class d extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16179b;

    public /* synthetic */ d(int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16);
    }

    @Override // b63.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF16185b() {
        return this.f16179b;
    }

    @Override // b63.f
    public final int b() {
        return 0;
    }

    @Override // b63.f
    public final int c() {
        return 0;
    }

    @Override // b63.f
    public final int d() {
        return 0;
    }

    @Override // b63.f
    public final int e() {
        return 0;
    }

    @Override // b63.f
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF16184a() {
        return this.f16178a;
    }

    @Override // b63.f
    /* JADX INFO: renamed from: g */
    public final long getF16186c() {
        return 0L;
    }

    /* JADX INFO: renamed from: b63.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/d$a;", "", "<init>", "()V", "Li63/c;", "Lb63/d;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return h63.c.f82286b;
        }

        private Companion() {
        }
    }

    public d(long j8, int i14) {
        super(null);
        this.f16178a = j8;
        this.f16179b = i14;
    }

    public d(int i14, int i15, int i16) {
        this(h.b(i14, i15), i16);
    }
}
