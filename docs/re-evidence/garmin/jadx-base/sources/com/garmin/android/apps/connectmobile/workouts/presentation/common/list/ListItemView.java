package com.garmin.android.apps.connectmobile.workouts.presentation.common.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import k52.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v22.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/ListItemView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "show", "setShowSubtitle", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setIconOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "", "value", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "getSubtitle", "setSubtitle", "subtitle", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ListItemView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final TextView titleTextView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f48417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f48418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_list_item_edit, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.title);
        viewFindViewById.getClass();
        this.titleTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.summary);
        viewFindViewById2.getClass();
        this.f48417b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.help_icon);
        viewFindViewById3.getClass();
        this.f48418c = (ImageView) viewFindViewById3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f102949a, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(0);
        setTitle(string == null ? "" : string);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String getSubtitle() {
        return this.f48417b.getText().toString();
    }

    public final String getTitle() {
        return this.titleTextView.getText().toString();
    }

    public final TextView getTitleTextView() {
        return this.titleTextView;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.titleTextView.setEnabled(enabled);
        this.f48417b.setEnabled(enabled);
    }

    public final void setIconOnClickListener(View.OnClickListener listener) {
        ImageView imageView = this.f48418c;
        if (listener == null) {
            e.j(imageView);
        } else {
            e.q(imageView);
            imageView.setOnClickListener(listener);
        }
    }

    public final void setShowSubtitle(boolean show) {
        e.v(this.f48417b, show);
    }

    public final void setSubtitle(String str) {
        String string;
        if (str != null) {
            string = str;
        } else {
            string = getContext().getString(R.string.no_value);
            string.getClass();
        }
        TextView textView = this.f48417b;
        textView.setText(string);
        if (str == null) {
            str = getContext().getString(R.string.lbl_none);
            str.getClass();
        }
        textView.setContentDescription(str);
    }

    public final void setTitle(String str) {
        str.getClass();
        this.titleTextView.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ListItemView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
