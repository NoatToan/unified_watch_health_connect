package com.xiaomi.hm.health.relation;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.databases.HMLocalPropertyUtil;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.relation.copy.SystemBarTintSupport;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class FriendMenuFragment extends DialogFragment implements View.OnClickListener {
    private static final String j = "MainMenuFragment";
    private static final int k = 250;
    private static final int l = 5;
    private Bitmap a;
    private Bitmap b;
    private LinearLayout c;
    private View d;
    private Animator e;
    private Animator f;
    private View.OnClickListener g;
    public Animator.AnimatorListener h = new a();
    public OnDialogDismissListener i;

    public interface OnDialogDismissListener {
        void onDismiss();
    }

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FriendMenuFragment.super.dismissAllowingStateLoss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class b extends Dialog {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void cancel() {
            FriendMenuFragment.this.onCancel(this);
        }
    }

    @SuppressLint({"NewApi"})
    private Bitmap b() {
        FragmentActivity activity = getActivity();
        Bitmap bitmap = this.a;
        Bitmap bitmapFastblur = null;
        if (bitmap != null && !bitmap.isRecycled() && activity != null) {
            int width = this.c.getWidth();
            int height = this.c.getHeight();
            Matrix matrix = new Matrix();
            matrix.setScale(0.14285715f, 0.14285715f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.a, 0, 0, width, height, matrix, true);
            this.a.recycle();
            this.a = null;
            bitmapFastblur = Blur.fastblur(activity, bitmapCreateBitmap, 25);
            if (bitmapFastblur != bitmapCreateBitmap) {
                bitmapCreateBitmap.recycle();
            }
            Canvas canvas = new Canvas(bitmapFastblur);
            canvas.save();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(ContextCompat.getColor(activity, R.color.relatives_relative_pale_grey));
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
            canvas.restore();
            this.c.setBackground(new BitmapDrawable(getResources(), bitmapFastblur));
        }
        return bitmapFastblur;
    }

    private void c(Dialog dialog) {
        dialog.getWindow().setLayout(-1, -2);
        dialog.getWindow().setGravity(48);
        dialog.setCanceledOnTouchOutside(true);
    }

    private boolean d() {
        String localProperty = HMLocalPropertyUtil.getLocalProperty(HMLocalPropertyUtil.LOCAL_PROPERTY_IS_IN_MAINLAND, "");
        return TextUtils.isEmpty(localProperty) ? e() : "true".equals(localProperty);
    }

    private boolean e() {
        return Locale.SIMPLIFIED_CHINESE.getCountry().equals(Locale.getDefault().getCountry());
    }

    public static FriendMenuFragment newInstance() {
        return new FriendMenuFragment();
    }

    public void animMenuOut() {
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (getActivity() == null) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (getActivity() == null) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.topMargin += BaseTitleActivity.getStatusBarHeight(requireContext());
        this.c.setLayoutParams(layoutParams);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        animMenuOut();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.menu_dismiss) {
            animMenuOut();
            return;
        }
        View.OnClickListener onClickListener = this.g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        animMenuOut();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.RelativesMenuPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.RelativesMenuPanelTint;
        }
        setStyle(0, i);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        b bVar = new b(getActivity(), getTheme());
        c(bVar);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.relatives_view_friend_menu, viewGroup, false);
        this.c = (LinearLayout) viewInflate.findViewById(R.id.menu_content);
        viewInflate.findViewById(R.id.menu_dismiss).setOnClickListener(this);
        this.c.findViewById(R.id.message_button).setOnClickListener(this);
        this.d = this.c.findViewById(R.id.new_flag);
        this.c.findViewById(R.id.action_add_friend).setOnClickListener(this);
        this.c.findViewById(R.id.action_add_friend_by_id).setOnClickListener(this);
        this.c.findViewById(R.id.action_my_qrcode).setOnClickListener(this);
        this.c.findViewById(R.id.action_share_friend_invite).setOnClickListener(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            bitmap.recycle();
            this.b = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDialogDismissListener onDialogDismissListener = this.i;
        if (onDialogDismissListener != null) {
            onDialogDismissListener.onDismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            setNewFlagShow(MessageManager.getDefault(getActivity().getApplicationContext()).hasNewMessage());
        }
    }

    public void setBackground(Bitmap bitmap) {
        this.a = bitmap;
    }

    public void setNewFlagShow(boolean z) {
        View view = this.d;
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        this.d.invalidate();
    }

    public void setOnDismissListener(OnDialogDismissListener onDialogDismissListener) {
        this.i = onDialogDismissListener;
    }

    public void setOnMenuItemClickListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (isAdded()) {
            return;
        }
        super.show(fragmentManager, str);
    }
}
