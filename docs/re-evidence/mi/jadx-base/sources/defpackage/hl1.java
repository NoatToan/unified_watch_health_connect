package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class hl1 {
    public static final hl1 f = new hl1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, List<View>> f20194a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20195b = true;
    public boolean c = false;
    public boolean d = false;
    public final il1 e = new a();

    public class a implements il1 {
        public a() {
        }
    }

    public static hl1 a() {
        return f;
    }

    public View b(Integer num, Context context, ViewGroup viewGroup, boolean z) {
        if (viewGroup == null || context == null) {
            return null;
        }
        List<View> list = this.f20194a.get(num);
        if (list == null || list.isEmpty()) {
            return LayoutInflater.from(context).inflate(num.intValue(), viewGroup, z);
        }
        View viewRemove = this.d ? list.get(0) : list.remove(0);
        if (list.isEmpty()) {
            this.f20194a.remove(num);
        }
        return viewRemove;
    }

    public View c(Integer num, ViewGroup viewGroup, boolean z) {
        if (viewGroup == null) {
            return null;
        }
        List<View> list = this.f20194a.get(num);
        if (list == null || list.isEmpty()) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(num.intValue(), viewGroup, z);
        }
        View viewRemove = list.remove(0);
        if (list.isEmpty()) {
            this.f20194a.remove(num);
        }
        return viewRemove;
    }
}
