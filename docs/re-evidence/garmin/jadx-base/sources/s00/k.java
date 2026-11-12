package s00;

import android.graphics.Bitmap;
import android.view.MenuItem;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements zp0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155302b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f155301a = i14;
        this.f155302b = obj;
    }

    @Override // zp0.a
    public final void a(Bitmap bitmap) {
        switch (this.f155301a) {
            case 0:
                ((e23.l) this.f155302b).invoke(bitmap);
                break;
            default:
                com.garmin.android.apps.connectmobile.badges.redesign.b bVar = (com.garmin.android.apps.connectmobile.badges.redesign.b) this.f155302b;
                bVar.A = bitmap;
                ImageView imageView = bVar.f30404d;
                imageView.getClass();
                imageView.setImageBitmap(bVar.A);
                MenuItem menuItem = bVar.f30415o;
                if (menuItem != null) {
                    menuItem.setEnabled(true);
                }
                break;
        }
    }
}
