package ohos.ace.adapter;

import android.app.Activity;
import android.os.Build;
import androidx.core.util.Consumer;
import androidx.media3.exoplayer.hls.offline.HlsDownloader$$ExternalSyntheticLambda0;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes46.dex */
public class FoldManager {
    private static final int ANDROID_API_31 = 31;
    private static final String TAG = "FoldManager";
    private static boolean foldAble = false;
    private static int foldStatus;

    private FoldManager() {
    }

    public static boolean isFoldable(Activity activity) {
        FoldingFeature foldingFeature;
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (isOpenFoldListener(activity)) {
            foldingFeature = getFoldingFeatureInvoke(activity);
        } else {
            foldingFeature = getFoldingFeature(activity);
        }
        return foldingFeature != null;
    }

    public static int getFoldStatus(Activity activity) {
        FoldingFeature foldingFeature;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        if (isOpenFoldListener(activity)) {
            foldingFeature = getFoldingFeatureInvoke(activity);
        } else {
            foldingFeature = getFoldingFeature(activity);
        }
        return getStatusFromFeature(activity, foldingFeature);
    }

    public static int getStatusFromFeature(Activity activity, FoldingFeature foldingFeature) {
        if (foldingFeature == null) {
            ALog.e(TAG, "foldingFeature is null.");
            return 0;
        }
        if (foldingFeature.getState() == FoldingFeature.State.FLAT) {
            return 1;
        }
        return foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? 3 : 0;
    }

    public static FoldingFeature getFoldingFeature(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            AtomicReference atomicReference = new AtomicReference();
            WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter = new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.getOrCreate(activity));
            Consumer<WindowLayoutInfo> consumerWindowLayout = getConsumerWindowLayout(activity, atomicReference);
            windowInfoTrackerCallbackAdapter.addWindowLayoutInfoListener(activity, new HlsDownloader$$ExternalSyntheticLambda0(), consumerWindowLayout);
            windowInfoTrackerCallbackAdapter.removeWindowLayoutInfoListener(consumerWindowLayout);
            return (FoldingFeature) atomicReference.get();
        } catch (NoClassDefFoundError e) {
            ALog.e(TAG, "androidx.window is not support!\n" + e.toString());
            return null;
        }
    }

    public static boolean isOpenFoldListener(Activity activity) {
        try {
            return activity.getClass().getMethod("getFoldWindowInfoCallback", new Class[0]).invoke(activity, new Object[0]) != null;
        } catch (IllegalAccessException e) {
            ALog.e(TAG, "invoke WindowInfoCallback fail:" + e.getMessage());
            return false;
        } catch (NoSuchMethodException e2) {
            ALog.e(TAG, "invoke WindowInfoCallback fail:" + e2.getMessage());
            return false;
        } catch (InvocationTargetException e3) {
            ALog.e(TAG, "invoke WindowInfoCallback fail:" + e3.getMessage());
            return false;
        }
    }

    public static FoldingFeature getFoldingFeatureInvoke(Activity activity) {
        try {
            Object objInvoke = activity.getClass().getMethod("getFoldingFeatureFromListener", new Class[0]).invoke(activity, new Object[0]);
            if (objInvoke != null && (objInvoke instanceof FoldingFeature)) {
                return (FoldingFeature) objInvoke;
            }
            return null;
        } catch (IllegalAccessException e) {
            ALog.e(TAG, "invoke getFoldingFeature fail:" + e.getMessage());
            return null;
        } catch (NoSuchMethodException e2) {
            ALog.e(TAG, "invoke getFoldingFeature fail:" + e2.getMessage());
            return null;
        } catch (InvocationTargetException e3) {
            ALog.e(TAG, "invoke getFoldingFeature fail:" + e3.getMessage());
            return null;
        }
    }

    public static void setFoldable(boolean z) {
        foldAble = z;
    }

    public static void setFoldStatus(int i) {
        foldStatus = i;
    }

    public static Consumer<WindowLayoutInfo> getConsumerWindowLayout(final Activity activity, final AtomicReference<FoldingFeature> atomicReference) {
        return new Consumer() { // from class: ohos.ace.adapter.FoldManager$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                activity.runOnUiThread(new Runnable() { // from class: ohos.ace.adapter.FoldManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FoldManager.handleFoldStatusChange(windowLayoutInfo, atomicReference);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleFoldStatusChange(WindowLayoutInfo windowLayoutInfo, final AtomicReference<FoldingFeature> atomicReference) {
        windowLayoutInfo.getDisplayFeatures().stream().filter(new FoldManager$$ExternalSyntheticLambda2(FoldingFeature.class)).map(new FoldManager$$ExternalSyntheticLambda3(FoldingFeature.class)).findFirst().ifPresent(new java.util.function.Consumer() { // from class: ohos.ace.adapter.FoldManager$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                atomicReference.set((FoldingFeature) obj);
            }
        });
    }
}
