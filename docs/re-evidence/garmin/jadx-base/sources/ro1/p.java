package ro1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB3\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lro1/p;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isForCamera", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f153996a;

    static {
        new a(null);
        f153996a = R.color.gcm_background;
    }

    public p(Context context, AttributeSet attributeSet, int i14, boolean z14) {
        super(context, attributeSet, i14);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.image_picker_camera_item, (ViewGroup) this, true);
        context.getClass();
        int color = a7.b.getColor(context, f153996a);
        if (!z14) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon_view);
            TextView textView = (TextView) viewInflate.findViewById(R.id.icon_title);
            imageView.setImageDrawable(j.a.a(context, R.drawable.gallery));
            textView.setText(R.string.btn_profile_source_gallery);
        }
        setBackgroundColor(color);
        setGravity(17);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lro1/p$a;", "", "<init>", "()V", "", "BACKGROUND_COLOR_RES_ID", "I", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
    }

    public p(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, false, 8, null);
    }

    public p(Context context) {
        this(context, null, 0, false, 14, null);
    }

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? true : z14);
    }
}
