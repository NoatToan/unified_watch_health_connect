package mn1;

import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmn1/c;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f119769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u00.a f119770b;

    public c(l22.b bVar) {
        bVar.getClass();
        this.f119769a = bVar;
        this.f119770b = new u00.a(bVar);
    }

    public final String a(int i14) {
        u00.a aVar = this.f119770b;
        String strC = aVar.c(i14);
        if (strC.length() != 0) {
            return strC;
        }
        String strG = aVar.g();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = strG.toLowerCase(locale);
        lowerCase.getClass();
        return "0".concat(lowerCase);
    }

    public final String b(Integer num) {
        return e.d(num != null ? num.intValue() : 0, StringUtils.SPACE, this.f119769a.getString(R.string.lbl_restless_moments));
    }
}
