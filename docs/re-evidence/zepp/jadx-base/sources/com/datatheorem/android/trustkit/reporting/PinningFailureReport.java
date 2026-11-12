package com.datatheorem.android.trustkit.reporting;

import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.datatheorem.android.trustkit.config.PublicKeyPin;
import com.datatheorem.android.trustkit.pinning.PinningValidationResult;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PinningFailureReport implements Serializable {
    private static final String n = "ANDROID";
    private static final String o = "1.1.3";

    @NonNull
    private final String a;

    @NonNull
    private final String b;

    @NonNull
    private final String c;

    @NonNull
    private final PinningValidationResult d;

    @NonNull
    private final String e;
    private final int f;

    @NonNull
    private final String g;
    private final boolean h;
    private final boolean i;

    @NonNull
    private final List<String> j;

    @NonNull
    private final List<String> k;

    @NonNull
    private final Date l;

    @NonNull
    private final Set<PublicKeyPin> m;

    public PinningFailureReport(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, int i, @NonNull String str5, boolean z, boolean z2, @NonNull List<String> list, @NonNull List<String> list2, @NonNull Date date, @NonNull Set<PublicKeyPin> set, @NonNull PinningValidationResult pinningValidationResult) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.k = list2;
        this.l = date;
        this.m = set;
        this.d = pinningValidationResult;
    }

    public int a() {
        return this.f;
    }

    @NonNull
    public List<String> b() {
        return this.k;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app-bundle-id", this.a);
            jSONObject.put("app-version", String.valueOf(this.b));
            jSONObject.put("app-vendor-id", this.c);
            jSONObject.put("app-platform", n);
            jSONObject.put("trustkit-version", "1.1.3");
            jSONObject.put("hostname", this.e);
            jSONObject.put("port", this.f);
            jSONObject.put("noted-hostname", this.g);
            jSONObject.put("include-subdomains", this.h);
            jSONObject.put("enforce-pinning", this.i);
            jSONObject.put("validation-result", this.d.ordinal());
            jSONObject.put("date-time", DateFormat.format("yyyy-MM-dd'T'HH:mm:ssZ", this.l));
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = this.k.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("validated-certificate-chain", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it3 = this.j.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
            jSONObject.put("served-certificate-chain", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            Iterator<PublicKeyPin> it4 = this.m.iterator();
            while (it4.hasNext()) {
                jSONArray3.put("pin-sha256=\"" + it4.next().toString() + "\"");
            }
            jSONObject.put("known-pins", jSONArray3);
            return jSONObject;
        } catch (JSONException unused) {
            throw new IllegalStateException("JSON error for report: " + toString());
        }
    }

    @NonNull
    public String getNotedHostname() {
        return this.g;
    }

    @NonNull
    public String getServerHostname() {
        return this.e;
    }

    @NonNull
    public PinningValidationResult getValidationResult() {
        return this.d;
    }

    public String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return c().toString();
        }
    }
}
