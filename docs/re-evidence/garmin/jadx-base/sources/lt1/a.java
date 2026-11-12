package lt1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llt1/a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f114857a = new a();

    private a() {
    }

    public static ArrayList a(Context context, List list, int i14) {
        context.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le2.d dVar = (le2.d) it.next();
            Drawable drawable = a7.b.getDrawable(context, i14);
            le2.c cVar = null;
            Bitmap bitmapB = drawable != null ? d7.b.b(drawable, 0, 0, 7) : null;
            BitmapDescriptor bitmapDescriptorFromBitmap = bitmapB != null ? BitmapDescriptorFactory.fromBitmap(bitmapB) : BitmapDescriptorFactory.defaultMarker();
            bitmapDescriptorFromBitmap.getClass();
            ke2.b bVar = (ke2.b) h0.d0(dVar.f112063b);
            if (bVar != null) {
                float size = list.size() + 2.0f;
                if (size < 15.0f) {
                    size = 15.0f;
                }
                cVar = new le2.c(bVar, bitmapB, bitmapDescriptorFromBitmap, size);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static ArrayList b(Context context, List list) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le2.d dVar = (le2.d) it.next();
            Drawable drawable = a7.b.getDrawable(context, 2131232001);
            le2.c cVar = null;
            Bitmap bitmapB = drawable != null ? d7.b.b(drawable, 0, 0, 7) : null;
            BitmapDescriptor bitmapDescriptorFromBitmap = bitmapB != null ? BitmapDescriptorFactory.fromBitmap(bitmapB) : BitmapDescriptorFactory.defaultMarker();
            bitmapDescriptorFromBitmap.getClass();
            ke2.b bVar = (ke2.b) h0.n0(dVar.f112063b);
            if (bVar != null) {
                float size = list.size() + 1.0f;
                if (size < 12.0f) {
                    size = 12.0f;
                }
                cVar = new le2.c(bVar, bitmapB, bitmapDescriptorFromBitmap, size);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
