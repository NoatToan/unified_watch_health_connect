package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger;
import com.huawei.animationkit.computationalwallpaper.pattern.shape.AbstractShape;

/* JADX INFO: loaded from: classes23.dex */
public class bfp extends AbstractShape {
    private Arranger e;

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.shape.AbstractShape, com.huawei.animationkit.computationalwallpaper.pattern.shape.Shape
    public void setLocation(Rect rect) {
        super.setLocation(rect);
        this.e.setBounds(rect);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.shape.Shape
    public void draw(Canvas canvas) {
        this.e.arrange(canvas);
    }

    public void b(Arranger arranger) {
        this.e = arranger;
    }

    public void b(ColorResult colorResult) {
        this.e.setColor(colorResult);
    }

    public void a(String str) {
        this.e.setResource(str);
    }
}
