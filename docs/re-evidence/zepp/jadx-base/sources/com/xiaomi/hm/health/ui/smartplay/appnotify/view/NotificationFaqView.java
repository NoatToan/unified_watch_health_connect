package com.xiaomi.hm.health.ui.smartplay.appnotify.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.ui.smartplay.appnotify.WebBrowserUtils;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class NotificationFaqView extends FrameLayout {
    private TextView a;
    private String b;
    private String c;
    private final Lazy<DeviceManagerApi> d;

    public enum FaqType {
        FAQ_NOTIFICATION,
        FAQ_CALL
    }

    public NotificationFaqView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, View view) {
        WebBrowserUtils.jump2WebBrowser(context, this.c, this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        getLayoutParams().height = -2;
        getLayoutParams().width = -1;
    }

    public void showFaq(String str, FaqType faqType) {
        this.b = str;
        HMDeviceSource boundDeviceSource = this.d.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        if (!DeviceXBuilder.INSTANCE.isFlavorZepp()) {
            this.c = WebBrowserUtils.getZeppLifeFaqUrl(Boolean.valueOf(faqType == FaqType.FAQ_NOTIFICATION), boundDeviceSource);
        } else if (faqType == FaqType.FAQ_NOTIFICATION) {
            this.c = WebBrowserUtils.URL_NOTIFICATION_FAQ;
        } else {
            this.c = WebBrowserUtils.URL_CALL_FAQ;
        }
    }

    public NotificationFaqView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NotificationFaqView(@NonNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = KoinJavaComponent.inject(DeviceManagerApi.class);
        FrameLayout.inflate(context, R.layout.view_notification_faq, this);
        TextView textView = (TextView) findViewById(R.id.tv_faq);
        this.a = textView;
        textView.getPaint().setFlags(8);
        this.a.getPaint().setAntiAlias(true);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: bg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(context, view);
            }
        });
        post(new Runnable() { // from class: cg5
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
    }
}
