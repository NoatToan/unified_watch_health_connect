package defpackage;

import android.os.Build;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SurfaceConfig;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class qk8 implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f31587a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31588a;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            f31588a = iArr;
            try {
                iArr[SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31588a[SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31588a[SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean b() {
        return RomUtils.SAMSUNG.equalsIgnoreCase(Build.BRAND) && f31587a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean c() {
        return b();
    }

    public Size a(SurfaceConfig.ConfigType configType) {
        if (!b()) {
            return null;
        }
        int i = a.f31588a[configType.ordinal()];
        if (i == 1) {
            return new Size(1920, Constants.FHD_WIDTH);
        }
        if (i == 2) {
            return new Size(1280, HMSedentaryConfig.INGORE_START_INDEX);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
