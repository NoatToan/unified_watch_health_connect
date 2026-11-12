package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/s3;", "Lfb2/m;", "Lvk1/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s3 extends fb2.m<vk1.f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xg1.b f27454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(Context context) {
        super(context);
        context.getClass();
        this.f27454f = new xg1.b(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((vk1.f) obj).getClass();
        return true;
    }

    @Override // fb2.m, fb2.e
    public final boolean k(Object obj) {
        vk1.f fVar = (vk1.f) obj;
        fVar.getClass();
        int i14 = fVar.f178615e - 1;
        xg1.b bVar = this.f27454f;
        bVar.getClass();
        bVar.f190878d = Math.min(i14, 250);
        fb2.b0 b0Var = this.f70345c;
        if (b0Var != null) {
            fb2.n nVar = (fb2.n) b0Var;
            int i15 = fVar.f178613c;
            Integer numValueOf = Integer.valueOf(i15);
            String strValueOf = bVar.f190876b;
            if (i15 >= bVar.f190877c && i15 <= bVar.f190878d) {
                strValueOf = String.valueOf(numValueOf);
            }
            String string = bVar.f190875a.getString(R.string.lbl_heart_rate_zone_bpm, strValueOf);
            int i16 = (i15 < bVar.f190877c || i15 > bVar.f190878d) ? R.color.gcm_text_danger_action : R.color.gcm_text_secondary;
            fb2.n.a aVar = nVar.f70366b;
            aVar.a(string, null);
            aVar.b(i16);
        }
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF180422f() {
        return View.generateViewId();
    }

    @Override // fb2.m
    public final String u() {
        String strB = b(R.string.hr_zones_lbl_resting_heart_rate);
        strB.getClass();
        return strB;
    }
}
