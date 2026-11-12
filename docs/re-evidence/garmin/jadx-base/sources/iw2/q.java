package iw2;

import android.content.Context;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$readCompositionFile$2", f = "RTSPhoneStorageCoordinator.kt", l = {168, 170}, m = "invokeSuspend", v = 1)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f95501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f95502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, long j8, int i14, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f95501b = context;
        this.f95502c = j8;
        this.f95503d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f95501b, this.f95502c, this.f95503d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95500a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return (String) obj;
        }
        o13.r.b(obj);
        w wVar = w.f95547a;
        this.f95500a = 1;
        wVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new k(this.f95501b, this.f95502c, this.f95503d, null), this);
        if (obj != aVar) {
        }
        return aVar;
        File file = (File) obj;
        if (!file.exists()) {
            return null;
        }
        w wVar2 = w.f95547a;
        this.f95500a = 2;
        obj = w.d(wVar2, file, this);
    }
}
