package az;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Laz/b;", "Lzy/e;", "Lk22/a;", "resourceProvider", "<init>", "(Lk22/a;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements zy.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k22.a f13662a;

    static {
        new a(null);
    }

    public b(k22.a aVar) {
        aVar.getClass();
        this.f13662a = aVar;
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
        String[] strArrC = this.f13662a.c(R.array.canned_text_replies);
        return strArrC != null ? u.C(strArrC) : j0.f134944a;
    }

    @Override // zy.e
    public final int d() {
        return 0;
    }

    @Override // zy.e
    public final List<String> e() {
        String[] strArrC = this.f13662a.c(R.array.canned_call_replies);
        return strArrC != null ? u.C(strArrC) : j0.f134944a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Laz/b$a;", "", "<init>", "()V", "", "DEFAULT_TEXT_REPLY_ON_DEVICE_COUNT", "I", "DEFAULT_CALL_REPLY_ON_DEVICE_COUNT", "DEFAULT_GROUP_TRACK_REPLY_ON_DEVICE_COUNT", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
