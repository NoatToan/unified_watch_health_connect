package r22;

import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class y1 extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149927a = R.string.lbl_ok;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149928b = R.string.lbl_cancel;

    public class a implements NumberPicker.OnValueChangeListener {
        public a(y1 y1Var) {
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
            numberPicker.setValue(i15);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b(y1 y1Var) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            dialogInterface.cancel();
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NumberPicker f149929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f149930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f149931c;

        public c(y1 y1Var, NumberPicker numberPicker, List list, d dVar) {
            this.f149929a = numberPicker;
            this.f149930b = list;
            this.f149931c = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            NumberPicker numberPicker = this.f149929a;
            numberPicker.clearFocus();
            Object obj = this.f149930b.get(numberPicker.getValue());
            d dVar = this.f149931c;
            if (dVar != null) {
                dVar.c(obj);
            }
        }
    }

    public interface d {
        void c(Object obj);
    }

    public final androidx.appcompat.app.e a(Context context, String str, Map<Object, String> map, Object obj, d dVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_create_manual_activity_number_of_lengths, (ViewGroup) null);
        ArrayList arrayList = new ArrayList(map.keySet());
        ArrayList arrayList2 = new ArrayList(map.values());
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
        numberPicker.setDescendantFocusability(393216);
        int i14 = 0;
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(map.size() - 1);
        numberPicker.setDisplayedValues((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            Object obj2 = arrayList.get(i15);
            if (obj2 != null && obj2.equals(obj)) {
                i14 = i15;
                break;
            }
        }
        numberPicker.setValue(i14);
        numberPicker.setOnValueChangedListener(new a(this));
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        aVar.setTitle(str).setView(viewInflate).setPositiveButton(this.f149927a, new c(this, numberPicker, arrayList, dVar)).setNegativeButton(this.f149928b, new b(this));
        return aVar.show();
    }
}
