package y00;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import j20.x;
import l22.b;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly00/a;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f192984a;

    public a(b bVar) {
        bVar.getClass();
        this.f192984a = bVar;
    }

    public final String a() {
        b bVar = this.f192984a;
        return x.d(bVar.getString(R.string.lbl_7_days), StringUtils.SPACE, bVar.getString(R.string.lbl_average), StringUtils.SPACE, bVar.getString(R.string.lbl_heart_rate_variability));
    }

    public final String b() {
        b bVar = this.f192984a;
        return e5.g(bVar.getString(R.string.lbl_average), StringUtils.SPACE, bVar.getString(R.string.lbl_overnight_heart_rate_variability));
    }
}
