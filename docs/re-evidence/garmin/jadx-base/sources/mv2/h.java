package mv2;

import android.content.Context;
import android.view.View;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import bi2.j;
import com.google.android.material.timepicker.TimeModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmv2/h;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lmv2/f;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "viewAttributeMap", "<init>", "(Landroidx/fragment/app/Fragment;Lmv2/f;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {
    public int A;
    public int B;
    public int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f121215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f121216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx2.c f121217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ? extends Object> f121218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cx2.h f121219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f121220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f121221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NumberPicker f121222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f121223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NumberPicker f121224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f121225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NumberPicker f121226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f121227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f121228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f121229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap<String, Object> f121230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f121231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f121232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f121233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f121234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f121235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f121236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f121237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f121240z;

    public h(Fragment fragment, f fVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        fVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f121215a = fragment;
        this.f121216b = fVar;
        this.f121217c = cVar;
        this.f121218d = map;
        this.f121219e = new cx2.h("TimePicker", null, 2, null);
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this.f121220f = contextRequireContext;
        this.f121227m = new ArrayList();
        this.f121228n = new ArrayList();
        this.f121229o = new ArrayList();
        this.f121235u = 23;
        this.f121237w = 59;
        this.f121240z = 59;
        this.B = 1;
        this.C = 1;
    }

    public final void a() {
        this.f121219e.getClass();
        NumberPicker numberPicker = this.f121224j;
        if (numberPicker == null) {
            s.m("minutesPicker");
            throw null;
        }
        int i14 = this.f121237w;
        int value = numberPicker.getValue();
        ArrayList arrayList = this.f121228n;
        c(numberPicker, 0, i14, ((Number) arrayList.get(value)).intValue(), this.C, arrayList);
        NumberPicker numberPicker2 = this.f121224j;
        if (numberPicker2 == null) {
            s.m("minutesPicker");
            throw null;
        }
        if (((Number) arrayList.get(numberPicker2.getValue())).intValue() == this.f121237w) {
            NumberPicker numberPicker3 = this.f121226l;
            if (numberPicker3 == null) {
                s.m("secondsPicker");
                throw null;
            }
            int i15 = this.f121240z;
            int value2 = numberPicker3.getValue();
            ArrayList arrayList2 = this.f121229o;
            c(numberPicker3, 0, i15, ((Number) arrayList2.get(value2)).intValue(), this.B, arrayList2);
        }
    }

    public final void b() {
        this.f121219e.getClass();
        NumberPicker numberPicker = this.f121224j;
        if (numberPicker == null) {
            s.m("minutesPicker");
            throw null;
        }
        int i14 = this.f121236v;
        int value = numberPicker.getValue();
        ArrayList arrayList = this.f121228n;
        c(numberPicker, i14, 59, ((Number) arrayList.get(value)).intValue(), this.C, arrayList);
        NumberPicker numberPicker2 = this.f121224j;
        if (numberPicker2 == null) {
            s.m("minutesPicker");
            throw null;
        }
        if (((Number) arrayList.get(numberPicker2.getValue())).intValue() == this.f121236v) {
            NumberPicker numberPicker3 = this.f121226l;
            if (numberPicker3 == null) {
                s.m("secondsPicker");
                throw null;
            }
            int i15 = this.f121239y;
            int value2 = numberPicker3.getValue();
            ArrayList arrayList2 = this.f121229o;
            c(numberPicker3, i15, 59, ((Number) arrayList2.get(value2)).intValue(), this.B, arrayList2);
        }
    }

    public final void c(NumberPicker numberPicker, int i14, int i15, int i16, int i17, List list) {
        cx2.h hVar = this.f121219e;
        hVar.getClass();
        try {
            list.clear();
            numberPicker.setDisplayedValues(null);
            String[] strArr = new String[(int) Math.ceil(((double) ((i15 - i14) + 1)) / ((double) i17))];
            int i18 = 0;
            while (i14 <= i15) {
                x0 x0Var = x0.f105818a;
                strArr[i18] = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
                list.add(Integer.valueOf(i14));
                i14 += i17;
                i18++;
            }
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(i18 - 1);
            numberPicker.setDisplayedValues(strArr);
            int iIndexOf = list.indexOf(Integer.valueOf(i16));
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf < 0) {
                numValueOf = null;
            }
            numberPicker.setValue(numValueOf != null ? numValueOf.intValue() : 0);
            numberPicker.setFormatter(new j(2));
        } catch (ArrayIndexOutOfBoundsException e4) {
            hVar.d(null, "Picker throws " + e4.getMessage());
        }
    }
}
