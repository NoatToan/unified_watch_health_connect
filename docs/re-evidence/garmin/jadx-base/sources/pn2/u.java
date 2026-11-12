package pn2;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpn2/u;", "", "", "dtoValue", "", "stringResource", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum u {
    MALE("0", R.string.lbl_gender_male),
    /* JADX INFO: Fake field, exist only in values array */
    FEMALE(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, R.string.lbl_gender_female),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SPECIFIED("0", R.string.lbl_gender_not_specified);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138812b;

    u(String str, int i14) {
        this.f138811a = str;
        this.f138812b = i14;
    }
}
