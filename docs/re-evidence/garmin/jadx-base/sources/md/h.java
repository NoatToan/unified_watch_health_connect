package md;

import androidx.room.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
public final class h<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f117846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f117847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f117849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f117850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f117851f;

    public h(t13.d<? super h> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117850e = obj;
        this.f117851f |= Integer.MIN_VALUE;
        return gl1.d.Q(null, false, false, null, this);
    }
}
