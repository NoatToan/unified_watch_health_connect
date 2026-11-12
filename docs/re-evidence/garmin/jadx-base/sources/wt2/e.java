package wt2;

import com.google.mlkit.common.MlKitException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler$processEphemerisRequest$1", f = "EphemerisDataHandler.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 226, 242}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f187170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f187171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f187173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f187174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f187175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(byte[] bArr, a aVar, x xVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f187173d = bArr;
        this.f187174e = aVar;
        this.f187175f = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f187173d, this.f187174e, this.f187175f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: Exception -> 0x00b2, TRY_ENTER, TryCatch #2 {Exception -> 0x00b2, blocks: (B:53:0x00e2, B:43:0x00af, B:47:0x00b4, B:54:0x00e8, B:7:0x0018, B:50:0x00c8), top: B:61:0x0010, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4 A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:53:0x00e2, B:43:0x00af, B:47:0x00b4, B:54:0x00e8, B:7:0x0018, B:50:0x00c8), top: B:61:0x0010, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: Exception -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x001d, blocks: (B:7:0x0018, B:50:0x00c8), top: B:61:0x0010, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8 A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:53:0x00e2, B:43:0x00af, B:47:0x00b4, B:54:0x00e8, B:7:0x0018, B:50:0x00c8), top: B:61:0x0010, outer: #0, inners: #1 }] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r0.i(r5, r10, r3, r16, false) == r6) goto L52;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m mVar;
        byte b14;
        m mVar2;
        byte b15;
        boolean zB;
        a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187172c;
        a aVar3 = this.f187174e;
        try {
            try {
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        try {
                            mVar = new m(this.f187173d);
                        } catch (Exception e4) {
                            a.C3482a c3482a = a.f187141k;
                            aVar3.f(e4, "processEphemerisRequest", "failed to parse 'GpsEphemerisDataRequestMessage'");
                            mVar = null;
                        }
                        x xVar = this.f187175f;
                        if (mVar == null) {
                            y yVar = y.LENGTH_ERROR;
                            this.f187172c = 1;
                            if (xVar.b(yVar, this) == aVar2) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (mVar.f187220a[0] == 0) {
                            String strValueOf = String.valueOf(mVar);
                            a.C3482a c3482a2 = a.f187141k;
                            aVar3.e("processEphemerisRequest", strValueOf);
                            b14 = 0;
                        } else {
                            a.C3482a c3482a3 = a.f187141k;
                            aVar3.g("processEphemerisRequest", "rStatus 'GPS_EPHEMERIS_DATA_FORMAT_NOT_SUPPORTED_ERROR'");
                            b14 = 1;
                        }
                        byte[] bArr = new n().f187221a;
                        byte b16 = bArr[0];
                        bArr[0] = b16;
                        bArr[0] = (byte) (b16 & (b14 | (-8)));
                        bArr[1] = (byte) (mVar.f187220a[0] == 0 ? 1 : 0);
                        bArr[2] = (byte) 300;
                        bArr[3] = (byte) 1;
                        y yVar2 = y.ACK;
                        this.f187170a = mVar;
                        this.f187171b = b14;
                        this.f187172c = 2;
                        if (xVar.a(yVar2, bArr, this) != aVar2) {
                            mVar2 = mVar;
                            b15 = b14;
                            if (b15 != 0) {
                                return Unit.INSTANCE;
                            }
                            mVar2.a();
                            mVar2.c();
                            mVar2.b();
                            zB = a.C3482a.b(a.f187141k);
                            aVar = this.f187174e;
                            if (zB) {
                                aVar.g("processEphemerisRequest", "rate limit in effect, sending timeout msg to device");
                                aVar3.k();
                            } else {
                                String strA = mVar2.a();
                                String strC = mVar2.c();
                                String strB = mVar2.b();
                                this.f187170a = null;
                                this.f187172c = 3;
                            }
                        }
                        return aVar2;
                    }
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    }
                    if (i14 == 2) {
                        b15 = this.f187171b;
                        mVar2 = this.f187170a;
                        o13.r.b(obj);
                        if (b15 != 0) {
                            return Unit.INSTANCE;
                        }
                        mVar2.a();
                        mVar2.c();
                        mVar2.b();
                        zB = a.C3482a.b(a.f187141k);
                        aVar = this.f187174e;
                        if (zB) {
                            String strA2 = mVar2.a();
                            String strC2 = mVar2.c();
                            String strB2 = mVar2.b();
                            this.f187170a = null;
                            this.f187172c = 3;
                        } else {
                            aVar.g("processEphemerisRequest", "rate limit in effect, sending timeout msg to device");
                            aVar3.k();
                        }
                    } else {
                        if (i14 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                } catch (Exception e14) {
                    a.C3482a c3482a4 = a.f187141k;
                    aVar3.f(e14, "processEphemerisRequest", "failed to send response");
                }
            } catch (Exception e15) {
                a.C3482a c3482a5 = a.f187141k;
                aVar3.f(e15, "processEphemerisRequest", "callback failed");
            }
        } catch (Exception e16) {
            a.C3482a c3482a6 = a.f187141k;
            aVar3.f(e16, "processEphemerisRequest", "callback failed");
        }
        return Unit.INSTANCE;
    }
}
