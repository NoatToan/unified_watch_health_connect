package jd0;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/f;", "Lfm/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements fm.a {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98346a;

        static {
            int[] iArr = new int[fm.h.values().length];
            try {
                iArr[fm.h.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fm.h.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fm.h.NEWS_FEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fm.h.ATP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fm.h.PHOTO_SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f98346a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    @Override // fm.a
    public final List a(Context context, ps.q qVar, fm.c cVar) {
        jr.q qVar2;
        List<jr.r> listG;
        aq.c cVar2;
        Object next;
        jr.s sVarD;
        jr.s sVar;
        context.getClass();
        x0 x0VarO = qVar.o();
        fm.h hVarC = cVar.c();
        List<jr.q> listA = new kr.a(context).a(x0VarO).a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                sVarD = ((jr.q) next).d();
                int i14 = a.f98346a[hVarC.ordinal()];
                if (i14 == 1 || i14 == 2) {
                    sVar = jr.s.Home;
                } else if (i14 == 3) {
                    sVar = jr.s.NewsFeed;
                } else {
                    if (i14 != 4 && i14 != 5) {
                        u0.r();
                        return null;
                    }
                    sVar = jr.s.FeatureList;
                }
            } while (sVarD != sVar);
            qVar2 = (jr.q) next;
        } else {
            qVar2 = null;
        }
        if (qVar2 == null || (listG = qVar2.g()) == null) {
            return j0.f134944a;
        }
        sr.b bVar = new sr.b(context);
        ArrayList arrayListA = is.o.a(listG, qVar);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : arrayListA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            ls.e eVarA = is.m.a((jr.p) obj);
            Object objK = ss.k.k(eVarA, qVar);
            if (hVarC == fm.h.ATP && eVarA == ls.e.TOTAL_CLIMB_ASCENT) {
                cVar2 = null;
            } else {
                int iB = cVar.b(eVarA);
                String strN = bVar.n(eVarA.f114680c);
                l22.a aVar = bVar.f160541b;
                String strB = ss.k.b(eVarA, aVar, objK, iB);
                CharSequence charSequenceA = strB != null ? cVar.a(strB) : null;
                Integer numValueOf = (ss.k.n(eVarA) && qVar.getIsDecoDive()) ? Integer.valueOf(R.string.abbrev_decompression_dive) : null;
                String strB2 = ss.k.b(eVarA, aVar, objK, 32);
                if (strB2 == null) {
                    strB2 = "";
                }
                String str = strB2;
                if (charSequenceA != null) {
                    cVar2 = new aq.c(strN, null, charSequenceA, str, numValueOf, 2, null);
                } else {
                    cVar2 = null;
                }
            }
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
            i15 = i16;
        }
        return arrayList;
    }
}
