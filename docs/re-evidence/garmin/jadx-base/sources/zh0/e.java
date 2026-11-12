package zh0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzh0/e;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ShapeDrawable.ShaderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f204794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f204795b;

    public e(c cVar, float f14) {
        this.f204794a = cVar;
        this.f204795b = f14;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i14, int i15) {
        float f14 = i15;
        c cVar = this.f204794a;
        return new LinearGradient(0.0f, f14 / 2.0f, 0.0f, f14, new int[]{cVar.f204787g, cVar.f204788h}, new float[]{0.0f, this.f204795b}, Shader.TileMode.CLAMP);
    }
}
