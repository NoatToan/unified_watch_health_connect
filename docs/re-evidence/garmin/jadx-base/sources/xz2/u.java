package xz2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class u extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yz2.h f192934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192935b;

    public u(Context context, int i14) {
        super(context);
        this.f192934a = yz2.h.f200492a;
        setGravity(17);
        setTextAlignment(4);
        this.f192935b = i14;
        setText(this.f192934a.format(i14));
    }
}
