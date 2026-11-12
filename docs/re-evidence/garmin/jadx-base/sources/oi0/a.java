package oi0;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loi0/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f132236a;

    public a(l22.b bVar) {
        bVar.getClass();
        this.f132236a = bVar;
    }

    public static String a(a aVar, Integer num) {
        l22.b bVar = aVar.f132236a;
        if (num == null) {
            return bVar.getString(R.string.txt_empty_page_no_data);
        }
        if (num.intValue() > 1) {
            String str = NumberFormat.getInstance().format(num);
            str.getClass();
            return bVar.a(R.string.mct_next_phase_days, str);
        }
        if (num.intValue() == 1) {
            return bVar.getString(R.string.mct_next_phase_day);
        }
        return num.intValue() == 0 ? bVar.getString(R.string.txt_empty_page_no_data) : "";
    }

    public final String b(int i14, int i15) {
        l22.b bVar = this.f132236a;
        if (i14 == 0) {
            return i15 == 1 ? bVar.getString(R.string.mct_next_phase_day) : bVar.a(R.string.mct_next_phase_days, Integer.valueOf(i15));
        }
        return e5.g(i14 == 1 ? bVar.getString(R.string.common_week_label) : bVar.a(R.string.lbl_plural_more_than_one_week, Integer.valueOf(i14)), StringUtils.SPACE, i15 == 1 ? bVar.getString(R.string.mct_next_phase_day) : bVar.a(R.string.mct_next_phase_days, Integer.valueOf(i15)));
    }
}
