package org.chromium.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n23.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ICronetEngineBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<Integer> f133476d = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f133477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f133478b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICronetEngineBuilder f133479c;

    @FunctionalInterface
    public interface a {
        void a(JSONObject jSONObject);
    }

    public b(ICronetEngineBuilder iCronetEngineBuilder) {
        this.f133479c = iCronetEngineBuilder;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e4) {
            j.w(am.j.m("Failed adding a default object for key [", str, "]"), e4);
            return null;
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z14, Date date) {
        this.f133479c.addPublicKeyPins(str, set, z14, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i14, int i15) {
        this.f133479c.addQuicHint(str, i14, i15);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        JSONObject jSONObject = this.f133477a;
        ArrayList arrayList = this.f133478b;
        ICronetEngineBuilder iCronetEngineBuilder = this.f133479c;
        if (jSONObject == null && arrayList.isEmpty()) {
            return iCronetEngineBuilder.build();
        }
        if (this.f133477a == null) {
            this.f133477a = new JSONObject();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).a(this.f133477a);
            } catch (JSONException e4) {
                com.airbnb.lottie.animation.keyframe.a.x("Unable to apply JSON patch!", e4);
                return null;
            }
        }
        iCronetEngineBuilder.setExperimentalOptions(this.f133477a.toString());
        return iCronetEngineBuilder.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z14) {
        this.f133479c.enableBrotli(z14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z14) {
        this.f133479c.enableHttp2(z14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i14, long j8) {
        this.f133479c.enableHttpCache(i14, j8);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z14) {
        this.f133479c.enableNetworkQualityEstimator(z14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z14) {
        this.f133479c.enablePublicKeyPinningBypassForLocalTrustAnchors(z14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z14) {
        this.f133479c.enableQuic(z14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z14) {
        this.f133479c.enableSdch(z14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.f133479c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set<Integer> getSupportedConfigOptions() {
        return f133476d;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f133479c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(1)) {
            iCronetEngineBuilder.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.f133478b.add(new org.chromium.net.a(connectionMigrationOptions, 1));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f133479c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(2)) {
            iCronetEngineBuilder.setDnsOptions(dnsOptions);
            return this;
        }
        this.f133478b.add(new org.chromium.net.a(dnsOptions, 0));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.f133477a = null;
            return this;
        }
        try {
            this.f133477a = new JSONObject(str);
            return this;
        } catch (JSONException e4) {
            j.w("Experimental options parsing failed", e4);
            return null;
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f133479c.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f133479c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(3)) {
            iCronetEngineBuilder.setQuicOptions(quicOptions);
            return this;
        }
        this.f133478b.add(new org.chromium.net.a(quicOptions, 2));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f133479c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i14) {
        this.f133479c.setThreadPriority(i14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f133479c.setUserAgent(str);
        return this;
    }
}
