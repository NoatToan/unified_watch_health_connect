package gw;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\f\rB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lgw/l;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "Lsd2/c;", "", "deviceUnitId", "", "replyType", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JILcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends com.garmin.android.library.backgroundtaskmanagement.b<Set<? extends sd2.c>> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgw/l$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "", "mDeviceUnitId", "", "mReplyType", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "<init>", "(Lgw/l;JILcom/garmin/android/library/backgroundtaskmanagement/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f79520i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f79521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ l f79522k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, long j8, int i14, com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
            super(bVar);
            bVar.getClass();
            this.f79522k = lVar;
            this.f79520i = j8;
            this.f79521j = i14;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            rd2.c cVar = (rd2.c) ConnectDatabase.g().e();
            cVar.getClass();
            androidx.room.l0 l0VarE = androidx.room.l0.e(2, "SELECT * FROM canned_text_reply WHERE deviceUnitId = ? AND replyType = ?");
            l0VarE.h(1, this.f79520i);
            l0VarE.h(2, this.f79521j);
            androidx.room.b0 b0Var = cVar.f152036a;
            b0Var.assertNotSuspendingTransaction();
            Cursor cursorQuery = b0Var.query(l0VarE, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(rd2.c.a(cursorQuery));
                }
                cursorQuery.close();
                l0VarE.release();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "GetCannedTextReplOperat", "GetCannedTextRepliesTask.executeTask: fetched replies from cache - " + arrayList);
                this.f79522k.h(com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED, new HashSet(arrayList));
                c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            } catch (Throwable th3) {
                cursorQuery.close();
                l0VarE.release();
                throw th3;
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    static {
        new a(null);
    }

    public l(long j8, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        b(new b(this, j8, i14, this));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgw/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
