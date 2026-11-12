package oi;

import e23.l;
import okhttp3.Call;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class a extends w implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f132186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Call call) {
        super(1);
        this.f132186a = call;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        this.f132186a.cancel();
        return Unit.INSTANCE;
    }
}
