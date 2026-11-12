package bl2;

import com.google.mlkit.common.MlKitException;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer", f = "ReadActiveTransfer.kt", l = {113, 128, 157, 170, 183, 185, 201, 202, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 220, 236}, m = "doExecuteWithRetry")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f18719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f18722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f18723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f18726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f18727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18728j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f18727i = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18726h = obj;
        this.f18728j |= Integer.MIN_VALUE;
        r.a aVar = r.f18709p;
        return this.f18727i.s(null, false, this);
    }
}
