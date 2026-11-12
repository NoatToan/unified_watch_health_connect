package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.generator.DynamicWallpaper;
import com.huawei.animationkit.computationalwallpaper.generator.OnWallpaperGenerateListener;
import com.huawei.animationkit.computationalwallpaper.generator.StaticWallpaper;
import com.huawei.animationkit.computationalwallpaper.utils.AsyncExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bez {
    private static final bez d = new bez();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnWallpaperGenerateListener<StaticWallpaper> f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bfb f1056b = bfb.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f1057c;

    private bez() {
    }

    public static bez e() {
        return d;
    }

    public List<StaticWallpaper> a(Bitmap bitmap) throws bdo {
        return c(this.f1056b.c(bitmap));
    }

    public void b(OnWallpaperGenerateListener<StaticWallpaper> onWallpaperGenerateListener) {
        this.f1055a = onWallpaperGenerateListener;
    }

    public void d(Bitmap bitmap) {
        if (this.f1057c == null) {
            this.f1057c = new e();
        }
        this.f1057c.execute(bitmap);
    }

    public List<StaticWallpaper> c(List<DynamicWallpaper> list) throws bdo {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<DynamicWallpaper> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        } catch (bdo e2) {
            Log.e("StaticWallpaperGenerator", "generate static wallpaper failed.", e2);
            throw e2;
        } catch (RuntimeException e3) {
            Log.e("StaticWallpaperGenerator", "generate static wallpaper failed.", e3);
            throw new bdo(e3);
        }
    }

    private StaticWallpaper a(DynamicWallpaper dynamicWallpaper) throws bdo {
        return new StaticWallpaper(dynamicWallpaper.getPreview(), dynamicWallpaper.getClock(), dynamicWallpaper.getTag());
    }

    class e extends AsyncExecutor<Bitmap, List<StaticWallpaper>> {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.animationkit.computationalwallpaper.utils.AsyncExecutor
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<StaticWallpaper> runInBackground(Bitmap bitmap) throws bdo {
            return bez.this.a(bitmap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.animationkit.computationalwallpaper.utils.AsyncExecutor
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void finishOnUiThread(List<StaticWallpaper> list, bdo bdoVar) {
            bez.this.f1055a.onWallpaperGenerate(list, bdoVar);
        }
    }
}
