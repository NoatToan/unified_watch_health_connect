package com.garmin.gfdi.file;

import e23.p;
import java.io.ByteArrayOutputStream;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;
import ws2.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Lws2/l;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.FileManager$detailedReadFile$2", f = "FileManager.kt", l = {303, 311}, m = "invokeSuspend")
public final class b extends i implements p<b0, t13.d<? super o13.p<? extends byte[], ? extends l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f52372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f52374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f52376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p<Integer, Integer, Unit> f52377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, int i14, boolean z14, p<? super Integer, ? super Integer, Unit> pVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f52374c = aVar;
        this.f52375d = i14;
        this.f52376e = z14;
        this.f52377f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f52374c, this.f52375d, this.f52376e, this.f52377f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends byte[], ? extends l>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws FileException {
        ByteArrayOutputStream byteArrayOutputStream;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52373b;
        a aVar2 = this.f52374c;
        try {
            if (i14 == 0) {
                r.b(obj);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                int i15 = this.f52375d;
                boolean z14 = this.f52376e;
                p<Integer, Integer, Unit> pVar = this.f52377f;
                this.f52372a = byteArrayOutputStream2;
                this.f52373b = 1;
                obj = aVar2.f52367h.b(0, new d(aVar2, i15, z14, pVar, byteArrayOutputStream2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                byteArrayOutputStream = byteArrayOutputStream2;
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byteArrayOutputStream = this.f52372a;
                r.b(obj);
            }
            return new o13.p(byteArrayOutputStream.toByteArray(), (l) obj);
        } catch (FileException e4) {
            Logger logger = aVar2.f52361b;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            FileException.a reason = e4.getReason();
            StringBuilder sb3 = new StringBuilder("Failed readFile(");
            boolean z15 = this.f52376e;
            sb3.append(z15);
            sb3.append("): ");
            sb3.append(reason);
            logger.error(sb3.toString(), (Throwable) e4);
            if (!z15 || e4.getReason() != FileException.a.CANCELLED_BY_DEVICE) {
                throw e4;
            }
            Logger logger2 = aVar2.f52361b;
            if (logger2 == null) {
                s.m("logger");
                throw null;
            }
            logger2.debug("Retry readFile as uncompressed");
            this.f52372a = null;
            this.f52373b = 2;
            Object objY = ge1.b.Y(new b(aVar2, this.f52375d, false, this.f52377f, null), this);
            if (objY != aVar) {
                return objY;
            }
        }
    }
}
