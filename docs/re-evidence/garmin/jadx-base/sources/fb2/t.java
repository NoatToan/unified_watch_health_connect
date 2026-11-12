package fb2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t<T, V> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70374d;

    public t(Context context) {
        super(context);
        this.f70374d = null;
    }

    @Override // fb2.e
    public final View a() {
        if (this.f70374d == null) {
            this.f70374d = g.d(this.f70343a, t(), u(), s());
        }
        return this.f70374d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        View viewFindViewById = cVar.findViewById(t());
        if (viewFindViewById != null) {
            this.f70374d = viewFindViewById;
            o(viewFindViewById);
            this.f70345c = new u(viewFindViewById, cVar, new s(this));
            return k(t7);
        }
        View viewA = a();
        o(viewA);
        this.f70345c = new u(viewA, cVar, new s(this));
        return k(t7);
    }

    @Override // fb2.e
    public boolean k(T t7) {
        if (t7 == null) {
            vb.h.s("Model is required");
            return false;
        }
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH && d()) {
            u uVar = (u) this.f70345c;
            T[] tArr = (T[]) v(t7);
            T t14 = (T) r(t7);
            Map<T, CharSequence> mapQ = q(tArr);
            uVar.getClass();
            if (tArr == null || tArr.length == 0) {
                vb.h.s("Field values are required");
                return false;
            }
            if (mapQ == null || mapQ.size() == 0) {
                vb.h.s("Text dictionary is required");
                return false;
            }
            Set<T> setKeySet = mapQ.keySet();
            int i14 = 0;
            for (int i15 = 0; i15 < tArr.length; i15++) {
                if (!setKeySet.contains(tArr[i15])) {
                    n23.j.A(tArr[i15], "Text dictionary is not sufficient for the supplied field values. Missing text for ");
                    return false;
                }
            }
            uVar.f70375b = t14;
            uVar.f70376c = tArr;
            uVar.f70377d = mapQ;
            CharSequence[] charSequenceArr = new CharSequence[tArr.length];
            for (int i16 = 0; i16 < tArr.length; i16++) {
                CharSequence string = uVar.f70377d.get(tArr[i16]);
                if (TextUtils.isEmpty(string)) {
                    string = tArr[i16].toString();
                }
                charSequenceArr[i16] = string;
            }
            uVar.f70378e = charSequenceArr;
            T t15 = uVar.f70375b;
            if (t15 == null) {
                i14 = -1;
                break;
            }
            while (true) {
                T[] tArr2 = uVar.f70376c;
                if (i14 >= tArr2.length) {
                    i14 = -1;
                    break;
                }
                if (t15.equals(tArr2[i14])) {
                    break;
                }
                i14++;
            }
            GCMComplexTwoLineButton gCMComplexTwoLineButton = uVar.f70380g;
            if (gCMComplexTwoLineButton != null && i14 != -1) {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(uVar.f70378e[i14].toString());
                return zH;
            }
        }
        return zH;
    }

    public abstract Map<V, CharSequence> q(V[] vArr);

    public abstract V r(T t7);

    public String s() {
        return null;
    }

    public abstract int t();

    public abstract String u();

    public abstract V[] v(T t7);

    public abstract void w(V v14, T t7);
}
