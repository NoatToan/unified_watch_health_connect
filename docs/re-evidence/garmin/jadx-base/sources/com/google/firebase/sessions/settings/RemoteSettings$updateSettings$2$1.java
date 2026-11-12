package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessions;
import e23.p;
import java.util.Objects;
import o13.r;
import o72.t;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {126}, m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$1 extends i implements p<JSONObject, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, d<? super RemoteSettings$updateSettings$2$1> dVar) {
        super(2, dVar);
        this.this$0 = remoteSettings;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, dVar);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // e23.p
    public final Object invoke(JSONObject jSONObject, d<? super Unit> dVar) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Boolean bool;
        Double d14;
        Integer num;
        JSONException jSONException;
        Integer num2;
        Integer num3;
        Double d15;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        Integer num4 = null;
        num4 = null;
        Boolean bool2 = null;
        if (i14 == 0) {
            r.b(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Objects.toString(jSONObject);
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                obj2.getClass();
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d15 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                Unit unit = Unit.INSTANCE;
                                num = num3;
                                d14 = d15;
                                bool = bool3;
                            } catch (JSONException e4) {
                                jSONException = e4;
                                num2 = num4;
                                bool2 = bool3;
                                t.k(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", jSONException));
                                num = num3;
                                d14 = d15;
                                bool = bool2;
                                num4 = num2;
                            }
                        } catch (JSONException e14) {
                            jSONException = e14;
                            num2 = null;
                            num3 = null;
                        }
                    } catch (JSONException e15) {
                        jSONException = e15;
                        num2 = null;
                        num3 = null;
                        d15 = null;
                    }
                } catch (JSONException e16) {
                    jSONException = e16;
                    num2 = null;
                    num3 = null;
                    d15 = null;
                }
            } else {
                bool = null;
                d14 = null;
                num = null;
            }
            SettingsCache settingsCache = this.this$0.settingsCache;
            SessionConfigs sessionConfigs = new SessionConfigs(bool, d14, num, new Integer(num4 != null ? num4.intValue() : RemoteSettings.Companion.getDefaultCacheDuration()), new Long(this.this$0.timeProvider.currentTime().getSeconds()));
            this.label = 1;
            if (settingsCache.updateConfigs(sessionConfigs, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
