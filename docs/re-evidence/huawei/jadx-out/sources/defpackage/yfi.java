package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.wear.wallet.ui.dialog.DialogContentView;
import com.huawei.wear.wallet.ui.dialog.HwDialogInterface;
import com.huawei.wear.wallet.ui.dialog.WidgetBuilder;

/* JADX INFO: loaded from: classes46.dex */
public class yfi extends Dialog implements HwDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f53330c;
    private boolean d;
    private boolean e;
    private Context f;
    private LayoutInflater g;
    private View h;
    private TextView i;
    private LinearLayout j;
    private TextView k;
    private TextView l;
    private DialogContentView m;
    private LinearLayout n;
    private ImageView o;
    private TextView p;
    private LinearLayout r;

    protected double c() {
        return 0.2d;
    }

    public yfi(Context context, int i) {
        super(context, i);
        this.f53328a = false;
        this.e = false;
        this.d = false;
        this.f53329b = false;
        this.f = context;
        this.g = (LayoutInflater) context.getSystemService("layout_inflater");
        c(this.f53329b);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getWindow().setBackgroundDrawableResource(R.color.transparent);
    }

    private void c(boolean z) {
        requestWindowFeature(1);
        setContentView(com.huawei.wear.R.layout.cp3_hw_dialog_custom_layout_walet);
        this.m = (DialogContentView) findViewById(com.huawei.wear.R.id.dialog_layout);
        this.p = (TextView) findViewById(com.huawei.wear.R.id.title);
        this.r = (LinearLayout) findViewById(com.huawei.wear.R.id.titleView);
        this.j = (LinearLayout) findViewById(com.huawei.wear.R.id.content);
        this.n = (LinearLayout) findViewById(com.huawei.wear.R.id.content_list);
        this.i = (TextView) findViewById(com.huawei.wear.R.id.msg);
        this.f53330c = (RelativeLayout) findViewById(com.huawei.wear.R.id.button_layout);
        this.l = (TextView) findViewById(com.huawei.wear.R.id.ok);
        this.k = (TextView) findViewById(com.huawei.wear.R.id.cancel);
        this.h = findViewById(com.huawei.wear.R.id.dialog_bottom_line);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public HwDialogInterface setPositiveButton(CharSequence charSequence, final DialogInterface.OnClickListener onClickListener) {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.l.setText(charSequence);
        this.f53330c.setVisibility(0);
        this.l.setVisibility(0);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: yfi.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                yfj.e(yfi.this.f53328a, yfi.this);
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(yfi.this, -1);
                }
            }
        });
        return this;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        yfj.c(this, getContext().getResources().getDimensionPixelSize(com.huawei.wear.R.dimen.commen_margin_16dp), 0.98d, this.f53329b);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public HwDialogInterface setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return setPositiveButton(this.f.getResources().getString(i), onClickListener);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public HwDialogInterface setNegativeButton(CharSequence charSequence, final DialogInterface.OnClickListener onClickListener) {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.k.setText(charSequence);
        this.f53330c.setVisibility(0);
        this.k.setVisibility(0);
        this.k.setOnClickListener(new View.OnClickListener() { // from class: yfi.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                yfj.e(yfi.this.f53328a, yfi.this);
                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(yfi.this, -2);
                }
            }
        });
        return this;
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public HwDialogInterface setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return setNegativeButton(this.f.getResources().getString(i), onClickListener);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        yfj.e(this.p, this.f.getResources().getString(i));
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public HwDialogInterface setMessage(String str) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(0);
            this.i.setText(str);
        }
        return this;
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public HwDialogInterface setMessage(int i) {
        return setMessage(this.f.getResources().getString(i));
    }

    @Override // android.app.Dialog
    public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    @Override // android.app.Dialog
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog, com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // android.app.Dialog, com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean onSearchRequested() {
        if (this.e) {
            return this.d;
        }
        return super.onSearchRequested();
    }

    @Override // android.app.Dialog, com.huawei.wear.wallet.ui.dialog.HwDialogInterface
    public void show() {
        xnd.d("HwDialogCustom", "dialog show");
        yfj.b(this.h, this.l, this.k);
        yfj.a(this.i, this.p, this.f, com.huawei.wear.R.dimen.dialog_24dp);
        if (!WidgetBuilder.d(this.f)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int iC = (int) (((double) displayMetrics.heightPixels) * c());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
            if (yfo.a(this.f) == 1) {
                layoutParams.setMargins(0, 0, 0, 0);
            } else {
                layoutParams.setMargins(0, iC, 0, 0);
            }
            layoutParams.gravity = 1;
            this.m.setLayoutParams(layoutParams);
        }
        yfj.d(this.f, this.m);
        try {
            super.show();
        } catch (Exception unused) {
            xnd.a("HwDialogCustom", "showDialog failed Exception");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
            xnd.a("HwDialogCustom", "dismiss failed Exception");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        try {
            super.cancel();
        } catch (Exception unused) {
            xnd.a("HwDialogCustom", "cancel failed Exception");
        }
    }

    @Override // android.app.Dialog
    public void hide() {
        try {
            super.hide();
        } catch (Exception unused) {
            xnd.a("HwDialogCustom", "hide failed Exception");
        }
    }
}
