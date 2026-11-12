package com.huawei.uikit.phone.hwrecyclerview.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.huawei.operation.utils.Constants;
import com.huawei.uikit.hwrecyclerview.R;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwCompoundEventDetector;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwGenericEventDetector;
import com.huawei.uikit.phone.hwunifiedinteract.widget.HwKeyEventDetector;

/* JADX INFO: loaded from: classes2.dex */
public class HwRecyclerView extends com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntentFilter f29841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29842c;
    private boolean d;
    private boolean e;
    private BroadcastReceiver g;

    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && Constants.CLICK_STATUS_BAR_ACTION.equals(intent.getAction())) {
                HwRecyclerView.this.h();
            }
        }
    }

    public HwRecyclerView(Context context) {
        super(context);
        this.g = new e();
        d(super.getContext(), (AttributeSet) null, R.attr.hwRecyclerViewStyle);
    }

    private void c() {
        Context context;
        if (!this.e || (context = this.f29842c) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.g);
            this.e = false;
        } catch (IllegalArgumentException unused) {
            Log.w("HwRecyclerView", "Receiver not registered");
        }
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        if (context.getApplicationContext() != null) {
            this.f29842c = context.getApplicationContext();
        } else {
            this.f29842c = context;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.huawei.uikit.phone.hwrecyclerview.R.styleable.HwRecyclerView, i, com.huawei.uikit.phone.hwrecyclerview.R.style.Widget_Emui_HwRecyclerView);
        this.d = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.phone.hwrecyclerview.R.styleable.HwRecyclerView_hwScrollTopEnable, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
        if (this.e) {
            this.f29647a.d(this);
        }
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView
    public void setScrollTopEnable(boolean z) {
        if (z != this.d) {
            this.d = z;
            if (!z) {
                c();
                this.f29647a.a();
            } else {
                e();
                if (this.e) {
                    this.f29647a.d(this);
                }
            }
        }
    }

    private void e() {
        if (!this.d || this.e || this.f29842c == null) {
            return;
        }
        if (this.f29841b == null) {
            this.f29841b = new IntentFilter(Constants.CLICK_STATUS_BAR_ACTION);
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f29842c.registerReceiver(this.g, this.f29841b, Constants.SYSTEM_UI_PERMISSION, null, 2);
            } else {
                this.f29842c.registerReceiver(this.g, this.f29841b, Constants.SYSTEM_UI_PERMISSION, null);
            }
            this.e = true;
        } catch (ReceiverCallNotAllowedException unused) {
            Log.w("HwRecyclerView", "There is a problem with the APP application scenario:BroadcastReceiver components are not allowed to register to receive intents");
            this.e = false;
        } catch (IllegalStateException unused2) {
            Log.w("HwRecyclerView", "registerReceiver IllegalStateException");
            this.e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public HwCompoundEventDetector d() {
        return new HwCompoundEventDetector(getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public HwGenericEventDetector a() {
        return new HwGenericEventDetector(getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public HwKeyEventDetector i() {
        return new HwKeyEventDetector(getContext());
    }

    public HwRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new e();
        d(super.getContext(), attributeSet, R.attr.hwRecyclerViewStyle);
    }

    public HwRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new e();
        d(super.getContext(), attributeSet, i);
    }
}
