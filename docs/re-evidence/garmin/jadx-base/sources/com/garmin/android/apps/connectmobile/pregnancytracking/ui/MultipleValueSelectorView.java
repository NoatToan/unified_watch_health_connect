package com.garmin.android.apps.connectmobile.pregnancytracking.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v22.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/MultipleValueSelectorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "selected", "", "setCheckedValues", "(Ljava/lang/String;)V", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/MultipleValueSelectorView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSelectionChangedListener", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/MultipleValueSelectorView$a;)V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultipleValueSelectorView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f40434c;

    public interface a {
        void a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleValueSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f40433b = new LinkedHashMap();
        View viewFindViewById = LayoutInflater.from(context).inflate(R.layout.multi_selector_view_layout, (ViewGroup) this, true).findViewById(R.id.multi_selector_linear_layout);
        viewFindViewById.getClass();
        this.f40432a = (LinearLayout) viewFindViewById;
    }

    public static void a(MultipleValueSelectorView multipleValueSelectorView, View view2) {
        multipleValueSelectorView.setCheckedValues(view2.getTag().toString());
        a aVar = multipleValueSelectorView.f40434c;
        if (aVar != null) {
            aVar.a(view2.getTag().toString());
        }
    }

    private final void setCheckedValues(String selected) {
        for (Map.Entry entry : this.f40433b.entrySet()) {
            if (s.g(((View) entry.getKey()).getTag(), selected)) {
                e.q((View) entry.getValue());
            } else {
                e.j((View) entry.getValue());
            }
        }
    }

    public final void setSelectionChangedListener(a listener) {
        listener.getClass();
        this.f40434c = listener;
    }
}
