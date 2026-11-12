package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookException;
import com.facebook.common.R;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.LikeActionController;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeButton;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class LikeView extends FrameLayout {
    private static final int s = -1;
    private String a;
    private ObjectType b;
    private LinearLayout c;
    private LikeButton d;
    private LikeBoxCountView e;
    private TextView f;
    private LikeActionController g;
    private OnErrorListener h;
    private BroadcastReceiver i;
    private c j;
    private Style k;
    private HorizontalAlignment l;
    private AuxiliaryViewPosition m;
    private int n;
    private int o;
    private int p;
    private FragmentWrapper q;
    private boolean r;

    @Deprecated
    public enum AuxiliaryViewPosition {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);

        public static AuxiliaryViewPosition DEFAULT = BOTTOM;
        private int intValue;
        private String stringValue;

        AuxiliaryViewPosition(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static AuxiliaryViewPosition b(int i) {
            for (AuxiliaryViewPosition auxiliaryViewPosition : values()) {
                if (auxiliaryViewPosition.c() == i) {
                    return auxiliaryViewPosition;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum HorizontalAlignment {
        CENTER(com.google.android.exoplayer2.text.ttml.b.m0, 0),
        LEFT("left", 1),
        RIGHT("right", 2);

        public static HorizontalAlignment DEFAULT = CENTER;
        private int intValue;
        private String stringValue;

        HorizontalAlignment(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static HorizontalAlignment b(int i) {
            for (HorizontalAlignment horizontalAlignment : values()) {
                if (horizontalAlignment.c() == i) {
                    return horizontalAlignment;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum ObjectType {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE(DTransferConstants.PAGE, 2);

        private int intValue;
        private String stringValue;
        public static ObjectType DEFAULT = UNKNOWN;

        ObjectType(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ObjectType fromInt(int i) {
            for (ObjectType objectType : values()) {
                if (objectType.getValue() == i) {
                    return objectType;
                }
            }
            return null;
        }

        public int getValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    @Deprecated
    public enum Style {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);

        private int intValue;
        private String stringValue;
        public static Style DEFAULT = STANDARD;

        Style(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static Style b(int i) {
            for (Style style : values()) {
                if (style.c() == i) {
                    return style;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LikeView.this.q();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AuxiliaryViewPosition.values().length];
            a = iArr;
            try {
                iArr[AuxiliaryViewPosition.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AuxiliaryViewPosition.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AuxiliaryViewPosition.INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class c implements LikeActionController.CreationCallback {
        private boolean a;

        private c() {
        }

        public void a() {
            this.a = true;
        }

        @Override // com.facebook.share.internal.LikeActionController.CreationCallback
        public void onComplete(LikeActionController likeActionController, FacebookException facebookException) {
            if (this.a) {
                return;
            }
            if (likeActionController != null) {
                if (!likeActionController.shouldEnableView()) {
                    facebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
                }
                LikeView.this.i(likeActionController);
                LikeView.this.t();
            }
            if (facebookException != null && LikeView.this.h != null) {
                LikeView.this.h.onError(facebookException);
            }
            LikeView.this.j = null;
        }

        public /* synthetic */ c(LikeView likeView, a aVar) {
            this();
        }
    }

    public class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            boolean z = true;
            if (extras != null) {
                String string = extras.getString(LikeActionController.ACTION_OBJECT_ID_KEY);
                if (!Utility.isNullOrEmpty(string) && !Utility.areObjectsEqual(LikeView.this.a, string)) {
                    z = false;
                }
            }
            if (z) {
                if (LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_UPDATED.equals(action)) {
                    LikeView.this.t();
                    return;
                }
                if (LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR.equals(action)) {
                    if (LikeView.this.h != null) {
                        LikeView.this.h.onError(NativeProtocol.getExceptionFromErrorData(extras));
                    }
                } else if (LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_RESET.equals(action)) {
                    LikeView likeView = LikeView.this;
                    likeView.o(likeView.a, LikeView.this.b);
                    LikeView.this.t();
                }
            }
        }

        public /* synthetic */ d(LikeView likeView, a aVar) {
            this();
        }
    }

    @Deprecated
    public LikeView(Context context) {
        super(context);
        this.k = Style.DEFAULT;
        this.l = HorizontalAlignment.DEFAULT;
        this.m = AuxiliaryViewPosition.DEFAULT;
        this.n = -1;
        this.r = true;
        j(context);
    }

    private Activity getActivity() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.k.toString());
        bundle.putString(AnalyticsEvents.PARAMETER_LIKE_VIEW_AUXILIARY_POSITION, this.m.toString());
        bundle.putString(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, this.l.toString());
        bundle.putString("object_id", Utility.coerceValueIfNullOrEmpty(this.a, ""));
        bundle.putString("object_type", this.b.toString());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(LikeActionController likeActionController) {
        this.g = likeActionController;
        this.i = new d(this, null);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_UPDATED);
        intentFilter.addAction(LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR);
        intentFilter.addAction(LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_RESET);
        localBroadcastManager.registerReceiver(this.i, intentFilter);
    }

    private void j(Context context) {
        this.o = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_edge_padding);
        this.p = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_internal_padding);
        if (this.n == -1) {
            this.n = getResources().getColor(R.color.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.c = new LinearLayout(context);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        k(context);
        m(context);
        l(context);
        this.c.addView(this.d);
        this.c.addView(this.f);
        this.c.addView(this.e);
        addView(this.c);
        o(this.a, this.b);
        t();
    }

    private void k(Context context) {
        LikeActionController likeActionController = this.g;
        LikeButton likeButton = new LikeButton(context, likeActionController != null && likeActionController.isObjectLiked());
        this.d = likeButton;
        likeButton.setOnClickListener(new a());
        this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    private void l(Context context) {
        this.e = new LikeBoxCountView(context);
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    private void m(Context context) {
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeview_text_size));
        this.f.setMaxLines(2);
        this.f.setTextColor(this.n);
        this.f.setGravity(17);
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }

    private void n(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet == null || getContext() == null || (typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_like_view)) == null) {
            return;
        }
        this.a = Utility.coerceValueIfNullOrEmpty(typedArrayObtainStyledAttributes.getString(R.styleable.com_facebook_like_view_com_facebook_object_id), null);
        this.b = ObjectType.fromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_like_view_com_facebook_object_type, ObjectType.DEFAULT.getValue()));
        Style styleB = Style.b(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_like_view_com_facebook_style, Style.DEFAULT.c()));
        this.k = styleB;
        if (styleB == null) {
            throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
        }
        AuxiliaryViewPosition auxiliaryViewPositionB = AuxiliaryViewPosition.b(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_like_view_com_facebook_auxiliary_view_position, AuxiliaryViewPosition.DEFAULT.c()));
        this.m = auxiliaryViewPositionB;
        if (auxiliaryViewPositionB == null) {
            throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
        }
        HorizontalAlignment horizontalAlignmentB = HorizontalAlignment.b(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_like_view_com_facebook_horizontal_alignment, HorizontalAlignment.DEFAULT.c()));
        this.l = horizontalAlignmentB;
        if (horizontalAlignmentB == null) {
            throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
        }
        this.n = typedArrayObtainStyledAttributes.getColor(R.styleable.com_facebook_like_view_com_facebook_foreground_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str, ObjectType objectType) {
        p();
        this.a = str;
        this.b = objectType;
        if (Utility.isNullOrEmpty(str)) {
            return;
        }
        this.j = new c(this, null);
        if (isInEditMode()) {
            return;
        }
        LikeActionController.getControllerForObjectId(str, objectType, this.j);
    }

    private void p() {
        if (this.i != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.i);
            this.i = null;
        }
        c cVar = this.j;
        if (cVar != null) {
            cVar.a();
            this.j = null;
        }
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.g != null) {
            this.g.toggleLike(this.q == null ? getActivity() : null, this.q, getAnalyticsParameters());
        }
    }

    private void r() {
        int i = b.a[this.m.ordinal()];
        if (i == 1) {
            this.e.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
        } else if (i == 2) {
            this.e.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
        } else {
            if (i != 3) {
                return;
            }
            this.e.setCaretPosition(this.l == HorizontalAlignment.RIGHT ? LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT : LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT);
        }
    }

    private void s() {
        int i;
        LikeActionController likeActionController;
        View view;
        LikeActionController likeActionController2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        HorizontalAlignment horizontalAlignment = this.l;
        if (horizontalAlignment == HorizontalAlignment.LEFT) {
            i = 3;
        } else {
            i = horizontalAlignment == HorizontalAlignment.CENTER ? 1 : 5;
        }
        layoutParams.gravity = i | 48;
        layoutParams2.gravity = i;
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        if (this.k == Style.STANDARD && (likeActionController2 = this.g) != null && !Utility.isNullOrEmpty(likeActionController2.getSocialSentence())) {
            view = this.f;
        } else {
            if (this.k != Style.BOX_COUNT || (likeActionController = this.g) == null || Utility.isNullOrEmpty(likeActionController.getLikeCountString())) {
                return;
            }
            r();
            view = this.e;
        }
        view.setVisibility(0);
        ((LinearLayout.LayoutParams) view.getLayoutParams()).gravity = i;
        LinearLayout linearLayout = this.c;
        AuxiliaryViewPosition auxiliaryViewPosition = this.m;
        AuxiliaryViewPosition auxiliaryViewPosition2 = AuxiliaryViewPosition.INLINE;
        linearLayout.setOrientation(auxiliaryViewPosition != auxiliaryViewPosition2 ? 1 : 0);
        AuxiliaryViewPosition auxiliaryViewPosition3 = this.m;
        if (auxiliaryViewPosition3 == AuxiliaryViewPosition.TOP || (auxiliaryViewPosition3 == auxiliaryViewPosition2 && this.l == HorizontalAlignment.RIGHT)) {
            this.c.removeView(this.d);
            this.c.addView(this.d);
        } else {
            this.c.removeView(view);
            this.c.addView(view);
        }
        int i2 = b.a[this.m.ordinal()];
        if (i2 == 1) {
            int i3 = this.o;
            view.setPadding(i3, i3, i3, this.p);
            return;
        }
        if (i2 == 2) {
            int i4 = this.o;
            view.setPadding(i4, this.p, i4, i4);
        } else {
            if (i2 != 3) {
                return;
            }
            if (this.l == HorizontalAlignment.RIGHT) {
                int i5 = this.o;
                view.setPadding(i5, i5, this.p, i5);
            } else {
                int i6 = this.p;
                int i7 = this.o;
                view.setPadding(i6, i7, i7, i7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        boolean zShouldEnableView = !this.r;
        LikeActionController likeActionController = this.g;
        if (likeActionController == null) {
            this.d.setSelected(false);
            this.f.setText((CharSequence) null);
            this.e.setText(null);
        } else {
            this.d.setSelected(likeActionController.isObjectLiked());
            this.f.setText(this.g.getSocialSentence());
            this.e.setText(this.g.getLikeCountString());
            zShouldEnableView &= this.g.shouldEnableView();
        }
        super.setEnabled(zShouldEnableView);
        this.d.setEnabled(zShouldEnableView);
        s();
    }

    @Deprecated
    public OnErrorListener getOnErrorListener() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        setObjectIdAndType(null, ObjectType.UNKNOWN);
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryViewPosition) {
        if (auxiliaryViewPosition == null) {
            auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
        }
        if (this.m != auxiliaryViewPosition) {
            this.m = auxiliaryViewPosition;
            s();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setEnabled(boolean z) {
        this.r = true;
        t();
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.n != i) {
            this.f.setTextColor(i);
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.q = new FragmentWrapper(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        if (horizontalAlignment == null) {
            horizontalAlignment = HorizontalAlignment.DEFAULT;
        }
        if (this.l != horizontalAlignment) {
            this.l = horizontalAlignment;
            s();
        }
    }

    @Deprecated
    public void setLikeViewStyle(Style style) {
        if (style == null) {
            style = Style.DEFAULT;
        }
        if (this.k != style) {
            this.k = style;
            s();
        }
    }

    @Deprecated
    public void setObjectIdAndType(String str, ObjectType objectType) {
        String strCoerceValueIfNullOrEmpty = Utility.coerceValueIfNullOrEmpty(str, null);
        if (objectType == null) {
            objectType = ObjectType.DEFAULT;
        }
        if (Utility.areObjectsEqual(strCoerceValueIfNullOrEmpty, this.a) && objectType == this.b) {
            return;
        }
        o(strCoerceValueIfNullOrEmpty, objectType);
        t();
    }

    @Deprecated
    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.h = onErrorListener;
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.q = new FragmentWrapper(fragment);
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = Style.DEFAULT;
        this.l = HorizontalAlignment.DEFAULT;
        this.m = AuxiliaryViewPosition.DEFAULT;
        this.n = -1;
        this.r = true;
        n(attributeSet);
        j(context);
    }
}
