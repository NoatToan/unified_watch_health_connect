package lp;

import fw.m;
import fw.p;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llp/a;", "", "Ltp/a;", "repo", "Lf12/l;", "gcmUserSettings", "Lam/d;", "activitiesDelegate", "<init>", "(Ltp/a;Lf12/l;Lam/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp.a f114063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f114064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am.d f114065c;

    /* JADX INFO: renamed from: lp.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114066a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f114066a = iArr;
        }
    }

    public a(tp.a aVar, f12.l lVar, am.d dVar) {
        aVar.getClass();
        lVar.getClass();
        dVar.getClass();
        this.f114063a = aVar;
        this.f114064b = lVar;
        this.f114065c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r8.invoke(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j8, np.d.a aVar, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f114071e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f114071e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objD = bVar.f114069c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f114071e;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objD);
            bVar.f114068b = aVar;
            bVar.f114067a = j8;
            bVar.f114071e = 1;
            objD = this.f114063a.d(j8, bVar);
            if (objD != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            j8 = bVar.f114067a;
            aVar = bVar.f114068b;
            r.b(objD);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        return Boolean.valueOf(z14);
        if (C2173a.f114066a[((m) objD).f73769b.ordinal()] == 1) {
            this.f114064b.J(true);
            this.f114065c.e0(j8);
            bVar.f114068b = null;
            bVar.f114067a = j8;
            bVar.f114071e = 2;
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
