package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes8.dex */
public class f9q extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f17578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17579b;

    public f9q(Context context, int i) {
        super(context);
        this.f17579b = i;
        setFocusable(true);
        setOutsideTouchable(true);
        setHeight(-2);
        setWidth(a(context, 167));
        setBackgroundDrawable(new ColorDrawable(0));
        TextView textView = new TextView(context);
        this.f17578a = textView;
        b(context);
        setContentView(textView);
    }

    public final int a(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b(Context context) {
        this.f17578a.setText(this.f17579b);
        this.f17578a.setTextAppearance(k2j.f23365a);
        this.f17578a.setTextSize(15.0f);
        this.f17578a.setTextColor(ni4.c(context, bji.f));
        this.f17578a.setBackgroundResource(hni.A);
        int iA = a(context, 27);
        int iA2 = a(context, 25);
        this.f17578a.setPadding(iA, iA2, iA, iA2);
    }

    public void setOnBtnClickListener(View.OnClickListener onClickListener) {
        this.f17578a.setOnClickListener(onClickListener);
    }
}
