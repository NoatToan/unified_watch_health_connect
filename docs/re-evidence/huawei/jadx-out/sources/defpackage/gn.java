package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class gn implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path.FillType f35782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35784c;
    private final fx d;
    private final boolean e;
    private final gb i;

    public gn(String str, boolean z, Path.FillType fillType, fx fxVar, gb gbVar, boolean z2) {
        this.f35783b = str;
        this.f35784c = z;
        this.f35782a = fillType;
        this.d = fxVar;
        this.i = gbVar;
        this.e = z2;
    }

    public String e() {
        return this.f35783b;
    }

    public fx a() {
        return this.d;
    }

    public gb b() {
        return this.i;
    }

    public Path.FillType d() {
        return this.f35782a;
    }

    public boolean c() {
        return this.e;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, cx cxVar, BaseLayer baseLayer) {
        return new en(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f35784c + '}';
    }
}
