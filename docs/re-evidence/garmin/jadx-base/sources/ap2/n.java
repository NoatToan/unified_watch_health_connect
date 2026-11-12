package ap2;

import ch.qos.logback.classic.Logger;
import ds.e0;
import o53.b0;
import o53.j0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCreditCardAndCredential$1", f = "FitPayAddCardViewModel.kt", l = {314, 328, 341, 348}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo2.b f11748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f11749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f11752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dp2.b f11753g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lep2/d;", "<anonymous>", "(Lo53/b0;)Lep2/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCreditCardAndCredential$1$credentialResp$1", f = "FitPayAddCardViewModel.kt", l = {322}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super ep2.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f11755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dp2.b f11756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<Exception> f11757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, dp2.b bVar, r0<Exception> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f11755b = hVar;
            this.f11756c = bVar;
            this.f11757d = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f11755b, this.f11756c, this.f11757d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super ep2.d> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Exception, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11754a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    g1 g1Var = this.f11755b.E4().f205979a;
                    dp2.b bVar = this.f11756c;
                    this.f11754a = 1;
                    obj = g1Var.f(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (ep2.d) obj;
            } catch (Exception e4) {
                e0.v("createCreditCardAndCredential - credential exception: ", e4.getLocalizedMessage(), h.a.a(h.f11695y));
                this.f11757d.f105810a = e4;
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyo2/b;", "<anonymous>", "(Lo53/b0;)Lyo2/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCreditCardAndCredential$1$creditCardResp$1", f = "FitPayAddCardViewModel.kt", l = {StatusLine.HTTP_PERM_REDIRECT}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super yo2.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f11759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dp2.b f11760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<Exception> f11761d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, dp2.b bVar, r0<Exception> r0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f11759b = hVar;
            this.f11760c = bVar;
            this.f11761d = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f11759b, this.f11760c, this.f11761d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super yo2.b> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Exception, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            h hVar = this.f11759b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11758a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    g1 g1Var = hVar.E4().f205979a;
                    String str = hVar.f11704h;
                    str.getClass();
                    dp2.b bVar = this.f11760c;
                    this.f11758a = 1;
                    Logger logger = g1.f205525n;
                    obj = g1Var.g(str, bVar, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (yo2.b) obj;
            } catch (Exception e4) {
                e0.v("createCreditCardAndCredential - credit card exception: ", e4.getLocalizedMessage(), h.a.a(h.f11695y));
                this.f11761d.f105810a = e4;
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, dp2.b bVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f11752f = hVar;
        this.f11753g = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f11752f, this.f11753g, dVar);
        nVar.f11751e = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        if (ap2.h.y4(r8, r12) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        r0 r0Var2;
        yo2.b bVar;
        r0 r0Var3;
        String cardState;
        String link;
        r0 r0Var4;
        Exception exc;
        Exception exc2;
        b0 b0Var = (b0) this.f11751e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11750d;
        dp2.b bVar2 = this.f11753g;
        h hVar = this.f11752f;
        if (i14 == 0) {
            o13.r.b(obj);
            h.a.a(h.f11695y).debug("createCreditCardAndCredential");
            r0Var = new r0();
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(hVar, bVar2, r0Var, null), 3);
            this.f11751e = b0Var;
            this.f11747a = r0Var;
            this.f11750d = 1;
            obj = j0VarJ.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r0Var = this.f11747a;
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                r0Var3 = this.f11749c;
                bVar = this.f11748b;
                r0Var2 = this.f11747a;
                o13.r.b(obj);
                h.z4(hVar, (ep2.d) obj);
                if (bVar != null) {
                    cardState = bVar.getCardState();
                } else {
                    cardState = null;
                }
                if (!p005kotlin.jvm.internal.s.g(cardState, "NEW")) {
                    link = bVar.getCreditCardLink().getLink();
                    if (link == null) {
                        h.a.a(h.f11695y).error("createCreditCardAndCredential: missing creditCard link from the card");
                        return Unit.INSTANCE;
                    }
                    this.f11751e = null;
                    this.f11747a = r0Var2;
                    this.f11748b = null;
                    this.f11749c = r0Var3;
                    this.f11750d = 3;
                    if (hVar.H4(link) != aVar) {
                        r0Var4 = r0Var2;
                        r0Var2 = r0Var4;
                        exc = (Exception) r0Var3.f105810a;
                        if (exc != null) {
                            h.x4(hVar, exc);
                        }
                        exc2 = (Exception) r0Var2.f105810a;
                        if (exc2 != null) {
                            this.f11751e = null;
                            this.f11747a = null;
                            this.f11748b = null;
                            this.f11749c = null;
                            this.f11750d = 4;
                        }
                    }
                } else {
                    h.A4(hVar, bVar);
                    Unit unit = Unit.INSTANCE;
                    exc = (Exception) r0Var3.f105810a;
                    if (exc != null) {
                        h.x4(hVar, exc);
                    }
                    exc2 = (Exception) r0Var2.f105810a;
                    if (exc2 != null) {
                        this.f11751e = null;
                        this.f11747a = null;
                        this.f11748b = null;
                        this.f11749c = null;
                        this.f11750d = 4;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                r0Var3 = this.f11749c;
                r0Var4 = this.f11747a;
                o13.r.b(obj);
                r0Var2 = r0Var4;
                exc = (Exception) r0Var3.f105810a;
                if (exc != null) {
                    h.x4(hVar, exc);
                }
                exc2 = (Exception) r0Var2.f105810a;
                if (exc2 != null) {
                    this.f11751e = null;
                    this.f11747a = null;
                    this.f11748b = null;
                    this.f11749c = null;
                    this.f11750d = 4;
                }
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        yo2.b bVar3 = (yo2.b) obj;
        hVar.f11707k.set(bVar3);
        r0 r0Var5 = new r0();
        j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(hVar, bVar2, r0Var5, null), 3);
        this.f11751e = null;
        this.f11747a = r0Var;
        this.f11748b = bVar3;
        this.f11749c = r0Var5;
        this.f11750d = 2;
        Object objC = j0VarJ2.C(this);
        if (objC != aVar) {
            r0Var2 = r0Var;
            bVar = bVar3;
            obj = objC;
            r0Var3 = r0Var5;
            h.z4(hVar, (ep2.d) obj);
            if (bVar != null) {
                cardState = bVar.getCardState();
            } else {
                cardState = null;
            }
            if (!p005kotlin.jvm.internal.s.g(cardState, "NEW")) {
                h.A4(hVar, bVar);
                Unit unit2 = Unit.INSTANCE;
                exc = (Exception) r0Var3.f105810a;
                if (exc != null) {
                    h.x4(hVar, exc);
                }
                exc2 = (Exception) r0Var2.f105810a;
                if (exc2 != null) {
                    this.f11751e = null;
                    this.f11747a = null;
                    this.f11748b = null;
                    this.f11749c = null;
                    this.f11750d = 4;
                }
                return Unit.INSTANCE;
            }
            link = bVar.getCreditCardLink().getLink();
            if (link == null) {
                h.a.a(h.f11695y).error("createCreditCardAndCredential: missing creditCard link from the card");
                return Unit.INSTANCE;
            }
            this.f11751e = null;
            this.f11747a = r0Var2;
            this.f11748b = null;
            this.f11749c = r0Var3;
            this.f11750d = 3;
            if (hVar.H4(link) != aVar) {
                r0Var4 = r0Var2;
                r0Var2 = r0Var4;
                exc = (Exception) r0Var3.f105810a;
                if (exc != null) {
                    h.x4(hVar, exc);
                }
                exc2 = (Exception) r0Var2.f105810a;
                if (exc2 != null) {
                    this.f11751e = null;
                    this.f11747a = null;
                    this.f11748b = null;
                    this.f11749c = null;
                    this.f11750d = 4;
                }
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
