package defpackage;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lvr;", "sensorType", "Lb4;", "channelDescription", "", PluginDeviceInfo.FMODEL, "", "", "configs", q.f13857a, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayList<String> f33898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ArrayList<String> f33899b;

    @NotNull
    public static final ArrayList<String> c;

    @NotNull
    public static final ArrayList<String> d;

    @NotNull
    public static final ArrayList<String> e;

    @NotNull
    public static final ArrayList<String> f;

    @NotNull
    public static final ArrayList<String> g;

    @NotNull
    public static final ArrayList<String> h;

    @NotNull
    public static final ArrayList<String> i;

    @NotNull
    public static final ArrayList<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final ArrayList<String> f33900k;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33901a;

        static {
            int[] iArr = new int[vr.values().length];
            try {
                iArr[vr.GSENSOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vr.PPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vr.ECG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vr.NMEA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vr.GYRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vr.ADATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[vr.GEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[vr.SPO2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[vr.HR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[vr.PRESSURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f33901a = iArr;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        a4 a4Var = a4.INT_16;
        sb.append(a4Var);
        sb.append(a4Var);
        sb.append(a4Var);
        f33898a = CollectionsKt__CollectionsKt.arrayListOf(sb.toString());
        String strValueOf = String.valueOf(a4Var);
        String strValueOf2 = String.valueOf(a4.UINT_16);
        String strValueOf3 = String.valueOf(a4.UINT_32);
        a4 a4Var2 = a4.INT_32;
        f33899b = CollectionsKt__CollectionsKt.arrayListOf(strValueOf, strValueOf2, strValueOf3, String.valueOf(a4Var2));
        c = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(a4Var), String.valueOf(a4Var2));
        a4 a4Var3 = a4.INT_8;
        d = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(a4Var3), String.valueOf(a4.UINT_8));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a4Var);
        sb2.append(a4Var);
        sb2.append(a4Var);
        e = CollectionsKt__CollectionsKt.arrayListOf(sb2.toString());
        f = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(a4Var3));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a4Var);
        sb3.append(a4Var);
        sb3.append(a4Var);
        g = CollectionsKt__CollectionsKt.arrayListOf(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a4Var2);
        sb4.append(a4Var2);
        sb4.append(a4Var2);
        h = CollectionsKt__CollectionsKt.arrayListOf(sb4.toString());
        i = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(a4Var3));
        j = CollectionsKt__CollectionsKt.arrayListOf(String.valueOf(a4Var));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(a4Var);
        sb5.append(a4Var);
        sb5.append(a4Var);
        f33900k = CollectionsKt__CollectionsKt.arrayListOf(sb5.toString());
    }

    public static final boolean a(@NotNull vr sensorType, @Nullable b4 b4Var) {
        ArrayList<String> arrayList;
        Intrinsics.checkNotNullParameter(sensorType, "sensorType");
        if (b4Var == null) {
            return false;
        }
        switch (a.f33901a[sensorType.ordinal()]) {
            case 1:
                arrayList = f33898a;
                break;
            case 2:
                arrayList = f33899b;
                break;
            case 3:
                arrayList = c;
                break;
            case 4:
                arrayList = d;
                break;
            case 5:
                arrayList = e;
                break;
            case 6:
                arrayList = f;
                break;
            case 7:
                arrayList = g;
                break;
            case 8:
                arrayList = h;
                break;
            case 9:
                arrayList = i;
                break;
            case 10:
                arrayList = j;
                break;
            default:
                arrayList = null;
                break;
        }
        if (arrayList == null) {
            return false;
        }
        return a(arrayList, b4Var.toString());
    }

    public static final boolean a(@NotNull List<String> configs, @NotNull String config) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(config, "config");
        Iterator<T> it = configs.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals((String) it.next(), config)) {
                return true;
            }
        }
        return false;
    }
}
