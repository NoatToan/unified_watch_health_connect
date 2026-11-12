package cj2;

import com.garmin.android.gncs.NotificationConstants;
import java.util.concurrent.atomic.AtomicReference;
import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcj2/a;", "", "<init>", "()V", "a", "b", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27739a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p<Boolean, Integer> f27740b = new p<>(Boolean.TRUE, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<String> f27741c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String> f27742d = new AtomicReference<>();

    /* JADX INFO: renamed from: cj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcj2/a$a;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC0424a {
        ADDRESS("Address");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27745a;

        EnumC0424a(String str) {
            this.f27745a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcj2/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        INVALID_NUMBER,
        REQUIRED,
        INVALID,
        INVALID_STATE_CODE_FOR_COUNTRY,
        REQUIRED_STATE_CODE_FOR_COUNTRY,
        /* JADX INFO: Fake field, exist only in values array */
        LENGTH_TOO_LONG
    }

    private a() {
    }

    public static p a() {
        return f27740b;
    }
}
