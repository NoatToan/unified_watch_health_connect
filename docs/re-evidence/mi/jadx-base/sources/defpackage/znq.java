package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes8.dex */
public class znq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public eoq f41502a;

    public znq(Context context, int i, ImageView imageView) {
        eoq eoqVarC = eoq.c(context.getResources(), i, null);
        this.f41502a = eoqVarC;
        eoqVarC.i(false);
        imageView.setImageDrawable(this.f41502a);
    }

    public eoq.b a(String str) {
        return (eoq.b) this.f41502a.e(str);
    }
}
