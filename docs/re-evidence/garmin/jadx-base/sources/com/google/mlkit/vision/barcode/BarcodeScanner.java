package com.google.mlkit.vision.barcode;

import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface BarcodeScanner extends Detector<List<Barcode>>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @a1(b0.a.ON_DESTROY)
    void close();

    Task<List<Barcode>> process(MlImage mlImage);

    Task<List<Barcode>> process(InputImage inputImage);
}
