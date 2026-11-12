package jy2;

import e23.l;
import o53.r;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class g extends w implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r<JSONObject> f101889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c83.d<ResponseBody> f101890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r<JSONObject> rVar, c83.d<ResponseBody> dVar) {
        super(1);
        this.f101889a = rVar;
        this.f101890b = dVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        if (this.f101889a.isCancelled()) {
            this.f101890b.cancel();
        }
        return Unit.INSTANCE;
    }
}
