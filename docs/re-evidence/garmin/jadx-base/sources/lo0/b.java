package lo0;

import com.garmin.android.apps.connectmobile.R;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f113999a = a.f114000a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llo0/b$a;", "", "<init>", "()V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f114000a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f114001b = R.color.palette_red_15;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f114002c = R.color.palette_blue_26;

        private a() {
        }
    }

    boolean a();

    float b();

    String c(LocalDate localDate, LocalDate localDate2);
}
