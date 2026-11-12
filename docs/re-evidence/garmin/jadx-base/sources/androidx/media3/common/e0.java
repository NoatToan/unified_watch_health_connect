package androidx.media3.common;

import android.os.Bundle;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f8213g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q[] f8217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8218e;

    static {
        int i14 = fa.z.f70071a;
        f8212f = Integer.toString(0, 36);
        f8213g = Integer.toString(1, 36);
    }

    public e0(String str, q... qVarArr) {
        fa.a.a(qVarArr.length > 0);
        this.f8215b = str;
        this.f8217d = qVarArr;
        this.f8214a = qVarArr.length;
        int iH = x.h(qVarArr[0].f8386n);
        this.f8216c = iH == -1 ? x.h(qVarArr[0].f8385m) : iH;
        String str2 = qVarArr[0].f8376d;
        str2 = (str2 == null || str2.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str2;
        int i14 = qVarArr[0].f8378f | 16384;
        for (int i15 = 1; i15 < qVarArr.length; i15++) {
            String str3 = qVarArr[i15].f8376d;
            if (!str2.equals((str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3)) {
                c("languages", qVarArr[0].f8376d, qVarArr[i15].f8376d, i15);
                return;
            } else {
                if (i14 != (qVarArr[i15].f8378f | 16384)) {
                    c("role flags", Integer.toBinaryString(qVarArr[0].f8378f), Integer.toBinaryString(qVarArr[i15].f8378f), i15);
                    return;
                }
            }
        }
    }

    public static e0 a(Bundle bundle) {
        ImmutableList immutableListBuild;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8212f);
        if (parcelableArrayList == null) {
            immutableListBuild = ImmutableList.of();
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i14);
                bundle2.getClass();
                builder.add(q.b(bundle2));
            }
            immutableListBuild = builder.build();
        }
        return new e0(bundle.getString(f8213g, ""), (q[]) immutableListBuild.toArray(new q[0]));
    }

    public static void c(String str, String str2, String str3, int i14) {
        StringBuilder sbI = p6.b.i("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbI.append(str3);
        sbI.append("' (track ");
        sbI.append(i14);
        sbI.append(")");
        fa.k.d("", new IllegalStateException(sbI.toString()));
    }

    public final int b(q qVar) {
        int i14 = 0;
        while (true) {
            q[] qVarArr = this.f8217d;
            if (i14 >= qVarArr.length) {
                return -1;
            }
            if (qVar == qVarArr[i14]) {
                return i14;
            }
            i14++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f8215b.equals(e0Var.f8215b) && Arrays.equals(this.f8217d, e0Var.f8217d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8218e == 0) {
            this.f8218e = Arrays.hashCode(this.f8217d) + wr.g.j(527, 31, this.f8215b);
        }
        return this.f8218e;
    }

    public e0(q... qVarArr) {
        this("", qVarArr);
    }
}
