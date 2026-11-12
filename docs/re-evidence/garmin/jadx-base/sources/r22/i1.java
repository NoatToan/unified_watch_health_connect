package r22;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c22.o3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.EditTextPicker;

/* JADX INFO: loaded from: classes10.dex */
public class i1 extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f149681k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f149682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ps.z1 f149685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f149686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f149687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.appcompat.app.e f149688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditTextPicker f149689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f149690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f149691j = new a();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"StringFormatMatches"})
        public final void onClick(DialogInterface dialogInterface, int i14) {
            i1 i1Var = i1.this;
            int iIntValue = i1Var.f149689h.getEditTextValue().intValue();
            if (iIntValue >= i1Var.f149683b && iIntValue <= i1Var.f149684c) {
                if (i1Var.f149686e != null) {
                    ps.z1 z1Var = new ps.z1(i1Var.f149685d.getFactor(), i1Var.f149685d.getUnitId(), (i1Var.f149689h.getFirstPicker().getValue() == 0 ? qs.y.UNIT_PRESSURE_PSI : qs.y.UNIT_PRESSURE_BAR).f147239a);
                    i1Var.f149685d = z1Var;
                    i1Var.f149686e.a(iIntValue, z1Var);
                }
                i1Var.f149688g.dismiss();
                return;
            }
            androidx.fragment.app.m activity = i1Var.getActivity();
            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(activity).setTitle(i1Var.getString(R.string.lbl_error_title_wrong_number)).setMessage(i1Var.getString(R.string.lbl_error_message_wrong_number, Integer.valueOf(i1Var.f149683b), Integer.valueOf(i1Var.f149684c))).setPositiveButton(R.string.lbl_ok, new ng1.c1(i1Var, 22)).create();
            if (i1Var.getActivity() == null || i1Var.getActivity().isFinishing()) {
                return;
            }
            eVarCreate.show();
        }
    }

    public interface b {
        void a(int i14, ps.z1 z1Var);
    }

    public static i1 u6(int i14, ps.z1 z1Var, int i15, int i16, String str) {
        Bundle bundleE = am.j.e(i14, "extra_pressure");
        ps.z1 z1Var2 = new ps.z1(null, null, (am.j.z(f12.l.f68084a) ? o3.BAR : o3.PSI).name());
        if (z1Var == null) {
            z1Var = z1Var2;
        }
        bundleE.putParcelable("extra_unit", z1Var);
        bundleE.putInt("extra_min_pressure", i15);
        bundleE.putInt("extra_max_pressure", i16);
        bundleE.putString("extra_dialog_title", str);
        i1 i1Var = new i1();
        i1Var.setArguments(bundleE);
        return i1Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        super.onCreateDialog(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f149682a = arguments.getInt("extra_pressure", 0);
            this.f149685d = (ps.z1) arguments.getParcelable("extra_unit");
            this.f149683b = arguments.getInt("extra_min_pressure", 0);
            this.f149684c = arguments.getInt("extra_max_pressure", 9999);
            string = arguments.getString("extra_dialog_title");
        } else {
            string = "";
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_text_view_picker_dialog, (ViewGroup) null);
        this.f149690i = viewInflate;
        EditTextPicker editTextPicker = (EditTextPicker) viewInflate.findViewById(R.id.textViewPicker);
        this.f149689h = editTextPicker;
        editTextPicker.getFirstPicker().setDisplayedValues(new String[]{getString(R.string.lbl_psi), getString(R.string.lbl_bar)});
        this.f149689h.getFirstPicker().setMinValue(0);
        this.f149689h.getFirstPicker().setMaxValue(1);
        EditTextPicker editTextPicker2 = this.f149689h;
        boolean zEquals = qs.y.UNIT_PRESSURE_BAR.equals(this.f149685d.h());
        editTextPicker2.a(zEquals ? 1 : 0, Integer.valueOf(this.f149682a));
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(getActivity()).setTitle(string).setView(this.f149690i).setPositiveButton(this.f149687f, this.f149691j).create();
        this.f149688g = eVarCreate;
        return eVarCreate;
    }
}
