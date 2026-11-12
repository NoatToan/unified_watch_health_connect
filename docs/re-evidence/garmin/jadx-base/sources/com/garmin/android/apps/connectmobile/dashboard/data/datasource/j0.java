package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/j0;", "Lgm0/a;", "Lpb2/e$i;", "Lj70/h;", "Luh/b;", "apolloClient", "Lf12/b;", "userAccount", "Lf12/l;", "userSettings", "<init>", "(Luh/b;Lf12/b;Lf12/l;)V", "b", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends gm0.a<pb2.e.i, j70.h> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uh.b f33234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.b f33235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f12.l f33236g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/j0$b;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        DAILY("daily"),
        WEEKLY("weekly"),
        /* JADX INFO: Fake field, exist only in values array */
        MONTHLY("monthly");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33240a;

        b(String str) {
            this.f33240a = str;
        }
    }

    static {
        new a(null);
    }

    public j0(uh.b bVar, f12.b bVar2, f12.l lVar) {
        bVar.getClass();
        bVar2.getClass();
        lVar.getClass();
        this.f33234e = bVar;
        this.f33235f = bVar2;
        this.f33236g = lVar;
    }

    public static boolean m(Set set, Set set2, Set set3) {
        return (set.contains(o70.f.KEY_STATS) && set2.contains(o70.o.TRAINING_STATUS)) || (set.contains(o70.f.SECONDARY_STATS) && (set3.contains(o70.t.K0) || set3.contains(o70.t.J0)));
    }

    @Override // gm0.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final uh.b getF33234e() {
        return this.f33234e;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x020a  */
    /* JADX WARN: Code duplicated, block: B:136:0x022f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0239  */
    /* JADX WARN: Code duplicated, block: B:141:0x0243  */
    /* JADX WARN: Code duplicated, block: B:145:0x024c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0256  */
    /* JADX WARN: Code duplicated, block: B:148:0x0259  */
    /* JADX WARN: Code duplicated, block: B:152:0x0265  */
    /* JADX WARN: Code duplicated, block: B:155:0x0277  */
    /* JADX WARN: Code duplicated, block: B:157:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0285  */
    /* JADX WARN: Code duplicated, block: B:166:0x028e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0298  */
    /* JADX WARN: Code duplicated, block: B:172:0x029f  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:197:0x02de  */
    /* JADX WARN: Code duplicated, block: B:202:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:230:0x0359  */
    /* JADX WARN: Code duplicated, block: B:232:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:235:0x0364  */
    /* JADX WARN: Code duplicated, block: B:238:0x0371  */
    /* JADX WARN: Code duplicated, block: B:241:0x037e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0388  */
    /* JADX WARN: Code duplicated, block: B:246:0x0392  */
    /* JADX WARN: Code duplicated, block: B:255:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:259:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:267:0x03da  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:275:0x03f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:282:0x0401  */
    /* JADX WARN: Code duplicated, block: B:290:0x041e  */
    /* JADX WARN: Code duplicated, block: B:293:0x0431  */
    /* JADX WARN: Code duplicated, block: B:295:0x043b  */
    /* JADX WARN: Code duplicated, block: B:296:0x043d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0447  */
    /* JADX WARN: Code duplicated, block: B:302:0x0451  */
    /* JADX WARN: Code duplicated, block: B:303:0x0453  */
    /* JADX WARN: Code duplicated, block: B:306:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x045f  */
    /* JADX WARN: Code duplicated, block: B:312:0x0467  */
    /* JADX WARN: Code duplicated, block: B:315:0x0471  */
    /* JADX WARN: Code duplicated, block: B:318:0x0479  */
    /* JADX WARN: Code duplicated, block: B:320:0x0483  */
    /* JADX WARN: Code duplicated, block: B:323:0x048d  */
    /* JADX WARN: Code duplicated, block: B:326:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x0499  */
    /* JADX WARN: Code duplicated, block: B:332:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:335:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:338:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:341:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:344:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:346:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:347:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:351:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:354:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:356:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:360:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:363:0x0500  */
    /* JADX WARN: Code duplicated, block: B:368:0x0515  */
    /* JADX WARN: Code duplicated, block: B:371:0x051d  */
    /* JADX WARN: Code duplicated, block: B:374:0x052a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0534  */
    /* JADX WARN: Code duplicated, block: B:381:0x0540  */
    /* JADX WARN: Code duplicated, block: B:384:0x0549  */
    /* JADX WARN: Code duplicated, block: B:396:0x0575  */
    /* JADX WARN: Code duplicated, block: B:399:0x057e  */
    /* JADX WARN: Code duplicated, block: B:404:0x0590  */
    /* JADX WARN: Code duplicated, block: B:407:0x0597  */
    /* JADX WARN: Code duplicated, block: B:410:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:412:0x05a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:415:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:418:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:422:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:423:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:427:0x05ef A[LOOP:0: B:425:0x05e9->B:427:0x05ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:430:0x0608  */
    /* JADX WARN: Code duplicated, block: B:433:0x0613  */
    /* JADX WARN: Code duplicated, block: B:436:0x061b  */
    /* JADX WARN: Code duplicated, block: B:439:0x0626  */
    /* JADX WARN: Code duplicated, block: B:442:0x0652  */
    /* JADX WARN: Code duplicated, block: B:444:0x065a  */
    /* JADX WARN: Code duplicated, block: B:450:0x066d  */
    /* JADX WARN: Code duplicated, block: B:453:0x0678  */
    /* JADX WARN: Code duplicated, block: B:456:0x068e  */
    /* JADX WARN: Code duplicated, block: B:459:0x0699  */
    /* JADX WARN: Code duplicated, block: B:462:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:468:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:470:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:478:0x06db  */
    /* JADX WARN: Code duplicated, block: B:480:0x06e3  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:478:0x06db
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gm0.a
    public final vh.s0 d(hm0.a r64) {
        /*
            Method dump skipped, instruction units count: 1819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.dashboard.data.datasource.j0.d(hm0.a):vh.s0");
    }

    @Override // gm0.a
    public final vh.s0.a i(vh.s0.a aVar, vh.s0.a aVar2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        pb2.e.r rVar;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        List<pb2.e.z> list;
        pb2.e.y yVar;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        Object obj30;
        pb2.e.o oVar;
        pb2.e.g gVar;
        pb2.e.l lVar;
        pb2.e.c cVar;
        Object obj31;
        pb2.e.w wVar;
        pb2.e.i iVar = (pb2.e.i) aVar;
        pb2.e.i iVar2 = (pb2.e.i) aVar2;
        String str = iVar2 != null ? iVar2.f136999a : iVar.f136999a;
        if (iVar2 == null || (obj = iVar2.f137000b) == null) {
            obj = iVar.f137000b;
        }
        Object obj32 = obj;
        if (iVar2 == null || (obj2 = iVar2.f137001c) == null) {
            obj2 = iVar.f137001c;
        }
        Object obj33 = obj2;
        if (iVar2 == null || (obj3 = iVar2.f137003e) == null) {
            obj3 = iVar.f137003e;
        }
        Object obj34 = obj3;
        if (iVar2 == null || (obj4 = iVar2.f137004f) == null) {
            obj4 = iVar.f137004f;
        }
        Object obj35 = obj4;
        if (iVar2 == null || (obj5 = iVar2.f137005g) == null) {
            obj5 = iVar.f137005g;
        }
        Object obj36 = obj5;
        if (iVar2 == null || (obj6 = iVar2.f137006h) == null) {
            obj6 = iVar.f137006h;
        }
        Object obj37 = obj6;
        if (iVar2 == null || (rVar = iVar2.f137007i) == null) {
            rVar = iVar.f137007i;
        }
        pb2.e.r rVar2 = rVar;
        if (iVar2 == null || (obj7 = iVar2.f137008j) == null) {
            obj7 = iVar.f137008j;
        }
        Object obj38 = obj7;
        if (iVar2 == null || (obj8 = iVar2.f137009k) == null) {
            obj8 = iVar.f137009k;
        }
        Object obj39 = obj8;
        if (iVar2 == null || (obj9 = iVar2.f137010l) == null) {
            obj9 = iVar.f137010l;
        }
        Object obj40 = obj9;
        if (iVar2 == null || (obj10 = iVar2.f137011m) == null) {
            obj10 = iVar.f137011m;
        }
        Object obj41 = obj10;
        if (iVar2 == null || (obj11 = iVar2.f137012n) == null) {
            obj11 = iVar.f137012n;
        }
        Object obj42 = obj11;
        if (iVar2 == null || (obj12 = iVar2.f137013o) == null) {
            obj12 = iVar.f137013o;
        }
        Object obj43 = obj12;
        if (iVar2 == null || (obj13 = iVar2.f137014p) == null) {
            obj13 = iVar.f137014p;
        }
        Object obj44 = obj13;
        if (iVar2 == null || (obj14 = iVar2.f137015q) == null) {
            obj14 = iVar.f137015q;
        }
        Object obj45 = obj14;
        if (iVar2 == null || (obj15 = iVar2.f137016r) == null) {
            obj15 = iVar.f137016r;
        }
        Object obj46 = obj15;
        if (iVar2 == null || (obj16 = iVar2.f137017s) == null) {
            obj16 = iVar.f137017s;
        }
        Object obj47 = obj16;
        if (iVar2 == null || (list = iVar2.f137018t) == null) {
            list = iVar.f137018t;
        }
        List<pb2.e.z> list2 = list;
        if (iVar2 == null || (yVar = iVar2.f137019u) == null) {
            yVar = iVar.f137019u;
        }
        pb2.e.y yVar2 = yVar;
        if (iVar2 == null || (obj17 = iVar2.f137020v) == null) {
            obj17 = iVar.f137020v;
        }
        Object obj48 = obj17;
        if (iVar2 == null || (obj18 = iVar2.f137021w) == null) {
            obj18 = iVar.f137021w;
        }
        Object obj49 = obj18;
        if (iVar2 == null || (obj19 = iVar2.f137022x) == null) {
            obj19 = iVar.f137022x;
        }
        Object obj50 = obj19;
        if (iVar2 == null || (obj20 = iVar2.f137023y) == null) {
            obj20 = iVar.f137023y;
        }
        Object obj51 = obj20;
        if (iVar2 == null || (obj21 = iVar2.f137024z) == null) {
            obj21 = iVar.f137024z;
        }
        Object obj52 = obj21;
        if (iVar2 == null || (obj22 = iVar2.A) == null) {
            obj22 = iVar.A;
        }
        Object obj53 = obj22;
        if (iVar2 == null || (obj23 = iVar2.B) == null) {
            obj23 = iVar.B;
        }
        Object obj54 = obj23;
        if (iVar2 == null || (obj24 = iVar2.D) == null) {
            obj24 = iVar.D;
        }
        Object obj55 = obj24;
        if (iVar2 == null || (obj25 = iVar2.E) == null) {
            obj25 = iVar.E;
        }
        Object obj56 = obj25;
        if (iVar2 == null || (obj26 = iVar2.F) == null) {
            obj26 = iVar.F;
        }
        Object obj57 = obj26;
        if (iVar2 == null || (obj27 = iVar2.G) == null) {
            obj27 = iVar.G;
        }
        Object obj58 = obj27;
        if (iVar2 == null || (obj28 = iVar2.H) == null) {
            obj28 = iVar.H;
        }
        Object obj59 = obj28;
        if (iVar2 == null || (obj29 = iVar2.I) == null) {
            obj29 = iVar.I;
        }
        Object obj60 = obj29;
        if (iVar2 == null || (obj30 = iVar2.J) == null) {
            obj30 = iVar.J;
        }
        Object obj61 = obj30;
        if (iVar2 == null || (oVar = iVar2.K) == null) {
            oVar = iVar.K;
        }
        pb2.e.o oVar2 = oVar;
        if (iVar2 == null || (gVar = iVar2.C) == null) {
            gVar = iVar.C;
        }
        pb2.e.g gVar2 = gVar;
        if (iVar2 == null || (lVar = iVar2.L) == null) {
            lVar = iVar.L;
        }
        pb2.e.l lVar2 = lVar;
        if (iVar2 == null || (cVar = iVar2.f137002d) == null) {
            cVar = iVar.f137002d;
        }
        pb2.e.c cVar2 = cVar;
        if (iVar2 == null || (wVar = iVar2.M) == null || (obj31 = wVar.f137111a) == null) {
            pb2.e.w wVar2 = iVar.M;
            obj31 = wVar2 != null ? wVar2.f137111a : null;
        }
        return new pb2.e.i(str, obj32, obj33, cVar2, obj34, obj35, obj36, obj37, rVar2, obj38, obj39, obj40, obj41, obj42, obj43, obj44, obj45, obj46, obj47, list2, yVar2, obj48, obj49, obj50, obj51, obj52, obj53, obj54, gVar2, obj55, obj56, obj57, obj58, obj59, obj60, obj61, oVar2, lVar2, new pb2.e.w(obj31));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
