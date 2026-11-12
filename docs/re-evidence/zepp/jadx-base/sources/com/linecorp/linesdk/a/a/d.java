package com.linecorp.linesdk.a.a;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.Scopes;
import com.linecorp.linesdk.BuildConfig;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineProfile;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class d {
    private static final com.linecorp.linesdk.a.a.a.c<LineProfile> c = new a();

    @NonNull
    private final Uri a;

    @NonNull
    private final com.linecorp.linesdk.a.a.a.a b;

    @VisibleForTesting
    public static class a extends com.linecorp.linesdk.a.a.a<LineProfile> {
        @Override // com.linecorp.linesdk.a.a.a
        @NonNull
        public final /* synthetic */ LineProfile b(@NonNull JSONObject jSONObject) {
            String strOptString = jSONObject.optString("pictureUrl", null);
            return new LineProfile(jSONObject.getString("userId"), jSONObject.getString(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME), strOptString == null ? null : Uri.parse(strOptString), jSONObject.optString("statusMessage", null));
        }
    }

    public d(@NonNull Context context, @NonNull Uri uri) {
        this(uri, new com.linecorp.linesdk.a.a.a.a(context, BuildConfig.VERSION_NAME));
    }

    @NonNull
    public final LineApiResponse<LineProfile> a(@NonNull com.linecorp.linesdk.a.d dVar) {
        Uri uriBuild = this.a.buildUpon().appendPath(Scopes.PROFILE).build();
        HashMap map = new HashMap(1);
        map.put("Authorization", "Bearer " + dVar.a);
        return this.b.b(uriBuild, map, Collections.emptyMap(), c);
    }

    @VisibleForTesting
    private d(@NonNull Uri uri, @NonNull com.linecorp.linesdk.a.a.a.a aVar) {
        this.a = uri;
        this.b = aVar;
    }
}
