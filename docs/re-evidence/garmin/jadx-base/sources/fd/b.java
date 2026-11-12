package fd;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lfd/d;", "invoke", "(Landroid/content/Context;)Lfd/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class b extends w implements e23.l<Context, d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f70420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(1);
        this.f70420a = context;
    }

    @Override // e23.l
    public final d invoke(Context context) {
        context.getClass();
        return new d(this.f70420a);
    }
}
