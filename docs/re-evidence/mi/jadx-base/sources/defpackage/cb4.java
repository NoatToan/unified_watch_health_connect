package defpackage;

import com.facebook.react.bridge.ReadableMap;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class cb4 extends pvg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NumberFormat f5151b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5152a;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        f5151b = numberFormat;
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setGroupingUsed(false);
    }

    public cb4(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f5152a = hmq.a(readableMap.getArray("input"));
    }

    @Override // defpackage.pvg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String evaluate() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int[] iArr = this.f5152a;
            if (i >= iArr.length) {
                return sb.toString();
            }
            Object objValue = this.mNodesManager.o(iArr[i], pvg.class).value();
            if (objValue instanceof Double) {
                objValue = f5151b.format((Double) objValue);
            }
            sb.append(objValue);
            i++;
        }
    }
}
