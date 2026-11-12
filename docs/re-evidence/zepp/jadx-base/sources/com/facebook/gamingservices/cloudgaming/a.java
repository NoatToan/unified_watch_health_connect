package com.facebook.gamingservices.cloudgaming;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* JADX INFO: loaded from: classes2.dex */
class a implements GraphRequest.Callback {
    private String a;
    private String b;
    private int c;

    @Nullable
    private String d;
    public GraphRequest.Callback e;

    public a(String str, String str2, int i, @Nullable String str3, GraphRequest.Callback callback) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = callback;
    }

    @Override // com.facebook.GraphRequest.Callback
    public void onCompleted(GraphResponse graphResponse) {
        if (graphResponse.getError() != null) {
            throw new FacebookException(graphResponse.getError().getErrorMessage());
        }
        String strOptString = graphResponse.getGraphObject().optString("id");
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        Bundle bundle = new Bundle();
        bundle.putString("title", this.a);
        bundle.putString("body", this.b);
        bundle.putInt(SDKConstants.PARAM_A2U_TIME_INTERVAL, this.c);
        String str = this.d;
        if (str != null) {
            bundle.putString(SDKConstants.PARAM_A2U_PAYLOAD, str);
        }
        bundle.putString(SDKConstants.PARAM_A2U_MEDIA_ID, strOptString);
        new GraphRequest(currentAccessToken, SDKConstants.PARAM_A2U_GRAPH_PATH, bundle, HttpMethod.POST, this.e).executeAsync();
    }
}
