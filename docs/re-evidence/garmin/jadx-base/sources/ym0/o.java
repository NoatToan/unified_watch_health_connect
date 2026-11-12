package ym0;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo", f = "GroupRepo.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "getAllGroups", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kb0.d f198010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f198011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f198012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f198013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f198012c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198011b = obj;
        this.f198013d |= Integer.MIN_VALUE;
        return this.f198012c.a(null, null, this);
    }
}
