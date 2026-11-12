package q92;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.consent.network.GdprRevokeException406;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import lc.u0;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.g0;
import z10.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$updateConsent$2", f = "ConsentRepository.kt", l = {197}, m = "invokeSuspend")
public final class r extends v13.i implements e23.p<b0, t13.d<? super a0<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f143737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f143738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f143739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s92.g f143740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s92.l f143741g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$updateConsent$2$1", f = "ConsentRepository.kt", l = {200, 201, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 226, PsExtractor.VIDEO_STREAM_MASK, 241}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f143743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f143744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f143745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s92.g f143746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s92.l f143747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b0 f143748g;

        /* JADX INFO: renamed from: q92.r$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2711a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f143749a;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.OPT_IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.OPT_OUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f143749a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, x xVar, f fVar, s92.g gVar, s92.l lVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143743b = yVar;
            this.f143744c = xVar;
            this.f143745d = fVar;
            this.f143746e = gVar;
            this.f143747f = lVar;
            this.f143748g = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143743b, this.f143744c, this.f143745d, this.f143746e, this.f143747f, this.f143748g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x02df  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0076 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x0078  */
        /* JADX WARN: Code duplicated, block: B:27:0x007f  */
        /* JADX WARN: Code duplicated, block: B:30:0x008e  */
        /* JADX WARN: Code duplicated, block: B:31:0x0091  */
        /* JADX WARN: Code duplicated, block: B:33:0x0095  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:57:0x0142  */
        /* JADX WARN: Code duplicated, block: B:77:0x01ff A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x0201  */
        /* JADX WARN: Code duplicated, block: B:81:0x0217  */
        /* JADX WARN: Code duplicated, block: B:83:0x021c  */
        /* JADX WARN: Code duplicated, block: B:85:0x0242 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:86:0x0244  */
        /* JADX WARN: Code duplicated, block: B:87:0x025d  */
        /* JADX WARN: Code duplicated, block: B:88:0x0273  */
        /* JADX WARN: Code duplicated, block: B:90:0x0282  */
        /* JADX WARN: Code duplicated, block: B:98:0x02a7  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        
            if (r15 == r0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
        
            if (r15 == r0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x018f, code lost:
        
            if (r15 == r0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0213, code lost:
        
            if (((z10.g0) r15).h(r12, r14) == r0) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x029c, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L95;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x00ea, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:86:0x0244, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:98:0x02a7, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i14;
            String str;
            r92.a aVar;
            r92.a aVar2;
            c83.a0 a0Var;
            Response response;
            String str2;
            Exception iOException;
            T t7;
            s92.i iVar;
            String deleteStatus;
            int i15;
            int i16;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i17 = this.f143742a;
            s92.g gVar = this.f143746e;
            f fVar = this.f143745d;
            s92.l lVar = this.f143747f;
            y yVar = this.f143743b;
            x xVar = this.f143744c;
            switch (i17) {
                case 0:
                    o13.r.b(obj);
                    int i18 = C2711a.f143749a[yVar.ordinal()];
                    if (i18 != 1) {
                        if (i18 != 2) {
                            u0.r();
                            return null;
                        }
                        p92.o.f136619a.getClass();
                        p92.o.l();
                        this.f143742a = 2;
                        if (Unit.INSTANCE != aVar3) {
                            i14 = C2711a.f143749a[yVar.ordinal()];
                            if (i14 != 1) {
                                str = xVar.f143819a;
                                this.f143742a = 3;
                                aVar = fVar.f143628a;
                                if (lVar == null) {
                                    obj = aVar.n(f.b(gVar, str, null), this);
                                } else {
                                    obj = aVar.c(f.b(gVar, str, lVar), this);
                                }
                            } else {
                                if (i14 != 2) {
                                    u0.r();
                                    return null;
                                }
                                this.f143742a = 4;
                                aVar2 = fVar.f143628a;
                                if (lVar != null) {
                                    obj = aVar2.i(xVar.f143819a, false, f.a(gVar, xVar.f143819a, false, lVar), this);
                                    if (obj != aVar3) {
                                        obj = (c83.a0) obj;
                                    }
                                } else if (xVar != x.DI_CONNECT_UPLOAD) {
                                    obj = aVar2.f(f.b(gVar, xVar.f143819a, null), this);
                                    if (obj != aVar3) {
                                        obj = (c83.a0) obj;
                                    }
                                } else {
                                    obj = aVar2.q(xVar.f143819a, false, f.a(gVar, xVar.f143819a, false, null), this);
                                    if (obj != aVar3) {
                                        obj = (c83.a0) obj;
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        p92.o.f136619a.getClass();
                        p92.o.l();
                        this.f143742a = 1;
                        if (Unit.INSTANCE != aVar3) {
                            i14 = C2711a.f143749a[yVar.ordinal()];
                            if (i14 != 1) {
                                str = xVar.f143819a;
                                this.f143742a = 3;
                                aVar = fVar.f143628a;
                                if (lVar == null) {
                                    obj = aVar.n(f.b(gVar, str, null), this);
                                } else {
                                    obj = aVar.c(f.b(gVar, str, lVar), this);
                                }
                            } else {
                                if (i14 != 2) {
                                    u0.r();
                                    return null;
                                }
                                this.f143742a = 4;
                                aVar2 = fVar.f143628a;
                                if (lVar != null) {
                                    obj = aVar2.i(xVar.f143819a, false, f.a(gVar, xVar.f143819a, false, lVar), this);
                                    if (obj != aVar3) {
                                        obj = (c83.a0) obj;
                                    }
                                } else if (xVar != x.DI_CONNECT_UPLOAD) {
                                    obj = aVar2.f(f.b(gVar, xVar.f143819a, null), this);
                                    if (obj != aVar3) {
                                        obj = (c83.a0) obj;
                                    }
                                } else {
                                    obj = aVar2.q(xVar.f143819a, false, f.a(gVar, xVar.f143819a, false, null), this);
                                    if (obj != aVar3) {
                                        obj = (c83.a0) obj;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return aVar3;
                case 1:
                case 2:
                    o13.r.b(obj);
                    i14 = C2711a.f143749a[yVar.ordinal()];
                    if (i14 != 1) {
                        if (i14 != 2) {
                            u0.r();
                            return null;
                        }
                        this.f143742a = 4;
                        aVar2 = fVar.f143628a;
                        if (lVar != null) {
                            obj = aVar2.i(xVar.f143819a, false, f.a(gVar, xVar.f143819a, false, lVar), this);
                            if (obj != aVar3) {
                                obj = (c83.a0) obj;
                            }
                        } else if (xVar != x.DI_CONNECT_UPLOAD) {
                            obj = aVar2.f(f.b(gVar, xVar.f143819a, null), this);
                            if (obj != aVar3) {
                                obj = (c83.a0) obj;
                            }
                        } else {
                            obj = aVar2.q(xVar.f143819a, false, f.a(gVar, xVar.f143819a, false, null), this);
                            if (obj != aVar3) {
                                obj = (c83.a0) obj;
                            }
                        }
                        break;
                    } else {
                        str = xVar.f143819a;
                        this.f143742a = 3;
                        aVar = fVar.f143628a;
                        if (lVar == null) {
                            obj = aVar.n(f.b(gVar, str, null), this);
                        } else {
                            obj = aVar.c(f.b(gVar, str, lVar), this);
                        }
                        break;
                    }
                    return aVar3;
                case 3:
                    o13.r.b(obj);
                    a0Var = (c83.a0) obj;
                    response = a0Var.f25745a;
                    if (response.isSuccessful()) {
                        str2 = "Error updating consent " + xVar + " code[" + response.code() + "] " + response.message();
                        if (yVar == y.OPT_OUT || response.code() != 406) {
                            iOException = new IOException(str2);
                        } else {
                            iOException = new GdprRevokeException406(str2);
                        }
                        p92.y.f136664a.getClass();
                        p92.y.a.d("ConsentRepository", iOException);
                        return new a0.a(iOException);
                    }
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConsentRepository", "updateConsent(" + xVar + ", " + yVar + ") successfully consentText[" + gVar + "]");
                    p92.o.f136619a.getClass();
                    p92.o.m().a(xVar, u.CUSTOMER, lVar);
                    p92.o.m().f(xVar, yVar, lVar);
                    p92.y.a.a("ConsentRepository", "Updated cache with CUSTOMER source type and " + yVar + " user option automatically");
                    if (xVar == x.DI_CONNECT_UPLOAD) {
                        t7 = a0Var.f25746b;
                        if ((t7 instanceof s92.i) || (deleteStatus = (iVar = (s92.i) t7).getDeleteStatus()) == null || !(!d53.w.J(deleteStatus))) {
                            p92.y.a.a("ConsentRepository", "For Data Storage make the fetch call to retrieve the delete status because it was revoked");
                            r92.a aVar4 = fVar.f143628a;
                            String str3 = xVar.f143819a;
                            this.f143742a = 5;
                            obj = aVar4.d(str3, this);
                            break;
                        } else {
                            q92.a.C2709a c2709a = q92.a.f143600b;
                            String deleteStatus2 = iVar.getDeleteStatus();
                            c2709a.getClass();
                            q92.a aVarA = q92.a.C2709a.a(deleteStatus2);
                            if (aVarA != null) {
                                p92.o.m().i(xVar, aVarA, lVar);
                                p92.y.a.a("ConsentRepository", "Updated cache with delete status " + aVarA);
                            }
                        }
                        return aVar3;
                    }
                    i15 = C2711a.f143749a[yVar.ordinal()];
                    if (i15 == 1) {
                        p92.o.f136619a.getClass();
                        p92.o.l();
                        this.f143742a = 6;
                        v0.f201271b.getClass();
                        v0.a.a().c(xVar, Long.MAX_VALUE);
                        i16 = g0.b.f201006b[xVar.ordinal()];
                        if (i16 == 1) {
                            f12.l.f68084a.getClass();
                            if (!f12.l.a.a().I1() && GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_user_wants_live_track_strava_share), false)) {
                                f12.l.a.a().d2(true);
                            }
                        } else if (i16 != 2) {
                            i2.f36769a.getClass();
                            i2.a.a(a2.CONSENT, "NO grantConsentActions for " + xVar);
                        } else {
                            cw.q qVarN = cw.q.N();
                            qVarN.getClass();
                            new Long(com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN), null));
                        }
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        p92.o.f136619a.getClass();
                        p92.a aVarL = p92.o.l();
                        this.f143742a = 7;
                    }
                    break;
                    break;
                case 4:
                    o13.r.b(obj);
                    a0Var = (c83.a0) obj;
                    response = a0Var.f25745a;
                    if (response.isSuccessful()) {
                        str2 = "Error updating consent " + xVar + " code[" + response.code() + "] " + response.message();
                        if (yVar == y.OPT_OUT) {
                            iOException = new IOException(str2);
                        } else {
                            iOException = new IOException(str2);
                        }
                        p92.y.f136664a.getClass();
                        p92.y.a.d("ConsentRepository", iOException);
                        return new a0.a(iOException);
                    }
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConsentRepository", "updateConsent(" + xVar + ", " + yVar + ") successfully consentText[" + gVar + "]");
                    p92.o.f136619a.getClass();
                    p92.o.m().a(xVar, u.CUSTOMER, lVar);
                    p92.o.m().f(xVar, yVar, lVar);
                    p92.y.a.a("ConsentRepository", "Updated cache with CUSTOMER source type and " + yVar + " user option automatically");
                    if (xVar == x.DI_CONNECT_UPLOAD) {
                        t7 = a0Var.f25746b;
                        if (t7 instanceof s92.i) {
                        }
                        p92.y.a.a("ConsentRepository", "For Data Storage make the fetch call to retrieve the delete status because it was revoked");
                        r92.a aVar5 = fVar.f143628a;
                        String str4 = xVar.f143819a;
                        this.f143742a = 5;
                        obj = aVar5.d(str4, this);
                    }
                    i15 = C2711a.f143749a[yVar.ordinal()];
                    if (i15 == 1) {
                        p92.o.f136619a.getClass();
                        p92.o.l();
                        this.f143742a = 6;
                        v0.f201271b.getClass();
                        v0.a.a().c(xVar, Long.MAX_VALUE);
                        i16 = g0.b.f201006b[xVar.ordinal()];
                        if (i16 == 1) {
                            f12.l.f68084a.getClass();
                            if (!f12.l.a.a().I1()) {
                                f12.l.a.a().d2(true);
                            }
                        } else if (i16 != 2) {
                            i2.f36769a.getClass();
                            i2.a.a(a2.CONSENT, "NO grantConsentActions for " + xVar);
                        } else {
                            cw.q qVarN2 = cw.q.N();
                            qVarN2.getClass();
                            new Long(com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN2), null));
                        }
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        p92.o.f136619a.getClass();
                        p92.a aVarL2 = p92.o.l();
                        this.f143742a = 7;
                    }
                    break;
                    break;
                case 5:
                    o13.r.b(obj);
                    c83.a0 a0Var2 = (c83.a0) obj;
                    if (a0Var2.f25745a.isSuccessful()) {
                        s92.c cVar = (s92.c) a0Var2.f25746b;
                        if (cVar != null) {
                            p92.o.f136619a.getClass();
                            p92.o.m().e(xVar, cVar, lVar);
                            p92.y.f136664a.getClass();
                            p92.y.a.a("ConsentRepository", "getConsent(" + xVar + ") successfully " + cVar);
                        }
                    } else {
                        String str5 = "Error fetching " + xVar + " consent: code[" + a0Var2.f25745a.code() + "]";
                        p92.y.f136664a.getClass();
                        p92.y.a.c("ConsentRepository", str5);
                    }
                    i15 = C2711a.f143749a[yVar.ordinal()];
                    if (i15 == 1) {
                        p92.o.f136619a.getClass();
                        p92.o.l();
                        this.f143742a = 6;
                        v0.f201271b.getClass();
                        v0.a.a().c(xVar, Long.MAX_VALUE);
                        i16 = g0.b.f201006b[xVar.ordinal()];
                        if (i16 == 1) {
                            f12.l.f68084a.getClass();
                            if (!f12.l.a.a().I1()) {
                                f12.l.a.a().d2(true);
                            }
                        } else if (i16 != 2) {
                            i2.f36769a.getClass();
                            i2.a.a(a2.CONSENT, "NO grantConsentActions for " + xVar);
                        } else {
                            cw.q qVarN3 = cw.q.N();
                            qVarN3.getClass();
                            new Long(com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN3), null));
                        }
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        p92.o.f136619a.getClass();
                        p92.a aVarL3 = p92.o.l();
                        this.f143742a = 7;
                    }
                    break;
                case 6:
                case 7:
                    o13.r.b(obj);
                    return new a0.b(Unit.INSTANCE);
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, y yVar, f fVar, s92.g gVar, s92.l lVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f143737c = xVar;
        this.f143738d = yVar;
        this.f143739e = fVar;
        this.f143740f = gVar;
        this.f143741g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f143737c, this.f143738d, this.f143739e, this.f143740f, this.f143741g, dVar);
        rVar.f143736b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends Unit>> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143735a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143738d, this.f143737c, this.f143739e, this.f143740f, this.f143741g, (b0) this.f143736b, null);
        String str = "Error updating consent " + this.f143737c;
        this.f143735a = 1;
        Object objA = u92.b.a(aVar2, str, this);
        return objA == aVar ? aVar : objA;
    }
}
