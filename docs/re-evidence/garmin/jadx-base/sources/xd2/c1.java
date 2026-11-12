package xd2;

import com.garmin.android.library.livetrack.data.LocalDatabase;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.data.LocalDatabase", f = "LocalDatabase.kt", l = {51, 52}, m = "deleteAll", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f190069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDatabase f190070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f190071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(LocalDatabase localDatabase, t13.d<? super c1> dVar) {
        super(dVar);
        this.f190070b = localDatabase;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190069a = obj;
        this.f190071c |= Integer.MIN_VALUE;
        return this.f190070b.e(this);
    }
}
