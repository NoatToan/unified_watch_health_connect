package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface HistoryApi {

    public static class ViewIntentBuilder {
        private final Context a;
        private final DataType b;
        private DataSource c;
        private long d;
        private long e;
        private String f;

        public ViewIntentBuilder(@RecentlyNonNull Context context, @RecentlyNonNull DataType dataType) {
            this.a = context;
            this.b = dataType;
        }

        @RecentlyNonNull
        public Intent build() {
            Intent intent;
            ResolveInfo resolveInfoResolveActivity;
            Preconditions.checkState(this.d > 0, "Start time must be set");
            Preconditions.checkState(this.e > this.d, "End time must be set and after start time");
            Intent intent2 = new Intent(Fitness.ACTION_VIEW);
            intent2.setType(DataType.getMimeType(this.c.getDataType()));
            intent2.putExtra(Fitness.EXTRA_START_TIME, this.d);
            intent2.putExtra(Fitness.EXTRA_END_TIME, this.e);
            SafeParcelableSerializer.serializeToIntentExtra(this.c, intent2, DataSource.EXTRA_DATA_SOURCE);
            if (this.f == null || (resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity((intent = new Intent(intent2).setPackage(this.f)), 0)) == null) {
                return intent2;
            }
            intent.setComponent(new ComponentName(this.f, resolveInfoResolveActivity.activityInfo.name));
            return intent;
        }

        @RecentlyNonNull
        public ViewIntentBuilder setDataSource(@RecentlyNonNull DataSource dataSource) {
            Preconditions.checkArgument(dataSource.getDataType().equals(this.b), "Data source %s is not for the data type %s", dataSource, this.b);
            this.c = dataSource;
            return this;
        }

        @RecentlyNonNull
        public ViewIntentBuilder setPreferredApplication(@RecentlyNonNull String str) {
            this.f = str;
            return this;
        }

        @RecentlyNonNull
        public ViewIntentBuilder setTimeInterval(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
            this.d = timeUnit.toMillis(j);
            this.e = timeUnit.toMillis(j2);
            return this;
        }
    }

    @RecentlyNonNull
    PendingResult<Status> deleteData(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataDeleteRequest dataDeleteRequest);

    @RecentlyNonNull
    PendingResult<Status> insertData(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataSet dataSet);

    @RecentlyNonNull
    PendingResult<DailyTotalResult> readDailyTotal(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataType dataType);

    @RecentlyNonNull
    PendingResult<DailyTotalResult> readDailyTotalFromLocalDevice(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataType dataType);

    @RecentlyNonNull
    PendingResult<DataReadResult> readData(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataReadRequest dataReadRequest);

    @RecentlyNonNull
    PendingResult<Status> registerDataUpdateListener(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest);

    @RecentlyNonNull
    PendingResult<Status> unregisterDataUpdateListener(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    PendingResult<Status> updateData(@RecentlyNonNull GoogleApiClient googleApiClient, @RecentlyNonNull DataUpdateRequest dataUpdateRequest);
}
