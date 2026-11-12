package e50;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/g;", "", "", "progressMessageResId", "errorMessageResId", "<init>", "(Ljava/lang/String;III)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    OPERATION_CHANGE_PRIVACY(R.string.msg_course_update_privacy, R.string.msg_course_privacy_update_fail),
    OPERATION_FAVORITE_COURSE(0, R.string.msg_course_favorite_fail),
    OPERATION_UNFAVORITE_COURSE(0, R.string.msg_course_unfavorite_fail),
    OPERATION_DUPLICATE_COURSE(R.string.msg_duplicate_course_progress, R.string.msg_course_duplicate_fail),
    OPERATION_DELETE_COURSE(R.string.msg_delete_course_progress, R.string.msg_course_delete_fail),
    OPERATION_SEND_TO_DEVICE(R.string.msg_course_send_to_device_progress, R.string.msg_course_send_to_device_fail),
    OPERATION_SEND_PACEBAND_TO_DEVICE(R.string.msg_pacepro_send_to_device_progress, R.string.msg_pacepro_send_to_device_fail),
    OPERATION_SEND_POWER_GUIDE_TO_DEVICE(R.string.power_guide_send_to_device_confirmation, R.string.power_guide_send_to_the_device_error);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63016b;

    g(int i14, int i15) {
        this.f63015a = i14;
        this.f63016b = i15;
    }
}
