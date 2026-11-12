package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.huawei.uikit.hwrecyclerview.widget.HwRollbackRuleDetector;

/* JADX INFO: loaded from: classes20.dex */
public class xfq {
    private HwRollbackRuleDetector e;

    public xfq(HwRollbackRuleDetector.RollBackScrollListener rollBackScrollListener) {
        this.e = new HwRollbackRuleDetector(rollBackScrollListener);
    }

    public void a() {
        HwRollbackRuleDetector hwRollbackRuleDetector = this.e;
        if (hwRollbackRuleDetector != null) {
            hwRollbackRuleDetector.c();
        }
    }

    public void b() {
        HwRollbackRuleDetector hwRollbackRuleDetector = this.e;
        if (hwRollbackRuleDetector != null) {
            hwRollbackRuleDetector.d("com.huawei.control.intent.action.RollBackUsedEvent");
        }
    }

    public void d(MotionEvent motionEvent) {
        HwRollbackRuleDetector hwRollbackRuleDetector = this.e;
        if (hwRollbackRuleDetector != null) {
            hwRollbackRuleDetector.c(motionEvent);
        }
    }

    public void d(View view) {
        HwRollbackRuleDetector hwRollbackRuleDetector = this.e;
        if (hwRollbackRuleDetector != null) {
            hwRollbackRuleDetector.b(view);
        }
    }
}
