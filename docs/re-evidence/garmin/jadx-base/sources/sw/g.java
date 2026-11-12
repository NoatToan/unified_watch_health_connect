package sw;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import o13.p;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsw/g;", "Lgz/a;", "Loz/a;", "chart", "<init>", "(Loz/a;)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends gz.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oz.a f161055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yw.b f161056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f161057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sw.a f161058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p<Float, Float> f161059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DateTimeFormatter f161060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTimeFormatter f161061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f161062k;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(oz.a aVar) {
        aVar.getClass();
        Context context = aVar.getContext();
        context.getClass();
        super(context);
        this.f161055d = aVar;
        this.f161056e = new yw.b(this.f80356a);
        this.f161057f = new ArrayList();
        this.f161059h = new p<>(Float.valueOf(5.0f), Float.valueOf(2.5f));
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM d");
        dateTimeFormatterForPattern.getClass();
        this.f161060i = dateTimeFormatterForPattern;
        DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern("yyyy-MM-dd");
        dateTimeFormatterForPattern2.getClass();
        this.f161061j = dateTimeFormatterForPattern2;
        this.f161062k = this.f80356a.getColor(R.color.blood_pressure_chart_candlesticks_background);
        this.f80357b = 5;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lsw/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "WEEKLY_CANDLE_SHADOW_WIDTH", "F", "DAILY_CANDLE_SHADOW_WIDTH", "MIN_CANDLE_SHADOW_OFFSET", "", "CANDLE_COLOR_ALPHA", "I", "DEFAULT_Y_LABEL_STEP", "DEFAULT_LABEL_SIZE", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
