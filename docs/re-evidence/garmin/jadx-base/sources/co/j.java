package co;

import ao.m;
import java.util.List;
import o13.q;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lco/j;", "", "Lao/d;", "repository", "<init>", "(Lao/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.d f28112a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28113a;

        static {
            int[] iArr = new int[am.g.values().length];
            try {
                iArr[am.g.f3943g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.g.f3944h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28113a = iArr;
        }
    }

    public j(ao.d dVar) {
        dVar.getClass();
        this.f28112a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, m mVar, List list, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f28116c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f28116c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f28114a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar2.f28116c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(obj);
                return ((q) obj).f128597a;
            }
            if (i15 == 2) {
                r.b(obj);
                return ((q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        bo.b bVarA = bo.c.a(str, mVar, list);
        int i16 = a.f28113a[mVar.f11528a.ordinal()];
        ao.d dVar = this.f28112a;
        if (i16 == 1 || i16 == 2) {
            int i17 = mVar.f11532e;
            String str2 = mVar.f11533f;
            int i18 = mVar.f11529b + 1;
            int i19 = mVar.f11530c;
            kVar2.f28116c = 1;
            Object objC = dVar.c(i17, i18, i19, str2, kVar2);
            if (objC != aVar) {
                return objC;
            }
        } else {
            kVar2.f28116c = 2;
            Object objG = dVar.g(bVarA, kVar2);
            if (objG != aVar) {
                return objG;
            }
        }
        return aVar;
    }
}
