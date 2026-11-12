package hl2;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "com.garmin.device.filetransfer.gc.util.ConnectTransferExtensionsKt", f = "ConnectTransferExtensions.kt", l = {66}, m = "refreshShouldUploadFilesIfExpired")
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dl2.b f84474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84476c;

    public a(d<? super a> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84475b = obj;
        this.f84476c |= Integer.MIN_VALUE;
        return b.b(null, false, this);
    }
}
