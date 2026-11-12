package com.huami.treadmill.ui.setting;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.treadmill.R;
import com.huami.treadmill.data.ErrorStatus;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.util.BlurBitmapUtil;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u001e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006 "}, d2 = {"Lcom/huami/treadmill/ui/setting/ErrorFragment;", "Landroidx/fragment/app/DialogFragment;", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroyView", "onResume", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "", "error", "Lcom/huami/treadmill/ui/setting/ErrorFragment$ErrorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showErrorFragment", "a", "Lcom/huami/treadmill/ui/setting/ErrorFragment;", "mFragment", "Lcom/huami/treadmill/ui/setting/ErrorFragment$ErrorListener;", "mListener", "<init>", "()V", "Companion", "ErrorListener", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class ErrorFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = ErrorFragment.class.getSimpleName();

    @NotNull
    private static final String d = "error_status";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ErrorFragment mFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ErrorListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/ui/setting/ErrorFragment$Companion;", "", "Lcom/huami/treadmill/ui/setting/ErrorFragment;", "newInstance", "", "ERROR_STATUS", "Ljava/lang/String;", "TAG", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorFragment newInstance() {
            return new ErrorFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/treadmill/ui/setting/ErrorFragment$ErrorListener;", "", "", "onFinish", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public interface ErrorListener {
        void onFinish();
    }

    private final void b() {
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.huami.treadmill.ui.setting.ErrorFragment$initClick$1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(@NotNull DialogInterface dialog2, int keyCode, @NotNull KeyEvent event) {
                return keyCode == 4;
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.td_fragment_error, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Dialog dialog2 = getDialog();
        Window window2 = dialog2 != null ? dialog2.getWindow() : null;
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        FrameLayout frameLayout = activity == null ? null : (FrameLayout) activity.findViewById(R.id.content);
        if (frameLayout != null) {
            frameLayout.setDrawingCacheEnabled(true);
            frameLayout.buildDrawingCache();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getDrawingCache());
            frameLayout.setDrawingCacheEnabled(false);
            Bitmap bitmapBlurBitmap = BlurBitmapUtil.INSTANCE.blurBitmap(getContext(), bitmapCreateBitmap);
            View view2 = getView();
            ((FrameLayout) (view2 == null ? null : view2.findViewById(R.id.container))).setBackground(new BitmapDrawable(getResources(), bitmapBlurBitmap));
        }
        int i = requireArguments().getInt(d);
        if (i == ErrorStatus.BRAKING.ordinal()) {
            if (isAdded()) {
                View view3 = getView();
                int id = ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.td_erorr_info_title))).getId();
                int i2 = R.string.td_error_info;
                if (id != i2) {
                    View view4 = getView();
                    ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.td_erorr_info_title))).setText(getString(i2));
                }
            }
            if (isAdded()) {
                View view5 = getView();
                int id2 = ((ImageView) (view5 == null ? null : view5.findViewById(R.id.td_erorr_info_img))).getId();
                int i3 = R.drawable.td_error_info;
                if (id2 != i3) {
                    View view6 = getView();
                    ((ImageView) (view6 != null ? view6.findViewById(R.id.td_erorr_info_img) : null)).setImageResource(i3);
                }
            }
        } else if (i == ErrorStatus.BRAKING_STOP.ordinal()) {
            if (isAdded()) {
                View view7 = getView();
                int id3 = ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.td_erorr_info_title))).getId();
                int i4 = R.string.td_error_stop_info;
                if (id3 != i4) {
                    View view8 = getView();
                    ((TypefaceTextView) (view8 == null ? null : view8.findViewById(R.id.td_erorr_info_title))).setText(getString(i4));
                }
            }
            if (isAdded()) {
                View view9 = getView();
                int id4 = ((ImageView) (view9 == null ? null : view9.findViewById(R.id.td_erorr_info_img))).getId();
                int i5 = R.drawable.td_error_stop_info;
                if (id4 != i5) {
                    View view10 = getView();
                    ((ImageView) (view10 != null ? view10.findViewById(R.id.td_erorr_info_img) : null)).setImageResource(i5);
                }
            }
        }
        ProxyTreadmill.INSTANCE.getInstance().setErrorStatusListener(new Function1<ErrorStatus, Unit>() { // from class: com.huami.treadmill.ui.setting.ErrorFragment.onViewCreated.2

            /* JADX INFO: renamed from: com.huami.treadmill.ui.setting.ErrorFragment$onViewCreated$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ErrorStatus.values().length];
                    iArr[ErrorStatus.NONE.ordinal()] = 1;
                    iArr[ErrorStatus.BRAKING.ordinal()] = 2;
                    iArr[ErrorStatus.BRAKING_STOP.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(@NotNull ErrorStatus errorStatus) {
                int i6 = WhenMappings.$EnumSwitchMapping$0[errorStatus.ordinal()];
                if (i6 == 1) {
                    ErrorListener errorListener = ErrorFragment.this.mListener;
                    if (errorListener != null) {
                        errorListener.onFinish();
                    }
                    ErrorFragment.this.dismissAllowingStateLoss();
                    return;
                }
                if (i6 == 2) {
                    if (ErrorFragment.this.isAdded()) {
                        View view11 = ErrorFragment.this.getView();
                        int id5 = ((TypefaceTextView) (view11 == null ? null : view11.findViewById(R.id.td_erorr_info_title))).getId();
                        int i7 = R.string.td_error_info;
                        if (id5 != i7) {
                            View view12 = ErrorFragment.this.getView();
                            ((TypefaceTextView) (view12 == null ? null : view12.findViewById(R.id.td_erorr_info_title))).setText(ErrorFragment.this.getString(i7));
                        }
                    }
                    if (ErrorFragment.this.isAdded()) {
                        View view13 = ErrorFragment.this.getView();
                        int id6 = ((ImageView) (view13 == null ? null : view13.findViewById(R.id.td_erorr_info_img))).getId();
                        int i8 = R.drawable.td_error_info;
                        if (id6 != i8) {
                            View view14 = ErrorFragment.this.getView();
                            ((ImageView) (view14 != null ? view14.findViewById(R.id.td_erorr_info_img) : null)).setImageResource(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i6 != 3) {
                    return;
                }
                if (ErrorFragment.this.isAdded()) {
                    View view15 = ErrorFragment.this.getView();
                    int id7 = ((TypefaceTextView) (view15 == null ? null : view15.findViewById(R.id.td_erorr_info_title))).getId();
                    int i9 = R.string.td_error_stop_info;
                    if (id7 != i9) {
                        View view16 = ErrorFragment.this.getView();
                        ((TypefaceTextView) (view16 == null ? null : view16.findViewById(R.id.td_erorr_info_title))).setText(ErrorFragment.this.getString(i9));
                    }
                }
                if (ErrorFragment.this.isAdded()) {
                    View view17 = ErrorFragment.this.getView();
                    int id8 = ((ImageView) (view17 == null ? null : view17.findViewById(R.id.td_erorr_info_img))).getId();
                    int i10 = R.drawable.td_error_stop_info;
                    if (id8 != i10) {
                        View view18 = ErrorFragment.this.getView();
                        ((ImageView) (view18 != null ? view18.findViewById(R.id.td_erorr_info_img) : null)).setImageResource(i10);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorStatus errorStatus) {
                a(errorStatus);
                return Unit.INSTANCE;
            }
        });
        b();
    }

    public final void showErrorFragment(@NotNull FragmentManager supportFragmentManager, int error, @NotNull ErrorListener listener) {
        if (this.mFragment == null) {
            this.mFragment = INSTANCE.newInstance();
        }
        Bundle bundle = new Bundle();
        bundle.putInt(d, error);
        ErrorFragment errorFragment = this.mFragment;
        if (errorFragment != null) {
            errorFragment.setArguments(bundle);
        }
        ErrorFragment errorFragment2 = this.mFragment;
        if (errorFragment2 != null) {
            errorFragment2.mListener = listener;
        }
        if (errorFragment2 != null) {
            errorFragment2.setStyle(0, R.style.Dialog_FullScreen);
        }
        if (isAdded() || isVisible()) {
            return;
        }
        String str = c;
        if (supportFragmentManager.findFragmentByTag(str) == null) {
            supportFragmentManager.beginTransaction().add(this.mFragment, str).commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
    }
}
