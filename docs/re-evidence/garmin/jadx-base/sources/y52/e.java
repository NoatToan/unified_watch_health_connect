package y52;

import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import g22.n;
import java.util.ArrayList;
import p005kotlin.jvm.internal.s;
import xg1.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpinnerDialogView f194542b;

    public /* synthetic */ e(SpinnerDialogView spinnerDialogView, int i14) {
        this.f194541a = i14;
        this.f194542b = spinnerDialogView;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0209  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14;
        char c14;
        int i15;
        switch (this.f194541a) {
            case 0:
                SpinnerDialogView spinnerDialogView = this.f194542b;
                SpinnerDialogView.b bVar = spinnerDialogView.f48427i;
                if (bVar != null) {
                    p62.a aVar = (p62.a) bVar;
                    p62.b bVar2 = aVar.f136213a;
                    j0 j0Var = aVar.f136214b;
                    bVar2.h(spinnerDialogView, j0Var);
                    spinnerDialogView.setDialogTitle(bVar2.f(j0Var));
                    androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(spinnerDialogView.getContext()).setTitle(spinnerDialogView.f48432n);
                    int i16 = SpinnerDialogView.f48421v;
                    int i17 = SpinnerDialogView.f48420t;
                    SparseArray<SpinnerDialogView.e> sparseArray = spinnerDialogView.f48430l;
                    ArrayList arrayList = spinnerDialogView.f48429k;
                    arrayList.clear();
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(spinnerDialogView.getContext());
                    boolean z14 = false;
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.spinner_dialog_layout, (ViewGroup) spinnerDialogView, false);
                    TableLayout tableLayout = (TableLayout) viewInflate.findViewById(R.id.spinner_dialog_layout_root);
                    TextView textView = new TextView(spinnerDialogView.getContext());
                    textView.setText(spinnerDialogView.descriptionMessage);
                    textView.setGravity(8388611);
                    TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-1, -2);
                    int dimension = (int) spinnerDialogView.getResources().getDimension(R.dimen.spacing_xlarge);
                    int dimension2 = (int) spinnerDialogView.getResources().getDimension(R.dimen.spacing_small);
                    layoutParams.setMargins(dimension, dimension2, 0, dimension2);
                    layoutParams.span = spinnerDialogView.getDelimiterListSize() + spinnerDialogView.f48422d + 5;
                    textView.setLayoutParams(layoutParams);
                    TableRow tableRow = new TableRow(spinnerDialogView.getContext());
                    tableRow.addView(textView);
                    if (spinnerDialogView.f48423e == 1) {
                        int i18 = spinnerDialogView.f48422d;
                        int i19 = 0;
                        while (i19 < i18) {
                            TableRow tableRow2 = new TableRow(spinnerDialogView.getContext());
                            tableRow2.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.spinner_dialog_picker_horizontal, tableRow2, z14);
                            SpinnerDialogView.e eVar = sparseArray.get(i19);
                            if (eVar != null) {
                                View viewFindViewById = viewInflate2.findViewById(i17);
                                viewFindViewById.getClass();
                                View viewFindViewById2 = viewInflate2.findViewById(i16);
                                viewFindViewById2.getClass();
                                spinnerDialogView.c((NumberPicker) viewFindViewById, (TextView) viewFindViewById2, eVar, i19, null);
                            }
                            viewInflate2.getClass();
                            arrayList.add(viewInflate2);
                            tableRow2.addView(viewInflate2);
                            tableLayout.addView(tableRow2);
                            i19++;
                            i18 = i18;
                            z14 = false;
                        }
                    } else {
                        ViewGroup tableRow3 = new TableRow(spinnerDialogView.getContext());
                        tableRow3.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                        if (n.d(spinnerDialogView.f48425g)) {
                            Context context = tableLayout.getContext();
                            TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -1);
                            TextView textView2 = new TextView(context);
                            textView2.setText(spinnerDialogView.f48425g);
                            textView2.setGravity(17);
                            textView2.setLayoutParams(layoutParams2);
                            tableRow3.addView(textView2);
                        }
                        int i24 = spinnerDialogView.f48422d;
                        int i25 = 0;
                        while (i25 < i24) {
                            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.spinner_dialog_picker_vertical, tableRow3, false);
                            SpinnerDialogView.e eVar2 = sparseArray.get(i25);
                            if (eVar2 != null) {
                                View viewFindViewById3 = viewInflate3.findViewById(i17);
                                viewFindViewById3.getClass();
                                NumberPicker numberPicker = (NumberPicker) viewFindViewById3;
                                SpinnerDialogView spinnerDialogView2 = spinnerDialogView;
                                if (spinnerDialogView.f48422d > 2) {
                                    i15 = -2;
                                    numberPicker.setLayoutParams(new LinearLayout.LayoutParams((int) spinnerDialogView2.getResources().getDimension(R.dimen.spacing_xxlarge), -2));
                                } else {
                                    i15 = -2;
                                }
                                View viewFindViewById4 = viewInflate3.findViewById(i16);
                                viewFindViewById4.getClass();
                                TextView textView3 = (TextView) viewFindViewById4;
                                i14 = i15;
                                spinnerDialogView = spinnerDialogView2;
                                spinnerDialogView.c(numberPicker, textView3, eVar2, i25, tableRow);
                            } else {
                                i24 = i24;
                                i14 = -2;
                            }
                            viewInflate3.getClass();
                            arrayList.add(viewInflate3);
                            tableRow3.addView(viewInflate3);
                            if (spinnerDialogView.f48424f.isEmpty() || i25 > spinnerDialogView.f48424f.size() - 1) {
                                c14 = 17;
                            } else {
                                String str = spinnerDialogView.f48424f.get(i25);
                                if (str.length() > 0) {
                                    Context context2 = tableLayout.getContext();
                                    TableRow.LayoutParams layoutParams3 = new TableRow.LayoutParams(i14, -1);
                                    TextView textView4 = new TextView(context2);
                                    textView4.setText(str);
                                    c14 = 17;
                                    textView4.setGravity(17);
                                    textView4.setLayoutParams(layoutParams3);
                                    tableRow3.addView(textView4);
                                } else {
                                    c14 = 17;
                                }
                            }
                            i25++;
                            i16 = i16;
                            i24 = i24;
                        }
                        tableLayout.addView(tableRow3);
                        tableRow.setVisibility(8);
                        tableLayout.addView(tableRow);
                    }
                    androidx.appcompat.app.e eVarCreate = title.setView(viewInflate).setPositiveButton(R.string.lbl_ok, spinnerDialogView.f48435q).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
                    eVarCreate.getClass();
                    spinnerDialogView.f48431m = eVarCreate;
                    eVarCreate.show();
                    if (spinnerDialogView.f48428j != null) {
                        androidx.appcompat.app.e eVar3 = spinnerDialogView.f48431m;
                        if (eVar3 != null) {
                            eVar3.e(-1).setOnClickListener(new e(spinnerDialogView, 1));
                            return;
                        } else {
                            s.m("dialog");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                SpinnerDialogView spinnerDialogView3 = this.f194542b;
                l lVar = spinnerDialogView3.f48435q;
                androidx.appcompat.app.e eVar4 = spinnerDialogView3.f48431m;
                if (eVar4 != null) {
                    SpinnerDialogView.b((SpinnerDialogView) lVar.f190902b, eVar4, -1);
                    return;
                } else {
                    s.m("dialog");
                    throw null;
                }
        }
    }
}
