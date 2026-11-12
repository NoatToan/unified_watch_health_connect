package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.util.Optional;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import z6.f;

/* JADX INFO: loaded from: classes2.dex */
public class FrameMetricsRecorder {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Activity activity;
    private final Map<Fragment, FrameMetricsCalculator.PerfFrameMetrics> fragmentSnapshotMap;
    private final f frameMetricsAggregator;
    private boolean isRecording;

    public FrameMetricsRecorder(Activity activity) {
        this(activity, new f(), new HashMap());
    }

    public static boolean isFrameMetricsRecordingSupported() {
        return true;
    }

    private Optional<FrameMetricsCalculator.PerfFrameMetrics> snapshot() {
        if (!this.isRecording) {
            logger.debug("No recording has been started.");
            return Optional.absent();
        }
        SparseIntArray[] sparseIntArrayArr = this.frameMetricsAggregator.f202613a.f202617b;
        if (sparseIntArrayArr == null) {
            logger.debug("FrameMetricsAggregator.mMetrics is uninitialized.");
            return Optional.absent();
        }
        if (sparseIntArrayArr[0] != null) {
            return Optional.of(FrameMetricsCalculator.calculateFrameMetrics(sparseIntArrayArr));
        }
        logger.debug("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return Optional.absent();
    }

    public void start() {
        if (this.isRecording) {
            logger.debug("FrameMetricsAggregator is already recording %s", this.activity.getClass().getSimpleName());
            return;
        }
        f fVar = this.frameMetricsAggregator;
        Activity activity = this.activity;
        f.a aVar = fVar.f202613a;
        aVar.getClass();
        if (f.a.f202614e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f.a.f202614e = handlerThread;
            handlerThread.start();
            f.a.f202615f = new Handler(f.a.f202614e.getLooper());
        }
        for (int i14 = 0; i14 <= 8; i14++) {
            SparseIntArray[] sparseIntArrayArr = aVar.f202617b;
            if (sparseIntArrayArr[i14] == null) {
                if (((1 << i14) & aVar.f202616a) != 0) {
                    sparseIntArrayArr[i14] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.f202619d, f.a.f202615f);
        aVar.f202618c.add(new WeakReference<>(activity));
        this.isRecording = true;
    }

    public void startFragment(Fragment fragment) {
        if (!this.isRecording) {
            logger.debug("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.fragmentSnapshotMap.containsKey(fragment)) {
            logger.debug("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        if (optionalSnapshot.isAvailable()) {
            this.fragmentSnapshotMap.put(fragment, optionalSnapshot.get());
        } else {
            logger.debug("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stop() {
        if (!this.isRecording) {
            logger.debug("Cannot stop because no recording was started");
            return Optional.absent();
        }
        if (!this.fragmentSnapshotMap.isEmpty()) {
            logger.debug("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.fragmentSnapshotMap.clear();
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        try {
            this.frameMetricsAggregator.a(this.activity);
        } catch (IllegalArgumentException | NullPointerException e4) {
            if ((e4 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e4;
            }
            logger.warn("View not hardware accelerated. Unable to collect FrameMetrics. %s", e4.toString());
            optionalSnapshot = Optional.absent();
        }
        f.a aVar = this.frameMetricsAggregator.f202613a;
        SparseIntArray[] sparseIntArrayArr = aVar.f202617b;
        aVar.f202617b = new SparseIntArray[9];
        this.isRecording = false;
        return optionalSnapshot;
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stopFragment(Fragment fragment) {
        if (!this.isRecording) {
            logger.debug("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return Optional.absent();
        }
        if (!this.fragmentSnapshotMap.containsKey(fragment)) {
            logger.debug("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return Optional.absent();
        }
        FrameMetricsCalculator.PerfFrameMetrics perfFrameMetricsRemove = this.fragmentSnapshotMap.remove(fragment);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        if (optionalSnapshot.isAvailable()) {
            return Optional.of(optionalSnapshot.get().deltaFrameMetricsFromSnapshot(perfFrameMetricsRemove));
        }
        logger.debug("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return Optional.absent();
    }

    public FrameMetricsRecorder(Activity activity, f fVar, Map<Fragment, FrameMetricsCalculator.PerfFrameMetrics> map) {
        this.isRecording = false;
        this.activity = activity;
        this.frameMetricsAggregator = fVar;
        this.fragmentSnapshotMap = map;
    }
}
