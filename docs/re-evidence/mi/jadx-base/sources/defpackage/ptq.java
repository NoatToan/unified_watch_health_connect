package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class ptq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f30764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30765b = 0;
    public int[] c;

    public class a implements Comparator<View> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            Integer num = 0;
            if (viewZIndex == null) {
                viewZIndex = num;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
        }
    }

    public ptq(ViewGroup viewGroup) {
        this.f30764a = viewGroup;
    }

    public int a(int i, int i2) {
        if (this.c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f30764a.getChildAt(i3));
            }
            Collections.sort(arrayList, new a());
            this.c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.c[i4] = this.f30764a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.c[i2];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f30765b++;
        }
        this.c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f30765b--;
        }
        this.c = null;
    }

    public boolean d() {
        return this.f30765b > 0;
    }

    public void e() {
        this.f30765b = 0;
        for (int i = 0; i < this.f30764a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.f30764a.getChildAt(i)) != null) {
                this.f30765b++;
            }
        }
        this.c = null;
    }
}
