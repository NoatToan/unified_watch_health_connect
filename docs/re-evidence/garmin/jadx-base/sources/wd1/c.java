package wd1;

import c22.j0;
import d53.w;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwd1/c;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f184378a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd1/c$a;", "", "<init>", "()V", "", "REMINDER_WEEKLY", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(List list) {
            StringBuilder sb3 = new StringBuilder();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c.f184378a.getClass();
                        DateTime dateTimePlusMinutes = DateTime.now().withTimeAtStartOfDay().plusMinutes(iIntValue);
                        j0.f23099a.getClass();
                        sb3.append(String.valueOf(dateTimePlusMinutes == null ? null : j0.C(dateTimePlusMinutes.getHourOfDay(), dateTimePlusMinutes.getMinuteOfHour())));
                        sb3.append(", ");
                    }
                }
            }
            return w.Q(", ", sb3).toString();
        }

        private a() {
        }
    }
}
