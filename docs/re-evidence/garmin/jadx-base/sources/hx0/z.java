package hx0;

import androidx.lifecycle.y0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import o53.l1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$updateDailyLogNote$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f86202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f86203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<ww0.c> f86204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f86205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f86207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0<cx0.a<ww0.c>> f86208h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$updateDailyLogNote$1$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {145, 146, 149, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f86209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ww0.b f86210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f86211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l1 f86212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l1 f86213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<ww0.c> f86214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s f86215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ LocalDate f86216h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f86217i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ y0<cx0.a<ww0.c>> f86218j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l1 l1Var, l1 l1Var2, p005kotlin.jvm.internal.r0<ww0.c> r0Var, s sVar, LocalDate localDate, String str, y0<cx0.a<ww0.c>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86212d = l1Var;
            this.f86213e = l1Var2;
            this.f86214f = r0Var;
            this.f86215g = sVar;
            this.f86216h = localDate;
            this.f86217i = str;
            this.f86218j = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86212d, this.f86213e, this.f86214f, this.f86215g, this.f86216h, this.f86217i, this.f86218j, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0064 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0068 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x0075  */
        /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x007e A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0084 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:49:0x00b6 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00e3 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x0023, B:47:0x00ae, B:49:0x00b6, B:51:0x00c0, B:52:0x00c4, B:53:0x00e3, B:54:0x00ea, B:16:0x0038, B:37:0x0076, B:38:0x0078, B:40:0x007e, B:43:0x008d, B:42:0x0084, B:17:0x003f, B:31:0x0064, B:33:0x0068, B:18:0x0043, B:26:0x0057, B:28:0x005b, B:21:0x004a, B:23:0x004e), top: B:58:0x0013 }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p005kotlin.jvm.internal.r0<ww0.c> r0Var;
            ww0.c cVar;
            ww0.b bVarA;
            ww0.b bVarB;
            Object objI;
            ww0.b bVar;
            T t7;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86211c;
            s sVar = this.f86215g;
            y0<cx0.a<ww0.c>> y0Var = this.f86218j;
            LocalDate localDate = this.f86216h;
            p005kotlin.jvm.internal.r0<ww0.c> r0Var2 = this.f86214f;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    l1 l1Var = this.f86212d;
                    if (l1Var != null) {
                        this.f86211c = 1;
                        if (l1Var.P(this) == aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 == 2) {
                        o13.r.b(obj);
                        if (r0Var2.f105810a == null) {
                            yw0.a aVar2 = sVar.f86137a;
                            this.f86209a = r0Var2;
                            this.f86211c = 3;
                            objB = aVar2.b(localDate, this);
                            if (objB != aVar) {
                                r0Var = r0Var2;
                                t7 = objB;
                                r0Var.f105810a = t7;
                                cVar = r0Var2.f105810a;
                                if (cVar != null) {
                                    ww0.b.f187523n.getClass();
                                    bVarA = ww0.b.a.a(localDate);
                                } else {
                                    ww0.b.f187523n.getClass();
                                    bVarA = ww0.b.a.a(localDate);
                                }
                                bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                                y0Var.j(null);
                                yw0.a aVar3 = sVar.f86137a;
                                this.f86209a = null;
                                this.f86210b = bVarB;
                                this.f86211c = 4;
                                objI = aVar3.i(localDate, bVarB, this);
                                if (objI != aVar) {
                                    bVar = bVarB;
                                }
                            }
                        } else {
                            cVar = r0Var2.f105810a;
                            if (cVar != null) {
                                ww0.b.f187523n.getClass();
                                bVarA = ww0.b.a.a(localDate);
                            } else {
                                ww0.b.f187523n.getClass();
                                bVarA = ww0.b.a.a(localDate);
                            }
                            bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                            y0Var.j(null);
                            yw0.a aVar4 = sVar.f86137a;
                            this.f86209a = null;
                            this.f86210b = bVarB;
                            this.f86211c = 4;
                            objI = aVar4.i(localDate, bVarB, this);
                            if (objI != aVar) {
                                bVar = bVarB;
                            }
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        p005kotlin.jvm.internal.r0<ww0.c> r0Var3 = this.f86209a;
                        o13.r.b(obj);
                        r0Var = r0Var3;
                        t7 = obj;
                        r0Var.f105810a = t7;
                        cVar = r0Var2.f105810a;
                        if (cVar != null || (bVarA = cVar.getLog()) == null) {
                            ww0.b.f187523n.getClass();
                            bVarA = ww0.b.a.a(localDate);
                        }
                        bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                        y0Var.j(null);
                        yw0.a aVar5 = sVar.f86137a;
                        this.f86209a = null;
                        this.f86210b = bVarB;
                        this.f86211c = 4;
                        objI = aVar5.i(localDate, bVarB, this);
                        if (objI != aVar) {
                            bVar = bVarB;
                        }
                        return aVar;
                    }
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ww0.b bVar2 = this.f86210b;
                    o13.r.b(obj);
                    objI = obj;
                    bVar = bVar2;
                }
                if (!((Boolean) objI).booleanValue()) {
                    throw new Exception("Server call failure");
                }
                ww0.c cVar2 = r0Var2.f105810a;
                y0Var.j(new cx0.a<>(new ww0.c(cVar2 != null ? cVar2.getCycleSummary() : null, bVar, null, 4, null), null, null, false, 12, null));
                return Unit.INSTANCE;
                l1 l1Var2 = this.f86213e;
                if (l1Var2 != null) {
                    this.f86211c = 2;
                    if (l1Var2.P(this) != aVar) {
                        if (r0Var2.f105810a == null) {
                            yw0.a aVar6 = sVar.f86137a;
                            this.f86209a = r0Var2;
                            this.f86211c = 3;
                            objB = aVar6.b(localDate, this);
                            if (objB != aVar) {
                                r0Var = r0Var2;
                                t7 = objB;
                                r0Var.f105810a = t7;
                                cVar = r0Var2.f105810a;
                                if (cVar != null) {
                                    ww0.b.f187523n.getClass();
                                    bVarA = ww0.b.a.a(localDate);
                                } else {
                                    ww0.b.f187523n.getClass();
                                    bVarA = ww0.b.a.a(localDate);
                                }
                                bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                                y0Var.j(null);
                                yw0.a aVar7 = sVar.f86137a;
                                this.f86209a = null;
                                this.f86210b = bVarB;
                                this.f86211c = 4;
                                objI = aVar7.i(localDate, bVarB, this);
                                if (objI != aVar) {
                                    bVar = bVarB;
                                    if (!((Boolean) objI).booleanValue()) {
                                        throw new Exception("Server call failure");
                                    }
                                    ww0.c cVar3 = r0Var2.f105810a;
                                    y0Var.j(new cx0.a<>(new ww0.c(cVar3 != null ? cVar3.getCycleSummary() : null, bVar, null, 4, null), null, null, false, 12, null));
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            cVar = r0Var2.f105810a;
                            if (cVar != null) {
                                ww0.b.f187523n.getClass();
                                bVarA = ww0.b.a.a(localDate);
                            } else {
                                ww0.b.f187523n.getClass();
                                bVarA = ww0.b.a.a(localDate);
                            }
                            bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                            y0Var.j(null);
                            yw0.a aVar8 = sVar.f86137a;
                            this.f86209a = null;
                            this.f86210b = bVarB;
                            this.f86211c = 4;
                            objI = aVar8.i(localDate, bVarB, this);
                            if (objI != aVar) {
                                bVar = bVarB;
                                if (!((Boolean) objI).booleanValue()) {
                                    throw new Exception("Server call failure");
                                }
                                ww0.c cVar4 = r0Var2.f105810a;
                                y0Var.j(new cx0.a<>(new ww0.c(cVar4 != null ? cVar4.getCycleSummary() : null, bVar, null, 4, null), null, null, false, 12, null));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else if (r0Var2.f105810a == null) {
                    yw0.a aVar9 = sVar.f86137a;
                    this.f86209a = r0Var2;
                    this.f86211c = 3;
                    objB = aVar9.b(localDate, this);
                    if (objB != aVar) {
                        r0Var = r0Var2;
                        t7 = objB;
                        r0Var.f105810a = t7;
                        cVar = r0Var2.f105810a;
                        if (cVar != null) {
                            ww0.b.f187523n.getClass();
                            bVarA = ww0.b.a.a(localDate);
                        } else {
                            ww0.b.f187523n.getClass();
                            bVarA = ww0.b.a.a(localDate);
                        }
                        bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                        y0Var.j(null);
                        yw0.a aVar10 = sVar.f86137a;
                        this.f86209a = null;
                        this.f86210b = bVarB;
                        this.f86211c = 4;
                        objI = aVar10.i(localDate, bVarB, this);
                        if (objI != aVar) {
                            bVar = bVarB;
                            if (!((Boolean) objI).booleanValue()) {
                                throw new Exception("Server call failure");
                            }
                            ww0.c cVar5 = r0Var2.f105810a;
                            y0Var.j(new cx0.a<>(new ww0.c(cVar5 != null ? cVar5.getCycleSummary() : null, bVar, null, 4, null), null, null, false, 12, null));
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    cVar = r0Var2.f105810a;
                    if (cVar != null) {
                        ww0.b.f187523n.getClass();
                        bVarA = ww0.b.a.a(localDate);
                    } else {
                        ww0.b.f187523n.getClass();
                        bVarA = ww0.b.a.a(localDate);
                    }
                    bVarB = ww0.b.b(bVarA, this.f86217i, DateTime.now(DateTimeZone.UTC), 7423);
                    y0Var.j(null);
                    yw0.a aVar11 = sVar.f86137a;
                    this.f86209a = null;
                    this.f86210b = bVarB;
                    this.f86211c = 4;
                    objI = aVar11.i(localDate, bVarB, this);
                    if (objI != aVar) {
                        bVar = bVarB;
                        if (!((Boolean) objI).booleanValue()) {
                            throw new Exception("Server call failure");
                        }
                        ww0.c cVar6 = r0Var2.f105810a;
                        y0Var.j(new cx0.a<>(new ww0.c(cVar6 != null ? cVar6.getCycleSummary() : null, bVar, null, 4, null), null, null, false, 12, null));
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            } catch (Throwable th3) {
                y0Var.j(new cx0.a<>(r0Var2.f105810a, th3, null, false, 12, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l1 l1Var, l1 l1Var2, p005kotlin.jvm.internal.r0<ww0.c> r0Var, s sVar, LocalDate localDate, String str, y0<cx0.a<ww0.c>> y0Var, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f86202b = l1Var;
        this.f86203c = l1Var2;
        this.f86204d = r0Var;
        this.f86205e = sVar;
        this.f86206f = localDate;
        this.f86207g = str;
        this.f86208h = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f86202b, this.f86203c, this.f86204d, this.f86205e, this.f86206f, this.f86207g, this.f86208h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86201a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f86202b, this.f86203c, this.f86204d, this.f86205e, this.f86206f, this.f86207g, this.f86208h, null);
            this.f86201a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
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
