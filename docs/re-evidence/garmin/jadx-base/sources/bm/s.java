package bm;

import android.text.TextUtils;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class s extends q.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f18866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar) {
        super();
        this.f18866b = qVar;
    }

    @Override // bm.q.d, gz.f
    public final String b(float f14) {
        int i14 = q.D;
        q qVar = this.f18866b;
        String strK = new l3(qVar.f134441a).k(f14, true);
        return TextUtils.isEmpty(strK) ? qVar.f134441a.getString(R.string.no_value) : strK;
    }
}
