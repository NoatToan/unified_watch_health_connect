package ro1;

import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lro1/i0;", "Lcom/garmin/android/apps/connectmobile/social/share/a;", "Landroid/view/ViewGroup;", "parent", "", "Lcom/garmin/android/apps/connectmobile/social/share/ui/b;", "stickerViews", "", "scale", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;F)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends com.garmin.android.apps.connectmobile.social.share.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f153967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.social.share.ui.b> f153968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f153969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ViewGroup viewGroup, List<com.garmin.android.apps.connectmobile.social.share.ui.b> list, float f14) {
        super(viewGroup);
        viewGroup.getClass();
        list.getClass();
        this.f153967b = viewGroup;
        this.f153968c = list;
        this.f153969d = f14;
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.a, com.garmin.android.apps.connectmobile.social.share.e.a
    public final void draw(Canvas canvas) {
        canvas.getClass();
        for (com.garmin.android.apps.connectmobile.social.share.ui.b bVar : this.f153968c) {
            ImageView imageView = new ImageView(bVar.getContext());
            imageView.setImageDrawable(bVar.getDrawable());
            float width = bVar.getWidth();
            float f14 = this.f153969d;
            imageView.setLayoutParams(new ViewGroup.LayoutParams((int) (width * f14), (int) (bVar.getHeight() * f14)));
            imageView.setX(bVar.getX() * f14);
            imageView.setY(bVar.getY() * f14);
            imageView.setScaleX(bVar.getScaleX());
            imageView.setScaleY(bVar.getScaleY());
            imageView.setRotation(bVar.getRotation());
            this.f153967b.addView(imageView);
        }
        super.draw(canvas);
    }
}
