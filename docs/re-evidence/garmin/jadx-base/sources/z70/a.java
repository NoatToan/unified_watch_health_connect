package z70;

import c22.p3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lz70/a;", "Lz70/x;", "Lz70/y;", "imageStorage", "Lzy0/o;", "imageDownloader", "<init>", "(Lz70/y;Lzy0/o;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f202772e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f202773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy0.o f202774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f202775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f202776d;

    static {
        new C3782a(null);
    }

    public a(y yVar, zy0.o oVar) {
        yVar.getClass();
        oVar.getClass();
        this.f202773a = yVar;
        this.f202774b = oVar;
        this.f202775c = new ConcurrentHashMap();
        this.f202776d = o13.m.b(new z41.j(14));
    }

    @Override // z70.x
    public final void a() {
        this.f202773a.a();
    }

    @Override // z70.x
    public final void b() {
        ConcurrentHashMap concurrentHashMap = this.f202775c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((String) it.next());
        }
        this.f202773a.deleteAll();
    }

    @Override // z70.x
    public final v0 c(String str) {
        str.getClass();
        ConcurrentHashMap concurrentHashMap = this.f202775c;
        v0 v0Var = (v0) concurrentHashMap.get(str);
        if (v0Var != null) {
            return v0Var;
        }
        o4.f fVarC = this.f202773a.c(str);
        if (fVarC == null) {
            return null;
        }
        a2 a2Var = a2.PROMOTIONS;
        String strConcat = "Returning image in disk for ".concat(str);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DefaultPromosImageManager", strConcat);
        concurrentHashMap.put(str, fVarC);
        return fVarC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        if (r10 == r1) goto L46;
     */
    @Override // z70.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, v13.c cVar) {
        b bVar;
        String str2;
        String str3;
        String str4;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f202781e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f202781e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f202779c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f202781e;
        if (i15 != 0) {
            if (i15 == 1) {
                str4 = bVar.f202778b;
                str3 = bVar.f202777a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (c(str) != null) {
            a2 a2Var = a2.PROMOTIONS;
            String strConcat = "Skip fetching image at ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DefaultPromosImageManager", strConcat);
            return Unit.INSTANCE;
        }
        d53.k kVar = new d53.k("xxhdpi");
        if (e() <= 160) {
            str2 = p3.MDPI.f23201a;
        } else if (e() <= 240) {
            str2 = p3.HDPI.f23201a;
        } else if (e() <= 320) {
            str2 = p3.XHDPI.f23201a;
        } else {
            str2 = e() <= 480 ? p3.XXHDPI.f23201a : p3.XXXHDPI.f23201a;
        }
        String strF = kVar.f(str, str2);
        gg1.v0.T.getClass();
        String strConcat2 = gg1.v0.a.b().b().concat(strF);
        a2 a2Var2 = a2.PROMOTIONS;
        String strConcat3 = "Fetching image from ".concat(strConcat2);
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "DefaultPromosImageManager", strConcat3);
        bVar.f202777a = str;
        bVar.f202778b = strConcat2;
        bVar.f202781e = 1;
        Object objA = this.f202774b.a(strConcat2, bVar);
        if (objA != aVar) {
            str3 = str;
            str4 = strConcat2;
            obj = objA;
        }
        return aVar;
        v0 v0Var = (v0) obj;
        if (v0Var == null) {
            a2 a2Var3 = a2.PROMOTIONS;
            String strN = fb1.c.n("No image fetched from ", str4);
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DefaultPromosImageManager", strN);
            return Unit.INSTANCE;
        }
        a2 a2Var4 = a2.PROMOTIONS;
        String strN2 = fb1.c.n("Fetched image from ", str4);
        i2.f36769a.getClass();
        i2.a.b(a2Var4, "DefaultPromosImageManager", strN2);
        bVar.f202777a = null;
        bVar.f202778b = null;
        bVar.f202781e = 2;
        this.f202775c.put(str3, v0Var);
        Unit unitB = this.f202773a.b(v0Var, str3);
        if (unitB != aVar) {
            unitB = Unit.INSTANCE;
        }
    }

    public final int e() {
        return ((Number) this.f202776d.getValue()).intValue();
    }

    /* JADX INFO: renamed from: z70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz70/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3782a {
        public /* synthetic */ C3782a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3782a() {
        }
    }
}
