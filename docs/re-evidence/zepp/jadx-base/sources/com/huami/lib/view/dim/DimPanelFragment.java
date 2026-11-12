package com.huami.lib.view.dim;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huami.lib.view.R;
import com.huami.lib.view.SystemBarTintSupport;

/* JADX INFO: loaded from: classes10.dex */
public class DimPanelFragment extends DialogFragment implements View.OnClickListener {
    public TextView mLeftButton;
    public TextView mRightButton;
    public boolean mCanceled = true;
    public boolean mCanceledOnTouchOutside = true;
    private OpClickListener a = null;

    public interface OpClickListener {
        void onEmptyAreaClicked(DialogFragment dialogFragment);

        void onLeftClicked(DialogFragment dialogFragment);

        void onRightClicked(DialogFragment dialogFragment);
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DimPanelFragment.this.onEmptyAreaClicked();
        }
    }

    public static void showPanel(Activity activity, Class<? extends DialogFragment> cls, Bundle bundle, String str) {
        Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isVisible()) {
            ((DialogFragment) Fragment.instantiate(activity, cls.getName(), bundle)).show(activity.getFragmentManager().beginTransaction(), str);
        }
    }

    public TextView getRightButton() {
        return this.mRightButton;
    }

    public int inflateLayout() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.left_button) {
            onLeftButtonClicked();
        } else if (view.getId() == R.id.right_button) {
            onRightButtonClicked();
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(inflateLayout(), viewGroup, false);
        this.mLeftButton = (TextView) viewInflate.findViewById(R.id.left_button);
        this.mRightButton = (TextView) viewInflate.findViewById(R.id.right_button);
        TextView textView = this.mLeftButton;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.mRightButton;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        getDialog().setCanceledOnTouchOutside(this.mCanceledOnTouchOutside);
        getDialog().setCancelable(this.mCanceled);
        View viewFindViewById = viewInflate.findViewById(R.id.dlg_empty_area_btn);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new a());
        }
        viewInflate.setFitsSystemWindows(true);
        return viewInflate;
    }

    public void onEmptyAreaClicked() {
        OpClickListener opClickListener = this.a;
        if (opClickListener != null) {
            opClickListener.onEmptyAreaClicked(this);
        }
        dismissAllowingStateLoss();
    }

    public void onLeftButtonClicked() {
        OpClickListener opClickListener = this.a;
        if (opClickListener != null) {
            opClickListener.onLeftClicked(this);
        } else {
            dismissAllowingStateLoss();
        }
    }

    public void onRightButtonClicked() {
        OpClickListener opClickListener = this.a;
        if (opClickListener != null) {
            opClickListener.onRightClicked(this);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        this.mCanceledOnTouchOutside = z;
    }

    public void setOpClickListener(OpClickListener opClickListener) {
        this.a = opClickListener;
    }

    public static void showPanel(Activity activity, Class<? extends DialogFragment> cls, Bundle bundle) {
        ((DialogFragment) Fragment.instantiate(activity, cls.getName(), bundle)).show(activity.getFragmentManager().beginTransaction(), cls.getName());
    }

    public static void showPanel(Activity activity, Class<? extends Fragment> cls) {
        try {
            ((DialogFragment) Fragment.instantiate(activity, cls.getName())).show(activity.getFragmentManager().beginTransaction(), cls.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showPanel(Activity activity, DialogFragment dialogFragment) {
        dialogFragment.show(activity.getFragmentManager().beginTransaction(), (String) null);
    }

    public static void showPanel(Activity activity, DialogFragment dialogFragment, Bundle bundle) {
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        dialogFragment.setArguments(bundle);
        dialogFragment.show(fragmentTransactionBeginTransaction, (String) null);
    }

    public void showPanel(FragmentManager fragmentManager) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, (String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
