package xh1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import vu1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lxh1/j;", "Landroidx/fragment/app/i;", "", "criticalSwimSpeedInSeconds", "positiveBtnLabelResId", "Lkotlin/Function1;", "", "", "criticalSwimSpeedSaveCallback", "<init>", "(Ljava/lang/Integer;ILe23/l;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f191067f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f191068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Long, Unit> f191070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f191071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NumberPicker f191072e;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Integer num, int i14, l<? super Long, Unit> lVar) {
        lVar.getClass();
        this.f191068a = num;
        this.f191069b = i14;
        this.f191070c = lVar;
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_critical_swim_speed_picker, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.minutes_picker);
        viewFindViewById.getClass();
        this.f191071d = (NumberPicker) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.seconds_picker);
        viewFindViewById2.getClass();
        this.f191072e = (NumberPicker) viewFindViewById2;
        NumberPicker numberPicker = this.f191071d;
        if (numberPicker == null) {
            s.m("minutesPicker");
            throw null;
        }
        numberPicker.setMinValue(0);
        NumberPicker numberPicker2 = this.f191071d;
        if (numberPicker2 == null) {
            s.m("minutesPicker");
            throw null;
        }
        numberPicker2.setMaxValue(5);
        NumberPicker numberPicker3 = this.f191071d;
        if (numberPicker3 == null) {
            s.m("minutesPicker");
            throw null;
        }
        final int i14 = 0;
        numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: xh1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f191066b;

            {
                this.f191066b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker4, int i15, int i16) {
                switch (i14) {
                    case 0:
                        j jVar = this.f191066b;
                        if (i16 == 0) {
                            NumberPicker numberPicker5 = jVar.f191072e;
                            if (numberPicker5 == null) {
                                s.m("secondsPicker");
                                throw null;
                            }
                            numberPicker5.setMinValue(50);
                            NumberPicker numberPicker6 = jVar.f191072e;
                            if (numberPicker6 != null) {
                                numberPicker6.setMaxValue(59);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                        }
                        NumberPicker numberPicker7 = jVar.f191072e;
                        if (i16 == 5) {
                            if (numberPicker7 != null) {
                                numberPicker7.setValue(0);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                        }
                        if (numberPicker7 == null) {
                            s.m("secondsPicker");
                            throw null;
                        }
                        numberPicker7.setMinValue(0);
                        NumberPicker numberPicker8 = jVar.f191072e;
                        if (numberPicker8 != null) {
                            numberPicker8.setMaxValue(59);
                            return;
                        } else {
                            s.m("secondsPicker");
                            throw null;
                        }
                    default:
                        j jVar2 = this.f191066b;
                        if (i16 == 0) {
                            NumberPicker numberPicker9 = jVar2.f191071d;
                            if (numberPicker9 == null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            numberPicker9.setMinValue(1);
                            NumberPicker numberPicker10 = jVar2.f191071d;
                            if (numberPicker10 != null) {
                                numberPicker10.setMaxValue(5);
                                return;
                            } else {
                                s.m("minutesPicker");
                                throw null;
                            }
                        }
                        NumberPicker numberPicker11 = jVar2.f191071d;
                        if (i16 < 50) {
                            if (numberPicker11 == null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            numberPicker11.setMinValue(1);
                            NumberPicker numberPicker12 = jVar2.f191071d;
                            if (numberPicker12 != null) {
                                numberPicker12.setMaxValue(4);
                                return;
                            } else {
                                s.m("minutesPicker");
                                throw null;
                            }
                        }
                        if (numberPicker11 == null) {
                            s.m("minutesPicker");
                            throw null;
                        }
                        numberPicker11.setMinValue(0);
                        NumberPicker numberPicker13 = jVar2.f191071d;
                        if (numberPicker13 != null) {
                            numberPicker13.setMaxValue(4);
                            return;
                        } else {
                            s.m("minutesPicker");
                            throw null;
                        }
                }
            }
        });
        NumberPicker numberPicker4 = this.f191071d;
        Integer num = this.f191068a;
        if (num != null) {
            int iIntValue = num.intValue();
            if (numberPicker4 == null) {
                s.m("minutesPicker");
                throw null;
            }
            numberPicker4.setValue(iIntValue / 60);
        } else {
            if (numberPicker4 == null) {
                s.m("minutesPicker");
                throw null;
            }
            numberPicker4.setValue(0);
        }
        NumberPicker numberPicker5 = this.f191072e;
        if (numberPicker5 == null) {
            s.m("secondsPicker");
            throw null;
        }
        numberPicker5.setMinValue(0);
        NumberPicker numberPicker6 = this.f191072e;
        if (numberPicker6 == null) {
            s.m("secondsPicker");
            throw null;
        }
        numberPicker6.setMaxValue(59);
        bi2.j jVar = new bi2.j(6);
        NumberPicker numberPicker7 = this.f191072e;
        if (numberPicker7 == null) {
            s.m("secondsPicker");
            throw null;
        }
        numberPicker7.setFormatter(jVar);
        NumberPicker numberPicker8 = this.f191072e;
        if (numberPicker8 == null) {
            s.m("secondsPicker");
            throw null;
        }
        final int i15 = 1;
        numberPicker8.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: xh1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f191066b;

            {
                this.f191066b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker9, int i16, int i17) {
                switch (i15) {
                    case 0:
                        j jVar2 = this.f191066b;
                        if (i17 == 0) {
                            NumberPicker numberPicker10 = jVar2.f191072e;
                            if (numberPicker10 == null) {
                                s.m("secondsPicker");
                                throw null;
                            }
                            numberPicker10.setMinValue(50);
                            NumberPicker numberPicker11 = jVar2.f191072e;
                            if (numberPicker11 != null) {
                                numberPicker11.setMaxValue(59);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                        }
                        NumberPicker numberPicker12 = jVar2.f191072e;
                        if (i17 == 5) {
                            if (numberPicker12 != null) {
                                numberPicker12.setValue(0);
                                return;
                            } else {
                                s.m("secondsPicker");
                                throw null;
                            }
                        }
                        if (numberPicker12 == null) {
                            s.m("secondsPicker");
                            throw null;
                        }
                        numberPicker12.setMinValue(0);
                        NumberPicker numberPicker13 = jVar2.f191072e;
                        if (numberPicker13 != null) {
                            numberPicker13.setMaxValue(59);
                            return;
                        } else {
                            s.m("secondsPicker");
                            throw null;
                        }
                    default:
                        j jVar3 = this.f191066b;
                        if (i17 == 0) {
                            NumberPicker numberPicker14 = jVar3.f191071d;
                            if (numberPicker14 == null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            numberPicker14.setMinValue(1);
                            NumberPicker numberPicker15 = jVar3.f191071d;
                            if (numberPicker15 != null) {
                                numberPicker15.setMaxValue(5);
                                return;
                            } else {
                                s.m("minutesPicker");
                                throw null;
                            }
                        }
                        NumberPicker numberPicker16 = jVar3.f191071d;
                        if (i17 < 50) {
                            if (numberPicker16 == null) {
                                s.m("minutesPicker");
                                throw null;
                            }
                            numberPicker16.setMinValue(1);
                            NumberPicker numberPicker17 = jVar3.f191071d;
                            if (numberPicker17 != null) {
                                numberPicker17.setMaxValue(4);
                                return;
                            } else {
                                s.m("minutesPicker");
                                throw null;
                            }
                        }
                        if (numberPicker16 == null) {
                            s.m("minutesPicker");
                            throw null;
                        }
                        numberPicker16.setMinValue(0);
                        NumberPicker numberPicker18 = jVar3.f191071d;
                        if (numberPicker18 != null) {
                            numberPicker18.setMaxValue(4);
                            return;
                        } else {
                            s.m("minutesPicker");
                            throw null;
                        }
                }
            }
        });
        NumberPicker numberPicker9 = this.f191072e;
        if (num != null) {
            int iIntValue2 = num.intValue();
            if (numberPicker9 == null) {
                s.m("secondsPicker");
                throw null;
            }
            numberPicker9.setValue(iIntValue2 % 60);
        } else {
            if (numberPicker9 == null) {
                s.m("secondsPicker");
                throw null;
            }
            numberPicker9.setValue(50);
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireActivity());
        aVar.setTitle(StringUtils.SPACE);
        aVar.setView(viewInflate);
        aVar.setPositiveButton(this.f191069b, new xg1.l(this, 1));
        aVar.setNegativeButton(R.string.lbl_cancel, new k(23));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.setOnShowListener(new bi2.d(this, eVarCreate, 4));
        eVarCreate.setCanceledOnTouchOutside(false);
        return eVarCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_critical_swim_speed_picker, (ViewGroup) null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lxh1/j$a;", "", "<init>", "()V", "", "MIN_MINUTES", "I", "MAX_MINUTES", "MIN_SECONDS", "MAX_SECONDS", "MIN_VALUE", "ONE_MINUTE_IN_SECONDS", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
