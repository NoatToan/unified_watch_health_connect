package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.huawei.hwcommonmodel.utils.animation.EnterAnimationCallback;
import com.huawei.hwcommonmodel.utils.animation.ExitAnimationCallback;
import com.huawei.hwcommonmodel.utils.animation.ExitAnimationStartCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.SafeIntent;
import com.huawei.ui.device.views.animation.ActivityAnimationCallback;

/* JADX INFO: loaded from: classes16.dex */
public class rfn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lsz f47264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47265b = true;
    private ActivityAnimationCallback d;

    public void b(boolean z) {
        this.f47265b = z;
    }

    public void c(Activity activity, Intent intent, boolean z) {
        if (this.f47265b) {
            d(activity, intent, z);
        }
    }

    public void e(ActivityAnimationCallback activityAnimationCallback) {
        LogUtil.a("ActivityAnimationObject", "exitAnimation mAnimationHelper:", this.f47264a, ",mCallback:", this.d);
        if (!this.f47265b) {
            if (activityAnimationCallback != null) {
                activityAnimationCallback.onProcessExit(false);
            }
        } else {
            lsz lszVar = this.f47264a;
            if (lszVar != null) {
                this.d = activityAnimationCallback;
                lszVar.a();
            }
        }
    }

    public void d(Activity activity) {
        if (activity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) qsp.a(activity, R.id.content);
        lsz lszVar = this.f47264a;
        if (lszVar != null) {
            lszVar.e(viewGroup);
        }
    }

    private void d(Activity activity, Intent intent, boolean z) {
        if (b(activity, intent)) {
            Rect sourceBounds = new SafeIntent(intent).getSourceBounds();
            LogUtil.a("ActivityAnimationObject", "setActivityAnimationHelper start:", Boolean.valueOf(z), ",sourceRect:", sourceBounds);
            ViewGroup viewGroup = (ViewGroup) qsp.a(activity, R.id.content);
            if (viewGroup == null) {
                this.f47264a = null;
                LogUtil.j("ActivityAnimationObject", "view is null");
                return;
            }
            if (!z || sourceBounds == null) {
                viewGroup.setVisibility(0);
                this.f47264a = null;
                LogUtil.j("ActivityAnimationObject", "not from click");
                return;
            }
            viewGroup.setVisibility(4);
            lsz lszVar = new lsz(sourceBounds, viewGroup);
            this.f47264a = lszVar;
            lszVar.b(new ExitAnimationCallback() { // from class: rfn.2
                @Override // com.huawei.hwcommonmodel.utils.animation.ExitAnimationCallback
                public void onExitAnimationEnd() {
                    LogUtil.a("ActivityAnimationObject", "mAnimationHelper onExitAnimationEnd");
                    if (rfn.this.d != null) {
                        rfn.this.d.onProcessExit(true);
                    }
                }
            });
            this.f47264a.c(new EnterAnimationCallback() { // from class: rfn.1
                @Override // com.huawei.hwcommonmodel.utils.animation.EnterAnimationCallback
                public void onEnterAnimationStart() {
                    LogUtil.a("ActivityAnimationObject", "mAnimationHelper onEnterAnimationStart");
                }

                @Override // com.huawei.hwcommonmodel.utils.animation.EnterAnimationCallback
                public void onEnterAnimationEnd() {
                    LogUtil.a("ActivityAnimationObject", "mAnimationHelper onEnterAnimationEnd");
                }
            });
            this.f47264a.d(new ExitAnimationStartCallback() { // from class: rfn.3
                @Override // com.huawei.hwcommonmodel.utils.animation.ExitAnimationStartCallback
                public void onExitAnimationStart() {
                    LogUtil.a("ActivityAnimationObject", "mAnimationHelper onExitAnimationStart");
                }
            });
            this.f47264a.e();
        }
    }

    private boolean b(Activity activity, Intent intent) {
        boolean z;
        if (intent == null) {
            LogUtil.j("ActivityAnimationObject", "intent is null");
            z = false;
        } else {
            z = true;
        }
        if (activity == null) {
            return false;
        }
        return z;
    }
}
