package rk1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f153338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConstraintLayout f153339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<NumberPicker> f153340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153341e;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            b bVar = b.this;
            bVar.f153339c.clearFocus();
            d dVar = bVar.f153338b;
            if (dVar.f153355k != null) {
                ArrayList arrayListB = bVar.b();
                for (c cVar : dVar.f153355k) {
                    ArrayList arrayList = dVar.f153347c;
                    cVar.a(arrayListB);
                }
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: rk1.b$b, reason: collision with other inner class name */
    public static class C2900b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f153343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f153344b = new d();

        public C2900b(Context context) {
            this.f153343a = context;
        }

        public final void a() {
            b bVar = new b(this.f153343a, this.f153344b, 0);
            bVar.c();
            bVar.a().show();
        }

        public final androidx.appcompat.app.e b() {
            b bVar = new b(this.f153343a, this.f153344b, 0);
            bVar.c();
            return bVar.a().create();
        }

        public final void c(Integer num) {
            ArrayList arrayList = new ArrayList(1);
            this.f153344b.f153350f = arrayList;
            arrayList.add(num);
        }

        public final void d(int i14) {
            ArrayList arrayList = new ArrayList(1);
            this.f153344b.f153349e = arrayList;
            arrayList.add(Integer.valueOf(i14));
        }

        public final void e(int i14) {
            ArrayList arrayList = new ArrayList(1);
            this.f153344b.f153348d = arrayList;
            arrayList.add(Integer.valueOf(i14));
        }

        public final void f(c cVar) {
            ArrayList arrayList = new ArrayList(1);
            this.f153344b.f153355k = arrayList;
            arrayList.add(cVar);
        }
    }

    public interface c {
        void a(ArrayList arrayList);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f153346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f153347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f153348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f153349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList f153350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f153351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f153352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList f153353i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ArrayList f153354j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList f153355k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public m32.b f153356l;
    }

    public static class e extends C2900b {
        public e(Context context) {
            super(context);
        }

        public final void g(String str) {
            d dVar = this.f153344b;
            for (String[] strArr : dVar.f153353i) {
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    if (strArr[i14].equals(str)) {
                        ArrayList arrayList = new ArrayList(1);
                        dVar.f153354j = arrayList;
                        arrayList.add(Integer.valueOf(i14));
                        return;
                    }
                }
            }
        }

        public final void h(String[] strArr, boolean z14) {
            ArrayList arrayList = new ArrayList(1);
            d dVar = this.f153344b;
            dVar.f153353i = arrayList;
            arrayList.add(strArr);
            dVar.f153352h = z14;
        }

        public final void i(String str) {
            d dVar = this.f153344b;
            for (String[] strArr : dVar.f153353i) {
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    if (strArr[i14].equals(str)) {
                        ArrayList arrayList = new ArrayList(1);
                        dVar.f153349e = arrayList;
                        arrayList.add(Integer.valueOf(i14));
                        return;
                    }
                }
            }
        }

        public final void j(String str) {
            d dVar = this.f153344b;
            for (String[] strArr : dVar.f153353i) {
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    if (strArr[i14].equals(str)) {
                        ArrayList arrayList = new ArrayList(1);
                        dVar.f153348d = arrayList;
                        arrayList.add(Integer.valueOf(i14));
                        return;
                    }
                }
            }
        }
    }

    private b(Context context, d dVar) {
        this.f153337a = context;
        this.f153338b = dVar;
        this.f153340d = new ArrayList<>(dVar.f153345a);
        this.f153341e = dVar.f153346b;
    }

    public final androidx.appcompat.app.e.a a() {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this.f153337a);
        aVar.setView(this.f153339c).setCancelable(true).setPositiveButton(R.string.lbl_done, new a());
        String str = this.f153341e;
        if (str != null) {
            aVar.setTitle(str);
        }
        return aVar;
    }

    public final ArrayList b() {
        d dVar = this.f153338b;
        ArrayList arrayList = new ArrayList(dVar.f153345a);
        int i14 = 0;
        for (NumberPicker numberPicker : this.f153340d) {
            if (dVar.f153352h) {
                arrayList.add(((String[]) dVar.f153353i.get(i14))[numberPicker.getValue()]);
            } else {
                arrayList.add(String.valueOf(numberPicker.getValue()));
            }
            i14++;
        }
        return arrayList;
    }

    public final void c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f153337a);
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflaterFrom.inflate(R.layout.custom_picker_layout_3_0, (ViewGroup) null);
        this.f153339c = constraintLayout;
        Flow flow = (Flow) constraintLayout.findViewById(R.id.picker_flow);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (true) {
            d dVar = this.f153338b;
            if (i14 >= dVar.f153345a) {
                flow.setReferencedIds(arrayList.stream().mapToInt(new rk1.a()).toArray());
                return;
            }
            NumberPicker numberPicker = (NumberPicker) layoutInflaterFrom.inflate(R.layout.custom_picker_layout_number_picker_3_0, (ViewGroup) this.f153339c, false);
            this.f153340d.add(numberPicker);
            TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.custom_picker_layout_text_view_3_0, (ViewGroup) this.f153339c, false);
            ArrayList arrayList2 = dVar.f153348d;
            if (arrayList2 != null && arrayList2.size() > i14 && dVar.f153348d.get(i14) != null) {
                numberPicker.setMinValue(((Integer) dVar.f153348d.get(i14)).intValue());
            }
            ArrayList arrayList3 = dVar.f153349e;
            if (arrayList3 != null && arrayList3.size() > i14 && dVar.f153349e.get(i14) != null) {
                numberPicker.setMaxValue(((Integer) dVar.f153349e.get(i14)).intValue());
            }
            ArrayList arrayList4 = dVar.f153350f;
            if (arrayList4 == null || arrayList4.size() <= i14 || dVar.f153350f.get(i14) == null) {
                ArrayList arrayList5 = dVar.f153354j;
                if (arrayList5 != null && arrayList5.size() > i14) {
                    numberPicker.setValue(((Integer) dVar.f153354j.get(i14)).intValue());
                }
            } else {
                numberPicker.setValue(((Integer) dVar.f153350f.get(i14)).intValue());
            }
            ArrayList arrayList6 = dVar.f153353i;
            if (arrayList6 != null && arrayList6.size() > i14) {
                numberPicker.setDisplayedValues((String[]) dVar.f153353i.get(i14));
            }
            ArrayList arrayList7 = dVar.f153351g;
            if (arrayList7 != null && arrayList7.size() > i14) {
                numberPicker.setWrapSelectorWheel(((Boolean) dVar.f153351g.get(i14)).booleanValue());
            }
            if (dVar.f153356l != null) {
                numberPicker.setOnValueChangedListener(new j42.a(this, 4));
            }
            int iGenerateViewId = View.generateViewId();
            numberPicker.setId(iGenerateViewId);
            this.f153339c.addView(numberPicker);
            arrayList.add(Integer.valueOf(iGenerateViewId));
            ArrayList arrayList8 = dVar.f153347c;
            if (arrayList8 != null && arrayList8.size() > i14 && dVar.f153347c.get(i14) != null) {
                textView.setText((CharSequence) dVar.f153347c.get(i14));
                int iGenerateViewId2 = View.generateViewId();
                textView.setId(iGenerateViewId2);
                this.f153339c.addView(textView);
                arrayList.add(Integer.valueOf(iGenerateViewId2));
            }
            i14++;
        }
    }

    public /* synthetic */ b(Context context, d dVar, int i14) {
        this(context, dVar);
    }
}
