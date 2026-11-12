package ab1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lab1/l;", "", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "iconResId", "labelResId", "<init>", "(Ljava/lang/String;IILjava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum l {
    /* JADX INFO: Fake field, exist only in values array */
    UPRIGHT(1, "RELAXED", R.drawable.icon_aero_upright, R.string.lbl_upright),
    LOWERED(2, "STANDARD", R.drawable.icon_aero_lowered, R.string.lbl_lowered),
    /* JADX INFO: Fake field, exist only in values array */
    AERO(3, "OPTIMIZED", R.drawable.icon_aero_aero, R.string.lbl_aero);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2599e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2605d;

    l(int i14, String str, int i15, int i16) {
        this.f2602a = i14;
        this.f2603b = str;
        this.f2604c = i15;
        this.f2605d = i16;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lab1/l$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
