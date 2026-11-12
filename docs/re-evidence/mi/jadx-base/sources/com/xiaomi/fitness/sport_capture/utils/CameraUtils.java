package com.xiaomi.fitness.sport_capture.utils;

import android.graphics.Point;
import android.util.Size;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_capture.utils.CameraUtils;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/CameraUtils;", "", "<init>", "()V", "TAG", "", "MIN_SIZE", "", "chooseOptimalSize", "Landroid/util/Size;", "choices", "", "respectRatio", "Landroid/graphics/Point;", "defaultSize", "([Landroid/util/Size;Landroid/graphics/Point;Landroid/util/Size;)Landroid/util/Size;", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCameraUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraUtils.kt\ncom/xiaomi/fitness/sport_capture/utils/CameraUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1863#2,2:46\n*S KotlinDebug\n*F\n+ 1 CameraUtils.kt\ncom/xiaomi/fitness/sport_capture/utils/CameraUtils\n*L\n32#1:46,2\n*E\n"})
public final class CameraUtils {

    @NotNull
    public static final CameraUtils INSTANCE = new CameraUtils();
    private static final int MIN_SIZE = 2073600;

    @NotNull
    private static final String TAG = "CameraUtils";

    private CameraUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Size chooseOptimalSize(@NotNull Size[] choices, @NotNull Point respectRatio, @NotNull Size defaultSize) {
        Intrinsics.checkNotNullParameter(choices, "choices");
        Intrinsics.checkNotNullParameter(respectRatio, "respectRatio");
        Intrinsics.checkNotNullParameter(defaultSize, "defaultSize");
        ArrayList<Size> arrayList = new ArrayList();
        boolean z = false;
        for (Size size : choices) {
            if (Math.abs((size.getHeight() / size.getWidth()) - (respectRatio.y / respectRatio.x)) <= 0.02d) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            Logger.i(TAG, "choose default size");
            return defaultSize;
        }
        final Function2 function2 = new Function2() { // from class: ei3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(CameraUtils.chooseOptimalSize$lambda$0((Size) obj, (Size) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: fi3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CameraUtils.chooseOptimalSize$lambda$1(function2, obj, obj2);
            }
        });
        Object obj = null;
        for (Size size2 : arrayList) {
            if (size2.getWidth() * size2.getHeight() >= MIN_SIZE && !z) {
                obj = size2;
                z = true;
            }
        }
        if (obj == null) {
            obj = arrayList.get(arrayList.size() - 1);
        }
        Logger.i(TAG, "choose size:" + obj);
        Intrinsics.checkNotNull(obj);
        return (Size) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chooseOptimalSize$lambda$0(Size size, Size size2) {
        return (size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chooseOptimalSize$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}
