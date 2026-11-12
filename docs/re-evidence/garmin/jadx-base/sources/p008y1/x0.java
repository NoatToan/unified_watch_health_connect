package p008y1;

import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly1/x0;", "T", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f193704a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f193705b;

    public x0() {
        float[] fArr = new float[5];
        for (int i14 = 0; i14 < 5; i14++) {
            fArr[i14] = Float.NaN;
        }
        this.f193705b = fArr;
    }

    public final void a(T t7, float f14) {
        ArrayList arrayList = this.f193704a;
        arrayList.add(t7);
        if (this.f193705b.length < arrayList.size()) {
            this.f193705b = Arrays.copyOf(this.f193705b, arrayList.size() + 2);
        }
        this.f193705b[arrayList.size() - 1] = f14;
    }
}
