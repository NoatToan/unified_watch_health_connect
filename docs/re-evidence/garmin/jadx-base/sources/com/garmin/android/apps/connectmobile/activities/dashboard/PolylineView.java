package com.garmin.android.apps.connectmobile.activities.dashboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.d0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/dashboard/PolylineView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PolylineView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f28995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f28997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f28998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f28999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<? extends List<LatLng>> f29000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LatLngBounds f29001g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        float fApplyDimension = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        Paint paint = new Paint();
        this.f28997c = paint;
        paint.setStrokeWidth(fApplyDimension);
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        this.f28996b = TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics());
        Paint paint2 = new Paint();
        this.f28995a = paint2;
        paint2.setColor(-65536);
        paint2.setStyle(Paint.Style.FILL);
        this.f28998d = new Path();
        this.f28999e = new RectF();
    }

    public static double a(double d14) {
        return Math.log(Math.tan((Math.toRadians(d14) / ((double) 2)) + 0.7853981633974483d)) * 6378137.0d;
    }

    public static double b(double d14) {
        return Math.toRadians(d14) * 6378137.0d;
    }

    public final void c(int i14, List list) {
        list.getClass();
        if (y.s(list).isEmpty()) {
            return;
        }
        this.f28997c.setColor(i14);
        this.f28995a.setColor(i14);
        this.f29000f = list;
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, (List) it.next());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            builder.include((LatLng) it3.next());
        }
        this.f29001g = builder.build();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        LatLngBounds latLngBounds = this.f29001g;
        List<? extends List<LatLng>> list = this.f29000f;
        if (list == null || latLngBounds == null) {
            return;
        }
        float width = getWidth();
        float f14 = this.f28996b;
        float f15 = 2 * f14;
        float f16 = width - f15;
        float height = getHeight() - f15;
        double dMin = Math.min(((double) height) / (a(latLngBounds.northeast.latitude) - a(latLngBounds.southwest.latitude)), ((double) f16) / (b(latLngBounds.northeast.longitude) - b(latLngBounds.southwest.longitude)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Path path = this.f28998d;
            path.reset();
            int iB = (int) ((b(((LatLng) list2.get(0)).longitude) - b(latLngBounds.southwest.longitude)) * dMin);
            Iterator it3 = it;
            float f17 = f16;
            int iA = (int) ((a(latLngBounds.northeast.latitude) - a(((LatLng) list2.get(0)).latitude)) * dMin);
            int iB2 = (int) ((b(((LatLng) com.airbnb.lottie.animation.keyframe.a.c(1, list2)).longitude) - b(latLngBounds.southwest.longitude)) * dMin);
            float f18 = height;
            double d14 = dMin;
            int iA2 = (int) ((a(latLngBounds.northeast.latitude) - a(((LatLng) com.airbnb.lottie.animation.keyframe.a.c(1, list2)).latitude)) * d14);
            float f19 = iB;
            float f22 = iA;
            path.moveTo(f19, f22);
            int size = list2.size();
            int i14 = 1;
            while (i14 < size) {
                path.lineTo((int) ((b(((LatLng) list2.get(i14)).longitude) - b(latLngBounds.southwest.longitude)) * d14), (int) ((a(latLngBounds.northeast.latitude) - a(((LatLng) list2.get(i14)).latitude)) * d14));
                i14++;
                latLngBounds = latLngBounds;
                f19 = f19;
                size = size;
                f22 = f22;
            }
            LatLngBounds latLngBounds2 = latLngBounds;
            float f24 = f22;
            float f25 = f19;
            RectF rectF = this.f28999e;
            path.computeBounds(rectF, true);
            float f26 = rectF.right;
            float f27 = f26 < f17 ? (((int) (f17 - f26)) / 2.0f) + f14 : f14;
            float f28 = rectF.bottom;
            float f29 = f28 < f18 ? (((int) (f18 - f28)) / 2.0f) + f14 : f14;
            path.offset(f27, f29);
            canvas.drawPath(path, this.f28997c);
            Paint paint = this.f28995a;
            canvas.drawCircle(f25 + f27, f24 + f29, f14, paint);
            canvas.drawCircle(iB2 + f27, iA2 + f29, f14, paint);
            latLngBounds = latLngBounds2;
            f16 = f17;
            it = it3;
            height = f18;
            dMin = d14;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/dashboard/PolylineView$a;", "", "<init>", "()V", "", "RADIUS", "D", "", "POINT_SIZE", "I", "PATH_THICKNESS", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolylineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolylineView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PolylineView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
