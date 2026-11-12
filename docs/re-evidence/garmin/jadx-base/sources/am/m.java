package am;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lam/m;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lam/b2;", "gcActivityApi", "Lam/d2;", "gcUploadActivityImageAPI", "Lkr/g;", "imageDataSource", "Lkr/f;", "delegateDataSource", "<init>", "(Lam/b2;Lam/d2;Lkr/g;Lkr/f;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4066e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final MediaType f4067f = gz0.a.f80404d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a81.m f4068g = new a81.m(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f4069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f4070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kr.g f4071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kr.f f4072d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivitySummary$1", f = "ActivityRepo.kt", l = {232, 232}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super v2<? extends ps.r>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f4073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f4075c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f4077e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivitySummary$1$1", f = "ActivityRepo.kt", l = {232}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ps.r>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f4079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f4080c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, long j8, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f4079b = mVar;
                this.f4080c = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f4079b, this.f4080c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super c83.a0<ps.r>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f4078a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                o53.i0<c83.a0<ps.r>> i0VarC = this.f4079b.f4069a.c(this.f4080c);
                this.f4078a = 1;
                Object objAwait = i0VarC.await(this);
                return objAwait == aVar ? aVar : objAwait;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f4077e = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = m.this.new b(this.f4077e, dVar);
            bVar.f4075c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super v2<? extends ps.r>> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f4075c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4074b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f4073a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            long j8 = this.f4077e;
            m mVar = m.this;
            a aVar2 = new a(mVar, j8, null);
            this.f4075c = null;
            this.f4073a = jVar;
            this.f4074b = 1;
            mVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
            this.f4075c = null;
            this.f4073a = null;
            this.f4074b = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$updateActivity$1", f = "ActivityRepo.kt", l = {236, 236}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f4081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f4083c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f4085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ps.r f4086f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$updateActivity$1$1", f = "ActivityRepo.kt", l = {236}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f4088b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f4089c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ps.r f4090d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, long j8, ps.r rVar, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f4088b = mVar;
                this.f4089c = j8;
                this.f4090d = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f4088b, this.f4089c, this.f4090d, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f4087a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                o53.i0<c83.a0<Unit>> i0VarG = this.f4088b.f4069a.g(this.f4089c, this.f4090d);
                this.f4087a = 1;
                Object objAwait = i0VarG.await(this);
                return objAwait == aVar ? aVar : objAwait;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, ps.r rVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f4085e = j8;
            this.f4086f = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = m.this.new c(this.f4085e, this.f4086f, dVar);
            cVar.f4083c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f4083c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4082b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f4081a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            ps.r rVar = this.f4086f;
            m mVar = m.this;
            a aVar2 = new a(mVar, this.f4085e, rVar, null);
            this.f4083c = null;
            this.f4081a = jVar;
            this.f4082b = 1;
            mVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
            this.f4083c = null;
            this.f4081a = null;
            this.f4082b = 2;
        }
    }

    public /* synthetic */ m(b2 b2Var, d2 d2Var, kr.g gVar, kr.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b2Var, (i14 & 2) != 0 ? null : d2Var, (i14 & 4) != 0 ? null : gVar, (i14 & 8) != 0 ? null : fVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r11 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, long j8, bq0.k kVar, v13.c cVar) throws Throwable {
        q0 q0Var;
        com.garmin.android.apps.connectmobile.activities.newmodel.d dVar;
        Object objG;
        mVar.getClass();
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f4165d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f4165d = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(mVar, cVar);
            }
        } else {
            q0Var = new q0(mVar, cVar);
        }
        q0 q0Var2 = q0Var;
        Object objA = q0Var2.f4163b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var2.f4165d;
        if (i15 == 0) {
            o13.r.b(objA);
            kr.g gVar = mVar.f4071c;
            if (gVar != null) {
                q0Var2.f4162a = j8;
                q0Var2.f4165d = 1;
                objA = gVar.a(j8, kVar, q0Var2);
            } else {
                dVar = null;
                if (dVar instanceof com.garmin.android.apps.connectmobile.activities.newmodel.d.a) {
                    return dVar instanceof com.garmin.android.apps.connectmobile.activities.newmodel.d.b ? new com.garmin.android.apps.connectmobile.activities.newmodel.e.b(((com.garmin.android.apps.connectmobile.activities.newmodel.d.b) dVar).f29412a) : new com.garmin.android.apps.connectmobile.activities.newmodel.e.b(new Exception("Something went wrong while processing the image!"));
                }
                com.garmin.android.apps.connectmobile.activities.newmodel.d.a aVar = (com.garmin.android.apps.connectmobile.activities.newmodel.d.a) dVar;
                String str = aVar.f29410a;
                byte[] bArr = aVar.f29411b;
                q0Var2.f4162a = j8;
                q0Var2.f4165d = 2;
                objG = mVar.g(j8, str, bArr, q0Var2);
                if (objG != obj) {
                    return objG;
                }
            }
            return obj;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objA);
                return objA;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = q0Var2.f4162a;
        o13.r.b(objA);
        dVar = (com.garmin.android.apps.connectmobile.activities.newmodel.d) objA;
        if (dVar instanceof com.garmin.android.apps.connectmobile.activities.newmodel.d.a) {
            if (dVar instanceof com.garmin.android.apps.connectmobile.activities.newmodel.d.b) {
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.d.a aVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.d.a) dVar;
        String str2 = aVar2.f29410a;
        byte[] bArr2 = aVar2.f29411b;
        q0Var2.f4162a = j8;
        q0Var2.f4165d = 2;
        objG = mVar.g(j8, str2, bArr2, q0Var2);
        if (objG != obj) {
            return obj;
        }
        return objG;
    }

    public static Object b(m mVar, long j8, t13.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(mVar, new x(null, mVar, j8, 1400, 1000, null), dVar);
    }

    public final r53.i<v2<ps.r>> c(long j8) {
        r53.c2 c2Var = new r53.c2(new b(j8, null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    public final r53.i<v2<Unit>> d(long j8, ps.r rVar) {
        r53.c2 c2Var = new r53.c2(new c(j8, rVar, null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r1 == r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (r1 == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j8, MultipartBody.Part part, int i14, v13.c cVar) {
        r0 r0Var;
        v2 v2Var;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i15 = r0Var.f4178c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r0Var.f4178c = i15 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        r0 r0Var2 = r0Var;
        Object objO0 = r0Var2.f4176a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = r0Var2.f4178c;
        if (i16 == 0) {
            o13.r.b(objO0);
            if (this.f4070b != null) {
                f60.a aVar = f60.a.f69195a;
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String str = String.format("uploadActivityImagePayload headers = %s , body = %s %d bytes", Arrays.copyOf(new Object[]{part.headers(), part.body().getF121556a(), new Long(part.body().contentLength())}, 3));
                aVar.getClass();
                FirebaseCrashlytics.getInstance().log(str);
                e23.l s0Var = new s0(this, j8, part, null);
                r0Var2.f4178c = 1;
                objO0 = O0(i14, 5000L, s0Var, r0Var2);
            } else {
                e23.l t0Var = new t0(this, j8, part, null);
                r0Var2.f4178c = 2;
                objO0 = O0(i14, 5000L, t0Var, r0Var2);
            }
            return obj;
        }
        if (i16 == 1) {
            o13.r.b(objO0);
            v2Var = (v2) objO0;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO0);
            v2Var = (v2) objO0;
        }
        if (v2Var instanceof v2.b) {
            ht.a aVar2 = ht.a.f85464a;
            Bundle bundleA = h7.c.a(new o13.p("result", BooleanUtils.TRUE), new o13.p("Status", new Integer(200)));
            aVar2.getClass();
            ht.a.a(bundleA, "UploadActivityImages");
            return v2Var;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        ht.a aVar3 = ht.a.f85464a;
        Bundle bundleA2 = h7.c.a(new o13.p("result", BooleanUtils.FALSE), new o13.p("Status", ((v2.a) v2Var).f47384b));
        aVar3.getClass();
        ht.a.a(bundleA2, "UploadActivityImages");
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(long j8, String str, byte[] bArr, v13.c cVar) {
        v0 v0Var;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i14 = v0Var.f4244c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f4244c = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        v0 v0Var2 = v0Var;
        Object objF = v0Var2.f4242a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var2.f4244c;
        if (i15 == 0) {
            o13.r.b(objF);
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", str, RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, f4067f, 0, 0, 6, (Object) null));
            v0Var2.f4244c = 1;
            objF = f(j8, partCreateFormData, 3, v0Var2);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            return new com.garmin.android.apps.connectmobile.activities.newmodel.e.a((ps.j) ((v2.b) v2Var).f47386a);
        }
        if (v2Var instanceof v2.a) {
            return new com.garmin.android.apps.connectmobile.activities.newmodel.e.b(((v2.a) v2Var).f47383a);
        }
        lc.u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lam/m$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "", "UPLOAD_IMAGES_RETRY_COUNT", "I", "Lokhttp3/MediaType;", "FILE_TYPE", "Lokhttp3/MediaType;", "DEFAULT_MAX_CHART_SIZE", "DEFAULT_MAX_HEATMAP_SIZE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(a aVar, int i14) {
            b2 b2Var = (i14 & 1) == 0 ? (b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[]{e83.a.d(new GsonBuilder().serializeNulls().create())}, null, null, null, 120) : (b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            d2 d2Var = (d2) ez0.b.c(ez0.b.f67468a, ez0.c.GC, new c83.h.a[0], m.f4068g);
            aVar.getClass();
            b2Var.getClass();
            d2Var.getClass();
            return new m(b2Var, d2Var, null, null, 12, null);
        }

        private a() {
        }
    }

    public m(b2 b2Var, d2 d2Var, kr.g gVar, kr.f fVar) {
        b2Var.getClass();
        this.f4069a = b2Var;
        this.f4070b = d2Var;
        this.f4071c = gVar;
        this.f4072d = fVar;
    }
}
