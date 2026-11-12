package z00;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import l22.b;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz00/a;", "", "Ll22/b;", "resource", "<init>", "(Ll22/b;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f200726a;

    public a(b bVar) {
        bVar.getClass();
        this.f200726a = bVar;
    }

    public final String a(int i14) {
        b bVar = this.f200726a;
        return i14 > 0 ? e.d(i14, StringUtils.SPACE, bVar.a(R.string.lbl_level_peripheral_oxygen_saturation, bVar.getString(R.string.lbl_average))) : e5.g(bVar.a(R.string.lbl_level_peripheral_oxygen_saturation, bVar.getString(R.string.lbl_average)), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data));
    }
}
