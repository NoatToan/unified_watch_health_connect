package gv;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgv/a;", "", "", "labelResId", "primaryDescriptionResId", "secondaryDescriptionResId", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    SECURE(Integer.valueOf(R.string.lbl_allow_secure_connections_only_question_mark), Integer.valueOf(R.string.msg_pairing_mode_when_connect_a_new_device), Integer.valueOf(R.string.msg_secure_connect_pedals_with_other_devices)),
    OPEN(Integer.valueOf(R.string.lbl_allow_open_connections_question_mark), Integer.valueOf(R.string.msg_connect_all_supported_devices), Integer.valueOf(R.string.msg_open_connect_pedals_with_other_devices)),
    OFF(null, null, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f79148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f79149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f79150c;

    a(Integer num, Integer num2, Integer num3) {
        this.f79148a = num;
        this.f79149b = num2;
        this.f79150c = num3;
    }
}
