package s00;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o53.s0;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/l;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f155311a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f155312b = o13.m.b(new ro0.h(12));

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        a aVar = f155311a;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        try {
            String string = bundle.getString("notification", "");
            if (TextUtils.isEmpty(string)) {
                a.a(aVar).error("JSON is missing");
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            long jOptLong = jSONObject.optLong("deviceId", Long.MAX_VALUE);
            if (Long.MAX_VALUE == jOptLong) {
                a.a(aVar).error("invalid 'deviceId', JSON ->\n" + jSONObject.toString(4));
                return;
            }
            String strOptString = jSONObject.optString("eventId", "");
            if (TextUtils.isEmpty(strOptString)) {
                a.a(aVar).error("invalid 'eventId', JSON ->\n" + jSONObject.toString(4));
                return;
            }
            String strOptString2 = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID, "");
            if (TextUtils.isEmpty(strOptString2)) {
                a.a(aVar).error("invalid 'appId', JSON ->\n" + jSONObject.toString(4));
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("notification");
            a.a(aVar).debug("queuing msg for delivery to device [" + jOptLong + "], event [" + strOptString + "], app [" + strOptString2 + "]...");
            bk2.b.c cVar2 = bk2.b.f18501j;
            Context applicationContext = garminConnectMobileApp.getApplicationContext();
            applicationContext.getClass();
            cVar2.getClass();
            bk2.b bVarA = bk2.b.c.a(applicationContext);
            strOptString.getClass();
            strOptString2.getClass();
            String string2 = jSONObject2.toString();
            string2.getClass();
            bk2.a aVar2 = new bk2.a(jOptLong, strOptString, strOptString2, string2);
            u53.d dVar = bVarA.f18505d;
            x53.c cVar3 = s0.f129406a;
            ge1.b.T(dVar, x53.b.f189152a, null, new bk2.f(bVarA, aVar2, null), 2);
        } catch (JSONException e4) {
            a.a(aVar).error((String) null, (Throwable) e4);
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.CIQ_MESSAGE, n00.c.DEVICE_MESSAGE};
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls00/l$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) l.f155312b.getValue();
        }

        private a() {
        }
    }
}
