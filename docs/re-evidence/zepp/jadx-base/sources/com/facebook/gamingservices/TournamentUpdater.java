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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/facebook/gamingservices/TournamentUpdater;", "", "Lcom/facebook/gamingservices/Tournament;", "tournament", "", "score", "Lcom/facebook/bolts/TaskCompletionSource;", "", "update", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentUpdater {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements GraphRequest.Callback {
        public final /* synthetic */ TaskCompletionSource a;

        public a(TaskCompletionSource taskCompletionSource) {
            this.a = taskCompletionSource;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
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
            JSONObject graphObject = graphResponse.getGraphObject();
            String strOptString = graphObject != null ? graphObject.optString("success") : null;
            if (strOptString != null) {
                if (!(strOptString.length() == 0)) {
                    this.a.setResult(Boolean.valueOf(strOptString.equals("true")));
                    return;
                }
            }
            this.a.setError(new GraphAPIException("Graph API Error"));
        }
    }

    @Nullable
    public final TaskCompletionSource<Boolean> update(@NotNull Tournament tournament, @NotNull Number score) {
        AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to fetch tournament with an invalid access token");
        }
        if (!(currentAccessToken.getGraphDomain() != null && Intrinsics.areEqual(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()))) {
            throw new FacebookException("User is not using gaming login");
        }
        TaskCompletionSource<Boolean> taskCompletionSource = new TaskCompletionSource<>();
        String str = tournament.getIdentifier() + "/update_score";
        Bundle bundle = new Bundle();
        bundle.putInt("score", score.intValue());
        new GraphRequest(currentAccessToken, str, bundle, HttpMethod.POST, new a(taskCompletionSource), null, 32, null).executeAsync();
        return taskCompletionSource;
    }
}
