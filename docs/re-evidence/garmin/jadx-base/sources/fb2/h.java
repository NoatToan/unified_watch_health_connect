package fb2;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageButton;
import com.garmin.android.apps.connectmobile.i2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class h<T> extends b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<T, Integer> f70346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<T, Integer> f70347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<ImageButton> f70348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Activity f70349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f70350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageButton f70351g;

    public h(View view2, Activity activity, b0.a aVar) {
        super(aVar);
        this.f70346b = new HashMap<>();
        this.f70347c = new HashMap<>();
        this.f70348d = new SparseArray<>();
        f.a(activity, "Activity is required");
        this.f70349e = activity;
        f.a(view2, "View container is required");
        this.f70350f = view2;
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70350f);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70350f);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70350f, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70350f, z14);
    }

    public final void k(T t7, Map<T, Integer> map, Map<T, Integer> map2, Map<T, String> map3) {
        Integer num;
        f.a(t7, "Current field value is required");
        if (map == null || map.size() == 0) {
            vb.h.s("Field view ID dictionary is required");
            return;
        }
        HashMap<T, Integer> map4 = this.f70346b;
        map4.clear();
        map4.putAll(map);
        HashMap<T, Integer> map5 = this.f70347c;
        map5.clear();
        if (map2 != null) {
            map5.putAll(map2);
        }
        SparseArray<ImageButton> sparseArray = this.f70348d;
        sparseArray.clear();
        for (Map.Entry<T, Integer> entry : map4.entrySet()) {
            Integer value = entry.getValue();
            ImageButton imageButton = (ImageButton) this.f70349e.findViewById(value.intValue());
            if (map3 != null) {
                imageButton.setContentDescription(map3.get(entry.getKey()));
            } else {
                imageButton.setContentDescription("");
            }
            imageButton.setOnClickListener(this);
            if (!map5.isEmpty() && map5.size() == map4.size() && (num = map5.get(entry.getKey())) != null) {
                imageButton.setImageResource(num.intValue());
            }
            sparseArray.put(value.intValue(), imageButton);
        }
        int iIntValue = map4.get(t7).intValue();
        if (iIntValue != -1) {
            ImageButton imageButton2 = this.f70351g;
            if (imageButton2 != null) {
                imageButton2.setSelected(false);
            }
            ImageButton imageButton3 = sparseArray.get(iIntValue);
            this.f70351g = imageButton3;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        T next;
        if (view2 != null) {
            int id3 = view2.getId();
            Integer numValueOf = Integer.valueOf(id3);
            HashMap<T, Integer> map = this.f70346b;
            if (!map.containsValue(numValueOf)) {
                next = null;
                break;
            }
            Iterator<T> it = map.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (map.get(next).intValue() != id3);
            if (next != null) {
                if (id3 != -1) {
                    ImageButton imageButton = this.f70351g;
                    if (imageButton != null) {
                        imageButton.setSelected(false);
                    }
                    ImageButton imageButton2 = this.f70348d.get(id3);
                    this.f70351g = imageButton2;
                    if (imageButton2 != null) {
                        imageButton2.setSelected(true);
                    }
                }
                i2.l("ImageSelectionViewDecorator", "onCheckedChanged(): notifyListener with selectedImage=" + next);
                f(next);
            }
        }
    }
}
