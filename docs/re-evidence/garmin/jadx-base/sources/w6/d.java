package w6;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182778a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182779b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f182780c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f182781d;

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract d clone();

    public d b(d dVar) {
        this.f182778a = dVar.f182778a;
        this.f182779b = dVar.f182779b;
        this.f182780c = dVar.f182780c;
        this.f182781d = dVar.f182781d;
        return this;
    }

    public abstract void c(HashSet<String> hashSet);

    public abstract void d(Context context, AttributeSet attributeSet);

    public void e(HashMap<String, Integer> map) {
    }
}
