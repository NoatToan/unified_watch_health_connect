package pz;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz/c;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f141914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f141915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f141916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f141917d;

    public c(Context context, int i14, int i15, float f14) {
        this.f141914a = context;
        this.f141915b = i14;
        this.f141916c = i15;
        this.f141917d = f14;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i14, int i15) {
        float f14 = i15;
        int i16 = this.f141915b;
        Context context = this.f141914a;
        return new LinearGradient(0.0f, f14, 0.0f, 0.0f, new int[]{context.getColor(i16), context.getColor(this.f141916c)}, new float[]{0.0f, this.f141917d}, Shader.TileMode.CLAMP);
    }
}
