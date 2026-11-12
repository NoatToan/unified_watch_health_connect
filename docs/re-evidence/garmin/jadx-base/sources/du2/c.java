package du2;

import e23.p;
import java.io.ByteArrayOutputStream;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.gdi.WeatherDataHandler$onWeatherRequestReceived$1", f = "WeatherDataHandler.kt", l = {128, 137}, m = "invokeSuspend")
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f61278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f61280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f61281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f61282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(byte[] bArr, a aVar, x xVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f61280c = bArr;
        this.f61281d = aVar;
        this.f61282e = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f61280c, this.f61281d, this.f61282e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:33:0x006f, B:35:0x0073, B:38:0x0081, B:39:0x0086), top: B:57:0x006f, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:33:0x006f, B:35:0x0073, B:38:0x0081, B:39:0x0086), top: B:57:0x006f, outer: #1 }] */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r1.b(r10, r9) == r0) goto L47;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        j jVar2;
        rs2.c cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61279b;
        int i15 = 2;
        a aVar2 = this.f61281d;
        try {
            if (i14 == 0) {
                r.b(obj);
                try {
                    jVar = new j(this.f61280c);
                } catch (Exception e4) {
                    Logger logger = aVar2.f61270d;
                    if (logger == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger.error("onWeatherRequestReceived", (Throwable) e4);
                    jVar = null;
                }
                x xVar = this.f61282e;
                if (jVar != null) {
                    if (jVar.f61316d <= 0) {
                        i15 = 1;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
                    byteArrayOutputStream.write(128);
                    byteArrayOutputStream.write((byte) i15);
                    lg.d.P(byteArrayOutputStream, 300);
                    y yVar = y.ACK;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    this.f61278a = jVar;
                    this.f61279b = 1;
                    if (xVar.a(yVar, byteArray, this) != aVar) {
                        jVar2 = jVar;
                        cVar = aVar2.f61272f;
                        if (cVar != null) {
                            s.m("deviceInfo");
                            throw null;
                        }
                        ge1.b.T(aVar2.f61269c, null, null, new b(aVar2, cVar, jVar2, null), 3);
                    }
                } else {
                    y yVar2 = y.LENGTH_ERROR;
                    this.f61279b = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                jVar2 = this.f61278a;
                r.b(obj);
                try {
                    cVar = aVar2.f61272f;
                    if (cVar != null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    ge1.b.T(aVar2.f61269c, null, null, new b(aVar2, cVar, jVar2, null), 3);
                } catch (Exception e14) {
                    Logger logger2 = aVar2.f61270d;
                    if (logger2 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger2.error("onWeatherRequestMessage callback failed", (Throwable) e14);
                }
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e15) {
            Logger logger3 = aVar2.f61270d;
            if (logger3 == null) {
                s.m("logger");
                throw null;
            }
            logger3.error("failed to respond to WeatherRequestMessage", (Throwable) e15);
        }
        return Unit.INSTANCE;
    }
}
