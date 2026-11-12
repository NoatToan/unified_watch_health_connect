package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.QueueDialog;

/* JADX INFO: loaded from: classes7.dex */
public class fcd extends QueueDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f33850b;

    @Override // com.huawei.ui.commonui.dialog.QueueDialog
    public boolean isCheckTypeInQueue() {
        return true;
    }

    public fcd(Context context, View view) {
        super(context, R.style.DialogFullScreen, 0);
        this.f33850b = view;
        this.f33849a = context;
        b();
    }

    private void b() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        setContentView(this.f33850b);
        d(this.f33850b);
        window.setType(1000);
        window.setBackgroundDrawableResource(R.color.common_black_50alpha);
        ((ImageView) findViewById(R.id.close_img)).setOnClickListener(new View.OnClickListener() { // from class: fce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("MemberGuideDialog", "close btn clicked");
        dismiss();
    }

    private void d(View view) {
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.bottomMargin = (qrs.ad(getContext()) ? qrs.q(getContext()) : 0) + this.f33849a.getResources().getDimensionPixelOffset(e());
            view.setLayoutParams(layoutParams);
        }
    }

    private int e() {
        if (qrs.aa(this.f33849a)) {
            return com.huawei.ui.commonui.R.dimen.health_common_12dp;
        }
        return com.huawei.ui.commonui.R.dimen.health_common_48dp;
    }

    @Override // com.huawei.ui.commonui.dialog.QueueDialog, com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        enqueueShowing(this);
        super.show();
    }
}
