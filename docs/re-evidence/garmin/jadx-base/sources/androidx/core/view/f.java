package androidx.core.view;

import android.content.Context;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f6435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f6436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f6437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f6438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f6443j;

    public interface a {
    }

    public interface b {
    }

    public f(Context context, g gVar, b bVar, a aVar) {
        this.f6440g = -1;
        this.f6441h = -1;
        this.f6442i = -1;
        this.f6443j = new int[]{Integer.MAX_VALUE, 0};
        this.f6434a = context;
        this.f6435b = gVar;
        this.f6436c = bVar;
        this.f6437d = aVar;
    }

    public f(Context context, g gVar) {
        this(context, gVar, new am.j(), new am.j());
    }
}
