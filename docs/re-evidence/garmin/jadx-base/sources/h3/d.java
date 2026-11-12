package h3;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh3/d;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f81232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f81233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f81234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81235e;

    public d(Context context) {
        super(context);
        this.f81231a = 5;
        ArrayList arrayList = new ArrayList();
        this.f81232b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f81233c = arrayList2;
        this.f81234d = new f();
        setClipChildren(false);
        g gVar = new g(context);
        addView(gVar);
        arrayList.add(gVar);
        arrayList2.add(gVar);
        this.f81235e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
