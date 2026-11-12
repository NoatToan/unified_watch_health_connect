package rc;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.maps.android.BuildConfig;
import lc.q0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrc/o;", "Llc/q0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends q0<String> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f151858s = new o();

    private o() {
        super(false);
    }

    @Override // lc.q0
    public final String a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return null;
    }

    @Override // lc.q0
    public final String b() {
        return PrivacyUpdateRequestError.UNKNOWN;
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final String h(String str) {
        str.getClass();
        return BuildConfig.TRAVIS;
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, String str2) {
        str.getClass();
        str2.getClass();
    }
}
