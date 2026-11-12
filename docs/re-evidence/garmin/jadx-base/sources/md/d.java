package md;

import androidx.room.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
public final class d<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f117814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v13.i f117815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f117816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117817d;

    public d(t13.d<? super d> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117816c = obj;
        this.f117817d |= Integer.MIN_VALUE;
        return gl1.d.P(null, null, this);
    }
}
