package dg0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB)\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldg0/a;", "", "", "title", "msgDefault", "msgCustom", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    PRIMARY_EVENT(R.string.primary_event, R.string.primary_event_detail, Integer.valueOf(R.string.primary_event_detail_1)),
    SUPPORTING_EVENT(R.string.supporting_event, R.string.supporting_event_detail, null, 4, null),
    NO_PRIORITY(R.string.no_priority, R.string.no_priority_detail, null, 4, null);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1269a f59507d = new C1269a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f59514c;

    /* synthetic */ a(int i14, int i15, Integer num, int i16, j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: dg0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldg0/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1269a {
        public /* synthetic */ C1269a(j jVar) {
            this();
        }

        private C1269a() {
        }
    }

    a(int i14, int i15, Integer num) {
        this.f59512a = i14;
        this.f59513b = i15;
        this.f59514c = num;
    }
}
