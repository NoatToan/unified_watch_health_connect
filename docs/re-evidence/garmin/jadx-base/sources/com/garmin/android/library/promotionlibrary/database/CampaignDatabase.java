package com.garmin.android.library.promotionlibrary.database;

import androidx.room.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vd.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/promotionlibrary/database/CampaignDatabase;", "Landroidx/room/b0;", "<init>", "()V", "b", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class CampaignDatabase extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile CampaignDatabase f50537b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f50536a = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50538c = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/promotionlibrary/database/CampaignDatabase$a", "Lkd/a;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends kd.a {
        public a() {
            super(1, 2);
        }

        @Override // kd.a
        public final void migrate(c cVar) {
            cVar.getClass();
            cVar.k3("ALTER TABLE `campaigns` ADD COLUMN `detailBodyDetailText` TEXT NOT NULL DEFAULT ''");
        }
    }

    public abstract df2.a e();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/library/promotionlibrary/database/CampaignDatabase$b;", "", "<init>", "()V", "Lcom/garmin/android/library/promotionlibrary/database/CampaignDatabase;", "databaseInstance", "Lcom/garmin/android/library/promotionlibrary/database/CampaignDatabase;", "", "DB_NAME", "Ljava/lang/String;", "Lkd/a;", "MIGRATION_1_2", "Lkd/a;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
