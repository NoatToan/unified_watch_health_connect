package com.xiaomi.hm.health.relation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.relation.FriendManager;
import com.xiaomi.hm.health.relation.R;

/* JADX INFO: loaded from: classes21.dex */
public class CareButton extends LinearLayout implements View.OnClickListener {
    public static final int INIT = 0;
    public static final int LOADING = 1;
    public static final int WAITING = 2;
    private static final int i = 10;
    private static final int j = 10;
    private final TextView a;
    private int b;
    private Context c;
    private boolean d;
    private FriendManager e;
    private View.OnClickListener f;
    private int g;
    private OnStatusChangedListener h;

    public interface OnStatusChangedListener {
        void onStatusChanged(View view, int i);
    }

    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            CareButton.this.b(this.a - 1);
        }
    }

    public CareButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        if (i2 != 0) {
            postDelayed(new a(i2), 1000L);
            return;
        }
        this.b = 0;
        OnStatusChangedListener onStatusChangedListener = this.h;
        if (onStatusChangedListener != null) {
            onStatusChangedListener.onStatusChanged(this, 0);
        }
        this.g = 0;
        setEnabled(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!FriendManager.getInstance().readUserGuideState(getContext())) {
            View.OnClickListener onClickListener = this.f;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        if (this.b == 1) {
            return;
        }
        int i2 = this.g + 1;
        this.g = i2;
        if (i2 > 10) {
            setEnabled(false);
            this.b = 2;
            OnStatusChangedListener onStatusChangedListener = this.h;
            if (onStatusChangedListener != null) {
                onStatusChangedListener.onStatusChanged(this, 2);
            }
            b(10);
            return;
        }
        View.OnClickListener onClickListener2 = this.f;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
        if (this.d && NetUtil.isNetworkConnected(this.c)) {
            this.b = 1;
        }
        OnStatusChangedListener onStatusChangedListener2 = this.h;
        if (onStatusChangedListener2 != null) {
            onStatusChangedListener2.onStatusChanged(this, 1);
        }
    }

    public void onLoadFinished() {
        if (this.g <= 10) {
            setEnabled(true);
        }
        this.b = 0;
    }

    public void setMode(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public void setOnStatusChangedListener(OnStatusChangedListener onStatusChangedListener) {
        this.h = onStatusChangedListener;
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    public CareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"RestrictedApi"})
    public CareButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = 0;
        this.d = true;
        this.e = FriendManager.getInstance();
        this.g = 0;
        this.c = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        setGravity(1);
        setOrientation(1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(this.c);
        appCompatImageView.setBackgroundResource(R.drawable.relatives_friend_care_love);
        Context context2 = this.c;
        int i3 = R.color.relatives_white;
        appCompatImageView.setSupportBackgroundTintList(ContextCompat.getColorStateList(context2, i3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (int) TypedValue.applyDimension(1, 9.0f, displayMetrics);
        layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, displayMetrics);
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        TextView textView = new TextView(context);
        this.a = textView;
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        textView.setTypeface(TypefaceManager.get().getTypeface(this.c, Font.KM));
        textView.setTextColor(ContextCompat.getColor(this.c, i3));
        textView.setTextSize(2, 16.0f);
        addView(textView, layoutParams2);
        textView.setEnabled(false);
        textView.setId(R.id.relatives_care_button_label);
        super.setOnClickListener(this);
    }
}
