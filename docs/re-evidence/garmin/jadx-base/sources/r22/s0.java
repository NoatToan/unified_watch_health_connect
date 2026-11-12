package r22;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lr22/s0;", "Landroidx/fragment/app/i;", "Lr22/v0;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 extends androidx.fragment.app.i implements v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f149856f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f149857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a<Unit> f149858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.e f149859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f149860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f149861e;

    public s0() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_TITLE", "") : null;
        this.f149861e = "GCMSystemAlertDialog_".concat(string != null ? string : "");
    }

    @Override // r22.v0
    public final void L3(u0 u0Var) {
        this.f149860d = u0Var;
    }

    @Override // r22.v0
    /* JADX INFO: renamed from: b5, reason: from getter */
    public final String getF149861e() {
        return this.f149861e;
    }

    @Override // r22.v0
    public final void g(androidx.fragment.app.v vVar) {
        showNow(vVar, this.f149861e);
        androidx.appcompat.app.e eVar = this.f149859c;
        if (eVar != null) {
            oe2.f.e(eVar, 1.3f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Integer numValueOf;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_TITLE", "") : null;
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_MESSAGE", "") : null;
        if (string2 == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("EXTRA_POSITIVE_BUTTON_TEXT", "") : null;
        if (string3 == null) {
            string3 = "";
        }
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString("EXTRA_NEGATIVE_BUTTON_TEXT", "") : null;
        String str = string4 != null ? string4 : "";
        Bundle arguments5 = getArguments();
        boolean z14 = arguments5 != null ? arguments5.getBoolean("EXTRA_CANCELABLE", true) : true;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            int i14 = arguments6.getInt("EXTRA_NEGATIVE_BUTTON_TEXT_COLOR_RES_ID", 0);
            numValueOf = Integer.valueOf(i14);
            if (i14 == 0) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        androidx.appcompat.app.e.a cancelable = new androidx.appcompat.app.e.a(requireContext()).setTitle(string).setMessage(string2).setCancelable(z14);
        if (!d53.w.J(string3)) {
            final int i15 = 0;
            cancelable.setPositiveButton(string3, new DialogInterface.OnClickListener(this) { // from class: r22.r0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f149826b;

                {
                    this.f149826b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i16) {
                    int i17 = i15;
                    s0 s0Var = this.f149826b;
                    switch (i17) {
                        case 0:
                            s0.a aVar = s0.f149856f;
                            dialogInterface.dismiss();
                            e23.a<Unit> aVar2 = s0Var.f149857a;
                            if (aVar2 != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            s0.a aVar3 = s0.f149856f;
                            dialogInterface.dismiss();
                            e23.a<Unit> aVar4 = s0Var.f149858b;
                            if (aVar4 != null) {
                                aVar4.invoke();
                            }
                            break;
                    }
                }
            });
        }
        if (!d53.w.J(str)) {
            final int i16 = 1;
            cancelable.setNegativeButton(str, new DialogInterface.OnClickListener(this) { // from class: r22.r0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f149826b;

                {
                    this.f149826b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i17) {
                    int i18 = i16;
                    s0 s0Var = this.f149826b;
                    switch (i18) {
                        case 0:
                            s0.a aVar = s0.f149856f;
                            dialogInterface.dismiss();
                            e23.a<Unit> aVar2 = s0Var.f149857a;
                            if (aVar2 != null) {
                                aVar2.invoke();
                            }
                            break;
                        default:
                            s0.a aVar3 = s0.f149856f;
                            dialogInterface.dismiss();
                            e23.a<Unit> aVar4 = s0Var.f149858b;
                            if (aVar4 != null) {
                                aVar4.invoke();
                            }
                            break;
                    }
                }
            });
        }
        u0 u0Var = this.f149860d;
        if (u0Var != null) {
            u0Var.a();
        }
        setCancelable(z14);
        androidx.appcompat.app.e eVarCreate = cancelable.create();
        eVarCreate.getClass();
        this.f149859c = eVarCreate;
        eVarCreate.setCanceledOnTouchOutside(z14);
        if (numValueOf != null) {
            androidx.appcompat.app.e eVar = this.f149859c;
            if (eVar == null) {
                p005kotlin.jvm.internal.s.m("alertdialog");
                throw null;
            }
            eVar.setOnShowListener(new bi2.d(this, numValueOf, 3));
        }
        androidx.appcompat.app.e eVar2 = this.f149859c;
        if (eVar2 != null) {
            return eVar2;
        }
        p005kotlin.jvm.internal.s.m("alertdialog");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        u0 u0Var = this.f149860d;
        if (u0Var != null) {
            u0Var.onDismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lr22/s0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_MESSAGE", "EXTRA_POSITIVE_BUTTON_TEXT", "EXTRA_NEGATIVE_BUTTON_TEXT", "EXTRA_NEGATIVE_BUTTON_TEXT_COLOR_RES_ID", "EXTRA_CANCELABLE", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static s0 a(a aVar, String str, String str2, String str3, e23.a aVar2, String str4, e23.a aVar3, int i14) {
            if ((i14 & 8) != 0) {
                aVar2 = null;
            }
            if ((i14 & 16) != 0) {
                str4 = null;
            }
            if ((i14 & 64) != 0) {
                aVar3 = null;
            }
            boolean z14 = (i14 & 128) != 0;
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putString("EXTRA_MESSAGE", str2);
            bundle.putString("EXTRA_POSITIVE_BUTTON_TEXT", str3);
            bundle.putString("EXTRA_NEGATIVE_BUTTON_TEXT", str4);
            bundle.putBoolean("EXTRA_CANCELABLE", z14);
            s0 s0Var = new s0();
            s0Var.setArguments(bundle);
            s0Var.f149857a = aVar2;
            s0Var.f149858b = aVar3;
            return s0Var;
        }

        private a() {
        }
    }
}
