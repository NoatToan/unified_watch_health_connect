package defpackage;

import android.content.Context;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface c3t {
    BaseResponse a(Context context, String str);

    default void a(Context context, CarKeyCardInfo carKeyCardInfo) throws IOException {
    }

    BaseResponse b(Context context, String str);

    BaseResponse c(Context context, String str);

    BaseResponse d(Context context, String str);
}
