package zv0;

import com.garmin.android.apps.connectmobile.k1;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzv0/e;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f207174a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f207175b = x.k("TW", "JP", "CL", "CN", "MY");

    private e() {
    }

    public static String a() {
        if (f207175b.contains(Locale.getDefault().getCountry())) {
            return null;
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        return !k1.f37122a.h() ? "https://www.garmin.com/c/wearables-smartwatches/?FILTER_FEATURE_HRVSTATUS=true#shopwearables" : "https://www.garmin.com/c/wearables-smartwatches/";
    }
}
