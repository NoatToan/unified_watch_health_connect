package com.garmin.android.apps.connectmobile.activities.stats.exercises;

import a61.r;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l2;
import com.garmin.android.apps.connectmobile.R;
import fp0.l;
import hq.h;
import hq.p0;
import hq.r0;
import hq.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.u;
import p13.w;
import p13.y;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/c;", "Landroidx/lifecycle/u1;", "La61/r;", "strengthRepo", "<init>", "(La61/r;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f29884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f29886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f29887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f29888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f29889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l2<Unit> f29890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2<Unit> f29891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2<e> f29892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<? extends h> f29893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<String, String> f29894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map<String, String> f29895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f29896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f29897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f29898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f29899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.e f29900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f29901r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f29902t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f29905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f29906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c2 f29907z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29908a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.RECENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29908a = iArr;
        }
    }

    static {
        new a(null);
    }

    public c(r rVar) {
        rVar.getClass();
        this.f29884a = rVar;
        this.f29886c = "";
        this.f29887d = u0.ALL;
        this.f29888e = "";
        this.f29890g = new l2<>();
        this.f29891h = new l2<>();
        this.f29892i = new l2<>();
        this.f29893j = j0.f134944a;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f29894k = k0Var;
        this.f29895l = k0Var;
        this.f29901r = q2.a(0);
        this.f29904w = true;
        this.f29905x = true;
        this.f29906y = new LinkedHashMap();
    }

    public static void C4(c cVar, Context context, String str, u0 u0Var, List list, int i14) {
        ArrayList arrayList;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF2;
        CharSequence charSequence = (i14 & 2) != 0 ? cVar.f29886c : str;
        u0 u0Var2 = (i14 & 4) != 0 ? cVar.f29887d : u0Var;
        List list2 = (i14 & 8) != 0 ? cVar.f29893j : list;
        l2<e> l2Var = cVar.f29892i;
        charSequence.getClass();
        u0Var2.getClass();
        list2.getClass();
        cVar.f29886c = charSequence;
        cVar.f29887d = u0Var2;
        cVar.f29893j = list2;
        int i15 = b.f29908a[u0Var2.ordinal()];
        if (i15 == 1) {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = cVar.f29896m;
            arrayList = (cVar2 == null || (dVarArrF = cVar2.F()) == null) ? new ArrayList() : u.l0((com.garmin.android.apps.connectmobile.repcounting.model.d[]) u.X(dVarArrF));
        } else if (i15 != 2) {
            lc.u0.r();
            return;
        } else {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar3 = cVar.f29898o;
            arrayList = (cVar3 == null || (dVarArrF2 = cVar3.F()) == null) ? new ArrayList() : u.l0(dVarArrF2);
        }
        boolean z14 = cVar.f29889f != null;
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.A4().isEmpty()) {
            for (com.garmin.android.apps.connectmobile.repcounting.model.b bVar : cVar.A4()) {
                String strD = bVar.D();
                String strF = bVar.F();
                if (strF == null) {
                    strF = bVar.D();
                }
                com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = zf.b.n(strD, strF, arrayList);
                if (dVarN != null) {
                    arrayList2.add(new r0(dVarN, null, 2, null));
                }
            }
            if (!arrayList2.isEmpty()) {
                String string = context.getString(z14 && arrayList2.size() == 1 ? R.string.common_current_selection : R.string.common_suggested);
                string.getClass();
                arrayList2.add(0, new p0(string));
            }
        }
        if (arrayList.isEmpty() && u0Var2 == u0.RECENT) {
            l2Var.j(e.b.f29929a);
            return;
        }
        if (charSequence.length() != 0 || !list2.isEmpty()) {
            c2 c2Var = cVar.f29907z;
            if (c2Var != null) {
                c2Var.c(null);
            }
            cVar.f29907z = ge1.b.T(v1.a(cVar), null, null, new d(cVar, charSequence, arrayList, list2, null), 3);
            return;
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new r0((com.garmin.android.apps.connectmobile.repcounting.model.d) it.next(), null, 2, null));
        }
        u0 u0Var3 = u0.ALL;
        l2Var.j(new e.c(cVar.z4(arrayList3, arrayList2, u0Var2 == u0Var3, u0Var2 == u0Var3), cVar.f29889f));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Code duplicated, block: B:18:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007c -> B:19:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object x4(com.garmin.android.apps.connectmobile.activities.stats.exercises.c r7, android.content.Context r8, v13.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof hq.a1
            if (r0 == 0) goto L16
            r0 = r9
            hq.a1 r0 = (hq.a1) r0
            int r1 = r0.f84960h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f84960h = r1
            goto L1b
        L16:
            hq.a1 r0 = new hq.a1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f84958f
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f84960h
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r7 = r0.f84957e
            int r8 = r0.f84956d
            int r2 = r0.f84955c
            java.lang.Object[] r4 = r0.f84954b
            java.lang.Comparable[] r4 = (java.lang.Comparable[]) r4
            com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase r5 = r0.f84953a
            o13.r.b(r9)
            goto L7f
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L3d:
            o13.r.b(r9)
            com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase$a r9 = com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase.f29919a
            r9.getClass()
            com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase r8 = com.garmin.android.apps.connectmobile.activities.stats.exercises.database.RecentSelectedExercisesDatabase.a.a(r8)
            com.garmin.android.apps.connectmobile.repcounting.model.c r7 = r7.B4()
            com.garmin.android.apps.connectmobile.repcounting.model.d[] r7 = r7.F()
            java.lang.Comparable[] r7 = (java.lang.Comparable[]) r7
            java.lang.Comparable[] r7 = p13.u.X(r7)
            int r9 = r7.length
            r2 = 0
            r4 = r7
            r5 = r8
            r7 = r9
            r8 = r2
        L5d:
            if (r8 >= r7) goto L81
            r9 = r4[r8]
            com.garmin.android.apps.connectmobile.repcounting.model.d r9 = (com.garmin.android.apps.connectmobile.repcounting.model.d) r9
            iq.c r6 = new iq.c
            r6.<init>(r9)
            iq.a r9 = r5.e()
            r0.f84953a = r5
            r0.f84954b = r4
            r0.f84955c = r2
            r0.f84956d = r8
            r0.f84957e = r7
            r0.f84960h = r3
            java.lang.Object r9 = r9.c(r6, r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            int r8 = r8 + r3
            goto L5d
        L81:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.activities.stats.exercises.c.x4(com.garmin.android.apps.connectmobile.activities.stats.exercises.c, android.content.Context, v13.c):java.lang.Object");
    }

    public static final void y4(c cVar, List list) {
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarD;
        cVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fq.a aVar = (fq.a) it.next();
            for (fq.b bVar : aVar.d()) {
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = cVar.f29896m;
                if (cVar2 != null && (dVarD = cVar2.D(aVar.getCategoryKey(), bVar.getExerciseKey())) != null) {
                    List<String> listB = bVar.b();
                    dVarD.f41110i = (listB == null || listB.isEmpty()) ? w.c(qu1.a.NO_EQUIPMENT.f147898a) : bVar.b();
                }
            }
        }
    }

    public final List<com.garmin.android.apps.connectmobile.repcounting.model.b> A4() {
        com.garmin.android.apps.connectmobile.repcounting.model.b[] bVarArrF;
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = this.f29900q;
        if (eVar == null || (bVarArrF = eVar.F()) == null) {
            return j0.f134944a;
        }
        r13.d dVar = r13.d.f149430a;
        dVar.getClass();
        return u.Y(bVarArrF, dVar);
    }

    public final com.garmin.android.apps.connectmobile.repcounting.model.c B4() {
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        ArrayList arrayList = null;
        arrayList = null;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVarI = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).i();
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f29896m;
        if (cVar != null && (dVarArrF = cVar.F()) != null) {
            arrayList = new ArrayList();
            for (com.garmin.android.apps.connectmobile.repcounting.model.d dVar : dVarArrF) {
                String str = dVar.f41102a;
                String str2 = dVar.f41106e;
                ArrayList<com.garmin.android.apps.connectmobile.repcounting.model.c.C0779c> arrayList2 = cVarI.f41097a;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (com.garmin.android.apps.connectmobile.repcounting.model.c.C0779c c0779c : arrayList2) {
                        if (s.g(c0779c.f41098a, str) && c0779c.f41099b.equals(str2)) {
                            arrayList.add(dVar);
                            break;
                        }
                    }
                }
            }
        }
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = j0.f134944a;
        }
        return new com.garmin.android.apps.connectmobile.repcounting.model.c((com.garmin.android.apps.connectmobile.repcounting.model.d[]) collection.toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
    }

    public final ArrayList z4(List list, ArrayList arrayList, boolean z14, boolean z15) {
        String upperCase;
        Character chQ0;
        List list2 = arrayList;
        if (!z15 || arrayList == null) {
            list2 = j0.f134944a;
        }
        if (this.f29885b) {
            list = h0.N0(list, new a61.c(new l(this, 16), 9));
        } else if (z14) {
            q13.b bVarB = w.b();
            Iterator it = list.iterator();
            String str = null;
            while (it.hasNext()) {
                r0 r0Var = (r0) it.next();
                String str2 = r0Var.f85140a.f41107f;
                if (str2 == null || (chQ0 = d53.y.q0(str2)) == null) {
                    upperCase = "";
                } else {
                    String strValueOf = String.valueOf(chQ0.charValue());
                    strValueOf.getClass();
                    upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                if (TextUtils.isDigitsOnly(upperCase)) {
                    upperCase = "#";
                }
                if (!s.g(str, upperCase)) {
                    bVarB.add(new p0(upperCase));
                    str = upperCase;
                }
                bVarB.add(new r0(r0Var.f85140a, null, 2, null));
            }
            list = w.a(bVarB);
        }
        return (list2.isEmpty() || list.isEmpty() || (h0.d0(list) instanceof p0)) ? h0.C0(list2, list) : h0.C0(h0.D0(list2, new p0("")), list);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/exercises/c$a;", "", "<init>", "()V", "", "HEADER_FOR_DIGIT", "Ljava/lang/String;", "KEY_EXERCISE_KEY", "KEY_RANK", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(r rVar, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            rVar = new r(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(rVar);
    }
}
