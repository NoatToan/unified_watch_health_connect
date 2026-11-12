package wt2;

import o53.b0;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler$processEphemerisEPORequest$1", f = "EphemerisDataHandler.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 315, 325}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f187165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f187167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f187168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f187169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(byte[] bArr, a aVar, x xVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f187167c = bArr;
        this.f187168d = aVar;
        this.f187169e = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f187167c, this.f187168d, this.f187169e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: Exception -> 0x0029, TryCatch #2 {Exception -> 0x0029, blocks: (B:44:0x00be, B:14:0x0025, B:32:0x0085, B:34:0x008b, B:35:0x0096, B:45:0x00c6, B:17:0x002c, B:26:0x004a, B:29:0x0055, B:7:0x0015, B:37:0x009e, B:39:0x00a2, B:42:0x00b8, B:43:0x00bd), top: B:52:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0096 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #2 {Exception -> 0x0029, blocks: (B:44:0x00be, B:14:0x0025, B:32:0x0085, B:34:0x008b, B:35:0x0096, B:45:0x00c6, B:17:0x002c, B:26:0x004a, B:29:0x0055, B:7:0x0015, B:37:0x009e, B:39:0x00a2, B:42:0x00b8, B:43:0x00bd), top: B:52:0x000d, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #1 {Exception -> 0x001a, blocks: (B:7:0x0015, B:37:0x009e, B:39:0x00a2, B:42:0x00b8, B:43:0x00bd), top: B:52:0x000d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[Catch: Exception -> 0x001a, TryCatch #1 {Exception -> 0x001a, blocks: (B:7:0x0015, B:37:0x009e, B:39:0x00a2, B:42:0x00b8, B:43:0x00bd), top: B:52:0x000d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: Exception -> 0x001a, TryCatch #1 {Exception -> 0x001a, blocks: (B:7:0x0015, B:37:0x009e, B:39:0x00a2, B:42:0x00b8, B:43:0x00bd), top: B:52:0x000d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #2 {Exception -> 0x0029, blocks: (B:44:0x00be, B:14:0x0025, B:32:0x0085, B:34:0x008b, B:35:0x0096, B:45:0x00c6, B:17:0x002c, B:26:0x004a, B:29:0x0055, B:7:0x0015, B:37:0x009e, B:39:0x00a2, B:42:0x00b8, B:43:0x00bd), top: B:52:0x000d, inners: #1 }] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (r8.j(r12, r1, false, r11) == r0) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p pVar;
        rs2.c cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187166b;
        a aVar2 = this.f187168d;
        try {
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else if (i14 == 2) {
                        pVar = this.f187165a;
                        o13.r.b(obj);
                        if (pVar.a() == null) {
                            a.C3482a c3482a = a.f187141k;
                            aVar2.f(null, "processEphemerisEPORequest", "'msg.gpsHours' (segments) is null, sending timeout msg to device");
                            aVar2.n();
                        } else if (a.C3482a.b(a.f187141k)) {
                            aVar2.g("processEphemerisEPORequest", "rate limit in effect, sending timeout msg to device");
                            aVar2.n();
                        } else {
                            cVar = aVar2.f187148f;
                            if (cVar != null) {
                                s.m("deviceInfo");
                                throw null;
                            }
                            String f172493a = cVar.getF92741e();
                            long[] jArrA = pVar.a();
                            jArrA.getClass();
                            this.f187165a = null;
                            this.f187166b = 3;
                        }
                    } else {
                        if (i14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                try {
                    pVar = new p(this.f187167c);
                } catch (Exception e4) {
                    a.C3482a c3482a2 = a.f187141k;
                    aVar2.f(e4, "processEphemerisEPORequest", "failed to parse 'GpsEphemerisEpoDataRequestMessage'");
                    pVar = null;
                }
                x xVar = this.f187169e;
                if (pVar == null) {
                    y yVar = y.LENGTH_ERROR;
                    this.f187166b = 1;
                    if (xVar.b(yVar, this) == aVar) {
                    }
                    return Unit.INSTANCE;
                }
                String strValueOf = String.valueOf(pVar);
                a.C3482a c3482a3 = a.f187141k;
                aVar2.e("processEphemerisEPORequest", strValueOf);
                byte[] bArr = new q().f187225a;
                bArr[0] = (byte) (-128);
                bArr[1] = pVar.f187224a[0];
                bArr[2] = (byte) 300;
                bArr[3] = (byte) 1;
                y yVar2 = y.ACK;
                this.f187165a = pVar;
                this.f187166b = 2;
                if (xVar.a(yVar2, bArr, this) != aVar) {
                    if (pVar.a() == null) {
                        a.C3482a c3482a4 = a.f187141k;
                        aVar2.f(null, "processEphemerisEPORequest", "'msg.gpsHours' (segments) is null, sending timeout msg to device");
                        aVar2.n();
                    } else if (a.C3482a.b(a.f187141k)) {
                        cVar = aVar2.f187148f;
                        if (cVar != null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        String f172493a2 = cVar.getF92741e();
                        long[] jArrA2 = pVar.a();
                        jArrA2.getClass();
                        this.f187165a = null;
                        this.f187166b = 3;
                    } else {
                        aVar2.g("processEphemerisEPORequest", "rate limit in effect, sending timeout msg to device");
                        aVar2.n();
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            } catch (Exception e14) {
                a.C3482a c3482a5 = a.f187141k;
                aVar2.f(e14, "processEphemerisEPORequest", "callback failed");
            }
        } catch (Exception e15) {
            a.C3482a c3482a6 = a.f187141k;
            aVar2.f(e15, "processEphemerisEPORequest", "failed to send response");
        }
    }
}
