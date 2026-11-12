package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.huawei.skinner.attrentry.SkinAttr;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes15.dex */
public class pyg extends SkinAttr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentSkipListSet<SkinAttr> f45955b = new ConcurrentSkipListSet<>(new pzi());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pzh f45956c;

    @Override // com.huawei.skinner.attrentry.SkinAttr
    public void apply(View view, boolean z) {
        e(view.getContext(), view);
        if (pyy.d(this.f45955b)) {
            return;
        }
        Iterator<SkinAttr> it = this.f45955b.iterator();
        while (it.hasNext()) {
            it.next().apply(view, z);
        }
    }

    private void e(Context context, View view) {
        int identifier;
        Resources resources;
        pyt pytVarA = pyt.a(context);
        if (pytVarA.a()) {
            context = pytVarA.e().getPluginContext();
            resources = context.getResources();
            identifier = resources.getIdentifier(this.attrValueRefName, this.attrValueTypeName, pytVarA.e().getPackageName());
        } else {
            identifier = this.attrValueRefId;
            resources = context.getResources();
        }
        Context context2 = context;
        int i = identifier;
        Resources resources2 = resources;
        if (this.f45956c == null) {
            this.f45956c = new pzh(view, this.attrName);
        }
        this.f45956c.d(context2, view, resources2, i, this.f45955b);
    }
}
