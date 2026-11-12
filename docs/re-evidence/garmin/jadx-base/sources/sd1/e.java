package sd1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.gncs.NotificationConstants;
import i83.p;
import i83.s;
import i83.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lsd1/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f158625a = new a(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lsd1/e$b;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "Lc83/a0;", "Lpd1/c;", "b", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "userReminderListDTO", "", "a", "(Lpd1/c;Lt13/d;)Ljava/lang/Object;", "reminderType", "", "userReminderId", "c", "(Ljava/lang/String;ILt13/d;)Ljava/lang/Object;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface b {
        @p("/userprofile-service/userprofile/user-reminders")
        Object a(@i83.a pd1.c cVar, t13.d<? super a0<Unit>> dVar);

        @i83.f("/userprofile-service/userprofile/user-reminders")
        Object b(@t(NotificationConstants.KEY_DATA_MIME_TYPE) String str, t13.d<? super a0<pd1.c>> dVar);

        @i83.b("/userprofile-service/userprofile/user-reminder/{reminderType}/{userReminderId}")
        Object c(@s("reminderType") String str, @s("userReminderId") int i14, t13.d<? super a0<Unit>> dVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsd1/e$a;", "", "<init>", "()V", "Lsd1/e$b;", "apiService", "Lsd1/e$b;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static final b a(a aVar) {
            aVar.getClass();
            a aVar2 = e.f158625a;
            return (b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b.class, new c83.h.a[0], null, null, null, 120);
        }

        public static e b(a aVar) {
            aVar.getClass();
            return new e();
        }

        private a() {
        }
    }
}
