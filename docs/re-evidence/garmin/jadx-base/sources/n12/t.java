package n12;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Ln12/t;", "Lg/a;", "", "Landroid/net/Uri;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends g.a<Unit, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122307a;

    public t(com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar) {
        this.f122307a = aVar;
    }

    @Override // g.a
    public final Intent a(Context context, Unit unit) {
        context.getClass();
        unit.getClass();
        Intent intentCreateChooser = Intent.createChooser(this.f122307a.f46649g.v(), "");
        intentCreateChooser.getClass();
        return intentCreateChooser;
    }

    @Override // g.a
    public final Uri c(int i14, Intent intent) {
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
