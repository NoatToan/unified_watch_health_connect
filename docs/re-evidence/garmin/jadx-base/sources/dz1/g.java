package dz1;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import mz1.e0;
import mz1.g1;
import p005kotlin.jvm.internal.s;
import zf0.k0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f61704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f61705c;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar, boolean z14) {
        this.f61703a = 1;
        this.f61705c = aVar;
        this.f61704b = z14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String shareableEventUuid;
        Long l14;
        int i15 = this.f61703a;
        Fragment fragment = this.f61705c;
        boolean z14 = this.f61704b;
        switch (i15) {
            case 0:
                i iVar = (i) fragment;
                if (z14) {
                    EditText editText = iVar.f61720l;
                    if (editText == null) {
                        s.m("minimumDistanceEditText");
                        throw null;
                    }
                    editText.getText().clear();
                    TextView textView = iVar.f61721m;
                    if (textView == null) {
                        s.m("tvMinimumDistance");
                        throw null;
                    }
                    textView.setText("");
                    ImageView imageView = iVar.f61730x;
                    if (imageView == null) {
                        s.m("errorMinimumDistance");
                        throw null;
                    }
                    imageView.setVisibility(8);
                    iVar.w6().m5(0.0d);
                } else {
                    EditText editText2 = iVar.f61724p;
                    if (editText2 == null) {
                        s.m("maximumDistanceEditText");
                        throw null;
                    }
                    editText2.getText().clear();
                    TextView textView2 = iVar.f61725q;
                    if (textView2 == null) {
                        s.m("tvMaximumDistance");
                        throw null;
                    }
                    textView2.setText("");
                    ImageView imageView2 = iVar.f61731y;
                    if (imageView2 == null) {
                        s.m("errorMaximumDistance");
                        throw null;
                    }
                    imageView2.setVisibility(8);
                    iVar.w6().l5(0.0d);
                }
                TextView textView3 = iVar.f61732z;
                if (textView3 == null) {
                    s.m("textViewDistanceRange");
                    throw null;
                }
                textView3.setVisibility(8);
                dialogInterface.dismiss();
                return;
            case 1:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a) fragment;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a.C0883a c0883a = com.garmin.android.apps.connectmobile.traininginitiative.ui.a.T0;
                if (hb2.i.a(aVar.requireContext())) {
                    fg0.k kVar = aVar.K0;
                    if (z14) {
                        if (kVar != null && (l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) != null) {
                            long jLongValue = l14.longValue();
                            e0 e0VarZ6 = aVar.z6();
                            ge1.b.T(v1.a(e0VarZ6), null, null, new k0(e0VarZ6, jLongValue, null), 3);
                        }
                    } else if (kVar != null && (shareableEventUuid = kVar.getShareableEventUuid()) != null) {
                        e0 e0VarZ7 = aVar.z6();
                        ge1.b.T(v1.a(e0VarZ7), null, null, new g1(e0VarZ7, shareableEventUuid, null), 3);
                    }
                } else {
                    androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(aVar.requireContext());
                    aVar2.setTitle(aVar.getString(R.string.pregnancy_something_went_wrong));
                    aVar2.setMessage(aVar.getString(R.string.epoch_try_again_msg));
                    aVar2.setCancelable(false);
                    aVar2.setPositiveButton(aVar.getString(R.string.lbl_ok), new qh1.j(28));
                    aVar2.create().show();
                }
                dialogInterface.dismiss();
                return;
            default:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar2 = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k) fragment;
                int i16 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                if (z14) {
                    kVar2.requireActivity().setResult(0);
                    kVar2.requireActivity().finish();
                    return;
                } else {
                    kVar2.requireActivity().setResult(-1);
                    kVar2.requireActivity().finish();
                    return;
                }
        }
    }

    public /* synthetic */ g(int i14, Fragment fragment, boolean z14) {
        this.f61703a = i14;
        this.f61704b = z14;
        this.f61705c = fragment;
    }
}
