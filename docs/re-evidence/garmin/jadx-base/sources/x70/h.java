package x70;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx70/h;", "", "", "titleTextRes", "descriptionTextRes", "primaryButtonTextRes", "tertiaryButtonTextRes", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/Integer;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h {
    USER_WITH_DEVICE(R.string.msg_welcome_to_garmin_connect, R.string.wizard_new_account_explanation, Integer.valueOf(R.string.smart_scale_label_get_started), null),
    NO_DEVICE(R.string.msg_welcome_to_garmin_connect, R.string.msg_home_intro_add_device_description, Integer.valueOf(R.string.txt_add_device), Integer.valueOf(R.string.lbl_explore_products));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f189416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f189417d;

    h(int i14, int i15, Integer num, Integer num2) {
        this.f189414a = i14;
        this.f189415b = i15;
        this.f189416c = num;
        this.f189417d = num2;
    }
}
