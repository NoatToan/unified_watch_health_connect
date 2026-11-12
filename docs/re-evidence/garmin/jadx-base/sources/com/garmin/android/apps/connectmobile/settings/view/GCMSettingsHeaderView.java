package com.garmin.android.apps.connectmobile.settings.view;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.t2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/view/GCMSettingsHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setHeaderText", "(Ljava/lang/CharSequence;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMSettingsHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44205b;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMSettingsHeaderView(Context context, AttributeSet attributeSet, int i14) {
        CharSequence text;
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm_settings_header, (ViewGroup) this, true);
        setOrientation(0);
        setBackgroundColor(b.getColor(context, R.color.gcm_background));
        setMinimumHeight((int) TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics()));
        View viewFindViewById = findViewById(android.R.id.title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f44204a = textView;
        View viewFindViewById2 = findViewById(R.id.information_button);
        viewFindViewById2.getClass();
        this.f44205b = (TextView) viewFindViewById2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2.f45040b);
        typedArrayObtainStyledAttributes.getClass();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            text = typedArrayObtainStyledAttributes.getText(0);
            text.getClass();
        } else {
            text = "";
        }
        textView.setText(text);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(View.OnClickListener onClickListener) {
        TextView textView = this.f44205b;
        textView.setVisibility(0);
        textView.setOnClickListener(onClickListener);
    }

    public final void setHeaderText(CharSequence text) {
        text.getClass();
        this.f44204a.setText(text);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/view/GCMSettingsHeaderView$a;", "", "<init>", "()V", "", "MIN_HEIGHT_DP", "F", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSettingsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSettingsHeaderView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMSettingsHeaderView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
