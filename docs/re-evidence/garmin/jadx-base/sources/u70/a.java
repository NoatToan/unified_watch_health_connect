package u70;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B=\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu70/a;", "", "", "labelResId", "Lc22/g2;", "onDemandLabelResId", "msgResId", "drawableRes", "onDemandMessageResId", "<init>", "(Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    ESSENTIALS(R.string.lbl_essentials, null, R.string.msg_essentials_short_description, R.drawable.essentials, null, 18, null),
    IN_FOCUS(R.string.lbl_in_focus, null, R.string.msg_in_focus_short_description, R.drawable.in_focus, null, 18, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f169388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f169389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f169390e;

    /* synthetic */ a(int i14, String str, int i15, int i16, String str2, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? 0 : i15, i16, (i17 & 16) != 0 ? null : str2);
    }

    a(int i14, String str, int i15, int i16, String str2) {
        this.f169386a = i14;
        this.f169387b = str;
        this.f169388c = i15;
        this.f169389d = i16;
        this.f169390e = str2;
    }
}
