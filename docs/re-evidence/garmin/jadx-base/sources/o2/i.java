package o2;

import android.view.textclassifier.TextClassification;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo2/i;", "Lo2/b;", "", Action.KEY_ATTRIBUTE, "Landroid/view/textclassifier/TextClassification;", "textClassification", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClassification f128636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128637c;

    public i(Object obj, TextClassification textClassification, int i14) {
        super(obj);
        this.f128636b = textClassification;
        this.f128637c = i14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb3.append(this.f128621a);
        sb3.append(", textClassification=");
        sb3.append(this.f128636b);
        sb3.append(", index=");
        return e0.j(sb3, this.f128637c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
