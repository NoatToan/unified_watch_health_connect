package ys2;

import java.io.ByteArrayOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.write.SendFileToDeviceTask", f = "SendFileToDeviceTask.kt", l = {81, 101}, m = "sendCreateFileRequest")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f199224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f199225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f199226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f199226c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199225b = obj;
        this.f199227d |= Integer.MIN_VALUE;
        return this.f199226c.a(this);
    }
}
