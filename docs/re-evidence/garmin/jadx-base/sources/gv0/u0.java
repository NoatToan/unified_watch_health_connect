package gv0;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f79395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f79396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q f79397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f79398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f79399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f79400g;

    public /* synthetic */ u0(e23.a aVar, e23.a aVar2, c.q qVar, Context context, boolean z14, d dVar, int i14) {
        this.f79394a = i14;
        this.f79395b = aVar;
        this.f79396c = aVar2;
        this.f79397d = qVar;
        this.f79398e = context;
        this.f79399f = z14;
        this.f79400g = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        i3 i3Var = (i3) obj;
        switch (this.f79394a) {
            case 0:
                i3Var.getClass();
                final int i14 = 0;
                final c.q qVar = this.f79397d;
                final Context context = this.f79398e;
                final boolean z14 = this.f79399f;
                final d dVar = this.f79400g;
                gl1.d.D(i3Var, new e23.a() { // from class: gv0.v0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                Bundle bundle = new Bundle();
                                if (z14) {
                                    bundle.putBoolean("GCM_extra_key_child_restrictions", true);
                                    bundle.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                } else {
                                    d dVar2 = dVar;
                                    bundle.putBoolean("GCM_extra_key_include_strava_help", dVar2.c5());
                                    bundle.putBoolean("GCM_extra_key_include_course_sharing_help", dVar2.a5());
                                    bundle.putBoolean("GCM_extra_key_include_spec_msg_help", dVar2.b5());
                                    bundle.putBoolean("GCM_extra_key_include_premium_help", dVar2.d5());
                                    bundle.putBoolean("GCM_extra_key_include_has_subscription", dVar2.K4());
                                    bundle.putBoolean("GCM_extra_key_child_restrictions", dVar2.J0);
                                    bundle.putString("GCM_extra_key_delete_profile_url", dVar2.I4());
                                    bundle.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                }
                                qVar.a(HelpActivity.a.b(HelpActivity.f36653a, context, ro0.l.LIVETRACK, bundle, 4), null);
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                if (z14) {
                                    bundle2.putBoolean("GCM_extra_key_child_restrictions", true);
                                    bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                } else {
                                    d dVar3 = dVar;
                                    bundle2.putBoolean("GCM_extra_key_include_strava_help", dVar3.c5());
                                    bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", dVar3.a5());
                                    bundle2.putBoolean("GCM_extra_key_include_spec_msg_help", dVar3.b5());
                                    bundle2.putBoolean("GCM_extra_key_include_premium_help", dVar3.d5());
                                    bundle2.putBoolean("GCM_extra_key_include_has_subscription", dVar3.K4());
                                    bundle2.putBoolean("GCM_extra_key_child_restrictions", dVar3.J0);
                                    bundle2.putString("GCM_extra_key_delete_profile_url", dVar3.I4());
                                    bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                }
                                qVar.a(HelpActivity.a.b(HelpActivity.f36653a, context, ro0.l.LIVETRACK, bundle2, 4), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, this.f79395b, this.f79396c);
                break;
            default:
                i3Var.getClass();
                final int i15 = 1;
                final c.q qVar2 = this.f79397d;
                final Context context2 = this.f79398e;
                final boolean z15 = this.f79399f;
                final d dVar2 = this.f79400g;
                gl1.d.D(i3Var, new e23.a() { // from class: gv0.v0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                Bundle bundle = new Bundle();
                                if (z15) {
                                    bundle.putBoolean("GCM_extra_key_child_restrictions", true);
                                    bundle.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                } else {
                                    d dVar3 = dVar2;
                                    bundle.putBoolean("GCM_extra_key_include_strava_help", dVar3.c5());
                                    bundle.putBoolean("GCM_extra_key_include_course_sharing_help", dVar3.a5());
                                    bundle.putBoolean("GCM_extra_key_include_spec_msg_help", dVar3.b5());
                                    bundle.putBoolean("GCM_extra_key_include_premium_help", dVar3.d5());
                                    bundle.putBoolean("GCM_extra_key_include_has_subscription", dVar3.K4());
                                    bundle.putBoolean("GCM_extra_key_child_restrictions", dVar3.J0);
                                    bundle.putString("GCM_extra_key_delete_profile_url", dVar3.I4());
                                    bundle.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                }
                                qVar2.a(HelpActivity.a.b(HelpActivity.f36653a, context2, ro0.l.LIVETRACK, bundle, 4), null);
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                if (z15) {
                                    bundle2.putBoolean("GCM_extra_key_child_restrictions", true);
                                    bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                } else {
                                    d dVar4 = dVar2;
                                    bundle2.putBoolean("GCM_extra_key_include_strava_help", dVar4.c5());
                                    bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", dVar4.a5());
                                    bundle2.putBoolean("GCM_extra_key_include_spec_msg_help", dVar4.b5());
                                    bundle2.putBoolean("GCM_extra_key_include_premium_help", dVar4.d5());
                                    bundle2.putBoolean("GCM_extra_key_include_has_subscription", dVar4.K4());
                                    bundle2.putBoolean("GCM_extra_key_child_restrictions", dVar4.J0);
                                    bundle2.putString("GCM_extra_key_delete_profile_url", dVar4.I4());
                                    bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                                }
                                qVar2.a(HelpActivity.a.b(HelpActivity.f36653a, context2, ro0.l.LIVETRACK, bundle2, 4), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, this.f79395b, this.f79396c);
                break;
        }
        return Unit.INSTANCE;
    }
}
