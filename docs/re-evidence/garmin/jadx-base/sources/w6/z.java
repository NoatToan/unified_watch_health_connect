package w6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f183114a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<View> f183116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<y.a> f183117d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<y> f183115b = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<y.a> f183118e = new ArrayList<>();

    public class a {
        public a(z zVar, y yVar, int i14, boolean z14, int i15) {
        }
    }

    public z(q qVar) {
        this.f183114a = qVar;
    }

    public final void a(y yVar, boolean z14) {
        int i14 = yVar.f183100u;
        int i15 = yVar.f183099t;
        androidx.constraintlayout.widget.j sharedValues = ConstraintLayout.getSharedValues();
        int i16 = yVar.f183100u;
        a aVar = new a(this, yVar, i14, z14, i15);
        HashMap<Integer, HashSet<WeakReference<Object>>> map = sharedValues.f6335a;
        HashSet<WeakReference<Object>> hashSet = map.get(Integer.valueOf(i16));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i16), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
