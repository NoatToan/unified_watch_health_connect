package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/t;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lxw1/d;", "", "athletePlanId", "Lxw1/c;", "trainingPlan", "Lfu1/i;", "athleteReaction", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLxw1/c;Lfu1/i;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends com.garmin.android.library.backgroundtaskmanagement.b<xw1.d> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fu1.i f45198l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/t$a", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f45200b;

        public a(b bVar) {
            this.f45200b = bVar;
        }

        @Override // iu1.j
        public final void c(String str) {
            xw1.d dVar = (xw1.d) new iu1.g().b(xw1.d.class, str);
            t tVar = t.this;
            if (dVar != null) {
                tVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, dVar);
            }
            cw.e.a(tVar, new xt1.j(tVar.f45198l, this.f45200b));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/t$b", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.j {
        @Override // iu1.j
        public final void c(String str) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j8, xw1.c cVar, fu1.i iVar, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        cVar.getClass();
        iVar.getClass();
        this.f45198l = iVar;
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new xw1.d(null, 0L, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null));
        cw.e.a(this, new xt1.l(j8, cVar, new a(new b())));
    }
}
