package com.braintreepayments.api;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "analyticsEventBlobDao", "Lcom/braintreepayments/api/AnalyticsEventBlobDao;", "Companion", "DeleteAnalyticsEventTableAutoMigration", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AnalyticsDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AnalyticsDatabase INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase$DeleteAnalyticsEventTableAutoMigration;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DeleteAnalyticsEventTableAutoMigration implements AutoMigrationSpec {
    }

    public abstract AnalyticsEventBlobDao analyticsEventBlobDao();

    /* JADX INFO: renamed from: com.braintreepayments.api.AnalyticsDatabase$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/braintreepayments/api/AnalyticsDatabase;", "getInstance", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final AnalyticsDatabase e(Context context) {
            AnalyticsDatabase analyticsDatabase;
            zcp.c(context, "");
            AnalyticsDatabase analyticsDatabase2 = AnalyticsDatabase.INSTANCE;
            if (analyticsDatabase2 != null) {
                return analyticsDatabase2;
            }
            synchronized (this) {
                RoomDatabase roomDatabaseBuild = Room.databaseBuilder(context.getApplicationContext(), AnalyticsDatabase.class, "analytics_database").build();
                zcp.b((Object) roomDatabaseBuild, "");
                analyticsDatabase = (AnalyticsDatabase) roomDatabaseBuild;
                Companion companion = AnalyticsDatabase.INSTANCE;
                AnalyticsDatabase.INSTANCE = analyticsDatabase;
            }
            return analyticsDatabase;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final AnalyticsDatabase getInstance(Context context) {
        return INSTANCE.e(context);
    }
}
