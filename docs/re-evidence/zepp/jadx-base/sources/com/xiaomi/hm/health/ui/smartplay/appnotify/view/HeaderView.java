package com.xiaomi.hm.health.ui.smartplay.appnotify.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes22.dex */
public class HeaderView extends LinearLayout {
    private ListTile a;
    private ListTile b;
    private OnHeaderClickedListener c;
    private NotificationFaqView d;
    private ListTile e;
    private boolean f;
    private TextView g;

    public interface OnHeaderClickedListener {
        void onAwakeCheckedChanged(boolean z, boolean z2);

        void onNotifCheckedChanged(boolean z, boolean z2);

        void onReplyManagementClicked();
    }

    public HeaderView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(CompoundButton compoundButton, boolean z) {
        OnHeaderClickedListener onHeaderClickedListener = this.c;
        if (onHeaderClickedListener != null) {
            onHeaderClickedListener.onNotifCheckedChanged(z, compoundButton.isPressed());
        }
        showFaq(z);
        if (!z) {
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            showFaq(false);
            this.g.setVisibility(0);
            return;
        }
        this.b.setVisibility(0);
        if (this.f) {
            this.e.setVisibility(0);
        }
        showFaq(true);
        this.g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(CompoundButton compoundButton, boolean z) {
        OnHeaderClickedListener onHeaderClickedListener = this.c;
        if (onHeaderClickedListener != null) {
            onHeaderClickedListener.onAwakeCheckedChanged(z, compoundButton.isPressed());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        OnHeaderClickedListener onHeaderClickedListener = this.c;
        if (onHeaderClickedListener != null) {
            onHeaderClickedListener.onReplyManagementClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        getLayoutParams().height = -2;
        getLayoutParams().width = -1;
    }

    public void initView() {
        this.a = (ListTile) findViewById(R.id.notification_enable);
        this.b = (ListTile) findViewById(R.id.awake_switch);
        this.d = (NotificationFaqView) findViewById(R.id.tv_notification_faq);
        this.e = (ListTile) findViewById(R.id.item_reply_management);
        this.g = (TextView) findViewById(R.id.tv_desc_notification);
        this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ks3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.e(compoundButton, z);
            }
        });
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: js3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.f(compoundButton, z);
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: is3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g(view);
            }
        });
    }

    public void setAwakeChecked(boolean z) {
        this.b.setChecked(z);
    }

    public void setNotifChecked(boolean z) {
        this.a.setChecked(z);
        if (DeviceXBuilder.INSTANCE.isFlavorZepp()) {
            showFaq(z);
        }
    }

    public void setOnHeaderClickedListener(OnHeaderClickedListener onHeaderClickedListener) {
        this.c = onHeaderClickedListener;
    }

    public void showFaq(boolean z) {
        if (z) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        this.d.showFaq(getContext().getString(R.string.earbud_notify), NotificationFaqView.FaqType.FAQ_NOTIFICATION);
    }

    public void showMsgReply(boolean z) {
        this.f = z;
        if (z) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    public HeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(context, R.layout.view_app_notification_header, this);
        setOrientation(1);
        initView();
        post(new Runnable() { // from class: ls3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
    }
}
