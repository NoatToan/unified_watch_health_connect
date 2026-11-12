package fw2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dx2.c;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import zw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfw2/a;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a extends ConstraintLayout {
    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    public final void i(c cVar, Map<String, ? extends Object> map) {
        String strA5 = cVar.a5(map);
        if (strA5.equals("HIDDEN")) {
            setVisibility(8);
            setAlpha(1.0f);
        } else if (strA5.equals("DISABLED")) {
            setVisibility(0);
            setAlpha(0.5f);
            setEnabled(false);
        } else {
            setVisibility(0);
            setAlpha(1.0f);
            setEnabled(true);
        }
    }

    public final void j(c cVar, Map<String, ? extends Object> map, f fVar) {
        cVar.getClass();
        map.getClass();
        Integer numG = fVar != null ? fVar.g(map) : null;
        if (numG == null) {
            i(cVar, map);
            return;
        }
        int iIntValue = numG.intValue();
        if (u.z(new Integer[]{8, 4, 0}, Integer.valueOf(iIntValue))) {
            setVisibility(iIntValue);
        } else {
            i(cVar, map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
