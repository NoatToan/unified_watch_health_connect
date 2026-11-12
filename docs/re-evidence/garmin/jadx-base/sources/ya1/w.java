package ya1;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lya1/w;", "", "Landroid/view/View;", "rootView", "", "defaultName", "Lkotlin/Function1;", "", "strategyNameChangedListener", "<init>", "(Landroid/view/View;Ljava/lang/String;Le23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<String, Unit> f195628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f195629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f195630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f195631d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ya1/w$a", "Landroid/text/TextWatcher;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.e f195632a;

        public a(androidx.appcompat.app.e eVar) {
            this.f195632a = eVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
            this.f195632a.e(-1).setEnabled(d53.w.i0(editable.toString()).toString().length() > 0);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(View view2, String str, e23.l<? super String, Unit> lVar) {
        view2.getClass();
        str.getClass();
        lVar.getClass();
        this.f195628a = lVar;
        this.f195629b = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        TextView textView2 = (TextView) view2.findViewById(R.id.label_bottom);
        this.f195630c = textView2;
        this.f195631d = str;
        textView.setText(R.string.power_guide_strategy_name);
        textView2.setText(str);
        view2.setOnClickListener(new xp0.d(this, 13));
    }
}
