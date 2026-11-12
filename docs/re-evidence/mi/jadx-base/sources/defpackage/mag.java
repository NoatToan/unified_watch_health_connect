package defpackage;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class mag<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<C> f25945a = new HashSet();

    public void a(List<C> list) {
        this.f25945a.addAll(list);
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract mag<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f25945a));
    }
}
