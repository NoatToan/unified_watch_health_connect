package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.OneTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\rJ\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0011"}, d2 = {"Lt;", "", "Livs;", "ext", "", OneTrack.Param.PKG, "", "eventId", "Lfn;", PluginDeviceInfo.FMODEL, "(Livs;Ljava/lang/String;I)Lfn;", "contact", TSMAuthContants.PARAM_PHONE_NUMBER, "(Ljava/lang/String;Ljava/lang/String;)Lfn;", "()Lfn;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class C3623t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3623t f34140a = new C3623t();

    /* JADX INFO: renamed from: t$a */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34141a;

        static {
            int[] iArr = new int[fd.values().length];
            try {
                iArr[fd.ALERT_SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.ALERT_LOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34141a = iArr;
        }
    }

    @NotNull
    public final fn a(@NotNull ivs ext, @NotNull String pkg, int eventId) {
        int i;
        Intrinsics.checkNotNullParameter(ext, "ext");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        fd fdVarH = ext.h();
        int i2 = fdVarH == null ? -1 : a.f34141a[fdVarH.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? 250 : 128;
        } else {
            i = 5;
        }
        if (eventId != 0 && eventId != 1) {
            if (eventId == 2) {
                return new fn(ext.f(), 250, eventId, null, null, null, null, null, 0, 504, null);
            }
            throw new IllegalArgumentException("eventId is wrong");
        }
        int iF = ext.f();
        String strE = ext.e();
        String str = strE == null ? "" : strE;
        String strJ = ext.j();
        String str2 = strJ == null ? "" : strJ;
        String strG = ext.g();
        return new fn(iF, i, 0, pkg, str, str2, strG == null ? "" : strG, null, 0, 388, null);
    }

    @NotNull
    public final fn a(@Nullable String contact, @Nullable String phoneNumber) {
        return new fn(0, 3, 0, null, null, contact == null ? "" : contact, null, phoneNumber == null ? "" : phoneNumber, !TextUtils.isEmpty(phoneNumber) ? 1 : 0, 93, null);
    }

    @NotNull
    public final fn a() {
        return new fn(0, 3, 2, null, null, null, null, null, 0, 505, null);
    }
}
