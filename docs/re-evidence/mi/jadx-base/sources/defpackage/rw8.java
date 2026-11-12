package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.size.Scale;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;

/* JADX INFO: loaded from: classes10.dex */
public class rw8 extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f32964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32965b;

    public void a(WatchFace watchFace) {
        ImageLoadUtil.loadWithPlaceHolder(this.f32964a, watchFace.icon, noi.f28203a, this.f32965b, Scale.FILL);
    }
}
