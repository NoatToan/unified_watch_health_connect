package com.garmin.garminpay.database;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vd.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/garminpay/database/GarminPayCoreDatabase;", "Landroidx/room/b0;", "<init>", "()V", "b", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class GarminPayCoreDatabase extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static GarminPayCoreDatabase f52318c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52316a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f52317b = LoggerFactory.getLogger("PAY#CORE#Database");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f52319d = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/garminpay/database/GarminPayCoreDatabase$a", "Lkd/a;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends kd.a {
        public a() {
            super(4, 5);
        }

        @Override // kd.a
        public final void migrate(c cVar) {
            cVar.getClass();
            cVar.k3("ALTER TABLE `wallet_items` ADD COLUMN `type` TEXT");
        }
    }

    public abstract es2.a e();

    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/garminpay/database/GarminPayCoreDatabase$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "DATABASE_NAME", "Ljava/lang/String;", "Lcom/garmin/garminpay/database/GarminPayCoreDatabase;", "mInstance", "Lcom/garmin/garminpay/database/GarminPayCoreDatabase;", "com/garmin/garminpay/database/GarminPayCoreDatabase$a", "MIGRATION_4_5", "Lcom/garmin/garminpay/database/GarminPayCoreDatabase$a;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static GarminPayCoreDatabase a(Context context) {
            context.getClass();
            if (GarminPayCoreDatabase.f52318c == null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                b0.a aVarA = x.a(applicationContext, GarminPayCoreDatabase.class, "garminpaycore");
                aVarA.a(GarminPayCoreDatabase.f52319d);
                aVarA.f10736n.add(Integer.valueOf(new int[]{2}[0]));
                GarminPayCoreDatabase.f52318c = (GarminPayCoreDatabase) aVarA.b();
                GarminPayCoreDatabase.f52317b.debug("initialized");
            }
            GarminPayCoreDatabase garminPayCoreDatabase = GarminPayCoreDatabase.f52318c;
            garminPayCoreDatabase.getClass();
            return garminPayCoreDatabase;
        }

        private b() {
        }
    }
}
