package ww0;

import android.graphics.Rect;
import android.util.Size;
import java.util.Comparator;
import z0.h0;
import z2.r1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187541b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f187540a = i14;
        this.f187541b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i14 = this.f187540a;
        Object obj3 = this.f187541b;
        switch (i14) {
            case 0:
                return ((Number) ((pk0.l) obj3).invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) ((wb1.i) obj3).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((wt0.i) obj3).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((wt0.i) obj3).invoke(obj, obj2)).intValue();
            case 4:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                h0.c cVar = h0.G;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
            case 5:
                r1.a aVar = r1.f201764l;
                return ((Number) ((yr.d) obj3).invoke(obj, obj2)).intValue();
            default:
                int i15 = zm.c.f205201y;
                return ((Number) ((z21.a) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
