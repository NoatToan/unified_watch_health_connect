package iw2;

import android.content.Context;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/io/File;", "<anonymous>", "(Lo53/b0;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$getStringsFileByName$2", f = "RTSPhoneStorageCoordinator.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 1)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super File>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f95496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f95498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, long j8, String str, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f95496b = context;
        this.f95497c = j8;
        this.f95498d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f95496b, this.f95497c, this.f95498d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super File> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95495a;
        if (i14 == 0) {
            o13.r.b(obj);
            w wVar = w.f95547a;
            this.f95495a = 1;
            wVar.getClass();
            x53.c cVar = o53.s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new o(this.f95496b, this.f95497c, null), this);
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
        return new File((File) obj, tn.k.g(this.f95498d, ".txt"));
    }
}
