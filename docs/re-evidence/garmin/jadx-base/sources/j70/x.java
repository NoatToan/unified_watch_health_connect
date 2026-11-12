package j70;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj70/x;", "", "", Action.KEY_ATTRIBUTE, "contentDesc", "iconRes", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum x {
    UP(0, R.string.lbl_trending_up_content_description, R.drawable.arrow_up),
    DOWN(1, R.string.lbl_trending_down_content_description, R.drawable.arrow_down),
    EQUAL(2, R.string.lbl_trend_maintained, R.drawable.arrow_right);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f97667d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97674c;

    x(int i14, int i15, int i16) {
        this.f97672a = i14;
        this.f97673b = i15;
        this.f97674c = i16;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj70/x$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static x a(Integer num) {
            if (num != null && num.intValue() == 0) {
                return x.UP;
            }
            if (num != null && num.intValue() == 1) {
                return x.DOWN;
            }
            if (num != null && num.intValue() == 2) {
                return x.EQUAL;
            }
            return null;
        }

        public static x b(double d14, double d15) {
            if (d14 == d15) {
                return x.EQUAL;
            }
            return d14 < d15 ? x.UP : x.DOWN;
        }

        private a() {
        }
    }
}
