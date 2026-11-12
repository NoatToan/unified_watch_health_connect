package by2;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "com.garmin.subscriptions.managers.SubscriptionManager", f = "SubscriptionManager.kt", l = {178, 183, 195, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 209}, m = "fetchCachedOrNewSubscription")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f22248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f22251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f22252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f22252i = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22251h = obj;
        this.f22253j |= Integer.MIN_VALUE;
        return this.f22252i.b(null, null, null, false, this);
    }
}
