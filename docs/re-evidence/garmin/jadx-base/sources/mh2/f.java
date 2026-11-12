package mh2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmh2/f;", "", "", Action.KEY_ATTRIBUTE, "", "unit_string_id", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum f {
    FOOT("foot", R.string.lbl_foot),
    METER("meter", R.string.common_meters_string);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118550b;

    f(String str, int i14) {
        this.f118549a = str;
        this.f118550b = i14;
    }
}
