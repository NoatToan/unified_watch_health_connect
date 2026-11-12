package c22;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/a1;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f22992a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f22993b = {R.color.palette_blue_25, R.color.palette_green_17, R.color.palette_mango_11, R.color.orange_30_static, R.color.palette_red_14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f22994c = {0.05f, 0.1f, 0.2f, 0.3f, 1.0f};

    private a1() {
    }

    public static ie2.h.a a(Context context) {
        context.getClass();
        ie2.h.a aVar = new ie2.h.a();
        int[] iArr = f22993b;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i14 : iArr) {
            arrayList.add(Integer.valueOf(context.getColor(i14)));
        }
        aVar.f93131b = new ie2.g(p13.h0.a1(arrayList), f22994c);
        aVar.f93132c = 1.0d;
        aVar.f93134e = 16;
        return aVar;
    }
}
