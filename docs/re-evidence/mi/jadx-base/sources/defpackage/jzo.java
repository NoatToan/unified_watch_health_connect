package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jzo implements izo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Integer> f23272a;

    public jzo(Integer... numArr) {
        HashSet hashSet = new HashSet(numArr.length);
        for (Integer num : numArr) {
            hashSet.add(num);
        }
        this.f23272a = Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.izo
    public Set<Integer> b() {
        return this.f23272a;
    }
}
