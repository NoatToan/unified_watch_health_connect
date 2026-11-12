package com.facebook.gamingservices.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.facebook.gamingservices.TournamentConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.time.Instant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/facebook/gamingservices/internal/TournamentShareDialogURIBuilder;", "", "", "tournamentID", "", "score", SDKConstants.PARAM_APP_ID, "Landroid/net/Uri;", "uriForUpdating$facebook_gamingservices_release", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;)Landroid/net/Uri;", "uriForUpdating", "Lcom/facebook/gamingservices/TournamentConfig;", "config", "uriForCreating$facebook_gamingservices_release", "(Lcom/facebook/gamingservices/TournamentConfig;Ljava/lang/Number;Ljava/lang/String;)Landroid/net/Uri;", "uriForCreating", "Landroid/os/Bundle;", "bundleForUpdating$facebook_gamingservices_release", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;)Landroid/os/Bundle;", "bundleForUpdating", "bundleForCreating$facebook_gamingservices_release", "(Lcom/facebook/gamingservices/TournamentConfig;Ljava/lang/Number;Ljava/lang/String;)Landroid/os/Bundle;", "bundleForCreating", "scheme", "Ljava/lang/String;", "authority", TournamentShareDialogURIBuilder.me, "tournament", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentShareDialogURIBuilder {

    @NotNull
    public static final TournamentShareDialogURIBuilder INSTANCE = new TournamentShareDialogURIBuilder();

    @NotNull
    public static final String authority = "fb.gg";

    @NotNull
    public static final String me = "me";

    @NotNull
    public static final String scheme = "https";

    @NotNull
    public static final String tournament = "instant_tournament";

    private TournamentShareDialogURIBuilder() {
    }

    @NotNull
    public final Bundle bundleForCreating$facebook_gamingservices_release(@NotNull TournamentConfig config, @NotNull Number score, @NotNull String appID) {
        Instant endTime;
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", appID);
        bundle.putString("score", score.toString());
        TournamentSortOrder tournamentSortOrder = config.getCom.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_SORT_ORDER java.lang.String();
        if (tournamentSortOrder != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, tournamentSortOrder.toString());
        }
        TournamentScoreType scoreType = config.getScoreType();
        if (scoreType != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = config.getTitle();
        if (title != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = config.getPayload();
        if (payload != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        if (Build.VERSION.SDK_INT >= 26 && (endTime = config.getEndTime()) != null) {
            bundle.putString("end_time", String.valueOf((int) endTime.getEpochSecond()));
        }
        return bundle;
    }

    @NotNull
    public final Bundle bundleForUpdating$facebook_gamingservices_release(@NotNull String tournamentID, @NotNull Number score, @NotNull String appID) {
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", appID);
        bundle.putString("score", score.toString());
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID);
        return bundle;
    }

    @NotNull
    public final Uri uriForCreating$facebook_gamingservices_release(@NotNull TournamentConfig config, @NotNull Number score, @NotNull String appID) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("fb.gg").appendPath(me).appendPath(tournament).appendPath(appID).appendQueryParameter("score", score.toString());
        Instant endTime = config.getEndTime();
        if (endTime != null) {
            builderAppendQueryParameter.appendQueryParameter("end_time", endTime.toString());
        }
        TournamentSortOrder tournamentSortOrder = config.getCom.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_SORT_ORDER java.lang.String();
        if (tournamentSortOrder != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, tournamentSortOrder.toString());
        }
        TournamentScoreType scoreType = config.getScoreType();
        if (scoreType != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = config.getTitle();
        if (title != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = config.getPayload();
        if (payload != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        return builderAppendQueryParameter.build();
    }

    @NotNull
    public final Uri uriForUpdating$facebook_gamingservices_release(@NotNull String tournamentID, @NotNull Number score, @NotNull String appID) {
        return new Uri.Builder().scheme("https").authority("fb.gg").appendPath(me).appendPath(tournament).appendPath(appID).appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID).appendQueryParameter("score", score.toString()).build();
    }
}
