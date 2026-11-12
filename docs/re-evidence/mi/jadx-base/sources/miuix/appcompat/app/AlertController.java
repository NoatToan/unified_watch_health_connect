package miuix.appcompat.app;

import android.R;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import defpackage.abk;
import defpackage.alb;
import defpackage.awi;
import defpackage.b63;
import defpackage.bb1;
import defpackage.bie;
import defpackage.cv6;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.ebk;
import defpackage.f55;
import defpackage.g5j;
import defpackage.gw6;
import defpackage.hl1;
import defpackage.hm1;
import defpackage.if1;
import defpackage.m80;
import defpackage.mti;
import defpackage.ni4;
import defpackage.p56;
import defpackage.pu6;
import defpackage.rki;
import defpackage.rkr;
import defpackage.s6g;
import defpackage.s70;
import defpackage.sii;
import defpackage.tc8;
import defpackage.vsi;
import defpackage.xlr;
import defpackage.y94;
import defpackage.yu6;
import defpackage.z2j;
import defpackage.zhi;
import defpackage.zlr;
import defpackage.zu6;
import defpackage.zy5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.appcompat.internal.widget.DialogButtonPanel;
import miuix.appcompat.internal.widget.DialogParentPanel2;
import miuix.appcompat.internal.widget.DialogRootView;
import miuix.appcompat.internal.widget.NestedScrollViewExpander;
import miuix.core.util.SystemProperties;
import miuix.internal.widget.GroupButton;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class AlertController {
    public Point A0;
    public final e B;
    public Point B0;
    public TextWatcher C;
    public Point C0;
    public Button D;
    public Rect D0;
    public CharSequence E;
    public Configuration E0;
    public Message F;
    public boolean F0;
    public Button G;
    public CharSequence G0;
    public CharSequence H;
    public boolean H0;
    public Message I;
    public boolean I0;
    public Button J;
    public c.d J0;
    public CharSequence K;
    public c.d K0;
    public Message L;
    public boolean L0;
    public List<ButtonInfo> M;
    public int M0;
    public int N;
    public final Thread N0;
    public Drawable O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public boolean Q0;
    public int R;
    public final View.OnClickListener R0;
    public TextView S;
    public int S0;
    public TextView T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public View V;
    public TextView W;
    public ListAdapter X;
    public int Y;
    public final int Z;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26295b;
    public int b0;
    public final Context c;
    public int c0;
    public final if1 d;
    public int d0;
    public final Window e;
    public final boolean e0;
    public boolean f;
    public Handler f0;
    public boolean g;
    public final yu6 g0;
    public boolean h;
    public DialogRootView h0;
    public boolean i;
    public View i0;
    public boolean j;
    public DialogParentPanel2 j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f26296k;
    public boolean k0;
    public CharSequence l;
    public final LayoutChangeListener l0;
    public CharSequence m;
    public boolean m0;
    public ListView n;
    public boolean n0;
    public View o;
    public boolean o0;
    public int p;
    public int p0;
    public View q;
    public boolean q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26297r;
    public boolean r0;
    public int s;
    public boolean s0;
    public int t;
    public int t0;
    public WindowManager u0;
    public int v0;
    public float w0;
    public DisplayCutout x;
    public float x0;
    public long y;
    public float y0;
    public float z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26294a = false;
    public int u = -1;
    public boolean v = false;
    public int w = -2;
    public long z = 0;
    public final d.b A = new d.b();

    /* JADX INFO: renamed from: miuix.appcompat.app.AlertController$10, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$miuix$appcompat$app$AlertController$AlertParams$ItemType;

        static {
            int[] iArr = new int[AlertParams.ItemType.values().length];
            $SwitchMap$miuix$appcompat$app$AlertController$AlertParams$ItemType = iArr;
            try {
                iArr[AlertParams.ItemType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$miuix$appcompat$app$AlertController$AlertParams$ItemType[AlertParams.ItemType.CHOICE_SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$miuix$appcompat$app$AlertController$AlertParams$ItemType[AlertParams.ItemType.CHOICE_MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.AlertController$2, reason: invalid class name */
    public class AnonymousClass2 implements c.d {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShowAnimComplete$0() {
            AlertController.this.d.dismiss();
        }

        @Override // miuix.appcompat.app.c.d
        public void onShowAnimComplete() {
            AlertController.this.s0 = false;
            if (AlertController.this.J0 != null) {
                AlertController.this.J0.onShowAnimComplete();
            }
            if (AlertController.this.H0) {
                AlertController alertController = AlertController.this;
                if (alertController.d == null || alertController.e == null) {
                    return;
                }
                AlertController.this.e.getDecorView().post(new Runnable() { // from class: miuix.appcompat.app.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26309a.lambda$onShowAnimComplete$0();
                    }
                });
            }
        }

        @Override // miuix.appcompat.app.c.d
        public void onShowAnimStart() {
            AlertController.this.s0 = true;
            if (AlertController.this.J0 != null) {
                AlertController.this.J0.onShowAnimStart();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.AlertController$8, reason: invalid class name */
    public class AnonymousClass8 implements View.OnApplyWindowInsetsListener {
        public AnonymousClass8() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onApplyWindowInsets$0(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                AlertController.this.M1(rootWindowInsets);
            }
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        @RequiresApi(api = 30)
        public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
            if (AlertController.this.f26294a) {
                StringBuilder sb = new StringBuilder();
                sb.append("onApplyWindowInsets insets ");
                sb.append(windowInsets);
            }
            AlertController alertController = AlertController.this;
            alertController.S0 = (int) (alertController.Y() + AlertController.this.j0.getTranslationY());
            if (view != null && windowInsets != null) {
                if (AlertController.this.l0 != null) {
                    AlertController.this.l0.updateLayout(view);
                }
                AlertController.this.M1(windowInsets);
                view.post(new Runnable() { // from class: miuix.appcompat.app.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26310a.lambda$onApplyWindowInsets$0(view);
                    }
                });
            }
            return WindowInsets.CONSUMED;
        }
    }

    public static class AlertParams {
        int iconHeight;
        int iconWidth;
        ListAdapter mAdapter;
        boolean mAsyncInflatePanelEnabled;
        boolean mButtonForceVertical;
        CharSequence mCheckBoxMessage;
        boolean[] mCheckedItems;
        CharSequence mComment;
        final Context mContext;
        Cursor mCursor;
        View mCustomTitleView;
        boolean mEnableDialogImmersive;
        boolean mEnableEnterAnim;
        List<ButtonInfo> mExtraButtonList;
        boolean mHapticFeedbackEnabled;
        Drawable mIcon;
        final LayoutInflater mInflater;
        boolean mIsChecked;
        String mIsCheckedColumn;
        boolean mIsMultiChoice;
        boolean mIsSingleChoice;
        CharSequence[] mItems;
        s70 mItemsProvider;
        String mLabelColumn;
        int mLiteVersion;
        CharSequence mMessage;
        DialogInterface.OnClickListener mNegativeButtonListener;
        CharSequence mNegativeButtonText;
        DialogInterface.OnClickListener mNeutralButtonListener;
        CharSequence mNeutralButtonText;
        int mNonImmersiveDialogHeight;
        DialogInterface.OnCancelListener mOnCancelListener;
        DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        DialogInterface.OnClickListener mOnClickListener;
        c.d mOnDialogShowAnimListener;
        DialogInterface.OnDismissListener mOnDismissListener;
        AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        DialogInterface.OnKeyListener mOnKeyListener;
        OnPrepareListViewListener mOnPrepareListViewListener;
        DialogInterface.OnShowListener mOnShowListener;
        c.e mPanelSizeChangedListener;
        DialogInterface.OnClickListener mPositiveButtonListener;
        CharSequence mPositiveButtonText;
        boolean mPreferLandscape;
        boolean mSmallIcon;
        CharSequence mTitle;
        boolean mUseForceFlipCutout;
        View mView;
        int mViewLayoutResId;
        int mIconId = 0;
        int mIconAttrId = 0;
        int mCheckedItem = -1;
        boolean mCancelable = true;

        public enum ItemType {
            DEFAULT,
            CHOICE_SINGLE,
            CHOICE_MULTI
        }

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mEnableDialogImmersive = (bie.a() || (b63.f && p56.c(context))) ? false : true;
            this.mNonImmersiveDialogHeight = -2;
            int iS = pu6.s();
            this.mLiteVersion = iS;
            if (iS < 0) {
                this.mLiteVersion = 0;
            }
            this.mEnableEnterAnim = true;
            this.mExtraButtonList = new ArrayList();
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void createListView(final AlertController alertController) {
            int i;
            ItemType itemType;
            ListAdapter listAdapter;
            ListAdapter listAdapter2;
            final ListView listView = (ListView) this.mInflater.inflate(alertController.a0, (ViewGroup) null);
            if (this.mIsMultiChoice) {
                listAdapter2 = this.mCursor == null ? new ArrayAdapter<CharSequence>(this.mContext, alertController.b0, R.id.text1, this.mItems) { // from class: miuix.appcompat.app.AlertController.AlertParams.2
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i2, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i2, view, viewGroup);
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null && zArr[i2]) {
                            listView.setItemChecked(i2, true);
                        }
                        y94.b(view2, false);
                        ItemType itemType2 = ItemType.CHOICE_MULTI;
                        AlertParams.this.getClass();
                        AlertParams.setAccessibilityDelegate(view2, itemType2, null);
                        return view2;
                    }
                } : new CursorAdapter(this.mContext, this.mCursor, false) { // from class: miuix.appcompat.app.AlertController.AlertParams.3
                    private final int mIsCheckedIndex;
                    private final int mLabelIndex;

                    {
                        Cursor cursor = getCursor();
                        this.mLabelIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                        this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.mLabelIndex));
                        listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
                        ItemType itemType2 = ItemType.CHOICE_MULTI;
                        AlertParams.this.getClass();
                        AlertParams.setAccessibilityDelegate(view, itemType2, null);
                    }

                    @Override // android.widget.CursorAdapter
                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        View viewInflate = AlertParams.this.mInflater.inflate(alertController.b0, viewGroup, false);
                        y94.b(viewInflate, false);
                        return viewInflate;
                    }
                };
            } else {
                if (this.mIsSingleChoice) {
                    i = alertController.c0;
                    itemType = ItemType.CHOICE_SINGLE;
                } else {
                    i = alertController.d0;
                    itemType = ItemType.DEFAULT;
                }
                int i2 = i;
                final ItemType itemType2 = itemType;
                if (this.mCursor != null) {
                    listAdapter2 = new SimpleCursorAdapter(this.mContext, i2, this.mCursor, new String[]{this.mLabelColumn}, new int[]{R.id.text1}) { // from class: miuix.appcompat.app.AlertController.AlertParams.4
                        @Override // android.widget.CursorAdapter, android.widget.Adapter
                        public View getView(int i3, View view, ViewGroup viewGroup) {
                            View view2 = super.getView(i3, view, viewGroup);
                            if (view == null) {
                                bb1.c(view2);
                            }
                            ItemType itemType3 = itemType2;
                            AlertParams.this.getClass();
                            AlertParams.setAccessibilityDelegate(view2, itemType3, null);
                            return view2;
                        }
                    };
                } else {
                    listAdapter = this.mAdapter;
                    if (listAdapter == null) {
                        listAdapter2 = listAdapter;
                        CheckedItemAdapter checkedItemAdapter = new CheckedItemAdapter(this.mContext, i2, R.id.text1, this.mItems);
                        checkedItemAdapter.setItemsProvider(null);
                        checkedItemAdapter.setItemType(itemType2);
                        listAdapter2 = checkedItemAdapter;
                    }
                }
            }
            listAdapter2 = listAdapter;
            OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(listView);
            }
            alertController.X = listAdapter2;
            alertController.Y = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: miuix.appcompat.app.AlertController.AlertParams.5
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                        AlertParams.this.mOnClickListener.onClick(alertController.d, i3);
                        if (AlertParams.this.mIsSingleChoice) {
                            return;
                        }
                        alertController.d.dismiss();
                    }
                });
            } else if (this.mOnCheckboxClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: miuix.appcompat.app.AlertController.AlertParams.6
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                        boolean[] zArr = AlertParams.this.mCheckedItems;
                        if (zArr != null) {
                            zArr[i3] = listView.isItemChecked(i3);
                        }
                        AlertParams.this.mOnCheckboxClickListener.onClick(alertController.d, i3, listView.isItemChecked(i3));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                listView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                listView.setChoiceMode(2);
            }
            alertController.n = listView;
        }

        private static androidx.core.view.a getDefaultAccessibilityDelegateCompat(final ItemType itemType) {
            return new androidx.core.view.a() { // from class: miuix.appcompat.app.AlertController.AlertParams.1
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
                    super.onInitializeAccessibilityNodeInfo(view, m80Var);
                    int i = AnonymousClass10.$SwitchMap$miuix$appcompat$app$AlertController$AlertParams$ItemType[itemType.ordinal()];
                    if (i == 1) {
                        m80Var.a(16);
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        m80Var.i0(CheckBox.class.getName());
                        m80Var.a(16);
                        return;
                    }
                    m80Var.g0(true);
                    m80Var.i0(RadioButton.class.getName());
                    if (view instanceof miuix.androidbasewidget.widget.CheckedTextView) {
                        boolean zIsChecked = ((miuix.androidbasewidget.widget.CheckedTextView) view).isChecked();
                        m80Var.h0(zIsChecked);
                        m80Var.j0(!zIsChecked);
                        if (zIsChecked) {
                            m80Var.a0(m80.a.i);
                        }
                    }
                }
            };
        }

        public static void setAccessibilityDelegate(View view, ItemType itemType, s70 s70Var) {
            androidx.core.view.a defaultAccessibilityDelegateCompat;
            if (s70Var != null) {
                defaultAccessibilityDelegateCompat = s70Var.a();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("type=");
                sb.append(itemType);
                defaultAccessibilityDelegateCompat = getDefaultAccessibilityDelegateCompat(itemType);
            }
            if (defaultAccessibilityDelegateCompat != null) {
                androidx.core.view.c.r0(view, defaultAccessibilityDelegateCompat);
            }
        }

        public void apply(AlertController alertController) {
            int i;
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.e1(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.p1(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.i1(drawable);
                }
                int i2 = this.mIconId;
                if (i2 != 0) {
                    alertController.h1(i2);
                }
                int i3 = this.mIconAttrId;
                if (i3 != 0) {
                    alertController.h1(alertController.e0(i3));
                }
                if (this.mSmallIcon) {
                    alertController.r1(true);
                }
                int i4 = this.iconWidth;
                if (i4 != 0 && (i = this.iconHeight) != 0) {
                    alertController.j1(i4, i);
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.l1(charSequence2);
            }
            CharSequence charSequence3 = this.mComment;
            if (charSequence3 != null) {
                alertController.d1(charSequence3);
            }
            CharSequence charSequence4 = this.mPositiveButtonText;
            if (charSequence4 != null) {
                alertController.Y0(-1, charSequence4, this.mPositiveButtonListener, null);
            }
            CharSequence charSequence5 = this.mNegativeButtonText;
            if (charSequence5 != null) {
                alertController.Y0(-2, charSequence5, this.mNegativeButtonListener, null);
            }
            CharSequence charSequence6 = this.mNeutralButtonText;
            if (charSequence6 != null) {
                alertController.Y0(-3, charSequence6, this.mNeutralButtonListener, null);
            }
            if (this.mExtraButtonList != null) {
                alertController.M = new ArrayList(this.mExtraButtonList);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                createListView(alertController);
            }
            View view2 = this.mView;
            if (view2 != null) {
                alertController.t1(view2);
            } else {
                int i5 = this.mViewLayoutResId;
                if (i5 != 0) {
                    alertController.s1(i5);
                }
            }
            CharSequence charSequence7 = this.mCheckBoxMessage;
            if (charSequence7 != null) {
                alertController.c1(this.mIsChecked, charSequence7);
            }
            alertController.o0 = this.mHapticFeedbackEnabled;
            alertController.g1(this.mEnableDialogImmersive);
            alertController.m1(this.mNonImmersiveDialogHeight);
            alertController.k1(this.mLiteVersion);
            alertController.o1(this.mPreferLandscape);
            alertController.Z0(this.mButtonForceVertical);
            alertController.X0(this.mAsyncInflatePanelEnabled);
            alertController.setPanelSizeChangedListener(null);
            alertController.f1(this.mEnableEnterAnim);
            alertController.q1(this.mUseForceFlipCutout);
        }
    }

    public static final class ButtonHandler extends Handler {
        private static final int MSG_DISMISS_DIALOG = -1651327837;
        private final WeakReference<DialogInterface> mDialog;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DialogInterface dialogInterface = this.mDialog.get();
            int i = message.what;
            if (i != MSG_DISMISS_DIALOG) {
                ((DialogInterface.OnClickListener) message.obj).onClick(dialogInterface, i);
            } else if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        private s70 mItemsProvider;
        private AlertParams.ItemType mType;

        public CheckedItemAdapter(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
            this.mType = AlertParams.ItemType.DEFAULT;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view == null) {
                bb1.c(view2);
            }
            AlertParams.setAccessibilityDelegate(view2, this.mType, null);
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public void setItemType(AlertParams.ItemType itemType) {
            this.mType = itemType;
        }

        public void setItemsProvider(s70 s70Var) {
        }
    }

    public static class LayoutChangeListener implements View.OnLayoutChangeListener {
        private final WeakReference<AlertController> mHost;
        private final Rect mWindowVisibleFrame = new Rect();

        public LayoutChangeListener(AlertController alertController) {
            this.mHost = new WeakReference<>(alertController);
        }

        private void changeViewPadding(View view, int i, int i2) {
            view.setPadding(i, 0, i2, 0);
        }

        private void handleImeChange(View view, Rect rect, AlertController alertController) {
            int height = (view.getHeight() - alertController.X()) - rect.bottom;
            int systemWindowInsetBottom = 0;
            if (height > 0) {
                int i = -height;
                int i2 = Build.VERSION.SDK_INT;
                WindowInsets rootWindowInsets = view.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    systemWindowInsetBottom = i2 >= 30 ? rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom : rootWindowInsets.getSystemWindowInsetBottom();
                }
                systemWindowInsetBottom += i;
                alertController.g0.a();
            }
            alertController.J1(systemWindowInsetBottom);
        }

        private void handleMultiWindowLandscapeChange(AlertController alertController, int i) {
            if (!s6g.o(alertController.c)) {
                DialogRootView dialogRootView = alertController.h0;
                if (dialogRootView.getPaddingLeft() > 0 || dialogRootView.getPaddingRight() > 0) {
                    changeViewPadding(dialogRootView, 0, 0);
                    return;
                }
                return;
            }
            Rect rect = this.mWindowVisibleFrame;
            if (rect.left <= 0) {
                changeViewPadding(alertController.h0, 0, 0);
                return;
            }
            int iWidth = i - rect.width();
            if (this.mWindowVisibleFrame.right == i) {
                changeViewPadding(alertController.h0, iWidth, 0);
            } else {
                changeViewPadding(alertController.h0, 0, iWidth);
            }
        }

        public boolean hasNavigationBarHeightInMultiWindowMode() {
            zlr.c(this.mHost.get().c, this.mHost.get().C0);
            Rect rect = this.mWindowVisibleFrame;
            return (rect.left == 0 && rect.right == this.mHost.get().C0.x && this.mWindowVisibleFrame.top <= tc8.h(this.mHost.get().c, false)) ? false : true;
        }

        public boolean isInMultiScreenTop() {
            AlertController alertController = this.mHost.get();
            if (alertController == null) {
                return false;
            }
            zlr.c(alertController.c, alertController.C0);
            Rect rect = this.mWindowVisibleFrame;
            if (rect.left != 0 || rect.right != alertController.C0.x) {
                return false;
            }
            int i = (int) (alertController.C0.y * 0.75f);
            Rect rect2 = this.mWindowVisibleFrame;
            return rect2.top >= 0 && rect2.bottom <= i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AlertController alertController = this.mHost.get();
            if (alertController != null) {
                view.getWindowVisibleDisplayFrame(this.mWindowVisibleFrame);
                handleMultiWindowLandscapeChange(alertController, i3);
                if (Build.VERSION.SDK_INT < 30) {
                    if (view.findFocus() != null) {
                        if (alertController.z0()) {
                            return;
                        }
                        handleImeChange(view, this.mWindowVisibleFrame, alertController);
                    } else if (alertController.j0.getTranslationY() < 0.0f) {
                        alertController.J1(0);
                    }
                }
            }
        }

        public void updateLayout(View view) {
            AlertController alertController = this.mHost.get();
            if (alertController != null) {
                view.getWindowVisibleDisplayFrame(this.mWindowVisibleFrame);
                handleMultiWindowLandscapeChange(alertController, view.getWidth());
            }
        }
    }

    public AlertController(Context context, if1 if1Var, Window window) {
        e eVar = new e();
        this.B = eVar;
        this.C = new TextWatcher() { // from class: miuix.appcompat.app.AlertController.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (AlertController.this.j0 == null || AlertController.this.j0.findViewById(vsi.w) == null) {
                    return;
                }
                AlertController.this.j0.findViewById(vsi.w).requestLayout();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.N = 0;
        this.W = null;
        this.Y = -1;
        this.g0 = new yu6();
        this.m0 = true;
        this.n0 = true;
        this.p0 = 0;
        this.w0 = 18.0f;
        this.x0 = 16.0f;
        this.y0 = 13.0f;
        this.z0 = 18.0f;
        this.A0 = new Point();
        this.B0 = new Point();
        this.C0 = new Point();
        this.D0 = new Rect();
        this.H0 = false;
        this.I0 = false;
        this.K0 = new AnonymousClass2();
        this.R0 = new View.OnClickListener() { // from class: miuix.appcompat.app.AlertController.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i = alb.g;
                AlertController alertController = AlertController.this;
                Message messageObtain = null;
                if (view == alertController.D) {
                    Message message = alertController.F;
                    messageObtain = message != null ? Message.obtain(message) : null;
                    i = alb.f;
                } else if (view == alertController.G) {
                    Message message2 = alertController.I;
                    if (message2 != null) {
                        messageObtain = Message.obtain(message2);
                    }
                } else if (view == alertController.J) {
                    Message message3 = alertController.L;
                    if (message3 != null) {
                        messageObtain = Message.obtain(message3);
                    }
                } else {
                    if (alertController.M != null && !AlertController.this.M.isEmpty()) {
                        for (ButtonInfo buttonInfo : AlertController.this.M) {
                            if (view == buttonInfo.mButton) {
                                Message messageObtain2 = buttonInfo.mMsg;
                                if (messageObtain2 != null) {
                                    messageObtain2 = Message.obtain(messageObtain2);
                                }
                                messageObtain = messageObtain2;
                                break;
                            }
                        }
                    }
                    if ((view instanceof GroupButton) && ((GroupButton) view).b()) {
                        i = alb.f;
                    }
                }
                HapticCompat.performHapticFeedbackAsync(view, alb.z, i);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                AlertController.this.f0.sendEmptyMessage(-1651327837);
            }
        };
        this.T0 = false;
        eVar.f(new cv6()).e(new zu6());
        this.c = context;
        this.v0 = context.getResources().getConfiguration().densityDpi;
        this.d = if1Var;
        this.e = window;
        this.j = true;
        this.y = context.getResources().getInteger(mti.f27200b);
        this.f0 = new ButtonHandler(if1Var);
        this.l0 = new LayoutChangeListener(this);
        this.f26295b = b63.f && p56.c(context);
        this.L0 = (bie.a() || this.f26295b) ? false : true;
        R1(context);
        r0(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, g5j.X, R.attr.alertDialogStyle, 0);
        this.Z = typedArrayObtainStyledAttributes.getResourceId(g5j.Z, 0);
        this.a0 = typedArrayObtainStyledAttributes.getResourceId(g5j.b0, 0);
        this.b0 = typedArrayObtainStyledAttributes.getResourceId(g5j.c0, 0);
        this.c0 = typedArrayObtainStyledAttributes.getResourceId(g5j.f0, 0);
        this.d0 = typedArrayObtainStyledAttributes.getResourceId(g5j.a0, 0);
        this.e0 = typedArrayObtainStyledAttributes.getBoolean(g5j.e0, true);
        typedArrayObtainStyledAttributes.recycle();
        if1Var.e(1);
        if (Build.VERSION.SDK_INT < 28 && A0()) {
            abk.a(window, "addExtraFlags", new Class[]{Integer.TYPE}, 768);
        }
        Q1(context.getResources());
        this.q0 = context.getResources().getBoolean(sii.d);
        this.N0 = Thread.currentThread();
        x0();
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("create Dialog mCurrentDensityDpi ");
            sb.append(this.v0);
        }
    }

    public static boolean J(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (J(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final boolean A0() {
        Class<?> clsC = abk.c("android.os.SystemProperties");
        Class cls = Integer.TYPE;
        return ((Integer) abk.b(clsC, cls, "getInt", new Class[]{String.class, cls}, "ro.miui.notch", 0)).intValue() == 1;
    }

    public final void A1() {
        Point pointT = T(null);
        N1(pointT);
        int iD = this.s;
        if (iD == -1) {
            iD = s6g.d(this.c, pointT.x) - (this.t * 2);
        }
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("setupNonImmersiveWindow: windowWidth = ");
            sb.append(iD);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setupNonImmersiveWindow: availableWindowSizeDp = ");
            sb2.append(pointT);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("setupNonImmersiveWindow: horizontalMargin = ");
            sb3.append(this.t);
        }
        int i = this.w;
        int i2 = (i <= 0 || i < this.A0.y) ? i : -1;
        int iC0 = c0();
        this.e.setGravity(iC0);
        WindowManager.LayoutParams attributes = this.e.getAttributes();
        if ((iC0 & 80) == 80) {
            int i3 = this.f26295b ? this.A.f : this.A.d;
            boolean zQ = s6g.q(this.c);
            boolean z = s6g.o(this.c) && !this.v && p56.d(this.c);
            if ((this.v || (z && zQ)) && Build.VERSION.SDK_INT >= 30) {
                Insets insetsS = S(WindowInsets.Type.captionBar());
                int i4 = this.A.i;
                int i5 = insetsS != null ? insetsS.bottom : 0;
                i3 = i5 == 0 ? i3 + i4 : i3 + i5;
            }
            int i6 = attributes.flags;
            if ((i6 & 134217728) != 0) {
                this.e.clearFlags(134217728);
            }
            if ((i6 & 67108864) != 0) {
                this.e.clearFlags(67108864);
            }
            attributes.verticalMargin = (i3 * 1.0f) / this.A0.y;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 2;
        }
        this.e.setAttributes(attributes);
        this.e.addFlags(2);
        this.e.addFlags(262144);
        this.e.setDimAmount(dyq.f(this.c) ? gw6.f19395b : gw6.f19394a);
        this.e.setLayout(iD, i2);
        this.e.setBackgroundDrawableResource(rki.g);
        DialogParentPanel2 dialogParentPanel2 = this.j0;
        if (dialogParentPanel2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dialogParentPanel2.getLayoutParams();
            layoutParams.width = iD;
            layoutParams.height = -2;
            if (D0()) {
                layoutParams.gravity = c0();
            }
            this.j0.setLayoutParams(layoutParams);
            this.j0.setTag(null);
        }
        if (!this.j) {
            this.e.setWindowAnimations(0);
        } else if (E0()) {
            this.e.setWindowAnimations(z2j.f40811a);
        }
    }

    public final boolean B0() {
        byte b2;
        boolean zO = s6g.o(this.c);
        int i = this.c.getResources().getConfiguration().keyboard;
        boolean z = i == 2 || i == 3;
        boolean z2 = b63.f3843b;
        if (!zO || z0()) {
            b2 = -1;
        } else {
            b2 = p56.d(this.c) ? (byte) 0 : (byte) 1;
        }
        if (this.s0) {
            if ((!z2 || !z) && b2 == 0) {
                return true;
            }
        } else if ((!z2 || !z) && this.U0 && (this.T0 || zO)) {
            return true;
        }
        return false;
    }

    public final void B1(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) this.e.findViewById(R.id.icon);
        View view = this.V;
        if (view != null) {
            U0(view);
            viewGroup.addView(this.V, 0, new ViewGroup.LayoutParams(-1, -2));
            this.e.findViewById(vsi.t).setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        if (!(!TextUtils.isEmpty(this.f26296k)) || !this.e0) {
            this.e.findViewById(vsi.t).setVisibility(8);
            imageView.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.e.findViewById(vsi.t);
        this.S = textView;
        textView.setText(this.f26296k);
        int i = this.N;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable = this.O;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                this.S.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), imageView.getPaddingBottom());
                imageView.setVisibility(8);
            }
        }
        if (this.P) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            d.b bVar = this.A;
            layoutParams.width = bVar.j;
            layoutParams.height = bVar.f26320k;
        }
        if (this.Q != 0 && this.R != 0) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.width = this.Q;
            layoutParams2.height = this.R;
        }
        if (this.l == null || viewGroup.getVisibility() == 8) {
            return;
        }
        K(this.S);
    }

    public boolean C0() {
        boolean z = !y0() && Math.abs(this.z - SystemClock.uptimeMillis()) < this.y;
        if (this.j) {
            return this.s0 || z;
        }
        return false;
    }

    public final void C1() {
        D1(true, false, false, 1.0f);
        I1();
    }

    public final boolean D0() {
        return (y0() || this.w == -2) ? false : true;
    }

    public final void D1(boolean z, boolean z2, boolean z3, final float f) {
        ListAdapter listAdapter;
        if (y0()) {
            this.i0.setOnClickListener(new View.OnClickListener() { // from class: o41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28720a.F0(view);
                }
            });
            S1();
        } else {
            if (D0()) {
                this.h0.setOnClickListener(new View.OnClickListener() { // from class: p41
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f29978a.G0(view);
                    }
                });
            }
            this.i0.setVisibility(8);
        }
        if (z || z2 || this.O0) {
            ViewGroup viewGroup = (ViewGroup) this.j0.findViewById(vsi.q0);
            ViewGroup viewGroup2 = (ViewGroup) this.j0.findViewById(vsi.z);
            ViewGroup viewGroup3 = (ViewGroup) this.j0.findViewById(vsi.w);
            if (viewGroup2 != null) {
                w1(viewGroup2, z3);
            }
            if (viewGroup3 != null) {
                ((DialogButtonPanel) viewGroup3).e(G1());
                u1(viewGroup3);
            }
            if (viewGroup != null) {
                B1(viewGroup);
            }
            if (viewGroup != null && viewGroup.getVisibility() != 8) {
                View viewFindViewById = (this.l == null && this.n == null) ? null : viewGroup.findViewById(vsi.p0);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
            }
            ListView listView = this.n;
            if (listView != null && (listAdapter = this.X) != null) {
                listView.setAdapter(listAdapter);
                int i = this.Y;
                if (i > -1) {
                    listView.setItemChecked(i, true);
                    listView.setSelection(i);
                }
            }
            ViewStub viewStub = (ViewStub) this.j0.findViewById(vsi.x);
            if (viewStub != null) {
                v1(this.j0, viewStub);
            }
            if (!z) {
                M0();
            }
        } else {
            this.j0.post(new Runnable() { // from class: miuix.appcompat.app.AlertController.6
                @Override // java.lang.Runnable
                public void run() {
                    ViewGroup viewGroup4 = (ViewGroup) AlertController.this.j0.findViewById(vsi.z);
                    ViewGroup viewGroup5 = (ViewGroup) AlertController.this.j0.findViewById(vsi.w);
                    if (viewGroup4 != null) {
                        AlertController.this.L1(viewGroup4);
                        if (viewGroup5 != null && !AlertController.this.O0) {
                            AlertController.this.K1(viewGroup5, viewGroup4);
                        }
                    }
                    float f2 = f;
                    if (f2 != 1.0f) {
                        AlertController.this.X1(f2);
                    }
                }
            });
        }
        this.j0.post(new Runnable() { // from class: q41
            @Override // java.lang.Runnable
            public final void run() {
                this.f31064a.H0();
            }
        });
    }

    public final boolean E0() {
        return b63.f3843b || this.g;
    }

    public final void E1() {
        if (y0()) {
            z1();
        } else {
            A1();
        }
    }

    public final /* synthetic */ void F0(View view) {
        if (u0() && v0()) {
            p0();
            this.d.cancel();
        }
    }

    @RequiresApi(api = 30)
    public final void F1() {
        if (y0()) {
            this.e.setSoftInputMode((this.e.getAttributes().softInputMode & 15) | 48);
            this.e.getDecorView().setWindowInsetsAnimationCallback(new WindowInsetsAnimation$Callback(1) { // from class: miuix.appcompat.app.AlertController.7
                boolean isTablet = false;

                public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                    super.onEnd(windowInsetsAnimation);
                    AlertController.this.T0 = true;
                    WindowInsets rootWindowInsets = AlertController.this.e.getDecorView().getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.ime());
                        if (insets.bottom <= 0 && AlertController.this.j0.getTranslationY() < 0.0f) {
                            AlertController.this.J1(0);
                        }
                        AlertController.this.U1(rootWindowInsets);
                        if (this.isTablet) {
                            return;
                        }
                        AlertController.this.P1(insets.bottom);
                    }
                }

                public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                    super.onPrepare(windowInsetsAnimation);
                    AlertController.this.g0.a();
                    AlertController.this.T0 = false;
                    this.isTablet = AlertController.this.E0();
                }

                @RequiresApi(api = 30)
                public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                    Insets insets = windowInsets.getInsets(WindowInsets.Type.ime());
                    Insets insets2 = windowInsets.getInsets(WindowInsets.Type.navigationBars());
                    int iMax = insets.bottom - Math.max(AlertController.this.S0, insets2.bottom);
                    if (windowInsets.isVisible(WindowInsets.Type.ime())) {
                        if (AlertController.this.f26294a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("WindowInsetsAnimation onProgress mPanelAndImeMargin : ");
                            sb.append(AlertController.this.S0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("WindowInsetsAnimation onProgress ime : ");
                            sb2.append(insets.bottom);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("WindowInsetsAnimation onProgress navigationBar : ");
                            sb3.append(insets2.bottom);
                        }
                        AlertController.this.J1(-(iMax < 0 ? 0 : iMax));
                    }
                    if (!this.isTablet) {
                        AlertController.this.P1(iMax);
                    }
                    return windowInsets;
                }

                public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                    AlertController alertController = AlertController.this;
                    alertController.S0 = (int) (alertController.Y() + AlertController.this.j0.getTranslationY());
                    if (AlertController.this.f26294a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WindowInsetsAnimation onStart mPanelAndImeMargin : ");
                        sb.append(AlertController.this.S0);
                    }
                    if (AlertController.this.S0 <= 0) {
                        AlertController.this.S0 = 0;
                    }
                    return super.onStart(windowInsetsAnimation, bounds);
                }
            });
            this.e.getDecorView().setOnApplyWindowInsetsListener(new AnonymousClass8());
            this.U0 = true;
        }
    }

    public final /* synthetic */ void G0(View view) {
        if (u0() && v0()) {
            p0();
            this.d.cancel();
        }
    }

    public final boolean G1() {
        if (n0() == 0) {
            return false;
        }
        Point point = this.A0;
        int i = point.x;
        return i >= this.A.f26319b && i * 2 > point.y && this.O0;
    }

    public final void H() {
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        layoutParams.height = -2;
        this.n.setLayoutParams(layoutParams);
    }

    public final /* synthetic */ void H0() {
    }

    public final boolean H1() {
        int i = this.e.getAttributes().type;
        return this.f26295b && ((i == 2038 || i == 2003) || this.I0);
    }

    public final boolean I(DialogButtonPanel dialogButtonPanel, int i) {
        int buttonFullyVisibleHeight = dialogButtonPanel.getButtonFullyVisibleHeight();
        ViewGroup viewGroup = (ViewGroup) this.j0.findViewById(vsi.q0);
        int height = viewGroup != null ? viewGroup.getHeight() : 0;
        int i2 = tc8.l(this.c).y;
        boolean z = s6g.f(this.c) == 2;
        d.a aVar = new d.a();
        aVar.a(buttonFullyVisibleHeight, dialogButtonPanel.getHeight(), i2, height, this.f26295b, l0(), i, this.B0.y, z, this.n != null);
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("buttonNeedScrollable: buttonScrollSpec = ");
            sb.append(aVar);
        }
        return this.B.c(aVar);
    }

    public final boolean I0() {
        return m0() * this.X.getCount() > ((int) (((float) this.A0.y) * (s6g.f(this.c) == 2 ? 0.3f : 0.35f)));
    }

    public final void I1() {
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        float f = displayMetrics.scaledDensity;
        float f2 = displayMetrics.density;
        View view = this.V;
        if (view != null) {
            this.W = (TextView) view.findViewById(R.id.title);
        }
        TextView textView = this.W;
        if (textView != null) {
            this.z0 = textView.getTextSize();
            int textSizeUnit = Build.VERSION.SDK_INT >= 30 ? this.W.getTextSizeUnit() : 2;
            if (textSizeUnit == 1) {
                this.z0 /= f2;
            } else if (textSizeUnit == 2) {
                this.z0 /= f;
            }
        }
    }

    public void J0() {
        R0();
        if (Build.VERSION.SDK_INT >= 30) {
            F1();
        }
    }

    public final void J1(int i) {
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("The DialogPanel transitionY for : ");
            sb.append(i);
        }
        this.j0.animate().cancel();
        this.j0.setTranslationY(i);
    }

    public final void K(TextView textView) {
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), 0);
    }

    public void K0(Configuration configuration, boolean z, boolean z2) {
        this.f26295b = b63.f && p56.c(this.c);
        this.v = s6g.m(this.c);
        Q1(this.c.getResources());
        a0();
        R1(this.c);
        int i = configuration.densityDpi;
        float f = (i * 1.0f) / this.v0;
        if (f != 1.0f) {
            this.v0 = i;
        }
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConfigurationChangednewDensityDpi ");
            sb.append(this.v0);
            sb.append(" densityScale ");
            sb.append(f);
        }
        if (!this.F0 || w0(configuration) || this.f26295b || z) {
            this.F0 = false;
            this.u = -1;
            V1(null);
            if (this.f26294a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onConfigurationChanged mRootViewSize ");
                sb2.append(this.A0);
            }
            if (!M()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("dialog is created in thread:");
                sb3.append(this.N0);
                sb3.append(", but onConfigurationChanged is called from different thread:");
                sb3.append(Thread.currentThread());
                sb3.append(", so this onConfigurationChanged call should be ignore");
                return;
            }
            if (y0()) {
                this.e.getDecorView().removeOnLayoutChangeListener(this.l0);
            }
            if (this.e.getDecorView().isAttachedToWindow()) {
                if (f != 1.0f) {
                    this.A.f26318a = this.c.getResources().getDimensionPixelSize(dmi.R);
                    this.A.f26319b = this.c.getResources().getDimensionPixelSize(dmi.S);
                }
                R0();
                if (y0()) {
                    Y1();
                } else {
                    A1();
                }
                this.j0.setIsInTinyScreen(this.f26295b);
                this.j0.setIsDebugEnabled(this.f26294a);
                D1(false, z, z2, f);
                this.j0.b();
            }
            if (y0()) {
                this.l0.updateLayout(this.e.getDecorView());
                this.e.getDecorView().addOnLayoutChangeListener(this.l0);
                WindowInsets rootWindowInsets = this.e.getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    M1(rootWindowInsets);
                }
                this.h0.post(new Runnable() { // from class: miuix.appcompat.app.AlertController.9
                    @Override // java.lang.Runnable
                    public void run() {
                        WindowInsets rootWindowInsets2 = AlertController.this.e.getDecorView().getRootWindowInsets();
                        if (rootWindowInsets2 != null) {
                            AlertController.this.M1(rootWindowInsets2);
                        }
                    }
                });
            }
            this.j0.setPanelMaxLimitHeight(j0(null));
        }
    }

    public final void K1(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int iN0 = n0();
        Point point = new Point();
        zlr.c(this.c, point);
        DialogButtonPanel dialogButtonPanel = (DialogButtonPanel) viewGroup;
        boolean z = ((float) this.A0.y) <= ((float) Math.max(point.x, point.y)) * 0.3f || I(dialogButtonPanel, iN0);
        dialogButtonPanel.setForceVertical(this.P0 || this.k0 || (this.f26295b && (this.c.getResources().getConfiguration().orientation == 1)) || (s6g.f(this.c) == 2));
        if (!z) {
            T0(viewGroup, this.j0);
        } else {
            T0(viewGroup, viewGroup2);
            ((NestedScrollViewExpander) viewGroup2).setExpandView(null);
        }
    }

    public final void L() {
        View currentFocus = this.e.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
            p0();
        }
    }

    public void L0() {
        if (bb1.f()) {
            return;
        }
        Folme.clean(this.j0, this.i0);
        J1(0);
    }

    public final void L1(ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.custom);
        boolean z = frameLayout != null && frameLayout.getChildCount() > 0;
        ListView listView = this.n;
        if (listView == null) {
            if (z) {
                androidx.core.view.c.G0(frameLayout.getChildAt(0), true);
            }
            NestedScrollViewExpander nestedScrollViewExpander = (NestedScrollViewExpander) viewGroup;
            if (!z) {
                frameLayout = null;
            }
            nestedScrollViewExpander.setExpandView(frameLayout);
            return;
        }
        if (!z) {
            ((NestedScrollViewExpander) viewGroup).setExpandView(listView);
            return;
        }
        if (I0()) {
            S0();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.weight = 0.0f;
            frameLayout.setLayoutParams(layoutParams);
            ((NestedScrollViewExpander) viewGroup).setExpandView(null);
            viewGroup.requestLayout();
            return;
        }
        H();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams2);
        ((NestedScrollViewExpander) viewGroup).setExpandView((View) frameLayout.getParent());
        viewGroup.requestLayout();
    }

    public final boolean M() {
        return this.N0 == Thread.currentThread();
    }

    public final void M0() {
        ((c) this.d).t();
    }

    @RequiresApi(api = 30)
    public final void M1(WindowInsets windowInsets) {
        U1(windowInsets);
        if (B0()) {
            boolean zO = s6g.o(this.c);
            Insets insets = windowInsets.getInsets(WindowInsets.Type.ime());
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.navigationBars());
            if (this.f26294a) {
                StringBuilder sb = new StringBuilder();
                sb.append("The mPanelAndImeMargin: ");
                sb.append(this.S0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("The imeInsets info: ");
                sb2.append(insets.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("The navigationBarInsets info: ");
                sb3.append(insets2.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("The insets info: ");
                sb4.append(windowInsets);
            }
            boolean zE0 = E0();
            if (!zE0) {
                P1(insets.bottom);
            }
            int i = insets.bottom;
            if (zO && !zE0) {
                i -= insets2.bottom;
            }
            O1(i, zO, zE0);
        }
    }

    @RequiresApi(api = 30)
    public final void N() {
        if (this.U0) {
            this.e.getDecorView().setWindowInsetsAnimationCallback(null);
            this.e.getDecorView().setOnApplyWindowInsetsListener(null);
            this.U0 = false;
        }
    }

    public void N0() {
        if (y0()) {
            if (this.i0 != null) {
                P1(0);
            }
            R0();
            Y1();
            if (this.i || !this.j) {
                this.j0.setTag(null);
                this.i0.setAlpha(dyq.f(this.c) ? gw6.f19395b : gw6.f19394a);
            } else {
                this.g0.c(this.j0, this.i0, E0(), this.f, this.K0);
            }
            this.l0.updateLayout(this.e.getDecorView());
            this.e.getDecorView().addOnLayoutChangeListener(this.l0);
        }
    }

    public final void N1(Point point) {
        Point pointT = point == null ? T(null) : point;
        d.c cVar = new d.c();
        cVar.g.set(pointT.x, pointT.y);
        Point point2 = cVar.c;
        Point point3 = this.A0;
        point2.set(point3.x, point3.y);
        zlr.c(this.c, cVar.h);
        cVar.a(this.q0, this.v, l0(), this.g, this.h);
        boolean zD = this.B.d(cVar);
        int i = pointT.x;
        boolean zG = this.B.g(i);
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateDialogPanelLayoutParams isLandScape ");
            sb.append(zD);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateDialogPanelLayoutParams shouldLimitWidth ");
            sb2.append(zG);
        }
        boolean z = false;
        int iB = zG ? 0 : this.B.b(this.A, i);
        this.f = zD;
        d.e eVar = new d.e();
        if (this.O0 && G1()) {
            z = true;
        }
        eVar.a(z, zD, this.g, this.q0, i, this.t0, this.f26294a);
        this.s = this.B.a(eVar, this.A);
        q0();
        this.t = iB;
    }

    public final void O(View view) {
        if ((view instanceof DialogParentPanel2) || view == null) {
            return;
        }
        int i = 0;
        view.setFitsSystemWindows(false);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            O(viewGroup.getChildAt(i));
            i++;
        }
    }

    public void O0() {
        if (y0()) {
            this.e.getDecorView().removeOnLayoutChangeListener(this.l0);
        }
    }

    public final void O1(int i, boolean z, boolean z2) {
        if (i <= 0) {
            if (this.j0.getTranslationY() < 0.0f) {
                J1(0);
                return;
            }
            return;
        }
        int iY = (int) (Y() + this.j0.getTranslationY());
        this.S0 = iY;
        if (iY <= 0) {
            this.S0 = 0;
        }
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateDialogPanelTranslationYByIme mPanelAndImeMargin ");
            sb.append(this.S0);
            sb.append(" isMultiWindowMode ");
            sb.append(z);
            sb.append(" imeBottom ");
            sb.append(i);
        }
        int i2 = (!z2 || i >= this.S0) ? (!z || z2) ? (-i) + this.S0 : -i : 0;
        if (!this.s0) {
            if (this.f26294a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateDialogPanelTranslationYByIme translateDialogPanel Y=");
                sb2.append(i2);
            }
            J1(i2);
            return;
        }
        if (this.f26294a) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("updateDialogPanelTranslationYByIme anim translateDialogPanel Y=");
            sb3.append(i2);
        }
        this.j0.animate().cancel();
        this.j0.animate().setDuration(200L).translationY(i2).start();
    }

    public final void P(View view) {
        y94.b(view, false);
    }

    public final void P0(String str, String str2, boolean z) {
        if (this.f26294a || z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
        }
    }

    public final void P1(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i0.getLayoutParams();
        if (marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            this.i0.requestLayout();
        }
    }

    public void Q(yu6.a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            N();
        }
        DialogParentPanel2 dialogParentPanel2 = this.j0;
        if (dialogParentPanel2 == null) {
            if (aVar != null) {
                aVar.end();
            }
        } else if (dialogParentPanel2.isAttachedToWindow()) {
            L();
            this.g0.b(this.j0, E0(), this.i0, aVar);
        } else {
            try {
                ((c) this.d).v();
            } catch (IllegalArgumentException e) {
                Log.wtf("AlertController", "Not catch the dialog will throw the illegalArgumentException (In Case cause the crash , we expect it should be caught)", e);
            }
        }
    }

    public final Rect Q0(Rect rect) {
        float f = this.c.getResources().getDisplayMetrics().densityDpi / 160.0f;
        rect.left = s6g.t(f, rect.left);
        rect.top = s6g.t(f, rect.top);
        rect.right = s6g.t(f, rect.right);
        rect.bottom = s6g.t(f, rect.bottom);
        return rect;
    }

    public final void Q1(Resources resources) {
        this.A.f26318a = resources.getDimensionPixelSize(dmi.R);
        this.A.f26319b = resources.getDimensionPixelSize(dmi.S);
        this.A.c = resources.getDimensionPixelSize(dmi.Q);
        this.A.d = resources.getDimensionPixelSize(dmi.P);
        this.A.e = resources.getDimensionPixelSize(dmi.c);
        this.A.f = resources.getDimensionPixelSize(dmi.U);
        this.A.g = resources.getDimensionPixelSize(dmi.T);
        this.A.h = resources.getDimensionPixelSize(dmi.M);
        this.A.i = resources.getDimensionPixelSize(dmi.L);
        this.A.j = resources.getDimensionPixelSize(dmi.O);
        this.A.f26320k = resources.getDimensionPixelSize(dmi.N);
    }

    public boolean R(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 82;
    }

    public final void R0() {
        this.q0 = this.c.getResources().getBoolean(sii.d);
        T1();
    }

    public final void R1(Context context) {
        boolean zB = p56.b(context, null);
        this.g = zB;
        if (zB) {
            this.h = true;
        } else {
            this.h = p56.e(context);
        }
    }

    public final Insets S(int i) {
        WindowInsets rootWindowInsets;
        Activity activityL = ((c) this.d).l();
        if (activityL == null || Build.VERSION.SDK_INT < 30 || (rootWindowInsets = activityL.getWindow().getDecorView().getRootWindowInsets()) == null) {
            return null;
        }
        return rootWindowInsets.getInsets(i);
    }

    public final void S0() {
        int i = (int) (this.A0.y * 0.35f);
        int iM0 = m0();
        int i2 = iM0 * (i / iM0);
        this.n.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        layoutParams.height = i2;
        this.n.setLayoutParams(layoutParams);
    }

    public final void S1() {
        Point pointT = T(null);
        N1(pointT);
        int iD = this.s;
        if (iD == -1) {
            iD = s6g.d(this.c, pointT.x) - (this.t * 2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, -2);
        layoutParams.gravity = c0();
        if (this.s == -1) {
            int i = this.t;
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
        this.j0.setLayoutParams(layoutParams);
    }

    public final Point T(WindowInsets windowInsets) {
        Point point = new Point();
        Point point2 = this.B0;
        int i = point2.x;
        int i2 = point2.y;
        Rect rect = new Rect();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            rect = i0(windowInsets, true);
        }
        if (this.f26295b) {
            Rect rectD0 = d0(windowInsets, true);
            i -= rectD0.left + rectD0.right;
            i2 -= rectD0.top + rectD0.bottom;
        } else if (i3 >= 30 && !y0()) {
            Insets insetsS = S(WindowInsets.Type.displayCutout());
            if (insetsS != null) {
                Rect rectQ0 = Q0(new Rect(insetsS.left, insetsS.top, insetsS.right, insetsS.bottom));
                i -= rectQ0.left + rectQ0.right;
                i2 -= rectQ0.top + rectQ0.bottom;
            }
            if (this.f26294a) {
                StringBuilder sb = new StringBuilder();
                sb.append("getAvailableWindowSizeDp: cutoutInsets = ");
                sb.append(insetsS);
            }
        }
        int i4 = i - (rect.left + rect.right);
        int i5 = i2 - (rect.top + rect.bottom);
        point.x = i4;
        point.y = i5;
        return point;
    }

    public final void T0(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        if (viewGroup2 == viewGroup) {
            return;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view);
    }

    public final void T1() {
        Configuration configuration = this.c.getResources().getConfiguration();
        int iMin = (int) (Math.min(configuration.screenWidthDp, configuration.screenHeightDp) * (configuration.densityDpi / 160.0f));
        if (iMin > 0) {
            this.t0 = iMin;
            return;
        }
        Point point = new Point();
        this.u0.getDefaultDisplay().getSize(point);
        this.t0 = Math.min(point.x, point.y);
    }

    public Button U(int i) {
        if (i == -3) {
            return this.J;
        }
        if (i == -2) {
            return this.G;
        }
        if (i == -1) {
            return this.D;
        }
        List<ButtonInfo> list = this.M;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ButtonInfo buttonInfo : this.M) {
            if (buttonInfo.mWhich == i) {
                return buttonInfo.mButton;
            }
        }
        return null;
    }

    public final void U0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @RequiresApi(api = 30)
    public final void U1(WindowInsets windowInsets) {
        int i;
        boolean z;
        int i2;
        if (E0() || windowInsets == null) {
            return;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        Rect rectA = d.a(insetsIgnoringVisibility);
        Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
        this.D0.setEmpty();
        int width = this.h0.getWidth();
        int height = this.h0.getHeight();
        Point point = this.A0;
        if (point.x == 0 || point.y == 0) {
            V1(null);
            Point point2 = this.A0;
            i = point2.x;
            height = point2.y;
        } else {
            i = width;
        }
        if (insets != null && !this.v) {
            this.D0.set(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (this.f26295b) {
            Rect rectD0 = d0(windowInsets, false);
            this.D0.set(rectD0.left, rectD0.top, rectD0.right, rectD0.bottom);
        }
        Rect rectB = d.b(rectA, this.D0);
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateParentPanelMargin systemBarInsets: ");
            sb.append(insetsIgnoringVisibility);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateParentPanelMargin mDisplayCutoutSafeInsets: ");
            sb2.append(this.D0);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("updateParentPanelMargin boundInsets = ");
            sb3.append(rectB);
        }
        Point point3 = this.A0;
        Point point4 = new Point(point3.x, point3.y);
        if (i != 0 && i != point4.x) {
            point4.x = i;
            point4.y = height;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j0.getLayoutParams();
        d.c cVar = new d.c();
        Point pointL = tc8.l(this.c);
        cVar.a(this.q0, this.v, l0(), this.g, this.h);
        cVar.c.set(pointL.x, pointL.y);
        zlr.c(this.c, cVar.h);
        float f = this.c.getResources().getDisplayMetrics().densityDpi / 160.0f;
        int i3 = (point4.x - rectB.left) - rectB.right;
        int i4 = (point4.y - rectB.top) - rectB.bottom;
        int iT = s6g.t(f, i3);
        cVar.g.set(iT, s6g.t(f, i4));
        boolean zD = this.B.d(cVar);
        d.e eVar = new d.e();
        eVar.a(this.O0 && G1(), zD, this.g, this.q0, iT, this.t0, this.f26294a);
        int iA = this.B.a(eVar, this.A);
        d.C1022d c1022d = new d.C1022d();
        c1022d.j.set(rectB.left, rectB.top, rectB.right, rectB.bottom);
        c1022d.a(this.h0.getPaddingLeft(), this.h0.getPaddingRight(), i, iA, iT, i3, this.A0.x, this.f26295b, this.f26294a);
        Rect rect = new Rect();
        int iH = this.B.h(c1022d, this.A, rect);
        layoutParams.width = iH;
        int i5 = rect.bottom;
        boolean z2 = s6g.o(this.c) && !this.v && p56.d(this.c);
        if ((this.v || z2) && insetsIgnoringVisibility.bottom == 0) {
            Insets insetsS = S(WindowInsets.Type.captionBar());
            int i6 = this.A.i;
            int i7 = insetsS != null ? insetsS.bottom : 0;
            int i8 = i7 == 0 ? i6 + i5 : i5 + i7;
            if (f0(windowInsets) <= 0) {
                i5 = i8;
            }
        } else {
            boolean z3 = this.f26295b;
            if (!z3 || (i2 = this.D0.bottom) <= 0) {
                i2 = z3 ? 0 : rectB.bottom;
            }
            i5 += i2;
        }
        int i9 = layoutParams.topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            layoutParams.topMargin = i10;
            z = true;
        } else {
            z = false;
        }
        if (layoutParams.bottomMargin != i5) {
            layoutParams.bottomMargin = i5;
            z = true;
        }
        int i11 = layoutParams.leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            layoutParams.leftMargin = i12;
            z = true;
        }
        int i13 = layoutParams.rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            layoutParams.rightMargin = i14;
            z = true;
        }
        boolean z4 = iA == iH ? z : true;
        int iJ0 = j0(rectB);
        if (iJ0 != this.j0.getPanelMaxLimitHeight()) {
            this.j0.setPanelMaxLimitHeight(iJ0);
        } else if (!z4) {
            return;
        }
        this.j0.requestLayout();
    }

    public final int V(int i, int i2) {
        if (i2 == 0) {
            return i == 2 ? 2 : 1;
        }
        return i2;
    }

    public void V0() {
        ViewGroup viewGroup;
        DialogParentPanel2 dialogParentPanel2 = this.j0;
        if (dialogParentPanel2 == null || (viewGroup = (ViewGroup) dialogParentPanel2.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.j0);
    }

    public final void V1(Configuration configuration) {
        rkr rkrVarI = this.f26295b ? tc8.i(this.c) : tc8.j(this.c, configuration);
        Point point = this.B0;
        Point point2 = rkrVarI.d;
        point.x = point2.x;
        point.y = point2.y;
        Point point3 = this.A0;
        Point point4 = rkrVarI.c;
        point3.x = point4.x;
        point3.y = point4.y;
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateRootViewSize mRootViewSizeDp ");
            sb.append(this.B0);
            sb.append(" mRootViewSize ");
            sb.append(this.A0);
            if (configuration != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("configuration.density ");
                sb2.append(configuration.densityDpi / 160.0f);
            }
        }
    }

    @RequiresApi(api = 30)
    public final DisplayCutout W() {
        if (H1() && this.x != null) {
            P0("getCutoutSafely", "show system alert in flip, use displayCutout by reflect, displayCutout = " + this.x, false);
            return this.x;
        }
        try {
            DisplayCutout cutout = this.c.getDisplay().getCutout();
            P0("getCutoutSafely", "get displayCutout from context = " + cutout, false);
            return cutout;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("context is not associated display info, please check the type of context, the exception info = ");
            sb.append(Log.getStackTraceString(e));
            WindowManager windowManager = this.u0;
            Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
            if (defaultDisplay != null) {
                return defaultDisplay.getCutout();
            }
            return null;
        }
    }

    public final void W0(View view) {
        if (!this.j || view == null || E0() || y0() || !J(view)) {
            return;
        }
        this.e.setWindowAnimations(z2j.f40812b);
    }

    public final void W1(View view) {
        this.A0.x = view.getWidth();
        this.A0.y = view.getHeight();
        float f = this.c.getResources().getDisplayMetrics().density;
        Point point = this.B0;
        Point point2 = this.A0;
        point.x = (int) (point2.x / f);
        point.y = (int) (point2.y / f);
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateRootViewSize by view mRootViewSizeDp ");
            sb.append(this.B0);
            sb.append(" mRootViewSize ");
            sb.append(this.A0);
            sb.append(" configuration.density ");
            sb.append(f);
        }
    }

    public final int X() {
        return 0;
    }

    public void X0(boolean z) {
        this.Q0 = z;
    }

    public final void X1(float f) {
        TextView textView;
        DialogParentPanel2 dialogParentPanel2 = this.j0;
        if (dialogParentPanel2 != null) {
            zy5.d(dialogParentPanel2, f);
        }
        TextView textView2 = this.S;
        if (textView2 != null) {
            zy5.b(textView2, this.w0);
        }
        TextView textView3 = this.T;
        if (textView3 != null) {
            zy5.b(textView3, this.x0);
        }
        TextView textView4 = this.U;
        if (textView4 != null) {
            zy5.b(textView4, this.y0);
            zy5.d(this.U, f);
        }
        if (this.V != null && (textView = this.W) != null) {
            zy5.a(textView, this.z0);
        }
        View viewFindViewById = this.e.findViewById(vsi.w);
        if (viewFindViewById != null) {
            zy5.c(viewFindViewById, f);
        }
        ViewGroup viewGroup = (ViewGroup) this.e.findViewById(vsi.q0);
        if (viewGroup != null) {
            zy5.d(viewGroup, f);
        }
        View viewFindViewById2 = this.e.findViewById(vsi.A);
        if (viewFindViewById2 != null) {
            zy5.c(viewFindViewById2, f);
        }
        CheckBox checkBox = (CheckBox) this.e.findViewById(R.id.checkbox);
        if (checkBox != null) {
            zy5.c(checkBox, f);
        }
        ImageView imageView = (ImageView) this.e.findViewById(R.id.icon);
        if (imageView != null) {
            zy5.e(imageView, f);
            zy5.c(imageView, f);
        }
    }

    public final int Y() {
        int[] iArr = new int[2];
        this.j0.getLocationInWindow(iArr);
        if (this.u == -1) {
            this.u = this.A.d;
        }
        return (this.e.getDecorView().getHeight() - (iArr[1] + this.j0.getHeight())) - this.u;
    }

    public void Y0(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f0.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.K = charSequence;
            this.L = message;
        } else if (i == -2) {
            this.H = charSequence;
            this.I = message;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.E = charSequence;
            this.F = message;
        }
    }

    public final void Y1() {
        int iL0 = l0();
        if (Build.VERSION.SDK_INT <= 28 || this.p0 == iL0) {
            return;
        }
        this.p0 = iL0;
        Activity activityL = ((c) this.d).l();
        if (activityL != null) {
            int iV = V(iL0, activityL.getWindow().getAttributes().layoutInDisplayCutoutMode);
            if (this.e.getAttributes().layoutInDisplayCutoutMode != iV) {
                this.e.getAttributes().layoutInDisplayCutoutMode = iV;
                View decorView = this.e.getDecorView();
                if (this.d.isShowing() && decorView.isAttachedToWindow()) {
                    this.u0.updateViewLayout(this.e.getDecorView(), this.e.getAttributes());
                    return;
                }
                return;
            }
            return;
        }
        int i = l0() != 2 ? 1 : 2;
        if (this.e.getAttributes().layoutInDisplayCutoutMode != i) {
            this.e.getAttributes().layoutInDisplayCutoutMode = i;
            View decorView2 = this.e.getDecorView();
            if (this.d.isShowing() && decorView2.isAttachedToWindow()) {
                this.u0.updateViewLayout(this.e.getDecorView(), this.e.getAttributes());
            }
        }
    }

    @RequiresApi(api = 30)
    public final Rect Z(boolean z) {
        Rect rect = new Rect();
        Insets insetsS = S(WindowInsets.Type.displayCutout());
        if (insetsS != null) {
            rect.set(insetsS.left, insetsS.top, insetsS.right, insetsS.bottom);
            P0("getDisplayCutout", "get cutout from host, cutout = " + rect.flattenToString(), false);
        } else {
            DisplayCutout displayCutoutW = W();
            rect.left = displayCutoutW != null ? displayCutoutW.getSafeInsetLeft() : 0;
            rect.top = displayCutoutW != null ? displayCutoutW.getSafeInsetTop() : 0;
            rect.right = displayCutoutW != null ? displayCutoutW.getSafeInsetRight() : 0;
            rect.bottom = displayCutoutW != null ? displayCutoutW.getSafeInsetBottom() : 0;
        }
        return z ? Q0(rect) : rect;
    }

    public void Z0(boolean z) {
        this.P0 = z;
    }

    public final void a0() {
        Display defaultDisplay;
        if (this.f26295b) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    defaultDisplay = this.c.getDisplay();
                } else {
                    WindowManager windowManager = this.u0;
                    defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                }
                if (defaultDisplay == null || i < 28) {
                    this.x = null;
                } else {
                    this.x = xlr.a(ebk.l(defaultDisplay.getClass(), "getFlipFoldedCutout", new Class[0]).invoke(defaultDisplay, new Object[0]));
                }
            } catch (Exception unused) {
                P0("getFlipCutout", "can't reflect from display to query cutout", false);
                this.x = null;
            }
        }
    }

    public void a1(boolean z) {
        this.m0 = z;
    }

    public final int b0(Rect rect) {
        int i;
        int i2;
        if (rect != null) {
            i2 = rect.top;
            i = rect.bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        boolean z = i2 == 0 || i == 0;
        if (Build.VERSION.SDK_INT >= 30 && z) {
            Insets insetsS = S(WindowInsets.Type.captionBar());
            i2 = insetsS != null ? insetsS.top : 0;
            i = insetsS != null ? insetsS.bottom : 0;
        }
        if (i2 == 0) {
            if (E0()) {
                i2 = this.A.h;
            } else {
                d.b bVar = this.A;
                i2 = bVar.i + bVar.d;
            }
        }
        if (i == 0) {
            if (E0()) {
                i = this.A.h;
            } else {
                d.b bVar2 = this.A;
                i = bVar2.i + bVar2.d;
            }
        }
        return i2 + i;
    }

    public void b1(boolean z) {
        this.n0 = z;
    }

    public final int c0() {
        return E0() ? 17 : 81;
    }

    public void c1(boolean z, CharSequence charSequence) {
        this.r0 = z;
        this.G0 = charSequence;
    }

    public final Rect d0(WindowInsets windowInsets, boolean z) {
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT < 30) {
            return rect;
        }
        if (windowInsets == null) {
            return Z(z);
        }
        Insets insets = windowInsets.getInsets(WindowInsets.Type.displayCutout());
        rect.set(insets.left, insets.top, insets.right, insets.bottom);
        if (!z) {
            return rect;
        }
        Q0(rect);
        return rect;
    }

    public void d1(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public int e0(int i) {
        TypedValue typedValue = new TypedValue();
        this.c.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public void e1(View view) {
        this.V = view;
    }

    @RequiresApi(api = 30)
    public final int f0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            windowInsets = this.e.getDecorView().getRootWindowInsets();
        }
        if (windowInsets != null) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.ime());
            if (insets != null) {
                return insets.bottom;
            }
            return 0;
        }
        Insets insetsS = S(WindowInsets.Type.ime());
        if (insetsS != null) {
            return insetsS.bottom;
        }
        return 0;
    }

    public void f1(boolean z) {
        this.j = z;
    }

    public ListView g0() {
        return this.n;
    }

    public void g1(boolean z) {
        this.L0 = z;
    }

    public TextView h0() {
        return this.T;
    }

    public void h1(int i) {
        this.O = null;
        this.N = i;
    }

    @RequiresApi(api = 30)
    public final Rect i0(WindowInsets windowInsets, boolean z) {
        Rect rect = new Rect();
        if (windowInsets == null) {
            windowInsets = this.h0.getRootWindowInsets();
        }
        if (windowInsets != null) {
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars());
            rect.set(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
            return z ? Q0(rect) : rect;
        }
        Insets insetsS = S(WindowInsets.Type.navigationBars());
        if (insetsS != null) {
            rect.set(insetsS.left, insetsS.top, insetsS.right, insetsS.bottom);
            return z ? Q0(rect) : rect;
        }
        int iD = tc8.d(this.c, z);
        int iK0 = k0();
        if (iK0 == 1) {
            rect.right = iD;
        } else if (iK0 == 2) {
            rect.top = iD;
        } else if (iK0 != 3) {
            rect.bottom = iD;
        } else {
            rect.left = iD;
        }
        return rect;
    }

    public void i1(Drawable drawable) {
        this.O = drawable;
        this.N = 0;
    }

    public final int j0(Rect rect) {
        int i;
        int i2;
        int i3 = tc8.l(this.c).y;
        int i4 = this.f26295b ? this.A.f : this.A.d;
        if (rect != null) {
            i = rect.top;
            i2 = rect.bottom;
        } else if (Build.VERSION.SDK_INT >= 30) {
            Insets insetsS = S(WindowInsets.Type.systemBars());
            int i5 = insetsS != null ? insetsS.top : 0;
            i2 = insetsS != null ? insetsS.bottom : 0;
            i = i5;
        } else {
            i = 0;
            i2 = 0;
        }
        int iMax = (i3 - Math.max(i, i4)) - (i2 + i4);
        if (this.f26294a) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPanelMaxLimitHeight: boundInset = ");
            sb.append(rect);
            sb.append(", topInset = ");
            sb.append(i);
            sb.append(", bottomInset = ");
            sb.append(i2);
            sb.append(", windowHeight = ");
            sb.append(i3);
            sb.append(", verticalMargin = ");
            sb.append(i4);
            sb.append(", panelMaxLimitHeight = ");
            sb.append(iMax);
        }
        if (this.v) {
            iMax = i3 - b0(rect);
        }
        return this.f26295b ? i3 - (Math.max(i, tc8.h(this.c, false)) + i4) : iMax;
    }

    public void j1(int i, int i2) {
        this.Q = i;
        this.R = i2;
    }

    @RequiresApi(api = 30)
    public final int k0() {
        try {
            return this.c.getDisplay().getRotation();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("context is not associated display info, please check the type of context, the exception info = ");
            sb.append(Log.getStackTraceString(e));
            WindowManager windowManager = this.u0;
            Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
            if (defaultDisplay != null) {
                return defaultDisplay.getRotation();
            }
            return 0;
        }
    }

    public void k1(int i) {
        this.M0 = i;
    }

    public final int l0() {
        WindowManager windowManager = this.u0;
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        return (rotation == 1 || rotation == 3) ? 2 : 1;
    }

    public void l1(CharSequence charSequence) {
        this.l = charSequence;
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public int m0() {
        return hm1.g(this.c, zhi.y);
    }

    public void m1(int i) {
        this.w = i;
    }

    public final int n0() {
        Button button = this.D;
        int i = 1;
        if (button == null) {
            i = 1 ^ (TextUtils.isEmpty(this.E) ? 1 : 0);
        } else if (button.getVisibility() != 0) {
            i = 0;
        }
        Button button2 = this.G;
        if (button2 == null ? !TextUtils.isEmpty(this.H) : button2.getVisibility() == 0) {
            i++;
        }
        Button button3 = this.J;
        if (button3 == null ? !TextUtils.isEmpty(this.K) : button3.getVisibility() == 0) {
            i++;
        }
        List<ButtonInfo> list = this.M;
        if (list != null && !list.isEmpty()) {
            Iterator<ButtonInfo> it = this.M.iterator();
            while (it.hasNext()) {
                GroupButton groupButton = it.next().mButton;
                if (groupButton == null || groupButton.getVisibility() == 0) {
                    i++;
                }
            }
        }
        return i;
    }

    public void n1(boolean z) {
        this.H0 = z;
    }

    public boolean o0() {
        return this.H0;
    }

    public void o1(boolean z) {
        this.O0 = z;
    }

    public final void p0() {
        InputMethodManager inputMethodManager = (InputMethodManager) ni4.i(this.c, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.j0.getWindowToken(), 0);
        }
    }

    public void p1(CharSequence charSequence) {
        this.f26296k = charSequence;
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void q0() {
        this.k0 = false;
        int i = awi.q;
        if (this.O0 && G1()) {
            i = awi.f3519r;
            this.k0 = true;
        }
        if (this.f26297r != i) {
            this.f26297r = i;
            DialogParentPanel2 dialogParentPanel2 = this.j0;
            if (dialogParentPanel2 != null) {
                this.h0.removeView(dialogParentPanel2);
            }
            if (this.Q0) {
                this.j0 = (DialogParentPanel2) hl1.a().b(Integer.valueOf(this.f26297r), this.c, this.h0, false);
            } else {
                this.j0 = (DialogParentPanel2) LayoutInflater.from(this.c).inflate(this.f26297r, (ViewGroup) this.h0, false);
            }
            this.j0.setIsInTinyScreen(this.f26295b);
            this.j0.setIsDebugEnabled(this.f26294a);
            this.j0.setPanelMaxLimitHeight(j0(null));
            this.h0.addView(this.j0);
        }
    }

    public void q1(boolean z) {
        this.I0 = z;
    }

    public final void r0(Context context) {
        this.u0 = (WindowManager) context.getSystemService("window");
        T1();
    }

    public void r1(boolean z) {
        this.P = z;
    }

    public void s0(Bundle bundle) {
        this.i = bundle != null;
        this.v = s6g.m(this.c);
        a0();
        this.d.setContentView(this.Z);
        this.h0 = (DialogRootView) this.e.findViewById(vsi.H);
        this.i0 = this.e.findViewById(vsi.G);
        this.h0.setConfigurationChangedCallback(new DialogRootView.c() { // from class: miuix.appcompat.app.AlertController.4
            @Override // miuix.appcompat.internal.widget.DialogRootView.c
            public void onConfigurationChanged(Configuration configuration, int i, int i2, int i3, int i4) {
                AlertController.this.K0(configuration, false, false);
            }
        });
        Configuration configuration = this.c.getResources().getConfiguration();
        V1(null);
        E1();
        C1();
        this.E0 = configuration;
        this.F0 = true;
        this.h0.post(new Runnable() { // from class: miuix.appcompat.app.AlertController.5
            @Override // java.lang.Runnable
            public void run() {
                if (AlertController.this.y0()) {
                    AlertController alertController = AlertController.this;
                    alertController.W1(alertController.h0);
                }
                ViewGroup viewGroup = (ViewGroup) AlertController.this.j0.findViewById(vsi.z);
                ViewGroup viewGroup2 = (ViewGroup) AlertController.this.j0.findViewById(vsi.w);
                if (viewGroup2 == null || viewGroup == null || AlertController.this.G1()) {
                    return;
                }
                AlertController.this.K1(viewGroup2, viewGroup);
            }
        });
    }

    public void s1(int i) {
        this.o = null;
        this.p = i;
    }

    public void setLayoutReloadListener(c.InterfaceC1021c interfaceC1021c) {
    }

    public void setPanelSizeChangedListener(c.e eVar) {
    }

    public void setShowAnimListener(c.d dVar) {
        this.J0 = dVar;
    }

    public boolean t0() {
        return this.Q0;
    }

    public void t1(View view) {
        this.o = view;
        this.p = 0;
    }

    public final boolean u0() {
        return this.m0;
    }

    public final void u1(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.D = button;
        button.setOnClickListener(this.R0);
        this.D.removeTextChangedListener(this.C);
        this.D.addTextChangedListener(this.C);
        boolean z = true;
        if (TextUtils.isEmpty(this.E)) {
            this.D.setVisibility(8);
            i = 0;
        } else {
            this.D.setText(this.E);
            this.D.setVisibility(0);
            P(this.D);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.G = button2;
        button2.setOnClickListener(this.R0);
        this.G.removeTextChangedListener(this.C);
        this.G.addTextChangedListener(this.C);
        if (TextUtils.isEmpty(this.H)) {
            this.G.setVisibility(8);
        } else {
            this.G.setText(this.H);
            this.G.setVisibility(0);
            i++;
            P(this.G);
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.J = button3;
        button3.setOnClickListener(this.R0);
        this.J.removeTextChangedListener(this.C);
        this.J.addTextChangedListener(this.C);
        if (TextUtils.isEmpty(this.K)) {
            this.J.setVisibility(8);
        } else {
            this.J.setText(this.K);
            this.J.setVisibility(0);
            i++;
            P(this.J);
        }
        List<ButtonInfo> list = this.M;
        if (list != null && !list.isEmpty()) {
            for (ButtonInfo buttonInfo : this.M) {
                if (buttonInfo.mButton != null) {
                    U0(buttonInfo.mButton);
                }
            }
            for (ButtonInfo buttonInfo2 : this.M) {
                if (buttonInfo2.mButton == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    buttonInfo2.mButton = new GroupButton(this.c, null, buttonInfo2.mStyle);
                    buttonInfo2.mButton.setText(buttonInfo2.mText);
                    buttonInfo2.mButton.setOnClickListener(this.R0);
                    buttonInfo2.mButton.setLayoutParams(layoutParams);
                    buttonInfo2.mButton.setMaxLines(1);
                    buttonInfo2.mButton.setGravity(17);
                }
                if (buttonInfo2.mMsg == null) {
                    buttonInfo2.mMsg = this.f0.obtainMessage(buttonInfo2.mWhich, buttonInfo2.mOnClickListener);
                }
                if (buttonInfo2.mButton.getVisibility() != 8) {
                    i++;
                    P(buttonInfo2.mButton);
                }
                viewGroup.addView(buttonInfo2.mButton);
            }
        }
        if (i == 0) {
            viewGroup.setVisibility(8);
        } else {
            ((DialogButtonPanel) viewGroup).setForceVertical(this.P0 || this.k0 || (this.f26295b && zlr.n(this.c)) || (s6g.f(this.c) == 2));
        }
        Point point = new Point();
        zlr.c(this.c, point);
        int iMax = Math.max(point.x, point.y);
        ViewGroup viewGroup2 = (ViewGroup) this.j0.findViewById(vsi.z);
        boolean zI = I((DialogButtonPanel) viewGroup, i);
        if (this.A0.y > iMax * 0.3f && !zI) {
            z = false;
        }
        if (this.k0) {
            return;
        }
        if (!z) {
            T0(viewGroup, this.j0);
        } else {
            T0(viewGroup, viewGroup2);
            ((NestedScrollViewExpander) viewGroup2).setExpandView(null);
        }
    }

    public final boolean v0() {
        return this.n0;
    }

    public final void v1(ViewGroup viewGroup, ViewStub viewStub) {
        if (this.G0 != null) {
            viewStub.inflate();
            CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.checkbox);
            checkBox.setVisibility(0);
            checkBox.setChecked(this.r0);
            checkBox.setText(this.G0);
        }
        TextAlignLayout textAlignLayout = (TextAlignLayout) viewGroup.findViewById(vsi.n0);
        if (textAlignLayout != null) {
            textAlignLayout.setDialogPanelHasCheckbox(this.G0 != null);
        }
    }

    public final boolean w0(Configuration configuration) {
        Configuration configuration2 = this.E0;
        return (configuration2.uiMode != configuration.uiMode) || (configuration2.screenLayout != configuration.screenLayout) || (configuration2.orientation != configuration.orientation) || (configuration2.screenWidthDp != configuration.screenWidthDp) || (configuration2.screenHeightDp != configuration.screenHeightDp) || ((configuration2.fontScale > configuration.fontScale ? 1 : (configuration2.fontScale == configuration.fontScale ? 0 : -1)) != 0) || (configuration2.smallestScreenWidthDp != configuration.smallestScreenWidthDp) || (configuration2.keyboard != configuration.keyboard);
    }

    public final void w1(ViewGroup viewGroup, boolean z) {
        View childAt;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.custom);
        boolean z2 = false;
        if (frameLayout != null) {
            if (z) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration(0, 200L);
                layoutTransition.setInterpolator(0, new f55());
                frameLayout.setLayoutTransition(layoutTransition);
            } else {
                frameLayout.setLayoutTransition(null);
            }
        }
        if (this.n == null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(vsi.A);
            if (viewGroup2 != null) {
                x1(viewGroup2);
            }
            if (frameLayout != null) {
                boolean zY1 = y1(frameLayout);
                if (zY1 && (childAt = frameLayout.getChildAt(0)) != null) {
                    androidx.core.view.c.G0(childAt, true);
                }
                z2 = zY1;
            }
            NestedScrollViewExpander nestedScrollViewExpander = (NestedScrollViewExpander) viewGroup;
            if (!z2) {
                frameLayout = null;
            }
            nestedScrollViewExpander.setExpandView(frameLayout);
            return;
        }
        if (frameLayout == null || !y1(frameLayout)) {
            viewGroup.removeView(viewGroup.findViewById(vsi.A));
            if (frameLayout != null) {
                U0(frameLayout);
            }
            U0(this.n);
            this.n.setMinimumHeight(m0());
            androidx.core.view.c.G0(this.n, true);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            if (n0() > 0 && !G1()) {
                marginLayoutParams.bottomMargin = this.A.c;
            }
            viewGroup.addView(this.n, 0, marginLayoutParams);
            ((NestedScrollViewExpander) viewGroup).setExpandView(this.n);
            return;
        }
        viewGroup.removeView(viewGroup.findViewById(vsi.A));
        U0(frameLayout);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        U0(this.n);
        androidx.core.view.c.G0(this.n, true);
        linearLayout.addView(this.n, 0, new ViewGroup.MarginLayoutParams(-1, -2));
        boolean zI0 = I0();
        if (zI0) {
            S0();
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2, 0.0f));
        } else {
            H();
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        viewGroup.addView(linearLayout, 0, new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(vsi.A);
        if (viewGroup3 != null) {
            x1(viewGroup3);
        }
        ((NestedScrollViewExpander) viewGroup).setExpandView(zI0 ? null : linearLayout);
    }

    public final boolean x0() {
        String str = "";
        try {
            String str2 = SystemProperties.get("log.tag.alertdialog.ime.debug.enable");
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Alert dialog ime debugEnable = ");
        sb.append(str);
        boolean zEquals = TextUtils.equals("true", str);
        this.f26294a = zEquals;
        return zEquals;
    }

    public final void x1(ViewGroup viewGroup) {
        CharSequence charSequence;
        this.T = (TextView) viewGroup.findViewById(vsi.M);
        this.U = (TextView) viewGroup.findViewById(vsi.y);
        TextView textView = this.T;
        if (textView == null || (charSequence = this.l) == null) {
            U0(viewGroup);
            return;
        }
        textView.setText(charSequence);
        TextView textView2 = this.U;
        if (textView2 != null) {
            CharSequence charSequence2 = this.m;
            if (charSequence2 != null) {
                textView2.setText(charSequence2);
            } else {
                textView2.setVisibility(8);
            }
        }
    }

    public boolean y0() {
        return this.L0 && Build.VERSION.SDK_INT >= 30;
    }

    public final boolean y1(ViewGroup viewGroup) {
        View view = this.q;
        View viewInflate = null;
        if (view != null && view.getParent() != null) {
            U0(this.q);
            this.q = null;
        }
        View view2 = this.o;
        if (view2 != null) {
            viewInflate = view2;
        } else if (this.p != 0) {
            viewInflate = LayoutInflater.from(this.c).inflate(this.p, viewGroup, false);
            this.q = viewInflate;
        }
        boolean z = viewInflate != null;
        if (z && J(viewInflate)) {
            this.e.clearFlags(131072);
        } else {
            this.e.setFlags(131072, 131072);
        }
        W0(viewInflate);
        if (z) {
            T0(viewInflate, viewGroup);
        } else {
            U0(viewGroup);
        }
        return z;
    }

    public final boolean z0() {
        return tc8.n(this.c);
    }

    public final void z1() {
        this.e.setLayout(-1, -1);
        this.e.setBackgroundDrawableResource(rki.g);
        this.e.setDimAmount(0.0f);
        this.e.setWindowAnimations(z2j.c);
        this.e.addFlags(-2147481344);
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            Activity activityL = ((c) this.d).l();
            if (activityL != null) {
                this.e.getAttributes().layoutInDisplayCutoutMode = V(l0(), activityL.getWindow().getAttributes().layoutInDisplayCutoutMode);
            } else {
                this.e.getAttributes().layoutInDisplayCutoutMode = l0() != 2 ? 1 : 2;
            }
        }
        O(this.e.getDecorView());
        if (i >= 30) {
            this.e.getAttributes().setFitInsetsSides(0);
            Activity activityL2 = ((c) this.d).l();
            if (activityL2 == null || (activityL2.getWindow().getAttributes().flags & 1024) != 0) {
                return;
            }
            this.e.clearFlags(1024);
        }
    }

    public static class ButtonInfo {
        private GroupButton mButton;
        private Message mMsg;
        private final DialogInterface.OnClickListener mOnClickListener;
        private final int mStyle;
        private final CharSequence mText;
        private final int mWhich;

        public ButtonInfo(CharSequence charSequence, int i, Message message) {
            this.mText = charSequence;
            this.mStyle = i;
            this.mMsg = message;
            this.mOnClickListener = null;
            this.mWhich = 0;
        }

        public ButtonInfo(CharSequence charSequence, int i, DialogInterface.OnClickListener onClickListener, int i2) {
            this.mText = charSequence;
            this.mStyle = i;
            this.mMsg = null;
            this.mOnClickListener = onClickListener;
            this.mWhich = i2;
        }
    }
}
