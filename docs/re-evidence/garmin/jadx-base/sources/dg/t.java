package dg;

import coil3.request.NullRequestDataException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59501a = a.f59502a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59502a = new a();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59503a;

        static {
            int[] iArr = new int[lf.e.values().length];
            try {
                iArr[lf.e.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lf.e.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lf.e.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lf.e.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f59503a = iArr;
        }
    }

    public static final wf.e a(wf.f fVar, Throwable th3) {
        hf.h hVarInvoke;
        if (th3 instanceof NullRequestDataException) {
            e23.l<wf.f, hf.h> lVar = fVar.f184921t;
            wf.f.b bVar = fVar.f184927z;
            hVarInvoke = lVar.invoke(fVar);
            if (hVarInvoke == null) {
                hVarInvoke = bVar.f184963j.invoke(fVar);
            }
            if (hVarInvoke == null && (hVarInvoke = fVar.f184920s.invoke(fVar)) == null) {
                hVarInvoke = bVar.f184962i.invoke(fVar);
            }
        } else {
            hVarInvoke = fVar.f184920s.invoke(fVar);
            if (hVarInvoke == null) {
                hVarInvoke = fVar.f184927z.f184962i.invoke(fVar);
            }
        }
        return new wf.e(hVarInvoke, fVar, th3);
    }
}
