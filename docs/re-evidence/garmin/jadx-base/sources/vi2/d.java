package vi2;

import android.content.Context;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import com.garmin.android.library.mobileauth.exception.NoMFATokenException;
import com.garmin.auth.cmc.data.network.CMCNoUserSignedInException;
import d53.w;
import e23.l;
import e23.p;
import java.net.URI;
import o13.q;
import o13.r;
import o53.b0;
import o53.s0;
import og2.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import re2.l0;
import te2.f1;
import te2.k1;
import ui2.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lui2/f;", "", "<anonymous>", "(Lo53/b0;)Lui2/f;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.domain.GenerateAutoLoginUseCase$invoke$2", f = "GenerateAutoLoginUseCase.android.kt", l = {45, 47, 55, 62, 79}, m = "invokeSuspend")
public final class d extends i implements p<b0, t13.d<? super f<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi2.c f178439c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lui2/f;", "", "<anonymous>", "()Lui2/f;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.domain.GenerateAutoLoginUseCase$invoke$2$3", f = "GenerateAutoLoginUseCase.android.kt", l = {82}, m = "invokeSuspend")
    public static final class a extends i implements l<t13.d<? super f<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qi2.c f178441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qi2.c cVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f178441b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f178441b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super f<? extends String>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178440a;
            if (i14 == 0) {
                r.b(obj);
                zy2.d.f207528a.getClass();
                Context context = zy2.d.f207529b;
                if (context == null) {
                    h.z("'AppContext' not initialized");
                    return null;
                }
                String strP = k.p(this.f178441b, l0.d(context));
                f1 f1Var = new f1();
                re2.b bVar = re2.b.f152215a;
                Context contextB = bVar.b();
                URI uri = new URI(strP);
                ve2.h hVar = ve2.h.USE_IF_ENABLED;
                this.f178440a = 1;
                re2.b.K("portal", re2.b.c.DEFAULT, f1Var.f164026a);
                bVar.L();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new k1(f1Var, hVar, contextB, uri, "CUSTOMER_MGMT_CTR_MOBILE", null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            String string = ((URI) obj).toString();
            string.getClass();
            return new f.b(string);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qi2.c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f178439c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f178439c, dVar);
        dVar2.f178438b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super f<? extends String>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:13:0x0020, B:42:0x0095, B:44:0x009d, B:48:0x00bb, B:16:0x0028, B:34:0x007c, B:36:0x0080, B:39:0x0087, B:46:0x00ac, B:17:0x002c, B:29:0x0068, B:31:0x0070, B:18:0x0030, B:24:0x004c, B:26:0x0050, B:49:0x00c0, B:21:0x003b), top: B:62:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x0025, PHI: r9
      0x007c: PHI (r9v23 java.lang.Object) = (r9v22 java.lang.Object), (r9v0 java.lang.Object) binds: [B:32:0x0078, B:16:0x0028] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0025, blocks: (B:13:0x0020, B:42:0x0095, B:44:0x009d, B:48:0x00bb, B:16:0x0028, B:34:0x007c, B:36:0x0080, B:39:0x0087, B:46:0x00ac, B:17:0x002c, B:29:0x0068, B:31:0x0070, B:18:0x0030, B:24:0x004c, B:26:0x0050, B:49:0x00c0, B:21:0x003b), top: B:62:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:13:0x0020, B:42:0x0095, B:44:0x009d, B:48:0x00bb, B:16:0x0028, B:34:0x007c, B:36:0x0080, B:39:0x0087, B:46:0x00ac, B:17:0x002c, B:29:0x0068, B:31:0x0070, B:18:0x0030, B:24:0x004c, B:26:0x0050, B:49:0x00c0, B:21:0x003b), top: B:62:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:13:0x0020, B:42:0x0095, B:44:0x009d, B:48:0x00bb, B:16:0x0028, B:34:0x007c, B:36:0x0080, B:39:0x0087, B:46:0x00ac, B:17:0x002c, B:29:0x0068, B:31:0x0070, B:18:0x0030, B:24:0x004c, B:26:0x0050, B:49:0x00c0, B:21:0x003b), top: B:62:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:13:0x0020, B:42:0x0095, B:44:0x009d, B:48:0x00bb, B:16:0x0028, B:34:0x007c, B:36:0x0080, B:39:0x0087, B:46:0x00ac, B:17:0x002c, B:29:0x0068, B:31:0x0070, B:18:0x0030, B:24:0x004c, B:26:0x0050, B:49:0x00c0, B:21:0x003b), top: B:62:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc A[RETURN] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thB;
        Object objA;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178437a;
        try {
            if (i14 == 0) {
                r.b(obj);
                int i15 = q.f128596b;
                re2.b bVar2 = re2.b.f152215a;
                this.f178437a = 1;
                bVar2.getClass();
                obj = re2.b.j(this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 == 2) {
                    r.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        re2.b bVar3 = re2.b.f152215a;
                        this.f178437a = 3;
                        obj = bVar3.l(this);
                        if (obj == aVar) {
                            str = (String) obj;
                            if (str != null) {
                                re2.b bVar4 = re2.b.f152215a;
                                this.f178437a = 4;
                                bVar4.getClass();
                                obj = re2.b.t(str, this);
                                if (obj != aVar) {
                                }
                            }
                            return new f.a(oi0.c.J(new NoMFATokenException()));
                        }
                    } else {
                        bVar = Unit.INSTANCE;
                        int i16 = q.f128596b;
                        thB = q.b(bVar);
                        if (thB == null && (thB instanceof MFATokenExpiredException)) {
                            return new f.a(oi0.c.J(new NoMFATokenException()));
                        }
                        a aVar2 = new a(this.f178439c, null);
                        this.f178437a = 5;
                        objA = ui2.e.a(aVar2, this);
                        if (objA != aVar) {
                            return objA;
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    r.b(obj);
                    str = (String) obj;
                    if (str != null && !w.J(str)) {
                        re2.b bVar5 = re2.b.f152215a;
                        this.f178437a = 4;
                        bVar5.getClass();
                        obj = re2.b.t(str, this);
                        if (obj != aVar) {
                        }
                        return aVar;
                    }
                    return new f.a(oi0.c.J(new NoMFATokenException()));
                }
                if (i14 != 4) {
                    if (i14 == 5) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return new f.a(oi0.c.J(new NoMFATokenException()));
            }
            bVar = Unit.INSTANCE;
            int i17 = q.f128596b;
            thB = q.b(bVar);
            if (thB == null) {
            }
            a aVar3 = new a(this.f178439c, null);
            this.f178437a = 5;
            objA = ui2.e.a(aVar3, this);
            if (objA != aVar) {
                return aVar;
            }
            return objA;
            ve2.d dVar = (ve2.d) obj;
            if (dVar == null) {
                return new f.a(new CMCNoUserSignedInException(null, 1, null));
            }
            re2.b bVar6 = re2.b.f152215a;
            this.f178437a = 2;
            bVar6.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new re2.k(dVar, null), this);
            if (obj != aVar) {
                if (((Boolean) obj).booleanValue()) {
                    re2.b bVar7 = re2.b.f152215a;
                    this.f178437a = 3;
                    obj = bVar7.l(this);
                    if (obj == aVar) {
                        str = (String) obj;
                        if (str != null) {
                            re2.b bVar8 = re2.b.f152215a;
                            this.f178437a = 4;
                            bVar8.getClass();
                            obj = re2.b.t(str, this);
                            if (obj != aVar) {
                                if (!((Boolean) obj).booleanValue()) {
                                    return new f.a(oi0.c.J(new NoMFATokenException()));
                                }
                                bVar = Unit.INSTANCE;
                                int i18 = q.f128596b;
                                thB = q.b(bVar);
                                if (thB == null) {
                                }
                                a aVar4 = new a(this.f178439c, null);
                                this.f178437a = 5;
                                objA = ui2.e.a(aVar4, this);
                                if (objA != aVar) {
                                    return objA;
                                }
                            }
                        }
                        return new f.a(oi0.c.J(new NoMFATokenException()));
                    }
                } else {
                    bVar = Unit.INSTANCE;
                    int i19 = q.f128596b;
                    thB = q.b(bVar);
                    if (thB == null) {
                    }
                    a aVar5 = new a(this.f178439c, null);
                    this.f178437a = 5;
                    objA = ui2.e.a(aVar5, this);
                    if (objA != aVar) {
                        return objA;
                    }
                }
            }
            return aVar;
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            bVar = new q.b(th3);
        }
    }
}
