package com.xiaomi.hm.health.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LifecycleObserver;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes22.dex */
public class BaseAdView extends FrameLayout implements LifecycleObserver {
    private String a;
    private String b;
    private int c;
    private OnEnterClickedListener d;
    public FrameLayout infoLayout;

    public interface OnEnterClickedListener {
        void onEnterClicked(BaseAdView view);
    }

    public BaseAdView(@NonNull Context context) {
        this(context, null);
    }

    private void b() {
        ((TextView) findViewById(R.id.app_name)).setText(this.a);
        ((TextView) findViewById(R.id.skip_text)).setText(this.b);
        ImageView imageView = (ImageView) findViewById(R.id.app_logo);
        int i = this.c;
        if (i != -1) {
            imageView.setImageResource(i);
        }
        findViewById(R.id.start_up_enter_btn).setOnClickListener(new View.OnClickListener() { // from class: on
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(view);
            }
        });
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.launch_content);
        this.infoLayout = (FrameLayout) findViewById(R.id.start_up_bottom);
        d(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        OnEnterClickedListener onEnterClickedListener = this.d;
        if (onEnterClickedListener != null) {
            onEnterClickedListener.onEnterClicked(this);
        }
    }

    public void d(ViewGroup viewGroup) {
    }

    public void setonEnterClickedListener(OnEnterClickedListener listener) {
        this.d = listener;
    }

    public BaseAdView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseAdView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, com.xiaomi.hm.health.R.styleable.BaseAdView, 0, defStyleAttr);
        this.a = typedArrayObtainStyledAttributes.getString(1);
        this.b = typedArrayObtainStyledAttributes.getString(2);
        this.c = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.inflate(context, R.layout.view_base_launch, this);
        b();
        setVisibility(8);
    }
}
