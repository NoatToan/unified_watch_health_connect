package xg1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxg1/a;", "Landroidx/fragment/app/i;", "Lxg1/s;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends androidx.fragment.app.i implements s<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3552a f190872b = new C3552a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f190873c = "ActivityClassDialogFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Integer> f190874a;

    @Override // xg1.s
    public final void X4(i<Integer> iVar) {
        this.f190874a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        vVar.getClass();
        show(vVar, f190873c);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        int i14;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("dialog_title");
            i14 = arguments.getInt("current_value");
        } else {
            string = null;
            i14 = 0;
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.custom_picker_layout_number_picker_3_0, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.number_picker_weight_whole);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setValue(i14);
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireActivity()).setTitle(string).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new wq.c(numberPicker, this, 1)).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    /* JADX INFO: renamed from: xg1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxg1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CURRENT_VALUE", "DIALOG_TITLE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3552a {
        public /* synthetic */ C3552a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3552a() {
        }
    }
}
