package nt1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pt1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnt1/a;", "Lg/a;", "Lpt1/p;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g.a<p, Unit> {
    @Override // g.a
    public final Intent a(Context context, p pVar) {
        p pVar2 = pVar;
        context.getClass();
        pVar2.getClass();
        ke2.b bVar = pVar2.f140933e;
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + (bVar != null ? Double.valueOf(bVar.f104551a) : null) + "," + (bVar != null ? Double.valueOf(bVar.f104552b) : null))), context.getString(R.string.lbl_driving_directions));
        intentCreateChooser.getClass();
        return intentCreateChooser;
    }

    @Override // g.a
    public final /* bridge */ /* synthetic */ Unit c(int i14, Intent intent) {
        return Unit.INSTANCE;
    }
}
