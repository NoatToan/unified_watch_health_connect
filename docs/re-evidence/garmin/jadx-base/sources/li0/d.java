package li0;

import android.content.Context;
import android.content.DialogInterface;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f112643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f112644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f112645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f112646e;

    public /* synthetic */ d(f fVar, e23.l lVar, d0 d0Var, Context context, int i14) {
        this.f112642a = i14;
        this.f112643b = fVar;
        this.f112644c = lVar;
        this.f112645d = d0Var;
        this.f112646e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f112642a;
        Context context = this.f112646e;
        d0 d0Var = this.f112645d;
        e23.l<? super Boolean, Unit> lVar = this.f112644c;
        f fVar = this.f112643b;
        switch (i15) {
            case 0:
                f.a aVar = f.f112657g;
                fVar.i(lVar, new f.c(fVar, d0Var, context, null));
                break;
            case 1:
                f.a aVar2 = f.f112657g;
                fVar.i(lVar, new f.i(fVar, d0Var, context, null));
                break;
            default:
                f.a aVar3 = f.f112657g;
                fVar.i(lVar, new f.g(fVar, d0Var, context, null));
                break;
        }
    }
}
