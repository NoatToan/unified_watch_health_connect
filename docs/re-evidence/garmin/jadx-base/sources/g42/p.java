package g42;

import android.text.Editable;
import android.text.TextWatcher;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75815a;

    public p(com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar) {
        this.f75815a = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
        this.f75815a.F6(false);
    }
}
