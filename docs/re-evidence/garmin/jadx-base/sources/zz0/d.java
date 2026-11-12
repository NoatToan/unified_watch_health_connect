package zz0;

import com.google.mlkit.common.MlKitException;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import q92.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.viewholder.NotificationActivityViewHolder$bindInboxNavigationAction$1$2", f = "NotificationActivityViewHolder.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f207591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f207592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uz0.g f207594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f207595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f207596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f207597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uz0.g gVar, String str, f fVar, String str2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f207594d = gVar;
        this.f207595e = str;
        this.f207596f = fVar;
        this.f207597g = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f207594d, this.f207595e, this.f207596f, this.f207597g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        long j8;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207593c;
        f fVar = this.f207596f;
        if (i14 == 0) {
            r.b(obj);
            uz0.g gVar = this.f207594d;
            long jLongValue = gVar.getFromUserId().longValue();
            String strValueOf = String.valueOf(gVar.getFromUserId().longValue());
            String str2 = this.f207595e;
            this.f207592b = str2;
            this.f207591a = jLongValue;
            this.f207593c = 1;
            int i15 = f.f207600m;
            fVar.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new e(strValueOf, null), this);
            if (obj == aVar) {
                return aVar;
            }
            str = str2;
            j8 = jLongValue;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j14 = this.f207591a;
            String str3 = this.f207592b;
            r.b(obj);
            j8 = j14;
            str = str3;
        }
        hl.a.b bVar = new hl.a.b(j8, str, (String) obj, null, 8, null);
        String str4 = this.f207597g;
        if (s.g(str4, "DI_CONNECT_LIVETRACK")) {
            fVar.f207601a.d6(bVar);
        } else if (s.g(str4, "DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
            fVar.f207601a.c1(bVar);
        } else if (s.g(str4, "DI_CONNECT_UPLOAD")) {
            fVar.f207601a.s2(bVar);
        } else if (s.g(str4, "DI_CONNECT_INSIGHTS")) {
            fVar.f207601a.z4(bVar, x.DI_CONNECT_INSIGHTS);
        } else if (s.g(str4, "DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
            fVar.f207601a.s2(bVar);
        } else {
            x xVar = x.DI_CONNECT_CIQ_PRIVACY;
            if (s.g(str4, xVar.f143819a)) {
                fVar.f207601a.h0(bVar, xVar);
            }
        }
        return Unit.INSTANCE;
    }
}
