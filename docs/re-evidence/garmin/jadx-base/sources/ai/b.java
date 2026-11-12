package ai;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lai/b;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3307a = new b();

    private b() {
    }

    public static ArrayList a(int i14, int[] iArr, String[] strArr, int[] iArr2) {
        String str;
        iArr.getClass();
        strArr.getClass();
        iArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = iArr[i15];
            if (i16 == 1 || i16 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i15]));
            } else if ((i16 == 3 || i16 == 4 || i16 == 5) && (str = strArr[i15]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
