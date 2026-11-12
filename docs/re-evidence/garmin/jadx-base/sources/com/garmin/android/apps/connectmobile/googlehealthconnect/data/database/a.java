package com.garmin.android.apps.connectmobile.googlehealthconnect.data.database;

import androidx.room.b0;
import androidx.room.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import yl0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/data/database/a;", "Lyl0/b;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "b", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements yl0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36058a = new b(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.googlehealthconnect.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/googlehealthconnect/data/database/a$a", "Landroidx/room/g;", "Lyl0/c;", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0627a extends g<c> {
        @Override // androidx.room.g
        public final void a(ud.c cVar, c cVar2) {
            c cVar3 = cVar2;
            cVar.getClass();
            cVar3.getClass();
            cVar.q3(1, cVar3.f197652a);
            cVar.q3(2, cVar3.f197653b);
        }

        @Override // androidx.room.g
        public final String b() {
            return "INSERT OR REPLACE INTO `google_health_connect_record_entity` (`keyId`,`json`) VALUES (?,?)";
        }
    }

    public a(b0 b0Var) {
        b0Var.getClass();
        new C0627a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/data/database/a$b;", "", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
