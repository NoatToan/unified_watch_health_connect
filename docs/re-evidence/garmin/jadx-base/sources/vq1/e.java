package vq1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvq1/e;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f179447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f179448b;

    public e(d dVar, float f14) {
        this.f179447a = dVar;
        this.f179448b = f14;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i14, int i15) {
        float f14 = i15;
        d dVar = this.f179447a;
        return new LinearGradient(0.0f, f14, 0.0f, 0.0f, new int[]{dVar.f179440a.getColor(R.color.transparent), dVar.f179440a.getColor(R.color.gcm_chart_steps_fill_gradient_start_color)}, new float[]{0.0f, this.f179448b}, Shader.TileMode.CLAMP);
    }
}
