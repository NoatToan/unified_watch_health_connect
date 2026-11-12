package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/i;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lxw1/h;", "", "workoutPlanId", "", "language", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLjava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends com.garmin.android.library.backgroundtaskmanagement.b<xw1.h> {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/i$a", "Liu1/j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.j {
        public a() {
        }

        @Override // iu1.j
        public final void c(String str) {
            xw1.g gVarA = new h.a(str).a();
            if (gVarA != null) {
                xw1.h hVar = (xw1.h) i.this.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
                if (hVar != null) {
                    hVar.M(gVarA.getFirstName());
                    hVar.Z(gVarA.getLastName());
                    hVar.a0(gVarA.getTagLine());
                    hVar.c0(gVarA.getXhdpiUrl());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/i$b", "Liu1/k;", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.k<xw1.h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f45170b;

        public b(a aVar) {
            this.f45170b = aVar;
        }

        @Override // iu1.k
        public final void onSuccess(xw1.h hVar) {
            xw1.i contentfulModel;
            xw1.h hVar2 = hVar;
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            i iVar = i.this;
            iVar.i(eVar, hVar2);
            xw1.f coach = hVar2.getCoach();
            String contentfulContentId = (coach == null || (contentfulModel = coach.getContentfulModel()) == null) ? null : contentfulModel.getContentfulContentId();
            if (contentfulContentId != null) {
                fy1.i.f73924a.getClass();
                cw.e.a(iVar, new xt1.c(new fu1.k("coaches", new fu1.c(contentfulContentId, fy1.i.a.e()).a(), null, 4, null), this.f45170b));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j8, String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new xw1.h(null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, false, null, null, null, Long.valueOf(j8), 262143, null));
        cw.e.a(this, new xt1.b(j8, str, new b(new a())));
    }
}
