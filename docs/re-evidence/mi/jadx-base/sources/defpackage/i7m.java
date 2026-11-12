package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes7.dex */
public class i7m extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f20864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatTextView f20865b;
    public AppCompatTextView c;
    public AppCompatTextView d;
    public AppCompatTextView e;

    public i7m(Activity activity, View.OnClickListener onClickListener) {
        super(activity);
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(cvi.f14772a, (ViewGroup) null);
        this.f20864a = viewInflate;
        this.f20865b = (AppCompatTextView) viewInflate.findViewById(wri.d);
        this.c = (AppCompatTextView) this.f20864a.findViewById(wri.c);
        this.d = (AppCompatTextView) this.f20864a.findViewById(wri.f38286a);
        this.e = (AppCompatTextView) this.f20864a.findViewById(wri.f38287b);
        this.f20865b.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        setContentView(this.f20864a);
        setWidth(-1);
        setHeight(-2);
        setFocusable(true);
        setAnimationStyle(r2j.f32112a);
        setBackgroundDrawable(new ColorDrawable(0));
    }
}
