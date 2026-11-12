package com.huami.watch.hmwatchmanager.view;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.huami.watch.companionlib.R;

/* JADX INFO: loaded from: classes16.dex */
public class AlertDialogFragment extends DialogFragment {
    public static final String ARG_CANCEL_TXT = "ARG_CANCEL_TXT";
    public static final String ARG_CONFIRM_TXT = "ARG_CONFIRM_TXT";
    public static final String ARG_MSG = "ARG_MSG";
    public static final String ARG_NEUTRAL_TXT = "ARG_NEUTRAL_TXT";
    public static final String STYLE = "STYLE";
    public static final int STYLE_CONTENT_WITHOUT_BUTTON = 8;
    public static final int STYLE_CONTENT_WITHOUT_TITLE = 7;
    public static final int STYLE_CONTENT_WITH_SINGLE_BUTTON = 6;
    public static final int STYLE_CONTENT_WITH_TITLE = 5;
    public static final int STYLE_LOADING = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NORMAL_WITH_TITLE = 3;
    public static final int STYLE_SINGLE_BUTTON = 1;
    public static final int STYLE_SINGLE_BUTTON_WITH_TITLE = 4;
    private static final int w = 14;
    private int a;
    private View b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Fragment p;
    private View.OnClickListener q;
    private View.OnClickListener r;
    private View.OnClickListener s;
    private DialogInterface.OnDismissListener t;
    private boolean u = true;
    private Callback v;

    public interface Callback {
        void onCreateView();
    }

    public static class LoadingView extends View {
        private Context a;
        private Paint b;
        private int c;
        private int d;
        private Bitmap e;
        private Bitmap f;
        private Bitmap g;

        public LoadingView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = context;
            Paint paint = new Paint();
            this.b = paint;
            paint.setFilterBitmap(true);
            this.c = 0;
            this.d = 0;
        }

        @Override // android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            recycle(this.e);
            recycle(this.f);
            recycle(this.g);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Resources resources = this.a.getResources();
            if (this.e == null) {
                this.e = BitmapFactory.decodeResource(resources, R.drawable.ic_dialog_loading_bg);
            }
            if (this.f == null) {
                this.f = BitmapFactory.decodeResource(resources, R.drawable.ic_dialog_loading_hour);
            }
            if (this.g == null) {
                this.g = BitmapFactory.decodeResource(resources, R.drawable.ic_dialog_loading_minute);
            }
            int width = canvas.getWidth() / 2;
            int height = canvas.getHeight() / 2;
            Bitmap bitmap = this.e;
            canvas.drawBitmap(bitmap, width - (bitmap.getWidth() / 2), height - (this.e.getHeight() / 2), this.b);
            canvas.save();
            float f = width;
            float f2 = height;
            canvas.rotate(this.c, f, f2);
            Bitmap bitmap2 = this.f;
            canvas.drawBitmap(bitmap2, width - (bitmap2.getWidth() / 2), height - (this.f.getHeight() / 2), this.b);
            canvas.restore();
            canvas.save();
            canvas.rotate(this.d, f, f2);
            Bitmap bitmap3 = this.g;
            canvas.drawBitmap(bitmap3, width - (bitmap3.getWidth() / 2), height - (this.g.getHeight() / 2), this.b);
            canvas.restore();
            int i = this.c + 1;
            this.c = i;
            int i2 = this.d + 12;
            this.d = i2;
            if (i >= 360) {
                this.c = 0;
            }
            if (i2 >= 360) {
                this.d = 0;
            }
            postInvalidateOnAnimation();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(94, 94);
        }

        public void recycle(Bitmap bitmap) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AlertDialogFragment.this.getDialog() != null) {
                AlertDialogFragment.this.getDialog().cancel();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AlertDialogFragment.this.isCancelable() && AlertDialogFragment.this.u && AlertDialogFragment.this.getDialog() != null) {
                AlertDialogFragment.this.getDialog().cancel();
            }
        }
    }

    private void b(View view) {
        TextView textView = (TextView) view.findViewById(R.id.loading_msg);
        this.j = textView;
        textView.setText(this.n);
    }

    private void c(View view) {
        this.d = view.findViewById(R.id.dialog_normal_button);
        this.c = view.findViewById(R.id.dialog_single_button);
        int i = this.a;
        if (i == 3 || i == 4 || i == 5 || i == 8) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            this.i = textView;
            textView.setText(this.o);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.dialog_msg);
        this.h = textView2;
        textView2.setText(this.n);
        String str = this.n;
        if (str != null && str.length() > 14 && !this.n.contains("\n")) {
            this.h.setGravity(GravityCompat.START);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.dialog_btn_cancel);
        this.e = textView3;
        textView3.setOnClickListener(new a());
        this.e.setText(this.k);
        TextView textView4 = (TextView) view.findViewById(R.id.dialog_btn_confirm);
        this.f = textView4;
        textView4.setOnClickListener(this.q);
        this.f.setText(this.l);
        TextView textView5 = (TextView) view.findViewById(R.id.dialog_btn_neutral);
        this.g = textView5;
        textView5.setOnClickListener(this.s);
        this.g.setText(this.m);
        view.findViewById(R.id.dim_part).setOnClickListener(new b());
        d();
    }

    private void d() {
        switch (this.a) {
            case 0:
            case 3:
            case 5:
            case 7:
                this.d.setVisibility(0);
                this.c.setVisibility(8);
                break;
            case 1:
            case 4:
            case 6:
                this.d.setVisibility(8);
                this.c.setVisibility(0);
                break;
            case 8:
                this.d.setVisibility(8);
                this.c.setVisibility(8);
                break;
        }
    }

    public static AlertDialogFragment newInstance(int i, Bundle bundle) {
        AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
        Bundle bundle2 = bundle != null ? (Bundle) bundle.clone() : new Bundle();
        bundle2.putInt(STYLE, i);
        alertDialogFragment.setArguments(bundle2);
        return alertDialogFragment;
    }

    public TextView getConfirmBtn() {
        return this.f;
    }

    public TextView getMessageTextView() {
        return this.h;
    }

    @Override // android.app.DialogFragment
    public int getTheme() {
        return this.a != 2 ? R.style.DimPanel : super.getTheme();
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.p != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(R.id.dialog_content_msg, this.p);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        View.OnClickListener onClickListener = this.r;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getInt(STYLE);
            Log.d("AlertDialogFragment", "onCreate mStyle : " + this.a);
            this.k = arguments.getString(ARG_CANCEL_TXT, this.k);
            this.l = arguments.getString(ARG_CONFIRM_TXT, this.l);
            this.m = arguments.getString(ARG_NEUTRAL_TXT, this.m);
            Log.d("AlertDialogFragment", "mNeutralStr  : " + this.m);
            this.n = arguments.getString(ARG_MSG, this.n);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        int i = this.a;
        if (i == 0 || i == 1 || i == 6 || i == 7) {
            View viewInflate = layoutInflater.inflate(R.layout.fragment_alert_dialog, viewGroup, true);
            this.b = viewInflate;
            c(viewInflate);
        } else if (i == 3 || i == 4 || i == 5 || i == 8) {
            View viewInflate2 = layoutInflater.inflate(R.layout.fragment_alert_dialog, viewGroup, true);
            this.b = viewInflate2;
            viewInflate2.findViewById(R.id.dialog_title).setVisibility(0);
            c(this.b);
        } else {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            View viewInflate3 = layoutInflater.inflate(R.layout.fragment_dialog_loading, viewGroup, false);
            this.b = viewInflate3;
            b(viewInflate3);
        }
        getDialog().getWindow().setSoftInputMode(34);
        if (isCancelable()) {
            getDialog().setCanceledOnTouchOutside(this.u);
        }
        Callback callback = this.v;
        if (callback != null) {
            callback.onCreateView();
        }
        return this.b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.a != 2) {
            try {
                getDialog().getWindow().setLayout(-1, getDialog().getWindow().getAttributes().height);
                getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
                WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
                attributes.gravity = 80;
                getDialog().getWindow().setAttributes(attributes);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public void setCallback(Callback callback) {
        this.v = callback;
    }

    public void setCancel(String str, View.OnClickListener onClickListener) {
        this.k = str;
        this.r = onClickListener;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        if (z && !isCancelable()) {
            setCancelable(true);
        }
        this.u = z;
    }

    public void setConfirm(String str, View.OnClickListener onClickListener) {
        this.l = str;
        this.q = onClickListener;
    }

    public void setContent(Fragment fragment) {
        this.p = fragment;
    }

    public void setDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.t = onDismissListener;
    }

    public void setMessage(String str) {
        this.n = str;
    }

    public void setNeutral(String str, View.OnClickListener onClickListener) {
        this.s = onClickListener;
        this.m = str;
    }

    public void setStyle(int i) {
        this.a = i;
    }

    public void setTitle(String str) {
        this.o = str;
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void updateLoadingMsg(String str) {
        if (this.a == 2) {
            this.j.setText(str);
        }
    }

    public void updateNormalData(String str, String str2, String str3) {
        if (this.a == 0) {
            this.h.setText(str);
            this.e.setText(str2);
            this.f.setText(str3);
        }
    }

    public void updateSingleData(String str, String str2) {
        if (this.a == 1) {
            this.h.setText(str);
            this.g.setText(str2);
        }
    }

    public static AlertDialogFragment newInstance(int i) {
        return newInstance(i, null);
    }

    public static AlertDialogFragment newInstance() {
        return new AlertDialogFragment();
    }
}
