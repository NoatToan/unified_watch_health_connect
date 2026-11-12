package iz;

import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.data.Entry;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liz/a;", "Lcom/github/mikephil/chartingv2/data/Entry;", "", "value", "", "xIndex", "Landroid/graphics/drawable/Drawable;", "drawable", "drawableValue", "<init>", "(FILandroid/graphics/drawable/Drawable;F)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f95858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f95859b;

    public /* synthetic */ a(float f14, int i14, Drawable drawable, float f15, int i15, j jVar) {
        this(f14, i14, drawable, (i15 & 8) != 0 ? f14 : f15);
    }

    public a(float f14, int i14, Drawable drawable, float f15) {
        super(f14, i14);
        this.f95858a = drawable;
        this.f95859b = f15;
    }
}
