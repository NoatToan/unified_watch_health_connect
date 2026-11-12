package com.google.common.io;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements TempFileCreator.JavaNioCreator.PermissionSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53585a;

    public /* synthetic */ b(int i14) {
        this.f53585a = i14;
    }

    public static /* synthetic */ void a(int i14, String str) throws BaseEncoding.DecodingException {
        throw new BaseEncoding.DecodingException(str + i14);
    }

    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public FileAttribute get() {
        switch (this.f53585a) {
            case 0:
                return TempFileCreator.JavaNioCreator.lambda$static$0();
            case 1:
                return TempFileCreator.JavaNioCreator.lambda$static$1();
            default:
                return TempFileCreator.JavaNioCreator.lambda$static$2();
        }
    }
}
