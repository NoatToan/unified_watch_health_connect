package aq2;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import fo2.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq2/e;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12470a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f12471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f12472c;

    static {
        int i14 = gt2.c.f79010a;
        f12471b = gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayErrorResponseUtil");
        f12472c = u.m0(new String[]{"expMonth", "expYear"});
    }

    private e() {
    }

    public static ArrayList a(String str) {
        List<r.c> listB;
        f12471b.debug("getMissingFields");
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            r rVar = (r) GsonUtil.f47253b.fromJson(str, r.class);
            if (rVar.getErrors() != null && (listB = rVar.getErrors().b()) != null) {
                for (r.c cVar : listB) {
                    if (s.g(cVar.getFlag(), "MISSING_DATA")) {
                        List<String> listB2 = cVar.b();
                        boolean zContainsAll = listB2 != null ? listB2.containsAll(f12472c) : false;
                        if (zContainsAll) {
                            arrayList.add("MISSING_EXPIRY_DATE");
                        }
                        List<String> listB3 = cVar.b();
                        if (listB3 != null) {
                            for (String str2 : listB3) {
                                if (s.g(str2, "expYear") && !zContainsAll) {
                                    arrayList.add("MISSING_EXPIRY_YEAR");
                                } else if (s.g(str2, "expMonth") && !zContainsAll) {
                                    arrayList.add("MISSING_EXPIRY_MONTH");
                                } else if (s.g(str2, "cvv")) {
                                    arrayList.add("MISSING_SECURITY_CODE");
                                } else if (s.g(str2, "name")) {
                                    arrayList.add("MISSING_CARDHOLDER_NAME");
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
