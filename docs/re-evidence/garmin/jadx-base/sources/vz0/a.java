package vz0;

import c22.k;
import c22.s3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.k1;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v44 vz0.a[], still in use, count: 1, list:
  (r0v44 vz0.a[]) from 0x02ea: CONSTRUCTOR (r0v44 vz0.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvz0/a;", "", "", "notificationId", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(1),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_INVITE(7),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_REQUEST(8),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(16),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_NEWS_POST(19),
    /* JADX INFO: Fake field, exist only in values array */
    ALSO_COMMENTED_ON_GROUP_NEWS_POST(20),
    /* JADX INFO: Fake field, exist only in values array */
    ALSO_COMMENTED_ON_GROUP_NEWS_POST(21),
    /* JADX INFO: Fake field, exist only in values array */
    SHAREABLE_EVENT_UPDATED(22),
    /* JADX INFO: Fake field, exist only in values array */
    WEIGHT_SCALE_INVITE(28),
    /* JADX INFO: Fake field, exist only in values array */
    SHAREABLE_EVENT_DELETED(91),
    /* JADX INFO: Fake field, exist only in values array */
    SHAREABLE_EVENT_UPDATED(92),
    /* JADX INFO: Fake field, exist only in values array */
    SHAREABLE_EVENT_COURSE_UPDATED(94),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN_GROUP_INVITE(95),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_GROUP_REQUEST_ACCEPTED(96),
    /* JADX INFO: Fake field, exist only in values array */
    LIKED_ON_ACTIVITY(100),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(101),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(104),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(105),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(106),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(107),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(108),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(110),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(111),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(112),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(113),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(114),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(115),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(116),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(117),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(118),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(121),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(122),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(123),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(124),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(126),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(132),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(133),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(TsExtractor.TS_STREAM_TYPE_E_AC3),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(SyslogConstants.LOG_LOCAL1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(137),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(TsExtractor.TS_STREAM_TYPE_DTS),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(SyslogConstants.LOG_LOCAL2),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(147),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(148),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(149),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(150),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(151),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(SyslogConstants.LOG_LOCAL3),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(153),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_LIVETRACK_SENDER_SMS_REMOVED(154),
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EXCLUSIVE_DISCOUNTS(ModuleDescriptor.MODULE_VERSION),
    MANAGED_ACCOUNTS_CHILD_GRADUATED(156);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3372a f180866b = new C3372a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180869e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180870a;

    static {
        f180869e = new w13.c(new a[]{r1, r2, r3, r0, r5, r7, r7, r11, r9, r6, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1});
    }

    private a(int i14) {
        super(str, i);
        this.f180870a = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f180868d.clone();
    }

    /* JADX INFO: renamed from: vz0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvz0/a$a;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3372a {
        public /* synthetic */ C3372a(j jVar) {
            this();
        }

        public static ArrayList a() {
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zR = k1.f37122a.r();
            s3.f23252a.getClass();
            boolean z14 = s3.a("ROLE_MBTESTER") || ((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("child_account_graduation_ui_enabled");
            w13.c cVar = a.f180869e;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                a aVar = (a) next;
                if ((zR && z14) || aVar != a.MANAGED_ACCOUNTS_CHILD_GRADUATED) {
                    arrayListK.add(next);
                }
            }
            ArrayList arrayList = new ArrayList(y.r(arrayListK, 10));
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((a) it.next()).f180870a));
            }
            return arrayList;
        }

        private C3372a() {
        }
    }
}
