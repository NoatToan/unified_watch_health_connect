package com.garmin.feature.garminpay.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hn2.g;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006 "}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView$b;", "value", "l", "Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView$b;", "getSecondaryTextType", "()Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView$b;", "setSecondaryTextType", "(Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView$b;)V", "secondaryTextType", "", "m", "Ljava/lang/String;", "getSecondaryText", "()Ljava/lang/String;", "setSecondaryText", "(Ljava/lang/String;)V", "secondaryText", JWKParameterNames.RSA_MODULUS, "getMainCaptionText", "setMainCaptionText", "mainCaptionText", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PasscodeControlView extends ConstraintLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f51866r = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f51867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f51868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f51869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f51870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f51871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f51872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f51873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f51874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f51875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f51876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GridLayout f51877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public b secondaryTextType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public String secondaryText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public String mainCaptionText;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f51881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public StringBuilder f51882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PasscodeEntryActivity f51883q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        NO_TEXT,
        HELP_TEXT,
        ATTEMPTS_REMAINING
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51888a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NO_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.HELP_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ATTEMPTS_REMAINING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51888a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.secondaryTextType = b.NO_TEXT;
        this.secondaryText = "";
        this.mainCaptionText = "";
        this.f51881o = new Handler();
        this.f51882p = new StringBuilder();
        Object systemService = context.getSystemService("layout_inflater");
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.view_passcode_control, (ViewGroup) this, true);
        }
        View viewFindViewById = findViewById(R.id.passcode_help_text_label);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f51867a = textView;
        View viewFindViewById2 = findViewById(R.id.passcode_attempts_remaining_container);
        viewFindViewById2.getClass();
        CardView cardView = (CardView) viewFindViewById2;
        this.f51868b = cardView;
        View viewFindViewById3 = findViewById(R.id.secondary_text_container);
        viewFindViewById3.getClass();
        this.f51869c = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.enter_passcode_label);
        viewFindViewById4.getClass();
        this.f51870d = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.passcode_attempts_remaining_label);
        viewFindViewById5.getClass();
        this.f51871e = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.help_passcode_button);
        viewFindViewById6.getClass();
        Button button = (Button) viewFindViewById6;
        this.f51872f = button;
        View viewFindViewById7 = findViewById(R.id.passcode_digit_1_image_view);
        viewFindViewById7.getClass();
        ImageView imageView = (ImageView) viewFindViewById7;
        this.f51873g = imageView;
        View viewFindViewById8 = findViewById(R.id.passcode_digit_2_image_view);
        viewFindViewById8.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById8;
        this.f51874h = imageView2;
        View viewFindViewById9 = findViewById(R.id.passcode_digit_3_image_view);
        viewFindViewById9.getClass();
        ImageView imageView3 = (ImageView) viewFindViewById9;
        this.f51875i = imageView3;
        View viewFindViewById10 = findViewById(R.id.passcode_digit_4_image_view);
        viewFindViewById10.getClass();
        ImageView imageView4 = (ImageView) viewFindViewById10;
        this.f51876j = imageView4;
        View viewFindViewById11 = findViewById(R.id.passcode_keyboard_view);
        viewFindViewById11.getClass();
        GridLayout gridLayout = (GridLayout) viewFindViewById11;
        this.f51877k = gridLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f84565b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(2);
        setSecondaryText(string != null ? string : "");
        int color = typedArrayObtainStyledAttributes.getColor(3, a7.b.getColor(context, R.color.gcm_text_primary));
        typedArrayObtainStyledAttributes.recycle();
        textView.setTextColor(color);
        textView.setText(this.secondaryText);
        cardView.setVisibility(8);
        button.setVisibility(8);
        imageView.setImageResource(R.drawable.empty_dot);
        imageView2.setImageResource(R.drawable.empty_dot);
        imageView3.setImageResource(R.drawable.empty_dot);
        imageView4.setImageResource(R.drawable.empty_dot);
        int childCount = gridLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            gridLayout.getChildAt(i14).setOnClickListener(new b0(i14, this, 2));
        }
    }

    public final String getMainCaptionText() {
        return this.mainCaptionText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final b getSecondaryTextType() {
        return this.secondaryTextType;
    }

    public final void i(int i14, boolean z14) {
        if (i14 == 0) {
            ImageView imageView = this.f51873g;
            if (z14) {
                imageView.setImageResource(R.drawable.filled_dot);
            } else {
                imageView.setImageResource(R.drawable.empty_dot);
            }
            imageView.invalidate();
            return;
        }
        if (i14 == 1) {
            ImageView imageView2 = this.f51874h;
            if (z14) {
                imageView2.setImageResource(R.drawable.filled_dot);
            } else {
                imageView2.setImageResource(R.drawable.empty_dot);
            }
            imageView2.invalidate();
            return;
        }
        if (i14 == 2) {
            ImageView imageView3 = this.f51875i;
            if (z14) {
                imageView3.setImageResource(R.drawable.filled_dot);
            } else {
                imageView3.setImageResource(R.drawable.empty_dot);
            }
            imageView3.invalidate();
            return;
        }
        if (i14 != 3) {
            return;
        }
        ImageView imageView4 = this.f51876j;
        if (z14) {
            imageView4.setImageResource(R.drawable.filled_dot);
        } else {
            imageView4.setImageResource(R.drawable.empty_dot);
        }
        imageView4.invalidate();
    }

    public final void setMainCaptionText(String str) {
        str.getClass();
        this.mainCaptionText = str;
        this.f51870d.setText(str);
    }

    public final void setSecondaryText(String str) {
        str.getClass();
        this.secondaryText = str;
        int i14 = c.f51888a[this.secondaryTextType.ordinal()];
        if (i14 == 2) {
            this.f51867a.setText(str);
        } else if (i14 == 3) {
            this.f51871e.setText(str);
        }
        this.f51869c.invalidate();
    }

    public final void setSecondaryTextType(b bVar) {
        bVar.getClass();
        this.secondaryTextType = bVar;
        int i14 = c.f51888a[bVar.ordinal()];
        CardView cardView = this.f51868b;
        TextView textView = this.f51867a;
        if (i14 == 1) {
            textView.setVisibility(4);
            cardView.setVisibility(8);
        } else if (i14 == 2) {
            textView.setVisibility(0);
            cardView.setVisibility(8);
        } else if (i14 != 3) {
            u0.r();
        } else {
            textView.setVisibility(8);
            cardView.setVisibility(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/PasscodeControlView$a;", "", "<init>", "()V", "", "PASSCODE_DIGITS", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PasscodeControlView(Context context) {
        this(context, null);
        context.getClass();
    }
}
