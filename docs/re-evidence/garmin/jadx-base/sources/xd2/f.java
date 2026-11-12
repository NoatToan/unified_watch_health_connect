package xd2;

import android.content.Context;
import c22.s1;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "Lae2/b;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$createSessions$2", f = "DefaultLivetrackRepository.kt", l = {179, 191, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 216}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends ae2.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd2.c f190119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yd2.b f190120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ae2.b f190121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f190122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xd2.b f190123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ae2.l f190125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f190126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ae2.e0 f190127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Boolean f190128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Period f190129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Boolean f190130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f190131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f190132n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$createSessions$2$createSessionsResult$1", f = "DefaultLivetrackRepository.kt", l = {192, 192}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xd2.b f190135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ae2.k0 f190137e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xd2.b bVar, long j8, ae2.k0 k0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190135c = bVar;
            this.f190136d = j8;
            this.f190137e = k0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190135c, this.f190136d, this.f190137e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.b>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190134b;
            if (i14 == 0) {
                o13.r.b(obj);
                xd2.b bVar = this.f190135c;
                z0Var = bVar.f190045c;
                this.f190133a = z0Var;
                this.f190134b = 1;
                obj = xd2.b.J(bVar, this.f190136d, this);
                if (obj != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z0Var = this.f190133a;
            o13.r.b(obj);
            this.f190133a = null;
            this.f190134b = 2;
            Object objL = z0Var.l((Map) obj, this.f190137e, this);
            return objL == aVar ? aVar : objL;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/l0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$createSessions$2$liveEventSessionResult$1", f = "DefaultLivetrackRepository.kt", l = {208, 208}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.l0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xd2.b f190140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ae2.m0 f190142e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xd2.b bVar, long j8, ae2.m0 m0Var, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f190140c = bVar;
            this.f190141d = j8;
            this.f190142e = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f190140c, this.f190141d, this.f190142e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.l0>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190139b;
            if (i14 == 0) {
                o13.r.b(obj);
                xd2.b bVar = this.f190140c;
                z0Var = bVar.f190045c;
                this.f190138a = z0Var;
                this.f190139b = 1;
                obj = xd2.b.J(bVar, this.f190141d, this);
                if (obj != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z0Var = this.f190138a;
            o13.r.b(obj);
            this.f190138a = null;
            this.f190139b = 2;
            Object objN = z0Var.n((Map) obj, this.f190142e, this);
            return objN == aVar ? aVar : objN;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xd2.b bVar, int i14, ae2.l lVar, String str, ae2.e0 e0Var, Boolean bool, Period period, Boolean bool2, long j8, boolean z14, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f190123e = bVar;
        this.f190124f = i14;
        this.f190125g = lVar;
        this.f190126h = str;
        this.f190127i = e0Var;
        this.f190128j = bool;
        this.f190129k = period;
        this.f190130l = bool2;
        this.f190131m = j8;
        this.f190132n = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f190123e, this.f190124f, this.f190125g, this.f190126h, this.f190127i, this.f190128j, this.f190129k, this.f190130l, this.f190131m, this.f190132n, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends ae2.b>> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:41:0x014e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151  */
    /* JADX WARN: Code duplicated, block: B:44:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0166  */
    /* JADX WARN: Code duplicated, block: B:52:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x0179  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x018c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        wd2.c cVar;
        Object objO;
        yd2.b bVar;
        yd2.b.C3683b c3683b;
        ae2.b bVar2;
        Boolean bool;
        yd2.b bVar3;
        ae2.z zVar;
        Object objK;
        ae2.e0 e0Var;
        String identifier;
        be2.g gVar;
        String groupTrackSessionId;
        yd2.b bVar4;
        yd2.b bVar5;
        yd2.b.C3683b c3683b2;
        ae2.l0 l0Var;
        ae2.h0 session;
        List<ae2.h0> listE;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190122d;
        int i15 = this.f190124f;
        xd2.b bVar6 = this.f190123e;
        if (i14 == 0) {
            o13.r.b(obj);
            y0 y0Var = bVar6.f190047e;
            this.f190122d = 1;
            objA = y0Var.a(this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i14 == 2) {
                cVar = this.f190119a;
                o13.r.b(obj);
                objO = obj;
                bVar = (yd2.b) objO;
                if (bVar instanceof yd2.b.C3683b) {
                    c3683b = (yd2.b.C3683b) bVar;
                } else {
                    c3683b = null;
                }
                if (c3683b != null) {
                    bVar2 = (ae2.b) ((yd2.b.C3683b) bVar).f196776a;
                    bool = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(this.f190130l, bool)) {
                        Period periodHours = Period.hours(i15);
                        DateTime dateTime = bVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.START java.lang.String();
                        if (cVar != null) {
                            zVar = new ae2.z(new Integer(cVar.f184403a), new Integer(cVar.f184404b));
                        } else {
                            zVar = null;
                        }
                        ae2.m0 m0Var = new ae2.m0(null, bool, periodHours, this.f190126h, zVar, this.f190127i, null, dateTime, this.f190129k, 65, null);
                        long j8 = this.f190131m;
                        xd2.b bVar7 = this.f190123e;
                        b bVar8 = new b(bVar7, j8, m0Var, null);
                        this.f190119a = null;
                        this.f190120b = bVar;
                        this.f190121c = bVar2;
                        this.f190122d = 3;
                        objK = bVar7.k(0, bVar8, this);
                        if (objK != aVar) {
                            bVar3 = bVar;
                            bVar5 = (yd2.b) objK;
                            if (bVar5 instanceof yd2.b.C3683b) {
                                c3683b2 = (yd2.b.C3683b) bVar5;
                            } else {
                                c3683b2 = null;
                            }
                            if (c3683b2 != null) {
                                listE = bVar2.e();
                                if (listE == null) {
                                    listE = p13.j0.f134944a;
                                }
                                ae2.b.a(bVar2, p13.h0.D0(listE, session));
                            }
                            e0Var = this.f190127i;
                            identifier = e0Var.getIdentifier();
                            if (identifier != null) {
                                String str = e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a;
                                if (this.f190125g != null) {
                                    groupTrackSessionId = bVar2.getGroupTrackSessionId();
                                } else {
                                    groupTrackSessionId = null;
                                }
                                gVar = new be2.g(this.f190131m, this.f190126h, identifier, str, this.f190132n, false, groupTrackSessionId, null, null, null, 928, null);
                                this.f190119a = null;
                                this.f190120b = bVar3;
                                this.f190121c = null;
                                this.f190122d = 4;
                                if (bVar6.e(gVar, this) != aVar) {
                                    bVar4 = bVar3;
                                }
                            } else {
                                bVar = bVar3;
                            }
                        }
                    } else {
                        bVar3 = bVar;
                        e0Var = this.f190127i;
                        identifier = e0Var.getIdentifier();
                        if (identifier != null) {
                            String str2 = e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a;
                            if (this.f190125g != null) {
                                groupTrackSessionId = bVar2.getGroupTrackSessionId();
                            } else {
                                groupTrackSessionId = null;
                            }
                            gVar = new be2.g(this.f190131m, this.f190126h, identifier, str2, this.f190132n, false, groupTrackSessionId, null, null, null, 928, null);
                            this.f190119a = null;
                            this.f190120b = bVar3;
                            this.f190121c = null;
                            this.f190122d = 4;
                            if (bVar6.e(gVar, this) != aVar) {
                                bVar4 = bVar3;
                            }
                        } else {
                            bVar = bVar3;
                        }
                    }
                    return aVar;
                }
                return h1.a(bVar, new x91.j(18));
            }
            if (i14 == 3) {
                ae2.b bVar9 = this.f190121c;
                bVar3 = this.f190120b;
                o13.r.b(obj);
                bVar2 = bVar9;
                objK = obj;
                bVar5 = (yd2.b) objK;
                if (bVar5 instanceof yd2.b.C3683b) {
                    c3683b2 = (yd2.b.C3683b) bVar5;
                } else {
                    c3683b2 = null;
                }
                if (c3683b2 != null && (l0Var = (ae2.l0) c3683b2.f196776a) != null && (session = l0Var.getSession()) != null) {
                    listE = bVar2.e();
                    if (listE == null) {
                        listE = p13.j0.f134944a;
                    }
                    ae2.b.a(bVar2, p13.h0.D0(listE, session));
                }
                e0Var = this.f190127i;
                identifier = e0Var.getIdentifier();
                if (identifier != null) {
                    String str3 = e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a;
                    if (this.f190125g != null) {
                        groupTrackSessionId = bVar2.getGroupTrackSessionId();
                    } else {
                        groupTrackSessionId = null;
                    }
                    gVar = new be2.g(this.f190131m, this.f190126h, identifier, str3, this.f190132n, false, groupTrackSessionId, null, null, null, 928, null);
                    this.f190119a = null;
                    this.f190120b = bVar3;
                    this.f190121c = null;
                    this.f190122d = 4;
                    if (bVar6.e(gVar, this) != aVar) {
                        bVar4 = bVar3;
                    }
                    return aVar;
                }
                bVar = bVar3;
                return h1.a(bVar, new x91.j(18));
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar4 = this.f190120b;
            o13.r.b(obj);
        }
        bVar = bVar4;
        return h1.a(bVar, new x91.j(18));
        cVar = (wd2.c) objA;
        Boolean bool2 = Boolean.TRUE;
        Period periodHours2 = Period.hours(i15);
        kd0.e1 e1VarF = bVar6.f190048f.getF104144a();
        e1VarF.getClass();
        s1 s1Var = s1.f23251a;
        Context applicationContext = e1VarF.f104039a.getApplicationContext();
        applicationContext.getClass();
        s1Var.getClass();
        ae2.k0 k0Var = new ae2.k0(null, bool2, periodHours2, this.f190125g, s1.e(applicationContext), this.f190126h, cVar != null ? new ae2.z(new Integer(cVar.f184403a), new Integer(cVar.f184404b)) : null, this.f190127i, this.f190128j, this.f190129k, 1, null);
        long j14 = this.f190131m;
        xd2.b bVar10 = this.f190123e;
        a aVar2 = new a(bVar10, j14, k0Var, null);
        this.f190119a = cVar;
        this.f190122d = 2;
        objO = bVar10.o(aVar2, this);
        if (objO != aVar) {
            bVar = (yd2.b) objO;
            if (bVar instanceof yd2.b.C3683b) {
                c3683b = (yd2.b.C3683b) bVar;
            } else {
                c3683b = null;
            }
            if (c3683b != null) {
                bVar2 = (ae2.b) ((yd2.b.C3683b) bVar).f196776a;
                bool = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(this.f190130l, bool)) {
                    Period periodHours3 = Period.hours(i15);
                    DateTime dateTime2 = bVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.START java.lang.String();
                    if (cVar != null) {
                        zVar = new ae2.z(new Integer(cVar.f184403a), new Integer(cVar.f184404b));
                    } else {
                        zVar = null;
                    }
                    ae2.m0 m0Var2 = new ae2.m0(null, bool, periodHours3, this.f190126h, zVar, this.f190127i, null, dateTime2, this.f190129k, 65, null);
                    long j15 = this.f190131m;
                    xd2.b bVar11 = this.f190123e;
                    b bVar12 = new b(bVar11, j15, m0Var2, null);
                    this.f190119a = null;
                    this.f190120b = bVar;
                    this.f190121c = bVar2;
                    this.f190122d = 3;
                    objK = bVar11.k(0, bVar12, this);
                    if (objK != aVar) {
                        bVar3 = bVar;
                        bVar5 = (yd2.b) objK;
                        if (bVar5 instanceof yd2.b.C3683b) {
                            c3683b2 = (yd2.b.C3683b) bVar5;
                        } else {
                            c3683b2 = null;
                        }
                        if (c3683b2 != null) {
                            listE = bVar2.e();
                            if (listE == null) {
                                listE = p13.j0.f134944a;
                            }
                            ae2.b.a(bVar2, p13.h0.D0(listE, session));
                        }
                        e0Var = this.f190127i;
                        identifier = e0Var.getIdentifier();
                        if (identifier != null) {
                            String str4 = e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a;
                            if (this.f190125g != null) {
                                groupTrackSessionId = bVar2.getGroupTrackSessionId();
                            } else {
                                groupTrackSessionId = null;
                            }
                            gVar = new be2.g(this.f190131m, this.f190126h, identifier, str4, this.f190132n, false, groupTrackSessionId, null, null, null, 928, null);
                            this.f190119a = null;
                            this.f190120b = bVar3;
                            this.f190121c = null;
                            this.f190122d = 4;
                            if (bVar6.e(gVar, this) != aVar) {
                                bVar4 = bVar3;
                                bVar = bVar4;
                            }
                        } else {
                            bVar = bVar3;
                        }
                    }
                } else {
                    bVar3 = bVar;
                    e0Var = this.f190127i;
                    identifier = e0Var.getIdentifier();
                    if (identifier != null) {
                        String str5 = e0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().f2837a;
                        if (this.f190125g != null) {
                            groupTrackSessionId = bVar2.getGroupTrackSessionId();
                        } else {
                            groupTrackSessionId = null;
                        }
                        gVar = new be2.g(this.f190131m, this.f190126h, identifier, str5, this.f190132n, false, groupTrackSessionId, null, null, null, 928, null);
                        this.f190119a = null;
                        this.f190120b = bVar3;
                        this.f190121c = null;
                        this.f190122d = 4;
                        if (bVar6.e(gVar, this) != aVar) {
                            bVar4 = bVar3;
                            bVar = bVar4;
                        }
                    } else {
                        bVar = bVar3;
                    }
                }
            }
            return h1.a(bVar, new x91.j(18));
        }
        return aVar;
    }
}
