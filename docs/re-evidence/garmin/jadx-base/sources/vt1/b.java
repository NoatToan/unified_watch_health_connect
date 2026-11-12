package vt1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvt1/b;", "", "", "jsonKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED_TODAYS_WORKOUT("COMPLETED_TODAYS_WORKOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED_AS_TODAYS_WRKT("COMPLETED_AS_TODAYS_WRKT"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED_VIA_ACTIVITY("COMPLETED_VIA_ACTIVITY"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED_VIA_SECONDARY_SPORT("COMPLETED_VIA_SECONDARY_SPORT"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED_VIA_PRIMARY_SPORT("COMPLETED_VIA_PRIMARY_SPORT");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f180079b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180081a;

    b(String str) {
        this.f180081a = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt1/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(String str) {
            if (str != null) {
                for (b bVar : b.values()) {
                    if (s.g(bVar.f180081a, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }
}
