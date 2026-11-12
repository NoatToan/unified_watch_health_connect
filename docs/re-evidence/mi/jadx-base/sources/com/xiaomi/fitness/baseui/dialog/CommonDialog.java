package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.av6;
import defpackage.u2j;
import defpackage.yaa;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class CommonDialog<PARAM extends DialogParams> extends DialogFragment {
    public static final int ACTION_DIALOG_CANCEL = 2;
    public static final int ACTION_DIALOG_DISMISS = 3;
    public static final int ACTION_DIALOG_SHOW = 1;
    public static final int INVALID_REQUEST_CODE = -1;
    public static final String KEY_PARAM = "dialog_param";
    private static final String KEY_REQUEST_CODE = "request_code";
    private static final String TAG = "CommonDialog";
    private View customTitleView;
    private View customView;
    protected Context mContext;
    private Integer mDefaultResultCode;
    private Dialog mDialog;
    private PARAM mDialogParams;
    private d mListenerProxy;
    private Bundle mResultBundle;
    private Integer mResultCode;
    private int mRequestCode = -1;
    private final List<av6> mDialogCallbackList = new CopyOnWriteArrayList();
    private final DialogInterface.OnClickListener mOnClickListener = new a();
    private final DialogInterface.OnMultiChoiceClickListener mOnMultiChoiceClickListener = new b();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -3) {
                CommonDialog.this.mDefaultResultCode = -3;
            } else if (i == -2) {
                CommonDialog.this.mDefaultResultCode = -2;
            } else if (i == -1) {
                CommonDialog.this.mDefaultResultCode = -1;
            }
            if (CommonDialog.this.mListenerProxy != null) {
                CommonDialog.this.mListenerProxy.onClick(CommonDialog.this.getDialog(), i);
            }
        }
    }

    public class b implements DialogInterface.OnMultiChoiceClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (CommonDialog.this.mListenerProxy != null) {
                CommonDialog.this.mListenerProxy.onClick(CommonDialog.this.getDialog(), i, z);
            }
        }
    }

    public static class c extends com.xiaomi.fitness.baseui.dialog.a<c, DialogParams, CommonDialog> {
        public c(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        public c getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        public CommonDialog internalCreate() {
            return new CommonDialog();
        }

        public c(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    private yaa getDialogResultCallback() {
        LifecycleOwner parentFragment = getParentFragment();
        if (parentFragment instanceof yaa) {
            return (yaa) parentFragment;
        }
        if (getContext() instanceof yaa) {
            return (yaa) getContext();
        }
        Logger.w(TAG, "parentFragment is null");
        return null;
    }

    private boolean isForResultRequest() {
        return this.mRequestCode != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateDialog$0(DialogInterface dialogInterface) {
        dismiss();
    }

    private miuix.appcompat.app.c.a onCreateBuilder() {
        int i = u2j.f35312a;
        int i2 = this.mDialogParams.mDialogTheme;
        if (i2 != 0) {
            i = i2;
        }
        miuix.appcompat.app.c.a aVarE = new miuix.appcompat.app.c.a(requireContext(), i).g(false).e(this.mDialogParams.mCancelable);
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        int i3 = this.mDialogParams.mPositiveButtonTextId;
        if (i3 != 0) {
            aVarE.u(i3, this.mOnClickListener);
        }
        if (!TextUtils.isEmpty(this.mDialogParams.mPositiveButtonText)) {
            aVarE.v(this.mDialogParams.mPositiveButtonText, this.mOnClickListener);
        }
        int i4 = this.mDialogParams.mNeutralButtonTextId;
        if (i4 != 0) {
            aVarE.q(i4, this.mOnClickListener);
        }
        if (!TextUtils.isEmpty(this.mDialogParams.mNeutralButtonText)) {
            aVarE.r(this.mDialogParams.mNeutralButtonText, this.mOnClickListener);
        }
        int i5 = this.mDialogParams.mNegativeButtonTextId;
        if (i5 != 0) {
            aVarE.o(i5, this.mOnClickListener);
        }
        if (!TextUtils.isEmpty(this.mDialogParams.mNegativeButtonText)) {
            aVarE.p(this.mDialogParams.mNegativeButtonText, this.mOnClickListener);
        }
        int i6 = this.mDialogParams.mCustomTitleId;
        if (i6 != 0) {
            View viewInflate = layoutInflater.inflate(i6, (ViewGroup) null);
            aVarE.f(viewInflate);
            initCustomTitle(viewInflate);
        }
        DialogParams.DialogDescriptionString dialogDescriptionString = this.mDialogParams.mDialogTitleString;
        if (dialogDescriptionString == null || TextUtils.isEmpty(dialogDescriptionString.a())) {
            PARAM param = this.mDialogParams;
            int i7 = param.mDialogTitleId;
            if (i7 != 0) {
                aVarE.y(i7);
            } else {
                DialogParams.DialogDescriptionString dialogDescriptionString2 = param.mDialogTitleString;
                if (dialogDescriptionString2 != null && !TextUtils.isEmpty(dialogDescriptionString2.c(this.mContext))) {
                    aVarE.z(this.mDialogParams.mDialogTitleString.c(this.mContext));
                }
            }
        } else {
            aVarE.z(this.mDialogParams.mDialogTitleString.a());
        }
        DialogParams.DialogDescriptionString dialogDescriptionString3 = this.mDialogParams.mDescriptionString;
        if (dialogDescriptionString3 == null || TextUtils.isEmpty(dialogDescriptionString3.a())) {
            PARAM param2 = this.mDialogParams;
            int i8 = param2.mDialogDescriptionId;
            if (i8 != 0) {
                aVarE.l(i8);
            } else {
                DialogParams.DialogDescriptionString dialogDescriptionString4 = param2.mDescriptionString;
                if (dialogDescriptionString4 != null && !TextUtils.isEmpty(dialogDescriptionString4.c(this.mContext))) {
                    aVarE.m(this.mDialogParams.mDescriptionString.c(this.mContext));
                }
            }
        } else {
            aVarE.m(this.mDialogParams.mDescriptionString.a());
        }
        PARAM param3 = this.mDialogParams;
        String[] strArr = param3.mItems;
        if (strArr != null && strArr.length > 0) {
            int i9 = param3.mItemsCheckedIndex;
            if (i9 >= 0) {
                aVarE.x(strArr, i9, this.mOnClickListener);
            } else {
                boolean[] zArr = param3.mItemsChoices;
                if (zArr == null || zArr.length <= 0) {
                    aVarE.k(strArr, this.mOnClickListener);
                } else {
                    aVarE.n(strArr, zArr, this.mOnMultiChoiceClickListener);
                }
            }
        }
        ListAdapter listAdapter = this.mDialogParams.mAdapter;
        if (listAdapter != null) {
            aVarE.c(listAdapter, this.mOnClickListener);
        }
        int i10 = this.mDialogParams.mCustomLayoutId;
        if (i10 != 0) {
            View viewInflate2 = layoutInflater.inflate(i10, (ViewGroup) null);
            initCustomView(viewInflate2);
            aVarE.A(viewInflate2);
        }
        View view = this.mDialogParams.mCustomView;
        if (view != null) {
            initCustomView(view);
            aVarE.A(this.mDialogParams.mCustomView);
        }
        return aVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performOnResult, reason: merged with bridge method [inline-methods] */
    public void lambda$onDismiss$1(yaa yaaVar) {
        synchronized (this) {
            try {
                try {
                    Integer num = this.mResultCode;
                    if (num == null) {
                        num = this.mDefaultResultCode;
                    }
                    if (num != null) {
                        int i = this.mRequestCode;
                        int iIntValue = num.intValue();
                        Bundle bundle = this.mResultBundle;
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        yaaVar.onFragmentResult(i, iIntValue, bundle);
                    }
                    this.mResultCode = null;
                    this.mResultBundle = null;
                    this.mDefaultResultCode = null;
                } catch (Throwable th) {
                    this.mResultCode = null;
                    this.mResultBundle = null;
                    this.mDefaultResultCode = null;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void updateMessageView() {
        TextView textViewO = ((miuix.appcompat.app.c) this.mDialog).o();
        if (textViewO != null) {
            textViewO.setMovementMethod(LinkMovementMethod.getInstance());
            textViewO.setAutoLinkMask(15);
            textViewO.setHighlightColor(0);
        }
    }

    public <T extends CommonDialog> T addDialogCallback(av6 av6Var) {
        List<av6> list = this.mDialogCallbackList;
        Objects.requireNonNull(av6Var);
        list.add(av6Var);
        return this;
    }

    public com.xiaomi.fitness.baseui.dialog.a buildUpon() {
        return new c(requireDialogParams());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog getDialog() {
        return this.mDialog;
    }

    public PARAM getDialogParams() {
        return this.mDialogParams;
    }

    public void initCustomTitle(View view) {
        this.customTitleView = view;
    }

    public void initCustomView(View view) {
        this.customView = view;
    }

    public boolean isShowing() {
        Dialog dialog = getDialog();
        return dialog != null && dialog.isShowing();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            PARAM param = (PARAM) bundle.getParcelable(KEY_PARAM);
            Objects.requireNonNull(param);
            this.mDialogParams = param;
            this.mRequestCode = bundle.getInt(KEY_REQUEST_CODE, -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.mContext = requireActivity();
        miuix.appcompat.app.c cVarB = onCreateBuilder().b();
        this.mDialog = cVarB;
        cVarB.setCanceledOnTouchOutside(this.mDialogParams.mCanceledOnTouchOutside);
        d dVar = new d(this);
        this.mListenerProxy = dVar;
        this.mDialog.setOnShowListener(dVar);
        this.mDialog.setOnKeyListener(this.mListenerProxy);
        this.mDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: c64
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f4976a.lambda$onCreateDialog$0(dialogInterface);
            }
        });
        this.mDialog.setOnShowListener(this.mListenerProxy);
        return this.mDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.customTitleView;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.customTitleView.getParent()).removeView(this.customTitleView);
        }
        View view2 = this.customView;
        if (view2 == null || view2.getParent() == null) {
            return;
        }
        ((ViewGroup) this.customView.getParent()).removeView(this.customView);
    }

    public void onDialogDismiss(int i) {
        if (i == -1) {
            setResultData(-1, getArguments());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        d dVar = this.mListenerProxy;
        if (dVar != null) {
            dVar.onDismiss(dialogInterface);
        }
        Integer num = this.mDefaultResultCode;
        onDialogDismiss(num != null ? num.intValue() : 0);
        final yaa dialogResultCallback = getDialogResultCallback();
        if (dialogResultCallback == null || !isForResultRequest()) {
            return;
        }
        ExecutorHelper executorHelper = ExecutorHelper.INSTANCE;
        ExecutorHelper.postInMain(new Runnable() { // from class: b64
            @Override // java.lang.Runnable
            public final void run() {
                this.f3844a.lambda$onDismiss$1(dialogResultCallback);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(KEY_PARAM, this.mDialogParams);
        bundle.putInt(KEY_REQUEST_CODE, this.mRequestCode);
    }

    public void onShow() {
        updateMessageView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        onShow();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        if (getDialog() != null && !getDialog().isShowing()) {
            dismissAllowingStateLoss();
        }
        super.onStop();
    }

    public void removeDialogCallback(av6 av6Var) {
        this.mDialogCallbackList.remove(av6Var);
    }

    public PARAM requireDialogParams() {
        PARAM param = this.mDialogParams;
        Objects.requireNonNull(param, "param is null");
        return param;
    }

    public void setParam(PARAM param) {
        Objects.requireNonNull(param, "params can't be null");
        this.mDialogParams = param;
    }

    public void setRequestCode(int i) {
        this.mRequestCode = i;
    }

    public void setResultData(Integer num, Bundle bundle) {
        synchronized (this) {
            this.mResultCode = num;
            this.mResultBundle = bundle;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        try {
            fragmentManager.o().v(this).l();
            super.show(fragmentManager, str);
        } catch (Exception e) {
            Logger.e(TAG, "show error: " + e);
        }
    }

    public void showIfNeed(FragmentManager fragmentManager) {
        if (isShowing() || fragmentManager == null) {
            return;
        }
        k kVarO = fragmentManager.o();
        kVarO.v(this);
        kVarO.f(this, this.mDialogParams.mDialogName);
        kVarO.m();
    }

    public static class d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<CommonDialog> f11650a;

        public d(CommonDialog commonDialog) {
            this.f11650a = new WeakReference<>(commonDialog);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            CommonDialog commonDialog = this.f11650a.get();
            if (commonDialog == null) {
                return;
            }
            Iterator it = commonDialog.mDialogCallbackList.iterator();
            while (it.hasNext()) {
                ((av6) it.next()).onDialogEvent(commonDialog.mDialogParams.mDialogName, dialogInterface, 2);
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            CommonDialog commonDialog = this.f11650a.get();
            if (commonDialog == null) {
                return;
            }
            Iterator it = commonDialog.mDialogCallbackList.iterator();
            while (it.hasNext()) {
                ((av6) it.next()).onDialogClick(commonDialog.mDialogParams.mDialogName, dialogInterface, i);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            CommonDialog commonDialog = this.f11650a.get();
            if (commonDialog == null) {
                return;
            }
            Iterator it = commonDialog.mDialogCallbackList.iterator();
            while (it.hasNext()) {
                ((av6) it.next()).onDialogEvent(commonDialog.mDialogParams.mDialogName, dialogInterface, 3);
            }
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            CommonDialog commonDialog = this.f11650a.get();
            if (commonDialog == null) {
                return false;
            }
            Iterator it = commonDialog.mDialogCallbackList.iterator();
            while (it.hasNext()) {
                if (((av6) it.next()).onDialogKeyEvent(commonDialog.mDialogParams.mDialogName, dialogInterface, i, keyEvent)) {
                    return true;
                }
            }
            return !commonDialog.mDialogParams.mCancelOnBackPressed && i == 4 && keyEvent.getRepeatCount() == 0;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            CommonDialog commonDialog = this.f11650a.get();
            if (commonDialog == null) {
                return;
            }
            Iterator it = commonDialog.mDialogCallbackList.iterator();
            while (it.hasNext()) {
                ((av6) it.next()).onDialogEvent(commonDialog.mDialogParams.mDialogName, dialogInterface, 1);
            }
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            CommonDialog commonDialog = this.f11650a.get();
            if (commonDialog == null) {
                return;
            }
            Iterator it = commonDialog.mDialogCallbackList.iterator();
            while (it.hasNext()) {
                ((av6) it.next()).onDialogMultiClick(commonDialog.mDialogParams.mDialogName, i, z);
            }
        }
    }
}
