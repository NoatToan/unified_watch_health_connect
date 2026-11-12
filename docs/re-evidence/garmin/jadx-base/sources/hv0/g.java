package hv0;

import android.content.Context;
import android.os.Bundle;
import c.q;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e23.l;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f85817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f85818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f85819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f85820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gv0.d f85821f;

    public /* synthetic */ g(e23.a aVar, e23.a aVar2, q qVar, Context context, gv0.d dVar, int i14) {
        this.f85816a = i14;
        this.f85817b = aVar;
        this.f85818c = aVar2;
        this.f85819d = qVar;
        this.f85820e = context;
        this.f85821f = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        i3 i3Var = (i3) obj;
        switch (this.f85816a) {
            case 0:
                i3Var.getClass();
                final int i14 = 0;
                final q qVar = this.f85819d;
                final Context context = this.f85820e;
                final gv0.d dVar = this.f85821f;
                gl1.d.D(i3Var, new e23.a() { // from class: hv0.h
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                Bundle bundle = new Bundle();
                                gv0.d dVar2 = dVar;
                                bundle.putBoolean("GCM_extra_key_include_strava_help", dVar2.c5());
                                bundle.putBoolean("GCM_extra_key_include_course_sharing_help", dVar2.a5());
                                bundle.putBoolean("GCM_extra_key_include_spec_msg_help", dVar2.b5());
                                bundle.putBoolean("GCM_extra_key_include_premium_help", dVar2.d5());
                                bundle.putBoolean("GCM_extra_key_include_has_subscription", dVar2.K4());
                                bundle.putBoolean("GCM_extra_key_child_restrictions", dVar2.J0);
                                bundle.putString("GCM_extra_key_delete_profile_url", dVar2.I4());
                                qVar.a(HelpActivity.a.b(HelpActivity.f36653a, context, ro0.l.LIVETRACK, bundle, 4), null);
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                gv0.d dVar3 = dVar;
                                bundle2.putBoolean("GCM_extra_key_include_strava_help", dVar3.c5());
                                bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", dVar3.a5());
                                bundle2.putBoolean("GCM_extra_key_include_spec_msg_help", dVar3.b5());
                                bundle2.putBoolean("GCM_extra_key_include_premium_help", dVar3.d5());
                                bundle2.putBoolean("GCM_extra_key_include_has_subscription", dVar3.K4());
                                bundle2.putBoolean("GCM_extra_key_child_restrictions", dVar3.J0);
                                bundle2.putString("GCM_extra_key_delete_profile_url", dVar3.I4());
                                qVar.a(HelpActivity.a.b(HelpActivity.f36653a, context, ro0.l.LIVETRACK, bundle2, 4), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, this.f85817b, this.f85818c);
                break;
            default:
                i3Var.getClass();
                final int i15 = 1;
                final q qVar2 = this.f85819d;
                final Context context2 = this.f85820e;
                final gv0.d dVar2 = this.f85821f;
                gl1.d.D(i3Var, new e23.a() { // from class: hv0.h
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                Bundle bundle = new Bundle();
                                gv0.d dVar3 = dVar2;
                                bundle.putBoolean("GCM_extra_key_include_strava_help", dVar3.c5());
                                bundle.putBoolean("GCM_extra_key_include_course_sharing_help", dVar3.a5());
                                bundle.putBoolean("GCM_extra_key_include_spec_msg_help", dVar3.b5());
                                bundle.putBoolean("GCM_extra_key_include_premium_help", dVar3.d5());
                                bundle.putBoolean("GCM_extra_key_include_has_subscription", dVar3.K4());
                                bundle.putBoolean("GCM_extra_key_child_restrictions", dVar3.J0);
                                bundle.putString("GCM_extra_key_delete_profile_url", dVar3.I4());
                                qVar2.a(HelpActivity.a.b(HelpActivity.f36653a, context2, ro0.l.LIVETRACK, bundle, 4), null);
                                break;
                            default:
                                Bundle bundle2 = new Bundle();
                                gv0.d dVar4 = dVar2;
                                bundle2.putBoolean("GCM_extra_key_include_strava_help", dVar4.c5());
                                bundle2.putBoolean("GCM_extra_key_include_course_sharing_help", dVar4.a5());
                                bundle2.putBoolean("GCM_extra_key_include_spec_msg_help", dVar4.b5());
                                bundle2.putBoolean("GCM_extra_key_include_premium_help", dVar4.d5());
                                bundle2.putBoolean("GCM_extra_key_include_has_subscription", dVar4.K4());
                                bundle2.putBoolean("GCM_extra_key_child_restrictions", dVar4.J0);
                                bundle2.putString("GCM_extra_key_delete_profile_url", dVar4.I4());
                                qVar2.a(HelpActivity.a.b(HelpActivity.f36653a, context2, ro0.l.LIVETRACK, bundle2, 4), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, this.f85817b, this.f85818c);
                break;
        }
        return Unit.INSTANCE;
    }
}
