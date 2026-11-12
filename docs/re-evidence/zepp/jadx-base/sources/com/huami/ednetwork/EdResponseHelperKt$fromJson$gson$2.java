package com.huami.ednetwork;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/gson/Gson;", "invoke", "()Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final class EdResponseHelperKt$fromJson$gson$2 extends Lambda implements Function0<Gson> {
    public static final EdResponseHelperKt$fromJson$gson$2 INSTANCE = new EdResponseHelperKt$fromJson$gson$2();

    public EdResponseHelperKt$fromJson$gson$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Gson invoke() {
        return new Gson();
    }
}
