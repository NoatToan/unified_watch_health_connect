package fe2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultPeriodicUploadTask$endNow$2", f = "DefaultPeriodicUploadTask.kt", l = {71, 76}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f70765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f70767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e0 e0Var, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f70767c = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f70767c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (r13.d(r5, r12) == r0) goto L38;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.util.ArrayList] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        p005kotlin.jvm.internal.r0 r0Var;
        h0 h0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70766b;
        if (i14 != 0) {
            if (i14 == 1) {
                r0Var = this.f70765a;
                o13.r.b(obj);
                h0Var = this;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                h0Var = this;
            }
            wd2.m.h(h0Var.f70767c.f70712a, com.garmin.android.library.livetrack.i.a.f50228a);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        o53.c2 c2Var = this.f70767c.f70718g;
        if (c2Var != null && c2Var.isActive()) {
            o53.c2 c2Var2 = this.f70767c.f70718g;
            if (c2Var2 != null) {
                c2Var2.c(null);
            }
            r0Var = new p005kotlin.jvm.internal.r0();
            e0 e0Var = this.f70767c;
            LinkedList linkedList = e0Var.f70720i;
            if (linkedList == null) {
                p005kotlin.jvm.internal.s.m("buffer");
                throw null;
            }
            synchronized (linkedList) {
                try {
                    LinkedList linkedList2 = e0Var.f70720i;
                    try {
                        if (linkedList2 == null) {
                            p005kotlin.jvm.internal.s.m("buffer");
                            throw null;
                        }
                        r0Var.f105810a = new ArrayList(linkedList2);
                        LinkedList linkedList3 = e0Var.f70720i;
                        if (linkedList3 == null) {
                            p005kotlin.jvm.internal.s.m("buffer");
                            throw null;
                        }
                        linkedList3.clear();
                        Unit unit = Unit.INSTANCE;
                        com.airbnb.lottie.animation.keyframe.a.r("Ending task, attempting to upload ", ((List) r0Var.f105810a).size(), " points left in buffer", this.f70767c.f70719h);
                        boolean zIsEmpty = ((Collection) r0Var.f105810a).isEmpty();
                        e0 e0Var2 = this.f70767c;
                        if (!zIsEmpty) {
                            xd2.a1 a1Var = e0Var2.f70714c;
                            ae2.e0 e0Var3 = e0Var2.f70713b;
                            long j8 = e0Var2.f70712a;
                            List list = (List) r0Var.f105810a;
                            this.f70765a = r0Var;
                            this.f70766b = 1;
                            h0Var = this;
                            obj = a1Var.x(e0Var3, j8, list, h0Var);
                            if (obj != aVar) {
                            }
                            return aVar;
                        }
                        e0Var2.f70719h.debug("No points left in buffer to upload, task ended");
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                throw th;
            }
        }
        this.f70767c.f70719h.error("Not running, cannot cancel");
        return Unit.INSTANCE;
        xd2.g1 g1Var = (xd2.g1) obj;
        if (g1Var instanceof xd2.g1.b) {
            com.airbnb.lottie.animation.keyframe.a.r("Successfully uploaded remaining ", ((List) r0Var.f105810a).size(), " points, cleared buffer, task ended", h0Var.f70767c.f70719h);
        } else {
            boolean z14 = g1Var instanceof xd2.g1.a.e;
            e0 e0Var4 = h0Var.f70767c;
            if (z14) {
                xd2.a1 a1Var2 = e0Var4.f70714c;
                long j14 = e0Var4.f70712a;
                h0Var.f70765a = null;
                h0Var.f70766b = 2;
            } else if (g1Var instanceof xd2.g1.a.b) {
                wd2.m.g(e0Var4.f70715d.getF104144a().f(), null);
            } else {
                e0Var4.f70719h.error("Failed to upload remaining " + ((List) r0Var.f105810a).size() + " points, cleared buffer, task ended");
            }
        }
        return Unit.INSTANCE;
    }
}
