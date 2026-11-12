package com.huami.ui.widget.sleepdial;

import android.content.Context;
import android.os.Vibrator;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/ui/widget/sleepdial/VibrateService;", "", "", "initial", "vibrate", "clear", "Landroid/os/Vibrator;", "a", "Landroid/os/Vibrator;", "vibrator", "Ljava/util/LinkedList;", "", "b", "Ljava/util/LinkedList;", "queue", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "timer", "Landroid/content/Context;", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "alarm-dial_release"}, k = 1, mv = {1, 4, 0})
public final class VibrateService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Vibrator vibrator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LinkedList<Integer> queue = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Timer timer = new Timer();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Context context;

    public VibrateService(@NotNull Context context) {
        this.context = context;
    }

    public final void clear() {
        try {
            this.timer.cancel();
        } catch (Exception unused) {
        }
    }

    public final void initial() {
        if (PermissionChecker.checkSelfPermission(this.context, "android.permission.VIBRATE") == 0) {
            Vibrator vibrator = (Vibrator) ContextCompat.getSystemService(this.context, Vibrator.class);
            if (vibrator != null && vibrator.hasVibrator()) {
                this.vibrator = vibrator;
            }
        } else {
            Log.d("VibrateService", "No permission.");
        }
        this.timer.schedule(new TimerTask() { // from class: com.huami.ui.widget.sleepdial.VibrateService.initial.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (VibrateService.this.queue.size() > 1) {
                    Vibrator vibrator2 = VibrateService.this.vibrator;
                    if (vibrator2 == null) {
                        Intrinsics.throwNpe();
                    }
                    vibrator2.vibrate(30L);
                    VibrateService.this.queue.clear();
                }
            }
        }, 0L, 100L);
        this.timer.purge();
    }

    public final void vibrate() {
        if (this.vibrator == null) {
            return;
        }
        this.queue.add(1);
    }
}
