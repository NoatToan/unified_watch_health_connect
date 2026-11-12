package mh1;

import java.util.ArrayList;
import java.util.Iterator;
import o53.b0;
import o53.s0;
import o53.t1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.InvitationNotificationHelper$getDeviceID$1", f = "InvitationNotificationHelper.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f118492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f118493c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.InvitationNotificationHelper$getDeviceID$1$2", f = "InvitationNotificationHelper.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f118494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<sd2.f> f118495b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, r0<sd2.f> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f118494a = oVar;
            this.f118495b = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f118494a, this.f118495b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            o.a aVar2 = this.f118494a.f118487a;
            r0<sd2.f> r0Var = this.f118495b;
            sd2.f fVar = r0Var.f105810a;
            Long l14 = fVar != null ? new Long(fVar.getUnitID()) : null;
            sd2.f fVar2 = r0Var.f105810a;
            aVar2.a(l14, fVar2 != null ? fVar2.getProductDisplayName() : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, String str, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f118492b = oVar;
        this.f118493c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f118492b, this.f118493c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, sd2.f] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118491a;
        if (i14 == 0) {
            o13.r.b(obj);
            o oVar = this.f118492b;
            ArrayList arrayList = new ArrayList(oVar.f118490d.k());
            r0 r0Var = new r0();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ?? r14 = ((gc0.e) it.next()).f76845a;
                Logger logger = oVar.f118489c;
                String partNumber = r14.getPartNumber();
                StringBuilder sb3 = new StringBuilder("Obtained db devices : ");
                sb3.append(partNumber);
                sb3.append(" and push notification part number: ");
                String str = this.f118493c;
                sb3.append(str);
                logger.debug(sb3.toString());
                if (p005kotlin.jvm.internal.s.g(r14.getPartNumber(), str)) {
                    r0Var.f105810a = r14;
                }
            }
            x53.c cVar = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(oVar, r0Var, null);
            this.f118491a = 1;
            if (ge1.b.e0(t1Var, aVar2, this) == aVar) {
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
