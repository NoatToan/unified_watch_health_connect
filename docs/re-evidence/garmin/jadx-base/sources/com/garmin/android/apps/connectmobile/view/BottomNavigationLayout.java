package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import b82.g0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.navigation.h;
import com.garmin.android.apps.connectmobile.r0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/BottomNavigationLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "b", "Ljava/lang/String;", "getMSelectedItem$annotations", "()V", "mSelectedItem", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BottomNavigationLayout extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47390d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0.b f47391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String mSelectedItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oq.a f47393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47393c = new oq.a(this, 13);
        setOrientation(0);
        setBackgroundResource(R.color.gcm_background_hero);
    }

    private static /* synthetic */ void getMSelectedItem$annotations() {
    }

    public final void a(View view2, String str) {
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.navigation_item_icon);
        TextView textView = (TextView) view2.findViewById(R.id.navigation_item_text);
        boolean z14 = !TextUtils.isEmpty(this.mSelectedItem) && s.g(this.mSelectedItem, str);
        textView.setTextColor(a7.b.getColor(getContext(), z14 ? R.color.gcm_text_primary_action : R.color.gcm_text_secondary));
        h hVar = h.f39377a;
        Context context = getContext();
        context.getClass();
        l22.a aVar = new l22.a(context);
        hVar.getClass();
        textView.setText(h.b(str, aVar));
        Context context2 = getContext();
        context2.getClass();
        if (c22.b.a(context2) > 1.3f) {
            Context context3 = getContext();
            context3.getClass();
            Resources resources = getResources();
            resources.getClass();
            int iB = (int) c22.b.b(context3, TypedValue.applyDimension(2, 6.0f, resources.getDisplayMetrics()), 1.2f);
            Context context4 = getContext();
            context4.getClass();
            Resources resources2 = getResources();
            resources2.getClass();
            textView.setAutoSizeTextTypeUniformWithConfiguration(iB, (int) c22.b.b(context4, TypedValue.applyDimension(2, 12.0f, resources2.getDisplayMetrics()), 1.2f), 1, 0);
        }
        composeView.setContent(new e(-22769713, true, new g0(str, z14, 6, (byte) 0)));
    }

    public final void b(String str, boolean z14) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.getClass();
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup.getTag() != null && s.g(viewGroup.getTag(), str)) {
                ((ImageView) viewGroup.findViewById(R.id.unread_bubble_image_view)).setVisibility(z14 ? 0 : 8);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigationLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BottomNavigationLayout(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
