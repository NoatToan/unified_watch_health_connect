package com.huami.watch.companion.facestore.widgets;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class FaceDialogFragment extends DialogFragment {
    private static final String F = "FaceDialogFragment";
    private static final String G = "param1";
    public static final int STATE_COMPLETE = 2;
    public static final int STATE_LOADING = 1;
    public static final int STATE_READY = 0;
    private OnDialogCancelListener A;
    private ProgressBar B;
    private Callback D;
    private View a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private View.OnClickListener h;
    private View.OnClickListener i;
    private TextView j;
    private ImageView k;
    private TextView l;
    private ImageButton m;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private View s;
    private ImageView t;
    private int u;
    private View v;
    private TranslateAnimation w;
    private ObjectAnimator x;
    private int y;
    private TextView z;
    private boolean n = true;
    private int C = 0;
    private float E = 0.0f;

    public interface Callback {
        void onCreateView();
    }

    public interface OnDialogCancelListener {
        void cancelDialog();
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FaceDialogFragment.this.getDialog() != null) {
                FaceDialogFragment.this.getDialog().cancel();
            }
            if (FaceDialogFragment.this.A != null) {
                FaceDialogFragment.this.A.cancelDialog();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FaceDialogFragment.this.getDialog() != null) {
                FaceDialogFragment.this.getDialog().cancel();
            }
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= FaceDialogFragment.this.E) {
                FaceDialogFragment.this.x.end();
                FaceDialogFragment.this.x.start();
            }
        }
    }

    private void d(View view) {
        this.j = (TextView) view.findViewById(R.id.face_name);
        this.k = (ImageView) view.findViewById(R.id.face_image);
        this.o = (TextView) view.findViewById(R.id.size_title);
        this.p = (TextView) view.findViewById(R.id.time_title);
        this.l = (TextView) view.findViewById(R.id.face_confirm);
        this.m = (ImageButton) view.findViewById(R.id.face_close);
        this.B = (ProgressBar) view.findViewById(R.id.progressbar_updown);
        this.q = (TextView) view.findViewById(R.id.progress_value);
        this.r = (TextView) view.findViewById(R.id.face_complete);
        this.s = view.findViewById(R.id.progress_bg);
        this.t = (ImageView) view.findViewById(R.id.face_image_bg);
        this.v = view.findViewById(R.id.line);
        this.z = (TextView) view.findViewById(R.id.tv_tips);
        this.j.setText(this.b);
        this.t.setBackgroundResource(this.u);
        this.o.setVisibility(8);
        if (this.y == 1) {
            this.z.setText(R.string.watch_face_third_watch_face);
        } else {
            this.z.setText(R.string.download_watch_face);
        }
        this.p.setText(this.d);
        if (!TextUtils.isEmpty(this.e)) {
            Glide.with(this).load(this.e).apply(RequestOptions.bitmapTransform(new CircleCrop()).placeholder(R.drawable.watch_face_details_default)).into(this.k);
        }
        this.m.setOnClickListener(new a());
        this.r.setOnClickListener(new b());
        this.l.setText(this.g);
        this.l.setOnClickListener(this.h);
    }

    private void e() {
        StringBuilder sb = new StringBuilder();
        sb.append(" startAnimation and animator == null  ");
        sb.append(this.x == null);
        Log.d(F, sb.toString());
        if (this.x != null) {
            this.E = (this.B.getProgress() * this.B.getWidth()) / 100;
            return;
        }
        this.E = (this.B.getProgress() * this.B.getWidth()) / 100;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.v, "translationX", this.B.getLeft(), this.B.getLeft() + this.B.getWidth(), this.B.getTop(), this.B.getTop());
        this.x = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addUpdateListener(new c());
        this.x.setDuration(5000L);
        this.x.setRepeatCount(-1);
        this.x.setInterpolator(new LinearInterpolator());
        this.x.start();
    }

    public static FaceDialogFragment newInstance() {
        return newInstance(0);
    }

    public void endAnimatior() {
        StringBuilder sb = new StringBuilder();
        sb.append(" endAnimatior and animator == null  ");
        sb.append(this.x == null);
        Log.d(F, sb.toString());
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.x = null;
        }
    }

    @Override // android.app.DialogFragment
    public int getTheme() {
        return super.getTheme();
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        View.OnClickListener onClickListener = this.i;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.y = getArguments().getInt("param1");
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_face_dialog, viewGroup, true);
        this.a = viewInflate;
        d(viewInflate);
        getDialog().getWindow().setSoftInputMode(34);
        if (isCancelable()) {
            getDialog().setCanceledOnTouchOutside(this.n);
        }
        Callback callback = this.D;
        if (callback != null) {
            callback.onCreateView();
        }
        updateAllState(0);
        return this.a;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.x = null;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        try {
            getDialog().getWindow().setLayout(-2, -2);
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.gravity = 17;
            getDialog().getWindow().setAttributes(attributes);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void setCallback(Callback callback) {
        this.D = callback;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        if (z && !isCancelable()) {
            setCancelable(true);
        }
        this.n = z;
    }

    public void setConfirm(String str, View.OnClickListener onClickListener) {
        this.g = str;
        this.h = onClickListener;
    }

    public void setDialogCancelListener(OnDialogCancelListener onDialogCancelListener) {
        this.A = onDialogCancelListener;
    }

    public void setFaceImage(String str) {
        this.e = str;
    }

    public void setFaceName(String str) {
        this.b = str;
    }

    public void setFaceSize(String str) {
        this.c = str;
    }

    public void setFaceTime(String str) {
        this.d = str;
    }

    public void setWatchBg(int i) {
        this.u = i;
    }

    public void updateAllState(int i) {
        if (i == 0) {
            this.B.setVisibility(4);
            this.v.setVisibility(4);
            this.r.setVisibility(4);
            this.l.setVisibility(0);
            this.l.setClickable(true);
            this.r.setClickable(false);
            this.l.setText(R.string.facestore_install_button_confirm);
            this.s.setBackgroundResource(R.drawable.watch_face_dialog_btn_shape);
            return;
        }
        if (i == 1) {
            this.B.setVisibility(0);
            this.v.setVisibility(0);
            this.r.setVisibility(4);
            this.l.setVisibility(0);
            this.l.setClickable(false);
            this.r.setClickable(false);
            this.l.setText(R.string.facestore_install_processing);
            this.s.setBackgroundResource(R.drawable.watch_face_dialog_btn_intsall_bg);
            return;
        }
        if (i != 2) {
            return;
        }
        this.B.setVisibility(4);
        this.v.setVisibility(4);
        this.r.setVisibility(0);
        this.l.setVisibility(4);
        this.l.setClickable(false);
        this.r.setClickable(true);
        this.l.setText(this.g);
        this.s.setBackgroundResource(R.drawable.watch_face_dialog_btn_shape);
    }

    public void updateProgressing(int i) {
        Log.d(F, " progress is " + i + "privateProgress is " + this.C + ", ProgressBar : " + this.B);
        ProgressBar progressBar = this.B;
        if (progressBar == null) {
            return;
        }
        if (i <= 0 || i > 100) {
            if (i == 0 || i == 100) {
                if (i == 0) {
                    progressBar.setProgress(i);
                    this.l.setText(getString(R.string.facestore_install_progress_process, String.valueOf(i) + "%"));
                    this.C = 0;
                }
                endAnimatior();
                return;
            }
            return;
        }
        if (this.C < i || i == 0) {
            progressBar.setProgress(i);
            e();
            if (getActivity() == null) {
                return;
            }
            this.C = i;
            this.l.setText(getString(R.string.facestore_install_progress_process, String.valueOf(i) + "%"));
            if (i == 100) {
                updateAllState(2);
                this.x.end();
            }
        }
    }

    public static FaceDialogFragment newInstance(int i) {
        FaceDialogFragment faceDialogFragment = new FaceDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("param1", i);
        faceDialogFragment.setArguments(bundle);
        return faceDialogFragment;
    }
}
