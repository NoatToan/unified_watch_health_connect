package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class u7j implements pya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<int[]> f35497a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray<int[]> f35498b = new SparseArray<>();

    @Override // defpackage.pya
    public boolean a(oya oyaVar, oya oyaVar2) {
        int[] iArr = this.f35497a.get(oyaVar.q());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == oyaVar2.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.pya
    public boolean b(oya oyaVar, oya oyaVar2) {
        return false;
    }

    @Override // defpackage.pya
    public boolean c(oya oyaVar, oya oyaVar2) {
        return false;
    }

    @Override // defpackage.pya
    public boolean d(oya oyaVar, oya oyaVar2) {
        int[] iArr = this.f35498b.get(oyaVar.q());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == oyaVar2.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(oya oyaVar, ReadableMap readableMap) {
        oyaVar.J(this);
        if (readableMap.hasKey("waitFor")) {
            this.f35497a.put(oyaVar.q(), f(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f35498b.put(oyaVar.q(), f(readableMap, "simultaneousHandlers"));
        }
    }

    public final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public void g(int i) {
        this.f35497a.remove(i);
        this.f35498b.remove(i);
    }

    public void h() {
        this.f35497a.clear();
        this.f35498b.clear();
    }
}
