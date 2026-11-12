package uk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/io/ByteArrayOutputStream;", "invoke"}, k = 3, mv = {1, 1, 16})
public final class e0 extends p005kotlin.jvm.internal.w implements e23.l<ByteArrayOutputStream, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f171657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(byte[] bArr) {
        super(1);
        this.f171657a = bArr;
    }

    @Override // e23.l
    public final Unit invoke(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        byteArrayOutputStream2.getClass();
        byteArrayOutputStream2.write(this.f171657a);
        return Unit.INSTANCE;
    }
}
