package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lla;", "", "Lkd;", "device", "Lga;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f24814a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, Integer> f24815b = new LinkedHashMap();

    @NotNull
    public static final Map<Integer, ga> c = new LinkedHashMap();

    @NotNull
    public static String d = "";

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lla$a;", "", "", "fileCachedDir", "Ljava/lang/String;", "", "", "hashCode2DeviceID", "Ljava/util/Map;", "Lga;", "transferAppletApis", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final ga a(@NotNull kd device) throws Exception {
        Object objM886constructorimpl;
        Integer num;
        Intrinsics.checkNotNullParameter(device, "device");
        int iHashCode = device.hashCode();
        g4s g4sVarO = device.O();
        String strG = g4sVarO != null ? g4sVarO.G() : null;
        if (strG == null) {
            throw new Exception("Get device id failed");
        }
        Map<Integer, ga> map = c;
        if (map.containsKey(Integer.valueOf(iHashCode)) && (num = f24815b.get(strG)) != null && num.intValue() == iHashCode) {
            return map.get(Integer.valueOf(iHashCode));
        }
        Map<String, Integer> map2 = f24815b;
        TypeIntrinsics.asMutableMap(map).remove(map2.get(strG));
        map2.remove(strG);
        try {
            Result.Companion companion = Result.Companion;
            ha haVar = new ha(device, d);
            map.put(Integer.valueOf(iHashCode), haVar);
            map2.put(strG, Integer.valueOf(iHashCode));
            objM886constructorimpl = Result.m886constructorimpl(haVar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        return (ga) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
    }
}
