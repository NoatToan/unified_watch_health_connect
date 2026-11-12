package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AbtExperimentInfo {

    @VisibleForTesting
    public static final String g = "experimentId";

    @VisibleForTesting
    public static final String h = "variantId";

    @VisibleForTesting
    public static final String i = "triggerEvent";
    private final String a;
    private final String b;
    private final String c;
    private final Date d;
    private final long e;
    private final long f;

    @VisibleForTesting
    public static final String j = "experimentStartTime";

    @VisibleForTesting
    public static final String l = "timeToLiveMillis";

    @VisibleForTesting
    public static final String k = "triggerTimeoutMillis";
    private static final String[] m = {"experimentId", j, l, k, "variantId"};

    @VisibleForTesting
    public static final DateFormat n = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j2, long j3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j2;
        this.f = j3;
    }

    public static AbtExperimentInfo a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.triggerEventName;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.name, String.valueOf(conditionalUserProperty.value), str, new Date(conditionalUserProperty.creationTimestamp), conditionalUserProperty.triggerTimeout, conditionalUserProperty.timeToLive);
    }

    public static AbtExperimentInfo b(Map<String, String> map) throws AbtException {
        l(map);
        try {
            return new AbtExperimentInfo(map.get("experimentId"), map.get("variantId"), map.containsKey(i) ? map.get(i) : "", n.parse(map.get(j)), Long.parseLong(map.get(k)), Long.parseLong(map.get(l)));
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    public static void k(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        l(abtExperimentInfo.j());
    }

    private static void l(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.d.getTime();
    }

    public long e() {
        return this.f;
    }

    public String f() {
        return this.c;
    }

    public long g() {
        return this.e;
    }

    public String h() {
        return this.b;
    }

    public AnalyticsConnector.ConditionalUserProperty i(String str) {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = str;
        conditionalUserProperty.creationTimestamp = d();
        conditionalUserProperty.name = this.a;
        conditionalUserProperty.value = this.b;
        conditionalUserProperty.triggerEventName = TextUtils.isEmpty(this.c) ? null : this.c;
        conditionalUserProperty.triggerTimeout = this.e;
        conditionalUserProperty.timeToLive = this.f;
        return conditionalUserProperty;
    }

    @VisibleForTesting
    public Map<String, String> j() {
        HashMap map = new HashMap();
        map.put("experimentId", this.a);
        map.put("variantId", this.b);
        map.put(i, this.c);
        map.put(j, n.format(this.d));
        map.put(k, Long.toString(this.e));
        map.put(l, Long.toString(this.f));
        return map;
    }
}
