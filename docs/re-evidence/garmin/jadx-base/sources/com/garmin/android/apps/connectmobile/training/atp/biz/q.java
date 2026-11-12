package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/q;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "", "athletePlanId", "Lfu1/i;", "athleteReaction", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLfu1/i;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends com.garmin.android.library.backgroundtaskmanagement.b<Object> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fu1.i f45193l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/q$a", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f45195b;

        public a(b bVar) {
            this.f45195b = bVar;
        }

        @Override // iu1.j
        public final void c(String str) {
            q qVar = q.this;
            cw.e.a(qVar, new xt1.j(qVar.f45193l, this.f45195b));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/q$b", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.j {
        @Override // iu1.j
        public final void c(String str) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j8, fu1.i iVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        iVar.getClass();
        this.f45193l = iVar;
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new Object());
        cw.e.a(this, new xt1.h(j8, new a(new b())));
    }

    public /* synthetic */ q(long j8, fu1.i iVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, iVar, aVar);
    }
}
