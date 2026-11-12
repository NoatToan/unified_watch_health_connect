package db1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldb1/c;", "", "", "actionBarTitle", "nextActionButtonVisibility", "skipActionButtonVisibility", "nextActionButtonTitle", "skipActionButtonTitle", "<init>", "(IIIII)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f58993e;

    public /* synthetic */ c(int i14, int i15, int i16, int i17, int i18, int i19, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, (i19 & 8) != 0 ? R.string.lbl_next : i17, (i19 & 16) != 0 ? R.string.lbl_skip_button : i18);
    }

    public c(int i14, int i15, int i16, int i17, int i18) {
        this.f58989a = i14;
        this.f58990b = i15;
        this.f58991c = i16;
        this.f58992d = i17;
        this.f58993e = i18;
    }
}
