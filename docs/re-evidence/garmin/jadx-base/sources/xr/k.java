package xr;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lxr/k;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setSurfaceTime", "(Ljava/lang/String;)V", "setStartTime", "setEndTime", "setAvgDepth", "setMaxDepth", "setBottomTime", "", "setDecompression", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f191977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f191978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f191979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f191980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f191981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f191982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f191983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        View.inflate(context, R.layout.diving_depth_view, this);
        this.f191977a = (TextView) findViewById(R.id.surface_time);
        this.f191978b = (TextView) findViewById(R.id.start_time);
        this.f191979c = (TextView) findViewById(R.id.end_time);
        this.f191980d = (TextView) findViewById(R.id.avg_depth);
        this.f191981e = (TextView) findViewById(R.id.max_depth);
        this.f191982f = (TextView) findViewById(R.id.bottom_time);
        this.f191983g = findViewById(R.id.deco_dive);
    }

    public final void setAvgDepth(String value) {
        TextView textView = this.f191980d;
        if (textView != null) {
            textView.setText(value);
        }
    }

    public final void setBottomTime(String value) {
        TextView textView = this.f191982f;
        if (textView != null) {
            textView.setText(value);
        }
    }

    public final void setDecompression(boolean value) {
        View view2 = this.f191983g;
        if (view2 != null) {
            view2.setVisibility(value ? 0 : 4);
        }
    }

    public final void setEndTime(String value) {
        TextView textView = this.f191979c;
        if (textView != null) {
            textView.setText(value);
        }
    }

    public final void setMaxDepth(String value) {
        TextView textView = this.f191981e;
        if (textView != null) {
            textView.setText(value);
        }
    }

    public final void setStartTime(String value) {
        TextView textView = this.f191978b;
        if (textView != null) {
            textView.setText(value);
        }
    }

    public final void setSurfaceTime(String value) {
        TextView textView = this.f191977a;
        if (textView != null) {
            textView.setText(value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
