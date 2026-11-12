package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface SessionsApi {

    public static class ViewIntentBuilder {
        private final Context a;
        private Session b;

        @Nullable
        private String c;
        private boolean d = false;

        public ViewIntentBuilder(@RecentlyNonNull Context context) {
            this.a = context;
        }

        @RecentlyNonNull
        public Intent build() {
            Intent intent;
            ResolveInfo resolveInfoResolveActivity;
            Preconditions.checkState(this.b != null, "Session must be set");
            Intent intent2 = new Intent(Fitness.ACTION_VIEW);
            intent2.setType(Session.getMimeType(this.b.getActivity()));
            SafeParcelableSerializer.serializeToIntentExtra(this.b, intent2, Session.EXTRA_SESSION);
            if (!this.d) {
                this.c = this.b.getAppPackageName();
            }
            String str = this.c;
            if (str == null || (resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity((intent = new Intent(intent2).setPackage(str)), 0)) == null) {
                return intent2;
            }
            intent.setComponent(new ComponentName(str, resolveInfoResolveActivity.activityInfo.name));
            return intent;
        }

        @RecentlyNonNull
        public ViewIntentBuilder setPreferredApplication(@Nullable String str) {
            this.c = str;
            this.d = true;
            return this;
        }

        @RecentlyNonNull
        public ViewIntentBuilder setSession(@RecentlyNonNull Session session) {
            this.b = session;
            return this;
        }
    }

    @RecentlyNonNull
    PendingResult<Status> insertSession(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull SessionInsertRequest sessionInsertRequest);

    @RecentlyNonNull
    PendingResult<SessionReadResult> readSession(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull SessionReadRequest sessionReadRequest);

    @RecentlyNonNull
    PendingResult<Status> registerForSessions(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    PendingResult<Status> startSession(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull Session session);

    @RecentlyNonNull
    PendingResult<SessionStopResult> stopSession(@RecentlyNonNull GoogleApiClient googleApiClient, @Nullable String str);

    @RecentlyNonNull
    PendingResult<Status> unregisterForSessions(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull PendingIntent pendingIntent);
}
