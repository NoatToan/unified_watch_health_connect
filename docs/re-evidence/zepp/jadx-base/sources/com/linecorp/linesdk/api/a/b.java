package com.linecorp.linesdk.api.a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.a.a.d;
import com.linecorp.linesdk.a.g;
import com.linecorp.linesdk.api.LineApiClient;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class b implements LineApiClient {

    @NonNull
    private final String a;

    @NonNull
    private final com.linecorp.linesdk.a.a.b b;

    @NonNull
    private final d c;

    @NonNull
    private final com.linecorp.linesdk.a.a d;

    public b(@NonNull String str, @NonNull com.linecorp.linesdk.a.a.b bVar, @NonNull d dVar, @NonNull com.linecorp.linesdk.a.a aVar) {
        this.a = str;
        this.b = bVar;
        this.c = dVar;
        this.d = aVar;
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public final LineApiResponse<LineAccessToken> getCurrentAccessToken() {
        com.linecorp.linesdk.a.d dVarB = this.d.b();
        return dVarB == null ? LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("The cached access token does not exist.")) : LineApiResponse.createAsSuccess(new LineAccessToken(dVarB.a, dVarB.b, dVarB.c));
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @c
    public final LineApiResponse<LineProfile> getProfile() {
        com.linecorp.linesdk.a.d dVarB = this.d.b();
        return dVarB == null ? LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("access token is null")) : this.c.a(dVarB);
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public final LineApiResponse<?> logout() {
        com.linecorp.linesdk.a.d dVarB = this.d.b();
        if (dVarB == null) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("access token is null"));
        }
        com.linecorp.linesdk.a.a.b bVar = this.b;
        LineApiResponse<?> lineApiResponseA = bVar.g.a(bVar.f.buildUpon().appendPath("oauth").appendPath("revoke").build(), Collections.emptyMap(), Collections.singletonMap("refresh_token", dVarB.d), com.linecorp.linesdk.a.a.b.e);
        if (lineApiResponseA.isSuccess()) {
            this.d.a();
        }
        return lineApiResponseA;
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public final LineApiResponse<LineAccessToken> refreshAccessToken() {
        com.linecorp.linesdk.a.d dVarB = this.d.b();
        if (dVarB == null || TextUtils.isEmpty(dVarB.d)) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("access token or refresh token is not found."));
        }
        com.linecorp.linesdk.a.a.b bVar = this.b;
        String str = this.a;
        Uri uriBuild = bVar.f.buildUpon().appendPath("oauth").appendPath("accessToken").build();
        HashMap map = new HashMap(3);
        map.put("grant_type", "refresh_token");
        map.put("refresh_token", dVarB.d);
        map.put("client_id", str);
        LineApiResponse lineApiResponseA = bVar.g.a(uriBuild, Collections.emptyMap(), map, com.linecorp.linesdk.a.a.b.d);
        if (!lineApiResponseA.isSuccess()) {
            return LineApiResponse.createAsError(lineApiResponseA.getResponseCode(), lineApiResponseA.getErrorData());
        }
        g gVar = (g) lineApiResponseA.getResponseData();
        com.linecorp.linesdk.a.d dVar = new com.linecorp.linesdk.a.d(gVar.a, gVar.b, System.currentTimeMillis(), TextUtils.isEmpty(gVar.c) ? dVarB.d : gVar.c);
        this.d.a(dVar);
        return LineApiResponse.createAsSuccess(new LineAccessToken(dVar.a, dVar.b, dVar.c));
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public final LineApiResponse<LineCredential> verifyToken() {
        com.linecorp.linesdk.a.d dVarB = this.d.b();
        if (dVarB == null) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("access token is null"));
        }
        com.linecorp.linesdk.a.a.b bVar = this.b;
        Uri uriBuild = bVar.f.buildUpon().appendPath("oauth").appendPath("verify").build();
        HashMap map = new HashMap(1);
        map.put("access_token", dVarB.a);
        LineApiResponse lineApiResponseA = bVar.g.a(uriBuild, Collections.emptyMap(), map, com.linecorp.linesdk.a.a.b.c);
        if (!lineApiResponseA.isSuccess()) {
            return LineApiResponse.createAsError(lineApiResponseA.getResponseCode(), lineApiResponseA.getErrorData());
        }
        com.linecorp.linesdk.a.b bVar2 = (com.linecorp.linesdk.a.b) lineApiResponseA.getResponseData();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.d.a(new com.linecorp.linesdk.a.d(dVarB.a, bVar2.a, jCurrentTimeMillis, dVarB.d));
        return LineApiResponse.createAsSuccess(new LineCredential(new LineAccessToken(dVarB.a, bVar2.a, jCurrentTimeMillis), bVar2.b));
    }
}
