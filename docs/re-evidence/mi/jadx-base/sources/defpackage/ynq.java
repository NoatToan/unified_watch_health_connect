package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public class ynq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public foq f40350a;

    public ynq(Context context, int i, ImageView imageView) {
        foq foqVarC = foq.c(context.getResources(), i, null);
        this.f40350a = foqVarC;
        foqVarC.i(false);
        imageView.setImageDrawable(this.f40350a);
    }

    public foq.b a(String str) {
        return (foq.b) this.f40350a.e(str);
    }
}
