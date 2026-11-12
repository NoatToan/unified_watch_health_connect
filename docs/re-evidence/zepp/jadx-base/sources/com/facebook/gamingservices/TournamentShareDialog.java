package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u00044356B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020.¢\u0006\u0004\b)\u0010/B\u0011\b\u0012\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b)\u00102J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0014J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010&\u001a\u001c\u0012\u0018\u0012\u00160#R\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\"8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "", "score", "newTournamentConfig", "", "show", "Lcom/facebook/gamingservices/Tournament;", "tournament", "content", "", "mode", "showImpl", "Lcom/facebook/internal/CallbackManagerImpl;", "callbackManager", "Lcom/facebook/FacebookCallback;", "callback", "registerCallbackImpl", "Lcom/facebook/internal/AppCall;", "createBaseAppCall", "g", "Ljava/lang/Number;", "getScore", "()Ljava/lang/Number;", "setScore", "(Ljava/lang/Number;)V", "h", "Lcom/facebook/gamingservices/Tournament;", "getTournament", "()Lcom/facebook/gamingservices/Tournament;", "setTournament", "(Lcom/facebook/gamingservices/Tournament;)V", "", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "getOrderedModeHandlers", "()Ljava/util/List;", "orderedModeHandlers", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "Landroid/app/Fragment;", "(Landroid/app/Fragment;)V", "Lcom/facebook/internal/FragmentWrapper;", "fragmentWrapper", "(Lcom/facebook/internal/FragmentWrapper;)V", "Companion", "a", "b", "Result", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
@AutoHandleExceptions
public final class TournamentShareDialog extends FacebookDialogBase<TournamentConfig, Result> {
    private static final int i = CallbackManagerImpl.RequestCodeOffset.TournamentShareDialog.toRequestCode();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Number score;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Tournament tournament;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "", "", "a", "Ljava/lang/String;", "getRequestID", "()Ljava/lang/String;", "setRequestID", "(Ljava/lang/String;)V", SDKConstants.REQUEST_ID, "b", "getTournamentID", "setTournamentID", "tournamentID", "Landroid/os/Bundle;", "results", "<init>", "(Landroid/os/Bundle;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Result {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private String requestID;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String tournamentID;

        public Result(@NotNull Bundle bundle) {
            if (bundle.getString("request") != null) {
                this.requestID = bundle.getString("request");
            }
            this.tournamentID = bundle.getString(SDKConstants.PARAM_TOURNAMENTS_ID);
        }

        @Nullable
        public final String getRequestID() {
            return this.requestID;
        }

        @Nullable
        public final String getTournamentID() {
            return this.tournamentID;
        }

        public final void setRequestID(@Nullable String str) {
            this.requestID = str;
        }

        public final void setTournamentID(@Nullable String str) {
            this.tournamentID = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00160\u0001R\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\r"}, d2 = {"com/facebook/gamingservices/TournamentShareDialog$a", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "content", "", "isBestEffort", "a", "Lcom/facebook/internal/AppCall;", "b", "<init>", "(Lcom/facebook/gamingservices/TournamentShareDialog;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        public a() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(@Nullable TournamentConfig content, boolean isBestEffort) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(@Nullable TournamentConfig content) {
            Uri uriUriForUpdating$facebook_gamingservices_release;
            AppCall appCallCreateBaseAppCall = TournamentShareDialog.this.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
            if (currentAccessToken == null || currentAccessToken.isExpired()) {
                throw new FacebookException("Attempted to share tournament with an invalid access token");
            }
            if (currentAccessToken.getGraphDomain() != null && (!Intrinsics.areEqual(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()))) {
                throw new FacebookException("Attempted to share tournament without without gaming login");
            }
            Number score = TournamentShareDialog.this.getScore();
            if (score == null) {
                throw new FacebookException("Attempted to share tournament without a score");
            }
            if (content != null) {
                uriUriForUpdating$facebook_gamingservices_release = TournamentShareDialogURIBuilder.INSTANCE.uriForCreating$facebook_gamingservices_release(content, score, currentAccessToken.getApplicationId());
            } else {
                Tournament tournament = TournamentShareDialog.this.getTournament();
                uriUriForUpdating$facebook_gamingservices_release = tournament != null ? TournamentShareDialogURIBuilder.INSTANCE.uriForUpdating$facebook_gamingservices_release(tournament.getIdentifier(), score, currentAccessToken.getApplicationId()) : null;
            }
            Intent intent = new Intent("android.intent.action.VIEW", uriUriForUpdating$facebook_gamingservices_release);
            TournamentShareDialog tournamentShareDialog = TournamentShareDialog.this;
            tournamentShareDialog.startActivityForResult(intent, tournamentShareDialog.getRequestCodeField());
            return appCallCreateBaseAppCall;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00160\u0001R\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\r"}, d2 = {"com/facebook/gamingservices/TournamentShareDialog$b", "Lcom/facebook/internal/FacebookDialogBase$ModeHandler;", "Lcom/facebook/internal/FacebookDialogBase;", "Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/gamingservices/TournamentShareDialog$Result;", "content", "", "isBestEffort", "a", "Lcom/facebook/internal/AppCall;", "b", "<init>", "(Lcom/facebook/gamingservices/TournamentShareDialog;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public final class b extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        public b() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(@Nullable TournamentConfig content, boolean isBestEffort) {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(@Nullable TournamentConfig content) {
            Bundle bundleBundleForUpdating$facebook_gamingservices_release;
            AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
            AppCall appCallCreateBaseAppCall = TournamentShareDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            if (currentAccessToken == null || currentAccessToken.isExpired()) {
                throw new FacebookException("Attempted to share tournament with an invalid access token");
            }
            if (currentAccessToken.getGraphDomain() != null && (!Intrinsics.areEqual(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()))) {
                throw new FacebookException("Attempted to share tournament while user is not gaming logged in");
            }
            String applicationId = currentAccessToken.getApplicationId();
            Number score = TournamentShareDialog.this.getScore();
            if (score == null) {
                throw new FacebookException("Attempted to share tournament without a score");
            }
            if (content != null) {
                bundleBundleForUpdating$facebook_gamingservices_release = TournamentShareDialogURIBuilder.INSTANCE.bundleForCreating$facebook_gamingservices_release(content, score, applicationId);
            } else {
                Tournament tournament = TournamentShareDialog.this.getTournament();
                bundleBundleForUpdating$facebook_gamingservices_release = tournament != null ? TournamentShareDialogURIBuilder.INSTANCE.bundleForUpdating$facebook_gamingservices_release(tournament.getIdentifier(), score, applicationId) : null;
            }
            NativeProtocol.setupProtocolRequestIntent(intent, appCallCreateBaseAppCall.getCallId().toString(), "", NativeProtocol.PROTOCOL_VERSION_20210906, bundleBundleForUpdating$facebook_gamingservices_release);
            appCallCreateBaseAppCall.setRequestIntent(intent);
            return appCallCreateBaseAppCall;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(ILandroid/content/Intent;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements CallbackManagerImpl.Callback {
        public final /* synthetic */ ResultProcessor b;

        public c(ResultProcessor resultProcessor) {
            this.b = resultProcessor;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public final boolean onActivityResult(int i, @Nullable Intent intent) {
            return ShareInternalUtility.handleActivityResult(TournamentShareDialog.this.getRequestCodeField(), i, intent, this.b);
        }
    }

    public TournamentShareDialog(@NotNull Activity activity) {
        super(activity, i);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    @NotNull
    public List<FacebookDialogBase<TournamentConfig, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        arrayList.add(new a());
        return arrayList;
    }

    @Nullable
    public final Number getScore() {
        return this.score;
    }

    @Nullable
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(@NotNull CallbackManagerImpl callbackManager, @NotNull final FacebookCallback<Result> callback) {
        callbackManager.registerCallback(getRequestCodeField(), new c(new ResultProcessor(callback) { // from class: com.facebook.gamingservices.TournamentShareDialog$registerCallbackImpl$resultProcessor$1
            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(@NotNull AppCall appCall, @NotNull Bundle results) {
                if (results.getString("error_message") != null) {
                    callback.onError(new FacebookException(results.getString("error_message")));
                } else if (results.getString(SDKConstants.PARAM_TOURNAMENTS_ID) != null) {
                    callback.onSuccess(new TournamentShareDialog.Result(results));
                } else {
                    onCancel(appCall);
                }
            }
        }));
    }

    public final void setScore(@Nullable Number number) {
        this.score = number;
    }

    public final void setTournament(@Nullable Tournament tournament) {
        this.tournament = tournament;
    }

    public final void show(@NotNull Number score, @NotNull TournamentConfig newTournamentConfig) {
        this.score = score;
        showImpl(newTournamentConfig, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    public TournamentShareDialog(@NotNull Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(@Nullable TournamentConfig content, @NotNull Object mode) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return;
        }
        super.showImpl(content, mode);
    }

    public TournamentShareDialog(@NotNull android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public final void show(@NotNull Number score, @NotNull Tournament tournament) {
        this.score = score;
        this.tournament = tournament;
        showImpl((TournamentConfig) null, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    private TournamentShareDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, i);
    }
}
