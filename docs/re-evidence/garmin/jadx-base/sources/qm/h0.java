package qm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqm/h0;", "Lgz/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "visibleTanksCount", "", "setVisibleTanksCount", "(I)V", "", "colorList", "setVisibleTankColors", "(Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends gz.c {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final View F;
    public final View I;
    public final View P;
    public final View T;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mm.e f145383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f145384z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context) {
        super(context, R.layout.tank_pressure_hover_marker_layout, null);
        context.getClass();
        this.f145383y = new mm.e();
        View viewFindViewById = findViewById(R.id.overlay_detail);
        viewFindViewById.getClass();
        this.f145384z = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.time_label);
        viewFindViewById2.getClass();
        this.A = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tank_1_detail);
        viewFindViewById3.getClass();
        this.B = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tank_2_detail);
        viewFindViewById4.getClass();
        this.C = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tank_3_detail);
        viewFindViewById5.getClass();
        this.D = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tank_4_detail);
        viewFindViewById6.getClass();
        this.E = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.separator2);
        viewFindViewById7.getClass();
        this.F = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.separator3);
        viewFindViewById8.getClass();
        this.I = viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.separator4);
        viewFindViewById9.getClass();
        this.P = viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.separator5);
        viewFindViewById10.getClass();
        this.T = viewFindViewById10;
    }

    public final void h(TextView textView, int i14) {
        Drawable drawable = a7.b.getDrawable(getContext(), R.drawable.circle_with_line);
        if (drawable != null) {
            drawable.setTint(i14);
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @SuppressLint({"NewApi"})
    public final void setVisibleTankColors(List<Integer> colorList) {
        colorList.getClass();
        if (colorList.size() >= 1) {
            h(this.B, colorList.get(0).intValue());
        }
        if (colorList.size() >= 2) {
            h(this.C, colorList.get(1).intValue());
        }
        if (colorList.size() >= 3) {
            h(this.D, colorList.get(2).intValue());
        }
        if (colorList.size() >= 4) {
            h(this.E, colorList.get(3).intValue());
        }
    }

    public final void setVisibleTanksCount(int visibleTanksCount) {
        if (1 > visibleTanksCount || visibleTanksCount >= 5) {
            return;
        }
        View view2 = this.F;
        view2.setVisibility(8);
        TextView textView = this.C;
        textView.setVisibility(8);
        View view3 = this.I;
        view3.setVisibility(8);
        TextView textView2 = this.D;
        textView2.setVisibility(8);
        View view4 = this.P;
        view4.setVisibility(8);
        TextView textView3 = this.E;
        textView3.setVisibility(8);
        if (visibleTanksCount >= 2) {
            view2.setVisibility(0);
            textView.setVisibility(0);
        }
        if (visibleTanksCount >= 3) {
            view3.setVisibility(0);
            textView2.setVisibility(0);
        }
        if (visibleTanksCount >= 4) {
            view4.setVisibility(0);
            textView3.setVisibility(0);
        }
    }
}
