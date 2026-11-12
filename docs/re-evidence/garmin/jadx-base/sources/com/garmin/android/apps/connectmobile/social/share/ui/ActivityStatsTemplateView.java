package com.garmin.android.apps.connectmobile.social.share.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.t2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/ActivityStatsTemplateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layoutResId", "(Landroid/content/Context;I)V", TtmlNode.ATTR_TTS_COLOR, "", "setColor", "(I)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityStatsTemplateView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Integer> f44701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<Integer> f44702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Integer> f44703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<Integer> f44704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayList f44705f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44706a;

    static {
        new a(null);
        List<Integer> listK = x.k(Integer.valueOf(R.id.stats_value_1), Integer.valueOf(R.id.stats_value_2), Integer.valueOf(R.id.stats_value_3));
        f44701b = listK;
        List<Integer> listK2 = x.k(Integer.valueOf(R.id.stats_name_1), Integer.valueOf(R.id.stats_name_2), Integer.valueOf(R.id.stats_name_3));
        f44702c = listK2;
        f44703d = x.k(Integer.valueOf(R.id.activity_type_icon), Integer.valueOf(R.id.decorative_line));
        f44704e = x.k(Integer.valueOf(R.id.separator1), Integer.valueOf(R.id.separator2));
        f44705f = y.s(x.k(listK2, listK, x.k(Integer.valueOf(R.id.activity_type_name), Integer.valueOf(R.id.device_product_name), Integer.valueOf(R.id.datetime_at_location))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityStatsTemplateView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f44706a = "\u200a";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2.f45039a, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.gcm3_button_list_divider);
        typedArrayObtainStyledAttributes.recycle();
        i(resourceId, context);
    }

    public final void i(int i14, Context context) {
        LayoutInflater.from(context).inflate(i14, (ViewGroup) this, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = f44705f.iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) findViewById(((Number) it.next()).intValue());
            if (textView != null) {
                arrayList.add(textView);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((TextView) it3.next()).setAutoSizeTextTypeUniformWithConfiguration(1, 112, 1, 2);
        }
    }

    public final void setColor(int color) {
        Iterator it = f44705f.iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) findViewById(((Number) it.next()).intValue());
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        Iterator<Integer> it3 = f44703d.iterator();
        while (it3.hasNext()) {
            ImageView imageView = (ImageView) findViewById(it3.next().intValue());
            if (imageView != null) {
                imageView.setImageTintList(ColorStateList.valueOf(color));
            }
        }
        Iterator<Integer> it4 = f44704e.iterator();
        while (it4.hasNext()) {
            View viewFindViewById = findViewById(it4.next().intValue());
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(color);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/ActivityStatsTemplateView$a;", "", "<init>", "()V", "", "MIN_AUTO_TEXT_SIZE", "I", "MAX_AUTO_TEXT_SIZE", "AUTO_SIZE_STEP_GRANULARITY", "", "statsValueResIds", "Ljava/util/List;", "statsNameResIds", "imageViewResIds", "viewResIds", "textViewResIds", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStatsTemplateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStatsTemplateView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ActivityStatsTemplateView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityStatsTemplateView(Context context, int i14) {
        super(context);
        context.getClass();
        this.f44706a = "\u200a";
        i(i14, context);
    }
}
