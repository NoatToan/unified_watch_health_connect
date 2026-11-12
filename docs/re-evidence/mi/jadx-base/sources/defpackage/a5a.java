package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.xiaomi.fitness.detail.view.FixMapDragLayout;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a5a extends ViewDataBinding {
    public final ImageView A;
    public final FrameLayout B;
    public final FixMapDragLayout C;
    public final LinearLayout D;
    public final SportPathMapView E;
    public final SportRecordBasicInfoView F;
    public final TextView G;

    public a5a(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, FixMapDragLayout fixMapDragLayout, LinearLayout linearLayout, SportPathMapView sportPathMapView, SportRecordBasicInfoView sportRecordBasicInfoView, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = frameLayout;
        this.C = fixMapDragLayout;
        this.D = linearLayout;
        this.E = sportPathMapView;
        this.F = sportRecordBasicInfoView;
        this.G = textView;
    }
}
