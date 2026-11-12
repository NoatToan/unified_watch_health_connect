package bk2;

import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$ackMessage$2", f = "CIQMessageManager.kt", l = {}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, long j8, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f18526a = bVar;
        this.f18527b = j8;
        this.f18528c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f18526a, this.f18527b, this.f18528c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f18526a;
        ck2.a aVarInvoke = bVar.f18503b.invoke();
        long j8 = this.f18527b;
        String str = this.f18528c;
        aVarInvoke.c(j8, str);
        Logger logger = bVar.f18504c;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Message received and processed by device ", ".   Removing message ", str);
        sbK.append(" from cache.");
        logger.debug(sbK.toString());
        return bVar.f18509h.remove(new Long(j8));
    }
}
