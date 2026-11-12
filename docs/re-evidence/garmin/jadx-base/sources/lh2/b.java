package lh2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llh2/b;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f112454a = 0;

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    public final void i(ii2.b bVar, Map<String, ? extends Object> map, ei2.h hVar) {
        bVar.getClass();
        map.getClass();
        Boolean boolM = hVar != null ? hVar.m(bVar, map) : null;
        if (boolM == null) {
            Object obj = map.get(mh2.i.VISIBILITY.f118617a);
            setVisibility(bVar.x4((Map) (obj instanceof Map ? obj : null)) ? 0 : 8);
        } else {
            setVisibility(boolM.booleanValue() ? 0 : 8);
        }
        boolean zK4 = bVar.K4(map);
        setEnabled(zK4);
        setAlpha(zK4 ? 1.0f : 0.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
