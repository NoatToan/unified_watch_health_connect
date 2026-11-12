package jx2;

import android.os.SystemClock;
import com.garmin.samd.exception.FileTransferNotReadyException;
import com.garmin.samd.exception.GHSServerNotAvailableException;
import com.garmin.samd.exception.InvalidOAuth2DIBearerTokenException;
import com.garmin.samd.exception.UserDoesNotConsentToUploadException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDFileTransferManager$precheck$2", f = "SaMDFileTransferManager.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f101654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f101655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f101656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f101657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f101658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f101659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f101660g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar, boolean z14, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f101659f = sVar;
        this.f101660g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f101659f, this.f101660g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws FileTransferNotReadyException {
        r0 r0Var;
        s sVar;
        boolean z14;
        T t7;
        r0 r0Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101658e;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    s.b bVar = this.f101659f.f101621f;
                    s.b bVar2 = s.b.IDLE;
                    s sVar2 = this.f101659f;
                    if (bVar != bVar2) {
                        sVar2.f(null, "precheck: not ready, current state " + sVar2.f101621f.name());
                        throw new FileTransferNotReadyException(this.f101659f.f101621f.name());
                    }
                    s.b bVar3 = s.b.PRECHECK;
                    sVar2.getClass();
                    bVar3.getClass();
                    sVar2.f101621f = bVar3;
                    this.f101659f.d().debug("precheck");
                    r0 r0Var3 = new r0();
                    gx2.a aVarH = this.f101659f.h("precheck");
                    s sVar3 = this.f101659f;
                    boolean z15 = this.f101660g;
                    sVar3.getClass();
                    if (!s.k(aVarH)) {
                        throw new GHSServerNotAvailableException(aVarH.j());
                    }
                    if (!aVarH.b()) {
                        throw new UserDoesNotConsentToUploadException("", "precheck");
                    }
                    this.f101654a = r0Var3;
                    this.f101655b = sVar3;
                    this.f101656c = r0Var3;
                    this.f101657d = z15;
                    this.f101658e = 1;
                    String strG = aVarH.g();
                    if (strG == aVar) {
                        return aVar;
                    }
                    r0Var = r0Var3;
                    sVar = sVar3;
                    z14 = z15;
                    t7 = strG;
                    r0Var2 = r0Var;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z14 = this.f101657d;
                    r0Var2 = this.f101656c;
                    sVar = this.f101655b;
                    r0Var = this.f101654a;
                    o13.r.b(obj);
                    t7 = obj;
                }
                r0Var2.f105810a = t7;
                CharSequence charSequence = (CharSequence) r0Var.f105810a;
                if (charSequence == null || d53.w.J(charSequence)) {
                    throw new InvalidOAuth2DIBearerTokenException();
                }
                if (z14) {
                    sVar.f101618c = SystemClock.elapsedRealtime();
                }
                T t14 = r0Var.f105810a;
                t14.getClass();
                String str = (String) t14;
                s sVar4 = this.f101659f;
                s.b bVar4 = s.b.IDLE;
                sVar4.getClass();
                bVar4.getClass();
                sVar4.f101621f = bVar4;
                return str;
            } catch (Exception e4) {
                this.f101659f.f101618c = 0L;
                throw e4;
            }
        } catch (Throwable th3) {
            s sVar5 = this.f101659f;
            s.b bVar5 = s.b.IDLE;
            sVar5.getClass();
            bVar5.getClass();
            sVar5.f101621f = bVar5;
            throw th3;
        }
    }
}
