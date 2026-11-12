package com.huawei.openalliance.ad.views.web;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ab;

/* JADX INFO: loaded from: classes12.dex */
public class PureNetworkLoadStatusView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f21394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f21395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21396c;
    private b d;
    private ImageView e;
    private TextView f;
    private Button g;
    private boolean h;
    private boolean i;
    private a j;
    private Integer k;
    private Integer l;

    public interface a {
        void a(PureNetworkLoadStatusView pureNetworkLoadStatusView);
    }

    public interface b {
        void a(View view);
    }

    public void setState(int i) {
        hw.a("PureNetworkLoadStatusView", "setState:%s", Integer.valueOf(i));
        this.f21396c = i;
        if (i == -2) {
            c();
            setChildViewVisibility(8);
        } else if (i == -1) {
            b();
            setChildViewVisibility(8);
        } else if (i == 0 || i == 1) {
            setChildViewVisibility(0);
        }
    }

    public void setOnEmptyClickListener(b bVar) {
        this.d = bVar;
    }

    public void setOnConfigurationChangedListener(a aVar) {
        this.j = aVar;
    }

    public void setErrorText(String str) {
        this.f21394a = str;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        hw.a("PureNetworkLoadStatusView", "onConfigurationChanged");
        if (this.f21396c == 0) {
            return;
        }
        removeAllViews();
        a();
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this);
        }
        setState(this.f21396c);
    }

    public int getCurrentState() {
        return this.f21396c;
    }

    private void setIconRes(boolean z) {
        if (this.h) {
            this.e.setImageResource(R.drawable.hiad_network_error_tv);
        } else if (ab.c()) {
            this.e.setImageResource(z ? R.drawable.opendevice_ic_search_network_emui10 : R.drawable.opendevice_ic_loading_failed_emui10);
        } else {
            this.e.setImageResource(z ? R.drawable.opendevice_ic_search_network : R.drawable.opendevice_ic_loading_failed);
        }
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

    private void setButtonOnDeviceReDraw(boolean z) {
        float f;
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
        if (!this.i || !z) {
            if (this.h) {
                i = -2;
            } else {
                f = 0.33f;
            }
            layoutParams.width = i;
            this.g.setLayoutParams(layoutParams);
        }
        f = 0.5f;
        layoutParams.weight = f;
        i = 0;
        layoutParams.width = i;
        this.g.setLayoutParams(layoutParams);
    }

    private void c() {
        Button button;
        hw.a("PureNetworkLoadStatusView", "displayNotNetwork");
        this.f21396c = -2;
        setIconRes(true);
        int i = 0;
        this.e.setVisibility(0);
        this.f.setText(this.f21394a);
        this.f.setVisibility(0);
        if (this.h) {
            button = this.g;
            i = 8;
        } else {
            this.g.setOnClickListener(this.f21395b);
            this.g.requestFocus();
            button = this.g;
        }
        button.setVisibility(i);
    }

    private int c(View view) {
        if (this.l == null) {
            this.l = Integer.valueOf(a(view, 0.5f));
        }
        return this.l.intValue();
    }

    private void b() {
        hw.a("PureNetworkLoadStatusView", "displayError");
        this.f21396c = -1;
        setIconRes(false);
        this.e.setVisibility(0);
        this.f.setText(getResources().getString(this.h ? R.string.hiad_net_error : R.string.hiad_page_load_failed));
        this.f.setVisibility(0);
        this.g.setVisibility(8);
    }

    private int b(View view) {
        if (this.k == null) {
            this.k = Integer.valueOf(a(view, 0.4f));
        }
        return this.k.intValue();
    }

    private void a(View view, boolean z) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.addRule(10);
        layoutParams.topMargin = z ? b(view) : c(view);
        this.e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (getResources().getConfiguration().orientation == 1) {
            a(view, true);
            setButtonOnDeviceReDraw(true);
        } else {
            if (!this.i) {
                a(view, false);
            }
            setButtonOnDeviceReDraw(false);
        }
    }

    private void a() {
        hw.a("PureNetworkLoadStatusView", "initView");
        if (getChildCount() > 1) {
            throw new IllegalStateException("StatusView can host only one direct child");
        }
        Context context = getContext();
        boolean zO = ab.o(context);
        this.i = zO;
        this.h = !zO && ab.j(context);
        final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pure_webview_status_view, this);
        this.e = (ImageView) viewInflate.findViewById(R.id.error_icon);
        this.f = (TextView) viewInflate.findViewById(R.id.error_msg);
        this.g = (Button) viewInflate.findViewById(R.id.privacy_set_network);
        viewInflate.setOnClickListener(this.f21395b);
        viewInflate.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.web.PureNetworkLoadStatusView.1
            @Override // java.lang.Runnable
            public void run() {
                PureNetworkLoadStatusView.this.a(viewInflate);
            }
        });
    }

    private int a(View view, float f) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int height = ((((int) (displayMetrics.heightPixels * f)) - displayMetrics.heightPixels) + view.getHeight()) - (this.e.getLayoutParams().height / 2);
        hw.a("PureNetworkLoadStatusView", "topMargin:%s", Integer.valueOf(height));
        return height;
    }

    public PureNetworkLoadStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21396c = 1;
        this.f21395b = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.web.PureNetworkLoadStatusView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PureNetworkLoadStatusView.this.d == null) {
                    return;
                }
                PureNetworkLoadStatusView.this.d.a(view);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoadStatementView);
        try {
            this.f21394a = typedArrayObtainStyledAttributes.getString(R.styleable.LoadStatementView_nonNetworkText);
            typedArrayObtainStyledAttributes.recycle();
            a();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public PureNetworkLoadStatusView(Context context) {
        super(context);
        this.f21396c = 1;
        this.f21395b = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.web.PureNetworkLoadStatusView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PureNetworkLoadStatusView.this.d == null) {
                    return;
                }
                PureNetworkLoadStatusView.this.d.a(view);
            }
        };
        a();
    }
}
