package com.garmin.android.apps.connectmobile.promotions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import p005kotlin.Metadata;
import xp0.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/promotions/PromoCodeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "promoCodeText", "", "setPromotionCode", "(Ljava/lang/String;)V", "Lcom/garmin/android/apps/connectmobile/promotions/PromoCodeView$a;", "c", "Lcom/garmin/android/apps/connectmobile/promotions/PromoCodeView$a;", "getCopyClickListener", "()Lcom/garmin/android/apps/connectmobile/promotions/PromoCodeView$a;", "setCopyClickListener", "(Lcom/garmin/android/apps/connectmobile/promotions/PromoCodeView$a;)V", "copyClickListener", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PromoCodeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f41050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f41051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a copyClickListener;

    public interface a {
        void E();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        View.inflate(context, R.layout.challenge_promo_code_view, this);
        View viewFindViewById = findViewById(R.id.promo_code_tv);
        viewFindViewById.getClass();
        this.f41050a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.copy_promo_code_btn);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.promo_code_detail_tv);
        viewFindViewById3.getClass();
        this.f41051b = (TextView) viewFindViewById3;
        textView.setOnClickListener(new d(this, 14));
        String string = context.getText(R.string.common_copy).toString();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        textView.setText(upperCase);
    }

    public final a getCopyClickListener() {
        return this.copyClickListener;
    }

    public final void setCopyClickListener(a aVar) {
        this.copyClickListener = aVar;
    }

    public final void setPromotionCode(String promoCodeText) {
        this.f41050a.setText(promoCodeText);
    }
}
