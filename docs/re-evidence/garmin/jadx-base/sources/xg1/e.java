package xg1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxg1/e;", "Landroidx/fragment/app/i;", "Lxg1/s;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends androidx.fragment.app.i implements s<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f190893b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Integer> f190894a;

    @Override // xg1.s
    public final void X4(i<Integer> iVar) {
        this.f190894a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        vVar.getClass();
        show(vVar, "HeartRateDialogFragment");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        int i14;
        int i15;
        Bundle arguments = getArguments();
        ArrayList<String> arrayList = new ArrayList<>();
        int i16 = 30;
        int i17 = 250;
        if (arguments != null) {
            i14 = arguments.getInt("CURRENT_VALUE");
            string = arguments.getString("DIALOG_TITLE");
            i16 = arguments.getInt("MIN_VALUE", 30);
            i17 = arguments.getInt("MAX_VALUE", 250);
            i15 = arguments.getInt("CURRENT_VALUE_INDEX");
            arrayList = arguments.getStringArrayList("CURRENT_VALUE");
        } else {
            string = null;
            i14 = 0;
            i15 = 0;
        }
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.gcm_single_number_picker_3_0, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.number_picker_value);
        TextView textView = (TextView) viewInflate.findViewById(R.id.number_picker_label);
        textView.setText(R.string.lbl_bpm);
        textView.setContentDescription(requireContext().getString(R.string.lbl_heart_rate_beats_per_minute));
        if (arrayList == null || arrayList.size() <= 0) {
            numberPicker.setMinValue(i16);
            numberPicker.setMaxValue(i17);
            if (i14 > i17) {
                numberPicker.setValue(i17);
            } else if (i14 < i16) {
                numberPicker.setValue(i16);
            } else {
                numberPicker.setValue(i14);
            }
        } else {
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(arrayList.size() - 1);
            numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
            numberPicker.setValue(i15);
        }
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireContext()).setTitle(string).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new wq.c(numberPicker, this, 2)).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lxg1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DIALOG_TITLE", "CURRENT_VALUE", "VALUE_SET", "CURRENT_VALUE_INDEX", "MAX_VALUE", "MIN_VALUE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e a(String str, int i14, int i15, Integer num) {
            Bundle bundleD = b71.i.d("DIALOG_TITLE", str);
            bundleD.putInt("CURRENT_VALUE", num.intValue());
            bundleD.putInt("MIN_VALUE", i14);
            bundleD.putInt("MAX_VALUE", i15);
            e eVar = new e();
            eVar.setArguments(bundleD);
            return eVar;
        }

        public static e b(String str, Integer num, ArrayList arrayList) {
            arrayList.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("DIALOG_TITLE", str);
            bundle.putInt("CURRENT_VALUE_INDEX", num.intValue());
            bundle.putStringArrayList("CURRENT_VALUE", arrayList);
            e eVar = new e();
            eVar.setArguments(bundle);
            return eVar;
        }

        private a() {
        }
    }
}
