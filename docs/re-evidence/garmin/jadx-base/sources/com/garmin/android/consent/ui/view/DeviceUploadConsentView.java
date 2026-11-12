package com.garmin.android.consent.ui.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import b00.g;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p92.o;
import p92.y;
import p92.z;
import u12.e;
import v.b0;
import z10.g0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/consent/ui/view/DeviceUploadConsentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "", "", "onClick", "setOnClickListener", "(Le23/l;)V", "checked", "setDeviceUploadChecked", "(Z)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceUploadConsentView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f49834h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f49835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f49836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f49837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwitchCompat f49838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProgressBar f49839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f49840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49841g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUploadConsentView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f49841g = R.style.Widget_AppCompat_CompoundButton_Switch;
        LayoutInflater.from(getContext()).inflate(com.garmin.android.apps.connectmobile.R.layout.device_upload_consent_view, (ViewGroup) this, true);
        this.f49835a = findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_button_container);
        this.f49836b = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_button_text);
        this.f49837c = (FrameLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_toggle_container);
        this.f49839e = (ProgressBar) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_progress);
        TextView textView = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_message);
        this.f49840f = textView;
        o.f136619a.getClass();
        String strB = ((g0) o.l()).b();
        textView.setText(getContext().getString(com.garmin.android.apps.connectmobile.R.string.consent_lib_device_upload_description, strB, strB));
        if (attributeSet != null) {
            a(context, attributeSet);
        }
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TextView textView = this.f49840f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f136666b, com.garmin.android.apps.connectmobile.R.attr.consentScreenViewStyle, com.garmin.android.apps.connectmobile.R.style.Widget_ConsentTheme_ConsentScreen);
        typedArrayObtainStyledAttributes.getClass();
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                this.f49835a.setBackground(drawable);
            }
        } catch (Exception e4) {
            String strValueOf = String.valueOf(e4);
            y.f136664a.getClass();
            y.a.c("DeviceUploadConsentView", strValueOf);
        }
        try {
            this.f49836b.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(1, R.style.TextAppearance_AppCompat_Medium));
        } catch (Exception e14) {
            String strValueOf2 = String.valueOf(e14);
            y.f136664a.getClass();
            y.a.c("DeviceUploadConsentView", strValueOf2);
        }
        try {
            this.f49841g = typedArrayObtainStyledAttributes.getResourceId(5, R.style.Widget_AppCompat_CompoundButton_Switch);
        } catch (Exception e15) {
            String strValueOf3 = String.valueOf(e15);
            y.f136664a.getClass();
            y.a.c("DeviceUploadConsentView", strValueOf3);
        }
        try {
            textView.setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(4, R.style.TextAppearance_AppCompat_Body1));
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) (24 * Resources.getSystem().getDisplayMetrics().density));
            textView.setPaddingRelative(dimensionPixelSize, textView.getPaddingTop(), dimensionPixelSize, textView.getPaddingBottom());
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
            if (dimensionPixelSize2 >= 0) {
                textView.setLineHeight(dimensionPixelSize2);
            }
        } catch (Exception e16) {
            String strValueOf4 = String.valueOf(e16);
            y.f136664a.getClass();
            y.a.c("DeviceUploadConsentView", strValueOf4);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        if (this.f49838d == null) {
            SwitchCompat switchCompat = new SwitchCompat(new ContextThemeWrapper(getContext(), this.f49841g), null, 0);
            this.f49838d = switchCompat;
            switchCompat.setShowText(false);
            SwitchCompat switchCompat2 = this.f49838d;
            if (switchCompat2 == null) {
                s.m("deviceUploadSwitch");
                throw null;
            }
            switchCompat2.setVisibility(4);
            SwitchCompat switchCompat3 = this.f49838d;
            if (switchCompat3 == null) {
                s.m("deviceUploadSwitch");
                throw null;
            }
            switchCompat3.setId(View.generateViewId());
            int i14 = (int) (48 * Resources.getSystem().getDisplayMetrics().density);
            SwitchCompat switchCompat4 = this.f49838d;
            if (switchCompat4 == null) {
                s.m("deviceUploadSwitch");
                throw null;
            }
            switchCompat4.setMinimumWidth(i14);
            SwitchCompat switchCompat5 = this.f49838d;
            if (switchCompat5 == null) {
                s.m("deviceUploadSwitch");
                throw null;
            }
            switchCompat5.setMinimumHeight(i14);
            SwitchCompat switchCompat6 = this.f49838d;
            if (switchCompat6 == null) {
                s.m("deviceUploadSwitch");
                throw null;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            FrameLayout frameLayout = this.f49837c;
            frameLayout.addView(switchCompat6, layoutParams);
            frameLayout.post(new b0(this, 16));
        }
    }

    public final void setDeviceUploadChecked(boolean checked) {
        b();
        this.f49839e.setVisibility(8);
        SwitchCompat switchCompat = this.f49838d;
        if (switchCompat == null) {
            s.m("deviceUploadSwitch");
            throw null;
        }
        switchCompat.setChecked(checked);
        SwitchCompat switchCompat2 = this.f49838d;
        if (switchCompat2 != null) {
            switchCompat2.setVisibility(0);
        } else {
            s.m("deviceUploadSwitch");
            throw null;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnClickListener(l<? super Boolean, Unit> onClick) {
        onClick.getClass();
        b();
        SwitchCompat switchCompat = this.f49838d;
        if (switchCompat == null) {
            s.m("deviceUploadSwitch");
            throw null;
        }
        switchCompat.setOnTouchListener(new g(this, 9));
        SwitchCompat switchCompat2 = this.f49838d;
        if (switchCompat2 != null) {
            switchCompat2.setOnClickListener(new e(26, this, onClick));
        } else {
            s.m("deviceUploadSwitch");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/consent/ui/view/DeviceUploadConsentView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_HORIZONTAL_PADDING_DP", "I", "MIN_REQUIRED_HEIGHT", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceUploadConsentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ DeviceUploadConsentView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceUploadConsentView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public DeviceUploadConsentView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        this.f49841g = R.style.Widget_AppCompat_CompoundButton_Switch;
        LayoutInflater.from(getContext()).inflate(com.garmin.android.apps.connectmobile.R.layout.device_upload_consent_view, (ViewGroup) this, true);
        this.f49835a = findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_button_container);
        this.f49836b = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_button_text);
        this.f49837c = (FrameLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_toggle_container);
        this.f49839e = (ProgressBar) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_progress);
        TextView textView = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.device_upload_message);
        this.f49840f = textView;
        o.f136619a.getClass();
        String strB = ((g0) o.l()).b();
        textView.setText(getContext().getString(com.garmin.android.apps.connectmobile.R.string.consent_lib_device_upload_description, strB, strB));
        if (attributeSet != null) {
            a(context, attributeSet);
        }
    }
}
