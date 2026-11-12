package zb0;

import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzb0/x0;", "", "", "partNumber", "", "lblRes", "imgUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum x0 {
    /* JADX INFO: Fake field, exist only in values array */
    HRM_TRI_AND_SWIM("1743", R.string.activities_hrm_tri_swim_name, "https://res.cloudinary.com/it-production/image/upload/v1685479803/Product_Images/en/products/010-11254-03/v/c1_01_md.png"),
    RUNNING_DYNAMICS_POD("2593", R.string.activities_running_dynamics_pod_name, "https://static.garmincdn.com/com.garmin.connect/content/images/device-images/running-dynamics-pod.png"),
    /* JADX INFO: Fake field, exist only in values array */
    HRM_DUAL("3299", R.string.activities_hrm_dual_name, "https://res.cloudinary.com/it-production/image/upload/v1685476694/Product_Images/en/products/010-12883-00/v/c1_01_md.png");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f203871b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f203872c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203875a;

    static {
        x0[] x0VarArrValues = values();
        int iA = p13.t0.a(x0VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (x0 x0Var : x0VarArrValues) {
            linkedHashMap.put(x0Var.f203875a, x0Var);
        }
        f203872c = linkedHashMap;
    }

    x0(String str, int i14, String str2) {
        this.f203875a = str;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzb0/x0$a;", "", "<init>", "()V", "", "", "Lzb0/x0;", "map", "Ljava/util/Map;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
