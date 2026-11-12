package po2;

import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import o53.c2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lpo2/g;", "Lpo2/f;", "", "targetPurchaseId", "targetPurchaseUrl", "", "jobPollingIntervalInMs", "syncPollingIntervalInMs", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJ)V", "d", "c", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends po2.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f139136n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z53.b f139137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f139138m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/g$b;", "Lpo2/g$d;", "", "targetCredentialId", "targetCredentialLink", "<init>", "(Lpo2/g;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f139139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f139140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f139141c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f139142a;

            static {
                int[] iArr = new int[fo2.o.values().length];
                try {
                    iArr[fo2.o.PAUSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f139142a = iArr;
            }
        }

        /* JADX INFO: renamed from: po2.g$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder$Provisioning", f = "CardPurchaseDownloadFlowBuilder.kt", l = {157, 158}, m = "onCredentialActivated", v = 2)
        public static final class C2631b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f139143a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f139145c;

            public C2631b(t13.d<? super C2631b> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f139143a = obj;
                this.f139145c |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder$Provisioning", f = "CardPurchaseDownloadFlowBuilder.kt", l = {168}, m = "onCredentialUpdated", v = 2)
        public static final class c extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f139146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f139147b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f139149d;

            public c(t13.d<? super c> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f139147b = obj;
                this.f139149d |= Integer.MIN_VALUE;
                return b.this.c(false, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder$Provisioning$onStart$1", f = "CardPurchaseDownloadFlowBuilder.kt", l = {148}, m = "invokeSuspend", v = 2)
        public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f139150a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f139151b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(g gVar, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f139151b = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f139151b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f139150a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    aq2.l.c cVar = new aq2.l.c(20);
                    this.f139150a = 1;
                    if (this.f139151b.q(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(g gVar, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f139141c = gVar;
            this.f139139a = str;
            this.f139140b = str2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        
            if (r3.c(r7, r0) == r1) goto L25;
         */
        @Override // po2.g.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(to2.h hVar, t13.d<? super Unit> dVar) {
            C2631b c2631b;
            if (dVar instanceof C2631b) {
                c2631b = (C2631b) dVar;
                int i14 = c2631b.f139145c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2631b.f139145c = i14 - Integer.MIN_VALUE;
                } else {
                    c2631b = new C2631b(dVar);
                }
            } else {
                c2631b = new C2631b(dVar);
            }
            Object obj = c2631b.f139143a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2631b.f139145c;
            g gVar = this.f139141c;
            if (i15 != 0) {
                if (i15 == 1) {
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
            if (!h(hVar)) {
                aq2.l.c cVar = new aq2.l.c(100);
                c2631b.f139145c = 1;
                if (gVar.q(cVar, c2631b) != aVar) {
                }
                return aVar;
            }
            g.f139136n.info("onCredentialActivated: the credential ID of " + hVar + " is not related, ignore it");
            return Unit.INSTANCE;
            aq2.l.d dVar2 = new aq2.l.d(Unit.INSTANCE);
            c2631b.f139145c = 2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // po2.g.d
        public final Object c(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
            c cVar;
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i14 = cVar.f139149d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar.f139149d = i14 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(dVar);
                }
            } else {
                cVar = new c(dVar);
            }
            Object objD = cVar.f139147b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = cVar.f139149d;
            if (i15 == 0) {
                o13.r.b(objD);
                if (h(hVar)) {
                    g.f139136n.info("onCredentialUpdated: the credential ID of " + hVar + " is not related, ignore it");
                    return Unit.INSTANCE;
                }
                if (z14) {
                    return Unit.INSTANCE;
                }
                cVar.f139146a = z14;
                cVar.f139149d = 1;
                objD = this.f139141c.d(this.f139140b, cVar);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z14 = cVar.f139146a;
                o13.r.b(objD);
            }
            String str = (String) objD;
            if (str == null) {
                throw new IllegalStateException(com.airbnb.lottie.animation.keyframe.a.h("onCredentialUpdated:", z14));
            }
            throw new ProviderErrorCodeException(str, com.airbnb.lottie.animation.keyframe.a.h("onCredentialUpdated:", z14));
        }

        @Override // po2.g.d
        public final Unit e(to2.h hVar) {
            if (h(hVar)) {
                g.f139136n.info("onJobStatusEvent: the credential ID of " + hVar + " is not related, ignore it");
                return Unit.INSTANCE;
            }
            fo2.o oVarC = hVar.c();
            if ((oVarC == null ? -1 : a.f139142a[oVarC.ordinal()]) == 1) {
                androidx.room.a0.v(oVarC, "JobStatusEvent: ");
                return null;
            }
            g.f139136n.info("onJobStatusEvent: ignore " + oVarC);
            return Unit.INSTANCE;
        }

        @Override // po2.g.d
        public final void g() {
            String str = this.f139140b;
            g gVar = this.f139141c;
            gVar.f(str);
            gVar.g();
            ge1.b.T(gVar.e(), null, null, new d(gVar, null), 3);
        }

        public final boolean h(to2.h hVar) {
            String strA = hVar.a();
            if (strA != null) {
                return !p005kotlin.jvm.internal.s.g(this.f139139a, strA);
            }
            g.f139136n.info("null credential ID in " + hVar + ", ignore it");
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/g$c;", "Lpo2/g$d;", "", "targetPurchaseId", "targetPurchaseUrl", "<init>", "(Lpo2/g;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f139152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f139153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c2 f139154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f139155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f139156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g f139157f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder$Purchasing$onStart$1", f = "CardPurchaseDownloadFlowBuilder.kt", l = {70}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f139158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f139159b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f139159b = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f139159b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f139158a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    aq2.l.c cVar = new aq2.l.c(0);
                    this.f139158a = 1;
                    if (this.f139159b.q(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public c(g gVar, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f139157f = gVar;
            this.f139152a = str;
            this.f139153b = str2;
            this.f139156e = new ArrayList();
        }

        @Override // po2.g.d
        public final Unit b(to2.h hVar) {
            if (hVar.a() != null) {
                this.f139156e.add(hVar);
                h();
                return Unit.INSTANCE;
            }
            g.f139136n.info("onCredentialCreated: null credentialId in " + hVar + ", ignore it");
            return Unit.INSTANCE;
        }

        @Override // po2.g.d
        public final void d() {
            c2 c2Var = this.f139154c;
            if (c2Var != null) {
                c2Var.c(null);
            }
        }

        @Override // po2.g.d
        public final Unit f(boolean z14, to2.h hVar) {
            String strF = hVar.f();
            if (strF == null) {
                g.f139136n.info("onPurchaseEvent: null purchaseId in " + hVar + ", ignore it");
                return Unit.INSTANCE;
            }
            String str = this.f139152a;
            if (!p005kotlin.jvm.internal.s.g(str, strF)) {
                g.f139136n.info("onPurchaseEvent: the purchase ID of " + hVar + " is not equal to " + str + ", ignore it");
                return Unit.INSTANCE;
            }
            if (!z14) {
                com.google.firebase.messaging.l.n(hVar, "Purchase failed with ");
                return null;
            }
            String strA = hVar.a();
            if (strA == null) {
                p6.b.p(hVar, "Null credential ID in ");
                return null;
            }
            this.f139155d = strA;
            h();
            return Unit.INSTANCE;
        }

        @Override // po2.g.d
        public final void g() {
            g gVar = this.f139157f;
            this.f139154c = ge1.b.T(gVar.e(), null, null, new po2.h(gVar, this, null), 3);
            ge1.b.T(gVar.e(), null, null, new a(gVar, null), 3);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
        public final void h() {
            Object next;
            fo2.p pVar;
            String link;
            Iterator it = this.f139156e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((to2.h) next).a(), this.f139155d));
            to2.h hVar = (to2.h) next;
            if (hVar == null) {
                return;
            }
            String str = this.f139155d;
            if (str == null) {
                o2.c.m("credentialIdOfPurchaseCompleteEvent was not set yet");
                return;
            }
            Links linksD = hVar.d();
            if (linksD == null || (pVar = (fo2.p) linksD.f51142a.get("credential")) == null || (link = pVar.getLink()) == null) {
                p6.b.p(hVar, "No credential link in ");
                return;
            }
            g gVar = this.f139157f;
            b bVar = new b(gVar, str, link);
            d dVar = gVar.f139138m;
            if (bVar == dVar) {
                return;
            }
            dVar.d();
            gVar.f139138m = bVar;
            bVar.g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpo2/g$d;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {
        public Object a(to2.h hVar, t13.d<? super Unit> dVar) {
            return Unit.INSTANCE;
        }

        public Unit b(to2.h hVar) {
            return Unit.INSTANCE;
        }

        public Object c(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
            return Unit.INSTANCE;
        }

        public void d() {
        }

        public Unit e(to2.h hVar) {
            return Unit.INSTANCE;
        }

        public Unit f(boolean z14, to2.h hVar) {
            return Unit.INSTANCE;
        }

        public void g() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder", f = "CardPurchaseDownloadFlowBuilder.kt", l = {232, 211}, m = "onCredentialActivated", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public to2.h f139160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z53.a f139161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f139163d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139165f;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139163d = obj;
            this.f139165f |= Integer.MIN_VALUE;
            return g.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder", f = "CardPurchaseDownloadFlowBuilder.kt", l = {232, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "onCredentialCreated", v = 2)
    public static final class f extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public to2.h f139166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z53.a f139167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f139169d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139171f;

        public f(t13.d<? super f> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139169d = obj;
            this.f139171f |= Integer.MIN_VALUE;
            return g.this.i(null, this);
        }
    }

    /* JADX INFO: renamed from: po2.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder", f = "CardPurchaseDownloadFlowBuilder.kt", l = {232, 215}, m = "onCredentialUpdated", v = 2)
    public static final class C2632g extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f139172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public to2.h f139173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z53.a f139174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f139176e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f139178g;

        public C2632g(t13.d<? super C2632g> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139176e = obj;
            this.f139178g |= Integer.MIN_VALUE;
            return g.this.k(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder", f = "CardPurchaseDownloadFlowBuilder.kt", l = {232, 219}, m = "onJobStatusEvent", v = 2)
    public static final class h extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public to2.h f139179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z53.a f139180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f139182d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139184f;

        public h(t13.d<? super h> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139182d = obj;
            this.f139184f |= Integer.MIN_VALUE;
            return g.this.m(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder", f = "CardPurchaseDownloadFlowBuilder.kt", l = {232, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "onPurchaseEvent", v = 2)
    public static final class i extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f139185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public to2.h f139186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z53.a f139187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f139189e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f139191g;

        public i(t13.d<? super i> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139189e = obj;
            this.f139191g |= Integer.MIN_VALUE;
            return g.this.o(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder", f = "CardPurchaseDownloadFlowBuilder.kt", l = {232, 198}, m = "onStart", v = 2)
    public static final class j extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.a f139192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f139194c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f139196e;

        public j(t13.d<? super j> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139194c = obj;
            this.f139196e |= Integer.MIN_VALUE;
            return g.this.p(this);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f139136n = gt2.b.f79005a.h("PAY#NEW_FITPAY#CardPurchaseDownloadFlowBuilder");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, long j8, long j14, long j15) {
        super(j8, j14, j15);
        str.getClass();
        str2.getClass();
        this.f139137l = z53.c.a();
        this.f139138m = new c(this, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object h(to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        e eVar;
        z53.a aVar;
        int i14;
        Throwable th3;
        z53.a aVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i15 = eVar.f139165f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f139165f = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f139163d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f139165f;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                eVar.f139160a = hVar;
                aVar = this.f139137l;
                eVar.f139161b = aVar;
                i14 = 0;
                eVar.f139162c = 0;
                eVar.f139165f = 1;
                if (aVar.c(eVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = eVar.f139161b;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = eVar.f139162c;
            z53.a aVar4 = eVar.f139161b;
            to2.h hVar2 = eVar.f139160a;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            hVar = hVar2;
            d dVar2 = this.f139138m;
            eVar.f139160a = null;
            eVar.f139161b = aVar;
            eVar.f139162c = i14;
            eVar.f139165f = 2;
            if (dVar2.a(hVar, eVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object i(to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        f fVar;
        z53.a aVar;
        int i14;
        Throwable th3;
        z53.a aVar2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i15 = fVar.f139171f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f139171f = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f139169d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f139171f;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                fVar.f139166a = hVar;
                aVar = this.f139137l;
                fVar.f139167b = aVar;
                i14 = 0;
                fVar.f139168c = 0;
                fVar.f139171f = 1;
                if (aVar.c(fVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = fVar.f139167b;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = fVar.f139168c;
            z53.a aVar4 = fVar.f139167b;
            to2.h hVar2 = fVar.f139166a;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            hVar = hVar2;
            d dVar2 = this.f139138m;
            fVar.f139166a = null;
            fVar.f139167b = aVar;
            fVar.f139168c = i14;
            fVar.f139171f = 2;
            if (dVar2.b(hVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object k(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        C2632g c2632g;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        if (dVar instanceof C2632g) {
            c2632g = (C2632g) dVar;
            int i15 = c2632g.f139178g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c2632g.f139178g = i15 - Integer.MIN_VALUE;
            } else {
                c2632g = new C2632g(dVar);
            }
        } else {
            c2632g = new C2632g(dVar);
        }
        Object obj = c2632g.f139176e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = c2632g.f139178g;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                c2632g.f139173b = hVar;
                aVar = this.f139137l;
                c2632g.f139174c = aVar;
                c2632g.f139172a = z14;
                i14 = 0;
                c2632g.f139175d = 0;
                c2632g.f139178g = 1;
                if (aVar.c(c2632g) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = c2632g.f139174c;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i17 = c2632g.f139175d;
            boolean z15 = c2632g.f139172a;
            z53.a aVar4 = c2632g.f139174c;
            to2.h hVar2 = c2632g.f139173b;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            z14 = z15;
            hVar = hVar2;
            d dVar2 = this.f139138m;
            c2632g.f139173b = null;
            c2632g.f139174c = aVar;
            c2632g.f139172a = z14;
            c2632g.f139175d = i14;
            c2632g.f139178g = 2;
            if (dVar2.c(z14, hVar, c2632g) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object m(to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        h hVar2;
        z53.a aVar;
        int i14;
        Throwable th3;
        z53.a aVar2;
        if (dVar instanceof h) {
            hVar2 = (h) dVar;
            int i15 = hVar2.f139184f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                hVar2.f139184f = i15 - Integer.MIN_VALUE;
            } else {
                hVar2 = new h(dVar);
            }
        } else {
            hVar2 = new h(dVar);
        }
        Object obj = hVar2.f139182d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = hVar2.f139184f;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                hVar2.f139179a = hVar;
                aVar = this.f139137l;
                hVar2.f139180b = aVar;
                i14 = 0;
                hVar2.f139181c = 0;
                hVar2.f139184f = 1;
                if (aVar.c(hVar2) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = hVar2.f139180b;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = hVar2.f139181c;
            z53.a aVar4 = hVar2.f139180b;
            to2.h hVar3 = hVar2.f139179a;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            hVar = hVar3;
            d dVar2 = this.f139138m;
            hVar2.f139179a = null;
            hVar2.f139180b = aVar;
            hVar2.f139181c = i14;
            hVar2.f139184f = 2;
            if (dVar2.e(hVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object o(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        i iVar;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i15 = iVar.f139191g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                iVar.f139191g = i15 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f139189e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = iVar.f139191g;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                iVar.f139186b = hVar;
                aVar = this.f139137l;
                iVar.f139187c = aVar;
                iVar.f139185a = z14;
                i14 = 0;
                iVar.f139188d = 0;
                iVar.f139191g = 1;
                if (aVar.c(iVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = iVar.f139187c;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i17 = iVar.f139188d;
            boolean z15 = iVar.f139185a;
            z53.a aVar4 = iVar.f139187c;
            to2.h hVar2 = iVar.f139186b;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            z14 = z15;
            hVar = hVar2;
            d dVar2 = this.f139138m;
            iVar.f139186b = null;
            iVar.f139187c = aVar;
            iVar.f139185a = z14;
            iVar.f139188d = i14;
            iVar.f139191g = 2;
            if (dVar2.f(z14, hVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.f, po2.k0
    public final Object p(t13.d<? super Unit> dVar) throws Throwable {
        j jVar;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        Throwable th3;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i15 = jVar.f139196e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                jVar.f139196e = i15 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.f139194c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = jVar.f139196e;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                aVar = this.f139137l;
                jVar.f139192a = aVar;
                i14 = 0;
                jVar.f139193b = 0;
                jVar.f139196e = 1;
                if (aVar.c(jVar) != obj2) {
                }
                return obj2;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = jVar.f139192a;
                try {
                    o13.r.b(obj);
                    this.f139138m.g();
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            i14 = jVar.f139193b;
            z53.a aVar3 = jVar.f139192a;
            o13.r.b(obj);
            aVar = aVar3;
            jVar.f139192a = aVar;
            jVar.f139193b = i14;
            jVar.f139196e = 2;
            if (super.p(jVar) != obj2) {
                aVar2 = aVar;
                this.f139138m.g();
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return obj2;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th3 = th5;
            aVar2.e(null);
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/g$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(String str, String str2, long j8, long j14, long j15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? 5000L : j8, (i14 & 8) != 0 ? 10000L : j14, j15);
    }
}
