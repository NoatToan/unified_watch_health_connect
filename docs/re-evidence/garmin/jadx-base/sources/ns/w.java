package ns;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/w;", "Lu00/b;", "Lqs/f;", "Ll22/b;", "resolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends u00.b<qs.f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127787c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127788a;

        static {
            int[] iArr = new int[qs.f.values().length];
            try {
                iArr[qs.f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs.f.KICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs.f.PULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qs.f.DRILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qs.f.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f127788a = iArr;
        }
    }

    public /* synthetic */ w(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.i() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        int i15;
        qs.f fVar = (qs.f) obj;
        fVar.getClass();
        int i16 = a.f127788a[fVar.ordinal()];
        if (i16 == 1) {
            i15 = qs.f.NONE.f147069b;
        } else if (i16 == 2) {
            i15 = qs.f.KICK.f147069b;
        } else if (i16 == 3) {
            i15 = qs.f.PULL.f147069b;
        } else if (i16 == 4) {
            i15 = qs.f.DRILL.f147069b;
        } else {
            if (i16 != 5) {
                lc.u0.r();
                return null;
            }
            i15 = qs.f.NULL.f147069b;
        }
        return this.f127787c.getString(i15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l22.b bVar, u00.c<qs.f> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127787c = bVar;
    }
}
