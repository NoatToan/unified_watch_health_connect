package com.garmin.android.apps.connectmobile.persistence;

import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w10.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase;", "Landroidx/room/b0;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class GCMUserPersistenceDatabase extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40309a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static GCMUserPersistenceDatabase f40310b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
    }

    public abstract z81.a e();

    public abstract ru.a f();

    public abstract d g();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase$a;", "", "<init>", "()V", "", "DATABASE_NAME", "Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase;", "instance", "Lcom/garmin/android/apps/connectmobile/persistence/GCMUserPersistenceDatabase;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static GCMUserPersistenceDatabase a(Context context) {
            context.getClass();
            GCMUserPersistenceDatabase gCMUserPersistenceDatabase = GCMUserPersistenceDatabase.f40310b;
            if (gCMUserPersistenceDatabase != null) {
                return gCMUserPersistenceDatabase;
            }
            b0.a aVarA = x.a(context, GCMUserPersistenceDatabase.class, "gcm_user_persistence");
            int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int i14 = 0; i14 < 9; i14++) {
                aVarA.f10736n.add(Integer.valueOf(iArr[i14]));
            }
            aVarA.f10741s = false;
            GCMUserPersistenceDatabase gCMUserPersistenceDatabase2 = (GCMUserPersistenceDatabase) aVarA.b();
            GCMUserPersistenceDatabase.f40310b = gCMUserPersistenceDatabase2;
            return gCMUserPersistenceDatabase2;
        }

        private a() {
        }
    }
}
