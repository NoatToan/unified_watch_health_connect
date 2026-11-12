package n01;

import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ln01/h;", "Ln01/g;", "Lm01/g;", "repository", "", "searchExpression", "Lf01/j;", "sortType", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lm21/b;", "mode", "<init>", "(Lm01/g;Ljava/lang/String;Lf01/j;Ljava/lang/String;Ljava/lang/String;Lm21/b;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f122128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f122129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f01.j f122130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f122131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f122132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m21.b f122133h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122134a;

        static {
            int[] iArr = new int[f01.j.values().length];
            try {
                iArr[f01.j.CALORIES_ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f01.j.CALORIES_DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122134a = iArr;
        }
    }

    static {
        new a(null);
    }

    public h(m01.g gVar, String str, f01.j jVar, String str2, String str3, m21.b bVar) {
        gVar.getClass();
        str.getClass();
        jVar.getClass();
        str2.getClass();
        str3.getClass();
        bVar.getClass();
        this.f122128c = gVar;
        this.f122129d = str;
        this.f122130e = jVar;
        this.f122131f = str2;
        this.f122132g = str3;
        this.f122133h = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        k kVar;
        h3.a aVar2;
        int i14;
        List listN0;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f122139e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f122139e = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f122137c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar2.f122139e;
        if (i16 == 0) {
            r.b(obj);
            Integer num = (Integer) aVar.a();
            int iIntValue = num != null ? num.intValue() : 0;
            g(iIntValue == 0);
            int iF = f(iIntValue, aVar.f196007a);
            int i17 = aVar.f196007a;
            kVar2.f122135a = aVar;
            kVar2.f122136b = iIntValue;
            kVar2.f122139e = 1;
            Object objJ = this.f122128c.j(this.f122129d, iF, i17, this.f122131f, this.f122132g, kVar2);
            if (objJ == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            i14 = iIntValue;
            obj = objJ;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = kVar2.f122136b;
            aVar2 = kVar2.f122135a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        t tVar = (t) ((v2.b) v2Var).f47386a;
        List<g01.a> list = tVar.f74255a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                int i18 = b.f122134a[this.f122130e.ordinal()];
                if (i18 == 1) {
                    listN0 = h0.N0(arrayList, new i());
                } else if (i18 == 2) {
                    listN0 = arrayList;
                    listN0 = h0.N0(arrayList, new j());
                }
                listN0 = arrayList;
                ArrayList arrayList2 = new ArrayList(y.r(listN0, 10));
                Iterator it3 = listN0.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new g01.n.a((b11.a) it3.next()));
                }
                return new h3.b.c(arrayList2, i14 == 0 ? null : new Integer(i14 - 1), tVar.f74256b ? new Integer((aVar2.f196007a / 50) + i14) : null);
            }
            b11.a aVarA = ((g01.a) it.next()).a();
            m21.b bVar = this.f122133h;
            if ((bVar instanceof m21.b.e) || (bVar instanceof m21.b.C2206b)) {
                obj2 = aVarA;
            } else if (bVar instanceof m21.b.c) {
                if (aVarA != null && v21.a.c(aVarA, ((m21.b.c) bVar).f116072b)) {
                    obj2 = aVarA;
                }
            } else {
                if (!(bVar instanceof m21.b.a)) {
                    u0.r();
                    return null;
                }
                if (aVarA != null && aVarA.b() != b11.b.MEAL) {
                    obj2 = aVarA;
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln01/h$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "STARTING_PAGE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ h(m01.g gVar, String str, f01.j jVar, String str2, String str3, m21.b bVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(gVar, str, (i14 & 4) != 0 ? f01.j.DEFAULT : jVar, str2, str3, bVar);
    }
}
