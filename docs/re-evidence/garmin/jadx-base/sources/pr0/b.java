package pr0;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpr0/b;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f139602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f139603b;

    public b(Context context, float f14) {
        this.f139602a = context;
        this.f139603b = f14;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i14, int i15) {
        float f14 = i15;
        Context context = this.f139602a;
        return new LinearGradient(0.0f, f14, 0.0f, 0.0f, new int[]{a7.b.getColor(context, R.color.gcm_intensity_minutes_chart_gradient_bottom), a7.b.getColor(context, R.color.gcm_intensity_minutes_chart_gradient_top)}, new float[]{0.0f, this.f139603b}, Shader.TileMode.CLAMP);
    }
}
