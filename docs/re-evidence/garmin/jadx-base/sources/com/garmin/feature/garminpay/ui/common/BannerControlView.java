package com.garmin.feature.garminpay.ui.common;

import a71.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import hn2.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ!\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000f\u0010\u000eR.\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R.\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R.\u0010(\u001a\u0004\u0018\u00010!2\b\u0010\u0011\u001a\u0004\u0018\u00010!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010,\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R.\u00100\u001a\u0004\u0018\u00010!2\b\u0010\u0011\u001a\u0004\u0018\u00010!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'¨\u00061"}, d2 = {"Lcom/garmin/feature/garminpay/ui/common/BannerControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Lkotlin/Function1;", "Landroid/view/View;", "", "action", "setLeftButtonAction", "(Le23/l;)V", "setRightButtonAction", "", "value", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getBannerText", "()Ljava/lang/String;", "setBannerText", "(Ljava/lang/String;)V", "bannerText", "f", "getBannerTitle", "setBannerTitle", "bannerTitle", "g", "getLeftButtonText", "setLeftButtonText", "leftButtonText", "", "h", "Ljava/lang/Boolean;", "getLeftButtonVisible", "()Ljava/lang/Boolean;", "setLeftButtonVisible", "(Ljava/lang/Boolean;)V", "leftButtonVisible", IntegerTokenConverter.CONVERTER_KEY, "getRightButtonText", "setRightButtonText", "rightButtonText", "j", "getRightButtonVisible", "setRightButtonVisible", "rightButtonVisible", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BannerControlView extends ConstraintLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f51846k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f51847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f51848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f51849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f51850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String bannerText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String bannerTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String leftButtonText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Boolean leftButtonVisible;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String rightButtonText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Boolean rightButtonVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Object systemService = context.getSystemService("layout_inflater");
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.view_banner_control, (ViewGroup) this, true);
        }
        View viewFindViewById = findViewById(R.id.banner_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f51847a = textView;
        View viewFindViewById2 = findViewById(R.id.banner_title);
        viewFindViewById2.getClass();
        this.f51848b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.banner_left_button);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f51849c = button;
        View viewFindViewById4 = findViewById(R.id.banner_right_button);
        viewFindViewById4.getClass();
        Button button2 = (Button) viewFindViewById4;
        this.f51850d = button2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f84564a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        setBannerTitle(typedArrayObtainStyledAttributes.getString(1));
        setBannerText(typedArrayObtainStyledAttributes.getString(0));
        setLeftButtonText(typedArrayObtainStyledAttributes.getString(2));
        setRightButtonText(typedArrayObtainStyledAttributes.getString(3));
        typedArrayObtainStyledAttributes.recycle();
        textView.setText(this.bannerText);
        button.setText(this.leftButtonText);
        button2.setText(this.rightButtonText);
    }

    public final String getBannerText() {
        return this.bannerText;
    }

    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public final String getLeftButtonText() {
        return this.leftButtonText;
    }

    public final Boolean getLeftButtonVisible() {
        return this.leftButtonVisible;
    }

    public final String getRightButtonText() {
        return this.rightButtonText;
    }

    public final Boolean getRightButtonVisible() {
        return this.rightButtonVisible;
    }

    public final void setBannerText(String str) {
        this.bannerText = str;
        this.f51847a.setText(str);
    }

    public final void setBannerTitle(String str) {
        this.bannerTitle = str;
        this.f51848b.setText(str);
    }

    public final void setLeftButtonAction(l<? super View, Unit> action) {
        action.getClass();
        this.f51849c.setOnClickListener(new k(action, 4));
    }

    public final void setLeftButtonText(String str) {
        this.leftButtonText = str;
        this.f51849c.setText(str);
    }

    public final void setLeftButtonVisible(Boolean bool) {
        this.leftButtonVisible = bool;
        this.f51849c.setVisibility(s.g(bool, Boolean.TRUE) ? 0 : 8);
    }

    public final void setRightButtonAction(l<? super View, Unit> action) {
        action.getClass();
        this.f51850d.setOnClickListener(new k(action, 3));
    }

    public final void setRightButtonText(String str) {
        this.rightButtonText = str;
        this.f51850d.setText(str);
    }

    public final void setRightButtonVisible(Boolean bool) {
        this.rightButtonVisible = bool;
        this.f51850d.setVisibility(s.g(bool, Boolean.TRUE) ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerControlView(Context context) {
        this(context, null);
        context.getClass();
    }
}
