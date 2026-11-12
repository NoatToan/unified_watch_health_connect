package com.garmin.android.apps.connectmobile;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/o1;", "Lcom/garmin/android/apps/connectmobile/m1;", "<init>", "()V", "a", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o1 extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39651c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f39652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ai1.a f39653b = new ai1.a(this, 10);

    public interface a {
        void a(boolean z14);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireActivity()).create();
        eVarCreate.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = arguments.getInt("arg0");
            if (i14 > 0) {
                eVarCreate.f4658a.d(i14);
            }
            int i15 = arguments.getInt("arg1");
            if (i15 > 0) {
                eVarCreate.setTitle(i15);
            } else {
                eVarCreate.setTitle(arguments.getString("arg5", ""));
            }
            if (arguments.containsKey("arg2")) {
                eVarCreate.h(arguments.getString("arg2"));
            }
            View viewInflate = getLayoutInflater().inflate(R.layout.alert_vertical_buttons, (ViewGroup) null);
            eVarCreate.i(viewInflate);
            eVarCreate.setCancelable(false);
            eVarCreate.setCanceledOnTouchOutside(false);
            viewInflate.getClass();
            Button button = (Button) viewInflate.findViewById(R.id.positive_btn);
            int i16 = arguments.getInt("arg3");
            if (i16 > 0) {
                button.setText(getText(i16));
            } else if (arguments.containsKey("arg7")) {
                button.setText(arguments.getString("arg7", ""));
            }
            final int i17 = 1;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.n1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f39330b;

                {
                    this.f39330b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            o1 o1Var = this.f39330b;
                            o1Var.f39653b.onClick(o1Var.getDialog(), -2);
                            break;
                        default:
                            o1 o1Var2 = this.f39330b;
                            o1Var2.f39653b.onClick(o1Var2.getDialog(), -1);
                            break;
                    }
                }
            });
            Button button2 = (Button) viewInflate.findViewById(R.id.negative_btn);
            int i18 = arguments.getInt("arg4");
            if (i18 > 0) {
                button2.setText(getText(i18));
            } else if (arguments.containsKey("arg7")) {
                button2.setText(arguments.getString("arg8", ""));
            }
            final int i19 = 0;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.n1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o1 f39330b;

                {
                    this.f39330b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i19) {
                        case 0:
                            o1 o1Var = this.f39330b;
                            o1Var.f39653b.onClick(o1Var.getDialog(), -2);
                            break;
                        default:
                            o1 o1Var2 = this.f39330b;
                            o1Var2.f39653b.onClick(o1Var2.getDialog(), -1);
                            break;
                    }
                }
            });
        }
        return eVarCreate;
    }

    @Override // com.garmin.android.apps.connectmobile.m1, androidx.fragment.app.i
    public final void show(androidx.fragment.app.v vVar, String str) {
        vVar.getClass();
        if (!isVisible()) {
            super.show(vVar, str);
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.n(a2Var, "GCMFragTwoBtnVerticalAlertDialog", "Fragment already added.");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/o1$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o1 a(b bVar, int i14, String str, int i15, int i16, a aVar, String str2, String str3, String str4, int i17) {
            if ((i17 & 2) != 0) {
                i14 = 0;
            }
            if ((i17 & 8) != 0) {
                i15 = 0;
            }
            if ((i17 & 16) != 0) {
                i16 = 0;
            }
            if ((i17 & 64) != 0) {
                str2 = null;
            }
            if ((i17 & 128) != 0) {
                str3 = null;
            }
            if ((i17 & 256) != 0) {
                str4 = null;
            }
            bVar.getClass();
            Bundle bundle = new Bundle(5);
            if (i14 != 0) {
                bundle.putInt("arg1", i14);
            } else if (str2 != null) {
                bundle.putString("arg5", str2);
            }
            bundle.putString("arg2", str);
            if (str3 != null) {
                bundle.putString("arg7", str3);
            }
            bundle.putInt("arg3", i15);
            if (str4 != null) {
                bundle.putString("arg8", str4);
            }
            bundle.putInt("arg4", i16);
            o1 o1Var = new o1();
            o1Var.f39652a = aVar;
            o1Var.setArguments(bundle);
            return o1Var;
        }

        private b() {
        }
    }
}
