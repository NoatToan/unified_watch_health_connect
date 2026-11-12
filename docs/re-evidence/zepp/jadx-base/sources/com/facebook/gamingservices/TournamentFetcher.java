package com.facebook.gamingservices;

import android.os.Bundle;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.bolts.TaskCompletionSource;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/gamingservices/TournamentFetcher;", "", "Lcom/facebook/bolts/TaskCompletionSource;", "", "Lcom/facebook/gamingservices/Tournament;", "fetchTournaments", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentFetcher {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements GraphRequest.Callback {
        public final /* synthetic */ TaskCompletionSource a;

        public a(TaskCompletionSource taskCompletionSource) {
            this.a = taskCompletionSource;
        }

        @Override // com.facebook.GraphRequest.Callback
        public final void onCompleted(@NotNull GraphResponse graphResponse) {
            if (graphResponse.getError() != null) {
                FacebookRequestError error = graphResponse.getError();
                if ((error != null ? error.getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String() : null) == null) {
                    this.a.setError(new GraphAPIException("Graph API Error"));
                    return;
                }
                TaskCompletionSource taskCompletionSource = this.a;
                FacebookRequestError error2 = graphResponse.getError();
                taskCompletionSource.setError(error2 != null ? error2.getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String() : null);
                return;
            }
            try {
                JSONObject graphObject = graphResponse.getGraphObject();
                if (graphObject == null) {
                    this.a.setError(new GraphAPIException("Failed to get response"));
                    return;
                }
                JSONArray jSONArray = graphObject.getJSONArray("data");
                if (jSONArray != null && jSONArray.length() >= 1) {
                    this.a.setResult(ArraysKt___ArraysKt.toList((Object[]) new GsonBuilder().create().fromJson(jSONArray.toString(), Tournament[].class)));
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                this.a.setError(new GraphAPIException(String.format(Locale.ROOT, "No tournament found", Arrays.copyOf(new Object[]{Integer.valueOf(jSONArray.length()), 1}, 2))));
            } catch (JSONException e) {
                this.a.setError(e);
            }
        }
    }

    @NotNull
    public final TaskCompletionSource<List<Tournament>> fetchTournaments() {
        TaskCompletionSource<List<Tournament>> taskCompletionSource = new TaskCompletionSource<>();
        Bundle bundle = new Bundle();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to fetch tournament with an invalid access token");
        }
        if (!(currentAccessToken.getGraphDomain() != null && Intrinsics.areEqual(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()))) {
            throw new FacebookException("User is not using gaming login");
        }
        GraphRequest graphRequest = new GraphRequest(companion.getCurrentAccessToken(), "me/tournaments", bundle, HttpMethod.GET, new a(taskCompletionSource), null, 32, null);
        graphRequest.setParameters(bundle);
        graphRequest.executeAsync();
        return taskCompletionSource;
    }
}
