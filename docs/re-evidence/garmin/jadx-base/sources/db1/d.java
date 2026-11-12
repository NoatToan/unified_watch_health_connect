package db1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldb1/d;", "", "", Constants.ScionAnalytics.PARAM_LABEL, TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/String;III)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    BEFOREMEAL(R.string.pregnancy_before_meal, R.color.pregnancy_glucose_before_meal),
    AFTERMEAL(R.string.pregnancy_after_meal, R.color.violet_40),
    BEFOREBED(R.string.pregnancy_before_bed, R.color.blue_40),
    OTHER(R.string.lbl_other, R.color.gray_45_static);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58994c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59001b;

    d(int i14, int i15) {
        this.f59000a = i14;
        this.f59001b = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb1/d$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
