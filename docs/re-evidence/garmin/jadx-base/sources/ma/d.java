package ma;

import androidx.media3.common.x;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f117473e = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yb.n.a f117475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f117477d;

    public d(int i14, boolean z14) {
        this.f117474a = i14;
        this.f117477d = z14;
        this.f117475b = new yb.e();
    }

    public static void a(int i14, ArrayList arrayList) {
        if (Ints.indexOf(f117473e, i14) == -1 || arrayList.contains(Integer.valueOf(i14))) {
            return;
        }
        arrayList.add(Integer.valueOf(i14));
    }

    public final androidx.media3.common.q b(androidx.media3.common.q qVar) {
        if (!this.f117476c || !this.f117475b.a(qVar)) {
            return qVar;
        }
        androidx.media3.common.q.b bVarA = qVar.a();
        String str = qVar.f8383k;
        bVarA.f8411m = x.n("application/x-media3-cues");
        bVarA.H = this.f117475b.b(qVar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(qVar.f8386n);
        sb3.append(str != null ? StringUtils.SPACE.concat(str) : "");
        bVarA.f8408j = sb3.toString();
        bVarA.f8416r = Long.MAX_VALUE;
        return bVarA.a();
    }

    public d() {
        this(0, true);
    }
}
