package ct;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lct/a;", "", "Ll22/b;", "resolver", "", "deviceDisplayName", "<init>", "(Ll22/b;Ljava/lang/String;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f55466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55467b;

    /* JADX INFO: renamed from: ct.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1201a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55468a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.SAVING_ACTIVITY_DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ACTIVITY_SAVED_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.DEVICE_RECONNECTED_ACTIVITY_SAVED_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55468a = iArr;
        }
    }

    public a(l22.b bVar, String str) {
        bVar.getClass();
        str.getClass();
        this.f55466a = bVar;
        this.f55467b = str;
    }

    public final c a(b bVar) {
        bVar.getClass();
        int i14 = C1201a.f55468a[bVar.ordinal()];
        String str = this.f55467b;
        l22.b bVar2 = this.f55466a;
        if (i14 == 1) {
            return new c(bVar2.getString(R.string.lbl_saving_activity), bVar2.a(R.string.msg_device_saving_activity, str));
        }
        if (i14 == 2) {
            return new c(bVar2.getString(R.string.lbl_activity_saved), bVar2.a(R.string.msg_view_activity_after_device_sync, str));
        }
        if (i14 == 3) {
            return new c(bVar2.a(R.string.msg_device_found_activity_saved, str), bVar2.a(R.string.msg_view_activity_after_device_sync, str));
        }
        u0.r();
        return null;
    }
}
