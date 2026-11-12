package cs1;

import android.content.Context;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f55460b;

    public /* synthetic */ b(CharSequence charSequence, int i14) {
        this.f55459a = i14;
        this.f55460b = charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        switch (this.f55459a) {
            case 0:
                TaggableEditText.b bVar = (TaggableEditText.b) obj;
                bVar.getClass();
                if (bVar.f45050d) {
                    if (bVar.f45047a.f55456a.b().equals(this.f55460b.subSequence(bVar.f45048b, bVar.f45049c).toString())) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 1:
                Context context = (Context) obj;
                context.getClass();
                TextView textView = new TextView(context);
                textView.setText(this.f55460b);
                textView.setTextAlignment(4);
                return textView;
            default:
                TextView textView2 = (TextView) obj;
                textView2.getClass();
                textView2.setText(this.f55460b);
                return Unit.INSTANCE;
        }
    }
}
