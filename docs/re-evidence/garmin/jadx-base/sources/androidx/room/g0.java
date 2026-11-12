package androidx.room;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/g0;", "T", "Landroidx/room/n0;", "Landroidx/room/b0;", "database", "Landroidx/room/k;", TtmlNode.RUBY_CONTAINER, "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Lud/a;", "lambdaFunction", "<init>", "(Landroidx/room/b0;Landroidx/room/k;Z[Ljava/lang/String;Le23/l;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0<T> extends n0<T> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e23.l<ud.a, T> f10843t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(b0 b0Var, k kVar, boolean z14, String[] strArr, e23.l<? super ud.a, ? extends T> lVar) {
        super(b0Var, kVar, z14, strArr, null);
        b0Var.getClass();
        kVar.getClass();
        strArr.getClass();
        lVar.getClass();
        this.f10843t = lVar;
    }

    @Override // androidx.room.n0
    public final Object o(o0 o0Var) {
        return gl1.d.Q(this.f10900l, true, this.f10902n, this.f10843t, o0Var);
    }
}
