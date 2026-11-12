package az;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laz/e;", "Lzy/e;", "Lk22/a;", "provider", "<init>", "(Lk22/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements zy.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k22.a f13665a;

    public e(k22.a aVar) {
        aVar.getClass();
        this.f13665a = aVar;
    }

    @Override // zy.e
    public final List<String> a() {
        return j0.f134944a;
    }

    @Override // zy.e
    public final int b() {
        return 8;
    }

    @Override // zy.e
    public final List<String> c() {
        String[] strArrC = this.f13665a.c(R.array.canned_text_replies);
        return strArrC != null ? u.C(strArrC) : j0.f134944a;
    }

    @Override // zy.e
    public final int d() {
        return 0;
    }

    @Override // zy.e
    public final List<String> e() {
        ArrayList arrayList = new ArrayList();
        k22.a aVar = this.f13665a;
        a0.u(aVar, R.string.device_settings_text_reply_40, arrayList, R.string.device_settings_text_reply_5, R.string.device_settings_text_reply_4);
        a0.u(aVar, R.string.device_settings_text_reply_8, arrayList, R.string.device_settings_text_reply_9, R.string.device_settings_text_reply_10);
        a0.u(aVar, R.string.device_settings_text_reply_11, arrayList, R.string.device_settings_text_reply_13, R.string.device_settings_text_reply_14);
        a0.u(aVar, R.string.device_settings_text_reply_15, arrayList, R.string.device_settings_text_reply_16, R.string.device_settings_text_reply_17);
        a0.u(aVar, R.string.device_settings_text_reply_18, arrayList, R.string.device_settings_text_reply_19, R.string.device_settings_text_reply_20);
        a0.u(aVar, R.string.device_settings_text_reply_21, arrayList, R.string.device_settings_text_reply_22, R.string.device_settings_text_reply_23);
        a0.u(aVar, R.string.device_settings_text_reply_24, arrayList, R.string.device_settings_text_reply_25, R.string.device_settings_text_reply_26);
        a0.u(aVar, R.string.device_settings_text_reply_27, arrayList, R.string.device_settings_text_reply_28, R.string.device_settings_text_reply_29);
        arrayList.add(aVar.getString(R.string.device_settings_text_reply_12));
        return h0.Z(arrayList);
    }
}
