package cv0;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e23.l;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f55840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv0.d f55841c;

    public /* synthetic */ b(Context context, gv0.d dVar, int i14) {
        this.f55839a = i14;
        this.f55840b = context;
        this.f55841c = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        i3 i3Var = (i3) obj;
        switch (this.f55839a) {
            case 0:
                i3Var.getClass();
                Bundle bundle = new Bundle();
                gv0.d dVar = this.f55841c;
                bundle.putBoolean("GCM_extra_key_include_has_subscription", dVar.K4());
                bundle.putString("GCM_extra_key_delete_profile_url", dVar.I4());
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.LIVETRACK;
                aVar.getClass();
                HelpActivity.a.d(this.f55840b, lVar, "PROFILE_AND_PRIVACY", bundle);
                break;
            default:
                i3Var.getClass();
                Bundle bundle2 = new Bundle();
                gv0.d dVar2 = this.f55841c;
                bundle2.putBoolean("GCM_extra_key_include_has_subscription", dVar2.K4());
                bundle2.putString("GCM_extra_key_delete_profile_url", dVar2.I4());
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                ro0.l lVar2 = ro0.l.LIVETRACK;
                aVar2.getClass();
                HelpActivity.a.d(this.f55840b, lVar2, "PROFILE_AND_PRIVACY", bundle2);
                break;
        }
        return Unit.INSTANCE;
    }
}
