package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.huawei.skinner.attrentry.SkinAttr;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes15.dex */
public class pyh extends SkinAttr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentSkipListSet<SkinAttr> f45957a = new ConcurrentSkipListSet<>(new pzi());
    private pzh d;

    @Override // com.huawei.skinner.attrentry.SkinAttr
    public void apply(View view, boolean z) {
        synchronized (this) {
            c();
            c(view.getContext(), view);
            if (!pyy.d(this.f45957a)) {
                Iterator<SkinAttr> it = this.f45957a.iterator();
                while (it.hasNext()) {
                    it.next().apply(view, z);
                }
            }
        }
    }

    private void c() {
        for (SkinAttr skinAttr : this.f45957a) {
            if (skinAttr != null) {
                skinAttr.setCancled(true);
            }
        }
    }

    private void c(Context context, View view) {
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
        if (this.d == null) {
            this.d = new pzh(view, this.attrName);
        }
        this.d.d(context2, view, resources2, i, this.f45957a);
    }
}
