package f12;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import com.garmin.android.library.mobileauth.exception.IllegalAccountStateException;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import i3.e5;
import java.io.Serializable;
import java.net.URI;
import java.util.LinkedHashMap;
import o53.b0;
import o53.s0;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.f1;
import te2.g1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lf12/c;", "Lf12/b;", "Lpu/a;", "authConfig", "Lf12/l;", "userSettings", "<init>", "(Lpu/a;Lf12/l;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements f12.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f68018f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu.a f68019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f68020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f68021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ve2.e f68022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f68023e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$bindMFATokenToOAuth2DI$1", f = "GCMUserAccountImpl.kt", l = {142}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68024a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68024a;
            if (i14 == 0) {
                o13.r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f68024a = 1;
                bVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new re2.c(null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: f12.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getActiveAccount$1", f = "GCMUserAccountImpl.kt", l = {316}, m = "invokeSuspend", v = 2)
    public static final class C1414c extends v13.i implements e23.p<b0, t13.d<? super ve2.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68026b;

        public C1414c(t13.d<? super C1414c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1414c c1414c = new C1414c(dVar);
            c1414c.f68026b = obj;
            return c1414c;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super ve2.d> dVar) {
            return ((C1414c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68025a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    int i15 = o13.q.f128596b;
                    re2.b bVar2 = re2.b.f152215a;
                    this.f68026b = null;
                    this.f68025a = 1;
                    bVar2.getClass();
                    obj = re2.b.j(this);
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
                bVar = (ve2.d) obj;
                int i16 = o13.q.f128596b;
            } catch (Throwable th3) {
                int i17 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            if (bVar instanceof o13.q.b) {
                return null;
            }
            return bVar;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl", f = "GCMUserAccountImpl.kt", l = {173}, m = "getMFATokenValueSafely", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f68027a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68029c;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f68027a = obj;
            this.f68029c |= Integer.MIN_VALUE;
            return c.this.w(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/e;", "<anonymous>", "(Lo53/b0;)Lve2/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getMobileAuthEnvironment$2", f = "GCMUserAccountImpl.kt", l = {393}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super ve2.e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68030a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super ve2.e> dVar) {
            return new e(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68030a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            re2.b bVar = re2.b.f152215a;
            this.f68030a = 1;
            bVar.getClass();
            Object objQ = re2.b.q(this);
            return objQ == aVar ? aVar : objQ;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ldd2/b;", "<anonymous>", "(Lo53/b0;)Ldd2/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getOAuth1GCConsumer$1", f = "GCMUserAccountImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super dd2.b>, Object> {
        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super dd2.b> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            c cVar = c.this;
            dd2.b bVarA = cVar.f68019a.c().a(cVar.h());
            return bVarA == null ? new dd2.b("", "") : bVarA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lsc2/j;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getOAuth1GCCredentials$1", f = "GCMUserAccountImpl.kt", l = {95, 104}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super sc2.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap f68032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sc2.a f68033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68035d;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = c.this.new g(dVar);
            gVar.f68035d = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sc2.j> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            sc2.a aVar;
            LinkedHashMap linkedHashMap;
            b0 b0Var = (b0) this.f68035d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68034c;
            c cVar = c.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    sc2.a aVar3 = sc2.a.f158476b;
                    int i15 = c.f68018f;
                    cVar.J("getOAuth1GCCredentials()", aVar3);
                    re2.b bVar = re2.b.f152215a;
                    this.f68035d = b0Var;
                    this.f68034c = 1;
                    bVar.getClass();
                    obj = re2.b.n(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = this.f68033b;
                        linkedHashMap = this.f68032a;
                        o13.r.b(obj);
                        linkedHashMap.put(aVar, obj);
                        return new sc2.j("", "");
                    }
                    o13.r.b(obj);
                }
                return (sc2.j) obj;
            } catch (RateLimitException e4) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "GCMUserAccount", "ERROR getOAuth1GCCredentials() -> " + e4);
                LinkedHashMap linkedHashMap2 = cVar.f68021c;
                aVar = sc2.a.f158476b;
                re2.b bVar2 = re2.b.f152215a;
                this.f68035d = null;
                this.f68032a = linkedHashMap2;
                this.f68033b = aVar;
                this.f68034c = 2;
                bVar2.getClass();
                Object objX = re2.b.x(aVar, this);
                if (objX != aVar2) {
                    linkedHashMap = linkedHashMap2;
                    obj = objX;
                }
                return aVar2;
            } catch (IllegalAccountStateException e14) {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "GCMUserAccount", "ERROR getOAuth1GCCredentials() -> " + e14);
                return new sc2.j("", "");
            } catch (IllegalAccessException e15) {
                i2.a aVar6 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var3, "GCMUserAccount", "ERROR getOAuth1GCCredentials() -> " + e15);
                return new sc2.j("", "");
            } catch (Exception e16) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e16, "ERROR getOAuth1GCCredentials() -> ");
                i2.a aVar7 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var4, "GCMUserAccount", strD);
                return new sc2.j("", "");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$getOAuth2DIAccessToken$1", f = "GCMUserAccountImpl.kt", l = {180, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap f68037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sc2.a f68038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68040d;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = c.this.new h(dVar);
            hVar.f68040d = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            sc2.a aVar;
            LinkedHashMap linkedHashMap;
            vc2.c cVar;
            String str;
            b0 b0Var = (b0) this.f68040d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68039c;
            c cVar2 = c.this;
            String str2 = "";
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    sc2.a aVar3 = sc2.a.f158477c;
                    int i15 = c.f68018f;
                    cVar2.J("getOAuth2DIAccessToken()", aVar3);
                    re2.b bVar = re2.b.f152215a;
                    this.f68040d = b0Var;
                    this.f68039c = 1;
                    obj = re2.b.o(bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = this.f68038b;
                        linkedHashMap = this.f68037a;
                        o13.r.b(obj);
                        linkedHashMap.put(aVar, obj);
                        if (d53.w.J(str2) && (cVar = az0.b.f13673d) != null) {
                            cVar.a(500);
                        }
                        return str2;
                    }
                    o13.r.b(obj);
                }
                sc2.m mVar = (sc2.m) obj;
                if (mVar != null && (str = mVar.f158528b) != null) {
                    str2 = str;
                }
            } catch (RateLimitException e4) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "GCMUserAccount", "ERROR getOAuth2DIAccessToken() -> " + e4);
                LinkedHashMap linkedHashMap2 = cVar2.f68021c;
                aVar = sc2.a.f158477c;
                re2.b bVar2 = re2.b.f152215a;
                this.f68040d = null;
                this.f68037a = linkedHashMap2;
                this.f68038b = aVar;
                this.f68039c = 2;
                bVar2.getClass();
                Object objX = re2.b.x(aVar, this);
                if (objX != aVar2) {
                    linkedHashMap = linkedHashMap2;
                    obj = objX;
                }
                return aVar2;
            } catch (IllegalAccountStateException e14) {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "GCMUserAccount", "ERROR getOAuth2DIAccessToken() -> " + e14);
            } catch (IllegalAccessException e15) {
                i2.a aVar6 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var3, "GCMUserAccount", "ERROR getOAuth2DIAccessToken() -> " + e15);
            } catch (Exception e16) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e16, "ERROR getOAuth2DIAccessToken() -> ");
                i2.a aVar7 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var4, "GCMUserAccount", strD);
            }
            if (d53.w.J(str2)) {
                cVar.a(500);
            }
            return str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$isMFAGloballyEnabled$1", f = "GCMUserAccountImpl.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ve2.d f68043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ve2.d dVar, t13.d<? super i> dVar2) {
            super(2, dVar2);
            this.f68043b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f68043b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68042a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            re2.b bVar = re2.b.f152215a;
            this.f68042a = 1;
            bVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new re2.k(this.f68043b, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$isPermanentMFAEnabled$1", f = "GCMUserAccountImpl.kt", l = {126}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ve2.d f68045b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ve2.d dVar, t13.d<? super j> dVar2) {
            super(2, dVar2);
            this.f68045b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f68045b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68044a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            re2.b bVar = re2.b.f152215a;
            this.f68044a = 1;
            bVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new re2.m(this.f68045b, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$isUserSignedIn$1", f = "GCMUserAccountImpl.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68046a;

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68046a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f68046a = 1;
                Object objE = c.this.E(this);
                return objE == aVar ? aVar : objE;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$refreshOAuth2DIAccessToken$1", f = "GCMUserAccountImpl.kt", l = {210, 223}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap f68048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sc2.a f68049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68051d;

        public l(t13.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            l lVar = c.this.new l(dVar);
            lVar.f68051d = obj;
            return lVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            sc2.a aVar;
            LinkedHashMap linkedHashMap;
            vc2.c cVar;
            String str;
            b0 b0Var = (b0) this.f68051d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68050c;
            c cVar2 = c.this;
            String str2 = "";
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    sc2.a aVar3 = sc2.a.f158477c;
                    int i15 = c.f68018f;
                    cVar2.J("refreshOAuth2DIAccessToken()", aVar3);
                    re2.b bVar = re2.b.f152215a;
                    this.f68051d = b0Var;
                    this.f68050c = 1;
                    obj = re2.b.z(bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar = this.f68049b;
                        linkedHashMap = this.f68048a;
                        o13.r.b(obj);
                        linkedHashMap.put(aVar, obj);
                        if (d53.w.J(str2) && (cVar = az0.b.f13673d) != null) {
                            cVar.a(500);
                        }
                        return str2;
                    }
                    o13.r.b(obj);
                }
                sc2.m mVar = (sc2.m) obj;
                if (mVar != null && (str = mVar.f158528b) != null) {
                    str2 = str;
                }
            } catch (RateLimitException e4) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "GCMUserAccount", "ERROR refreshOAuth2DIAccessToken() -> " + e4);
                LinkedHashMap linkedHashMap2 = cVar2.f68021c;
                aVar = sc2.a.f158477c;
                re2.b bVar2 = re2.b.f152215a;
                this.f68051d = null;
                this.f68048a = linkedHashMap2;
                this.f68049b = aVar;
                this.f68050c = 2;
                bVar2.getClass();
                Object objX = re2.b.x(aVar, this);
                if (objX != aVar2) {
                    linkedHashMap = linkedHashMap2;
                    obj = objX;
                }
                return aVar2;
            } catch (CredentialExchangesExhaustedException e14) {
                cVar2.f68023e = true;
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "GCMUserAccount", "ERROR refreshOAuth2DIAccessToken() -> " + e14);
            } catch (IllegalAccountStateException e15) {
                i2.a aVar6 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var3, "GCMUserAccount", "ERROR refreshOAuth2DIAccessToken() -> " + e15);
            } catch (IllegalAccessException e16) {
                i2.a aVar7 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var4, "GCMUserAccount", "ERROR refreshOAuth2DIAccessToken() -> " + e16);
            } catch (Exception e17) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e17, "ERROR refreshOAuth2DIAccessToken() -> ");
                i2.a aVar8 = i2.f36769a;
                a2 a2Var5 = a2.GENERAL;
                aVar8.getClass();
                i2.a.f(a2Var5, "GCMUserAccount", strD);
            }
            if (d53.w.J(str2)) {
                cVar.a(500);
            }
            return str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$signOut$1", f = "GCMUserAccountImpl.kt", l = {467}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68053a;

        public m(t13.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new m(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new m(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68053a;
            if (i14 == 0) {
                o13.r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f68053a = 1;
                if (bVar.G(this) == aVar) {
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

    static {
        new a(null);
    }

    public c(pu.a aVar, f12.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f68019a = aVar;
        this.f68020b = lVar;
        this.f68021c = new LinkedHashMap();
    }

    @Override // f12.b
    public final Boolean A(ve2.d dVar) {
        if (l()) {
            return (Boolean) ge1.b.W(t13.h.f161748a, new j(dVar, null));
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR isPermanentMFAEnabled() -> AuthenticationHelper not initialized");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f12.b
    public final Object B(v13.c cVar) throws Throwable {
        f12.e eVar;
        if (cVar instanceof f12.e) {
            eVar = (f12.e) cVar;
            int i14 = eVar.f68059c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f68059c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new f12.e(this, cVar);
            }
        } else {
            eVar = new f12.e(this, cVar);
        }
        Object objL = eVar.f68057a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f68059c;
        try {
            if (i15 == 0) {
                o13.r.b(objL);
                if (!l()) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "GCMUserAccount", "ERROR getMFATokenSafely() -> AuthenticationHelper not initialized");
                    return qu.c.b.f147864a;
                }
                re2.b bVar = re2.b.f152215a;
                eVar.f68059c = 1;
                objL = bVar.l(eVar);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objL);
            }
            String str = (String) objL;
            if (str != null) {
                return new qu.c.C2781c(str);
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "AuthenticationHelper.getMFATokenSafely", "no MFA token");
            return qu.c.b.f147864a;
        } catch (MFATokenExpiredException unused) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "AuthenticationHelper.getMFATokenSafely", "MFA token expired");
            return qu.c.a.f147863a;
        }
    }

    @Override // f12.b
    public final Object C(v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new f12.f(this, null), cVar);
    }

    @Override // f12.b
    public final boolean D() {
        ve2.e eVarH = h();
        return ve2.e.f177704d == eVarH || ve2.e.f177705e == eVarH;
    }

    @Override // f12.b
    public final Object E(v13.c cVar) {
        if (l()) {
            re2.b.f152215a.getClass();
            return re2.b.y(false, cVar);
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR isUserSignedIn() -> AuthenticationHelper not initialized");
        return Boolean.TRUE;
    }

    @Override // f12.b
    public final void F() {
        this.f68023e = false;
    }

    @Override // f12.b
    public final boolean G() {
        ve2.e eVarH = h();
        return ve2.e.f177707g == eVarH || ve2.e.f177708h == eVarH;
    }

    @Override // f12.b
    public final Boolean H(ve2.d dVar) {
        if (l()) {
            return (Boolean) ge1.b.W(t13.h.f161748a, new i(dVar, null));
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR isMFAGloballyEnabled() -> AuthenticationHelper not initialized");
        return null;
    }

    @Override // f12.b
    public final void I() throws Throwable {
        if (l()) {
            ge1.b.W(t13.h.f161748a, new m(null));
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR signOut() -> AuthenticationHelper not initialized");
    }

    public final void J(String str, sc2.a aVar) throws Exception {
        LinkedHashMap linkedHashMap = this.f68021c;
        uc2.b bVar = (uc2.b) linkedHashMap.get(aVar);
        if (bVar != null) {
            long j8 = bVar.f170004d;
            String strPrint = DateTimeFormat.fullDateTime().print(j8);
            if (nd2.c.c().getTimeInMillis() <= j8) {
                throw new Exception(e5.g(str, " Rate Limit In Effect. No calls to mobile auth lib allowed until ", strPrint));
            }
            String strH = com.nimbusds.jose.shaded.gson.internal.a.h(str, " Rate limit retryAfterTimestampUTC[", strPrint, "] passed, allow calls to mobile auth lib.");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "GCMUserAccount", strH);
            linkedHashMap.put(aVar, null);
        }
    }

    @Override // f12.b
    public final Object a(String str, v13.c cVar) {
        if (l()) {
            re2.b.f152215a.getClass();
            return re2.b.t(str, cVar);
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR isMFATokenValid() -> AuthenticationHelper not initialized");
        return null;
    }

    @Override // f12.b
    public final dd2.b b() {
        return (dd2.b) ge1.b.W(t13.h.f161748a, new f(null));
    }

    @Override // f12.b
    public final boolean c() {
        return ((Boolean) ge1.b.W(t13.h.f161748a, new k(null))).booleanValue();
    }

    @Override // f12.b
    public final sc2.j d() {
        return (sc2.j) ge1.b.W(t13.h.f161748a, new g(null));
    }

    @Override // f12.b
    public final String e() {
        return (String) ge1.b.W(t13.h.f161748a, new l(null));
    }

    @Override // f12.b
    public final boolean f() {
        return ve2.e.f177705e == h();
    }

    @Override // f12.b
    public final String g() {
        return (String) ge1.b.W(t13.h.f161748a, new h(null));
    }

    @Override // f12.b
    public final String getUserDisplayName() {
        return this.f68020b.getUserDisplayName();
    }

    @Override // f12.b
    public final String getUserFullName() {
        return this.f68020b.getUserFullName();
    }

    @Override // f12.b
    public final int getUserProfilePk() {
        return (int) this.f68020b.getUserProfilePk();
    }

    @Override // f12.b
    public final ve2.e h() {
        ve2.e eVar = this.f68022d;
        if (eVar != null) {
            return eVar;
        }
        if (l()) {
            ve2.e eVar2 = (ve2.e) ge1.b.W(t13.h.f161748a, new e(null));
            this.f68022d = eVar2;
            return eVar2;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR getUserFullName() -> AuthenticationHelper not initialized");
        return ve2.e.f177704d;
    }

    @Override // f12.b
    public final boolean i() {
        return ve2.e.f177704d == h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f12.b
    public final Object j(v13.c cVar) throws Throwable {
        f12.g gVar;
        String str;
        if (cVar instanceof f12.g) {
            gVar = (f12.g) cVar;
            int i14 = gVar.f68069c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f68069c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new f12.g(this, cVar);
            }
        } else {
            gVar = new f12.g(this, cVar);
        }
        Object objP = gVar.f68067a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f68069c;
        try {
            if (i15 == 0) {
                o13.r.b(objP);
                J("getUserITAccessToken()", sc2.a.f158478d);
                re2.b bVar = re2.b.f152215a;
                gVar.f68069c = 1;
                objP = re2.b.p(bVar, gVar);
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objP);
            }
            sc2.o oVar = (sc2.o) objP;
            return (oVar == null || (str = oVar.f158544a) == null) ? "" : str;
        } catch (RateLimitException e4) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "GCMUserAccount", "ERROR getUserITAccessToken() -> " + e4);
            ge1.b.W(t13.h.f161748a, new f12.h(this, null));
            return "";
        } catch (IllegalAccountStateException e14) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "GCMUserAccount", "ERROR getUserITAccessToken() -> " + e14);
            return "";
        } catch (IllegalAccessException e15) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "GCMUserAccount", "ERROR getUserITAccessToken() -> " + e15);
            return "";
        } catch (Exception e16) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e16, "ERROR getUserITAccessToken() -> ");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var4, "GCMUserAccount", strD);
            return "";
        }
    }

    @Override // f12.b
    public final ve2.d k() {
        if (l()) {
            return (ve2.d) ge1.b.W(t13.h.f161748a, new C1414c(null));
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR getActiveAccount() -> AuthenticationHelper not initialized");
        return null;
    }

    @Override // f12.b
    public final boolean l() {
        re2.b.f152215a.getClass();
        return re2.b.f152233s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // f12.b
    public final Serializable m(Context context, ve2.h hVar, URI uri, v13.c cVar) {
        f12.d dVar;
        Serializable bVar;
        if (cVar instanceof f12.d) {
            dVar = (f12.d) cVar;
            int i14 = dVar.f68056c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f68056c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new f12.d(this, cVar);
            }
        } else {
            dVar = new f12.d(this, cVar);
        }
        Object objE0 = dVar.f68054a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f68056c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                if (!l()) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "GCMUserAccount", "ERROR generateITAutoLoginURI() -> AuthenticationHelper not initialized");
                    return null;
                }
                int i16 = o13.q.f128596b;
                f1 f1Var = new f1();
                dVar.f68056c = 1;
                re2.b bVar2 = re2.b.f152215a;
                re2.b.c cVar2 = re2.b.c.DEFAULT;
                Logger logger = f1Var.f164026a;
                bVar2.getClass();
                re2.b.K("cas", cVar2, logger);
                bVar2.L();
                x53.c cVar3 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new g1(f1Var, hVar, context, uri, null), dVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            bVar = (URI) objE0;
            int i17 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            String strP = am.j.p("ERROR generateITAutoLoginURI() -> ", thB);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "GCMUserAccount", strP);
        }
        return bVar instanceof o13.q.b ? null : bVar;
    }

    @Override // f12.b
    public final boolean n() {
        return ve2.e.f177708h == h();
    }

    @Override // f12.b
    public final re2.b.a o() {
        if (l()) {
            return re2.b.f152215a.i();
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR evaluate() -> AuthenticationHelper not initialized");
        return null;
    }

    @Override // f12.b
    public final boolean p() {
        if (l()) {
            re2.b.f152215a.getClass();
            return re2.b.w();
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR isPendingChinaPrivacyConsent() -> AuthenticationHelper not initialized");
        return false;
    }

    @Override // f12.b
    public final Object q(qf1.g gVar) {
        if (l()) {
            re2.b.f152215a.getClass();
            x53.c cVar = s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new re2.d(null), gVar);
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR getMFALoginInfo() -> AuthenticationHelper not initialized");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f12.b
    public final Object r(v13.c cVar) {
        f12.k kVar;
        if (cVar instanceof f12.k) {
            kVar = (f12.k) cVar;
            int i14 = kVar.f68083c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f68083c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new f12.k(this, cVar);
            }
        } else {
            kVar = new f12.k(this, cVar);
        }
        Object obj = kVar.f68081a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f68083c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (!l()) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "GCMUserAccount", "ERROR refreshUserProfile() -> AuthenticationHelper not initialized");
                    return Unit.INSTANCE;
                }
                re2.b bVar = re2.b.f152215a;
                kVar.f68083c = 1;
                bVar.getClass();
                if (re2.b.B(kVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "ERROR refreshUserProfile() -> ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "GCMUserAccount", strD);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f12.b
    public final Object s(v13.c cVar) throws Throwable {
        f12.i iVar;
        String str;
        if (cVar instanceof f12.i) {
            iVar = (f12.i) cVar;
            int i14 = iVar.f68076c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f68076c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new f12.i(this, cVar);
            }
        } else {
            iVar = new f12.i(this, cVar);
        }
        Object objA = iVar.f68074a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f68076c;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                J("refreshUserITToken()", sc2.a.f158478d);
                re2.b bVar = re2.b.f152215a;
                iVar.f68076c = 1;
                objA = re2.b.A(bVar, iVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            sc2.o oVar = (sc2.o) objA;
            return (oVar == null || (str = oVar.f158544a) == null) ? "" : str;
        } catch (RateLimitException e4) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "GCMUserAccount", "ERROR refreshUserITToken() -> " + e4);
            ge1.b.W(t13.h.f161748a, new f12.j(this, null));
            return "";
        } catch (IllegalAccountStateException e14) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "GCMUserAccount", "ERROR refreshUserITToken() -> " + e14);
            return "";
        } catch (IllegalAccessException e15) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "GCMUserAccount", "ERROR refreshUserITToken() -> " + e15);
            return "";
        } catch (Exception e16) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e16, "ERROR refreshUserITToken() -> ");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var4, "GCMUserAccount", strD);
            return "";
        }
    }

    @Override // f12.b
    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getF68023e() {
        return this.f68023e;
    }

    @Override // f12.b
    public final void u() throws Throwable {
        if (l()) {
            ge1.b.W(t13.h.f161748a, new b(null));
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "GCMUserAccount", "ERROR bindMFATokenToOAuth2DI() -> AuthenticationHelper not initialized");
    }

    @Override // f12.b
    public final void v() {
        this.f68022d = null;
        this.f68020b.O1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f12.b
    public final Object w(t13.d<? super String> dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f68029c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f68029c = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objB = dVar2.f68027a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f68029c;
        if (i15 == 0) {
            o13.r.b(objB);
            dVar2.f68029c = 1;
            objB = B(dVar2);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        qu.c.C2781c c2781c = objB instanceof qu.c.C2781c ? (qu.c.C2781c) objB : null;
        if (c2781c != null) {
            return c2781c.f147865a;
        }
        return null;
    }

    @Override // f12.b
    public final boolean x() {
        return ve2.e.f177709i == h();
    }

    @Override // f12.b
    public final boolean y() {
        return ve2.e.f177711k == h();
    }

    @Override // f12.b
    public final void z(ve2.e eVar) {
        eVar.getClass();
        String strN = fb1.c.n("onUpdateEnvironment: ", eVar.name());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMUserAccount", strN);
        this.f68022d = eVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf12/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
