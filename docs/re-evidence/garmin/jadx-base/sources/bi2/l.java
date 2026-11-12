package bi2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.CriticalSwimSpeedPicker$show$1", f = "CriticalSwimSpeedPicker.kt", l = {46}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f18197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f18198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f18199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlertDialog.Builder f18200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f18202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f18202f = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f18202f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        View viewInflate;
        NumberPicker numberPicker;
        NumberPicker numberPicker2;
        AlertDialog.Builder builder;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18201e;
        m mVar = this.f18202f;
        if (i14 == 0) {
            o13.r.b(obj);
            hi2.d dVar = mVar.f18212e;
            Context context = mVar.f18208a;
            dVar.getClass();
            viewInflate = View.inflate(context, R.layout.dsl_minutes_seconds_picker, null);
            viewInflate.getClass();
            final NumberPicker numberPicker3 = (NumberPicker) viewInflate.findViewById(R.id.minutes_picker);
            numberPicker3.getClass();
            ge1.b.T(o53.f0.w((androidx.lifecycle.n0) context), null, null, new i(mVar, 1, numberPicker3, null), 3);
            final NumberPicker numberPicker4 = (NumberPicker) viewInflate.findViewById(R.id.seconds_picker);
            numberPicker4.setFormatter(new j(0));
            ge1.b.T(o53.f0.w((androidx.lifecycle.n0) context), null, null, new i(mVar, 2, numberPicker4, null), 3);
            final int i15 = 0;
            numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: bi2.g
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker5, int i16, int i17) {
                    switch (i15) {
                        case 0:
                            NumberPicker numberPicker6 = numberPicker4;
                            if (i17 != 5) {
                                if (i17 == 0 && numberPicker6.getValue() < 50) {
                                    numberPicker6.setValue(50);
                                    break;
                                }
                            } else {
                                numberPicker6.setValue(0);
                                break;
                            }
                            break;
                        default:
                            NumberPicker numberPicker7 = numberPicker4;
                            if (i17 > 0 && numberPicker7.getValue() == 5) {
                                numberPicker7.setValue(4);
                                break;
                            } else if (i17 < 50 && numberPicker7.getValue() == 0) {
                                numberPicker7.setValue(1);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i16 = 1;
            numberPicker4.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: bi2.g
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker5, int i17, int i18) {
                    switch (i16) {
                        case 0:
                            NumberPicker numberPicker6 = numberPicker3;
                            if (i18 != 5) {
                                if (i18 == 0 && numberPicker6.getValue() < 50) {
                                    numberPicker6.setValue(50);
                                    break;
                                }
                            } else {
                                numberPicker6.setValue(0);
                                break;
                            }
                            break;
                        default:
                            NumberPicker numberPicker7 = numberPicker3;
                            if (i18 > 0 && numberPicker7.getValue() == 5) {
                                numberPicker7.setValue(4);
                                break;
                            } else if (i18 < 50 && numberPicker7.getValue() == 0) {
                                numberPicker7.setValue(1);
                                break;
                            }
                            break;
                    }
                }
            });
            AlertDialog.Builder builder2 = new AlertDialog.Builder(context, R.style.DSLBaseDialogStyle);
            this.f18197a = viewInflate;
            this.f18198b = numberPicker3;
            this.f18199c = numberPicker4;
            this.f18200d = builder2;
            this.f18201e = 1;
            Object objA = m.a(mVar, this);
            if (objA == aVar) {
                return aVar;
            }
            numberPicker = numberPicker3;
            obj = objA;
            numberPicker2 = numberPicker4;
            builder = builder2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            builder = this.f18200d;
            numberPicker2 = this.f18199c;
            numberPicker = this.f18198b;
            viewInflate = this.f18197a;
            o13.r.b(obj);
        }
        AlertDialog.Builder title = builder.setTitle((CharSequence) obj);
        Context context2 = mVar.f18208a;
        Context context3 = mVar.f18208a;
        AlertDialog alertDialogCreate = title.setPositiveButton(context2.getString(R.string.lbl_common_save), new k(mVar, 0, numberPicker, numberPicker2)).setView(viewInflate).setNegativeButton(context3.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).create();
        kh2.g.a aVar2 = kh2.g.f104792a;
        alertDialogCreate.getClass();
        aVar2.getClass();
        kh2.g.a.c(alertDialogCreate, context3);
        return Unit.INSTANCE;
    }
}
