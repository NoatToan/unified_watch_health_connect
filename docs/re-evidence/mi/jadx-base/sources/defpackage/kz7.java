package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes8.dex */
public class kz7 extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f24436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24437b;

    public kz7(Context context, int i) {
        super(context);
        this.f24437b = i;
        setFocusable(true);
        setOutsideTouchable(true);
        setHeight(-2);
        setWidth(a(context, 167));
        setBackgroundDrawable(new ColorDrawable(0));
        TextView textView = new TextView(context);
        this.f24436a = textView;
        b(context);
        setContentView(textView);
    }

    public final int a(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b(Context context) {
        this.f24436a.setText(this.f24437b);
        this.f24436a.setTextAppearance(m2j.f25682a);
        this.f24436a.setTextSize(15.0f);
        this.f24436a.setTextColor(ni4.c(context, dji.d));
        this.f24436a.setBackgroundResource(kni.d);
        int iA = a(context, 27);
        int iA2 = a(context, 25);
        this.f24436a.setPadding(iA, iA2, iA, iA2);
    }

    public void setOnBtnClickListener(View.OnClickListener onClickListener) {
        this.f24436a.setOnClickListener(onClickListener);
    }
}
