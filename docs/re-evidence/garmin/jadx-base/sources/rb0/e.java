package rb0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv.a f151555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f151556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f151558e;

    public /* synthetic */ e(hv.a aVar, int i14, int i15, boolean z14, int i16) {
        this.f151554a = i16;
        this.f151555b = aVar;
        this.f151556c = i14;
        this.f151557d = i15;
        this.f151558e = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        ImageView imageView = (ImageView) obj;
        switch (this.f151554a) {
            case 0:
                imageView.getClass();
                hv.a aVar = this.f151555b;
                Drawable drawableA = aVar.a(this.f151556c, this.f151557d);
                if (drawableA == null) {
                    drawableA = aVar.a(-1, -1);
                }
                imageView.setImageDrawable(drawableA);
                imageView.setVisibility((!this.f151558e || drawableA == null) ? 8 : 0);
                break;
            default:
                imageView.getClass();
                hv.a aVar2 = this.f151555b;
                Drawable drawableA2 = aVar2.a(this.f151556c, this.f151557d);
                if (drawableA2 == null) {
                    drawableA2 = aVar2.a(-1, -1);
                }
                imageView.setImageDrawable(drawableA2);
                imageView.setVisibility((!this.f151558e || drawableA2 == null) ? 8 : 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
