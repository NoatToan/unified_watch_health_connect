package w50;

import android.content.Context;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ie2.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw50/a;", "Lw50/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
    }

    @Override // w50.c
    public final void c(TextView textView, j jVar) {
        b bVar = (b) jVar.getTag();
        if (bVar != null) {
            textView.setText(jVar.getTitle());
            textView.setBackgroundResource(bVar.f182190d);
        }
    }
}
