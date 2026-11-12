package ys2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.write.SendFileToDeviceTask$sendCreateFileRequest$2", f = "SendFileToDeviceTask.kt", l = {}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteArrayOutputStream f199228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f199229b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ByteArrayOutputStream byteArrayOutputStream, o oVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f199228a = byteArrayOutputStream;
        this.f199229b = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f199228a, this.f199229b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        byte[] bytes;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        o oVar = this.f199229b;
        long size = oVar.f199245b.getSize();
        ByteArrayOutputStream byteArrayOutputStream = this.f199228a;
        lg.d.Q(byteArrayOutputStream, size);
        byteArrayOutputStream.write(oVar.f199246c);
        byteArrayOutputStream.write(oVar.f199247d, 0, 3);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(255);
        byteArrayOutputStream.write(255);
        String str = oVar.f199248e;
        if (str != null) {
            bytes = str.getBytes(d53.c.f57666b);
            bytes.getClass();
        } else {
            bytes = new byte[0];
        }
        lg.d.P(byteArrayOutputStream, bytes.length);
        byteArrayOutputStream.write(bytes);
        long j8 = oVar.f199249f;
        byteArrayOutputStream.getClass();
        byteArrayOutputStream.write((int) (j8 & 255));
        byteArrayOutputStream.write((int) ((j8 >> 8) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 16) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 24) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 32) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 40) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 48) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 54) & 255));
        return Unit.INSTANCE;
    }
}
