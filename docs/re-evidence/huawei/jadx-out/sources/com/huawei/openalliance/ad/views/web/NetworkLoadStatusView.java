package com.huawei.openalliance.ad.views.web;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ab;

/* JADX INFO: loaded from: classes41.dex */
public class NetworkLoadStatusView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f21390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f21391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21392c;
    private a d;
    private ImageView e;
    private TextView f;
    private Button g;

    public interface a {
        void onClick(View view);
    }

    public void setState(int i) {
        hw.a("NetworkLoadStatusView", "setState:%d", Integer.valueOf(i));
        this.f21392c = i;
        if (i == -2) {
            c();
            setChildViewVisibility(8);
        } else if (i == -1) {
            b();
            setChildViewVisibility(8);
        } else {
            if (i != 0) {
                return;
            }
            setChildViewVisibility(0);
        }
    }

    public void setOnEmptyClickListener(a aVar) {
        this.d = aVar;
    }

    public void setErrorText(String str) {
        this.f21390a = str;
    }

    public int getCurrentState() {
        return this.f21392c;
    }

    private void setChildViewVisibility(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() == R.id.status_layout_main) {
                childAt.setVisibility(i == 0 ? 8 : 0);
            } else {
                childAt.setVisibility(i);
            }
        }
    }

    private void c() {
        hw.a("NetworkLoadStatusView", "displayNotNetwork");
        this.f21392c = -2;
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        this.g.setOnClickListener(this.f21391b);
    }

    private void b() {
        hw.a("NetworkLoadStatusView", "displayError");
        this.f21392c = -1;
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.f.setText(this.f21390a);
        this.g.setVisibility(8);
    }

    private void a() {
        ImageView imageView;
        int i;
        if (getChildCount() > 1) {
            throw new IllegalStateException("StatusView can host only one direct child");
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.webview_status_view, this);
        this.e = (ImageView) viewInflate.findViewById(R.id.nonwifi);
        if (ab.c()) {
            imageView = this.e;
            i = R.drawable.opendevice_ic_wlan_emui10;
        } else {
            imageView = this.e;
            i = R.drawable.opendevice_ic_wlan;
        }
        imageView.setImageResource(i);
        this.f = (TextView) viewInflate.findViewById(R.id.network_tip);
        this.g = (Button) viewInflate.findViewById(R.id.privacy_set_network);
        viewInflate.setOnClickListener(this.f21391b);
    }

    public NetworkLoadStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21392c = 1;
        this.f21391b = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.web.NetworkLoadStatusView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NetworkLoadStatusView.this.d == null) {
                    return;
                }
                NetworkLoadStatusView.this.d.onClick(view);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoadStatementView);
        try {
            this.f21390a = typedArrayObtainStyledAttributes.getString(R.styleable.LoadStatementView_nonNetworkText);
            typedArrayObtainStyledAttributes.recycle();
            a();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public NetworkLoadStatusView(Context context) {
        super(context);
        this.f21392c = 1;
        this.f21391b = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.web.NetworkLoadStatusView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NetworkLoadStatusView.this.d == null) {
                    return;
                }
                NetworkLoadStatusView.this.d.onClick(view);
            }
        };
        a();
    }
}
