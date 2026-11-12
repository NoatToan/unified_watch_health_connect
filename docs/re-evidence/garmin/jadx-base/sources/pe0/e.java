package pe0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lpe0/e;", "", "<init>", "()V", "b", "a", "Lpe0/e$a;", "Lpe0/e$b;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpe0/e$a;", "Lpe0/e;", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityItem", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityListItemDTO f137418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActivityListItemDTO activityListItemDTO) {
            super(null);
            activityListItemDTO.getClass();
            this.f137418a = activityListItemDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f137418a, ((a) obj).f137418a);
        }

        public final int hashCode() {
            return this.f137418a.hashCode();
        }

        public final String toString() {
            return "Activity(activityItem=" + this.f137418a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpe0/e$b;", "Lpe0/e;", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;)V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f137419a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f137419a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f137419a, ((b) obj).f137419a);
        }

        public final int hashCode() {
            return this.f137419a.hashCode();
        }

        public final String toString() {
            return am.j.m("DateHeader(label=", this.f137419a, ")");
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }
}
