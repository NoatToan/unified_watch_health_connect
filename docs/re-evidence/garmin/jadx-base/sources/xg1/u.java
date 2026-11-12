package xg1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.v;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxg1/u;", "Landroidx/fragment/app/i;", "Lxg1/s;", "", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends androidx.fragment.app.i implements s<Double> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f190921h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Double> f190922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f190923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f190924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f190925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NumberPicker f190926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NumberPicker f190927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NumberPicker f190928g;

    @Override // xg1.s
    public final void X4(i<Double> iVar) {
        this.f190922a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        vVar.getClass();
        show(vVar, "WeightDialogFragment");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        double d14;
        boolean z14;
        final boolean z15;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("DIALOG_TITLE");
            d14 = arguments.getDouble("WEIGHT_IN_KG", 0.0d);
            z15 = arguments.getBoolean("IS_GOAL_WEIGHT");
            z14 = arguments.getBoolean("IS_FROM_WEIGHT_REPORTS");
        } else {
            string = null;
            d14 = 0.0d;
            z14 = false;
            z15 = false;
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.weight_picker_layout, (ViewGroup) null);
        this.f190926e = (NumberPicker) viewInflate.findViewById(R.id.first_number);
        this.f190927f = (NumberPicker) viewInflate.findViewById(R.id.second_number);
        this.f190928g = (NumberPicker) viewInflate.findViewById(R.id.third_number);
        this.f190923b = (TextView) viewInflate.findViewById(R.id.first_unit);
        this.f190924c = (TextView) viewInflate.findViewById(R.id.second_unit);
        this.f190925d = (TextView) viewInflate.findViewById(R.id.third_unit);
        TextView textView = this.f190923b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f190924c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        NumberPicker numberPicker = this.f190926e;
        if (numberPicker != null) {
            numberPicker.setWrapSelectorWheel(false);
        }
        NumberPicker numberPicker2 = this.f190927f;
        if (numberPicker2 != null) {
            numberPicker2.setMinValue(0);
        }
        NumberPicker numberPicker3 = this.f190927f;
        if (numberPicker3 != null) {
            numberPicker3.setMaxValue(9);
        }
        NumberPicker numberPicker4 = this.f190928g;
        if (numberPicker4 != null) {
            numberPicker4.setMinValue(0);
        }
        NumberPicker numberPicker5 = this.f190928g;
        if (numberPicker5 != null) {
            numberPicker5.setMaxValue(9);
        }
        k42.b.f102880a.getClass();
        final int iL = k42.b.l();
        if (iL == 0) {
            NumberPicker numberPicker6 = this.f190926e;
            if (numberPicker6 != null) {
                numberPicker6.setOnValueChangedListener(new lo.p(1));
            }
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            TextView textView3 = this.f190923b;
            if (textView3 != null) {
                textView3.setText(String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
            }
            TextView textView4 = this.f190924c;
            if (textView4 != null) {
                textView4.setText(R.string.lbl_kg);
            }
            NumberPicker numberPicker7 = this.f190926e;
            if (numberPicker7 != null) {
                numberPicker7.setMinValue(1);
            }
            NumberPicker numberPicker8 = this.f190926e;
            if (numberPicker8 != null) {
                numberPicker8.setMaxValue(453);
            }
            NumberPicker numberPicker9 = this.f190928g;
            if (numberPicker9 != null) {
                numberPicker9.setVisibility(8);
            }
            NumberPicker numberPicker10 = this.f190926e;
            if (d14 > 0.0d) {
                if (numberPicker10 != null) {
                    numberPicker10.setValue((int) d14);
                }
                NumberPicker numberPicker11 = this.f190927f;
                if (numberPicker11 != null) {
                    numberPicker11.setValue((int) Math.round((d14 % ((double) 1)) * ((double) 10)));
                }
            } else {
                if (numberPicker10 != null) {
                    numberPicker10.setValue(75);
                }
                NumberPicker numberPicker12 = this.f190927f;
                if (numberPicker12 != null) {
                    numberPicker12.setValue(0);
                }
            }
        } else if (iL == 1) {
            u6(d14);
        } else if (iL == 2) {
            if (z14) {
                NumberPicker numberPicker13 = this.f190926e;
                if (numberPicker13 != null) {
                    numberPicker13.setOnValueChangedListener(new lo.p(2));
                }
                TextView textView5 = this.f190923b;
                if (textView5 != null) {
                    textView5.setText(R.string.lbl_abbrev_stone);
                }
                DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.getDefault());
                TextView textView6 = this.f190924c;
                if (textView6 != null) {
                    textView6.setText(String.valueOf(decimalFormatSymbols2.getDecimalSeparator()));
                }
                TextView textView7 = this.f190925d;
                if (textView7 != null) {
                    textView7.setText(R.string.lbl_lbs);
                }
                TextView textView8 = this.f190925d;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                NumberPicker numberPicker14 = this.f190926e;
                if (numberPicker14 != null) {
                    numberPicker14.setMinValue(0);
                }
                NumberPicker numberPicker15 = this.f190926e;
                if (numberPicker15 != null) {
                    numberPicker15.setMaxValue(71);
                }
                NumberPicker numberPicker16 = this.f190927f;
                if (numberPicker16 != null) {
                    numberPicker16.setMaxValue(13);
                }
                if (d14 > 0.0d) {
                    l3.f23124b.getClass();
                    double d15 = (d14 / 6350.0d) * ((double) 1000);
                    double dDoubleValue = BigDecimal.valueOf((d15 - Math.floor(d15)) * 14.0d).setScale(1, RoundingMode.HALF_EVEN).doubleValue();
                    NumberPicker numberPicker17 = this.f190926e;
                    if (numberPicker17 != null) {
                        numberPicker17.setValue((int) d15);
                    }
                    NumberPicker numberPicker18 = this.f190927f;
                    if (numberPicker18 != null) {
                        numberPicker18.setValue((int) dDoubleValue);
                    }
                    NumberPicker numberPicker19 = this.f190928g;
                    if (numberPicker19 != null) {
                        numberPicker19.setValue((int) Math.round((dDoubleValue % ((double) 1)) * ((double) 10)));
                    }
                } else {
                    NumberPicker numberPicker20 = this.f190926e;
                    if (numberPicker20 != null) {
                        numberPicker20.setValue(11);
                    }
                    NumberPicker numberPicker21 = this.f190927f;
                    if (numberPicker21 != null) {
                        numberPicker21.setValue(8);
                    }
                    NumberPicker numberPicker22 = this.f190928g;
                    if (numberPicker22 != null) {
                        numberPicker22.setValue(0);
                    }
                }
            } else {
                u6(d14);
            }
        }
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireActivity()).setTitle(string).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new DialogInterface.OnClickListener() { // from class: xg1.t
            /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                double dDoubleValue2;
                u.a aVar = u.f190921h;
                dialogInterface.getClass();
                u uVar = this.f190918a;
                NumberPicker numberPicker23 = uVar.f190926e;
                if (numberPicker23 != null) {
                    numberPicker23.clearFocus();
                }
                NumberPicker numberPicker24 = uVar.f190927f;
                if (numberPicker24 != null) {
                    numberPicker24.clearFocus();
                }
                NumberPicker numberPicker25 = uVar.f190928g;
                if (numberPicker25 != null) {
                    numberPicker25.clearFocus();
                }
                int i15 = iL;
                if (i15 == 0) {
                    NumberPicker numberPicker26 = uVar.f190926e;
                    NumberPicker numberPicker27 = uVar.f190927f;
                    if (numberPicker26 == null || numberPicker27 == null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        Double dValueOf = Double.valueOf(numberPicker26.getValue() + "." + numberPicker27.getValue());
                        dValueOf.getClass();
                        dDoubleValue2 = dValueOf.doubleValue();
                    }
                } else if (i15 == 1) {
                    NumberPicker numberPicker28 = uVar.f190926e;
                    NumberPicker numberPicker29 = uVar.f190927f;
                    if (numberPicker28 == null || numberPicker29 == null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        l3.a aVar2 = l3.f23124b;
                        Double dValueOf2 = Double.valueOf(numberPicker28.getValue() + "." + numberPicker29.getValue());
                        dValueOf2.getClass();
                        double dDoubleValue3 = dValueOf2.doubleValue();
                        aVar2.getClass();
                        dDoubleValue2 = dDoubleValue3 / 2.20462d;
                    }
                } else if (i15 != 2) {
                    dDoubleValue2 = 0.0d;
                } else {
                    NumberPicker numberPicker30 = uVar.f190926e;
                    NumberPicker numberPicker31 = uVar.f190927f;
                    NumberPicker numberPicker32 = uVar.f190928g;
                    if (numberPicker30 == null || numberPicker31 == null || numberPicker32 == null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        l3.a aVar3 = l3.f23124b;
                        double value = numberPicker30.getValue();
                        Double dValueOf3 = Double.valueOf(numberPicker31.getValue() + "." + numberPicker32.getValue());
                        dValueOf3.getClass();
                        double dDoubleValue4 = dValueOf3.doubleValue();
                        aVar3.getClass();
                        dDoubleValue2 = l3.a.W1(value, dDoubleValue4);
                    }
                }
                if (dDoubleValue2 > 453.0d || dDoubleValue2 < 1.0d) {
                    return;
                }
                if (z15) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().x2(dDoubleValue2);
                } else {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().K1(dDoubleValue2);
                }
                i<Double> iVar = uVar.f190922a;
                if (iVar != null) {
                    iVar.a(Double.valueOf(dDoubleValue2));
                }
                dialogInterface.dismiss();
            }
        }).create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    public final void u6(double d14) {
        NumberPicker numberPicker = this.f190926e;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(new lo.p(3));
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        TextView textView = this.f190923b;
        if (textView != null) {
            textView.setText(String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        }
        TextView textView2 = this.f190924c;
        if (textView2 != null) {
            textView2.setText(R.string.lbl_lbs);
        }
        NumberPicker numberPicker2 = this.f190926e;
        if (numberPicker2 != null) {
            numberPicker2.setMinValue(2);
        }
        NumberPicker numberPicker3 = this.f190926e;
        if (numberPicker3 != null) {
            numberPicker3.setMaxValue(999);
        }
        NumberPicker numberPicker4 = this.f190928g;
        if (numberPicker4 != null) {
            numberPicker4.setVisibility(8);
        }
        if (d14 <= 0.0d) {
            NumberPicker numberPicker5 = this.f190926e;
            if (numberPicker5 != null) {
                numberPicker5.setValue(165);
            }
            NumberPicker numberPicker6 = this.f190927f;
            if (numberPicker6 != null) {
                numberPicker6.setValue(0);
                return;
            }
            return;
        }
        l3.f23124b.getClass();
        double dT1 = l3.a.T1(d14 * 2.20462d, 1);
        NumberPicker numberPicker7 = this.f190926e;
        if (numberPicker7 != null) {
            numberPicker7.setValue((int) dT1);
        }
        NumberPicker numberPicker8 = this.f190927f;
        if (numberPicker8 != null) {
            numberPicker8.setValue((int) Math.round((dT1 % ((double) 1)) * ((double) 10)));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lxg1/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "KG_MIN_WEIGHT", "I", "KG_MAX_WEIGHT", "LB_MIN_WEIGHT", "LB_MAX_WEIGHT", "ST_MIN_WEIGHT", "ST_MAX_WEIGHT", "DEFAULT_WEIGHT_KG", "DEFAULT_WEIGHT_LBS", "DEFAULT_WEIGHT_ST", "DEFAULT_WEIGHT_ST_LBS", "DIALOG_TITLE", "WEIGHT_IN_KG", "IS_GOAL_WEIGHT", "IS_FROM_WEIGHT_REPORTS", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
